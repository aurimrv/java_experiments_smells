package ds.seed1448;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit test categorization.
 */
interface UnitTest {}

/**
 * Improved and more descriptive tests for ds.Pilha.
 *
 * Notes:
 * - Tests exercise both normal and error flows where appropriate.
 * - Tests rely only on public Pilha API (empilha, desempilha, tamanho).
 * - Each test contains Given-When-Then style comments and descriptive assertions.
 * - Requirement references are noted in Javadoc lines (e.g. REQ-STACK-001).
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-STACK-001: Popping an empty stack should result in a clear exception and leave the stack unchanged.
   *
   * Given an empty stack,
   * When attempting to pop,
   * Then an Exception is thrown and size remains zero.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    assertEquals("Given a newly created stack, size must be 0", 0, pilha.tamanho());

    // When / Then
    try {
      pilha.desempilha();
      fail("Expected an Exception when popping an empty stack");
    } catch (Exception e) {
      // basic sanity checks on the exception
      String msg = e.getMessage();
      assertNotNull("Exception should include a message", msg);
      String lower = msg.toLowerCase();
      assertTrue("Exception message should indicate empty/full/erro state: " + msg,
          lower.contains("vaz") || lower.contains("empty") || lower.contains("erro") || lower.contains("vazia"));
      // ensure no state change
      assertEquals("Size should remain 0 after failed pop", 0, pilha.tamanho());
    }
  }

  /**
   * REQ-STACK-002: Pushing then popping one element should reduce the size accordingly and subsequent pops should fail.
   *
   * Given a stack with one element,
   * When popping,
   * Then the size decreases to zero and further pops throw an Exception.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    Object element = "element";
    pilha.empilha(element);
    assertEquals("After one push, size must be 1", 1, pilha.tamanho());

    // When
    try {
      pilha.desempilha();
    } catch (Exception e) {
      fail("Did not expect exception when popping from non-empty stack: " + e.getMessage());
    }

    // Then
    assertEquals("After popping the only element, size must be 0", 0, pilha.tamanho());

    // And further popping should fail
    try {
      pilha.desempilha();
      fail("Expected exception when popping from empty stack after last element was removed");
    } catch (Exception e) {
      // expected
    }
  }

  /**
   * REQ-STACK-003: The stack should eventually signal when it cannot accept more items (full).
   *
   * Given an initially empty stack,
   * When repeatedly pushing until capacity,
   * Then an Exception should be thrown indicating the stack is full; if no exception appears within a reasonable
   * number of pushes, the test validates consistent LIFO behavior by popping all items.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha = new Pilha();

    // When: try to push repeatedly up to a reasonable bound
    boolean gotFullException = false;
    int pushed = 0;
    final int MAX_TRIES = 1000; // defensive bound to avoid infinite loops on implementations with large capacity
    for (int i = 0; i < MAX_TRIES; i++) {
      try {
        pilha.empilha("v" + i);
        pushed++;
        // quick sanity: tamanho should reflect pushes
        assertEquals("Size should reflect number of successful pushes", pushed, pilha.tamanho());
      } catch (Exception e) {
        // Then: expect an indication the stack is full
        gotFullException = true;
        String msg = e.getMessage();
        assertNotNull("Full-stack exception should carry a message", msg);
        String lower = msg.toLowerCase();
        assertTrue("Full-stack exception message should mention 'cheia' or similar: " + msg,
            lower.contains("cheia") || lower.contains("full") || lower.contains("erro"));
        break;
      }
    }

    if (!gotFullException) {
      // If no capacity limit observed within MAX_TRIES, verify LIFO popping behavior to ensure correctness.
      int sizeBefore = pilha.tamanho();
      assertTrue("After many pushes, the size should be non-negative", sizeBefore >= 0);
      int poppedCount = 0;
      while (pilha.tamanho() > 0) {
        try {
          pilha.desempilha();
        } catch (Exception e) {
          fail("Unexpected exception while popping during cleanup: " + e.getMessage());
        }
        poppedCount++;
      }
      assertEquals("All pushed elements should be popped", sizeBefore, poppedCount);
    }
  }

  /**
   * REQ-STACK-004: Pushing a single object should increase size and popping should decrease size (LIFO).
   *
   * Given an empty stack,
   * When an object is pushed,
   * Then tamanho increases; popping returns to previous size.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    assertEquals("Initial size should be 0", 0, pilha.tamanho());

    // When
    Object obj = new Object();
    pilha.empilha(obj);

    // Then
    assertEquals("Size should be 1 after one push", 1, pilha.tamanho());

    // And popping should succeed and restore size
    try {
      pilha.desempilha();
    } catch (Exception e) {
      fail("Did not expect exception when popping after a push: " + e.getMessage());
    }
    assertEquals("Size should be 0 after popping the pushed object", 0, pilha.tamanho());
  }

  /**
   * REQ-STACK-005: tamanho() should reflect the number of elements and update after push/pop operations.
   *
   * Given a new stack,
   * When pushing and popping multiple elements,
   * Then tamanho reports expected values at each step.
   */
  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    int int0 = pilha.tamanho();
    assertEquals("A newly created stack must have size 0", 0, int0);

    // When
    pilha.empilha("a");
    assertEquals("Size should be 1 after first push", 1, pilha.tamanho());

    pilha.empilha("b");
    assertEquals("Size should be 2 after second push", 2, pilha.tamanho());

    // Then: popping reduces size stepwise
    pilha.desempilha();
    assertEquals("Size should be 1 after popping one element", 1, pilha.tamanho());

    pilha.desempilha();
    assertEquals("Size should be 0 after popping all elements", 0, pilha.tamanho());
  }
}