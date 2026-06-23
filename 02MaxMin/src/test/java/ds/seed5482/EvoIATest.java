package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin1;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin1_ESTest_scaffolding {

  private int[] createTestArrayForTest0() {
    int[] arr = new int[8];
    arr[3] = -1690;
    return arr;
  }

  private int[] createTestArrayForTest1() {
    int[] arr = new int[8];
    arr[6] = 3;
    return arr;
  }

  private int[] createDefaultArray() {
    return new int[8];
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createTestArrayForTest0();
    try {
      MaxMin1.maxMin1(intArray0, 1919);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown due to invalid index");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createTestArrayForTest1();
    try {
      MaxMin1.maxMin1(intArray0, 1919);
      fail("Expected ArrayIndexOutOfBoundsException to be thrown due to invalid index");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createDefaultArray();
    int[] intArray1 = MaxMin1.maxMin1(intArray0, 0);
    assertNotNull("Returned array should not be null", intArray1);
    assertEquals("Returned array length should be 2", 2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin1 maxMin1_0 = new MaxMin1();
    assertNotNull("Instance should be created", maxMin1_0);
  }
}