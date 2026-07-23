package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

  /**
   * Tests REQ-001: multmatrize should preserve the input array length for normal inputs.
   * Given: an int[8]
   * When: multmatrize(4, array) is invoked
   * Then: array remains non-null and its length is unchanged
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      int[] intArray0 = new int[8];
      assertNotNull("Input array should not be null", intArray0);

      // When
      AvaliaMultMatrizes.multmatrize(4, intArray0);

      // Then
      assertEquals("Array length should remain 8 after multmatrize", 8, intArray0.length);
  }

  /**
   * Tests REQ-002: default constructor should create an instance
   * Given: default constructor
   * When: new AvaliaMultMatrizes()
   * Then: instance is non-null
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given & When
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();

      // Then
      assertNotNull("Constructor should produce a non-null instance", avaliaMultMatrizes0);
  }
}