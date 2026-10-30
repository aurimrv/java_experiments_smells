/*
 * Refined unit tests for AvaliaMultMatrizes (improvements applied to original generated tests)
 */
package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /**
   * REQ-001: multmatrize should fill a provided array for a valid size/factor.
   * Given-When-Then: Given a zero-initialized int array, when multmatrize is called, then the resulting array matches expected contents.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      final int LENGTH = 9;
      int[] intArray0 = new int[LENGTH];

      // When
      AvaliaMultMatrizes.multmatrize(7, intArray0);

      // Then - preserve original oracle values but add an explanatory message
      assertArrayEquals("multmatrize should produce the expected zero-filled array", new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  /**
   * REQ-002: constructor should create a usable instance of AvaliaMultMatrizes.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}