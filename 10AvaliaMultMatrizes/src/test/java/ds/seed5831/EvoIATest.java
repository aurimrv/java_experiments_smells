package ds.seed5831;

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
      int[] intArray0 = new int[9];
      AvaliaMultMatrizes.multmatrize(3, intArray0);
      assertNotNull("Result array should not be null", intArray0);
      assertEquals("Array length should be 9", 9, intArray0.length);
      for (int value : intArray0) {
          assertEquals("Each element should be zero", 0, value);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
      assertNotNull("Instance should be created", avaliaMultMatrizes0);
  }

}