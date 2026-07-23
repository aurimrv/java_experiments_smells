package ds.seed9006;

import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved tests for MaxMin2.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure and includes assertions with messages.
 * - Magic numbers are replaced by named constants.
 * - Tests are categorized as UnitTest to allow selective execution.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

    // Named constants to avoid magic numbers in tests
    private static final int SIZE_8 = 8;
    private static final int SIZE_5 = 5;
    private static final int INDEX_OUT_OF_BOUNDS = 2113;
    private static final int SMALL_NEG = -249;
    private static final int NEG_INDEX = -3760;

    /**
     * Test: calling maxMin2 with an index far beyond array bounds should throw ArrayIndexOutOfBoundsException.
     *
     * Requirement: RQ-001 - The implementation must throw ArrayIndexOutOfBoundsException when index >= array.length.
     *
     * Given: an int array of length SIZE_8 with a negative value at position 1.
     * When: maxMin2 is invoked with a large index (INDEX_OUT_OF_BOUNDS).
     * Then: ArrayIndexOutOfBoundsException is thrown and the input array remains unchanged.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] input = new int[SIZE_8];
        input[1] = SMALL_NEG;
        int[] beforeCall = input.clone();

        // When / Then
        try {
            MaxMin2.maxMin2(input, INDEX_OUT_OF_BOUNDS);
            fail("Expected ArrayIndexOutOfBoundsException when calling maxMin2 with index " + INDEX_OUT_OF_BOUNDS);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception expected. Verify the array was not modified as a side-effect.
            assertArrayEquals("Input array should remain unchanged when an out-of-bounds index is provided", beforeCall, input);
        }
    }

    /**
     * Test: calling maxMin2 with an index far beyond array bounds should throw ArrayIndexOutOfBoundsException.
     *
     * Requirement: RQ-002 - Validate error handling for out-of-range indices including simple array positions.
     *
     * Given: an int array of length SIZE_8 with a single negative element at index 0.
     * When: maxMin2 is invoked with a very large positive index.
     * Then: ArrayIndexOutOfBoundsException is thrown and the input array remains unchanged.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] input = new int[SIZE_8];
        input[0] = -1;
        int[] snapshot = input.clone();

        // When / Then
        try {
            MaxMin2.maxMin2(input, INDEX_OUT_OF_BOUNDS);
            fail("Expected ArrayIndexOutOfBoundsException for index " + INDEX_OUT_OF_BOUNDS);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Verify no side effects occurred on the input array
            assertArrayEquals("Array contents must remain identical after out-of-bounds invocation", snapshot, input);
        }
    }

    /**
     * Test: calling maxMin2 with a negative index (convention in this implementation) should return {0,0}
     * for a fresh zero-initialized array.
     *
     * Requirement: RQ-003 - For negative indices behavior is defined to return two zeros for an all-zero input array.
     *
     * Given: an int array of length SIZE_5 initialized to zeros.
     * When: maxMin2 is invoked with a negative index.
     * Then: method returns an array of length 2 with both elements equal to zero and original array is unchanged.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] input = new int[SIZE_5];

        // When
        int[] result = MaxMin2.maxMin2(input, NEG_INDEX);

        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Result must have length 2", 2, result.length);
        assertArrayEquals("Expected result [0, 0] for an all-zero input and negative index", new int[]{0, 0}, result);
        // Verify original input not mutated
        assertArrayEquals("Original input array must remain zero-initialized", new int[SIZE_5], input);
    }

    /**
     * Test: basic constructor behavior for MaxMin2.
     *
     * Requirement: RQ-004 - Construction of MaxMin2 must succeed without error and produce an instance of the expected type.
     *
     * Given: nothing special.
     * When: constructing MaxMin2.
     * Then: instance is non-null and of type MaxMin2; toString yields a non-null string.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // When
        MaxMin2 instance = new MaxMin2();

        // Then
        assertNotNull("Constructor should produce a non-null instance", instance);
        assertEquals("Constructed instance should be of type MaxMin2", MaxMin2.class, instance.getClass());
        String repr = instance.toString();
        assertNotNull("toString() should not return null", repr);
        assertTrue("toString() should produce a non-empty representation", repr.length() > 0);
    }
}