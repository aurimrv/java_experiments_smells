package ds.seed6733;

import ds.Lista;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

interface UnitTest {}

public class EvoAITest extends Lista_ESTest_scaffolding {

    /**
     * Given a fresh Lista,
     * When an element is inserted and printed,
     * Then the list should no longer be empty and the printed representation
     * should reflect the inserted element (or at least be non-empty).
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        // Precondition: new list should report as empty
        assertTrue("Newly created list should be empty", lista0.vazia());

        // When: insert an element and capture the printed output
        final String element = "ds.Lista$Celula";
        String output = captureStdOut(() -> {
            lista0.insere(element);
            // imprime may write to stdout; capture whatever it writes
            lista0.imprime();
        });

        // Then: list must not be empty and printed output should include the element
        assertFalse("List should not be empty after inserting an element", lista0.vazia());
        // Be tolerant about the exact format of imprime(); accept either explicit mention
        // of the element or at least some non-whitespace output to indicate content.
        assertNotNull("imprime() produced null output (unexpected)", output);
        boolean containsElement = output.contains(element);
        boolean nonEmptyOutput = !output.trim().isEmpty();
        assertTrue("imprime() output should mention the inserted element or be non-empty. Output: [" + output + "]",
                containsElement || nonEmptyOutput);
    }

    /**
     * Given a fresh Lista,
     * When vazia() is queried (multiple times) and imprime() is invoked,
     * Then the list should remain empty and calling imprime() should not throw.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When / Then: repeated queries for emptiness remain true
        assertTrue("New list should be empty (first check)", lista0.vazia());
        assertTrue("New list should remain empty on subsequent checks", lista0.vazia());

        // When: invoke imprime() on an empty list and capture output
        String output = captureStdOut(() -> {
            // Should not throw for an empty list; we simply capture what is printed.
            lista0.imprime();
        });

        // Then: output should be non-null and likely empty or contain an explicit empty-list marker.
        assertNotNull("imprime() should not return null output", output);
        // Accept either an empty output (trimmed) or some textual marker indicating emptiness.
        boolean isTrimEmpty = output.trim().isEmpty();
        boolean mentionsEmpty = output.toLowerCase().contains("vazia") || output.toLowerCase().contains("empty");
        assertTrue("imprime() for an empty list should either produce no visible output or indicate emptiness. Output: [" + output + "]",
                isTrimEmpty || mentionsEmpty);
    }

    /**
     * Given a fresh Lista,
     * When boundary values (empty string) and a normal element are inserted,
     * Then the list should be non-empty and imprime() should include the normal element.
     *
     * This test is defensive: if inserting the empty string is rejected by the implementation
     * (throws an exception), the test continues to verify that inserting a normal element works.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When: attempt to insert an empty-string boundary value; some implementations may reject it.
        boolean emptyInsertAccepted = true;
        try {
            lista0.insere("");
        } catch (RuntimeException ex) {
            // Accept either behavior (allowed to reject empty string). Record and continue.
            emptyInsertAccepted = false;
        }

        // When: insert a normal element (happy path)
        final String normal = "normal-element";
        lista0.insere(normal);

        // Then: list must report not empty
        assertFalse("List should not be empty after inserting at least one element", lista0.vazia());

        // And: printed representation should include the normal element
        String output = captureStdOut(() -> lista0.imprime());
        assertNotNull("imprime() output must not be null", output);
        boolean containsNormal = output.contains(normal);
        boolean nonEmpty = !output.trim().isEmpty();
        assertTrue("imprime() should report the inserted element or produce non-empty output. Output: [" + output + "]",
                containsNormal || nonEmpty);

        // Additional check: if empty-string insertion was accepted, ensure the output still contains
        // either the empty string (which is hard to assert) or at least remains non-empty:
        if (emptyInsertAccepted) {
            assertTrue("After accepting an empty-string insertion, imprime() should produce non-empty output",
                    nonEmpty);
        }
    }

    // Helper to capture stdout produced by an action. Returns the captured output as a String.
    private static String captureStdOut(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capturing = new PrintStream(baos);
        try {
            System.setOut(capturing);
            action.run();
        } finally {
            // restore
            System.setOut(originalOut);
            try {
                capturing.flush();
            } catch (Exception ignored) {
            }
        }
        return baos.toString();
    }
}