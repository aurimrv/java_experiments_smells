package ds.seed9121;

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
   * Tests REQ-FIB-001: verifies Fibonacci.fibIter returns expected integer for input 699.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(699);
      assertEquals(1805420098, int0);
  }

  /**
   * Tests REQ-FIB-INIT: Fibonacci default constructor should create an instance.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
  }
}