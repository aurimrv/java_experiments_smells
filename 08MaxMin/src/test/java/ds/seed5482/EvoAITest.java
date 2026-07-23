package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing fast/unit tests in this package.
 * Placed at package-level so it can be referenced by @Category on the test class.
 */
interface UnitTest {}

/**
 * Improved test suite for MaxMin4.
 *
 * Notes:
 * - Each test includes a brief Given-When-Then description and descriptive assertion messages.
 * - Tests cover happy paths, boundary/single-element behavior, and an out-of-bounds exceptional flow.
 * - The original auto-generated test method names are retained (test0, test1, test2) per constraints.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true,
                     useVFS = true,
                     useVNET = true,
                     resetStaticState = true,
                     useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array containing a negative value and zeros,
   * when maxMin4 is invoked for the sub-range [0,2],
   * then it should return the correct maximum and minimum values for that range,
   * and should not modify other elements of the input array.
   *
   * Requirement: REQ-MAXMIN-001 - compute max and min over a specified inclusive index range.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[4];
      intArray0[0] = -249;

      // When
      int[] intArray1 = MaxMin4.maxMin4(intArray0, 0, 2);

      // Then - verify original array contents remain as expected
      assertArrayEquals("Original array must remain unchanged except for set values",
                        new int[] {-249, 0, 0, 0}, intArray0);

      // Then - verify result is not null and has expected length
      assertNotNull("Result must not be null", intArray1);
      assertEquals("Result must contain exactly two values (max and min)", 2, intArray1.length);

      // Then - verify returned max and min are correct for indices 0..2
      assertArrayEquals("Returned max/min for indices [0..2] should be {max, min}",
                        new int[] {0, -249}, intArray1);

      // Additional boundary check: single-element range should return that element for both max and min
      int[] singleRange = MaxMin4.maxMin4(intArray0, 0, 0);
      assertArrayEquals("Single-element range should return the element as both max and min",
                        new int[] {-249, -249}, singleRange);
  }

  /**
   * Given a valid array and an invalid end index that is well beyond the array bounds,
   * when maxMin4 is invoked with that end index,
   * then an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: REQ-MAXMIN-002 - the method should throw ArrayIndexOutOfBoundsException for invalid range indices.
   */
  @Test(timeout = 4000, expected = ArrayIndexOutOfBoundsException.class)
  public void test1()  throws Throwable  {
      // Given
      int[] intArray0 = new int[7];
      intArray0[3] = 1;
      assertEquals("Precondition: array length must be 7", 7, intArray0.length);

      // When - then: expect ArrayIndexOutOfBoundsException due to an excessively large end index
      MaxMin4.maxMin4(intArray0, 0, 3425);
  }

  /**
   * Sanity and behavioral checks for MaxMin4 instance and method for multiple scenarios.
   *
   * Given an instance of MaxMin4 and several input arrays,
   * when maxMin4 is invoked with various ranges including single-element and uniform arrays,
   * then the method should return correct [max, min] pairs and should not mutate the input arrays.
   *
   * Requirement: REQ-MAXMIN-001, REQ-MAXMIN-003 - correctness across varied inputs including single-element and uniform arrays.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given - instance should be constructible
      MaxMin4 maxMin4_0 = new MaxMin4();
      assertNotNull("MaxMin4 instance must be created", maxMin4_0);

      // Scenario A: mixed positive values
      int[] arrA = new int[] {5, 3, 9, 1};
      int[] expectedA = new int[] {9, 1};
      int[] resultA = MaxMin4.maxMin4(arrA, 0, 3);
      assertArrayEquals("For [5,3,9,1] over full range expected max=9,min=1", expectedA, resultA);
      assertArrayEquals("Input array must not be mutated by maxMin4", new int[] {5,3,9,1}, arrA);

      // Scenario B: all equal (uniform) negative values
      int[] arrB = new int[] {-2, -2, -2};
      int[] expectedB = new int[] {-2, -2};
      int[] resultB = MaxMin4.maxMin4(arrB, 0, 2);
      assertArrayEquals("Uniform array should return the same value for both max and min", expectedB, resultB);
      assertArrayEquals("Input array must not be mutated by maxMin4", new int[] {-2,-2,-2}, arrB);

      // Scenario C: single-element array
      int[] arrC = new int[] {7};
      int[] expectedC = new int[] {7, 7};
      int[] resultC = MaxMin4.maxMin4(arrC, 0, 0);
      assertArrayEquals("Single-element array should return that element as both max and min", expectedC, resultC);
      assertArrayEquals("Input array must not be mutated by maxMin4", new int[] {7}, arrC);
  }
}