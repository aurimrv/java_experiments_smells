package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[3] = 998;
      // Test boundary index 3 (max valid index)
      int[] result = MaxMin3.maxMin3(intArray0, 3);
      assertNotNull(result);

      // Test boundary index 0 (min valid index)
      int[] resultMin = MaxMin3.maxMin3(intArray0, 0);
      assertNotNull(resultMin);

      // Test just outside boundary index 4 (should throw)
      try {
        MaxMin3.maxMin3(intArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[4] = (-4243);
      // Test boundary index 7 (max valid index)
      int[] result = MaxMin3.maxMin3(intArray0, 7);
      assertNotNull(result);

      // Test boundary index 0 (min valid index)
      int[] resultMin = MaxMin3.maxMin3(intArray0, 0);
      assertNotNull(resultMin);

      // Test just outside boundary index 8 (should throw)
      try {
        MaxMin3.maxMin3(intArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[7] = (-3074);
      // Test boundary index 7 (max valid index)
      int[] result = MaxMin3.maxMin3(intArray0, 7);
      assertNotNull(result);

      // Test boundary index 0 (min valid index)
      int[] resultMin = MaxMin3.maxMin3(intArray0, 0);
      assertNotNull(resultMin);

      // Test just outside boundary index 8 (should throw)
      try {
        MaxMin3.maxMin3(intArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 1423;
      // Test boundary index 5 (max valid index)
      int[] result = MaxMin3.maxMin3(intArray0, 5);
      assertNotNull(result);

      // Test boundary index 0 (min valid index)
      int[] resultMin = MaxMin3.maxMin3(intArray0, 0);
      assertNotNull(resultMin);

      // Test just outside boundary index 6 (should throw)
      try {
        MaxMin3.maxMin3(intArray0, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[1] = (-649);
      // Test boundary index 0
      int[] resultMin = MaxMin3.maxMin3(intArray0, 0);
      assertNotNull(resultMin);

      // Test boundary index 3 (max valid index)
      int[] resultMax = MaxMin3.maxMin3(intArray0, 3);
      assertNotNull(resultMax);

      // Test empty array
      int[] emptyArray = new int[0];
      try {
        MaxMin3.maxMin3(emptyArray, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 1);
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
      assertNotNull(maxMin3_0);
  }

}