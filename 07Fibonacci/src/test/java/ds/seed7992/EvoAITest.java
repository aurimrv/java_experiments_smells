package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Fibonacci (traceability: REQ-001)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a large Fibonacci index
    int index = 932;
    // When: computing Fibonacci iteratively
    int int0 = Fibonacci.fibIter(index);
    // Then: verify expected value with descriptive messages and an additional invariant check
    assertEquals("REQ-001: fibIter(932) should match expected overflowed int", -1363039219, int0);
    assertTrue("Result should be non-zero (overflow characteristic)", int0 != 0);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: no special setup
    // When: constructing a Fibonacci instance
    Fibonacci fibonacci0 = new Fibonacci();
    // Then: verify instance created successfully
    assertNotNull("REQ-001: constructor should instantiate Fibonacci", fibonacci0);
  }
}