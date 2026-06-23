package ds.seed9121;

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

  private int[] createArray(int size) {
    return new int[size];
  }

  private MaxMin2 createMaxMin2() {
    return new MaxMin2();
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(4, 1, -707);
    try {
      MaxMin2.maxMin2(intArray0, 735);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(4, 3, 1411);
    try {
      MaxMin2.maxMin2(intArray0, 735);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createArray(4);
    int[] intArray1 = MaxMin2.maxMin2(intArray0, 0);
    assertEquals("Result array length should be 2", 2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin2 maxMin2_0 = createMaxMin2();
    int[] input = new int[] {1, 2, 3};
    int[] result = maxMin2_0.maxMin2(input, 1);
    assertNotNull("Result should not be null", result);
    assertEquals("Result length should be 2", 2, result.length);
  }

}