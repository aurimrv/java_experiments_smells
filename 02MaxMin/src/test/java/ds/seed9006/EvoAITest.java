package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved tests for MaxMin1.
 *
 * Notes:
 * - Tests include both error-path and happy-path checks where appropriate.
 * - Assertions include messages and validate multiple properties (shape and content).
 * - Tests use simple Given-When-Then comments to clarify intent.
 */
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: an array of length 8 with a negative value at index 1
    int[] intArray0 = new int[8];
    intArray0[1] = -249;

    // When / Then (error-path): passing a massively out-of-range n should raise AIOOBE
    try {
      MaxMin1.maxMin1(intArray0, 2113);
      fail("Expected ArrayIndexOutOfBoundsException when n is larger than array length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected: ensure an ArrayIndexOutOfBoundsException was thrown
      assertTrue("Expected ArrayIndexOutOfBoundsException for large n", e instanceof ArrayIndexOutOfBoundsException);
    }

    // When / Then (happy-path & boundary): use n equal to array length and verify result
    int[] result = MaxMin1.maxMin1(intArray0, intArray0.length);
    assertNotNull("Result should not be null for valid input", result);
    assertEquals("Result should contain exactly two elements (max and min)", 2, result.length);
    // For the given array (one negative value and rest zeros): max should be 0 and min should be -249
    assertEquals("Max value mismatch", 0, result[0]);
    assertEquals("Min value mismatch", -249, result[1]);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: an array of length 8 with a negative value at index 0
    int[] intArray0 = new int[8];
    intArray0[0] = -1;

    // When / Then (error-path): out-of-range n should raise AIOOBE
    try {
      MaxMin1.maxMin1(intArray0, 2113);
      fail("Expected ArrayIndexOutOfBoundsException when n is larger than array length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
      assertTrue("Expected ArrayIndexOutOfBoundsException for large n", e instanceof ArrayIndexOutOfBoundsException);
    }

    // When / Then (happy-path): use n equal to array length and verify result properties
    int[] result = MaxMin1.maxMin1(intArray0, intArray0.length);
    assertNotNull("Result should not be null for valid input", result);
    assertEquals("Result should contain exactly two elements (max and min)", 2, result.length);
    // With one -1 and the rest zeros: max = 0, min = -1
    assertEquals("Max value mismatch", 0, result[0]);
    assertEquals("Min value mismatch", -1, result[1]);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: an array of five zeros
    int[] intArray0 = new int[5];

    // When: n is a large negative number (treated by implementation as no elements)
    int[] resultNeg = MaxMin1.maxMin1(intArray0, -3760);

    // Then: Expect a default result for empty-range (implementation returns {0,0} for this case)
    assertNotNull("Result should not be null for negative n", resultNeg);
    assertEquals("Result should contain exactly two elements (max and min) for negative n", 2, resultNeg.length);
    assertEquals("Max should be 0 for empty-range", 0, resultNeg[0]);
    assertEquals("Min should be 0 for empty-range", 0, resultNeg[1]);

    // Additionally test the boundary n == length (happy-path)
    int[] resultFull = MaxMin1.maxMin1(intArray0, intArray0.length);
    assertNotNull("Result should not be null for n equal to length", resultFull);
    assertEquals("Result should contain exactly two elements (max and min) for full range", 2, resultFull.length);
    assertEquals("Max should be 0 for all-zero array", 0, resultFull[0]);
    assertEquals("Min should be 0 for all-zero array", 0, resultFull[1]);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: a MaxMin1 instance (constructor should be trivial)
    MaxMin1 obj = new MaxMin1();
    assertNotNull("Constructor should produce a non-null instance", obj);

    // When: call static method with a small sample array to validate behavior
    int[] sample = new int[] {5, 2, 9, -3, 7};
    // Use n equal to the array length (boundary) and check both max and min are correct
    int[] result = MaxMin1.maxMin1(sample, sample.length);

    // Then: verify result shape and content (max=9, min=-3)
    assertNotNull("Result should not be null", result);
    assertEquals("Result should contain exactly two elements (max and min)", 2, result.length);
    assertEquals("Max value mismatch for sample array", 9, result[0]);
    assertEquals("Min value mismatch for sample array", -3, result[1]);
  }
}