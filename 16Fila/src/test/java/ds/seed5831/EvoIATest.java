package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      assertFalse("Queue should not be empty after enqueuing an element", fila0.vazia());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Fila fila0 = new Fila();
      try { 
        fila0.desenfileira();
        fail("Expecting exception: Exception");
      } catch(Exception e) {
         //
         // Erro: A fila esta vazia
         //
         verifyException("ds.Fila", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      Object object1 = fila0.desenfileira();
      assertSame("Dequeued object should be the same as enqueued", object1, object0);
      // Additional assertions could verify queue is empty after dequeue for better fault detection
  }
}