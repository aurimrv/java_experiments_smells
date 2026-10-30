/*
 * (Simplified) Test class EvoAITest from generated EvoSuite output. Kept runner parameters as required.
 */

package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

  
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  /**
   * Test: single element ordering is moved to index 0 (smoke/happy path)
   * Traceability: REQ-ORDER-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-3127);
      Ordenacao.ordena(intArray0, 5);
      assertArrayEquals(new int[] {(-3127), 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * Smoke test for Ordenacao construction. Traceability: REQ-ORDER-000
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ordenacao ordenacao0 = new Ordenacao();
  }
}