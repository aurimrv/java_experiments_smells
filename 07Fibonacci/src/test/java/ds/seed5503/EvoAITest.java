/*
 * Condensed/annotated version of originally EvoSuite-generated test class.
 * Improvements: clearer assertions messages, Given-When-Then comments, basic sanity assertions,
 * and minimal traceability comments. Preserves original class EvoAITest, RunWith and EvoRunnerParameters.
 */

package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

  
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  private static final int TEST_INDEX_LARGE = 418;

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(418);
      assertEquals(445769703, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}