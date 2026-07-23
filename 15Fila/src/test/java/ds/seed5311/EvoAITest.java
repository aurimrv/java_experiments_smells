package ds.seed5311;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Test suite for ds.Fila focusing on basic queue operations and error conditions.
 *
 * Requirements referenced:
 * - REQ-FILA-001: Basic enqueue/dequeue behavior
 * - REQ-FILA-002: Empty queue throws on dequeue
 * - REQ-FILA-003: Queue reports full when capacity reached
 *
 * Each test follows a Given-When-Then structure and includes descriptive assertion messages.
 */
interface Tier1Test {}

@Category(Tier1Test.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Given: a Fila whose internal 'tras' index is manually set to a non-default value
   * When: imprime() is invoked
   * Then: a NullPointerException is expected (documenting current implementation behavior)
   *
   * Note: This test documents existing behavior and verifies that the 'tras' field remains unchanged
   * when imprime() fails due to missing internal buffer. This is defensive documentation of behavior
   * rather than an endorsement of it.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      fila0.tras = 146;

      // When / Then
      try {
          fila0.imprime();
          fail("Expected NullPointerException from imprime() when internal buffer is missing or uninitialized");
      } catch (NullPointerException e) {
          // Verify that the failure is due to a null dereference and that 'tras' was not modified.
          assertEquals("Field 'tras' should remain unchanged after imprime() failure", 146, fila0.tras);
      }
  }

  /**
   * Given: a newly created, empty Fila
   * When: imprime() is invoked
   * Then: no exception is thrown and the queue internal indices reflect an empty queue
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When
      try {
          fila0.imprime(); // should safely handle an empty queue
      } catch (Exception e) {
          fail("imprime() should not throw for an empty queue, but threw: " + e);
      }

      // Then: verify internal indices consistent with an empty queue
      assertEquals("Newly created queue should have tras == 0", 0, fila0.tras);
      // If 'frente' is available (implementation detail), verify reasonable default
      try {
          int frenteValue = fila0.frente;
          assertEquals("Newly created queue should have frente == 0", 0, frenteValue);
      } catch (NoSuchFieldError | NoSuchMethodError ignore) {
          // If not present in this implementation, the previous assertion is sufficient.
      }
  }

  /**
   * Given: a newly created, empty Fila
   * When: desenfileira() is invoked on the empty queue
   * Then: an exception indicating the queue is empty is expected
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When / Then
      try {
          fila0.desenfileira();
          fail("Expected an exception when dequeuing from an empty queue");
      } catch (Exception e) {
          // Verify the exception communicates an empty-queue condition (language-agnostic check)
          String msg = e.getMessage();
          boolean conveysEmpty = (msg != null && (msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty")));
          assertTrue("Exception message should indicate an empty queue; actual: " + msg, conveysEmpty || msg == null);
      }
  }

  /**
   * Given: a freshly created Fila
   * When: enfileira() is invoked repeatedly until the queue reports being full
   * Then: an exception indicating the queue is full should be thrown within a reasonable number of attempts
   *
   * This test avoids directly manipulating internal fields and uses only the public API.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();

      // When: keep enqueuing until the implementation signals the queue is full
      Exception thrown = null;
      final int MAX_ATTEMPTS = 1024; // safety cap to avoid infinite loop in pathological implementations
      int successCount = 0;
      for (int i = 0; i < MAX_ATTEMPTS; i++) {
          try {
              fila0.enfileira(new Object());
              successCount++;
          } catch (Exception e) {
              thrown = e;
              break;
          }
      }

      // Then: either we hit capacity (expected) or we reached the attempt cap (treat as failure)
      if (thrown == null) {
          fail("Queue did not become full after " + MAX_ATTEMPTS + " enqueues; successCount=" + successCount);
      } else {
          String msg = thrown.getMessage();
          boolean indicatesFull = (msg != null && (msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full")));
          assertTrue("Expected exception to indicate queue is full; actual message: " + msg, indicatesFull || msg == null);
      }
  }

  /**
   * Given: an empty Fila and an object enqueued into it
   * When: a single enqueue operation is performed
   * Then: the queue should reflect the addition (tras incremented) and a subsequent dequeue should return the same object.
   *
   * This test documents FIFO behavior and keeps the primary action to a single enqueue operation; dequeue is used
   * to assert the observable effect of that action.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Fila fila0 = new Fila();
      Object payload = new Object();

      // When: perform the primary action (enqueue)
      fila0.enfileira(payload);

      // Then: verify observable state and behavior
      try {
          // Check that the queue reports having at least one element via internal 'tras' index if available
          int trasValue = fila0.tras;
          assertTrue("After one enqueue, 'tras' should be >= 1, but was: " + trasValue, trasValue >= 1);
      } catch (NoSuchFieldError ignore) {
          // ignore if not accessible; fall back to behavioral assertion below
      }

      // Dequeue to verify FIFO semantics (this is a verification step for the enqueue action)
      Object dequeued = null;
      try {
          dequeued = fila0.desenfileira();
      } catch (Exception e) {
          fail("Dequeue after a successful enqueue should not throw, but threw: " + e);
      }
      assertSame("Dequeued object should be the same instance enqueued earlier", payload, dequeued);
  }
}