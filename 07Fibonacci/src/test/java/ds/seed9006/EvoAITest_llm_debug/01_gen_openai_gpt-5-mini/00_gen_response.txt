package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  /**
   * REQ-001: Verify basic Fibonacci iterative behavior for input 1
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(1);
      assertEquals(1, int0);
  }

  /**
   * REQ-002: Ensure Fibonacci constructor creates a valid instance
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}