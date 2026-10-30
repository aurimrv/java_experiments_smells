package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit test category marker for grouping.
 */
interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends MaxMin3_ESTest_scaffolding {

  /**
   * Given an array of length 4 with some negative values,
   * when maxMin3 is invoked with a vastly out-of-range index,
   * then ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-1);
      intArray0[1] = (-2724);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 890);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 8 with some values,
   * when maxMin3 is invoked with an index that is larger than the array length,
   * then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2;
      intArray0[1] = 1658;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1658);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 6 with a negative value set,
   * when maxMin3 is invoked with an out-of-range index,
   * then ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = (-1);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1970);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 8 with some positions set,
   * when maxMin3 is invoked with an out-of-range index,
   * then an ArrayIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 2;
      intArray0[4] = 2;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1658);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given an array of length 8 with one element set,
   * when maxMin3 is invoked with a large index,
   * then ArrayIndexOutOfBoundsException should be thrown.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = 2;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1658);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  /**
   * Given a small array and a valid index,
   * when maxMin3 is invoked,
   * then it should return the expected [max, min] pair.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1406;
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
      assertArrayEquals(new int[] {1406, 0}, intArray1);
  }

  /**
   * Given a zero-initialized array of length 4 and a valid index,
   * when maxMin3 is invoked,
   * then it should return [0,0] since all elements are zero.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 1);
      assertArrayEquals(new int[] {0, 0}, intArray1);
  }

  /**
   * Simple construction test: ensure MaxMin3 can be instantiated.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}