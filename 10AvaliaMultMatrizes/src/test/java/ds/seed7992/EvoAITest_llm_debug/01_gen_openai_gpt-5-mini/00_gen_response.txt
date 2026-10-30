package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /**
   * Given an initialized integer array, when multmatrize is invoked,
   * then the array reference should remain non-null and its length should be preserved.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      AvaliaMultMatrizes.multmatrize(8, intArray0);
      assertEquals(9, intArray0.length);
  }

  /**
   * Verifies that the AvaliaMultMatrizes constructor creates a usable instance.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}