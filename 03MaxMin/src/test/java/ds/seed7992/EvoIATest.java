package ds.seed7992;

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
    if (index >= 0 && index < size) {
      arr[index] = value;
    }
    return arr;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 5, -2308);
    try {
      MaxMin2.maxMin2(intArray0, 1460);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown when index is out of bounds");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 0, -237);
    try {
      MaxMin2.maxMin2(intArray0, 1460);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown when index is out of bounds");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = new int[4];
    int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
    assertEquals("Returned array length should be 2", 2, intArray1.length);
    assertNotNull("Returned array should not be null", intArray1);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin2 maxMin2_0 = new MaxMin2();
    assertNotNull("Instance should be created", maxMin2_0);
  }

}