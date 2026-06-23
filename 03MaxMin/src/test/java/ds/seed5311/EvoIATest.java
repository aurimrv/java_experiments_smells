package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.MaxMin2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin2_ESTest_scaffolding {

  private static final int[] BASE_ARRAY = new int[3];

  private int[] createTestArrayWithValueAtIndex(int index, int value) {
    int[] arr = BASE_ARRAY.clone();
    arr[index] = value;
    return arr;
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createTestArrayWithValueAtIndex(0, 253);
    // Test boundary index values
    try {
      MaxMin2.maxMin2(intArray0, 3); // index equal to array length (boundary)
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
    try {
      MaxMin2.maxMin2(intArray0, -1); // negative index (boundary)
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createTestArrayWithValueAtIndex(1, 3089);
    // Test boundary index values
    try {
      MaxMin2.maxMin2(intArray0, 3); // index equal to array length (boundary)
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
    try {
      MaxMin2.maxMin2(intArray0, -1); // negative index (boundary)
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      // expected
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = BASE_ARRAY.clone();
    // Test boundary index values
    int[] intArray1 = MaxMin2.maxMin2(intArray0, 0); // boundary index
    assertNotNull("Result should not be null", intArray1);
    assertEquals("Result length should be 2", 2, intArray1.length);
    assertEquals("First element should be 0", 0, intArray1[0]);
    assertEquals("Second element should be 0", 0, intArray1[1]);
    intArray1 = MaxMin2.maxMin2(intArray0, 2); // max valid index
    assertNotNull("Result should not be null", intArray1);
    assertEquals("Result length should be 2", 2, intArray1.length);
    assertEquals("First element should be 0", 0, intArray1[0]);
    assertEquals("Second element should be 0", 0, intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    MaxMin2 maxMin2_0 = new MaxMin2();
    assertNotNull("Instance should not be null", maxMin2_0);
    // Additional assertions verifying initial state can be added here
  }
}