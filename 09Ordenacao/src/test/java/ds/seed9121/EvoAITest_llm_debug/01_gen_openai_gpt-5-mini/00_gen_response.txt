/*
 * Unit tests for ds.seed9121. Improved from EvoSuite-generated baseline.
 */

package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Tests mergeSort with an invalid high index (REQ-001: mergeSort boundary checks)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[5] = (-569);
      // Undeclared exception!
      try { 
        Ordenacao.mergeSort(intArray0, 2, 1681);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.Ordenacao", e);
      }
  }

  /**
   * test1: constructor_returnsInstance (REQ-002)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}