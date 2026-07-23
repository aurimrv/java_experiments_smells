package ds.seed5482;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved unit tests for Pilha.
 *
 * Traceability:
 * - REQ-STACK-001: Basic stack semantics (push, pop, empty, size)
 * - REQ-STACK-002: Error handling when popping an empty stack
 *
 * The original auto-generated tests were refactored to:
 * - Use Given-When-Then comments
 * - Avoid accessing implementation internals (no direct field access)
 * - Include assertions that verify multiple observable properties
 * - Classify tests with a unit-test category for selective execution
 */
interface UnitTest {}

public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Test: popping an empty stack should raise an exception and leave the stack empty.
   *
   * Given an empty Pilha
   * When desempilha is called
   * Then an exception indicating an empty stack should be thrown and the stack remains empty
   *
   * Links: REQ-STACK-002
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertTrue("Newly created stack should be empty", pilha0.vazia());
    assertEquals("New stack should report size 0", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected an exception when popping from an empty stack");
    } catch (Exception e) {
      // Verify that the exception message indicates the stack is empty (best-effort)
      String msg = e.getMessage();
      assertNotNull("Exception thrown should have a message", msg);
      assertTrue("Exception message should indicate empty stack", msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
      // After the failed operation, the stack should still be empty
      assertTrue("Stack should remain empty after failed pop", pilha0.vazia());
      assertEquals("Size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * Test: push then pop a single element — size should reflect changes and stack emptiness toggles.
   *
   * Given an empty Pilha and an arbitrary object
   * When empilha is called then desempilha is called
   * Then size is incremented after push and returns to zero after pop; stack reports empty again
   *
   * Links: REQ-STACK-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    Object element = new Object();
    assertTrue("Precondition: stack must be empty", pilha0.vazia());
    assertEquals("Precondition: size must be 0", 0, pilha0.tamanho());

    // When: push
    pilha0.empilha(element);

    // Then: observable state after push
    assertFalse("Stack should not be empty after one push", pilha0.vazia());
    assertEquals("Stack size should be 1 after pushing one element", 1, pilha0.tamanho());

    // When: pop
    try {
      pilha0.desempilha();
    } catch (Exception e) {
      // If pop unexpectedly throws, fail with message
      fail("Pop after a successful push should not throw, but threw: " + e.getMessage());
    }

    // Then: observable state after pop
    assertTrue("Stack should be empty after popping the only element", pilha0.vazia());
    assertEquals("Size should be 0 after popping the only element", 0, pilha0.tamanho());
  }

  /**
   * Test: pushing null is handled gracefully — either accepted as a value or rejected with a clear exception.
   *
   * Given a new Pilha
   * When empilha(null) is invoked
   * Then either:
   *  - the stack accepts null (size becomes 1 and null can be popped), or
   *  - the stack rejects null with an informative exception (message indicates why)
   *
   * Links: REQ-STACK-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    Pilha pilha0 = new Pilha();

    // Precondition
    assertTrue("New stack should start empty", pilha0.vazia());
    int sizeBefore = pilha0.tamanho();

    // Attempt to push null and observe behavior
    try {
      pilha0.empilha(null);

      // If push succeeded, verify observable consequences
      assertEquals("If null is accepted, size should increase by 1", sizeBefore + 1, pilha0.tamanho());
      // Try to pop to restore state; pop may throw but that would be unexpected after a successful push
      try {
        pilha0.desempilha();
      } catch (Exception e) {
        fail("Pop after accepting null should not throw, but threw: " + e.getMessage());
      }
      assertEquals("After popping the null, size should return to original", sizeBefore, pilha0.tamanho());
    } catch (Exception e) {
      // If push rejected, ensure message is meaningful (best-effort)
      String msg = e.getMessage();
      assertNotNull("Exception should include a message explaining rejection", msg);
      assertTrue("Exception message should mention capacity or invalid value", msg.toLowerCase().contains("cheia")
          || msg.toLowerCase().contains("full")
          || msg.toLowerCase().contains("null")
          || msg.toLowerCase().contains("inválido")
          || msg.toLowerCase().contains("invalid"));
      // State should be unchanged
      assertEquals("Size should remain unchanged after push failure", sizeBefore, pilha0.tamanho());
      assertTrue("Stack emptiness should be unchanged after push failure", pilha0.vazia() == (sizeBefore == 0));
    }
  }

  /**
   * Test: a newly created Pilha reports size zero and is empty.
   *
   * Given a new Pilha
   * When querying size and emptiness
   * Then size == 0 and vazia() == true
   *
   * Links: REQ-STACK-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    Pilha pilha0 = new Pilha();

    // Given-When
    int size = pilha0.tamanho();
    boolean empty = pilha0.vazia();

    // Then
    assertEquals("New stack should have size 0", 0, size);
    assertTrue("New stack should report empty", empty);
    // Additional invariant: size==0 implies vazia()==true
    assertTrue("Invariant: size 0 implies empty", size == 0 && empty);
  }
}