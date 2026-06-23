package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Fibonacci_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(1);
      assertEquals("Fibonacci of 1 should be 1", 1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
      assertNotNull("Fibonacci instance should be created", fibonacci0);
  }

}