package ds.seed9121;

import ds.MaxMin2;
import java.util.Arrays;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

interface UnitTest {}

/**
 * Improved tests for MaxMin2.
 *
 * These tests exercise both normal and exceptional behaviors,
 * include clearer assertions, and document intent (Given-When-Then).
 *
 * Requirement references:
 * - REQ-001: maxMin2 must return two values (min and max) for a valid array.
 * - REQ-002: maxMin2 must throw ArrayIndexOutOfBoundsException for out-of-range indices.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * test0
   *
   * Given: an int array of length 4 and an out-of-range index (735)
   * When:  maxMin2 is invoked with that index
   * Then:  an ArrayIndexOutOfBoundsException is thrown (bounds checking)
   *
   * Requirement: REQ-002
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test0() throws Throwable {
    // Given
    int[] intArray0 = new int[4];
    intArray0[1] = -707; // some value inside the array to demonstrate content doesn't affect the bounds check

    // When / Then (exception expected)
    MaxMin2.maxMin2(intArray0, 735);
  }

  /**
   * test1
   *
   * Given: an int array of length 4 with a value set at the last index and an out-of-range index (735)
   * When:  maxMin2 is invoked with that index
   * Then:  an ArrayIndexOutOfBoundsException is thrown (bounds checking)
   *
   * Requirement: REQ-002
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test1() throws Throwable {
    // Given
    int[] intArray0 = new int[4];
    intArray0[3] = 1411; // set a value at the last valid index to show array is non-empty

    // When / Then (exception expected)
    MaxMin2.maxMin2(intArray0, 735);
  }

  /**
   * test2
   *
   * Given: arrays with valid input and an in-range index (0)
   * When:  maxMin2 is invoked
   * Then:  it returns an array of length 2 containing the min and max of the input;
   *        for an all-zero array both entries are zero; for a mixed array both min and max are present.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given (case 1): zero-initialized array
    int[] zeros = new int[4];

    // When
    int[] resultZeros = MaxMin2.maxMin2(zeros, 0);

    // Then
    // - result length must be 2
    org.junit.Assert.assertEquals("Result should contain exactly two elements (min and max)", 2, resultZeros.length);
    // - both elements should be zero for a zero-initialized source array
    org.junit.Assert.assertEquals("First element should be 0 for zero-initialized array", 0, resultZeros[0]);
    org.junit.Assert.assertEquals("Second element should be 0 for zero-initialized array", 0, resultZeros[1]);
    // - the returned array should not be the same instance as the input
    org.junit.Assert.assertNotSame("Result array should not be the same instance as the input array", zeros, resultZeros);

    // Given (case 2): mixed values
    int[] mixed = new int[] {5, -3, 10, 2};
    int expectedMin = Arrays.stream(mixed).min().getAsInt();
    int expectedMax = Arrays.stream(mixed).max().getAsInt();

    // When
    int[] resultMixed = MaxMin2.maxMin2(mixed, 0);

    // Then
    org.junit.Assert.assertEquals("Result should contain exactly two elements (min and max)", 2, resultMixed.length);
    // The method may return [min, max] or [max, min]; assert both expected values are present
    boolean containsBoth =
        (resultMixed[0] == expectedMin && resultMixed[1] == expectedMax)
        || (resultMixed[0] == expectedMax && resultMixed[1] == expectedMin);
    org.junit.Assert.assertTrue(
        "Result must contain both the min and max values of the input array. Expected min="
            + expectedMin + " max=" + expectedMax + " got=" + Arrays.toString(resultMixed),
        containsBoth);
  }

  /**
   * test3
   *
   * Given: class MaxMin2
   * When:  an instance is created and a simple call is made
   * Then:  the instance is non-null and the static method behaves for single-element arrays
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given / When: instantiate MaxMin2 (even if methods are static, ensure construction is possible)
    MaxMin2 instance = new MaxMin2();

    // Then: instance should be non-null
    org.junit.Assert.assertNotNull("Should be able to construct MaxMin2", instance);
    org.junit.Assert.assertTrue("Instance should be of type MaxMin2", instance instanceof MaxMin2);

    // Additional behavior check: single-element array should yield that element as both min and max
    int[] single = new int[] {42};
    int[] resultSingle = MaxMin2.maxMin2(single, 0);
    org.junit.Assert.assertEquals("Result for single-element array should contain two elements", 2, resultSingle.length);
    org.junit.Assert.assertEquals("Both min and max should equal the single element", 42, resultSingle[0]);
    org.junit.Assert.assertEquals("Both min and max should equal the single element", 42, resultSingle[1]);
  }
}