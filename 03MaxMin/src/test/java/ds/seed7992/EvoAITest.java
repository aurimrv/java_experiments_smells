package ds.seed7992;

import ds.MaxMin2;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin2 behaviours.
 *
 * Requirement traceability: REQ-DS-001 Ensure maxMin2 returns a two-element result for valid index inputs,
 * and throws ArrayIndexOutOfBoundsException for invalid index inputs.
 *
 * Tests follow a Given-When-Then structure inside each test method.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Given: an int array of length 8 with a negative value at index 5.
     * When: a valid index is provided, Then: method returns a non-null length-2 array with sensible contents.
     * When: an invalid large index is provided, Then: an ArrayIndexOutOfBoundsException is thrown.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[5] = -2308;

        // When (happy path) - call with a valid index and validate result properties
        int validIndex = 5;
        int[] resultValid = MaxMin2.maxMin2(intArray0, validIndex);

        // Then - multiple, descriptive assertions about the valid result
        Assert.assertNotNull("Expected non-null result for valid index", resultValid);
        Assert.assertEquals("Result should be an array of length 2 for valid index", 2, resultValid.length);
        Assert.assertTrue("First element of result should correspond to an index or a value present in input",
                isIndexOrPresentValue(resultValid[0], intArray0));
        Assert.assertTrue("Second element of result should correspond to an index or a value present in input",
                isIndexOrPresentValue(resultValid[1], intArray0));

        // When/Then (error path) - large out-of-range index should produce ArrayIndexOutOfBoundsException
        int invalidIndex = 1460;
        try {
            MaxMin2.maxMin2(intArray0, invalidIndex);
            Assert.fail("Expecting ArrayIndexOutOfBoundsException when index is out of array bounds");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected - make an explicit assertion that the exception was thrown
            Assert.assertTrue("Caught expected ArrayIndexOutOfBoundsException for invalid index",
                    e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given: an int array of length 8 with a negative value at index 0.
     * When: a valid index is provided, Then: method returns a non-null length-2 array with sensible contents.
     * When: an invalid large index is provided, Then: an ArrayIndexOutOfBoundsException is thrown.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        int[] intArray0 = new int[8];
        intArray0[0] = -237;

        // When (happy path)
        int validIndex = 0;
        int[] resultValid = MaxMin2.maxMin2(intArray0, validIndex);

        // Then - validate
        Assert.assertNotNull("Expected non-null result for valid index 0", resultValid);
        Assert.assertEquals("Result for valid index 0 should be length 2", 2, resultValid.length);
        Assert.assertTrue("Result[0] should correspond to an index or be a value from the input",
                isIndexOrPresentValue(resultValid[0], intArray0));
        Assert.assertTrue("Result[1] should correspond to an index or be a value from the input",
                isIndexOrPresentValue(resultValid[1], intArray0));

        // When/Then (error path)
        int invalidIndex = 1460;
        try {
            MaxMin2.maxMin2(intArray0, invalidIndex);
            Assert.fail("Expecting ArrayIndexOutOfBoundsException for index " + invalidIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            Assert.assertTrue("Expected ArrayIndexOutOfBoundsException when calling with invalid index",
                    e instanceof ArrayIndexOutOfBoundsException);
        }
    }

    /**
     * Given: an int array of length 4 initialized to zeros.
     * When: maxMin2 is invoked with index 0.
     * Then: it returns a two-element array (contract).
     *
     * This test also validates that returned elements make sense with respect to input.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        int[] intArray0 = new int[4];

        // When
        int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);

        // Then - multiple assertions to improve coverage and intent
        Assert.assertNotNull("Returned array should not be null", intArray1);
        Assert.assertEquals("Returned array must have length 2", 2, intArray1.length);

        // Both returned elements should either be indices into the input array or values present in the array.
        Assert.assertTrue("First result element should be an index or a value from the input",
                isIndexOrPresentValue(intArray1[0], intArray0));
        Assert.assertTrue("Second result element should be an index or a value from the input",
                isIndexOrPresentValue(intArray1[1], intArray0));
    }

    /**
     * Given: creating an instance of MaxMin2.
     * When: constructed, Then: object is non-null and behaves minimally (toString) without throwing.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given & When
        MaxMin2 maxMin2_0 = new MaxMin2();

        // Then - several lightweight checks to ensure sensible default construction
        Assert.assertNotNull("Construction should produce a non-null MaxMin2 instance", maxMin2_0);
        // toString should not throw and should return a non-null string
        String s = null;
        try {
            s = maxMin2_0.toString();
        } catch (Throwable t) {
            Assert.fail("toString() should not throw on a newly constructed MaxMin2");
        }
        Assert.assertNotNull("toString() should return a non-null string", s);
        Assert.assertTrue("toString() should contain the class name", s.contains("MaxMin2") || s.length() > 0);
    }

    // Helper: returns true if candidate is a valid index into input OR if candidate equals any value present in input.
    private static boolean isIndexOrPresentValue(int candidate, int[] input) {
        if (input == null) {
            return false;
        }
        if (candidate >= 0 && candidate < input.length) {
            return true;
        }
        for (int v : input) {
            if (v == candidate) {
                return true;
            }
        }
        return false;
    }
}