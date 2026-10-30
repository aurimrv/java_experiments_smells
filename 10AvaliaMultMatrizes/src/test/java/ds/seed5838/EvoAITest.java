package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /** REQ-001: multmatrize_givenSize_initializesArrayAndPreservesLength */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[12];
      AvaliaMultMatrizes.multmatrize(3, intArray0);
      assertEquals(12, intArray0.length);
  }

  /** REQ-002: constructor_createsInstance */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}