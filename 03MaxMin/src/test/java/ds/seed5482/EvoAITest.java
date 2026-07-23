package ds.seed5482;

import ds.MaxMin2;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin2.
 *
 * Requirement reference: MM-001 - maxMin2 should return two-element array representing min/max
 * and should throw ArrayIndexOutOfBoundsException for clearly out-of-range index values.
 *
 * The original tests were auto-generated and focused on exceptional flows. These tests improve
 * expressiveness, add boundary checks (k = 0), and document expected behaviour.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Given an array of length 8 with one negative value,
     * When invoking maxMin2 with a valid boundary index (0),
     * Then it should return a non-null two-element result (min and max).
     *
     * And when invoking with a very large invalid index (1919),
     * Then it is expected to throw ArrayIndexOutOfBoundsException.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[3] = -1690;

        // When: boundary value k = 0 (common/expected case)
        int[] result = MaxMin2.maxMin2(intArray0, 0);

        // Then: verify basic contract (non-null, length of two, and values are reasonable for this input)
        assertNotNull("maxMin2 should not return null for k = 0", result);
        assertEquals("maxMin2 should return exactly two elements (min and max)", 2, result.length);
        // For an array mostly filled with zeros and one -1690, min should be <= max.
        assertTrue("result[0] should be <= result[1]", result[0] <= result[1]);

        // When: an obviously out-of-range index is supplied
        try {
            MaxMin2.maxMin2(intArray0, 1919);
            fail("Expected ArrayIndexOutOfBoundsException for k = 1919 (out-of-range index)");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exceptional behaviour for an index that is clearly outside array bounds.
            assertNotNull("Expected a non-null exception instance", e);
        }
    }

    /**
     * Given an array with a positive element at index 6,
     * When invoking maxMin2 with a valid boundary index (0),
     * Then it should produce a two-element result where min <= max.
     *
     * Also verifies that a large out-of-range index triggers ArrayIndexOutOfBoundsException.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[6] = 3;

        // When: normal boundary k = 0
        int[] result = MaxMin2.maxMin2(intArray0, 0);

        // Then: verify contract
        assertNotNull("maxMin2 should not return null for a valid invocation", result);
        assertEquals("Result size must be two (min and max)", 2, result.length);
        assertTrue("Returned min should be <= returned max", result[0] <= result[1]);

        // And when: an out-of-range index is used, expect an exception
        try {
            MaxMin2.maxMin2(intArray0, 1919);
            fail("Expected ArrayIndexOutOfBoundsException for a very large index (1919)");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
            assertNotNull("Exception instance should not be null", e);
        }
    }

    /**
     * Given an empty-initialized array of length 8,
     * When invoking with k = 0,
     * Then the method should return a two-element array (min and max).
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] intArray0 = new int[8];

        // When
        int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);

        // Then
        assertNotNull("Result should not be null", intArray1);
        assertEquals("Expected exactly two results (min and max)", 2, intArray1.length);
        // For an all-zero array, both min and max should be zero (or at least equal).
        assertEquals("For an all-zero array both values should be equal", intArray1[0], intArray1[1]);
    }

    /**
     * Simple construction test to ensure MaxMin2 is instantiable (no hidden initialization issues).
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        MaxMin2 instance = new MaxMin2();
        assertNotNull("MaxMin2 instance should be creatable", instance);
    }
}