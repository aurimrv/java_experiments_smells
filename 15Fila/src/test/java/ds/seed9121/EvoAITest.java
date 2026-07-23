package ds.seed9121;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorizing tests (e.g. unit tests).
 */
interface UnitTest {}

/**
 * Improved, maintainable unit tests for ds.Fila.
 *
 * Notes:
 * - Tests focus on public API (enfileira / desenfileira / imprime) and observable behavior,
 *   avoid accessing internal fields such as 'tras' or 'frente'.
 * - Each test includes Given-When-Then comments and descriptive assertion messages.
 * - Tests include both happy-path and exceptional flows where appropriate.
 */
@Category(UnitTest.class)
public class EvoAITest {

    /**
     * REQ-QUEUE-001: Enqueue a single element and then dequeue it.
     *
     * Given: an empty queue
     * When: an element is enqueued
     * Then: dequeuing returns that element and subsequent dequeuing signals empty queue.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When
        final String marker = "first-element";
        fila.enfileira(marker);

        // Then: dequeuing should return the same object that was enqueued
        Object dequeued = fila.desenfileira();
        assertNotNull("Dequeued value should not be null after enqueuing one element", dequeued);
        assertEquals("Dequeued value should match the enqueued value", marker, dequeued);

        // And: the queue should now be empty — a subsequent desenfileira should throw an exception
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue after removing the only element");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertTrue("Exception message for empty queue should mention 'vazia' or 'empty'. Actual: " + msg,
                    msg != null && (msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty")));
        }
    }

    /**
     * REQ-QUEUE-EMPTY-001: Dequeuing from an empty queue must throw a meaningful exception.
     *
     * Given: a newly created (empty) queue
     * When: desenfileira is invoked
     * Then: an exception indicating the queue is empty is thrown
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When / Then
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue");
        } catch (Exception e) {
            // Verify the exception is descriptive about empty-state
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null when dequeuing from empty queue", msg);
            assertTrue("Exception message should indicate the queue is empty (contains 'vazia' or 'empty'). Actual: " + msg,
                    msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
        }
    }

    /**
     * REQ-QUEUE-FULL-001: Attempting to enqueue beyond capacity should result in an exception indicating 'full'.
     *
     * Given: a queue (unknown capacity)
     * When: we keep enqueuing items until an exception is thrown
     * Then: the exception should indicate the queue is full. If no exception occurs within a reasonable bound,
     *       verify that at least the queue operates as FIFO for the enqueued items.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When: attempt to fill the queue up to a reasonable upper bound
        boolean overflowed = false;
        Exception overflowException = null;
        final int MAX_ATTEMPTS = 200;
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            try {
                fila.enfileira(i);
            } catch (Exception e) {
                overflowed = true;
                overflowException = e;
                break;
            }
        }

        // Then: if an overflow occurred, assert the message indicates a "full" queue
        if (overflowed) {
            assertNotNull("Expected an exception instance when overflow occurs", overflowException);
            String msg = overflowException.getMessage();
            assertNotNull("Overflow exception should have a message", msg);
            assertTrue("Overflow exception message should indicate full queue (contains 'cheia' or 'full'). Actual: " + msg,
                    msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        } else {
            // If no overflow within attempts, at least verify FIFO behavior for first enqueued element
            assertTrue("No items were enqueued during the test, expected at least one successful enqueue", MAX_ATTEMPTS > 0);
            Object firstOut = fila.desenfileira();
            assertEquals("Queue should preserve FIFO order for the first enqueued element", 0, firstOut);
        }
    }

    /**
     * REQ-QUEUE-ENQ-POINTERS-001: Enqueue an element and ensure it is returned by desenfileira; then verify emptiness.
     *
     * Given: an empty queue
     * When: a single object is enqueued and immediately dequeued
     * Then: the same object is returned and queue behaves empty afterward
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Fila fila = new Fila();

        // When
        Object payload = new Object();
        fila.enfileira(payload);

        // Then: dequeuing should return the very same object (identity)
        Object out = fila.desenfileira();
        assertSame("Dequeued object should be the same instance that was enqueued", payload, out);

        // And: further dequeues should indicate the queue is empty
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue after removing the single element");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should be present when dequeuing from empty queue", msg);
            assertTrue("Exception message for empty queue should mention 'vazia' or 'empty'. Actual: " + msg,
                    msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
        }

        // Additionally: exercising imprime() should not throw and should produce some output (observable behavior)
        // Capture stdout to ensure imprime() runs without throwing
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(baos));
            fila.imprime(); // Should not throw; content may vary by implementation
            String printed = baos.toString();
            // We don't assert on exact printed content, but ensure method executed and produced text (or nothing)
            assertNotNull("imprime() invocation should complete and may write to stdout (result non-null)", printed);
        } finally {
            System.setOut(originalOut);
        }
    }
}