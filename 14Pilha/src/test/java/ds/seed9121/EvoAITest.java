/*
 * Improved unit tests for ds.Pilha
 * - Rewritten to provide clearer intent, additional assertions, and Given-When-Then structure.
 * - Each test contains a brief Javadoc linking to a (sample) requirement identifier for traceability.
 *
 * Note: These tests assume the presence of ds.Pilha and test scaffolding class Pilha_ESTest_scaffolding
 * in the test runtime.
 */
package ds.seed9121;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.Pilha;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Test class for Pilha (stack) behavior.
 *
 * The original automatically-generated tests were improved to:
 * - Use descriptive assertions with messages,
 * - Follow Given-When-Then structure,
 * - Verify multiple properties (size and return values),
 * - Provide simple traceability references in Javadoc.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Requirement: REQ-STACK-ERR-001
   *
   * Given an empty stack,
   * When attempting to pop (desempilha),
   * Then an Exception is thrown with the expected message and the stack remains empty.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("New stack should be empty (size == 0)", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack");
    } catch (Exception e) {
      // Verify exception message is the one the implementation is expected to produce
      assertEquals("Unexpected exception message",
                   "Erro: A pilha esta vazia",
                   e.getMessage());
      // Verify stack remains unchanged after the failed operation
      assertEquals("Stack should remain empty after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * Requirement: REQ-STACK-HAPPY-001
   *
   * Given a new stack,
   * When pushing and popping elements,
   * Then operations should follow LIFO order and size should update accordingly.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    Object first = new Object();
    Object second = new Object();

    // When: push first element
    pilha0.empilha(first);
    // Then
    assertEquals("Size should be 1 after pushing one element", 1, pilha0.tamanho());

    // When: push second element
    pilha0.empilha(second);
    // Then
    assertEquals("Size should be 2 after pushing two elements", 2, pilha0.tamanho());

    // When: pop should return the last pushed element (LIFO)
    Object popped1 = pilha0.desempilha();
    assertSame("Popped element should be the last pushed (second)", second, popped1);
    assertEquals("Size should decrement to 1 after one pop", 1, pilha0.tamanho());

    // When: pop again returns the first element
    Object popped2 = pilha0.desempilha();
    assertSame("Popped element should now be the first pushed", first, popped2);
    assertEquals("Size should be 0 after popping all elements", 0, pilha0.tamanho());
  }

  /**
   * Requirement: REQ-STACK-INIT-001
   *
   * Given newly created stacks,
   * When no operations have been performed,
   * Then their sizes should be independent and zero; pushing to one stack must not affect another.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: two independent stacks
    Pilha pilha0 = new Pilha();
    Pilha pilha1 = new Pilha();

    // Then: both start empty
    assertEquals("First new stack should be empty", 0, pilha0.tamanho());
    assertEquals("Second new stack should be empty", 0, pilha1.tamanho());

    // When: push onto the first stack only
    String marker = "marker";
    pilha0.empilha(marker);

    // Then: sizes reflect operation and are independent
    assertEquals("First stack should have size 1 after push", 1, pilha0.tamanho());
    assertEquals("Second stack should remain empty", 0, pilha1.tamanho());

    // When: pop the value back from the first stack
    Object popped = pilha0.desempilha();
    assertEquals("Popped value should match the pushed marker", marker, popped);
    assertEquals("First stack should be empty after popping", 0, pilha0.tamanho());
  }
}