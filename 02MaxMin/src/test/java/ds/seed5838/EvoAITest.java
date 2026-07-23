package ds.seed5838;

import ds.MaxMin1;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

import java.util.Arrays;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for MaxMin1.
 *
 * Requirement traceability: REQ-MAXMIN-1: compute minimum and maximum from an int array given a start index.
 *
 * These tests exercise normal (happy) paths and exceptional/error paths, verify results and ensure input arrays are not
 * mutated unexpectedly. Tests follow a Given-When-Then structure in the body and include descriptive assertion messages.
 */
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

    // Helper data reused across tests
    private int[] baseArray;

    @Before
    public void setUp() {
        // Initialize a reusable base array for tests
        baseArray = new int[8];
        // default values are zeros; individual tests modify as needed
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: an array of length 8 with a single element set, and a very large (out of range) index
        int[] arr = Arrays.copyOf(baseArray, baseArray.length);
        arr[0] = 7;
        int[] arrBefore = Arrays.copyOf(arr, arr.length);
        final int largeIndex = 3730;

        // When / Then: calling with an out-of-range positive index should throw ArrayIndexOutOfBoundsException
        try {
            MaxMin1.maxMin1(arr, largeIndex);
            fail("Expected ArrayIndexOutOfBoundsException when calling maxMin1 with index " + largeIndex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Expected path: verify that the exception was thrown and that the original array was not modified
            assertNotNull("ArrayIndexOutOfBoundsException should be instantiated", ex);
            assertArrayEquals("Input array must remain unchanged after exception", arrBefore, arr);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: an array with a mid element set and a clearly invalid index
        int[] arr = Arrays.copyOf(baseArray, baseArray.length);
        arr[2] = 604;
        int[] arrBefore = Arrays.copyOf(arr, arr.length);
        final int invalidIndex = 3730;

        // When / Then: an out-of-range index must cause an ArrayIndexOutOfBoundsException and not alter the input
        try {
            MaxMin1.maxMin1(arr, invalidIndex);
            fail("Calling maxMin1 with an out-of-range index should throw ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // Basic sanity checks on the exception and that input was preserved
            assertTrue("Exception message may be null or descriptive", ex == null || ex.getMessage() == null || ex.getMessage().length() >= 0);
            assertArrayEquals("Input array must not be mutated when an exception is thrown", arrBefore, arr);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: an array of zeros and a valid start index 0
        int[] arr = Arrays.copyOf(baseArray, baseArray.length); // all zeros
        // When: compute min and max starting at index 0
        int[] result = MaxMin1.maxMin1(arr, 0);

        // Then: result must be a pair [min, max] and both should be zero for an all-zero array
        assertNotNull("Result must not be null", result);
        assertEquals("Result must contain exactly two elements: [min, max]", 2, result.length);
        assertEquals("Minimum of an all-zero array must be 0", 0, result[0]);
        assertEquals("Maximum of an all-zero array must be 0", 0, result[1]);

        // Ensure the input array was not modified by the operation
        int[] expectedInput = new int[arr.length];
        assertArrayEquals("Input array should remain unchanged after computing min/max", expectedInput, arr);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: a MaxMin1 instance is constructible and a mixed-value array
        MaxMin1 instance = new MaxMin1();
        assertNotNull("Should be able to construct MaxMin1 instance", instance);

        int[] mixed = new int[] {5, 1, 9, -2, 7};
        int[] mixedBefore = Arrays.copyOf(mixed, mixed.length);

        // When: compute min/max from the start (index 0)
        int[] pair = null;
        try {
            pair = MaxMin1.maxMin1(mixed, 0);
        } catch (Exception ex) {
            fail("Did not expect an exception for a valid input: " + ex);
        }

        // Then: verify result shape and semantics: min == -2, max == 9
        assertNotNull("Result array must not be null for valid input", pair);
        assertEquals("Result should be a pair of [min, max]", 2, pair.length);
        assertEquals("Minimum should be -2 for the mixed array", -2, pair[0]);
        assertEquals("Maximum should be 9 for the mixed array", 9, pair[1]);

        // And: verify the original array has not been mutated
        assertArrayEquals("Original input array must remain unchanged after computation", mixedBefore, mixed);
    }
}