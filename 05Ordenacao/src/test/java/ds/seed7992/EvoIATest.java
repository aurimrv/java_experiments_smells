package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      intArray0[0] = 1348;
      // Test boundary values: index 0 (min), 1 (max valid), 2 (just outside max)
      try {
          Ordenacao.ordena(intArray0, 0); // valid boundary
      } catch (Exception e) {
          fail("Should not throw exception for index 0");
      }
      try {
          Ordenacao.ordena(intArray0, 1); // valid boundary
      } catch (Exception e) {
          fail("Should not throw exception for index 1");
      }
      try {
          Ordenacao.ordena(intArray0, 2); // just outside boundary
          fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertNotNull("Exception message should not be null", e.getMessage());
      }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
      int[] intArray0 = new int[0];
      Ordenacao.ordena(intArray0, 0);
      assertArrayEquals(new int[] {}, intArray0);

      int[] intArray1 = new int[10];
      Ordenacao.ordena(intArray1, 0); // min boundary
      assertArrayEquals(new int[10], intArray1);

      int[] intArray2 = new int[10];
      Ordenacao.ordena(intArray2, 9); // max boundary
      assertArrayEquals(new int[10], intArray2);
  }


}