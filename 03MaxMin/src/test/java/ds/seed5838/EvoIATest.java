package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin2_ESTest_scaffolding {

  private int[] createArrayWithValue(int size, int index, int value) {
    int[] arr = new int[size];
    arr[index] = value;
    return arr;
  }

  private int[] createEmptyArray(int size) {
    return new int[size];
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 0, 7);
    try {
      MaxMin2.maxMin2(intArray0, 3730);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 2, 604);
    try {
      MaxMin2.maxMin2(intArray0, 3730);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNotNull("Exception message should not be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createEmptyArray(8);
    int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
    assertEquals("Result array length should be 2", 2, intArray1.length);
    // Additional assertions could be added here to verify contents
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin2 maxMin2_0 = new MaxMin2();
    assertNotNull("Instance should be created", maxMin2_0);
  }
}