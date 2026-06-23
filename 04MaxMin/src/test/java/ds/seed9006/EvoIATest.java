package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  private void expectArrayIndexOutOfBounds(int[] arr, int index) {
    try {
      MaxMin3.maxMin3(arr, index);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[3] = 3986;
    expectArrayIndexOutOfBounds(intArray0, 1996);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[2] = -198;
    expectArrayIndexOutOfBounds(intArray0, 1540);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[7];
    intArray0[2] = 1193;
    expectArrayIndexOutOfBounds(intArray0, 58);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    int[] intArray0 = new int[6];
    intArray0[5] = -693;
    expectArrayIndexOutOfBounds(intArray0, 1996);
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    int[] intArray0 = new int[9];
    intArray0[0] = -1;
    int[] intArray1 = MaxMin3.maxMin3(intArray0, -488);
    int[] intArray2 = MaxMin3.maxMin3(intArray1, 0);
    assertArrayEquals("Result array should match expected values", new int[] {0, -1}, intArray2);
    assertEquals("Result length should be 2", 2, intArray2.length);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    int[] intArray0 = new int[9];
    expectArrayIndexOutOfBounds(intArray0, 1975);
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
    MaxMin3 maxMin3_0 = new MaxMin3();
    assertNotNull("Instance should not be null", maxMin3_0);
  }
}