package ds.seed5503;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test cases for Lista.
 *
 * Notes:
 * - Tests follow a Given-When-Then style and include descriptive assertion messages.
 * - Each test documents a requirement id (REQ-001, REQ-002, REQ-003) for traceability.
 * - System.out output from Lista.imprime() is captured and asserted where applicable.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

    /**
     * REQ-001: Inserting a single element should mark the list as non-empty and
     * the element's string representation should appear when printed.
     *
     * Given: an empty Lista
     * When: a known string element is inserted and the list is printed
     * Then: the list should report non-empty and the printed output must contain the element
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        String element = "test-element";

        // Precondition: list must start empty
        assertTrue("Precondition failed: new list should be empty", lista0.vazia());

        // When: insert a single, well-known element
        lista0.insere(element);

        // Capture printed output for verification
        String printed = captureStdOut(() -> {
            // Then: printing should not throw and should include the element's string
            lista0.imprime();
        });

        // Assertions: multiple, descriptive checks to make failure diagnosis easier
        assertFalse("After insertion, list should not be empty", lista0.vazia());
        assertNotNull("Printed output must not be null", printed);
        assertTrue("Printed output should contain the inserted element",
                printed.contains(element));
    }

    /**
     * REQ-002: A newly created Lista should be empty and printing an empty list
     * should be a no-op (not throw) and produce a stable output (possibly empty).
     *
     * Given: a freshly constructed Lista
     * When: vazia() is queried and imprime() is invoked
     * Then: vazia() returns true and imprime() does not throw (output is captured)
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When & Then: vazia() must reflect empty state
        assertTrue("Newly constructed list should be empty", lista0.vazia());

        // When: call imprime on an empty list; ensure it does not throw and output is defined
        String printedEmpty = captureStdOut(() -> {
            lista0.imprime();
        });

        // Then: the output for an empty list must be non-null and is allowed to be empty string
        assertNotNull("imprime() must produce a non-null output even for an empty list", printedEmpty);
    }

    /**
     * REQ-003: Multiple insertions should make all inserted elements observable
     * via imprime() and the list should report non-empty.
     *
     * Given: an empty Lista
     * When: two distinct elements are inserted
     * Then: vazia() is false and imprime() output contains both elements (order not strictly asserted)
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        String first = "first-element";
        String second = "second-element";

        // Precondition
        assertTrue("New list expected to be empty before insertions", lista0.vazia());

        // When: insert two elements (this exercises repeated inserts)
        lista0.insere(first);
        lista0.insere(second);

        // Capture output of imprime for verification
        String printed = captureStdOut(() -> {
            lista0.imprime();
        });

        // Then: list should no longer be empty and printed output should include both elements
        assertFalse("List should not be empty after insertions", lista0.vazia());
        assertNotNull("Printed output must not be null after insertions", printed);
        assertTrue("Printed output should contain the first inserted element", printed.contains(first));
        assertTrue("Printed output should contain the second inserted element", printed.contains(second));

        // Additionally, verify that operations are robust with respect to repeated inspections
        // calling vazia() again should be consistent
        boolean secondCheck = lista0.vazia();
        assertFalse("vazia() should consistently report non-empty after insertions", secondCheck);
    }

    /**
     * Helper to capture System.out output produced while running the provided action.
     * Restores original System.out after execution.
     */
    private String captureStdOut(Runnable action) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);
        try {
            action.run();
            ps.flush();
            return new String(baos.toByteArray(), StandardCharsets.UTF_8);
        } finally {
            System.setOut(originalOut);
            ps.close();
        }
    }
}