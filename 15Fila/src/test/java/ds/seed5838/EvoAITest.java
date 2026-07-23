package ds.seed5838;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved unit tests for ds.Fila.
 *
 * Traceability:
 * - REQ-QUEUE-ENQ-001: Enqueue and subsequent dequeue should return the same element.
 * - REQ-QUEUE-DEQ-002: Dequeue on an empty queue should raise an informative exception.
 * - REQ-QUEUE-FULL-003: Enqueuing beyond capacity should raise an informative exception.
 *
 * Tests follow Given-When-Then structure in comments and use public API only.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given: an empty queue.
   * When: enqueuing a single object and then dequeuing it.
   * Then: the dequeued object is the same instance that was enqueued,
   *       and a subsequent dequeue indicates the queue is empty.
   *
   * Requirement: REQ-QUEUE-ENQ-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    Object element = new Object();

    // When
    fila0.enfileira(element);

    // Then: dequeuing returns the same instance
    Object removed = fila0.desenfileira();
    assertSame("Dequeued element should be the same instance that was enqueued", element, removed);

    // And: queue should now be empty; subsequent dequeue should raise an exception indicating empty queue
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Given: an empty queue.
   * When: attempting to dequeue.
   * Then: an exception is thrown describing that the queue is empty.
   *
   * Requirement: REQ-QUEUE-DEQ-002
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Expecting an exception when dequeuing from an empty queue");
    } catch (Exception e) {
      // Assert that the exception message is present and descriptive
      String msg = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Exception message should mention that the queue is empty",
          msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
      // Also assert that exception is coming from the Fila implementation (class name present)
      assertTrue("Exception should reference the queue implementation in its message or stack",
          e.getStackTrace() != null && e.getStackTrace().length > 0 && e.getStackTrace()[0].getClassName().contains("Fila"));
    }
  }

  /**
   * Given: a queue.
   * When: enqueuing until the queue reports it is full (by throwing an exception).
   * Then: an exception describing that the queue is full is observed.
   *
   * Requirement: REQ-QUEUE-FULL-003
   *
   * Note: This test avoids manipulating internal fields and uses only public API.
   *       It will attempt up to a reasonable bound to find the capacity; if none is found,
   *       the test fails to avoid hanging indefinitely.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When: repeatedly enqueue until an exception is thrown or until a safe limit is reached
    final int SAFE_LIMIT = 1024;
    boolean overflowObserved = false;
    Exception observedException = null;

    for (int i = 0; i < SAFE_LIMIT; i++) {
      try {
        fila0.enfileira(new Object());
      } catch (Exception e) {
        overflowObserved = true;
        observedException = e;
        break;
      }
    }

    // Then: we must have observed an overflow (full) condition within the safe limit
    if (!overflowObserved) {
      fail("Did not observe a 'queue full' exception after " + SAFE_LIMIT + " enqueues. If the queue is unbounded this test is not applicable.");
    } else {
      // Assert the exception message indicates a full queue
      String msg = observedException.getMessage() == null ? "" : observedException.getMessage();
      assertTrue("Exception message should indicate the queue is full",
          msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
    }
  }

  /**
   * Given: an empty queue.
   * When: enqueuing a single element and then dequeuing it (two acts).
   * Then: the queue returns the same element and is empty afterwards.
   *
   * Requirement: REQ-QUEUE-ENQ-001
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    String payload = "payload";

    // When
    fila0.enfileira(payload);
    Object result = fila0.desenfileira();

    // Then: verify returned element and that subsequent dequeue indicates empty queue
    assertEquals("Dequeued element should equal the enqueued payload", payload, result);

    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage() == null ? "" : e.getMessage();
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }
}