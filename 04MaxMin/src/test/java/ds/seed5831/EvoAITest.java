package ds.seed5831;

import ds.MaxMin3;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for MaxMin3.
 *
 * Each test uses a Given-When-Then style comment and includes more descriptive
 * assertions and categories for easier selection. Tests preserve the original
 * test method names to remain compatible with existing tooling.
 */
public class EvoAITest {

    /**
     * Given an array of length 4 with a value at the last index,
     * when maxMin3 is invoked with a valid last index it should return
     * a non-null result and must not modify the originally stored value.
     * When invoked with an extremely large index it should throw
     * ArrayIndexOutOfBoundsException.
     *
     * Requirement: REQ-DS-001 (array bounds checking)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[4];
        intArray0[3] = 790;

        // When (valid boundary index)
        int[] resultValid = null;
        try {
            resultValid = MaxMin3.maxMin3(intArray0, 3); // last valid index
        } catch (Exception e) {
            fail("Unexpected exception for valid index 3: " + e);
        }

        // Then
        assertNotNull("Expected a non-null result when called with valid index 3", resultValid);
        // Ensure the original array entry was not inadvertently lost
        assertEquals("Original array element at index 3 should remain unchanged", 790, intArray0[3]);

        // When (invalid far out-of-range index)
        try {
            MaxMin3.maxMin3(intArray0, 456);
            fail("Calling maxMin3 with index 456 should throw ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exceptional path; confirm it's the correct exception type.
            assertTrue("Expected ArrayIndexOutOfBoundsException when index is out of range",
                    e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given an array of length 5 with known entries,
     * when called with a valid index it should return without exception,
     * and when called with a massively out-of-range index it should throw ArrayIndexOutOfBoundsException.
     *
     * Requirement: REQ-DS-001 (array bounds checking)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[5];
        intArray0[0] = 3012;
        intArray0[1] = 1;

        // When (valid index 0)
        try {
            int[] res = MaxMin3.maxMin3(intArray0, 0);
            assertNotNull("Result should not be null for valid index 0", res);
            // sanity: original data remains available
            assertEquals("Original value at index 0 should remain", 3012, intArray0[0]);
        } catch (Exception e) {
            fail("Unexpected exception for valid index 0: " + e);
        }

        // When (invalid index)
        try {
            MaxMin3.maxMin3(intArray0, 3012);
            fail("Calling maxMin3 with index 3012 should throw ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected outcome
            assertTrue("ArrayIndexOutOfBoundsException expected for index beyond length", e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given an array of length 6 with a negative value at the last position,
     * when invoked with the last index it should succeed; when invoked with a very large index it should raise ArrayIndexOutOfBoundsException.
     *
     * Requirement: REQ-DS-001 (array bounds checking)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        int[] intArray0 = new int[6];
        intArray0[5] = -598;

        // When (valid last index)
        try {
            int[] out = MaxMin3.maxMin3(intArray0, 5);
            assertNotNull("Expected non-null result for last valid index 5", out);
            assertEquals("Original element at index 5 should remain intact", -598, intArray0[5]);
        } catch (Exception e) {
            fail("Unexpected exception for valid index 5: " + e);
        }

        // When (invalid very large index)
        try {
            MaxMin3.maxMin3(intArray0, 2536);
            fail("Calling maxMin3 with index 2536 should throw ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
            assertTrue("Expected ArrayIndexOutOfBoundsException for out-of-range access", e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given an array of length 6 with values at indices 2 and 4,
     * when invoked with a valid index it should return successfully;
     * when invoked with a grossly out-of-range index it should throw ArrayIndexOutOfBoundsException.
     *
     * Requirement: REQ-DS-001 (array bounds checking)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given
        int[] intArray0 = new int[6];
        intArray0[2] = 2536;
        intArray0[4] = 1729;

        // When (valid index 4)
        try {
            int[] ret = MaxMin3.maxMin3(intArray0, 4);
            assertNotNull("Expected non-null result when called with valid index 4", ret);
            assertEquals("Value at index 4 should remain as initialized", 1729, intArray0[4]);
        } catch (Exception e) {
            fail("Unexpected exception for valid index 4: " + e);
        }

        // When (invalid index)
        try {
            MaxMin3.maxMin3(intArray0, 2536);
            fail("Calling maxMin3 with index 2536 should throw an ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertTrue("Expected ArrayIndexOutOfBoundsException for invalid index", e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given a null array reference,
     * when maxMin3 is invoked it should throw NullPointerException.
     *
     * Requirement: REQ-DS-002 (null input handling)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test4() throws Throwable {
        // Given
        int[] nullArray = null;

        // When / Then
        try {
            MaxMin3.maxMin3(nullArray, 1043);
            fail("Calling maxMin3 with a null array should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected: ensure correct exception type
            assertTrue("Expected NullPointerException for null input", e instanceof NullPointerException);
        } catch (Exception e) {
            fail("Expected NullPointerException but got: " + e);
        }
    }

    /**
     * Given a small array and a negative index,
     * when maxMin3 returns a new array, it should not be the same reference as the input and should be non-null.
     *
     * Requirement: REQ-DS-003 (return value contract)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test5() throws Throwable {
        // Given
        int[] intArray0 = new int[2];

        // When
        int[] intArray1 = null;
        try {
            intArray1 = MaxMin3.maxMin3(intArray0, -1);
        } catch (Exception e) {
            fail("Unexpected exception when calling maxMin3 with index -1: " + e);
        }

        // Then
        assertNotNull("Result should not be null for index -1 (implementation expected to handle it)", intArray1);
        assertNotSame("Expected a new array instance, not the same reference", intArray0, intArray1);
        assertEquals("Original array length should remain 2", 2, intArray0.length);
    }

    /**
     * Given the MaxMin3 class,
     * when an instance is constructed it should not be null and should produce a non-null toString result.
     *
     * Requirement: REQ-DS-004 (basic instantiation)
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test6() throws Throwable {
        // When
        MaxMin3 maxMin3_0 = new MaxMin3();

        // Then
        assertNotNull("Constructed MaxMin3 instance should not be null", maxMin3_0);
        // Basic sanity check on object behavior
        assertNotNull("toString() should not return null", maxMin3_0.toString());
    }
}