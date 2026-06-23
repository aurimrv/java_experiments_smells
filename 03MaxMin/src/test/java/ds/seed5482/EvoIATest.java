package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin2_ESTest_scaffolding {

  private int[] createArrayWithValue(int length, int index, int value) {
    int[] arr = new int[length];
    arr[index] = value;
    return arr;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 3, -1690);
    try {
      MaxMin2.maxMin2(intArray0, 1919);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 6, 3);
    try {
      MaxMin2.maxMin2(intArray0, 1919);
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }



}