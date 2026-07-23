package ds.seed6733;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Maintained test class for ds.Fila behavior.
 *
 * <p>These tests follow a simple Given-When-Then structure and include
 * clearer assertions and messages to aid maintainability and traceability.
 *
 * Requirement traceability:
 * - REQ-001: Basic queue operations (enqueue, dequeue, empty check, print)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue, when an object is enqueued and the queue is printed,
   * then the queue should no longer be empty, dequeuing should return the same
   * object reference, and the queue should be empty afterwards.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    Object object0 = new Object();

    // When
    fila0.enfileira(object0);
    // imprime() is a side-effect (e.g., printing to stdout); exercise it to ensure no exceptions
    fila0.imprime();

    // Then
    assertFalse("After enqueuing a single element, the queue should not be empty", fila0.vazia());

    // And when we dequeue the element
    Object removed = fila0.desenfileira();

    // Then the dequeued element must be exactly the one enqueued (same reference)
    assertSame("Dequeued object should be the same instance that was enqueued", object0, removed);

    // And the queue should be empty after removing its only element
    assertTrue("Queue should be empty after dequeuing the only enqueued element", fila0.vazia());
  }

  /**
   * Given an empty queue, when attempting to dequeue, then an Exception is thrown
   * with a clear, expected message.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Expected an Exception when dequeuing from an empty queue");
    } catch (Exception e) {
      // Verify the exception type/message to ensure the error is informative and stable
      String expectedMessage = "Erro: A fila esta vazia";
      assertEquals("Exception message must indicate that the queue is empty", expectedMessage, e.getMessage());
    }
  }

  /**
   * Given a queue, when an empty string is enqueued and then dequeued,
   * then the returned value should be the same empty string and the queue
   * should be empty afterwards.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    String emptyString = "";

    // When
    fila0.enfileira(emptyString);
    Object object0 = fila0.desenfileira();

    // Then - validate returned value and queue state with helpful messages
    assertNotNull("Dequeued object should not be null", object0);
    assertTrue("Dequeued object should be an instance of String", object0 instanceof String);
    assertEquals("Dequeued string should be equal to the enqueued empty string", emptyString, object0);
    assertEquals("Dequeued string should have length 0", 0, ((String) object0).length());
    assertTrue("Queue should be empty after dequeuing its only element", fila0.vazia());
  }
}