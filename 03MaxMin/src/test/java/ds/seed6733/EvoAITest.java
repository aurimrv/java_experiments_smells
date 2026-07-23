package ds.seed6733;

import ds.MaxMin2;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Requirement: REQ-2026 - Verify MaxMin2 behavior for valid and invalid indices and for common inputs.
 *
 * This test class replaces the original generated tests with clearer, boundary-focused and descriptive tests.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * REQ-2026-01: When calling maxMin2 with an index equal to array.length a ArrayIndexOutOfBoundsException must be thrown.
     *
     * Given an array of length 4
     * When maxMin2 is invoked with index == length (boundary)
     * Then an ArrayIndexOutOfBoundsException is raised
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[4];
        intArray0[0] = 65;

        // Expect
        thrown.expect(ArrayIndexOutOfBoundsException.class);

        // When
        MaxMin2.maxMin2(intArray0, intArray0.length);

        // Then: expectation handled by rule; no further assertions required here.
    }

    /**
     * REQ-2026-02: Negative start index should result in ArrayIndexOutOfBoundsException.
     *
     * Given an array and a negative index
     * When maxMin2 is invoked with that negative index
     * Then an ArrayIndexOutOfBoundsException is raised
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[4];
        intArray0[1] = 565;

        // Expect
        thrown.expect(ArrayIndexOutOfBoundsException.class);

        // When
        MaxMin2.maxMin2(intArray0, -1);

        // Then: exception expectation asserted by rule
    }

    /**
     * REQ-2026-03: For a typical 3-element array verify that returned result contains the max and min values.
     *
     * Given an array with distinct values
     * When maxMin2 is invoked with a valid start index
     * Then the returned array has length 2 and contains exactly the min and max of the input (order-independent),
     * and the input array remains unchanged.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] input = new int[] { 5, 1, 9 };
        int expectedMax = Integer.MIN_VALUE;
        int expectedMin = Integer.MAX_VALUE;
        for (int v : input) {
            if (v > expectedMax) expectedMax = v;
            if (v < expectedMin) expectedMin = v;
        }

        // When
        int[] result = MaxMin2.maxMin2(input, 0);

        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Result should contain exactly two elements (max and min)", 2, result.length);

        // Order-independent check: result must contain expectedMax and expectedMin
        boolean firstIsMaxSecondIsMin = (result[0] == expectedMax && result[1] == expectedMin);
        boolean firstIsMinSecondIsMax = (result[0] == expectedMin && result[1] == expectedMax);
        assertTrue("Result must contain the max and min values of the input (in any order). Expected max="
                + expectedMax + " min=" + expectedMin + " but was [" + result[0] + "," + result[1] + "]",
                firstIsMaxSecondIsMin || firstIsMinSecondIsMax);

        // Ensure input array was not modified
        assertArrayEquals("Input array should remain unchanged after call", new int[] {5, 1, 9}, input);
    }

    /**
     * REQ-2026-04: Constructing MaxMin2 and using it for a single-element array should return that element for both min and max.
     *
     * Given a new MaxMin2 instance and a single-element array
     * When maxMin2 is invoked with start index 0
     * Then both returned values equal the single element value
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given / When
        MaxMin2 instance = new MaxMin2();

        // Basic sanity checks on construction
        assertNotNull("MaxMin2 instance should be non-null after construction", instance);
        assertEquals("Instance should be of expected class", MaxMin2.class, instance.getClass());

        // Use-case: single-element array
        int[] single = new int[] { 7 };
        int[] out = MaxMin2.maxMin2(single, 0);

        // Then: expect two-element array with both entries equal to 7 (min==max==7)
        assertNotNull("Result should not be null for single-element input", out);
        assertEquals("Result should have length 2 for single-element input", 2, out.length);
        assertEquals("Both returned values should equal the single element (position 0)", 7, out[0]);
        assertEquals("Both returned values should equal the single element (position 1)", 7, out[1]);
    }
}