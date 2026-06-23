package ds.seed6733;

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
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-3127);
      Ordenacao.ordena(intArray0, 5);
      assertNotNull("Array should not be null", intArray0);
      assertEquals("Array length should be 8", 8, intArray0.length);
      assertEquals("Element at index 0 should be -3127", -3127, intArray0[0]);
      for (int i = 1; i < intArray0.length; i++) {
          assertEquals("Element at index " + i + " should be 0", 0, intArray0[i]);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Ordenacao instance should not be null", ordenacao0);
  }

}