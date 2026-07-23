package ds.seed5503;

import ds.MaxMin3;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.MaxMin3 behavior.
 *
 * These tests were improved from an auto-generated baseline to:
 * - add descriptive documentation and Given-When-Then structure,
 * - group tests as unit tests via @Category,
 * - avoid relying on EvoSuite runtime helpers,
 * - add additional assertions where appropriate to validate post-conditions.
 *
 * Traceability: REQ-DS-5503 (example requirement id for MaxMin3 behavior)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    // Named constants to avoid magic numbers and to clarify intent
    private static final int LARGE_INDEX_A = 782;
    private static final int LARGE_INDEX_B = 976;
    private static final int LARGE_INDEX_C = 509;
    private static final int NEGATIVE_INDEX = -764;

    /**
     * Given: an int array of length 6 with a value set at index 3.
     * When: calling MaxMin3.maxMin3 with a very large positive index.
     * Then: an ArrayIndexOutOfBoundsException is expected and the original array remains unchanged.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[3] = 782;
        // Sanity pre-condition
        assertEquals("Precondition: element at index 3 should be the value we set", 782, intArray0[3]);

        try {
            MaxMin3.maxMin3(intArray0, LARGE_INDEX_A);
            fail("Expected ArrayIndexOutOfBoundsException when index is out-of-bounds (large positive index).");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Post-conditions: array should remain unchanged
            assertEquals("Array contents should remain unchanged after failed call", 782, intArray0[3]);
        }
    }

    /**
     * Given: an int array of length 9 with a negative value set at index 4.
     * When: calling MaxMin3.maxMin3 with a large out-of-range index.
     * Then: an ArrayIndexOutOfBoundsException is expected and the array contents are preserved.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        int[] intArray0 = new int[9];
        intArray0[4] = -2288;
        assertEquals("Precondition: element at index 4 should be the value we set", -2288, intArray0[4]);

        try {
            MaxMin3.maxMin3(intArray0, LARGE_INDEX_B);
            fail("Expected ArrayIndexOutOfBoundsException for index greater than length-1.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Array should not be modified on exception", -2288, intArray0[4]);
        }
    }

    /**
     * Given: an int array of length 9 with a value at index 2.
     * When: calling MaxMin3.maxMin3 with another large out-of-range index.
     * Then: an ArrayIndexOutOfBoundsException is expected and the array remains unchanged.
     *
     * Note: This test exercises another out-of-bounds scenario to ensure consistent exception behavior.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        int[] intArray0 = new int[9];
        intArray0[2] = 2126;
        assertEquals("Precondition: element at index 2 should be the value we set", 2126, intArray0[2]);

        try {
            MaxMin3.maxMin3(intArray0, LARGE_INDEX_B);
            fail("Expected ArrayIndexOutOfBoundsException for large positive index.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Array should remain unchanged after exception", 2126, intArray0[2]);
        }
    }

    /**
     * Given: an int array of length 6 with a negative value at the last index.
     * When: calling MaxMin3.maxMin3 with a large out-of-range index.
     * Then: an ArrayIndexOutOfBoundsException is expected and the array contents are preserved.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[5] = -3062;
        assertEquals("Precondition: element at index 5 should be the value we set", -3062, intArray0[5]);

        try {
            MaxMin3.maxMin3(intArray0, LARGE_INDEX_A);
            fail("Expected ArrayIndexOutOfBoundsException when index is out of bounds.");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("Array contents should not change on exception", -3062, intArray0[5]);
        }
    }

    /**
     * Given: a minimal int array of length 2 with a value at index 0.
     * When: calling MaxMin3.maxMin3 with a very negative index that the implementation handles as a valid
     *       (implementation-specific) scenario.
     * Then: a result array with expected values is returned and original array content is preserved.
     *
     * This is the "happy-path" scenario present in the original test set.
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        int[] intArray0 = new int[2];
        intArray0[0] = 3843;

        // Given / When
        int[] result = MaxMin3.maxMin3(intArray0, NEGATIVE_INDEX);

        // Then: returned array matches expected values and original array remains unchanged
        assertNotNull("Result should not be null for a valid call", result);
        assertArrayEquals("Returned min/max array should match expected", new int[]{3843, 0}, result);
        assertEquals("Original array should not be modified at index 0", 3843, intArray0[0]);
    }

    /**
     * Given: an empty-initialized 2-element array.
     * When: calling MaxMin3.maxMin3 with a large out-of-range index.
     * Then: an ArrayIndexOutOfBoundsException is expected and array remains unchanged.
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        int[] intArray0 = new int[2];
        // ensure default values
        assertEquals("Precondition: default element should be zero", 0, intArray0[0]);
        assertEquals("Precondition: default element should be zero", 0, intArray0[1]);

        try {
            MaxMin3.maxMin3(intArray0, LARGE_INDEX_C);
            fail("Expected ArrayIndexOutOfBoundsException when calling method with index well beyond array bounds.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // verify array unchanged
            assertEquals("Array element 0 should remain unchanged on exception", 0, intArray0[0]);
            assertEquals("Array element 1 should remain unchanged on exception", 0, intArray0[1]);
        }
    }

    /**
     * Given: the MaxMin3 type.
     * When: instantiating MaxMin3.
     * Then: a non-null instance is created and is of the correct type.
     */
    @Test(timeout = 4000)
    public void test6() throws Throwable {
        MaxMin3 instance = new MaxMin3();
        assertNotNull("A new MaxMin3 instance should not be null after construction", instance);
        assertTrue("Instance should be of type MaxMin3", instance instanceof MaxMin3);
    }
}