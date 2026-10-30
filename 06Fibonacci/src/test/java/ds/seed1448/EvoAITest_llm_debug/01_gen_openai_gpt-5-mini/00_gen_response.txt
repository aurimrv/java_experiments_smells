/*
 * Refactored and improved test class EvoAITest readability and maintainability.
 * Preserves original RunWith and EvoRunnerParameters annotations as required.
 */
package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

// Marker interface for categorization (kept local per guidelines)
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fibonacci_ESTest_scaffolding {

  /**
   * Given a large input, when fibIter is invoked, then the (int) result matches the previously observed value.
   * Preserves original expected literal (-1595386344) to maintain oracle preservation.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(2322);
      assertEquals((-1595386344), int0);
  }

  /**
   * Given no special preconditions, when the Fibonacci constructor is invoked, then an instance should be created.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}