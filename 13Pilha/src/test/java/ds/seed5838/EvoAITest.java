package ds.seed5838;

import ds.Pilha;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved tests for ds.Pilha (stack) fulfilling basic functional requirements.
 *
 * Requirement reference: REQ-STACK-001 - Basic stack operations (push, pop, size) and error handling.
 *
 * Notes:
 * - Tests follow Given-When-Then structure in the comments.
 * - Assertions include descriptive messages and validate both behaviour and error messages.
 */
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * GIVEN an empty stack
   * WHEN attempting to pop from the empty stack
   * THEN an Exception is raised with a clear "empty stack" message and the size remains zero.
   *
   * Ticket: STACK-EMPTY-TRYPOP
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Precondition checks
    assertEquals("Newly created stack should be empty", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected an Exception when popping from an empty stack");
    } catch (Exception e) {
      // Verify the exception message is specific and helpful.
      assertNotNull("Exception message should not be null", e.getMessage());
      assertEquals("Unexpected exception message when popping empty stack",
          "Erro: A pilha esta vazia", e.getMessage());
      // Ensure the stack remained unchanged
      assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * GIVEN a stack that is used and then filled until capacity
   * WHEN continuing to push beyond capacity
   * THEN an Exception is raised with a clear "full stack" message and the size equals the capacity.
   *
   * Ticket: STACK-FULL-PUSH
   *
   * Note: This test does not rely on internal implementation details; it fills the stack via public API
   * until an exception occurs.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: start with a fresh stack and perform a small sequence of operations
    Pilha pilha0 = new Pilha();

    // Use a simple push/pop to verify basic behaviour before filling
    pilha0.empilha("initial");
    Object popped = pilha0.desempilha();
    assertEquals("Popped value should match the pushed value", "initial", popped);

    // Ensure stack is empty again
    assertEquals("Stack should be empty after pop", 0, pilha0.tamanho());

    // When: push one element to make stack non-empty
    pilha0.empilha("marker");
    assertEquals("Stack should have 1 element after one push", 1, pilha0.tamanho());

    // Then: keep pushing until the stack reports full by throwing an Exception
    Exception caught = null;
    int successfulPushes = 0;
    // Use a reasonable hard limit to avoid infinite loop if implementation never throws
    final int MAX_ATTEMPTS = 1000;
    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      try {
        pilha0.empilha("v-" + i);
        successfulPushes++;
      } catch (Exception e) {
        caught = e;
        break;
      }
    }

    assertNotNull("Expected an exception when filling the stack to capacity, but none was thrown", caught);
    assertEquals("Unexpected exception message when pushing to a full stack",
        "Erro: A pilha esta cheia", caught.getMessage());

    // The reported size should equal the number of successful pushes
    assertEquals("Stack size should equal number of successful pushes (capacity)",
        successfulPushes + 1, // +1 for the earlier "marker" push
        pilha0.tamanho());
  }

  /**
   * GIVEN an empty stack
   * WHEN pushing and popping multiple elements
   * THEN size reflects pushes/pops and pop returns elements in LIFO order, including handling of null.
   *
   * Ticket: STACK-SIZE-LIFO
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("New stack should have size 0", 0, pilha0.tamanho());

    // When: push two distinct elements
    pilha0.empilha("first");
    assertEquals("Size should be 1 after one push", 1, pilha0.tamanho());

    pilha0.empilha("second");
    assertEquals("Size should be 2 after two pushes", 2, pilha0.tamanho());

    // Then: pop should follow LIFO - second pushed is popped first
    Object popped1 = pilha0.desempilha();
    assertEquals("Popped element should be the last pushed (LIFO)", "second", popped1);
    assertEquals("Size should decrease after a pop", 1, pilha0.tamanho());

    // Push a null and verify it is correctly handled
    pilha0.empilha(null);
    assertEquals("Size should increase after pushing null", 2, pilha0.tamanho());

    Object popped2 = pilha0.desempilha();
    assertNull("Popped element should be the null that was pushed", popped2);
    assertEquals("Size should decrease after popping null", 1, pilha0.tamanho());

    // Finally pop the remaining element and verify stack becomes empty
    Object popped3 = pilha0.desempilha();
    assertEquals("Final popped element should be the first pushed value", "first", popped3);
    assertEquals("Stack should be empty after popping all elements", 0, pilha0.tamanho());
  }
}