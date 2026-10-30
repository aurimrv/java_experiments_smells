/*
 * Cleaned version of originally generated test class. Improved readability, assertions, and structure while preserving original class EvoAITest and EvoRunner configuration.
 */
package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.AvaliaMultMatrizes;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.After;

  
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends AvaliaMultMatrizes_ESTest_scaffolding {

    private static final int TEST_ARRAY_LENGTH = 12;
    private int[] intArray0;

    @Before
    public void setUp() {
        // initialize fresh state for each test
        this.intArray0 = new int[TEST_ARRAY_LENGTH];
    }

    @After
    public void tearDown() {
        // explicit cleanup to avoid side effects
        this.intArray0 = null;
    }

    /**
     * REQ-001: Verify that multmatrize does not alter the array length for valid input.
     * Given-When-Then: Given a 12-length array, when multmatrize is invoked, then the array length remains 12.
     */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[12];
      AvaliaMultMatrizes.multmatrize(7, intArray0);
      assertEquals(12, intArray0.length);
  }

    /**
     * REQ-001: Construct AvaliaMultMatrizes and verify instance creation.
     * Given-When-Then: Given default parameters, when constructing AvaliaMultMatrizes, then an instance should be returned.
     */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AvaliaMultMatrizes avaliaMultMatrizes0 = new AvaliaMultMatrizes();
  }
}