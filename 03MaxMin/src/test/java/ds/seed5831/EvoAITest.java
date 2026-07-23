package ds.seed5831;

import ds.MaxMin2;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for MaxMin2.
 *
 * These tests exercise normal and error conditions:
 * - verify that out-of-range indices produce ArrayIndexOutOfBoundsException
 * - verify returned array has expected shape (length == 2)
 * - verify behavior on trivial inputs (all-equal elements, single-element array)
 *
 * Requirement: maxMin2(int[] array, int index) must either compute and return a two-element
 * result based on the provided array starting at index, or throw an ArrayIndexOutOfBoundsException
 * when the index is outside the valid range for the given array.
 */
public class EvoAITest {

  /**
   * Given: an array of length 7 with a known value at position 1.
   * When: calling maxMin2 with an index well beyond the array bounds (314).
   * Then: an ArrayIndexOutOfBoundsException is thrown and the input array remains unchanged.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[7];
    intArray0[1] = -377;

    try {
      MaxMin2.maxMin2(intArray0, 314);
      fail("Expected ArrayIndexOutOfBoundsException for index 314 on array of length 7");
    } catch (ArrayIndexOutOfBoundsException e) {
      // basic sanity checks on the exception to provide meaningful diagnostics
      String msg = e.getMessage();
      assertTrue("Exception should indicate an out-of-bounds condition", e.toString().contains("ArrayIndexOutOfBoundsException"));
      // ensure array was not modified before the exception was thrown
      assertEquals("Input array element at index 1 should remain unchanged", -377, intArray0[1]);
      // message may vary by JVM, but if present it should not be empty
      if (msg != null) {
        assertFalse("Exception message, if present, should not be empty", msg.isEmpty());
      }
    }
  }

  /**
   * Given: an array of length 7 with a specific value at index 2.
   * When: calling maxMin2 with an out-of-range index (314).
   * Then: an ArrayIndexOutOfBoundsException is thrown and the array content is preserved.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = new int[7];
    intArray0[2] = 5420;

    try {
      MaxMin2.maxMin2(intArray0, 314);
      fail("Expected ArrayIndexOutOfBoundsException for index 314 on array of length 7");
    } catch (ArrayIndexOutOfBoundsException e) {
      // verify exception type and that input was not mutated
      assertTrue("Expected ArrayIndexOutOfBoundsException", e.toString().contains("ArrayIndexOutOfBoundsException"));
      assertEquals("Input array element at index 2 should remain unchanged", 5420, intArray0[2]);
    }
  }

  /**
   * Given: an array of five zeros and a valid starting index (0).
   * When: calling maxMin2.
   * Then: the returned array has length 2 and both entries are zero (max==min==0).
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[5]; // all elements default to 0
    int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
    assertNotNull("Result should not be null", intArray1);
    assertEquals("Result must contain exactly two elements (max and min)", 2, intArray1.length);
    assertEquals("Both max and min should be 0 for an all-zero array", 0, intArray1[0]);
    assertEquals("Both max and min should be 0 for an all-zero array", 0, intArray1[1]);
  }

  /**
   * Smoke test: instantiate MaxMin2 and exercise behavior on a single-element array.
   * Given: a single-element array {42} and index 0.
   * When: calling maxMin2.
   * Then: the method returns a two-element array and both entries equal the single element value.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Ensure the class has an accessible constructor and can be instantiated.
    MaxMin2 instance = new MaxMin2();
    assertNotNull("MaxMin2 instance should be creatable", instance);

    int[] single = new int[] { 42 };
    int[] result = MaxMin2.maxMin2(single, 0);

    assertNotNull("Result should not be null for single-element input", result);
    assertEquals("Result must contain exactly two elements", 2, result.length);
    // For a single-element input, max and min must be equal to that element regardless of ordering.
    assertEquals("Result elements should both equal the sole input element", 42, result[0]);
    assertEquals("Result elements should both equal the sole input element", 42, result[1]);
    // ensure original array remains unchanged
    assertEquals("Original array element should remain unchanged", 42, single[0]);
  }
}