package ds.seed9006;

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
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = 2;
      try {
          Ordenacao.mergeSort(intArray0, 0, 2144);
          fail("Expected ArrayIndexOutOfBoundsException due to invalid high index");
      } catch (ArrayIndexOutOfBoundsException e) {
          assertEquals("Index 2144 out of bounds for length 8", e.getMessage());
          verifyException("ds.Ordenacao", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
      assertNotNull("Ordenacao instance should not be null", ordenacao0);
  }

}