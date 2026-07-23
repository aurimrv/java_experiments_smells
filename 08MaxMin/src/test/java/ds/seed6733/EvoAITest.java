package ds.seed6733;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.MaxMin4;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests so tests can be categorized if required.
 */
interface UnitTest {}

/**
 * Improved test class for MaxMin4 based on generated tests.
 *
 * Notes:
 * - Tests retain their original names (test0, test1, test2) but have clearer
 *   intent, assertions, and messages.
 * - Both exceptional and happy-path behaviors are exercised.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin4_ESTest_scaffolding {

  /**
   * Given an array with a value set at index 2,
   * when maxMin4 is invoked with an end index far beyond the array bounds,
   * then an ArrayIndexOutOfBoundsException is expected and the original array
   * contents should remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[4];
      intArray0[2] = 1407;
      int[] snapshot = intArray0.clone();

      // When / Then
      try {
          MaxMin4.maxMin4(intArray0, 0, 2673);
          fail("Expected ArrayIndexOutOfBoundsException when end index is out of bounds");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Verify: exception occurred and array contents were not modified.
          assertArrayEquals("Array contents should be unchanged after the failing call", snapshot, intArray0);
      }
  }

  /**
   * Given an array with a large value at index 1,
   * when maxMin4 is invoked with an end index outside the array,
   * then an ArrayIndexOutOfBoundsException is expected and the array state remains intact.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      int[] intArray0 = new int[4];
      intArray0[1] = 2673;
      int[] snapshot = intArray0.clone();

      // When / Then
      try {
          MaxMin4.maxMin4(intArray0, 0, 2673);
          fail("Expected ArrayIndexOutOfBoundsException when end index is out of bounds");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Verify: exception occurred and array contents were not modified.
          assertArrayEquals("Array contents should be unchanged after the failing call", snapshot, intArray0);
      }
  }

  /**
   * Simple smoke test: construct MaxMin4 and invoke maxMin4 on a valid range.
   * Verifies that no exception is thrown for a well-formed input and that the
   * input array is not unexpectedly mutated by the call.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      MaxMin4 maxMin4_0 = new MaxMin4();
      int[] values = new int[] {3, 1, 4, 2};
      int[] before = values.clone();

      // When / Then
      try {
          // Call with valid start and end indices within array bounds.
          MaxMin4.maxMin4(values, 0, 3);
      } catch (Exception e) {
          fail("Did not expect any exception for valid input: " + e);
      }

      // Verify: the input array should remain the same unless the contract specifies mutation.
      assertArrayEquals("Input array should not be unexpectedly mutated by maxMin4", before, values);

      // Basic sanity checks about constructed object
      assertNotNull("Instance of MaxMin4 should be created", maxMin4_0);
  }
}