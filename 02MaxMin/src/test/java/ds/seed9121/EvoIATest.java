package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  private int[] createArrayWithValue(int length, int index, int value) {
    int[] arr = new int[length];
    if (index >= 0 && index < length) {
      arr[index] = value;
    }
    return arr;
  }

  private int[] createEmptyArray(int length) {
    return new int[length];
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(4, 1, -707);
    try {
      MaxMin1.maxMin1(intArray0, 735);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown due to invalid index");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(4, 3, 1411);
    try {
      MaxMin1.maxMin1(intArray0, 735);
      fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createEmptyArray(4);
    int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
    assertNotNull("Result array should not be null", intArray1);
    assertEquals("Expected result array length to be 2", 2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin1 maxMin1_0 = new MaxMin1();
    assertNotNull("Object should be created", maxMin1_0);
  }
}