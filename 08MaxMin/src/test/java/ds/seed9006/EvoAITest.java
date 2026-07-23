package ds.seed9006;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.MaxMin4;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for MaxMin4 behavior.
 *
 * Requirement trace: REQ-MAXMIN-001 - maxMin4 must validate indices and operate on ranges without losing elements.
 *
 * Tests follow Given-When-Then structure and include both error-case and happy-path coverage.
 */
interface UnitTest {}

public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array and an out-of-range end index,
   * When maxMin4 is invoked,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   *
   * REQ-MAXMIN-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
      // Given
      int[] intArray0 = new int[6];
      intArray0[2] = -3009;
      int[] before = intArray0.clone();

      // When / Then
      try {
          MaxMin4.maxMin4(intArray0, 0, 1442);
          fail("Expected ArrayIndexOutOfBoundsException when end index is out of bounds");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Then: ensure the input array was not modified by the failing call
          assertArrayEquals("Input array must remain unchanged when an out-of-range index is used", before, intArray0);
      }
  }

  /**
   * Given an array with a small mutation and an out-of-range end index,
   * When maxMin4 is invoked,
   * Then an ArrayIndexOutOfBoundsException is expected and the input array must remain unchanged.
   *
   * REQ-MAXMIN-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
      // Given
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
      int[] before = intArray0.clone();

      // When / Then
      try {
          MaxMin4.maxMin4(intArray0, 0, 1442);
          fail("Expected ArrayIndexOutOfBoundsException when end index is out of bounds");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Then: ensure the input array was not modified by the failing call
          assertArrayEquals("Input array must remain unchanged when an out-of-range index is used", before, intArray0);
      }
  }

  /**
   * Given a valid 4-element range,
   * When maxMin4 is invoked with valid indices,
   * Then the call should complete without throwing and should preserve the multiset of elements.
   *
   * REQ-MAXMIN-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
      // Given
      MaxMin4 maxMin4_0 = new MaxMin4();
      int[] arr = new int[] {4, 1, 3, 2};
      int[] before = arr.clone();

      // When
      try {
          MaxMin4.maxMin4(arr, 0, 3);
      } catch (Exception e) {
          fail("Did not expect any exception for valid indices: " + e);
      }

      // Then: basic sanity checks
      assertNotNull("MaxMin4 instance should be created", maxMin4_0);
      assertEquals("Array length should remain the same after operation", before.length, arr.length);

      int[] sortedBefore = before.clone();
      int[] sortedAfter = arr.clone();
      java.util.Arrays.sort(sortedBefore);
      java.util.Arrays.sort(sortedAfter);
      assertArrayEquals("Operation must preserve the multiset of elements in the specified range", sortedBefore, sortedAfter);
  }
}