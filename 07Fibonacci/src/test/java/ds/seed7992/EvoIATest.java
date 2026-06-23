package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Fibonacci;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fibonacci_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Fibonacci.fibIter(932);
      assertEquals("Fibonacci.fibIter(932) should return the expected value", (-1363039219), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fibonacci fibonacci0 = new Fibonacci();
      assertNotNull("Fibonacci instance should be created", fibonacci0);
  }

}