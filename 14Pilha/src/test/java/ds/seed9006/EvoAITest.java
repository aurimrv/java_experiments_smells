package ds.seed9006;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved and cleaned-up tests for ds.Pilha.
 *
 * These tests exercise basic stack behavior:
 * - popping from an empty stack should raise an Exception with an explanatory message
 * - pushing then popping returns the pushed element and restores size
 * - a newly created stack reports size 0
 *
 * Each test follows a Given-When-Then structure in comments and includes assertions
 * with descriptive messages to make failures easier to diagnose.
 *
 * Requirement traceability:
 * - REQ-STACK-001: Stack must report correct size for empty/new stacks
 * - REQ-STACK-002: Popping empty stack must throw an exception with a clear message
 * - REQ-STACK-003: Pushing and popping must preserve LIFO semantics and size changes
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * REQ-STACK-002
   *
   * Given an empty stack,
   * When desempilha() is invoked,
   * Then an Exception is thrown indicating the stack is empty and the size remains zero.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Sanity pre-condition
    assertEquals("Pre-condition: newly created stack should have size 0", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
    } catch (Exception e) {
      // Verify exception type and message are meaningful.
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null when popping empty stack", msg);
      // Message contents checked to be robust against minor wording differences but ensure intent present.
      assertTrue("Exception message should indicate that the stack is empty. Actual message: " + msg,
          msg.toLowerCase().contains("pilha") && msg.toLowerCase().contains("vazia"));
      // Ensure state unchanged
      assertEquals("Stack size should remain 0 after failed pop from empty stack", 0, pilha0.tamanho());
    }
  }

  /**
   * REQ-STACK-003
   *
   * Given an empty stack,
   * When empilha(\"\") is invoked and then desempilha() is invoked,
   * Then the popped value is the empty string and the stack size returns to zero.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("Pre-condition: stack should start empty", 0, pilha0.tamanho());

    // When: push an empty string
    pilha0.empilha("");
    // Then: size should reflect push
    assertEquals("After pushing one element, size should be 1", 1, pilha0.tamanho());

    // When: pop the value
    Object popped = pilha0.desempilha();

    // Then: verify popped value and resulting size
    assertNotNull("Popped value should not be null (should be the pushed empty string)", popped);
    assertTrue("Popped value should be an instance of String", popped instanceof String);
    assertEquals("Popped value should equal the pushed empty string", "", popped);
    assertEquals("After popping the only element, size should return to 0", 0, pilha0.tamanho());
  }

  /**
   * REQ-STACK-001
   *
   * Given a newly created stack,
   * When tamanho() is queried,
   * Then it should return 0 and subsequent pop attempts should raise the expected exception.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // When / Then: tamanho reports zero for a new stack
    int int0 = pilha0.tamanho();
    assertEquals("Newly created stack must report size 0", 0, int0);

    // Additionally verify behavior on pop to ensure empty-stack behavior is consistent
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack created in test2, but no exception was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception message should be provided for empty-stack pop", msg);
      assertTrue("Exception message should indicate empty stack (contains 'pilha' and 'vazia'). Actual: " + msg,
          msg.toLowerCase().contains("pilha") && msg.toLowerCase().contains("vazia"));
    }

    // Final state check
    assertEquals("After attempted pop, stack size should still be 0", 0, pilha0.tamanho());
  }
}