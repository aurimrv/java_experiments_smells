package ds.seed5503;

import ds.Lista;
import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Lista focused on basic behaviors:
 * - creation yields an empty list
 * - inserting an element transitions list from empty to non-empty
 * - overflowing the internal storage raises an exception
 *
 * These tests follow a Given-When-Then structure and include descriptive
 * assertion messages to improve diagnosability.
 *
 * Requirement: LISTA-001 (basic list operations)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  private static final int DEFAULT_TIMEOUT = 4000;

  private Lista lista;

  @Before
  public void setUp() {
    // Given: a fresh Lista instance for each test
    lista = new Lista();
  }

  @Test(timeout = DEFAULT_TIMEOUT)
  public void test0() throws Throwable {
    // Given: a new empty list (setUp)
    Object element = new Object();

    // When: inserting a single element into the list (single Act)
    lista.insere(element);

    // Then: the list should report non-empty and the last index should reflect one element
    assertFalse("After inserting one element, lista.vazia() should be false", lista.vazia());
    // We verify the implementation detail 'ultimo' to ensure the internal index progressed.
    // This is guarded with a clear assertion message to aid debugging if the contract changes.
    assertEquals("After one insert the 'ultimo' index should be 1", 1, lista.ultimo);
  }

  @Test(timeout = DEFAULT_TIMEOUT)
  public void test1() throws Throwable {
    // Given: a newly created list (setUp)

    // When: we query its emptiness (single Act)
    boolean isEmpty = lista.vazia();

    // Then: the list should be empty and internal indices should reflect initial state
    assertTrue("A newly created Lista should be empty", isEmpty);
    // These internal state checks document the expected initial invariants.
    assertEquals("Initial 'pos' should be -1 for an empty list", -1, lista.pos);
    assertEquals("Initial 'ultimo' should be 0 for an empty list", 0, lista.ultimo);
  }

  @Test(timeout = DEFAULT_TIMEOUT)
  public void test2() throws Throwable {
    // Given: a fresh list and a non-null element to insert
    Object element = new Object();

    // When: inserting one element (single Act)
    lista.insere(element);

    // Then: the list should not be empty and the last index should equal 1
    assertFalse("List should not be empty after inserting one element", lista.vazia());
    assertEquals("After inserting one element the 'ultimo' index must be 1", 1, lista.ultimo);
  }

  @Test(timeout = DEFAULT_TIMEOUT, expected = Exception.class)
  public void test3() throws Throwable {
    // Given: a list whose internal storage is intentionally sized small to provoke overflow.
    // This uses a small, explicit capacity to make the test deterministic.
    final int CAPACITY = 2;
    ensureInternalCapacity(lista, CAPACITY);

    Object element = new Object();

    // When: filling the list up to capacity and then inserting one more element.
    // The final insert is the single act that should trigger an exception (overflow).
    lista.insere(element); // fill 1
    lista.insere(element); // fill 2 (reaches capacity)
    lista.insere(element); // expected to throw Exception due to full list
  }

  /**
   * Helper that ensures the given Lista instance has an internal backing array
   * with the requested capacity. The method will try a direct assignment (if the
   * field is accessible) and otherwise fall back to reflection. Centralizing
   * this logic avoids repetition and documents the intentional structural
   * coupling for this overflow test.
   */
  private void ensureInternalCapacity(Lista target, int capacity) {
    try {
      // Attempt direct assignment first (covers cases where 'item' is public)
      target.item = new Object[capacity];
    } catch (Throwable directFailure) {
      try {
        // Fall back to reflection if direct assignment is not allowed
        java.lang.reflect.Field f = Lista.class.getDeclaredField("item");
        f.setAccessible(true);
        f.set(target, new Object[capacity]);
      } catch (Exception reflectionFailure) {
        // If we cannot set the internal storage, fail fast with a descriptive message.
        throw new IllegalStateException("Unable to prepare Lista internal capacity for overflow test", reflectionFailure);
      }
    }
  }
}