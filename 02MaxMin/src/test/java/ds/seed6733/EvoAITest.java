package ds.seed6733;

import ds.MaxMin1;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so they can be categorized when needed.
 */
interface UnitTest {}

/**
 * Improved test class for MaxMin1.
 *
 * Notes:
 * - Methods keep their original names (test0..test3) to satisfy tooling that expects them.
 * - Tests include Given-When-Then style comments, descriptive assertions, and requirement references in Javadoc.
 * - Tests are defensive: they assert preconditions and validate postconditions without relying on EvoSuite scaffolding.
 */
public class EvoAITest {

    /**
     * Requirement: REQ-ARRAY-BOUNDS-001
     *
     * Given a small array (length 4) and an out-of-range index,
     * When maxMin1 is invoked with the invalid index,
     * Then an ArrayIndexOutOfBoundsException is expected.
     */
    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    @Category(UnitTest.class)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[4];
        intArray0[0] = 65;
        assertEquals("Precondition: array should have length 4", 4, intArray0.length);

        // When / Then
        // Expect an ArrayIndexOutOfBoundsException for an index far beyond the array bounds.
        MaxMin1.maxMin1(intArray0, 65);
    }

    /**
     * Requirement: REQ-ARRAY-BOUNDS-002
     *
     * Given a length-4 array with a populated element,
     * When maxMin1 is invoked with an index well beyond bounds,
     * Then an ArrayIndexOutOfBoundsException is expected.
     */
    @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
    @Category(UnitTest.class)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[4];
        intArray0[1] = 565;
        assertEquals("Precondition: array must be of expected length", 4, intArray0.length);

        // When / Then
        MaxMin1.maxMin1(intArray0, 65);
    }

    /**
     * Requirement: REQ-MAXMIN-001
     *
     * Given a small array of distinct values,
     * When maxMin1 is invoked with a valid index,
     * Then the returned array should have length 2, contain values from the input,
     * and the first element should be >= the second element (max >= min).
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Throwable {
        // Given
        int[] input = new int[] { 3, 1, 2 };
        assertNotNull("Precondition: input must not be null", input);
        assertEquals("Precondition: input must have length 3", 3, input.length);

        // When
        int[] result = MaxMin1.maxMin1(input, 0);

        // Then - structural checks
        assertNotNull("Result should not be null", result);
        assertEquals("Result should be a pair (length 2): [max, min] or similar", 2, result.length);

        // Then - semantic checks
        int a = result[0];
        int b = result[1];
        assertTrue("First returned value should be >= second returned value (max >= min)", a >= b);
        assertTrue("Returned max (or first element) must be one of the input values", contains(input, a));
        assertTrue("Returned min (or second element) must be one of the input values", contains(input, b));
    }

    /**
     * Requirement: REQ-CONSTRUCTOR-001
     *
     * Given the MaxMin1 class,
     * When a new instance is constructed and used on a simple input,
     * Then no unexpected exception should be thrown and the result should meet basic invariants.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test3() throws Throwable {
        // Given / When - construction
        MaxMin1 instance = new MaxMin1();
        assertNotNull("Constructor should create a non-null MaxMin1 instance", instance);

        // Given - a simple array
        int[] input = new int[] { -1, 5, 0 };
        assertEquals("Precondition: input must have length 3", 3, input.length);

        // When - call the method with a valid index (0)
        int[] output = MaxMin1.maxMin1(input, 0);

        // Then - basic invariants
        assertNotNull("Output must not be null", output);
        assertEquals("Output must contain two elements (max and min)", 2, output.length);
        int max = output[0];
        int min = output[1];
        assertTrue("Max should be greater than or equal to min", max >= min);
        assertTrue("Max must be one of the input elements", contains(input, max));
        assertTrue("Min must be one of the input elements", contains(input, min));
    }

    // Helper to check whether an array contains a given value
    private static boolean contains(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int v : array) {
            if (v == value) {
                return true;
            }
        }
        return false;
    }
}