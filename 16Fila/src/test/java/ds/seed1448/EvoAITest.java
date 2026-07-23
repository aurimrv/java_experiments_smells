package ds.seed1448;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Fila;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Fila basic behaviors.
 *
 * Requirement traceability:
 * - REQ-001: Basic queue operations (enqueue, dequeue, empty check, printing).
 *
 * These tests follow Given-When-Then structure in comments and include assertions with messages.
 */
interface UnitTest {}

public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue, when an element is enqueued and printed,
   * then the queue should report not empty, dequeuing should return the same instance,
   * and the queue should be empty afterwards.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      Object element = new Object();
      assertTrue("Precondition: newly created queue should be empty", fila0.vazia());

      // When
      fila0.enfileira(element);
      // imprime() is a side-effect; it must not throw for a valid internal state
      fila0.imprime();

      // Then
      assertFalse("Queue should not be empty after enfileira", fila0.vazia());
      Object dequeued = fila0.desenfileira();
      assertSame("Dequeued object should be the exact instance that was enfileira'd", element, dequeued);
      assertTrue("Queue should be empty after removing the only element", fila0.vazia());
  }

  /**
   * Given an empty queue, when attempting to dequeue,
   * then an Exception should be thrown and the message should describe the empty queue condition.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When/Then
      try {
        fila0.desenfileira();
        fail("Expected Exception when attempting to desenfileira from an empty queue");
      } catch(Exception e) {
         // Verify the exception message is specific and helpful
         String expectedMessage = "Erro: A fila esta vazia";
         assertEquals("Exception message should indicate that the queue is empty", expectedMessage, e.getMessage());

         // Verify the exception originates from ds.Fila (helpful for diagnosing where it was thrown)
         boolean originatesFromFila = false;
         for (StackTraceElement ste : e.getStackTrace()) {
             if ("ds.Fila".equals(ste.getClassName())) {
                 originatesFromFila = true;
                 break;
             }
         }
         assertTrue("Exception stack trace should include ds.Fila as origin", originatesFromFila);
      }
  }

  /**
   * Given an empty queue, when an element is enqueued then dequeued,
   * then the returned object should be the same instance and the queue should be empty.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      String element = "sample";

      // When
      fila0.enfileira(element);
      Object result = fila0.desenfileira();

      // Then
      assertSame("desenfileira should return the same instance that was enfileira'd", element, result);
      assertTrue("Queue should be empty after dequeuing the only element", fila0.vazia());
  }
}