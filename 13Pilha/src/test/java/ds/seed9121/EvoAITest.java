package ds.seed9121;

import ds.Pilha;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Tests for ds.Pilha (stack) behaviors.
 *
 * Traceability:
 * - REQ-STACK-001: Popping an empty stack must throw a descriptive Exception.
 * - REQ-STACK-002: Pushing an element increases size and popping returns the same element.
 * - REQ-STACK-003: Multiple pushes follow LIFO order and size updates accordingly.
 * - REQ-STACK-004: An empty stack reports size 0 and is empty.
 *
 * These tests use Given-When-Then structure in the bodies and include descriptive assertion messages
 * to aid diagnostics. They target public API methods only (empilha, desempilha, tamanho, vazia).
 */
public class EvoAITest {

  /**
   * Given an empty stack,
   * When desempilha is called,
   * Then an Exception with the expected message is thrown.
   *
   * Requirement: REQ-STACK-001
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha = new Pilha();

    // When / Then
    try {
      pilha.desempilha();
      fail("Expected Exception when popping from an empty stack (desempilha).");
    } catch (Exception e) {
      assertNotNull("Exception thrown should not be null.", e);
      assertEquals("Exception message must indicate empty stack.",
          "Erro: A pilha esta vazia", e.getMessage());
    }
  }

  /**
   * Given a fresh stack,
   * When an element is pushed,
   * Then tamanho() reflects the push and desempilha() returns the same element;
   * finally the stack is empty again.
   *
   * Requirement: REQ-STACK-002
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    String element = "";

    // When
    pilha.empilha(element);

    // Then
    assertEquals("After one empilha, tamanho() should be 1.", 1, pilha.tamanho());
    Object popped = pilha.desempilha();
    assertEquals("desempilha() should return the element that was pushed.", element, popped);
    assertTrue("After popping the only element the stack should be empty (vazia() == true).", pilha.vazia());
  }

  /**
   * Given a stack,
   * When multiple distinct objects are pushed,
   * Then desempilha() returns them in LIFO order and tamanho() updates accordingly.
   *
   * Requirement: REQ-STACK-003
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha = new Pilha();
    Object a = new Object();
    Object b = new Object();
    Object c = new Object();

    // When
    pilha.empilha(a);
    pilha.empilha(b);
    pilha.empilha(c);

    // Then
    assertEquals("After three empilha calls, tamanho() should be 3.", 3, pilha.tamanho());
    Object firstPop = pilha.desempilha();
    assertSame("First desempilha should return the last pushed element (LIFO).", c, firstPop);
    assertEquals("tamanho() should decrement after a desempilha.", 2, pilha.tamanho());
    Object secondPop = pilha.desempilha();
    assertSame("Second desempilha should return the previous pushed element.", b, secondPop);
    Object thirdPop = pilha.desempilha();
    assertSame("Third desempilha should return the first pushed element.", a, thirdPop);
    assertEquals("After popping all elements, tamanho() should be 0.", 0, pilha.tamanho());
    assertTrue("After all pops, stack should be empty (vazia() == true).", pilha.vazia());
  }

  /**
   * Given a newly created stack,
   * Then tamanho() returns 0 and vazia() is true. Also attempting to desempilha()
   * produces the expected exception message.
   *
   * Requirement: REQ-STACK-004
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Pilha pilha = new Pilha();

    // Then initial invariants hold
    assertEquals("New stack should report size 0 via tamanho().", 0, pilha.tamanho());
    assertTrue("New stack should report vazia() == true.", pilha.vazia());

    // When attempting to pop an empty stack, the contract requires an exception
    try {
      pilha.desempilha();
      fail("Expected an Exception when calling desempilha() on an empty stack.");
    } catch (Exception e) {
      assertEquals("Exception message must indicate empty stack.",
          "Erro: A pilha esta vazia", e.getMessage());
    }
  }
}