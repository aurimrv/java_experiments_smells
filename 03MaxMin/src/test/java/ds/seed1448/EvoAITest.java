package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import java.util.Arrays;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for MaxMin2.
 *
 * Requirement: REQ-1234 - MaxMin2 must provide stable min/max computation and
 * must throw ArrayIndexOutOfBoundsException for invalid index parameters.
 *
 * Each test uses a Given-When-Then structure in comments and contains
 * multiple assertions and descriptive failure messages to improve diagnosability.
 */
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * Given an array of length 7,
   * When maxMin2 is invoked with several invalid indices (large positive, equal to length, negative),
   * Then an ArrayIndexOutOfBoundsException is raised for each invalid index.
   *
   * This test verifies multiple boundary/invalid index cases instead of a single large index.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    int[] array = new int[7];
    array[4] = -1630; // set a non-zero value to ensure array contents are meaningful

    // Helper that asserts a Runnable throws ArrayIndexOutOfBoundsException
    final java.util.function.Consumer<Runnable> expectAIOOB = (r) -> {
      try {
        r.run();
        fail("Expected ArrayIndexOutOfBoundsException to be thrown for invalid index invocation");
      } catch (ArrayIndexOutOfBoundsException e) {
        // success: exception as expected
      } catch (Throwable t) {
        fail("Expected ArrayIndexOutOfBoundsException but got " + t.getClass().getName());
      }
    };

    // When / Then: large out-of-range index
    expectAIOOB.accept(() -> MaxMin2.maxMin2(array, 1585));

    // When / Then: index equal to array length (upper boundary)
    expectAIOOB.accept(() -> MaxMin2.maxMin2(array, array.length));

    // When / Then: negative index (lower boundary)
    expectAIOOB.accept(() -> MaxMin2.maxMin2(array, -1));
  }

  /**
   * Given an array with one large positive element,
   * When maxMin2 is invoked with a valid index (0) and an invalid large index (1585),
   * Then the valid invocation returns the expected min and max values and the invalid invocation throws.
   *
   * This provides both a happy-path check and an error-path check in the same test to improve coverage.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    int[] array = new int[7];
    array[1] = 1585; // one large element, others are 0

    // When: valid invocation with index 0 (should not throw)
    int[] result = null;
    try {
      result = MaxMin2.maxMin2(array, 0);
    } catch (ArrayIndexOutOfBoundsException ex) {
      fail("Valid index 0 should not throw ArrayIndexOutOfBoundsException");
    }

    // Then: result must be a pair containing the min and max of the input array
    int expectedMin = Arrays.stream(array).min().getAsInt();
    int expectedMax = Arrays.stream(array).max().getAsInt();
    assertNotNull("Result array must not be null for valid input", result);
    assertEquals("Result must be an array of length 2 containing min and max", 2, result.length);
    boolean containsAsOrdered = (result[0] == expectedMax && result[1] == expectedMin)
                               || (result[0] == expectedMin && result[1] == expectedMax);
    assertTrue("Result must contain both expected min (" + expectedMin + ") and max (" + expectedMax + ") in either order",
               containsAsOrdered);

    // When / Then: invalid large index should throw
    try {
      MaxMin2.maxMin2(array, 1585);
      fail("Expecting ArrayIndexOutOfBoundsException for index 1585");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
  }

  /**
   * Given an all-zero array of length 4,
   * When maxMin2 is invoked,
   * Then it returns an array of length 2 and both entries are equal to the array element value (0).
   *
   * Additionally, the test checks a couple of invalid index invocations to verify boundary behavior.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    int[] array = new int[4]; // all zeros

    // When
    int[] result = MaxMin2.maxMin2(array, 0);

    // Then
    assertNotNull("Result must not be null for a valid invocation", result);
    assertEquals("Result must have exactly two elements [min,max]", 2, result.length);

    int expectedMin = Arrays.stream(array).min().getAsInt();
    int expectedMax = Arrays.stream(array).max().getAsInt();
    boolean containsBoth = (result[0] == expectedMin && result[1] == expectedMax)
                           || (result[0] == expectedMax && result[1] == expectedMin);
    assertTrue("Result must contain expected min (" + expectedMin + ") and max (" + expectedMax + ")",
               containsBoth);

    // Also validate invalid boundaries: index equal to length and negative index
    try {
      MaxMin2.maxMin2(array, array.length);
      fail("Expected ArrayIndexOutOfBoundsException for index equal to array length");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }

    try {
      MaxMin2.maxMin2(array, -1);
      fail("Expected ArrayIndexOutOfBoundsException for negative index");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
  }

  /**
   * Given the MaxMin2 type,
   * When constructing an instance and invoking a simple computation,
   * Then the instance should be non-null and compute correct min/max for a small sample array.
   *
   * This verifies basic object construction and a simple happy-path call.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given / When
    MaxMin2 instance = new MaxMin2();

    // Then: object construction
    assertNotNull("MaxMin2 constructor should produce a non-null instance", instance);

    // And: instance can compute min and max correctly on a simple sample
    int[] sample = new int[] { 1, 2, 3 };
    int[] result = instance.maxMin2(sample, 0);

    assertNotNull("Result for sample input must not be null", result);
    assertEquals("Result length for sample input must be 2", 2, result.length);

    int actualMin = Math.min(Math.min(sample[0], sample[1]), sample[2]);
    int actualMax = Math.max(Math.max(sample[0], sample[1]), sample[2]);
    boolean correctContents = (result[0] == actualMin && result[1] == actualMax)
                              || (result[0] == actualMax && result[1] == actualMin);
    assertTrue("Result must contain sample min (" + actualMin + ") and max (" + actualMax + ") in either order",
               correctContents);
  }
}