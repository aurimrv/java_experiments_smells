package ds.seed5482;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Test that popping an empty stack throws an exception with a descriptive message
   * and that the stack remains empty after the failed pop.
   *
   * Requirement: STACK-001 - Popping an empty stack must raise an error.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: a new, empty stack
      Pilha pilha0 = new Pilha();
      assertEquals("New stack should have size 0", 0, pilha0.tamanho());

      // When / Then: attempting to pop should throw an Exception indicating the stack is empty
      try {
          pilha0.desempilha();
          fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
      } catch (Exception e) {
          // Verify the exception indicates the stack is empty and that no side-effects occurred.
          String message = e.getMessage();
          assertNotNull("Exception message should not be null", message);
          assertTrue("Expected exception message to mention that the stack is empty, but was: " + message,
                  message.toLowerCase().contains("vazia") || message.toLowerCase().contains("empty"));
          // The stack should remain empty after the failed operation.
          assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
      }
  }

  /**
   * Test pushing and popping a single object preserves identity and updates size accordingly.
   *
   * Requirement: STACK-002 - Pushing increases size; popping returns the last pushed element and decreases size.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: an empty stack and a sample object to push
      Pilha pilha0 = new Pilha();
      Object object0 = new Object();
      assertEquals("Initially, stack should be empty", 0, pilha0.tamanho());

      // When: push the object onto the stack
      pilha0.empilha(object0);

      // Then: size should reflect the pushed element
      assertEquals("After one push, stack size should be 1", 1, pilha0.tamanho());

      // When: pop the element
      Object popped = pilha0.desempilha();

      // Then: the popped element is the same instance that was pushed, and size is back to zero
      assertSame("Popped object should be the same instance that was pushed", object0, popped);
      assertEquals("After popping the only element, stack size should return to 0", 0, pilha0.tamanho());
  }

  /**
   * Test that querying size is idempotent on a new stack and that repeated queries do not change state.
   *
   * Requirement: STACK-003 - Query operations (like size) must be side-effect free.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given: a newly created stack
      Pilha pilha0 = new Pilha();

      // When: querying size multiple times
      int sizeFirst = pilha0.tamanho();
      int sizeSecond = pilha0.tamanho();

      // Then: repeated queries should be consistent and non-negative
      assertEquals("Size should be consistent across repeated calls", sizeFirst, sizeSecond);
      assertTrue("Initial size should be non-negative", sizeFirst >= 0);
      assertEquals("New stack should start with size 0", 0, sizeFirst);

      // And: verifying that a pop still throws and does not alter the reported size
      try {
          pilha0.desempilha();
          fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
      } catch (Exception e) {
          String message = e.getMessage();
          assertNotNull("Exception message should not be null", message);
          assertTrue("Expected exception message to indicate empty stack", message.toLowerCase().contains("vazia") || message.toLowerCase().contains("empty"));
          // Ensure state unchanged
          assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
      }
  }
}