package ds.seed9121;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for ds.Fila (queue) behavior.
 *
 * Requirement trace: REQ-QUEUE-001 - Basic queue operations: enqueue, dequeue, print, empty-check.
 *
 * Note: These tests follow Given-When-Then structure and include descriptive assertion messages.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given a queue with a single null element,
   * When printing the queue,
   * Then a NullPointerException is expected (printing implementation does not accept null values).
   *
   * REQ-QUEUE-001
   */
  @Test(timeout = 4000)
  public void test0() throws Exception {
      // Given
      Fila fila0 = new Fila();
      fila0.enfileira((Object) null);

      // When / Then
      try {
          fila0.imprime();
          fail("Expected NullPointerException when printing a queue that contains a null element");
      } catch (NullPointerException e) {
          // Verify multiple properties about the exception: type and that there is no message (as observed in original behavior)
          assertNull("NullPointerException thrown when printing should not carry a message", e.getMessage());
      }
  }

  /**
   * Given an empty queue,
   * When attempting to dequeue,
   * Then an Exception indicating the queue is empty is expected.
   *
   * REQ-QUEUE-001
   */
  @Test(timeout = 4000)
  public void test1() throws Exception {
      // Given
      Fila fila0 = new Fila();

      // When / Then
      try {
          fila0.desenfileira();
          fail("Expected an Exception when dequeuing from an empty queue");
      } catch (Exception e) {
          // Assert that an informative message is provided and references emptiness (be tolerant to language differences)
          String msg = e.getMessage();
          assertNotNull("Exception thrown for empty-queue dequeue should include a message", msg);
          String lower = msg.toLowerCase();
          assertTrue("Exception message should indicate the queue is empty; was: " + msg,
                  lower.contains("vazia") || lower.contains("empty") || lower.contains("vacio"));
      }
  }

  /**
   * Given a queue where a null value is enqueued,
   * When dequeuing that value and then printing the queue,
   * Then the dequeued value should be null and the queue should be empty afterwards.
   *
   * REQ-QUEUE-001
   */
  @Test(timeout = 4000)
  public void test2() throws Exception {
      // Given
      Fila fila0 = new Fila();

      // When: enqueue a null element
      fila0.enfileira((Object) null);

      // Verify intermediate state: queue should not be empty immediately after enqueue
      assertFalse("Queue should not be empty immediately after enqueueing a (null) element", fila0.vazia());

      // When: dequeue the element
      Object dequeued = null;
      try {
          dequeued = fila0.desenfileira();
      } catch (Exception e) {
          fail("Dequeuing a previously enqueued element should not throw; unexpected exception: " + e.getMessage());
      }

      // Then: the dequeued value is the same that was enqueued (null) and the queue is empty afterwards
      assertNull("Dequeued element should be the same null value that was enqueued", dequeued);
      // Call imprime to ensure printing an empty queue does not throw (defensive check)
      try {
          fila0.imprime();
      } catch (Exception e) {
          fail("Printing an empty queue should not throw an exception; unexpected: " + e);
      }
      assertTrue("Queue should be empty after dequeuing the only element", fila0.vazia());
  }
}