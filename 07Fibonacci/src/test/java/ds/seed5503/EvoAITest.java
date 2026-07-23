package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and cleaned unit tests for Fibonacci.
 * Note: kept original class EvoAITest and test method names as required.
 */
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  /**
   * Tests REQ-FIB-001: fibIter should compute the Fibonacci number for a given index.
   * Given-When-Then style comments added for clarity.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given: a large Fibonacci index
      final int index = 418;
      // When: computing iteratively
      int result = Fibonacci.fibIter(index);
      // Then: expected value is returned and basic properties hold
      assertEquals("fibIter(418) should return expected value", 445769703, result);
      assertTrue("Result should be non-negative", result >= 0);
  }

  /**
   * Tests REQ-FIB-000: Construction of Fibonacci instance.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
      // Given/When: construct a Fibonacci instance
      Fibonacci fibonacci0 = new Fibonacci();
      // Then: instance should be created and type should match
      assertNotNull("Fibonacci instance should be created", fibonacci0);
      assertEquals("Class should be ds.Fibonacci", "ds.Fibonacci", fibonacci0.getClass().getName());
  }
}