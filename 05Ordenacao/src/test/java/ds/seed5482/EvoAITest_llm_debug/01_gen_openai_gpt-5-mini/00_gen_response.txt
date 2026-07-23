package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Ordenacao (REQ-ORD-001): basic ordering behavior. 
 * This header documents the requirement covered by these tests.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

    private static final int ARRAY_SIZE = 8;
    private static final int VALUE = 609;

    // Helper to reduce duplication and clarify intent
    private static int[] createArrayWithValue(int size, int value) {
        int[] arr = new int[size];
        arr[0] = value;
        return arr;
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        // Given
        int[] intArray0 = createArrayWithValue(ARRAY_SIZE, VALUE);
        // When
        Ordenacao.ordena(intArray0, 3);
        // Then - verify multiple properties with clear messages (Given-When-Then style)
        assertEquals("Expected value at index 2", VALUE, intArray0[2]);
        assertEquals("Index 0 should be zero after ordering", 0, intArray0[0]);
        assertArrayEquals("Full array should match expected", new int[] {0, 0, 609, 0, 0, 0, 0, 0}, intArray0);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        // Given / When: construct the object
        Ordenacao ordenacao0 = new Ordenacao();
        // Then: basic sanity assertion to detect construction faults
        assertNotNull("Ordenacao instance should be created", ordenacao0);
    }
}