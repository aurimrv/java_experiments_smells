/*
 * Improved test class for ds.Fila, preserving original structure and oracles.
 */
package ds.seed9006;

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

  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue, when an element is enqueued and printed,
   * then the queue should no longer be empty.
   *
   * Requirement: REQ-FILA-ENQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When: enqueue a representative element and print the queue (no exception expected)
      fila0.enfileira("ds.Fila$Celula");
      fila0.imprime();

      // Then: the queue must not be empty after enqueuing that single element.
      assertFalse("After enfileira and imprime, expected fila not to be empty", fila0.vazia());
  }

  /**
   * Given an empty queue, when attempting to dequeue, an Exception is expected.
   *
   * Requirement: REQ-FILA-EMPTY-001
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
   * Given a queue with a single enqueued string, when dequeuing,
   * then the returned value must equal the originally enqueued string.
   *
   * Requirement: REQ-FILA-DEQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("ds.Fila$Celula");
      Object object0 = fila0.desenfileira();
      assertEquals("ds.Fila$Celula", object0);
  }
}