package ds.seed1448;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

// Marker interface for test categorization
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  @Before
  public void setUp() {
      // Setup placeholder - kept minimal to ensure test independence
  }

  @After
  public void tearDown() {
      // Cleanup placeholder
  }

  /**
   * Tests REQ-001: Verify Fibonacci iterative result for a large index.
   * Given a large index, when computing fibIter, then a deterministic 32-bit result is returned.
   */
  @Category(UnitTest.class)
  @Test(timeout = 4000)
  public void test0() throws Throwable {
      // Given: a large index
      // When: computing iterative Fibonacci
      int result = Fibonacci.fibIter(2322);
      // Then: the returned 32-bit int matches the expected value
      assertEquals("fibIter(2322) should return expected 32-bit value", -1595386344, result);
      // Additional sanity check documenting intent
      assertTrue("result should be within 32-bit integer bounds", result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE);
  }

  /**
   * Tests REQ-001: Fibonacci object construction
   * Given the default constructor, when constructing a Fibonacci instance, then the instance is not null.
   */
  @Category(UnitTest.class)
  @Test(timeout = 4000)
  public void test1() throws Throwable {
      // Given / When: construct
      Fibonacci fibonacci = new Fibonacci();
      // Then: instance should be created
      assertNotNull("Fibonacci instance should be constructed", fibonacci);
  }
}