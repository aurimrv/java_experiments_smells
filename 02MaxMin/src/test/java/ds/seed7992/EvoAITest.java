package ds.seed7992;

import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Test class for MaxMin1.
 *
 * Requirements covered (examples):
 * - REQ-001: maxMin1 should return an int[2] result for non-empty arrays.
 * - REQ-002: Calling maxMin1 with an out-of-range index must throw ArrayIndexOutOfBoundsException.
 *
 * Note: Test method names are kept as originally generated (test0..test3) to satisfy tooling
 * that requires those exact test names. Each test follows a Given-When-Then structure and contains
 * descriptive assertions.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true,
        resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

    /**
     * Given: an array of length 8 with a value set at index 5.
     * When: maxMin1 is invoked with several invalid indices (very large, equal to length, negative).
     * Then: an ArrayIndexOutOfBoundsException is thrown for each invalid index.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[5] = -2308;

        // When / Then: index is far out of range
        assertIndexOutOfBounds(intArray0, 1460, "Expect AIOOB for a very large positive index");

        // When / Then: index equal to length (off-by-one)
        assertIndexOutOfBounds(intArray0, intArray0.length, "Expect AIOOB for index equal to array length");

        // When / Then: negative index
        assertIndexOutOfBounds(intArray0, -1, "Expect AIOOB for negative index");
    }

    /**
     * Given: an array of length 8 with a negative value at index 0.
     * When: maxMin1 is invoked with valid indices (0 and last index).
     * Then: method returns a two-element array containing the array min and max (in some order).
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[0] = -237;
        // fill other values to make min/max unambiguous
        intArray0[1] = 10;
        intArray0[2] = 5;
        intArray0[3] = 0;
        intArray0[4] = 100;
        intArray0[5] = 50;
        intArray0[6] = -100;
        intArray0[7] = 20;

        // When: call with index 0
        int[] result0 = MaxMin1.maxMin1(intArray0, 0);
        // Then: basic shape and contents
        assertNotNull("Result should not be null for valid input", result0);
        assertEquals("Result must be a two-element array (min and max)", 2, result0.length);
        assertContainsMinAndMax(intArray0, result0);

        // When: call with last valid index
        int[] resultLast = MaxMin1.maxMin1(intArray0, intArray0.length - 1);
        // Then: same expectations
        assertNotNull("Result should not be null when called with last index", resultLast);
        assertEquals("Result must be a two-element array (min and max) when called with last index", 2, resultLast.length);
        assertContainsMinAndMax(intArray0, resultLast);
    }

    /**
     * Given: a small array of length 4 initialized to zeros.
     * When: maxMin1 is invoked with index 0.
     * Then: it returns an array of length 2 and the returned values correspond to the min and max of the input.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] intArray0 = new int[4]; // all zeros

        // When
        int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);

        // Then
        assertNotNull("Expected non-null result for zero-filled array", intArray1);
        assertEquals("Expected result length of 2 for min and max", 2, intArray1.length);

        // For an array of all zeros, min and max are both zero.
        int expectedMin = 0;
        int expectedMax = 0;
        boolean containsMin = contains(intArray1, expectedMin);
        boolean containsMax = contains(intArray1, expectedMax);
        assertTrue("Result must contain the expected min value 0", containsMin);
        assertTrue("Result must contain the expected max value 0", containsMax);
    }

    /**
     * Given: a MaxMin1 instance can be constructed and used.
     * When: an instance is created and a simple array is processed.
     * Then: constructor does not throw and maxMin1 returns results consistent with computed min/max.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given / When: construct the class (no-op for classes with only static methods, but exercise constructor)
        MaxMin1 maxMin1_0 = new MaxMin1();
        assertNotNull("Instance should be constructed successfully", maxMin1_0);

        // Given: a simple array
        int[] values = new int[]{3, 1, 4, 1, 5, 9, 2};

        // When: call static method with index 0
        int[] result = MaxMin1.maxMin1(values, 0);

        // Then: result shape and contains computed min and max
        assertNotNull("Result should not be null for non-empty input", result);
        assertEquals("Result must be length 2", 2, result.length);

        int computedMin = computeMin(values);
        int computedMax = computeMax(values);
        // Verify that result contains both computed min and max
        assertTrue("Result must contain computed min value", contains(result, computedMin));
        assertTrue("Result must contain computed max value", contains(result, computedMax));
    }

    /* ------- Helper assertions and utilities ------- */

    private void assertIndexOutOfBounds(int[] arr, int idx, String message) {
        try {
            MaxMin1.maxMin1(arr, idx);
            fail(message + ": expected ArrayIndexOutOfBoundsException but none was thrown");
        } catch (ArrayIndexOutOfBoundsException ex) {
            // expected
        } catch (Throwable t) {
            fail(message + ": expected ArrayIndexOutOfBoundsException but got " + t.getClass().getSimpleName());
        }
    }

    private void assertContainsMinAndMax(int[] original, int[] result) {
        int min = computeMin(original);
        int max = computeMax(original);
        assertTrue("Result must contain the computed min (" + min + "): " + Arrays.toString(result),
                contains(result, min));
        assertTrue("Result must contain the computed max (" + max + "): " + Arrays.toString(result),
                contains(result, max));
    }

    private int computeMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must be non-empty to compute min");
        }
        int m = arr[0];
        for (int v : arr) {
            if (v < m) m = v;
        }
        return m;
    }

    private int computeMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must be non-empty to compute max");
        }
        int m = arr[0];
        for (int v : arr) {
            if (v > m) m = v;
        }
        return m;
    }

    private boolean contains(int[] arr, int value) {
        for (int v : arr) {
            if (v == value) return true;
        }
        return false;
    }
}