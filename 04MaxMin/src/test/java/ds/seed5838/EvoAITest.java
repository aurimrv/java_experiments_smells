package ds.seed5838;

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
 * Requirement traceability: REQ-001 (determine max and min values given an input array and an index)
 *
 * These tests follow a Given-When-Then style and include both happy-path and error-path checks.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    private static final String REQ_ID = "REQ-001";

    @Before
    public void setUp() {
        // Common setup could be placed here if needed in the future.
    }

    /**
     * Given an array of length 4 and a very large positive index,
     * When maxMin3(...) is invoked,
     * Then an ArrayIndexOutOfBoundsException is thrown indicating the invalid index.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] array = new int[4];
        array[3] = 1;
        final int invalidIndex = 1586;

        // When / Then
        try {
            MaxMin3.maxMin3(array, invalidIndex);
            fail("Expected ArrayIndexOutOfBoundsException for index " + invalidIndex + " (requirement: " + REQ_ID + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            // The exception message for ArrayIndexOutOfBoundsException commonly contains the illegal index
            assertNotNull("Exception message should not be null", e.getMessage());
            // The message is implementation-dependent but should contain the array length or the invalid index.
            String msg = e.getMessage();
            boolean containsLengthOrIndex = msg.contains(String.valueOf(array.length)) || msg.contains(String.valueOf(invalidIndex));
            assertTrue("Exception message should reference array length or invalid index; actual: " + msg, containsLengthOrIndex);
        }
    }

    /**
     * Given an array of length 8 and an out-of-range positive index,
     * When maxMin3(...) is invoked,
     * Then an ArrayIndexOutOfBoundsException is thrown.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] array = new int[8];
        array[6] = -737;
        final int invalidIndex = 1856;

        // When / Then
        try {
            MaxMin3.maxMin3(array, invalidIndex);
            fail("Expected ArrayIndexOutOfBoundsException for index " + invalidIndex + " (requirement: " + REQ_ID + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            String msg = e.getMessage();
            assertTrue("Exception message should mention the array length or index; actual: " + msg,
                    msg.contains(String.valueOf(array.length)) || msg.contains(String.valueOf(invalidIndex)));
        }
    }

    /**
     * Given an array of length 8 (with a specific value) and an out-of-range index,
     * When maxMin3(...) is invoked,
     * Then an ArrayIndexOutOfBoundsException is thrown.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] array = new int[8];
        array[2] = 2633;
        final int invalidIndex = 1856;

        // When / Then
        try {
            MaxMin3.maxMin3(array, invalidIndex);
            fail("Expected ArrayIndexOutOfBoundsException for index " + invalidIndex + " (requirement: " + REQ_ID + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            String msg = e.getMessage();
            assertTrue("Exception message should reference array length or invalid index; actual: " + msg,
                    msg.contains(String.valueOf(array.length)) || msg.contains(String.valueOf(invalidIndex)));
        }
    }

    /**
     * Given an array of length 5 and an index that is out of bounds,
     * When maxMin3(...) is invoked,
     * Then an ArrayIndexOutOfBoundsException is thrown.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        int[] array = new int[5];
        array[3] = -305;
        final int invalidIndex = 848;

        // When / Then
        try {
            MaxMin3.maxMin3(array, invalidIndex);
            fail("Expected ArrayIndexOutOfBoundsException for index " + invalidIndex + " (requirement: " + REQ_ID + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertNotNull("Exception message should not be null", e.getMessage());
            String msg = e.getMessage();
            assertTrue("Exception message should reference array length or invalid index; actual: " + msg,
                    msg.contains(String.valueOf(array.length)) || msg.contains(String.valueOf(invalidIndex)));
        }
    }

    /**
     * Given an array with a clear maximum value at index 0,
     * When maxMin3(...) is invoked with a valid index,
     * Then the returned array contains the expected max and min values.
     *
     * This test exercises a happy-path and performs multiple, descriptive assertions.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        int[] input = new int[4];
        input[0] = 401;
        // fill remaining values explicitly to make min/max unambiguous
        input[1] = 0;
        input[2] = 0;
        input[3] = 0;
        final int index = 0;

        // When
        int[] result = MaxMin3.maxMin3(input, index);

        // Then - multiple assertions for richer verification
        assertNotNull("Result should not be null (requirement: " + REQ_ID + ")", result);
        assertEquals("Result array must contain exactly two elements: [max, min]", 2, result.length);
        assertEquals("Max value should be 401 when input[0] is the largest", 401, result[0]);
        assertEquals("Min value should be 0 when other entries are zero", 0, result[1]);
        assertArrayEquals("Full result array should match expected [401, 0]", new int[]{401, 0}, result);

        // Additional sanity: verify that returned max >= returned min
        assertTrue("Returned max should be >= returned min", result[0] >= result[1]);
    }

    /**
     * Given a minimal array of length 2 filled with zeros and a valid index,
     * When maxMin3(...) is invoked,
     * Then the returned max and min are both zero.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        int[] input = new int[2]; // default zeros
        final int index = 1;

        // When
        int[] result = MaxMin3.maxMin3(input, index);

        // Then
        assertNotNull("Result should not be null (requirement: " + REQ_ID + ")", result);
        assertEquals("Result length should be 2", 2, result.length);
        assertArrayEquals("Both max and min should be zero for an all-zero array", new int[]{0, 0}, result);
        assertEquals("Max equals min in an all-equal array", result[0], result[1]);
    }

    /**
     * Given the MaxMin3 type,
     * When an instance is constructed,
     * Then the instance should be creatable and of the expected type.
     *
     * Trace: REQ-001
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given / When
        MaxMin3 instance = new MaxMin3();

        // Then - basic non-trivial assertions about the constructed object
        assertNotNull("Constructor should produce a non-null instance (requirement: " + REQ_ID + ")", instance);
        assertEquals("Instance should be of class ds.MaxMin3", MaxMin3.class, instance.getClass());

        // If the class is intended to be stateless, verify calling toString() does not throw and returns a string
        String repr = instance.toString();
        assertNotNull("toString() should not return null", repr);
        assertTrue("toString() should contain class simple name", repr.contains("MaxMin3"));
    }
}