package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Improved tests for MaxMin1 focusing on clearer structure and stronger assertions.
 *
 * Traceability:
 * - REQ-INDEX-OUT-OF-RANGE: Behavior when index is outside array bounds.
 * - REQ-NEGATIVE-INDEX: Behavior when index is negative.
 * - REQ-DEFAULT-CONSTRUCTION: Class can be constructed.
 * - REQ-RETURN-FORMAT: Method returns an int[2] representing {max, min} as expected for valid inputs.
 */
interface UnitTest {}
interface RegressionTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category({UnitTest.class, RegressionTest.class})
public class EvoAITest extends MaxMin1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = (-249);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 2113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      // Undeclared exception!
      try { 
        MaxMin1.maxMin1(intArray0, 2113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = MaxMin1.maxMin1(intArray0, (-3760));
      assertArrayEquals(new int[] {0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin1 maxMin1_0 = new MaxMin1();
  }
}