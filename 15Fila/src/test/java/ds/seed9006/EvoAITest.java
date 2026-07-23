package ds.seed9006;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Fila;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of unit tests.
 */
interface UnitTest {}

/**
 * Improved test suite for ds.Fila.
 *
 * Notes:
 * - Tests follow Given-When-Then structure.
 * - Each test includes more descriptive assertions and messages.
 * - Avoids direct mutation of internal fields and does not rely on EvoSuite scaffolding behavior.
 *
 * Requirement traceability examples are included in Javadoc tags (REQ-QUEUE-001..004).
 */
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * REQ-QUEUE-001
   *
   * Given an empty queue, when one element is enqueued and the queue is printed,
   * then the internal last-index (tras) reflects that an element was added and
   * dequeuing returns the original element and then the queue behaves as empty.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      final String value = ")f[4)[.qr6e";

      // When: enqueue and print (printing must not alter state or throw)
      fila0.enfileira(value);
      fila0.imprime();

      // Then: tras should indicate at least one enqueue occurred
      assertTrue("Expected tras to be >= 1 after one enqueue, but was " + fila0.tras, fila0.tras >= 1);

      // And: dequeuing returns the same object that was enqueued (FIFO)
      Object removed = fila0.desenfileira();
      assertEquals("Dequeued element should match the enqueued value", value, removed);

      // And: subsequent dequeue on now-empty queue should throw with the expected message
      try {
          fila0.desenfileira();
          fail("Expected an exception when dequeuing from an empty queue after removing the only element");
      } catch (Exception e) {
          assertNotNull("Exception message should be present", e.getMessage());
          assertTrue("Exception message should indicate the queue is empty",
                     e.getMessage().toLowerCase().contains("fila") && e.getMessage().toLowerCase().contains("vazia"));
      }
  }

  /**
   * REQ-QUEUE-002
   *
   * Given an empty queue, when attempting to dequeue immediately,
   * then an exception is raised indicating the queue is empty.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When / Then: Expect a descriptive exception when dequeuing empty queue
      try {
          fila0.desenfileira();
          fail("Expecting exception when dequeuing from an empty queue (no elements enqueued)");
      } catch (Exception e) {
          // Verify the exception communicates the empty queue condition
          String msg = e.getMessage();
          assertNotNull("Expected a non-null exception message for empty queue", msg);
          assertTrue("Expected message to mention that the queue is empty: " + msg,
                     msg.toLowerCase().contains("fila") && msg.toLowerCase().contains("vazia"));
      }
  }

  /**
   * REQ-QUEUE-003
   *
   * Given a queue, when multiple elements are enqueued, then elements are dequeued in FIFO order
   * and the internal state (tras) reflects activity (non-zero).
   *
   * This test replaces a fragile internal-field mutation approach with public API usage
   * and verifies multiple properties (order, non-empty tras).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      String a = "2jR}Dx:GZI-A";
      String b = "2jR}Dx:GZI-B";
      String c = "2jR}Dx:GZI-C";

      // When: enqueue multiple items
      fila0.enfileira(a);
      fila0.enfileira(b);
      fila0.enfileira(c);

      // Then: tras should reflect that enqueues occurred
      assertTrue("tras should be >= 1 after enqueuing items, but was " + fila0.tras, fila0.tras >= 1);

      // And: items should be returned in FIFO order
      assertEquals("First dequeued should be the first enqueued", a, fila0.desenfileira());
      assertEquals("Second dequeued should be the second enqueued", b, fila0.desenfileira());
      assertEquals("Third dequeued should be the third enqueued", c, fila0.desenfileira());

      // And: queue should now be empty again
      try {
          fila0.desenfileira();
          fail("Expected exception when dequeuing from empty queue after removing all elements");
      } catch (Exception e) {
          assertTrue("Exception for empty queue should mention 'vazia' or 'empty', message: " + e.getMessage(),
                     e.getMessage().toLowerCase().contains("vazia") || e.getMessage().toLowerCase().contains("empty"));
      }
  }

  /**
   * REQ-QUEUE-004
   *
   * Given a single enqueue followed by a dequeue (single Act step is acceptable when verifying transaction),
   * then tras should remain consistent and the returned element must match the one enqueued.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      final String payload = ")f[4)[.qr6e";

      // When: enqueue then dequeue (single logical transaction verifying FIFO)
      fila0.enfileira(payload);
      Object popped = fila0.desenfileira();

      // Then: popped value matches and tras indicates activity
      assertEquals("Dequeued element should be the one that was enqueued", payload, popped);
      assertTrue("tras should be >= 1 after enqueue/dequeue activity, but was " + fila0.tras, fila0.tras >= 1);

      // And: further dequeues indicate empty queue
      try {
          fila0.desenfileira();
          fail("Expected an exception when dequeuing from an empty queue after removing the only element");
      } catch (Exception e) {
          assertNotNull("Empty-queue exception should include a message", e.getMessage());
      }
  }
}