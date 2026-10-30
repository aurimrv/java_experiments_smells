package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for Fibonacci.
 * Requirement: REQ-001 - verify Fibonacci iteration behavior.
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(699);
      assertEquals(1805420098, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Arrange-Act: constructing Fibonacci instance to ensure no exceptions on init
      Fibonacci fibonacci0 = new Fibonacci();
  }
}