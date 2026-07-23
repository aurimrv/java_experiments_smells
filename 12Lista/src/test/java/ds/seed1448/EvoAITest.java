package ds.seed1448;

import ds.Lista;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

/**
 * Unit tests for ds.Lista focused on basic list operations.
 *
 * Each test follows a Given-When-Then structure and contains explicit
 * assertions with descriptive failure messages to improve diagnosability.
 *
 * Traceability: REQ-001 (basic list insertion and emptiness), REQ-002 (printing
 * should not alter state).
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

    private static final String PRINT_ENCODING = "UTF-8";

    /**
     * test0
     *
     * Given an empty list,
     * When a known item is inserted,
     * Then the list should report non-empty and the printed representation should contain the item's string.
     *
     * Requirement: REQ-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        TestItem item = new TestItem("TEST_ITEM_0");
        assertTrue("Precondition: newly created list should be empty", lista0.vazia());

        // When
        lista0.insere(item);

        // Then: state assertions
        assertFalse("After insertion the list should not be empty", lista0.vazia());

        // And: observable behavior - imprime() should include the item's toString()
        String output = captureImprimeOutput(lista0);
        assertNotNull("Printing output should not be null", output);
        assertTrue("Printed output should contain the inserted item's string representation. Output: " + output,
                output.contains(item.toString()));
    }

    /**
     * test1
     *
     * Given an empty list,
     * When imprime is called,
     * Then the list should remain empty (imprime is observational and should not modify state).
     *
     * Requirement: REQ-002
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // Precondition
        assertTrue("Newly created list must be empty", lista0.vazia());

        // When: call imprime and ensure no exception is thrown and state unchanged
        String output = captureImprimeOutput(lista0);

        // Then: list remains empty and printing did not mutate state
        assertTrue("List should remain empty after imprime() call. Output: " + output, lista0.vazia());
    }

    /**
     * test2
     *
     * Given an empty list,
     * When a generic object is inserted,
     * Then the list should report non-empty and the printed output should contain the object's string.
     *
     * Requirement: REQ-001
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        Object object0 = new Object();
        assertTrue("Precondition: list must start empty", lista0.vazia());

        // When
        lista0.insere(object0);

        // Then: verify multiple properties
        assertFalse("List should not be empty after inserting an element", lista0.vazia());

        // And: observable behavior - printed representation should include the object's toString()
        String output = captureImprimeOutput(lista0);
        assertNotNull("Printing output should not be null", output);
        assertTrue("Printed output should contain the inserted object's toString(). Output: " + output,
                output.contains(object0.toString()));
    }

    // Helper method: captures stdout produced by lista.imprime()
    private String captureImprimeOutput(Lista lista) throws UnsupportedEncodingException {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos, true, PRINT_ENCODING);
        try {
            System.setOut(ps);
            // call the observational method; it's allowed to be called as part of verification
            lista.imprime();
        } finally {
            System.setOut(originalOut);
            ps.flush();
        }
        return baos.toString();
    }

    // Small helper item with deterministic toString for predictable assertions
    private static class TestItem {
        private final String id;

        TestItem(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}