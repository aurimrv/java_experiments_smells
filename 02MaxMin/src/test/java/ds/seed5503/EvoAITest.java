package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for MaxMin1.
 *
 * Traceability:
 * - REQ-DS-001: compute min and max from integer arrays
 *
 * Notes:
 * - Tests include both happy-path and exceptional scenarios.
 * - Each test follows a Given-When-Then structure in comments.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  /**
   * Given: an integer array of length 7 with one negative element at index 2
   * When: calling maxMin1 with an index/length parameter that is far out-of-range
   * Then: ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[2] = (-316);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1966);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given: an integer array of length 7 with one positive element at index 1
   * When: calling maxMin1 with an index/length parameter that is far out-of-range
   * Then: ArrayIndexOutOfBoundsException is expected.
   *
   * Requirement: REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[1] = 134;
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 1966);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  /**
   * Given: an integer array of three zeros
   * When: computing min and max with parameter 2
   * Then: returned array should contain [0, 0] (min, max).
   *
   * Requirement: REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 2);
      assertArrayEquals(new int[] {0, 0}, intArray1);
  }

  /**
   * Given: the MaxMin1 implementation type
   * When: instantiating
   * Then: instance should be constructible and non-null.
   *
   * Requirement: REQ-DS-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}