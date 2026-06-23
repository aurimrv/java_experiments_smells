package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends AvaliaMultMatrizes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      AvaliaMultMatrizes.multmatrize(6, intArray0);
      assertEquals("Array length should be 7", 7, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
      assertNotNull("Instance should be created", avaliaMultMatrizes0);
  }

}