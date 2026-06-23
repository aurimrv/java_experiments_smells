package ds.seed5838;

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
      intArray0[3] = 1;
      // Test boundary index 0
      MaxMin3.maxMin3(intArray0, 0);
      // Test boundary index 3
      MaxMin3.maxMin3(intArray0, 3);
      // Test just outside boundary index 4 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        assertNotNull("Exception should not be null", e);
        assertTrue("Exception message should contain index", e.getMessage().contains("4"));
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[6] = (-737);
      // Test boundary indices 0 and 7
      MaxMin3.maxMin3(intArray0, 0);
      MaxMin3.maxMin3(intArray0, 7);
      // Test just outside boundary index 8 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        assertNotNull("Exception should not be null", e);
        assertTrue("Exception message should contain index", e.getMessage().contains("8"));
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = 2633;
      // Test boundary indices 0 and 7
      MaxMin3.maxMin3(intArray0, 0);
      MaxMin3.maxMin3(intArray0, 7);
      // Test just outside boundary index 8 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        assertNotNull("Exception should not be null", e);
        assertTrue("Exception message should contain index", e.getMessage().contains("8"));
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      intArray0[3] = (-305);
      // Test boundary indices 0 and 4
      MaxMin3.maxMin3(intArray0, 0);
      MaxMin3.maxMin3(intArray0, 4);
      // Test just outside boundary index 5 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        assertNotNull("Exception should not be null", e);
        assertTrue("Exception message should contain index", e.getMessage().contains("5"));
        verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 401;
      // Test boundary indices 0 and 3
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
      int[] intArray2 = MaxMin3.maxMin3(intArray0, 3);
      // Test just outside boundary index 4 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
      assertNotNull("Result array should not be null", intArray1);
      assertEquals("Result array length should be 2", 2, intArray1.length);
      assertEquals("Max value should be 401", 401, intArray1[0]);
      assertEquals("Min value should be 0", 0, intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Test boundary indices 0 and 1
      int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
      int[] intArray2 = MaxMin3.maxMin3(intArray0, 1);
      // Test just outside boundary index 2 expecting exception
      try {
        MaxMin3.maxMin3(intArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
        verifyException("ds.MaxMin3", e);
      }
      assertNotNull("Result array should not be null", intArray1);
      assertEquals("Result array length should be 2", 2, intArray1.length);
      assertEquals("Max value should be 0", 0, intArray1[0]);
      assertEquals("Min value should be 0", 0, intArray1[1]);
  }


}