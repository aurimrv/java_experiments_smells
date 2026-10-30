package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved and documented tests for MaxMin1.
 *
 * Note: This class preserves the original test method names and the EvoRunner
 * configuration required by the test environment.
 */
 
 
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given an array of length 7, when maxMin1 is invoked with a wildly out-of-range index,
   * then an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement trace: REQ-045 (index validation)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[4] = (-1630);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given an array of length 7 with a large positive value at index 1,
   * when maxMin1 is invoked with an index far outside the array bounds,
   * then an ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement trace: REQ-045 (index validation)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 1585;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1585);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given a zero-initialized array of length 4, when maxMin1 is invoked with index 0,
   * then a non-null result array of length 2 is returned (contract preserved).
   *
   * Requirement trace: REQ-012 (result shape)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals(2, intArray1.length);
  }

  /**
   * Sanity check: constructing the MaxMin1 helper object.
   *
   * Rationale: explicit constructor existence and basic instantiation behavior.
   * Requirement trace: REQ-000 (construction)
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}