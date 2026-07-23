package ds.seed6733;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.reflect.Field;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface to categorize unit tests.
 */
interface UnitTest {}

/**
 * Marker interface to categorize edge-case tests (exceptional flows).
 */
interface EdgeCaseTest {}

/**
 * Improved test suite for ds.Pilha.
 *
 * Traceability:
 * - Requirement: REQ-STACK-001 (Basic stack behavior: push, pop, size, empty)
 * - Requirement: REQ-STACK-002 (Error handling for underflow/overflow)
 *
 * Note: Tests follow Given-When-Then structure in comments and include
 * descriptive assertion messages.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack,
   * When desempilha (pop) is called,
   * Then an Exception indicating the stack is empty must be thrown.
   *
   * Requirement: REQ-STACK-002
   */
  @Test(timeout = 4000)
  @Category(EdgeCaseTest.class)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null when popping empty stack.", msg);
      assertTrue("Expected exception message to indicate the stack is empty (contains 'vazia'), but was: " + msg,
          msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }

  /**
   * Given a stack that has been artificially constrained to zero capacity,
   * When empilha (push) is attempted,
   * Then an Exception indicating the stack is full must be thrown and the stack size must remain unchanged.
   *
   * Requirement: REQ-STACK-002
   */
  @Test(timeout = 4000)
  @Category(EdgeCaseTest.class)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Use reflection to avoid coupling to implementation visibility.
    // Set internal storage array to zero-length to simulate a full/zero-capacity stack.
    try {
      Field itemField = pilha0.getClass().getDeclaredField("item");
      itemField.setAccessible(true);
      Object[] zeroArray = new Object[0];
      itemField.set(pilha0, zeroArray);
    } catch (NoSuchFieldException nsfe) {
      // If the internal field is not present, fail the test as we cannot simulate the edge reliably.
      fail("Unable to access internal storage field 'item' to simulate full stack: " + nsfe.getMessage());
    }

    int sizeBefore = pilha0.tamanho();

    // When / Then
    try {
      pilha0.empilha(null);
      fail("Expected Exception when pushing onto a full/zero-capacity stack, but no exception was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null when pushing to a full stack.", msg);
      assertTrue("Expected exception message to indicate the stack is full (contains 'cheia' or 'full'), but was: " + msg,
          msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
      // Ensure no side-effect on size
      assertEquals("Stack size should remain unchanged after failed push attempt.", sizeBefore, pilha0.tamanho());
    }
  }

  /**
   * Given an empty stack,
   * When an object is pushed and then popped,
   * Then the stack size and emptiness reflect the operations and the popped object is the same instance.
   *
   * Requirement: REQ-STACK-001
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    Object object0 = new Object();

    // When: push
    pilha0.empilha(object0);

    // Then: after push
    assertEquals("After one push, size() should return 1.", 1, pilha0.tamanho());
    assertFalse("After one push, vazia() should be false.", pilha0.vazia());

    // When: pop
    Object popped = pilha0.desempilha();

    // Then: after pop
    assertSame("Pop should return the exact object that was pushed.", object0, popped);
    assertTrue("After popping the only element, the stack should be empty.", pilha0.vazia());
    assertEquals("After popping the only element, size() should return 0.", 0, pilha0.tamanho());
  }

  /**
   * Given a newly created stack,
   * When queried for size and emptiness and an attempt to pop is made,
   * Then size==0, vazia()==true, and popping throws an appropriate exception.
   *
   * Requirement: REQ-STACK-001 and REQ-STACK-002
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Then: initial properties
    assertEquals("A newly created stack should have size 0.", 0, pilha0.tamanho());
    assertTrue("A newly created stack should be empty (vazia()==true).", pilha0.vazia());

    // When / Then: popping empty stack should throw
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
    } catch (Exception e) {
      String msg = e.getMessage();
      assertNotNull("Exception message for empty-pop should not be null.", msg);
      assertTrue("Exception message should indicate an empty stack (contains 'vazia' or 'empty'), but was: " + msg,
          msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));
    }
  }
}