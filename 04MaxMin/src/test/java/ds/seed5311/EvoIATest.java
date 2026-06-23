package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  private void expectArrayIndexOutOfBounds(int[] array, int index) {
    try {
      MaxMin3.maxMin3(array, index);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch(ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin3", e);
    }
  }

  private void expectNullPointerException(int[] array, int index) {
    try {
      MaxMin3.maxMin3(array, index);
      fail("Expecting exception: NullPointerException");
    } catch(NullPointerException e) {
      verifyException("ds.MaxMin3", e);
    }
  }

  private int[] createArray(int size) {
    return new int[size];
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[0];
      try {
        MaxMin3.maxMin3(intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[0];
      try {
        MaxMin3.maxMin3(intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[0];
      try {
        MaxMin3.maxMin3(intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[0];
      try {
        MaxMin3.maxMin3(intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = createArray(17);
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
      assertNotSame("Returned array should not be the same instance as input", intArray0, intArray1);
      assertEquals("Returned array length should match input", intArray0.length, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[0];
      try {
        MaxMin3.maxMin3(intArray0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      expectNullPointerException(null, 67);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
      assertNotNull("Instance should be created", maxMin3_0);
  }
}