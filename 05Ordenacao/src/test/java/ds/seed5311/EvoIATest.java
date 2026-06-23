package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Ordenacao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[20];
      intArray0[0] = 388;
      Ordenacao.ordena(intArray0, 5);
      assertEquals("Array length should remain 20 after sorting", 20, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Ordenacao instance should be created", ordenacao0);
  }



}