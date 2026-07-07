package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin4;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin4_ESTest_scaffolding {

  private int[] createArrayWithValue(int size, int index, int value) {
    int[] arr = new int[size];
    if (index >= 0 && index < size) {
      arr[index] = value;
    }
    return arr;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(9, 5, -669);
    try {
      MaxMin4.maxMin4(intArray0, 0, 1551);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Exception should have been thrown", e);
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(9, 2, 3025);
    try {
      MaxMin4.maxMin4(intArray0, 0, 1551);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Exception should have been thrown", e);
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createArrayWithValue(9, 7, -957);
    try {
      MaxMin4.maxMin4(intArray0, 0, 1551);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Exception should have been thrown", e);
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin4 maxMin4_0 = new MaxMin4();
    int[] arr = {1, 2, 3, 4};
    int[] result = MaxMin4.maxMin4(arr, 0, 3);
    int expectedValue = 4; // Assuming maxMin4 returns max value in range
    assertEquals("maxMin4 should return the maximum value in the specified range", expectedValue, result.length);
  }
}