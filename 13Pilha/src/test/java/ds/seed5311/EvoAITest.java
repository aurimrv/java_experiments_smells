package ds.seed5311;

import ds.Pilha;
import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for test categorization.
 */
interface UnitTest {}

/**
 * Improved, maintainable tests for ds.Pilha.
 *
 * Notes:
 * - Each test uses clear Given-When-Then structure in comments.
 * - Tests include descriptive assertion messages and validate multiple properties.
 * - Tests avoid accessing Pilha internals and rely only on its public API.
 */
public class EvoAITest {

  @Before
  public void setUp() {
    // No global setup required for these tests; kept for potential future use.
  }

  /**
   * REQ-STACK-001
   * Given an empty stack, When desempilha() is invoked, Then an Exception must be thrown
   * indicating the stack is empty.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertTrue("Precondition: new stack should be empty", pilha0.vazia());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack");
    } catch (Exception e) {
      // Verify exception message is informative
      String msg = e.getMessage();
      assertNotNull("Exception should carry a message", msg);
      String lower = msg.toLowerCase();
      assertTrue("Exception message should mention emptiness (e.g. 'vaz', 'vazia', or 'empty'): " + msg,
                 lower.contains("vaz") || lower.contains("empty") || lower.contains("vazia"));
      // After failed pop, stack should still be empty
      assertTrue("Stack must remain empty after failed pop", pilha0.vazia());
      assertEquals("Size should be 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * REQ-STACK-002
   * Given a stack with one element, When attempting a second empilha(), Then either:
   * - the empilha succeeds and the size increases and LIFO behavior is preserved; or
   * - the empilha fails with a clear 'full' related Exception and the original element remains.
   *
   * This test is tolerant of implementations with small fixed capacity while still asserting correct behavior.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    Object marker = new Object();

    // When: push a first element
    pilha0.empilha(marker);
    int sizeAfterFirst = pilha0.tamanho();
    assertTrue("After one empilha() tamanho() should be at least 1", sizeAfterFirst >= 1);
    assertFalse("Stack should not be empty after one push", pilha0.vazia());

    // When: try a second push (null). Two acceptable outcomes: success or a 'full' exception.
    try {
      pilha0.empilha(null);
      // Then: if success, size should increase and LIFO order must hold
      int sizeAfterSecond = pilha0.tamanho();
      assertTrue("Size should increase after successful second empilha()", sizeAfterSecond >= sizeAfterFirst + 1);

      Object poppedSecond = pilha0.desempilha(); // should be the last pushed (null)
      Object poppedFirst = pilha0.desempilha();  // should be the marker

      assertNull("Second popped element should be the null pushed second", poppedSecond);
      assertSame("First popped element should be the original marker object", marker, poppedFirst);
      assertTrue("Stack should be empty after popping all elements", pilha0.vazia());
      assertEquals("Size should be 0 after popping all elements", 0, pilha0.tamanho());

    } catch (Exception e) {
      // Then: if push failed due to capacity, ensure message indicates full and the initial element remains
      String msg = e.getMessage();
      assertNotNull("Full-capacity exception should carry a message", msg);
      String lower = msg.toLowerCase();
      assertTrue("Expected a full-stack related message (e.g. 'cheia' or 'full'): " + msg,
                 lower.contains("cheia") || lower.contains("full") || lower.contains("overflow"));

      // Ensure the initial element was not lost
      assertEquals("On failed second push the stack should still contain the initial element", 1, pilha0.tamanho());
      Object remaining = pilha0.desempilha();
      assertSame("Remaining element should be the initially pushed marker", marker, remaining);
      assertTrue("Stack should be empty after removing remaining element", pilha0.vazia());
    }
  }

  /**
   * REQ-STACK-003
   * Given an empty stack, When empilha(null) is invoked, Then tamanho() increases and desempilha() returns null.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertTrue("Precondition: stack starts empty", pilha0.vazia());
    assertEquals("Precondition: tamanho() should be 0", 0, pilha0.tamanho());

    // When
    pilha0.empilha(null);

    // Then
    assertEquals("After pushing null the size should be 1", 1, pilha0.tamanho());
    Object popped = pilha0.desempilha();
    assertNull("Desempilha should return the null that was pushed", popped);
    assertTrue("Stack should be empty after popping the null", pilha0.vazia());
    assertEquals("Size should return to 0 after popping", 0, pilha0.tamanho());
  }

  /**
   * REQ-STACK-004
   * Given a new stack, it must report size 0 and be empty. Pushing and popping a single element should
   * update size and emptiness accordingly and preserve LIFO semantics.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Then: initial properties
    assertEquals("New stack should report size 0", 0, pilha0.tamanho());
    assertTrue("New stack should be empty", pilha0.vazia());

    // When: push a single element
    String element = "x";
    pilha0.empilha(element);

    // Then: size and state updated
    assertEquals("Size after one push should be 1", 1, pilha0.tamanho());
    assertFalse("Stack should not be empty after one push", pilha0.vazia());

    // When: pop the element
    Object popped = pilha0.desempilha();

    // Then: popped element and final state
    assertEquals("Popped element should equal the pushed value", element, popped);
    assertTrue("Stack should be empty after popping the only element", pilha0.vazia());
    assertEquals("Size should be 0 after popping the only element", 0, pilha0.tamanho());
  }
}