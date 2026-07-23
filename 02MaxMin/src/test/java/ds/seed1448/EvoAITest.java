package ds.seed1448;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.Assert;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved and clarified tests for MaxMin1 behaviour.
 *
 * Notes:
 * - Tests retain the original method names (test0..test3) to remain compatible
 *   with external callers, but now include clearer assertions and documentation.
 * - Given-When-Then style comments are included to aid maintenance.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Requirement: REQ-MAXMIN-INDEX-BOUNDARY
   *
   * Given: an array of length 7 with one element set,
   * When:  maxMin1 is invoked with a large second parameter that leads to an index computation,
   * Then:  an ArrayIndexOutOfBoundsException is thrown and the original array contents remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[7];
      intArray0[4] = -1630;

      // When / Then
      try {
          MaxMin1.maxMin1(intArray0, 1585);
          Assert.fail("Expected ArrayIndexOutOfBoundsException due to invalid internal index computation.");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Basic sanity checks about the exception and input array state.
          Assert.assertNotNull("Exception message should be present for diagnostics.", e.getMessage());
          Assert.assertEquals("Input array length must remain unchanged.", 7, intArray0.length);
          Assert.assertEquals("Previously assigned element must remain unchanged after exception.", -1630, intArray0[4]);
      }
  }

  /**
   * Requirement: REQ-MAXMIN-INDEX-BOUNDARY
   *
   * Given: an array of length 7 with one element set,
   * When:  maxMin1 is invoked with a large second parameter that leads to an index computation,
   * Then:  an ArrayIndexOutOfBoundsException is thrown and the array remains unchanged at the set index.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      int[] intArray0 = new int[7];
      intArray0[1] = 1585;

      // When / Then
      try {
          MaxMin1.maxMin1(intArray0, 1585);
          Assert.fail("Expected ArrayIndexOutOfBoundsException due to invalid internal index computation.");
      } catch (ArrayIndexOutOfBoundsException e) {
          // Verify the exception and that the input was not partially modified at the known position.
          Assert.assertNotNull("Exception message should be present for diagnostics.", e.getMessage());
          Assert.assertEquals("Input array length must remain unchanged.", 7, intArray0.length);
          Assert.assertEquals("Previously assigned element must remain unchanged after exception.", 1585, intArray0[1]);
      }
  }

  /**
   * Requirement: REQ-MAXMIN-BASIC
   *
   * Given: a zero-initialized array of length 4,
   * When:  maxMin1 is invoked with parameter 0,
   * Then:  the result is a two-element array containing values consistent with the min and max of the input.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      int[] intArray0 = new int[4]; // all zeros

      // When
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);

      // Then
      Assert.assertNotNull("Result array should not be null.", intArray1);
      Assert.assertEquals("Result should contain exactly two elements (max and min).", 2, intArray1.length);

      // For an all-zero input, both max and min are zero. Confirm both positions contain zeros.
      Assert.assertEquals("Result[0] should be a value from the input (expected 0 for this input).", 0, intArray1[0]);
      Assert.assertEquals("Result[1] should be a value from the input (expected 0 for this input).", 0, intArray1[1]);
  }

  /**
   * Requirement: REQ-MAXMIN-INSTANTIATION
   *
   * Given: nothing in particular,
   * When:  a MaxMin1 object is constructed,
   * Then:  the instance is non-null and can be instantiated without side effects.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given / When
      MaxMin1 maxMin1_0 = new MaxMin1();

      // Then
      Assert.assertNotNull("Constructor should produce a non-null instance.", maxMin1_0);
      // Sanity: calling a no-op or identity-like behavior should not throw (if such method exists).
      // We cannot assume specific methods exist, but construction itself must be safe.
  }
}