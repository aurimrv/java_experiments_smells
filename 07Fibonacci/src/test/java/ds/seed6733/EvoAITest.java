package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

interface UnitTest {}

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
@Category(UnitTest.class)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  /**
   * REQ-FIB-001: Verify iterative Fibonacci computation for a large input.
   * Given a large integer input, when fibIter is invoked, then it returns the expected wrapped integer result.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(792);
      assertEquals((-489465568), int0);
  }

  /**
   * REQ-FIB-002: Construction contract for Fibonacci utility.
   * Given the Fibonacci class, constructing it should produce a non-null instance.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}