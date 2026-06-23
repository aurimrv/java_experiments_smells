/*
 * Improved version of EvoSuite-generated test class
 * Original: ds.seed5482.Evo
 */

package ds.seed5482;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Test class Evo MaxMin4.
 * Covers constructor instantiation, normal operation, and exception handling.
 * Requirements: REQ-MAXMIN-001, REQ-MAXMIN-002, REQ-MAXMIN-003
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

    private static final int NEGATIVE_VALUE = -249;
    private static final int SMALL_ARRAY_SIZE = 4;
    private static final int LARGE_ARRAY_SIZE = 7;
    private static final int OUT_OF_BOUNDS_INDEX = 3425;

    /**
     * Tests that maxMin4 correctly returns max and min values
     * when the array contains a negative element at index 0.
     * Requirement: REQ-MAXMIN-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given an array with a negative first element
        int[] intArray0 = new int[SMALL_ARRAY_SIZE];
        intArray0[0] = NEGATIVE_VALUE;

        // When maxMin4 is called on the first 3 elements
        int[] intArray1 = MaxMin4.maxMin4(intArray0, 0, 2);

        // Then the input array should remain unchanged and result should contain max=0 and min=-249
        assertArrayEquals("Input array should remain unchanged",
                new int[]{NEGATIVE_VALUE, 0, 0, 0}, intArray0);
        assertArrayEquals("Result should contain max=0 and min=-249",
                new int[]{0, NEGATIVE_VALUE}, intArray1);
    }

    /**
     * Tests that maxMin4 throws ArrayIndexOutOfBoundsException
     * when the end index exceeds array bounds.
     * Requirement: REQ-MAXMIN-002
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given an array of size 7
        int[] intArray0 = new int[LARGE_ARRAY_SIZE];
        intArray0[3] = 1;

        // When maxMin4 is called with an out-of-bounds end index
        // Then an ArrayIndexOutOfBoundsException should be thrown
        try {
            MaxMin4.maxMin4(intArray0, 0, OUT_OF_BOUNDS_INDEX);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNull("Exception message should be null", e.getMessage());
        }
    }

    /**
     * Tests that MaxMin4 can be instantiated successfully.
     * Requirement: REQ-MAXMIN-003
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given/When: MaxMin4 is instantiated
        MaxMin4 maxMin4_0 = new MaxMin4();

        // Then: instance should not be null
        assertNotNull("MaxMin4 instance should be created successfully", maxMin4_0);
    }
}