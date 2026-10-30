package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /**
   * Test REQ-001: multmatrize_withMultiplier9_initializesArrayToZeros
   * Given an array of length 10
   * When multmatrize is invoked with multiplier 9
   * Then all elements must be zero
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[10];
      AvaliaMultMatrizes.multmatrize(9, intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * Test REQ-002: constructor_default_shouldCreateInstance
   * Verifies that constructing AvaliaMultMatrizes yields a non-null instance
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}