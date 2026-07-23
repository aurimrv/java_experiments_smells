package ds.seed5831;

import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import ds.Fila;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Marker interface for unit tests.
 */
interface UnitTest {}

/**
 * Marker interface for exception-related tests.
 */
interface ExceptionTest {}

/**
 * Improved test cases for ds.Fila.
 *
 * Each test contains Given-When-Then structure, descriptive assertions,
 * and traceability comments linking to hypothetical requirements.
 *
 * Requirements:
 * - REQ-DS-FILA-001: Enqueue should make the queue non-empty and allow successful dequeue.
 * - REQ-DS-FILA-002: Dequeue on an empty queue should throw a descriptive exception.
 * - REQ-DS-FILA-003: Enqueued object reference must be preserved on dequeue.
 */
@RunWith(JUnit4.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * REQ-DS-FILA-001
   *
   * Given an empty queue,
   * When a single element is enqueued and the queue is printed,
   * Then the queue should report non-empty, and dequeuing should return the same element
   * and leave the queue empty.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      final String element = "element-0";

      // When: enqueue and print
      fila0.enfileira(element);
      // print should not affect the logical state and must not throw
      fila0.imprime();

      // Then: logical checks
      Assert.assertFalse("After enfileira the queue should not be empty", fila0.vazia());

      // And when we remove the element, it should be the same instance/value
      Object dequeued = fila0.desenfileira();
      Assert.assertSame("Dequeued element should be identical to the enqueued element", element, dequeued);

      // Finally, the queue should be empty again
      Assert.assertTrue("After removing the only element the queue should be empty", fila0.vazia());
  }

  /**
   * REQ-DS-FILA-002
   *
   * Given an empty queue,
   * When a dequeue is attempted,
   * Then an Exception should be thrown with a clear message indicating the queue is empty.
   */
  @Test(timeout = 4000)
  @Category(ExceptionTest.class)
  public void test1()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When / Then: expect an exception with a specific message
      try {
          fila0.desenfileira();
          Assert.fail("Expected Exception when dequeuing from an empty queue");
      } catch (Exception e) {
          // Assert on the exception message to ensure clear diagnostics
          Assert.assertEquals("Exception message should indicate empty queue",
                              "Erro: A fila esta vazia", e.getMessage());
          // Additionally assert that an exception was indeed thrown
          Assert.assertNotNull("Expected a non-null exception when dequeuing empty queue", e);
      }
  }

  /**
   * REQ-DS-FILA-003
   *
   * Given an empty queue,
   * When an object is enqueued and then dequeued,
   * Then the dequeued object must be the very same reference and the queue should become empty.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      Object object0 = new Object();

      // When: enqueue
      fila0.enfileira(object0);

      // Then: queue should report non-empty before removal
      Assert.assertFalse("Queue should not be empty immediately after enqueue", fila0.vazia());

      // When: dequeue
      Object object1 = fila0.desenfileira();

      // Then: confirm the dequeued object is the same and queue is empty afterwards
      Assert.assertSame("Dequeued object should be the same instance that was enqueued", object0, object1);
      Assert.assertTrue("Queue should be empty after dequeuing the only element", fila0.vazia());
  }
}