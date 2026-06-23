package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  private void expectArrayIndexOutOfBounds(int[] arr, int index) {
    try {
      MaxMin1.maxMin1(arr, index);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch(ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin1", e);
    }
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[8];
    intArray0[1] = -249;
    // Test boundary index 7 (max valid index)
    int[] result = MaxMin1.maxMin1(intArray0, 7);
    assertNotNull("Result should not be null", result);
    // Test just outside boundary index 8
    expectArrayIndexOutOfBounds(intArray0, 8);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = new int[8];
    intArray0[0] = -1;
    // Test boundary index 7 (max valid index)
    int[] result = MaxMin1.maxMin1(intArray0, 7);
    assertNotNull("Result should not be null", result);
    // Test just outside boundary index 8
    expectArrayIndexOutOfBounds(intArray0, 8);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[5];
    // Test boundary index 0
    int[] result0 = MaxMin1.maxMin1(intArray0, 0);
    assertNotNull("Result should not be null", result0);
    // Test boundary index 4 (max valid index)
    int[] resultMax = MaxMin1.maxMin1(intArray0, 4);
    assertNotNull("Result should not be null", resultMax);
    // Test just outside boundary index -1
    try {
      MaxMin1.maxMin1(intArray0, -1);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch(ArrayIndexOutOfBoundsException e) {
      verifyException("ds.MaxMin1", e);
    }
    // Normal case
    int[] intArray1 = MaxMin1.maxMin1(intArray0, -3760);
    assertArrayEquals("Expected min and max to be zero for empty input", new int[] {0, 0}, intArray1);
  }


}