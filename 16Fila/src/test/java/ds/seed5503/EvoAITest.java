package ds.seed5503;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Fila (queue) focused on core behaviors:
 * - REQ-FILA-001: Enqueue transitions from empty to non-empty and allows dequeue.
 * - REQ-FILA-002: Dequeuing an empty queue throws a descriptive exception.
 * - REQ-FILA-003: The queue preserves FIFO ordering for multiple elements.
 *
 * These tests follow a clear Given-When-Then structure and include descriptive assertions.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-FILA-001
   * Given a new empty queue,
   * When an element is enqueued,
   * Then the queue becomes non-empty and dequeuing returns the same element.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila = new Fila();
    assertTrue("Precondition: newly created queue should be empty", fila.vazia());

    // When
    String value = "element";
    fila.enfileira(value);

    // Then
    assertFalse("Queue should not be empty after enqueuing an element", fila.vazia());
    Object dequeued = fila.desenfileira();
    assertEquals("Dequeued element should be the one enqueued", value, dequeued);
    assertTrue("Queue should be empty after dequeuing the only element", fila.vazia());
  }

  /**
   * REQ-FILA-002
   * Given an empty queue,
   * When attempting to dequeue,
   * Then an Exception indicating that the queue is empty must be thrown.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila = new Fila();
    assertTrue("Precondition: queue must be empty before dequeue", fila.vazia());

    // When / Then
    try {
      fila.desenfileira();
      fail("Expected Exception when dequeuing from an empty queue");
    } catch (Exception e) {
      // Verify exception message is present and matches the requirement text
      String msg = e.getMessage();
      assertNotNull("Exception should contain a message", msg);
      // Primary check: exact expected message (keeps compatibility with existing implementation).
      assertEquals("Exception message must match requirement for empty-queue error",
                   "Erro: A fila esta vazia", msg);
    }
  }

  /**
   * REQ-FILA-003
   * Given an empty queue,
   * When two elements are enqueued in order,
   * Then they are dequeued in the same FIFO order.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila = new Fila();
    assertTrue("Precondition: new queue should be empty", fila.vazia());

    // When
    fila.enfileira("first");
    fila.enfileira("second");

    // Then
    assertFalse("Queue should not be empty after enqueues", fila.vazia());
    Object firstOut = fila.desenfileira();
    assertEquals("First dequeued should be the first enqueued element", "first", firstOut);
    Object secondOut = fila.desenfileira();
    assertEquals("Second dequeued should be the second enqueued element", "second", secondOut);
    assertTrue("Queue should be empty after dequeuing all elements", fila.vazia());
  }
}