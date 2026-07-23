package ds.seed6733;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

import ds.MaxMin3;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin3.
 *
 * Traceability: REQ-1001 - Verify correct behavior for maxMin3 with valid inputs and proper exceptions for invalid indices.
 *
 * These tests follow a Given-When-Then structure in comments and include descriptive assertion messages.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    // Helper to create arrays with an optional set at a given index.
    private static int[] createArray(int size, Integer setIndex, Integer setValue) {
        int[] arr = new int[size];
        if (setIndex != null) {
            arr[setIndex] = setValue;
        }
        return arr;
    }

    /**
     * Given an array of length 4 with a value written at index 3,
     * when maxMin3 is invoked with a very large out-of-range index,
     * then an ArrayIndexOutOfBoundsException is expected and the message should indicate the array length.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = createArray(4, 3, 998);

        // When / Then
        try {
            MaxMin3.maxMin3(intArray0, 998);
            fail("Expected ArrayIndexOutOfBoundsException when calling maxMin3 with index far outside array bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Verify additional property: exception message typically contains the invalid index or array length.
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null", msg);
            // Original tests observed message equal to array length; accept that as a likely informative value.
            assertEquals("Exception message should indicate the array length for this implementation", String.valueOf(intArray0.length), msg);
        }
    }

    /**
     * Given an array of length 8 with a negative value at index 4,
     * when maxMin3 is invoked with a large out-of-range index,
     * then an ArrayIndexOutOfBoundsException is expected and the message should indicate the array length.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = createArray(8, 4, -4243);

        // When / Then
        try {
            MaxMin3.maxMin3(intArray0, 772);
            fail("Expected ArrayIndexOutOfBoundsException for out-of-range index parameter");
        } catch (ArrayIndexOutOfBoundsException e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null", msg);
            assertEquals("Exception message should indicate the array length for this implementation", String.valueOf(intArray0.length), msg);
        }
    }

    /**
     * Given an array of length 8 with a value at the last index,
     * when maxMin3 is called with a large out-of-range index,
     * then an ArrayIndexOutOfBoundsException is expected and the message should indicate the array length.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given: exercise a last-index write to ensure internal handling of end-of-array values
        int[] intArray0 = createArray(8, 7, -3074);

        // When / Then
        try {
            MaxMin3.maxMin3(intArray0, 772);
            fail("Expected ArrayIndexOutOfBoundsException when providing an index well beyond the array bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null", msg);
            assertEquals("Exception message should indicate the array length for this implementation", String.valueOf(intArray0.length), msg);
        }
    }

    /**
     * Given an array of length 6 with a mid-array value,
     * when maxMin3 is called with an excessively large index,
     * then an ArrayIndexOutOfBoundsException is expected and message should indicate the array length.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given
        int[] intArray0 = createArray(6, 2, 1423);

        // When / Then
        try {
            MaxMin3.maxMin3(intArray0, 1992);
            fail("Expected ArrayIndexOutOfBoundsException for index out of bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null", msg);
            assertEquals("Exception message should indicate the array length for this implementation", String.valueOf(intArray0.length), msg);
        }
    }

    /**
     * Given an array with a known value, when maxMin3 is called with a value present in the array,
     * then a non-null result of length 2 is expected and the returned array contents are asserted.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test4() throws Throwable {
        // Given
        int[] intArray0 = createArray(4, 1, -649);

        // When
        int[] intArray1 = MaxMin3.maxMin3(intArray0, -649);

        // Then: basic contract checks
        assertNotNull("Result should not be null for valid input", intArray1);
        assertEquals("Result should contain exactly two elements (min and max or indices)", 2, intArray1.length);
        // Preserve original expectation while adding descriptive message
        assertArrayEquals("Returned pair did not match expected values", new int[] {0, -649}, intArray1);
    }

    /**
     * Given a default zero-filled array, when maxMin3 is invoked with a small index parameter,
     * then the result should be a two-element array describing min/max or equivalent.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test5() throws Throwable {
        // Given
        int[] intArray0 = createArray(4, null, null);

        // When
        int[] intArray1 = MaxMin3.maxMin3(intArray0, 1);

        // Then
        assertNotNull("Result should not be null for a zero-filled array", intArray1);
        assertEquals("Result should have length 2 as a pair (e.g., index and value or min/max)", 2, intArray1.length);
    }

    /**
     * Given the MaxMin3 type, ensure it can be constructed.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test6() throws Throwable {
        // When
        MaxMin3 maxMin3_0 = new MaxMin3();

        // Then
        assertNotNull("Constructor should produce a non-null instance", maxMin3_0);
    }
}