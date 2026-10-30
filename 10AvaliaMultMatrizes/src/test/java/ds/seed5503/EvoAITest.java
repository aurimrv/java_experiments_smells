/*
 * Hand-maintained improvements applied to automatically generated tests.
 */
package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /**
   * REQ-001: multmatrize_withValidInput_preservesArrayLength
   * Given a non-null array of length 7, when multmatrize is invoked with valid parameters,
   * then the array reference should remain non-null and its length should be preserved.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      AvaliaMultMatrizes.multmatrize(4, intArray0);
      assertEquals(7, intArray0.length);
  }

  /**
   * REQ-002: constructor_createsInstance_whenCalled
   * Given default conditions, constructing AvaliaMultMatrizes should succeed and yield a usable object.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}