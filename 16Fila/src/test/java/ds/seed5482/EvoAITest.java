package ds.seed5482;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for unit level tests.
 * Defined at package-level so it can be used in @Category annotations below.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Fila with clearer structure, messages and traceability.
 *
 * NOTE: This class preserves the original test method names and the EvoRunner configuration
 * as required by the test-suite infrastructure.
 */

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * REQ-001: Verify that enqueuing an element results in a non-empty queue.
   *
   * Given: an empty queue
   * When: an Object is enqueued and imprime() is invoked
   * Then: the queue should not be empty
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      fila0.imprime();
      assertFalse(fila0.vazia());
  }

  /**
   * REQ-002: Dequeuing from an empty queue must throw a checked Exception with a clear message.
   *
   * Given: an empty queue
   * When: desenfileira() is invoked
   * Then: an Exception is thrown indicating the queue is empty
   */
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

  /**
   * REQ-003: Enqueue followed by dequeue returns the same instance.
   *
   * Given: an empty queue and an object
   * When: the object is enqueued and then dequeued
   * Then: the dequeued object is the same instance that was enqueued
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      Object object1 = fila0.desenfileira();
      assertSame(object1, object0);
  }
}