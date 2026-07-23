package ds.seed9121;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

import ds.MaxMin1;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for MaxMin1.
 * Note: Method names are kept identical to the originals (test0..test3),
 * but bodies were enhanced to provide clearer assertions, boundary inputs,
 * and categorization.
 */
interface UnitTest {}

public class EvoAITest {

  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given: an array with mixed values including a negative number (boundary-like)
    int[] intArray0 = new int[] {0, -707, 2, 3};
    assertEquals("Setup: input array must have length 4", 4, intArray0.length);

    // When: calling with a clearly out-of-range index
    // Then: an ArrayIndexOutOfBoundsException is expected
    MaxMin1.maxMin1(intArray0, 735);
  }

  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given: a normal 4-element array
    int[] intArray0 = new int[] {10, 20, 30, 1411};
    assertEquals("Setup: input array must have length 4", 4, intArray0.length);

    // When: calling with a negative index should result in ArrayIndexOutOfBoundsException
    MaxMin1.maxMin1(intArray0, -1);
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given: an array that includes extreme integer boundaries to exercise edge values
    int[] intArray0 = new int[] {Integer.MIN_VALUE, -1, 0, Integer.MAX_VALUE};
    assertNotNull("Input array must not be null", intArray0);
    assertEquals("Input array should have 4 elements for this scenario", 4, intArray0.length);

    // When: invoking the method with a valid index
    int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);

    // Then: basic contract checks
    assertNotNull("Result should not be null", intArray1);
    assertEquals("Result should contain exactly two elements", 2, intArray1.length);

    // Verify returned elements are within the range of values present in the input
    int minInput = Integer.MAX_VALUE;
    int maxInput = Integer.MIN_VALUE;
    for (int v : intArray0) {
      if (v < minInput) minInput = v;
      if (v > maxInput) maxInput = v;
    }
    for (int i = 0; i < intArray1.length; i++) {
      int val = intArray1[i];
      assertTrue("Result element at index " + i + " should be >= min(input)", val >= minInput);
      assertTrue("Result element at index " + i + " should be <= max(input)", val <= maxInput);
    }
  }

  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    // Given / When: constructing an instance (exercise default constructor)
    MaxMin1 instance = new MaxMin1();

    // Then: instance should be non-null and of the expected class
    assertNotNull("Constructor should return a non-null instance", instance);
    assertEquals("Instance should be of type MaxMin1", MaxMin1.class, instance.getClass());

    // Sanity check: calling the static method on a standard 4-element array behaves consistently
    int[] input = new int[] {1, 2, 3, 4};
    int[] result = MaxMin1.maxMin1(input, 0);
    assertNotNull("Static method should return a non-null result", result);
    assertEquals("Static method result should have length 2 for this implementation", 2, result.length);
  }
}