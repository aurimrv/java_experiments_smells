package ds.seed7992;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and more robust tests for ds.Fila.
 *
 * Notes:
 * - Tests avoid inspecting internal fields of Fila (such as 'tras' or 'frente') and exercise the public API.
 * - Given-When-Then comments are provided for clarity.
 * - Exceptional behaviour is asserted with meaningful messages.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Requirement: QUEUE-001
   * Scenario: Enqueue a single element, print the queue, then dequeue it and verify the queue becomes empty.
   *
   * Given: an empty Fila
   * When: an element is enqueued and the queue is printed
   * Then: the element can be dequeued and subsequent dequeue throws an exception indicating the queue is empty
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    final String element = "o)P&]5H9P";

    // When: enqueue and print (imprime may be a side-effect method; we call it to exercise it)
    fila0.enfileira(element);
    fila0.imprime();

    // Then: first dequeue should succeed (no exception). We don't rely on internal state 'tras'.
    try {
      fila0.desenfileira(); // consume the single element; works whether this returns void or an Object
    } catch (Exception e) {
      fail("Dequeue after a single enqueue should not throw, but threw: " + e.getMessage());
    }

    // And: subsequent dequeue should indicate the queue is empty
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue, but none was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Expected an informative exception message when dequeuing from empty queue.", msg);
      // check for words that indicate an empty queue in Portuguese/English
      String lowered = msg.toLowerCase();
      assertTrue("Exception message should indicate the queue is empty. Message: " + msg,
          lowered.contains("vazia") || lowered.contains("vazio") || lowered.contains("empty"));
    }
  }

  /**
   * Requirement: QUEUE-002
   * Scenario: Dequeuing an empty queue must raise a clear exception.
   *
   * Given: a newly created Fila (empty)
   * When: desenfileira is invoked
   * Then: an exception is thrown describing that the queue is empty
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue, but no exception was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception thrown for empty dequeue should include a message.", msg);
      String lowered = msg.toLowerCase();
      assertTrue("Exception message should indicate empty queue (contains 'vazia'/'vazio'/'empty'). Message: " + msg,
          lowered.contains("vazia") || lowered.contains("vazio") || lowered.contains("empty"));
    }
  }

  /**
   * Requirement: QUEUE-003
   * Scenario: Attempting to enqueue beyond the queue capacity should raise an exception indicating the queue is full.
   *
   * Given: a Fila (possibly bounded)
   * When: we repeatedly enqueue elements until an exception is raised
   * Then: the exception must indicate that the queue is full
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    boolean overflowObserved = false;
    Exception observed = null;

    // When: try to enqueue until the implementation signals that the queue is full.
    // We bound the attempts to avoid infinite loops in case of an unbounded implementation.
    final int MAX_ATTEMPTS = 1024;
    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      try {
        fila0.enfileira("elem-" + i);
      } catch (Exception e) {
        overflowObserved = true;
        observed = e;
        break;
      }
    }

    // Then: Depending on implementation the queue may be bounded or unbounded.
    // If it's bounded we expect to have observed an overflow exception and its message should indicate fullness.
    if (!overflowObserved) {
      // If no overflow observed within MAX_ATTEMPTS, we still treat this as a valid implementation (unbounded).
      // Assert that at least some enqueues succeeded and the queue is not empty by attempting a dequeue.
      try {
        fila0.desenfileira();
      } catch (Exception e) {
        fail("After many enqueues, dequeuing should succeed for a non-empty (possibly unbounded) queue. Threw: " + e.getMessage());
      }
    } else {
      assertNotNull("Expected an exception instance when queue overflow occurs.", observed);
      String msg = observed.getMessage();
      assertNotNull("Overflow exception should include a descriptive message.", msg);
      String lowered = msg.toLowerCase();
      assertTrue("Overflow exception message should indicate a full queue (contains 'cheia'/'full'). Message: " + msg,
          lowered.contains("cheia") || lowered.contains("full"));
    }
  }

  /**
   * Requirement: QUEUE-004
   * Scenario: Enqueue multiple elements and then dequeue them to observe FIFO behaviour and eventual emptiness.
   *
   * Given: an empty Fila
   * When: two distinct elements are enqueued and two dequeues are performed
   * Then: both dequeues succeed and a subsequent dequeue signals emptiness
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    final String first = "first-element";
    final String second = "second-element";

    // When
    fila0.enfileira(first);
    fila0.enfileira(second);

    // Then: both dequeues should succeed (we don't rely on return type; only failure would matter)
    try {
      fila0.desenfileira(); // should remove the first element
    } catch (Exception e) {
      fail("First dequeue after enqueuing two elements should not throw: " + e.getMessage());
    }

    try {
      fila0.desenfileira(); // should remove the second element
    } catch (Exception e) {
      fail("Second dequeue after enqueuing two elements should not throw: " + e.getMessage());
    }

    // And: subsequent dequeue should indicate the queue is empty
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue after removing all elements.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception when dequeuing from empty queue should include message.", msg);
      String lowered = msg.toLowerCase();
      assertTrue("Exception message should indicate empty queue. Message: " + msg,
          lowered.contains("vazia") || lowered.contains("vazio") || lowered.contains("empty"));
    }
  }
}