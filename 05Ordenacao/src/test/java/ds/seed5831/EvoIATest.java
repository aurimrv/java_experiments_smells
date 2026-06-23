package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    int[] intArray0 = new int[2];
    intArray0[0] = 1173;
    // Test boundary values and exception for invalid index
    Ordenacao.ordena(intArray0, 0); // valid boundary
    Ordenacao.ordena(intArray0, 1); // valid boundary
    try {
      Ordenacao.ordena(intArray0, 2); // out of bounds
      fail("Expecting exception: ArrayIndexOutOfBoundsException");
    } catch (ArrayIndexOutOfBoundsException e) {
      assertNull("Exception message should be null", e.getMessage());
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    int[] intArray0 = new int[0];
    Ordenacao.ordena(intArray0, 0);
    assertArrayEquals("Empty array should remain empty", new int[] {}, intArray0);

    int[] intArray1 = new int[1];
    intArray1[0] = 5;
    Ordenacao.ordena(intArray1, 0);
    assertArrayEquals("Single element array should remain unchanged", new int[] {5}, intArray1);

    int[] intArray2 = new int[8];
    Ordenacao.ordena(intArray2, 2);
    assertNotNull(intArray2);
    assertEquals(8, intArray2.length);
    assertArrayEquals("Array should remain zeros after sorting", new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray2);
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Test constructor creates non-null instance
    Ordenacao ordenacao0 = new Ordenacao();
    assertNotNull("Ordenacao instance should not be null", ordenacao0);
  }

}