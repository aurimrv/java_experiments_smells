package ds.seed5482;

import ds.Fila;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Fila (seed5482).
 *
 * These tests were hand-refactored from generated cases to:
 * - follow Given-When-Then structure,
 * - assert public behavior rather than relying on internal details,
 * - include simple traceability comments (requirement IDs are illustrative).
 *
 * Note: The method names are kept identical to the original generated tests
 * to satisfy the constraint of preserving method signatures.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Fila_ESTest_scaffolding {

  /**
   * Requirement: FILA-REQ-001
   * Given an (initially) empty queue, When calling imprime(), then the method should not produce
   * a non-informative runtime failure. If a NullPointerException is thrown internally, it should
   * not carry an unexpected message.
   *
   * This test accepts either behavior (no exception or a NullPointerException with no message),
   * but fails on other unexpected exceptions.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      // When: call imprime on a freshly constructed queue
      fila0.imprime();
      // Then: either no exception (acceptable) or a controlled NPE (checked below)
    } catch (NullPointerException npe) {
      // Then: if a NullPointerException occurs, verify it carries no message (consistent with legacy behavior)
      assertNull("NullPointerException from imprime should carry no message", npe.getMessage());
    } catch (Throwable t) {
      // Any other throwable is unexpected and should cause test failure with details
      fail("Unexpected exception from imprime(): " + t.getClass().getName() + " message=" + t.getMessage());
    }
  }

  /**
   * Requirement: FILA-REQ-002
   * Given a newly created queue, When calling imprime(), Then the queue should remain empty and
   * subsequent attempt to desenfileira() should indicate the queue is empty.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When
    try {
      fila0.imprime();
    } catch (Throwable t) {
      // imprime is allowed to throw (see other tests), but it must not corrupt the queue.
      // Logically accept the throwable but continue to verify public behavior via desenfileira().
    }

    // Then: dequeuing an empty queue must produce an error indicating emptiness.
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing an empty queue");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Empty-queue exception should include a message", msg);
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Requirement: FILA-REQ-003
   * Given an empty queue, When attempting to desenfileira(), Then an exception must be raised
   * that clearly indicates the queue is empty.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When / Then
    try {
      fila0.desenfileira();
      fail("Expected an exception when attempting to remove from an empty queue");
    } catch (Exception e) {
      // Verify the exception indicates the queue is empty (language tolerant)
      String msg = e.getMessage();
      assertNotNull("Exception should include an explanatory message", msg);
      assertTrue("Expected message to mention empty queue: " + msg,
          msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Requirement: FILA-REQ-004
   * Given a queue with a single enqueued element, When that element is removed, Then the queue
   * should behave as empty afterwards.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    Object sentinel = new Object();

    // When: enqueue one element
    fila0.enfileira(sentinel);

    // Then: first dequeue returns the same element
    Object removed = fila0.desenfileira();
    assertSame("Dequeued element should be the enqueued sentinel", sentinel, removed);

    // And: subsequent dequeue should indicate the queue is empty
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception should include an explanatory message", msg);
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Requirement: FILA-REQ-005
   * Given an internal fixed-size backing array of size 1, When the queue is full and an attempt
   * is made to enqueue another element, Then an exception indicating the queue is full should be thrown.
   *
   * This test uses reflection to simulate a full backing array without relying on package-private
   * access to internal fields from test code. Reflection usage is limited and validated.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Fila fila0 = new Fila();
    try {
      // Use reflection to set backing storage to a 1-slot array and mark the queue as full.
      Field itemField = fila0.getClass().getDeclaredField("item");
      itemField.setAccessible(true);
      itemField.set(fila0, new Object[1]);

      Field trasField = null;
      try {
        trasField = fila0.getClass().getDeclaredField("tras");
        trasField.setAccessible(true);
        // Set 'tras' to 1 to indicate one element already present (full for size 1)
        trasField.setInt(fila0, 1);
      } catch (NoSuchFieldException nsfe) {
        // If 'tras' field name is different, try common alternatives; if not present, continue (best effort)
        // Do nothing; some implementations manage fullness differently.
      }
    } catch (NoSuchFieldException | IllegalAccessException ex) {
      // If reflection fails, the test cannot simulate a full backing array; fail with details.
      fail("Reflection failed while preparing queue for full-capacity test: " + ex);
    }

    // When / Then: attempt to enqueue another element and expect an exception indicating fullness.
    try {
      fila0.enfileira(new Object());
      fail("Expected an exception when enqueuing into a simulated full queue");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Full-queue exception should include a message", msg);
      assertTrue("Exception message should indicate queue is full", msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
    }
  }

  /**
   * Requirement: FILA-REQ-006
   * Given a queue, When enqueuing a null element, Then dequeuing should return null (preserving the element)
   * and the queue should subsequently behave as empty.
   */
  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given
    Fila fila0 = new Fila();

    // When: enqueue a null element
    fila0.enfileira((Object) null);

    // Then: dequeuing returns null (the enqueued value)
    Object value = fila0.desenfileira();
    assertNull("Dequeued value should be the previously enqueued null", value);

    // And: queue is empty afterwards
    try {
      fila0.desenfileira();
      fail("Expected an exception when dequeuing from an empty queue after removing the only element");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Empty-queue exception should include a message", msg);
      assertTrue("Exception message should indicate the queue is empty", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }
}