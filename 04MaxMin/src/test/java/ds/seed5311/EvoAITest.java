package ds.seed5311;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin3;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for ds.MaxMin3.
 *
 * Traceability: REQ-DS-001
 *
 * These tests exercise both normal (happy-path) and exceptional behavior that was
 * present in the originally generated tests. They follow a simple Given-When-Then
 * structure and include descriptive assertions and failure messages.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Helper that asserts the provided runnable throws ArrayIndexOutOfBoundsException.
     */
    private void assertThrowsArrayIndexOutOfBounds(Runnable action, String message) {
        try {
            action.run();
            fail(message);
        } catch (ArrayIndexOutOfBoundsException expected) {
            // expected exception; include a basic sanity assertion that it's the right type
            assertTrue("Expected ArrayIndexOutOfBoundsException, got: " + expected.getClass(), expected instanceof ArrayIndexOutOfBoundsException);
        } catch (Throwable t) {
            // If any other runtime exception occurred, fail with details
            fail("Expected ArrayIndexOutOfBoundsException but got " + t.getClass() + ": " + t.getMessage());
        }
    }

    /**
     * Helper that asserts the provided runnable throws NullPointerException.
     */
    private void assertThrowsNullPointer(Runnable action, String message) {
        try {
            action.run();
            fail(message);
        } catch (NullPointerException expected) {
            // expected
            assertTrue("Expected NullPointerException, got: " + expected.getClass(), expected instanceof NullPointerException);
        } catch (Throwable t) {
            fail("Expected NullPointerException but got " + t.getClass() + ": " + t.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: an array of length 6 with one large element set
        int[] input = new int[6];
        input[3] = 4917;

        // When/Then: a very large positive index should be rejected with ArrayIndexOutOfBoundsException
        assertThrowsArrayIndexOutOfBounds(() -> MaxMin3.maxMin3(input, 1214),
            "maxMin3 should throw ArrayIndexOutOfBoundsException for n much larger than array length");

        // And: calling with n == 0 should be a valid (happy-path) invocation returning a non-null result
        int[] resultForZero = MaxMin3.maxMin3(input, 0);
        assertNotNull("Result must not be null for n == 0", resultForZero);
        assertNotSame("Implementation should not return the same array reference (defensive copy expected)", input, resultForZero);
        // Original input must remain unchanged
        assertEquals("Original array element should be preserved", 4917, input[3]);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: an array of length 6 with a negative value
        int[] input = new int[6];
        input[4] = -3637;

        // When/Then: an excessively large index should produce ArrayIndexOutOfBoundsException
        assertThrowsArrayIndexOutOfBounds(() -> MaxMin3.maxMin3(input, 1214),
            "maxMin3 should throw ArrayIndexOutOfBoundsException when n is far beyond the array bounds");

        // And: happy-path check for n == 0
        int[] out = MaxMin3.maxMin3(input, 0);
        assertNotNull("Result must not be null for n == 0", out);
        assertNotSame("Result should be a different array instance", input, out);
        assertEquals("Original value should remain unchanged after call", -3637, input[4]);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a small array of length 4 with a negative element
        int[] input = new int[4];
        input[3] = -2355;

        // When/Then: calling with an index larger than array length should throw ArrayIndexOutOfBoundsException
        assertThrowsArrayIndexOutOfBounds(() -> MaxMin3.maxMin3(input, 12),
            "Expecting ArrayIndexOutOfBoundsException when n > input.length");

        // Also check the typical boundary case n == 0 (happy-path)
        int[] result = MaxMin3.maxMin3(input, 0);
        assertNotNull("Result should not be null for boundary n == 0", result);
        assertNotSame("Result should not be the same reference as the input", input, result);
        // Verify input unchanged
        assertEquals("Input element preserved", -2355, input[3]);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: a small array of length 4 with a positive element
        int[] input = new int[4];
        input[2] = 3127;

        // When/Then: extremely large n should cause ArrayIndexOutOfBoundsException
        assertThrowsArrayIndexOutOfBounds(() -> MaxMin3.maxMin3(input, 1170),
            "Large n should result in ArrayIndexOutOfBoundsException");

        // Happy-path smoke check for n == 0
        int[] out = MaxMin3.maxMin3(input, 0);
        assertNotNull("Result must be non-null when n == 0", out);
        assertNotSame("Should be a new array instance", input, out);
        assertEquals("Ensure original array not modified", 3127, input[2]);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a larger array
        int[] input = new int[17];
        for (int i = 0; i < input.length; i++) {
            input[i] = i - 8; // fill with deterministic values including negatives
        }

        // When: requesting with n == 0 (a boundary/happy-path case)
        int[] result = MaxMin3.maxMin3(input, 0);

        // Then: result should be a separate array and non-null
        assertNotNull("Result for n == 0 should not be null", result);
        assertNotSame("Result should be a different instance from input", input, result);

        // Also ensure the original input array remains unchanged (defensive copy)
        for (int i = 0; i < input.length; i++) {
            assertEquals("Original input must remain unchanged at index " + i, i - 8, input[i]);
        }
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given: a tiny array of length 2
        int[] input = new int[2];
        input[0] = 1369;

        // When/Then: extremely large n should be rejected with ArrayIndexOutOfBoundsException
        assertThrowsArrayIndexOutOfBounds(() -> MaxMin3.maxMin3(input, 3406),
            "Large n should trigger ArrayIndexOutOfBoundsException for small arrays");

        // Happy-path check: n == 0 should succeed and not mutate original array
        int[] res = MaxMin3.maxMin3(input, 0);
        assertNotNull("Result must not be null for n == 0", res);
        assertNotSame("Should return a new array instance", input, res);
        assertEquals("Original element should be intact", 1369, input[0]);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        // Given: a null input (invalid)
        // When/Then: API should throw NullPointerException for null array argument
        assertThrowsNullPointer(() -> MaxMin3.maxMin3((int[]) null, 67),
            "Passing null as the array should result in NullPointerException");

        // Also check that a minimal valid array with n==0 works (sanity)
        int[] minimal = new int[1];
        minimal[0] = 0;
        int[] ret = MaxMin3.maxMin3(minimal, 0);
        assertNotNull("Result must not be null for minimal valid input", ret);
        assertNotSame("Result should not be the same reference as the input", minimal, ret);
        assertEquals("Original minimal input should remain unchanged", 0, minimal[0]);
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        // Given/When: construct MaxMin3 to ensure constructor is safe and produces an instance
        MaxMin3 instance = new MaxMin3();

        // Then: basic sanity checks on the instance
        assertNotNull("Constructor should create a non-null instance", instance);
        assertEquals("Instance should equal itself", instance, instance);
        // No other behavior is asserted here because all operations are static in the API under test.
    }
}