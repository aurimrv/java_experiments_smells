package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Test: enqueue a single element and verify queue reports non-empty.
   *
   * Requirement: QUEUE-ENQ-001 - Enqueuing an element makes the queue non-empty.
   *
   * Given: an empty queue
   * When: an object is enqueued and imprime() is invoked
   * Then: the queue should no longer be empty
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
   * Test: dequeuing from an empty queue throws an Exception with expected origin.
   *
   * Requirement: QUEUE-DEC-001 - Dequeueing an empty queue must raise an Exception.
   *
   * Given: an empty queue
   * When: desenfileira() is invoked
   * Then: an Exception is thrown and the queue remains empty
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
   * Test: enqueuing then dequeuing returns the same object and restores emptiness.
   *
   * Requirement: QUEUE-ENQ-DEC-001 - An enqueued element should be returned by the subsequent dequeue.
   *
   * Given: an empty queue and an object
   * When: the object is enqueued then dequeued
   * Then: the dequeued object is the same instance and the queue is empty afterwards
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