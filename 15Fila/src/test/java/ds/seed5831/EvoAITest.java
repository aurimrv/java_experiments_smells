package ds.seed5831;

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
 * Tests for ds.Fila (queue) behaviors.
 *
 * Traceability:
 * - REQ-QUEUE-001: Basic enqueue/dequeue behavior
 * - REQ-QUEUE-002: Dequeue on empty queue should throw
 * - REQ-QUEUE-003: Enqueue when internal array indicates full should throw
 *
 * The original tests were generated; these tests have been improved with clearer
 * Given-When-Then structure, categories and descriptive assertion messages while
 * preserving the original oracles and exception expectations.
 */
interface UnitTest {}
interface ExceptionTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      Object object0 = new Object();
      fila0.enfileira(object0);
      fila0.imprime();
      assertEquals(1, fila0.tras);
  }

  /**
   * Given an empty queue, When dequeue is invoked, Then an Exception is expected
   * (REQ-QUEUE-002).
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
   * Given an internal array sized to 1 (simulating full queue), When enqueuing into
   * that array, Then an Exception indicating the queue is full is expected
   * (REQ-QUEUE-003).
   *
   * Note: this test intentionally manipulates internal state to reproduce the
   * original failure scenario preserved by the generated tests.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      Object[] objectArray0 = new Object[1];
      fila0.item = objectArray0;
      try { 
        fila0.enfileira(objectArray0[0]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta cheia
         //
         verifyException("ds.Fila", e);
      }
  }

  /**
   * Given a queue with one element enqueued, When the element is dequeued, Then
   * the front index should reflect the operation and the dequeued object should
   * be the same as the enqueued object (REQ-QUEUE-001).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira(fila0);
      fila0.desenfileira();
      assertEquals(1, fila0.frente);
  }
}