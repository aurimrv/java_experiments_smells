package ds.seed5482;

import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for ds.Fila (REQ-QUEUE-001).
 * These tests exercise basic FIFO behavior, exceptional empty-queue behavior,
 * and simple multi-element behavior using Given-When-Then structure.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: an empty queue and two distinct elements
    Fila fila0 = new Fila();
    Object first = new Object();
    Object second = new Object();

    // When: enqueue two elements and call imprime to exercise side-effect
    fila0.enfileira(first);
    fila0.enfileira(second);
    // imprime is a side-effectful operation (prints contents); call to ensure no exceptions
    fila0.imprime();

    // Then: queue should not be empty, and elements should be dequeued in FIFO order
    assertFalse("After enqueuing elements, queue should not be empty", fila0.vazia());

    Object out1 = fila0.desenfileira();
    assertSame("The first dequeued element should be the first enqueued (FIFO)", first, out1);

    Object out2 = fila0.desenfileira();
    assertSame("The second dequeued element should be the second enqueued (FIFO)", second, out2);

    // And: after removing all elements, the queue must be empty
    assertTrue("Queue should be empty after removing all elements", fila0.vazia());
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: an empty queue
    Fila fila0 = new Fila();

    // When/Then: attempting to dequeue from an empty queue should raise an exception
    try {
      fila0.desenfileira();
      fail("Expected Exception when dequeuing from an empty queue");
    } catch (Exception e) {
      // Verify the exception message mentions an empty queue to link to requirement behavior
      String msg = e.getMessage();
      assertNotNull("Exception message should be provided", msg);
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }

    // And: the queue should still be empty after the failed operation
    assertTrue("Queue must remain empty after failed dequeue attempt", fila0.vazia());
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: a queue and a single element
    Fila fila0 = new Fila();
    Object element = new Object();

    // When: enqueue the element
    fila0.enfileira(element);

    // Then: the queue reports non-empty and dequeuing returns the same object, leaving it empty afterwards
    assertFalse("Queue should report non-empty after enqueuing an element", fila0.vazia());
    Object dequeued = fila0.desenfileira();
    assertSame("Dequeued object must be the same instance that was enqueued", element, dequeued);
    assertTrue("Queue should be empty after dequeuing the only element", fila0.vazia());
  }
}