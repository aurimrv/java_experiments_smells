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
 * Test suite for ds.Fila (requirement: Fila-REQ-001).
 *
 * This class improves on generated tests by:
 * - Using Given-When-Then structure in each test.
 * - Providing descriptive assertion messages.
 * - Grouping related verifications in each test to validate multiple properties.
 *
 * Note: Tests intentionally keep original method names (test0..test3) to preserve external references.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a newly created, empty queue
    Fila fila0 = new Fila();

    // When: printing an empty queue (primary action)
    // Then: this should not throw and the queue should remain empty
    fila0.imprime();
    assertTrue("After printing an empty queue, vazia() should return true", fila0.vazia());

    // Additional boundary/behavior checks:
    // Given: enqueue two elements
    fila0.enfileira("first");
    fila0.enfileira("second");

    // Then: queue should not be empty and should dequeue in FIFO order
    assertFalse("Queue should not be empty after enqueuing elements", fila0.vazia());
    Object firstOut = fila0.desenfileira();
    assertEquals("Dequeued element should be the first enqueued (FIFO)", "first", firstOut);

    Object secondOut = fila0.desenfileira();
    assertEquals("Dequeued element should be the second enqueued", "second", secondOut);

    // Finally: queue should be empty again
    assertTrue("Queue should be empty after dequeuing all elements", fila0.vazia());
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a new empty queue
    Fila fila0 = new Fila();

    // When/Then: attempting to dequeue from an empty queue should raise an Exception with an informative message
    try {
      fila0.desenfileira();
      fail("Expecting Exception when dequeuing from an empty queue (no element to remove)");
    } catch (Exception e) {
      // Validate exception type and message content to ensure meaningful error reporting
      assertNotNull("Exception instance should not be null", e);
      String msg = e.getMessage();
      assertNotNull("Exception message should be present for this implementation", msg);
      assertTrue("Exception message should mention 'vazia' to indicate empty queue: actual='" + msg + "'",
                 msg.toLowerCase().contains("vazia"));
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: a new queue
    Fila fila0 = new Fila();

    // When: enqueuing a typical value and then dequeuing it
    fila0.enfileira("P.");
    Object object0 = fila0.desenfileira();

    // Then: dequeued value must match enqueued value and queue must be empty afterwards
    assertEquals("Dequeued element should equal the enqueued value", "P.", object0);
    assertTrue("Queue should be empty after dequeuing the only element", fila0.vazia());

    // Additional boundary check: enqueue and dequeue an empty string
    fila0.enfileira("");
    Object emptyStringOut = fila0.desenfileira();
    assertEquals("Dequeued element should equal the enqueued empty string", "", emptyStringOut);
    assertTrue("Queue should be empty after removing the empty string", fila0.vazia());
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: a queue with a single null element enqueued
    Fila fila0 = new Fila();
    fila0.enfileira((Object) null);

    // When: attempting to print the queue may raise NullPointerException depending on implementation
    try {
      fila0.imprime();
      // If imprime does not throw, ensure the queue still contains the null and can be dequeued
      Object polled = fila0.desenfileira();
      assertNull("If imprime did not throw, dequeued element should be the previously enqueued null", polled);
      assertTrue("Queue should be empty after dequeuing the null element", fila0.vazia());
    } catch (NullPointerException e) {
      // Then: validate the exception and that the queue still allows removal of the null element
      assertNull("NullPointerException in this context is expected to carry no message", e.getMessage());
      Object polled = fila0.desenfileira();
      assertNull("After a NullPointerException during print, the queued element should still be the null that was enqueued", polled);
      assertTrue("Queue should be empty after removing the null element", fila0.vazia());
    }
  }
}