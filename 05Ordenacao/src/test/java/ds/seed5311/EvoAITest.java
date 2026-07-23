package ds.seed5311;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import ds.Ordenacao;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Tests for Ordenacao (traceable to REQ-001)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Ordenacao_ESTest_scaffolding {

  @Before
  public void setUp() {
    // setup if needed; keep tests independent and deterministic
  }

  @After
  public void tearDown() {
    // cleanup if needed
  }

  /**
   * test0: REQ-001 - given an array with a single inserted value, when sorted, the array length is preserved and the value remains present
   * Given-When-Then structured comments are included for clarity.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given: an array of length 20 with first element 388
      int[] intArray0 = new int[20];
      intArray0[0] = 388;
      // When: the array is sorted with parameter 5
      Ordenacao.ordena(intArray0, 5);
      // Then: array should be non-null, length preserved, and should contain the value 388
      assertNotNull("Array should not be null after sorting", intArray0);
      assertEquals("Array length should remain unchanged after sorting", 20, intArray0.length);
      boolean found = false;
      for (int v : intArray0) { if (v == 388) { found = true; break; } }
      assertTrue("Sorted array should contain the previously inserted value 388", found);
      // boundary check: last index accessible
      int last = intArray0[intArray0.length - 1];
      assertTrue("Last element index should be accessible and non-negative", last >= 0);
  }

  /**
   * test1: REQ-001 - ensure Ordenacao can be instantiated and is non-null
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
      // Given: need to instantiate Ordenacao
      // When: default constructor invoked
      Ordenacao ordenacao0 = new Ordenacao();
      // Then: instance must not be null
      assertNotNull("Constructor should produce a non-null instance", ordenacao0);
  }
}