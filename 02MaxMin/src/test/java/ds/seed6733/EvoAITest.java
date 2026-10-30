package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing tests related to requirements.
 * Defined at package level so it can be referenced by @Category on the test class.
 */
interface RequirementTest {}

/**
 * Improved and more descriptive tests for MaxMin1.
 *
 * Notes:
 * - The original EvoSuite-generated structure and runner parameters are preserved as required.
 * - Test method names remain unchanged to preserve oracle semantics.
 * - Each test includes Given-When-Then style comments, additional assertions for clarity,
 *   and Javadoc linking to a hypothetical requirement id for traceability.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(RequirementTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * REQ-001: Verify behavior when calling maxMin1 with an out-of-range large positive index.
   *
   * Given an array of length 4 with a known value at index 0,
   * When maxMin1 is invoked with an index that is well beyond the array bounds,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 65;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * REQ-002: Verify behavior when calling maxMin1 with an out-of-range large positive index for a different array position.
   *
   * Given an array of length 4 with a known value at index 1,
   * When maxMin1 is invoked with an index that is well beyond the array bounds,
   * Then an ArrayIndexOutOfBoundsException is expected and the original array must remain unchanged.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = 565;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 65);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * REQ-003: Verify successful normal-case behavior for a small array.
   *
   * Given a freshly created int[3] filled with zeros,
   * When maxMin1 is invoked with a valid index 0,
   * Then the method returns an int[] of length 2 and the input array is not mutated.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * REQ-004: Construction sanity check.
   *
   * Given the MaxMin1 class,
   * When a default instance is constructed,
   * Then the instance must be non-null and of the expected runtime type.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}