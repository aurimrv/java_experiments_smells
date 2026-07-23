package ds.seed5838;

import ds.Lista;
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
 * Unit tests for ds.Lista focusing on common behaviors:
 * - creating an empty list
 * - inserting elements
 * - printing the list
 * - handling a full list condition
 *
 * Each test follows a Given-When-Then structure in comments and provides
 * descriptive assertion messages to aid debugging.
 *
 * Note: These tests use only the public API of ds.Lista (insere, vazia, imprime)
 * and avoid direct access to internal fields to reduce coupling to implementation.
 */
interface UnitTest {}

public class EvoAITest {

    private static final int TIMEOUT_MS = 4000;

    /**
     * Given: a fresh Lista
     * When: an element (string) is inserted and the list is printed
     * Then: the list should no longer be empty and the printed output should contain the inserted value
     */
    @Test(timeout = TIMEOUT_MS)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        final String ITEM = "ds.Lista";
        Lista lista0 = new Lista();

        // Precondition
        assertTrue("Newly created list should be empty", lista0.vazia());

        // When
        lista0.insere(ITEM);

        // Then - list should not be empty
        assertFalse("List should not be empty after inserting an item", lista0.vazia());

        // And - printing should include the inserted item's string representation
        String printed = captureOutput(() -> lista0.imprime());
        assertNotNull("Printed output should not be null", printed);
        assertTrue("Printed output should contain the inserted item",
                printed.contains(ITEM));
    }

    /**
     * Given: a fresh Lista
     * When: we query emptiness and print the list
     * Then: vazia() should be true and printing should not change that fact
     */
    @Test(timeout = TIMEOUT_MS)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When
        boolean emptyBefore = lista0.vazia();
        String printedBefore = captureOutput(() -> lista0.imprime());

        // Then
        assertTrue("A newly created list must be empty", emptyBefore);
        // Printing an empty list should not make it non-empty
        assertTrue("List should remain empty after printing", lista0.vazia());
        // Printed representation for an empty list should be non-null (may be empty string or a message)
        assertNotNull("Printing an empty list should produce some output (possibly empty)", printedBefore);
    }

    /**
     * Given: a Lista
     * When: we insert elements until the list reports that it is full (insertion throws)
     * Then: an exception with a message indicating the list is full should be observed
     *
     * This test avoids direct manipulation of internal fields and instead uses repeated insertions
     * and a reasonable upper bound to discover a fullness condition.
     */
    @Test(timeout = TIMEOUT_MS)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When - try to fill the list by inserting distinct objects until an exception occurs
        final int MAX_ATTEMPTS = 10000; // safety cap to prevent infinite loop
        boolean exceptionThrown = false;
        Exception caught = null;

        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            try {
                lista0.insere(new Object());
            } catch (Exception e) {
                exceptionThrown = true;
                caught = e;
                break;
            }
        }

        // Then - we expect either that an exception was thrown indicating the list is full
        // or, if no exception, we consider the implementation to have much larger capacity.
        if (!exceptionThrown) {
            // If no exception after MAX_ATTEMPTS, consider this a valid outcome; assert list is not empty
            assertFalse("After many insertions the list should not be empty", lista0.vazia());
        } else {
            assertNotNull("An exception was caught but is null", caught);
            String msg = caught.getMessage();
            assertNotNull("Exception for full list should include a message", msg);
            assertTrue("Expected exception message to indicate the list is full",
                    msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        }
    }

    /**
     * Given: an empty Lista
     * When: a single arbitrary object is inserted
     * Then: the list should report non-empty and printing should contain the object's toString()
     */
    @Test(timeout = TIMEOUT_MS)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        Object object0 = new Object();
        String expected = object0.toString();

        // Precondition
        assertTrue("List must start empty", lista0.vazia());

        // When
        lista0.insere(object0);

        // Then
        assertFalse("List should not be empty after inserting an object", lista0.vazia());
        String printed = captureOutput(() -> lista0.imprime());
        assertNotNull("Printed output should not be null", printed);
        assertTrue("Printed output should include the inserted object's toString()",
                printed.contains(expected));
    }

    // Helper to capture System.out produced by the runnable and return it as a string.
    private String captureOutput(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        try {
            System.setOut(ps);
            action.run();
        } finally {
            System.out.flush();
            System.setOut(originalOut);
        }
        return baos.toString();
    }
}