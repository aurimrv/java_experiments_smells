/*
 * Improved test class Evo on EvoSuite generated tests
 * Original: Evo (ds.seed5838)
 */

package ds.seed5838;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

    private static final int ARRAY_SIZE = 6;
    private static final int NEGATIVE_VALUE = -3230;
    private static final int SORT_INDEX = 5;

    @Before
    public void setUp() {
        // Ensure clean state before each test
    }

    @After
    public void tearDown() {
        // Clean up after each test
    }

    /**
     * Tests that ordena correctly sorts an array containing a negative value.
     * Given an array of 6 elements with a negative value at index 2,
     * when ordena is called with index 5,
     * then the array should be sorted with the negative value at the front.
     * Requirement: REQ-SORT-001
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given: an array of 6 zeros with a negative value at index 2
        int[] inputArray = createArrayWithNegativeValue();
        // When: ordena is called to sort up to index 5
        Ordenacao.ordena(inputArray, SORT_INDEX);
        // Then: the negative value should be moved to the front
        assertArrayEquals(
            "Array should be sorted with negative value at the beginning",
            new int[]{NEGATIVE_VALUE, 0, 0, 0, 0, 0},
            inputArray
        );
        assertEquals("First element should be the smallest (negative) value", NEGATIVE_VALUE, inputArray[0]);
        assertEquals("Array length should remain unchanged", ARRAY_SIZE, inputArray.length);
    }

    /**
     * Tests that the Ordenacao constructor creates a valid instance.
     * Requirement: REQ-INIT-001
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given/When: Ordenacao is instantiated
        Ordenacao ordenacao0 = new Ordenacao();
        // Then: a valid object should be created
        assertNotNull("Ordenacao instance should not be null after construction", ordenacao0);
    }

    // Helper method to create a test array with a negative value
    private int[] createArrayWithNegativeValue() {
        int[] arr = new int[ARRAY_SIZE];
        arr[2] = NEGATIVE_VALUE;
        return arr;
    }

    // Marker interface for test categorization
    public interface UnitTest {}
}