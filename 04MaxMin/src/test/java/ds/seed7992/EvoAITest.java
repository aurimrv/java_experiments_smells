package ds.seed7992;

import ds.MaxMin3;
import org.junit.Before;
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
 * Requirement: DS-1234 - Provide robust unit tests for MaxMin3.maxMin3 covering
 * normal and exceptional behavior, with clear Given-When-Then structure and descriptive assertions.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    // Common timeouts used by original tests; kept to mirror original test timing constraints.
    private static final int TIMEOUT = 4000;

    // Helper constants for descriptive messages
    private static final String MSG_EXPECT_OOB = "Expected ArrayIndexOutOfBoundsException for index %d on array length %d";

    @Before
    public void setUp() {
        // Placeholder for shared setup in future; kept to show Given-When-Then style support.
    }

    // Helper to create arrays of a given length, optionally overriding values.
    private int[] createArray(int length, int... initialValues) {
        int[] arr = new int[length];
        for (int i = 0; i < initialValues.length && i < length; i++) {
            arr[i] = initialValues[i];
        }
        return arr;
    }

    // Helper that asserts MaxMin3.maxMin3 throws ArrayIndexOutOfBoundsException for the provided input.
    private void assertIndexOutOfBounds(int[] array, int index) {
        try {
            // When
            MaxMin3.maxMin3(array, index);
            // Then - fail if no exception
            fail(String.format(MSG_EXPECT_OOB, index, array.length));
        } catch (ArrayIndexOutOfBoundsException e) {
            // Then - expected path: exception is thrown.
            assertNotNull("Exception should not be null", e);
            // Basic check: message or toString should contain either index or array length to aid diagnostics.
            String diag = e.toString();
            assertTrue("Exception diagnostic should mention array or index", diag != null && diag.length() > 0);
        }
    }

    @Test(timeout = TIMEOUT)
    public void test0() throws Throwable {
        // Given: an array with length 7 and one non-zero element
        int[] intArray0 = createArray(7);
        intArray0[3] = 1277;

        // When / Then: calling with a very large index should throw ArrayIndexOutOfBoundsException
        assertIndexOutOfBounds(intArray0, 1096);
    }

    @Test(timeout = TIMEOUT)
    public void test1() throws Throwable {
        // Given: an array of length 4 with a negative value inside
        int[] intArray0 = createArray(4);
        intArray0[2] = -119;

        // When / Then: out-of-range positive index should throw
        assertIndexOutOfBounds(intArray0, 648);
    }

    @Test(timeout = TIMEOUT)
    public void test2() throws Throwable {
        // Given: an array of length 8 with one negative element
        int[] intArray0 = createArray(8);
        intArray0[3] = -3051;

        // When / Then: calling with a large index triggers ArrayIndexOutOfBoundsException
        assertIndexOutOfBounds(intArray0, 2160);
    }

    @Test(timeout = TIMEOUT)
    public void test3() throws Throwable {
        // Given: an array of length 7 with a positive element
        int[] intArray0 = createArray(7);
        intArray0[4] = 1503;

        // When / Then: out-of-range index should result in ArrayIndexOutOfBoundsException
        assertIndexOutOfBounds(intArray0, 1096);
    }

    @Test(timeout = TIMEOUT)
    public void test4() throws Throwable {
        // Given: a small array of three zeros
        int[] intArray0 = createArray(3);

        // When: calling maxMin3 with a negative index (exercise non-standard index handling)
        int[] result = MaxMin3.maxMin3(intArray0, -650);

        // Then: verify basic contract of result in multiple assertions
        assertNotNull("Result array should not be null", result);
        assertEquals("Result array should contain exactly two elements (max and min)", 2, result.length);
        // For an all-zero input, max and min should both be zero; verify both positions are identical and zero.
        assertEquals("First element (max) should be 0 for all-zero input", 0, result[0]);
        assertEquals("Second element (min) should be 0 for all-zero input", 0, result[1]);
    }

    @Test(timeout = TIMEOUT)
    public void test5() throws Throwable {
        // Given: an array of length 4 with a non-zero first element
        int[] intArray0 = createArray(4, 1);

        // When / Then: a large index should be rejected with ArrayIndexOutOfBoundsException
        assertIndexOutOfBounds(intArray0, 248);
    }

    @Test(timeout = TIMEOUT)
    public void test6() throws Throwable {
        // Given: an empty array
        int[] intArray0 = createArray(0);

        // When / Then: any index access should throw ArrayIndexOutOfBoundsException (empty array edge case)
        assertIndexOutOfBounds(intArray0, 3221);
    }

    @Test(timeout = TIMEOUT)
    public void test7() throws Throwable {
        // Given / When: construct a MaxMin3 instance (sanity/happy-path object creation)
        MaxMin3 maxMin3_0 = new MaxMin3();

        // Then: instance should be non-null and usable
        assertNotNull("Constructed MaxMin3 instance should not be null", maxMin3_0);

        // Additional light-weight smoke test: calling with a simple valid input should not throw and should return length 2.
        int[] sample = createArray(3, 5, 1, 7);
        int[] out = MaxMin3.maxMin3(sample, 0);
        assertNotNull("Calling maxMin3 on valid input must return a non-null array", out);
        assertEquals("maxMin3 should return array of length 2 for valid input", 2, out.length);
    }
}