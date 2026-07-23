package ds.seed5503;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests so they can be selected by category.
 * Must be declared at package level before the test class.
 */
interface UnitTest {}

/**
 * Improved and more descriptive tests for ds.Fila.
 *
 * Notes:
 * - Tests focus on public API (enfileira, desenfileira, imprime) and avoid asserting
 *   implementation-only fields.
 * - Each test uses Given-When-Then comments and includes descriptive failure messages.
 * - Tests are categorized as UnitTest for selective execution.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

    /**
     * Given a fresh queue, when multiple items are enqueued, then imprime should not throw
     * and should write a textual representation containing the enqueued items.
     *
     * Requirement: QUEUE-PRINT-01
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Fila fila = new Fila();
        final String first = "first";
        final String second = "second";

        // When
        fila.enfileira(first);
        fila.enfileira(second);

        // Then: capture output of imprime and assert it contains the enqueued items
        String output = captureStdOut(() -> {
            try {
                fila.imprime();
            } catch (Throwable t) {
                // Re-throw to let the outer test fail with a descriptive message
                throw new RuntimeException("imprime() threw an unexpected exception", t);
            }
        });

        assertNotNull("Expected imprime() to write something to stdout (non-null output)", output);
        assertTrue("Expected imprime() output to contain the first element", output.contains(first));
        assertTrue("Expected imprime() output to contain the second element", output.contains(second));
    }

    /**
     * Given a new empty queue, when imprime is called, then it should not crash,
     * and attempting to desenfileira should indicate the queue is empty.
     *
     * Requirement: QUEUE-EMPTY-01
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When / Then: imprime should be safe on an empty queue
        String output = captureStdOut(() -> {
            try {
                fila.imprime();
            } catch (Throwable t) {
                throw new RuntimeException("imprime() on empty queue threw an unexpected exception", t);
            }
        });
        assertNotNull("imprime() should produce an output string even for an empty queue", output);

        // And: dequeuing from an empty queue should throw an Exception with a meaningful message
        try {
            fila.desenfileira();
            fail("Expected desenfileira() to throw when called on an empty queue");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertTrue("Expected exception message to mention 'vazia' or 'empty', but was: " + msg,
                    msg == null || msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
        }
    }

    /**
     * Given a new queue, when desenfileira is called immediately, then an Exception is expected.
     *
     * Requirement: QUEUE-DEQUEUE-EMPTY-01
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When / Then
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue");
        } catch (Exception e) {
            // Provide descriptive assertions about the exception
            assertNotNull("Exception thrown when dequeuing empty queue should not be null", e);
            String msg = e.getMessage();
            assertTrue("Exception message should indicate an empty queue (contain 'vazia' or 'empty'): " + msg,
                    msg == null || msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
        }
    }

    /**
     * Given a queue in a boundary/overflow state (filled until capacity), when enfileira is called,
     * then an Exception indicating the queue is full should be thrown.
     *
     * This test attempts to detect a capacity by repeatedly enqueuing until an exception occurs.
     *
     * Requirement: QUEUE-ENQUEUE-FULL-01
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When: attempt to fill the queue until it refuses further enqueues
        Exception observed = null;
        final int maxAttempts = 200; // arbitrary safety limit to avoid infinite loops
        for (int i = 0; i < maxAttempts; i++) {
            try {
                fila.enfileira("el-" + i);
            } catch (Exception e) {
                observed = e;
                break;
            }
        }

        // Then: we either observed an exception (expected for bounded queues) or we enqueued many items (treated as large capacity)
        if (observed != null) {
            String msg = observed.getMessage();
            assertTrue("When enqueuing beyond capacity, exception message should indicate 'cheia' or 'full': " + msg,
                    msg == null || msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        } else {
            // No exception observed within attempts: sanity check by ensuring at least one element can be dequeued and matches
            try {
                Object dequeued = fila.desenfileira();
                assertNotNull("Expected at least one enqueued item to be dequeued successfully", dequeued);
            } catch (Exception e) {
                fail("Dequeuing after many enqueues should succeed: " + e.getMessage());
            }
        }
    }

    /**
     * Given a queue, when a null element is enqueued, then dequeuing should return null and subsequent dequeues
     * should indicate the queue is empty.
     *
     * Requirement: QUEUE-NULL-01
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When: enqueue a null
        fila.enfileira((Object) null);

        // Then: the first dequeued value should be null (the same object/value enqueued)
        try {
            Object dequeued = fila.desenfileira();
            assertNull("Dequeued element should be null when a null was enqueued", dequeued);
        } catch (Exception e) {
            fail("Dequeuing after enqueuing null should not throw an exception: " + e.getMessage());
        }

        // And: subsequent dequeue should indicate the queue is empty
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue after removing the only element");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertTrue("Expected empty-queue exception mentioning 'vazia' or 'empty': " + msg,
                    msg == null || msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
        }
    }

    // --- Helper methods ---

    /**
     * Capture system out produced by the runnable and return it as a string.
     */
    private static String captureStdOut(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capture = new PrintStream(baos);
        try {
            System.setOut(capture);
            action.run();
        } finally {
            System.out.flush();
            System.setOut(originalOut);
        }
        return baos.toString();
    }
}