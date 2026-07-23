package ds.seed7992;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for ds.Fila focusing on clear Given-When-Then structure,
 * descriptive assertions, and checking both behavior and messages for exceptions.
 *
 * Requirement traceability:
 * - REQ-QUEUE-001: Basic enqueue/dequeue functionality
 * - REQ-QUEUE-002: Dequeue on empty queue should throw a descriptive exception
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given an empty queue,
   * When an object (the queue itself) is enqueued,
   * Then the queue must report it is not empty and printing the queue must not throw.
   *
   * REQ-QUEUE-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // Precondition: queue should be empty
    assertTrue("Precondition: new queue should be empty", fila0.vazia());

    // When: enqueue the queue instance itself (edge-case of enqueuing self-reference)
    fila0.enfileira(fila0);

    // Then: the queue should not be empty and imprime() should execute without exception.
    try {
      fila0.imprime(); // observation - should not alter state
    } catch (Exception e) {
      fail("Calling imprime() must not throw an exception, but it did: " + e);
    }

    assertFalse("After enqueuing an element, the queue should no longer be empty", fila0.vazia());
  }

  /**
   * Given an empty queue,
   * When attempting to dequeue,
   * Then an Exception with a clear message must be thrown and the queue remains empty.
   *
   * REQ-QUEUE-002
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    assertTrue("Precondition: queue must start empty for this test", fila0.vazia());

    // When / Then: expect a specific exception and message
    try {
      fila0.desenfileira();
      fail("Expected Exception when dequeuing from an empty queue");
    } catch (Exception e) {
      // Verify the exception type and message provide useful diagnostic information
      assertEquals("Exception class should be java.lang.Exception", Exception.class, e.getClass());
      String expectedMessage = "Erro: A fila esta vazia";
      assertEquals("Exception message should clearly state the queue is empty", expectedMessage, e.getMessage());
    }

    // Postcondition: queue should still be empty after the failed operation
    assertTrue("Queue must remain empty after failed dequeue attempt", fila0.vazia());
  }

  /**
   * Given a queue with one element (the queue enqueued into itself),
   * When dequeueing,
   * Then the returned object must be the same instance that was enqueued and
   * the returned object's internal state should reflect that it is empty after removal.
   *
   * REQ-QUEUE-001
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    assertTrue("Precondition: new queue should be empty", fila0.vazia());

    // When: enqueue the queue itself (interesting/self-referential case) and then dequeue
    fila0.enfileira(fila0);
    Object dequeued = fila0.desenfileira();

    // Then: the dequeued object must be the same instance enqueued
    assertSame("Dequeued object should be the same instance that was enqueued", fila0, dequeued);

    // And: the dequeued object's own state (it's the same fila) should be empty after the removal
    assertTrue("The returned queue instance should report empty after its element was removed",
        ((Fila) dequeued).vazia());

    // And: the original queue (which is the same object in this test) should also be empty
    assertTrue("Original queue should be empty after dequeue", fila0.vazia());
  }
}