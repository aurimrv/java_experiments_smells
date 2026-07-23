package ds.seed7992;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.Lista;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing tests that verify core Lista behavior.
 */
interface UnitTest {}

/**
 * Improved test class for ds.Lista.
 *
 * Notes:
 * - Tests use only the public API of Lista (insere, imprime, vazia).
 * - Each test includes a short description linking to a hypothetical requirement id.
 * - Given-When-Then comments are provided to clarify intent.
 */
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * REQ-001: Inserting an element should make the list non-empty and printing
   * the list should not change its emptiness state.
   *
   * Given an empty Lista
   * When an element is inserted and imprime() is called
   * Then the list reports as not empty
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given
    Lista lista0 = new Lista();
    assertTrue("Newly created list should be empty", lista0.vazia());

    // When
    Object element = new Object();
    lista0.insere(element);
    // Call imprime() to ensure it is safe to invoke on a non-empty list
    lista0.imprime();

    // Then
    assertFalse("List should not be empty after inserting an element", lista0.vazia());
  }

  /**
   * REQ-002: A newly created Lista reports empty; after inserting an item it
   * reports not empty. This verifies basic state transition via public API.
   *
   * Given a new Lista
   * When an item is inserted
   * Then vazia() returns false
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given
    Lista lista0 = new Lista();
    assertTrue("Lista should be empty upon construction", lista0.vazia());

    // When
    lista0.insere("first");

    // Then
    assertFalse("Lista should report not empty after insertion", lista0.vazia());
  }

  /**
   * REQ-003: Calling imprime() on an empty list must be a no-op with respect to
   * the empty state (it should not make the list non-empty).
   *
   * Given an empty Lista
   * When imprime() is invoked
   * Then the list remains empty
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given
    Lista lista0 = new Lista();
    assertTrue("Lista initially should be empty", lista0.vazia());

    // When
    lista0.imprime();

    // Then
    assertTrue("Calling imprime() on an empty list must not change its empty state", lista0.vazia());
  }

  /**
   * REQ-004: Insertion behavior when approaching capacity:
   * Attempt multiple inserts until either an insertion causes an exception
   * (expected message to indicate a full/capacity condition) or a reasonable
   * number of inserts have succeeded. This test tolerates either behavior but
   * verifies that an exception, if thrown, includes a helpful message.
   *
   * Given a Lista
   * When many items are inserted
   * Then either the list accepts the items (and is not empty) or an exception
   * is raised indicating the list is full
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    // Given
    Lista lista0 = new Lista();

    // When/Then
    final int maxAttempts = 100;
    boolean sawCapacityException = false;
    for (int i = 0; i < maxAttempts; i++) {
      try {
        lista0.insere("item-" + i);
      } catch (Exception e) {
        sawCapacityException = true;
        String msg = e.getMessage();
        // Verify the exception provides a useful hint about capacity/full condition.
        assertNotNull("Capacity exception should include a message", msg);
        String lower = msg.toLowerCase();
        assertTrue("Expected exception message to indicate a full list (contains 'chei' or 'full')",
            lower.contains("chei") || lower.contains("full"));
        break;
      }
    }

    // If no exception was observed, ensure the list is not empty as a result of inserts.
    if (!sawCapacityException) {
      assertFalse("After multiple successful inserts the list should not be empty", lista0.vazia());
    }
  }
}