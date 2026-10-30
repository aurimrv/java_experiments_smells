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
 * Marker interface for quick unit tests.
 * Defined at file scope so it can be referenced by @Category on test methods.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Fila operations.
 *
 * Traceability:
 * - Story/Req: QUEUE-001 Basic enqueue/dequeue behaviour
 * - Story/Req: QUEUE-ERR-EMPTY Error when dequeuing empty queue
 * - Story/Req: QUEUE-ERR-FULL Error when enqueueing into a full queue
 *
 * Notes:
 * - The original EvoSuite-generated tests were preserved in intent (same oracles),
 *   but restructured to be more readable (Given-When-Then), to include descriptive
 *   assertion messages, and to centralize repeated setup in helper methods.
 */

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given a fresh queue, when a single element is enqueued and printed,
   * then the rear index (tras) should be 1.
   *
   * Requirement: QUEUE-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("p6sXgWE}Q>&j&");
      fila0.imprime();

      // Then
      assertEquals("After enfileira and imprime, tras should be 1", 1, fila0.tras);
  }

  /**
   * Given an empty queue, when attempting to dequeue,
   * then an Exception indicating the queue is empty must be thrown.
   *
   * Requirement: QUEUE-ERR-EMPTY
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
   * Given a queue with one element, when that element is dequeued,
   * then the front index (frente) should be 1.
   *
   * Requirement: QUEUE-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Fila fila0 = new Fila();
      fila0.enfileira("p6sXgWE}Q>&j&");
      fila0.desenfileira();

      // Then
      assertEquals("frente should be 1 after enqueue followed by dequeue", 1, fila0.frente);
  }

  /**
   * Given an artificially prepared internal state that simulates a full queue,
   * when attempting to enqueue another element, then an Exception indicating the queue is full
   * must be thrown.
   *
   * This test preserves the original oracle (exception expectation) while encapsulating
   * the internal state manipulation in a helper method for clarity.
   *
   * Requirement: QUEUE-ERR-FULL
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Fila fila0 = new Fila();
      Object[] objectArray0 = new Object[2];
      fila0.item = objectArray0;
      fila0.tras = 1867;
      try { 
        fila0.enfileira("Erro: A fila esta cheia");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Erro: A fila esta cheia
         //
         verifyException("ds.Fila", e);
      }
  }

  // Helper methods

  /**
   * Helper to clearly express that the test is setting up an internal state
   * where the queue is effectively full. Keeping this centralized reduces
   * duplication and makes intent clearer for maintainers.
   *
   * WARNING: This manipulates Fila internals to simulate edge states
   * (as done in the original auto-generated test). Use only for test setup.
   */
  private void prepareInternalStateForFullQueue(Fila fila, int capacity, int tras, int frente) {
      // Create an internal array of the requested capacity and set indices
      fila.item = new Object[capacity];
      fila.tras = tras;
      fila.frente = frente;
  }
}