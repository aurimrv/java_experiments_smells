package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  /**
   * REQ-001: Tests Fibonacci.fibIter with a large input (traceability: REQ-001)
   * Given a large integer input
   * When fibIter is invoked
   * Then it returns the expected 32-bit int result
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(932);
      assertEquals((-1363039219), int0);
  }

  /**
   * REQ-002: Ensure Fibonacci can be constructed without throwing (traceability: REQ-002)
   * Given default construction
   * When new Fibonacci() is invoked
   * Then no exception should be thrown
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}