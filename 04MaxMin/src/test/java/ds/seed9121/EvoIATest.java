package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends MaxMin3_ESTest_scaffolding {

  private int[] createArrayWithValue(int length, int index, int value) {
    int[] arr = new int[length];
    if (index >= 0 && index < length) {
      arr[index] = value;
    }
    return arr;
  }

  private void expectNullPointerExceptionForNullInput() {
    try {
      MaxMin3.maxMin3((int[]) null, 1);
      fail("Expecting exception: NullPointerException");
    } catch(NullPointerException e) {
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = createArrayWithValue(6, 5, 2988);
    try {
      MaxMin3.maxMin3(intArray0, 2988);
      fail("Expected ArrayIndexOutOfBoundsException due to invalid index access");
    } catch(ArrayIndexOutOfBoundsException e) {
      assertEquals("6", e.getMessage());
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = createArrayWithValue(6, 4, -2940);
    try {
      MaxMin3.maxMin3(intArray0, 342);
      fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
    } catch(ArrayIndexOutOfBoundsException e) {
      assertNotNull(e);
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    int[] intArray0 = createArrayWithValue(6, 2, 342);
    try {
      MaxMin3.maxMin3(intArray0, 342);
      fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
    } catch(ArrayIndexOutOfBoundsException e) {
      assertNotNull(e);
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    int[] intArray0 = createArrayWithValue(5, 3, -825);
    try {
      MaxMin3.maxMin3(intArray0, 18);
      fail("Expected ArrayIndexOutOfBoundsException due to invalid index");
    } catch(ArrayIndexOutOfBoundsException e) {
      assertNotNull(e);
      verifyException("ds.MaxMin3", e);
    }
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    int[] intArray0 = createArrayWithValue(2, 0, 1);
    int[] intArray1 = MaxMin3.maxMin3(intArray0, 0);
    assertNotNull("Result array should not be null", intArray1);
    assertEquals("Result array length should be 2", 2, intArray1.length);
    assertEquals("First element should be 1", 1, intArray1[0]);
    assertEquals("Second element should be 0", 0, intArray1[1]);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    expectNullPointerExceptionForNullInput();
  }

  @Test(timeout = 4000)
  public void test6() throws Throwable {
    MaxMin3 maxMin3_0 = new MaxMin3();
    assertNotNull("Object should be instantiated", maxMin3_0);
  }

}