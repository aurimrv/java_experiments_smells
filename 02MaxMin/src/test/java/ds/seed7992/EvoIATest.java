package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  private int[] createArrayWithValue(int size, int index, int value) {
    int[] arr = new int[size];
    if (index >= 0 && index < size) {
      arr[index] = value;
    }
    return arr;
  }

  private int[] createArray(int size) {
    return new int[size];
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 5, -2308);
    try {
      MaxMin1.maxMin1(intArray0, 1460);
      fail("Expected ArrayIndexOutOfBoundsException was not thrown");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(8, 0, -237);
    try {
      MaxMin1.maxMin1(intArray0, 1460);
      fail("Expected ArrayIndexOutOfBoundsException was not thrown");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createArray(4);
    int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
    assertEquals("Result array length should be 2", 2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin1 maxMin1_0 = new MaxMin1();
    assertNotNull("Instance should be created", maxMin1_0);
  }

}