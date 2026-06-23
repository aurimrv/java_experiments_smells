package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
      int[] intArray0 = new int[8];
      intArray0[0] = 7;
      // Test boundary index 0
      try {
          MaxMin1.maxMin1(intArray0, 0);
      } catch (Exception e) {
          fail("Should not throw exception for boundary index 0");
      }
      // Test boundary index array length - 1
      try {
          MaxMin1.maxMin1(intArray0, 7);
      } catch (Exception e) {
          fail("Should not throw exception for boundary index 7");
      }
      // Test just outside boundary index -1
      try {
          MaxMin1.maxMin1(intArray0, -1);
          fail("Expecting exception for index -1");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
      // Test just outside boundary index 8
      try {
          MaxMin1.maxMin1(intArray0, 8);
          fail("Expecting exception for index 8");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      int[] intArray0 = new int[8];
      intArray0[2] = 604;
      // Test boundary index 0
      try {
          MaxMin1.maxMin1(intArray0, 0);
      } catch (Exception e) {
          fail("Should not throw exception for boundary index 0");
      }
      // Test boundary index array length - 1
      try {
          MaxMin1.maxMin1(intArray0, 7);
      } catch (Exception e) {
          fail("Should not throw exception for boundary index 7");
      }
      // Test just outside boundary index -1
      try {
          MaxMin1.maxMin1(intArray0, -1);
          fail("Expecting exception for index -1");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
      // Test just outside boundary index 8
      try {
          MaxMin1.maxMin1(intArray0, 8);
          fail("Expecting exception for index 8");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
      int[] intArray0 = new int[8];
      // Test boundary index 0
      int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
      assertEquals("Returned array length should be 2", 2, intArray1.length);
      assertNotNull("Returned array should not be null", intArray1);
      // Test boundary index array length - 1
      int[] intArray2 = MaxMin1.maxMin1(intArray0, 7);
      assertEquals("Returned array length should be 2", 2, intArray2.length);
      // Test just outside boundary index -1 expecting exception
      try {
          MaxMin1.maxMin1(intArray0, -1);
          fail("Expecting exception for index -1");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
      // Test just outside boundary index 8 expecting exception
      try {
          MaxMin1.maxMin1(intArray0, 8);
          fail("Expecting exception for index 8");
      } catch (ArrayIndexOutOfBoundsException e) {
          // expected
      }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
      MaxMin1 maxMin1_0 = new MaxMin1();
      assertNotNull("Instance should be created", maxMin1_0);
      // Additional assertions on initial state could be added here
  }
}