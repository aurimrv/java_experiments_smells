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
 * Unit tests for ds.Fila focusing on basic enqueue/dequeue behavior and
 * error conditions (empty and full queue). These tests are written to be
 * robust to different internal implementations of Fila (bounded or
 * unbounded) and to express intent with Given-When-Then style comments.
 *
 * Requirement traceability:
 * - REQ-QUEUE-001: Enqueue should add an element that can be dequeued.
 * - REQ-QUEUE-002: Dequeue on empty queue should raise an appropriate exception.
 * - REQ-QUEUE-003: Enqueue on a full queue should raise an appropriate exception (if applicable).
 */
interface UnitTest {}

public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue,
   * when an element is enqueued and then dequeued,
   * then the dequeued element must equal the enqueued element,
   * and subsequent dequeue attempts should indicate the queue is empty.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When
    final String value = "p6sXgWE}Q>&j&";
    fila0.enfileira(value);
    // allow implementations that provide a print/debug operation
    try {
      fila0.imprime();
    } catch (Exception ignored) {
      // imprime may or may not be implemented; ignore errors from it for this test
    }

    // Then: dequeued value equals enqueued value
    Object removed = fila0.desenfileira();
    assertNotNull("Dequeued value should not be null after enqueue", removed);
    assertEquals("Dequeued element must match the element that was enqueued", value, removed);

    // And: further dequeues should indicate emptiness
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("Expected empty-queue message to mention 'vazia' or 'empty', but was: " + msg,
          msg == null ? false : (msg.contains("vazia") || msg.toLowerCase().contains("empty")));
    }
  }

  /**
   * Given an empty queue,
   * when a dequeue is attempted,
   * then an exception indicating an empty queue is raised.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Dequeue on an empty queue should throw an exception describing the empty condition");
    } catch (Exception e) {
      // Provide a useful assertion message about the exception text
      String msg = e.getMessage();
      assertNotNull("Exception thrown for empty queue should include a message", msg);
      assertTrue("Expected error message to reference that the queue is empty: " + msg,
          msg.contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Given a queue with one element,
   * when that element is enqueued and then dequeued,
   * then the queue becomes empty and further dequeues raise an exception.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When
    final String single = "single-element";
    fila0.enfileira(single);
    Object removed = fila0.desenfileira();

    // Then
    assertEquals("Removed element must equal the one previously enqueued", single, removed);

    // And: queue should be empty now
    try {
      fila0.desenfileira();
      fail("After removing the only element, further dequeue should throw an exception indicating emptiness");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertTrue("Expected empty-queue message after removing the only element", 
          msg != null && (msg.contains("vazia") || msg.toLowerCase().contains("empty")));
    }
  }

  /**
   * Given a fresh queue,
   * when enqueuing repeatedly until either capacity is reached or many items have been added,
   * then either a 'full queue' exception must be raised by the implementation when applicable,
   * or the queue must preserve FIFO order for the items that were enqueued.
   *
   * This test avoids poking at implementation internals and is tolerant of both bounded and
   * unbounded queue implementations.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When: try to enqueue many items and detect a 'full' condition if it arises
    final int MAX_ATTEMPTS = 1000;
    boolean gotFullException = false;
    int enqueued = 0;

    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      try {
        String item = "item" + i;
        fila0.enfileira(item);
        enqueued++;
      } catch (Exception e) {
        // Then: if an exception occurs, assert it indicates a full queue
        String msg = e.getMessage();
        assertNotNull("Full-queue exception should include a message", msg);
        assertTrue("Expected full-queue exception message to reference 'cheia' or 'full', but was: " + msg,
            msg.contains("cheia") || msg.toLowerCase().contains("full"));
        gotFullException = true;
        break;
      }
    }

    // If implementation is unbounded (no full exception), verify FIFO for a subset of items
    if (!gotFullException) {
      int toCheck = Math.min(10, enqueued);
      for (int i = 0; i < toCheck; i++) {
        Object dequeued = fila0.desenfileira();
        assertEquals("FIFO order should be preserved for enqueued elements", "item" + i, dequeued);
      }
    }
  }
}