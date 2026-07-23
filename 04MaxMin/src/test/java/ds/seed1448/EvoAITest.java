package ds.seed1448;

import ds.MaxMin3;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.MaxMin3.
 *
 * These tests provide both happy-path and failure validations for the maxMin3 method.
 * Each test follows a Given-When-Then structure and includes brief traceability tags.
 *
 * Requirement trace: REQ-DS-1 (determine max and min values from integer arrays)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Given an array of length 4 and an out-of-range index, when maxMin3 is invoked,
     * then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
     *
     * Trace: REQ-DS-1, TICKET-101
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] input = new int[4];
        input[0] = -1;
        input[1] = -2724;
        int originalLength = input.length;
        int original0 = input[0];
        int original1 = input[1];

        // When / Then
        try {
            MaxMin3.maxMin3(input, 890);
            fail("Expected ArrayIndexOutOfBoundsException when index is far out of range");
        } catch (ArrayIndexOutOfBoundsException e) {
            // verify exception type and that the input array was not mutated
            assertNotNull("Exception message should be present", e.getMessage());
            assertEquals("Input array length should remain unchanged after exception", originalLength, input.length);
            assertEquals("Array element [0] should remain unchanged after exception", original0, input[0]);
            assertEquals("Array element [1] should remain unchanged after exception", original1, input[1]);
        }
    }

    /**
     * Given an array of length 8 and an out-of-range index (large positive), when maxMin3 is invoked,
     * then an ArrayIndexOutOfBoundsException is expected and the array contents must not be modified.
     *
     * Trace: REQ-DS-1, TICKET-102
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] input = new int[8];
        input[0] = 2;
        input[1] = 1658;
        int[] copy = input.clone();

        // When / Then
        try {
            MaxMin3.maxMin3(input, 1658);
            fail("Expected ArrayIndexOutOfBoundsException for index beyond array bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            // basic checks
            assertTrue("Threw ArrayIndexOutOfBoundsException", e instanceof ArrayIndexOutOfBoundsException);
            // ensure no mutation
            assertArrayEquals("Input array should not be mutated when exception occurs", copy, input);
        }
    }

    /**
     * Given an array of length 6 with a negative element, when maxMin3 is invoked with a large index,
     * then an ArrayIndexOutOfBoundsException is expected and the array should be unchanged.
     *
     * Trace: REQ-DS-1, TICKET-103
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] input = new int[6];
        input[3] = -1;
        int[] snapshot = input.clone();

        // When / Then
        try {
            MaxMin3.maxMin3(input, 1970);
            fail("Expected ArrayIndexOutOfBoundsException for out-of-range index");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception should carry a message", e.getMessage());
            // array must remain as before
            assertArrayEquals("Array contents must remain intact on exception", snapshot, input);
        }
    }

    /**
     * Given an 8-length array with some populated elements, when maxMin3 is invoked with an out-of-range index,
     * then ArrayIndexOutOfBoundsException is expected and no side-effects should occur.
     *
     * Trace: REQ-DS-1, TICKET-104
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        int[] input = new int[8];
        input[0] = 2;
        input[4] = 2;
        int[] before = input.clone();

        // When / Then
        try {
            MaxMin3.maxMin3(input, 1658);
            fail("Expected ArrayIndexOutOfBoundsException for index much larger than array length");
        } catch (ArrayIndexOutOfBoundsException e) {
            // validate no mutation
            assertArrayEquals("Array should remain unchanged when exception occurs", before, input);
        }
    }

    /**
     * Given an 8-length array with a single element set, when maxMin3 is invoked with an out-of-range index,
     * then an ArrayIndexOutOfBoundsException should be thrown and array must remain unchanged.
     *
     * Trace: REQ-DS-1, TICKET-105
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        int[] input = new int[8];
        input[4] = 2;
        int[] snapshot = input.clone();

        // When / Then
        try {
            MaxMin3.maxMin3(input, 1658);
            fail("Expected ArrayIndexOutOfBoundsException for oversized index");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertArrayEquals("Input array should be unchanged after exception", snapshot, input);
        }
    }

    /**
     * Given a small array with one large value, when maxMin3 is invoked with a valid index,
     * then the returned pair should contain the maximum and minimum values respectively.
     *
     * Trace: REQ-DS-1, TICKET-106
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        int[] input = new int[2];
        input[0] = 1406;

        // When
        int[] result = MaxMin3.maxMin3(input, 0);

        // Then: validate the result contract (max, min) and be defensive about structure
        assertNotNull("Result must not be null", result);
        assertEquals("Result must contain exactly two elements (max and min)", 2, result.length);

        int expectedMax = Math.max(input[0], input[1]);
        int expectedMin = Math.min(input[0], input[1]);
        assertArrayEquals("Returned [max,min] must match computed values",
                new int[]{expectedMax, expectedMin}, result);

        // Additional sanity checks
        assertTrue("Max must be greater than or equal to min", result[0] >= result[1]);
    }

    /**
     * Given an array of zeros, when maxMin3 is invoked, then both max and min should be zero.
     *
     * Trace: REQ-DS-1, TICKET-107
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given
        int[] input = new int[4];

        // When
        int[] result = MaxMin3.maxMin3(input, 1);

        // Then
        assertNotNull("Result must not be null", result);
        assertEquals("Result must be a pair [max,min]", 2, result.length);
        assertArrayEquals("For all-zero array both max and min should be zero", new int[]{0, 0}, result);
        assertTrue("Max must be >= min", result[0] >= result[1]);
    }

    /**
     * Given the MaxMin3 class, when constructing an instance, then the instance should be non-null and of the expected type.
     *
     * Trace: REQ-DS-1, TICKET-108
     */
    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given / When
        MaxMin3 instance = new MaxMin3();

        // Then
        assertNotNull("Newly constructed MaxMin3 instance must not be null", instance);
        assertEquals("Instance must be of class MaxMin3", MaxMin3.class, instance.getClass());
    }
}