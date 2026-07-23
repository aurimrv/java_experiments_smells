package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Pilha;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and human-maintained tests for ds.Pilha.
 *
 * Traceability:
 * - REQ-STACK-001: Pushing increases size and pop returns last pushed element (LIFO).
 * - REQ-STACK-002: Popping an empty stack throws an exception indicating the stack is empty.
 *
 * Each test follows a Given-When-Then structure and performs multiple assertions
 * to increase fault detection capability.
 */
public class EvoAITest {

  /**
   * Given an empty stack,
   * When attempting to pop,
   * Then an exception must be thrown and the stack remains empty.
   *
   * REQ: REQ-STACK-002
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("New stack should have size 0", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected an exception when popping an empty stack");
    } catch (Exception e) {
      // Verify exception contains an indication that the stack is empty.
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null", msg);
      String lower = msg.toLowerCase();
      assertTrue("Exception message should indicate the stack is empty",
          lower.contains("vazia") || lower.contains("empty") || lower.contains("vazio"));

      // Ensure the state has not changed after the failed pop.
      assertEquals("Size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * Given an empty stack,
   * When an element is pushed and then popped,
   * Then the popped element must equal the pushed element and the size should reflect operations.
   *
   * REQ: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("Initial size must be 0", 0, pilha0.tamanho());

    // When: push one element
    String element = ">";
    pilha0.empilha(element);

    // Then: size increased
    assertEquals("Size should be 1 after one push", 1, pilha0.tamanho());

    // When: pop the element
    Object popped = pilha0.desempilha();

    // Then: popped element is the one that was pushed (LIFO) and size is back to zero
    assertEquals("Popped element must match pushed element", element, popped);
    assertEquals("Size should be 0 after popping the only element", 0, pilha0.tamanho());
  }

  /**
   * Given a newly created stack,
   * When multiple elements are pushed and one is popped,
   * Then size changes accordingly and pop follows LIFO order.
   *
   * REQ: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("New stack should start with size 0", 0, pilha0.tamanho());

    // When: push several elements
    pilha0.empilha("a");
    pilha0.empilha("b");
    pilha0.empilha("c");

    // Then: size reflects pushes
    assertEquals("Size should be 3 after pushing three elements", 3, pilha0.tamanho());

    // When: pop one element
    Object top = pilha0.desempilha();

    // Then: popped element is the last pushed and size decreased by one
    assertEquals("Pop should follow LIFO and return 'c'", "c", top);
    assertEquals("Size should be 2 after one pop", 2, pilha0.tamanho());

    // Cleanup and final assertions: pop remaining elements and ensure empty
    Object second = pilha0.desempilha();
    Object third = pilha0.desempilha();
    assertEquals("Second popped element should be 'b'", "b", second);
    assertEquals("Third popped element should be 'a'", "a", third);
    assertEquals("Stack should be empty after popping all elements", 0, pilha0.tamanho());
  }
}