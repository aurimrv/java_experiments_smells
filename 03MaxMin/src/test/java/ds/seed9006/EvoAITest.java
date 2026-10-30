package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.util.Arrays;

/**
 * Marker interface for unit tests in this package.
 * (Required for @Category annotations used below.)
 */
interface UnitTest {}

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends MaxMin2_ESTest_scaffolding {

  /**
   * Requirement: MAXMIN-001
   * Given an array of length 8, when an extremely large index is requested,
   * then ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = (-249);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 2113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin2", e);
      }
  }

  /**
   * Requirement: MAXMIN-001 (variation)
   * Given an array of length 8 with a negative element value,
   * when an out-of-bounds large index is used, ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1);
      // Undeclared exception!
      try { 
        MaxMin2.maxMin2(intArray0, 2113);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin2", e);
      }
  }

  /**
   * Requirement: MAXMIN-002
   * Given a default-initialized array of length 5, when a large negative index is provided,
   * the method should return an array [0, 0] (expected min and max).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = MaxMin2.maxMin2(intArray0, (-3760));
      assertArrayEquals(new int[] {0, 0}, intArray1);
  }

  /**
   * Requirement: MAXMIN-000 (construction sanity)
   * Ensure that the MaxMin2 class can be instantiated.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaxMin2 maxMin2_0 = new MaxMin2();
  }
}