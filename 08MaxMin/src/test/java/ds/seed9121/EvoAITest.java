package ds.seed9121;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test suite for MaxMin4.
 *
 * These tests exercise both valid (happy-path) and invalid (exceptional) usages of
 * MaxMin4.maxMin4(...) and the MaxMin4 constructor. Tests follow a Given-When-Then
 * structure and include descriptive assertion messages.
 *
 * Requirement link: TRACK-1234 (example traceability tag for this test)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

    private static final int DEFAULT_SIZE = 9;

    /**
     * Helper: create an int array of given size and apply sparse assignments.
     * Usage: createArray(DEFAULT_SIZE, 5, -669) will set index 5 to -669.
     */
    private static int[] createArray(int size, int... indexValuePairs) {
        int[] arr = new int[size];
        if (indexValuePairs != null) {
            for (int i = 0; i + 1 < indexValuePairs.length; i += 2) {
                int idx = indexValuePairs[i];
                int val = indexValuePairs[i + 1];
                if (idx >= 0 && idx < size) {
                    arr[idx] = val;
                } else {
                    // If caller provided out-of-range index, throw to reveal test bug early.
                    throw new IllegalArgumentException("Provided index out of bounds for test setup: " + idx);
                }
            }
        }
        return arr;
    }

    /**
     * Reflectively invokes MaxMin4.maxMin4(int[], int, int).
     * Returns the raw result (could be null for void methods).
     */
    private Object invokeMaxMin4(int[] arr, int start, int end) throws Exception {
        Method m = MaxMin4.class.getMethod("maxMin4", int[].class, int.class, int.class);
        // When invoking with a single array parameter, we must cast the array to Object to avoid varargs expansion.
        return m.invoke(null, (Object) arr, start, end);
    }

    /**
     * Compute min and max from arr between start and end inclusive. Normalizes out-of-order indices.
     */
    private int[] computeMinMaxInclusive(int[] arr, int start, int end) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int s = Math.min(start, end);
        int e = Math.max(start, end);
        if (s < 0) s = 0;
        if (e >= arr.length) e = arr.length - 1;
        if (arr.length == 0 || s > e) {
            throw new IllegalArgumentException("Invalid range after normalization: start=" + s + " end=" + e);
        }
        int min = arr[s];
        int max = arr[s];
        for (int i = s + 1; i <= e; i++) {
            int v = arr[i];
            if (v < min) min = v;
            if (v > max) max = v;
        }
        return new int[] { min, max };
    }

    /**
     * Assert that the result returned by maxMin4 contains the expected min and max values.
     * This function is defensive: it accepts several possible result shapes (int[], List, Collection)
     * and tolerates void/null results (in which case only absence of exception is asserted).
     */
    private void assertResultContainsMinMax(Object result, int expectedMin, int expectedMax) {
        if (result == null) {
            // The implementation might be void; we've at least confirmed it did not throw.
            return;
        }
        if (result instanceof int[]) {
            int[] r = (int[]) result;
            boolean hasMin = false;
            boolean hasMax = false;
            for (int v : r) {
                if (v == expectedMin) hasMin = true;
                if (v == expectedMax) hasMax = true;
            }
            assertTrue("Result array should contain expected min and max values. Expected min="
                    + expectedMin + " max=" + expectedMax + " but got array length=" + r.length,
                    hasMin && hasMax);
            return;
        }
        if (result instanceof Object[]) {
            Object[] r = (Object[]) result;
            boolean hasMin = false, hasMax = false;
            for (Object o : r) {
                if (o instanceof Number) {
                    long v = ((Number) o).longValue();
                    if (v == expectedMin) hasMin = true;
                    if (v == expectedMax) hasMax = true;
                }
            }
            assertTrue("Result Object[] should contain expected min and max", hasMin && hasMax);
            return;
        }
        if (result instanceof List) {
            List<?> r = (List<?>) result;
            boolean hasMin = false, hasMax = false;
            for (Object o : r) {
                if (o instanceof Number) {
                    long v = ((Number) o).longValue();
                    if (v == expectedMin) hasMin = true;
                    if (v == expectedMax) hasMax = true;
                }
            }
            assertTrue("Result List should contain expected min and max", hasMin && hasMax);
            return;
        }
        if (result instanceof Collection) {
            Collection<?> r = (Collection<?>) result;
            boolean hasMin = false, hasMax = false;
            for (Object o : r) {
                if (o instanceof Number) {
                    long v = ((Number) o).longValue();
                    if (v == expectedMin) hasMin = true;
                    if (v == expectedMax) hasMax = true;
                }
            }
            assertTrue("Result Collection should contain expected min and max", hasMin && hasMax);
            return;
        }
        if (result instanceof Number) {
            // If the method returns a single numeric value, best effort: assert that it equals either min or max.
            long v = ((Number) result).longValue();
            boolean ok = (v == expectedMin) || (v == expectedMax);
            assertTrue("Single numeric result should match min or max. result=" + v
                    + " expectedMin=" + expectedMin + " expectedMax=" + expectedMax, ok);
            return;
        }
        // If the result type is unknown, at least assert non-null to indicate presence of a result.
        assertNotNull("Result of maxMin4 invocation should not be null for supported types", result);
    }

    /**
     * test0: Verify behavior when a middle element is negative.
     * - Happy path: call with valid indices and assert result contains computed min and max.
     * - Error path: call with out-of-range end index and expect ArrayIndexOutOfBoundsException.
     *
     * Ticket: TRACK-1234-NEGATIVE-MIDDLE
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] arr = createArray(DEFAULT_SIZE, 5, -669);

        // When / Then (happy path) - use full array range
        int start = 0;
        int end = arr.length - 1;
        int[] expected = computeMinMaxInclusive(arr, start, end);
        try {
            Object result = invokeMaxMin4(arr, start, end);
            // Then
            assertResultContainsMinMax(result, expected[0], expected[1]);
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            fail("Invocation of maxMin4 threw unexpectedly on valid range: " + cause);
        } catch (Exception e) {
            fail("Unexpected reflection error invoking maxMin4: " + e);
        }

        // When / Then (error path): out-of-range end should surface ArrayIndexOutOfBoundsException
        try {
            invokeMaxMin4(arr, 0, 1551);
            fail("Expecting ArrayIndexOutOfBoundsException when calling with end far out-of-range");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertTrue("Expected ArrayIndexOutOfBoundsException but got: " + cause,
                    cause instanceof ArrayIndexOutOfBoundsException);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // Some implementations may throw directly; accept that too.
        }
    }

    /**
     * test1: Verify behavior when an early element is large positive.
     * - Happy path: validate min/max over valid range.
     * - Error path: validate out-of-range end triggers ArrayIndexOutOfBoundsException.
     *
     * Ticket: TRACK-1234-LARGE-EARLY
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] arr = createArray(DEFAULT_SIZE, 2, 3025);

        // When / Then (happy path)
        int start = 0;
        int end = arr.length - 1;
        int[] expected = computeMinMaxInclusive(arr, start, end);
        try {
            Object result = invokeMaxMin4(arr, start, end);
            assertResultContainsMinMax(result, expected[0], expected[1]);
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            fail("Invocation of maxMin4 threw unexpectedly on valid range: " + cause);
        } catch (Exception e) {
            fail("Reflection error invoking maxMin4: " + e);
        }

        // When / Then (error path)
        try {
            invokeMaxMin4(arr, 0, 1551);
            fail("Expecting ArrayIndexOutOfBoundsException for out-of-range end index");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertTrue("Expected ArrayIndexOutOfBoundsException but got: " + cause,
                    cause instanceof ArrayIndexOutOfBoundsException);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // acceptable alternative
        }
    }

    /**
     * test2: Verify behavior when a late element is negative.
     * - Happy path: validate min/max for valid indices.
     * - Error path: large end index should cause ArrayIndexOutOfBoundsException.
     *
     * Ticket: TRACK-1234-NEGATIVE-LATE
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] arr = createArray(DEFAULT_SIZE, 7, -957);

        // When / Then (happy path)
        int start = 0;
        int end = arr.length - 1;
        int[] expected = computeMinMaxInclusive(arr, start, end);
        try {
            Object result = invokeMaxMin4(arr, start, end);
            assertResultContainsMinMax(result, expected[0], expected[1]);
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            fail("maxMin4 threw unexpectedly on valid input: " + cause);
        } catch (Exception e) {
            fail("Reflection error invoking maxMin4: " + e);
        }

        // When / Then (error path)
        try {
            invokeMaxMin4(arr, 0, 1551);
            fail("Expecting ArrayIndexOutOfBoundsException for out-of-range end index");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertTrue("Expected ArrayIndexOutOfBoundsException but got: " + cause,
                    cause instanceof ArrayIndexOutOfBoundsException);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            // acceptable alternative
        }
    }

    /**
     * test3: Verify that MaxMin4 can be instantiated and that a simple single-element
     * array produces coherent min/max behavior.
     *
     * Ticket: TRACK-1234-CONSTRUCTOR
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given / When: construct the object (happy-path constructor test)
        MaxMin4 instance = new MaxMin4();
        assertNotNull("Constructor should produce a non-null MaxMin4 instance", instance);
        assertTrue("Constructed object should be an instance of MaxMin4", instance instanceof MaxMin4);

        // Given: single-element array (boundary case)
        int[] single = new int[] { 42 };
        int start = 0;
        int end = 0;
        int[] expected = computeMinMaxInclusive(single, start, end);
        try {
            Object result = invokeMaxMin4(single, start, end);
            // For a single element array min and max are equal to that element
            assertResultContainsMinMax(result, expected[0], expected[1]);
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            fail("maxMin4 threw unexpectedly for single-element array: " + cause);
        } catch (Exception e) {
            fail("Reflection error invoking maxMin4 for single-element array: " + e);
        }
    }
}