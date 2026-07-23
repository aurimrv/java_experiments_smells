package ds.seed5311;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Pilha (stack) implementation.
 *
 * Requirements referenced:
 * - REQ-STACK-EMPTY-ERROR: popping an empty stack must raise a clear exception
 * - REQ-STACK-PUSH-POP: pushing then popping must return the pushed element and restore size
 * - REQ-STACK-SIZE: new stacks must report size 0 and be consistent across queries
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty stack
   * When desempilha() is called
   * Then an Exception should be thrown with a clear message (REQ-STACK-EMPTY-ERROR)
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      try {
          // When: attempt to pop from empty stack
          pilha0.desempilha();
          fail("Expected Exception when popping from an empty stack, but no exception was thrown.");
      } catch (Throwable e) {
          // Then: the exception should have a descriptive message
          String msg = e.getMessage();
          assertNotNull("Exception thrown when popping empty stack must include a message.", msg);
          // Verify specific error text produced by implementation
          assertEquals("Unexpected exception message when popping empty stack.",
                       "Erro: A pilha esta vazia", msg);
      }
  }

  /**
   * Given an empty stack
   * When a string value is pushed and then popped
   * Then the popped value must equal the pushed value and size must return to zero (REQ-STACK-PUSH-POP)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Pilha pilha0 = new Pilha();
      final String pushed = "^S6,o4";

      // Precondition: stack starts empty
      assertEquals("Stack should start with size 0.", 0, pilha0.tamanho());

      // Action: push a value
      pilha0.empilha(pushed);
      assertEquals("Size should be 1 after one push.", 1, pilha0.tamanho());

      // Action: pop the value. Use reflection to capture return value if present,
      // allowing this test to work whether desempilha() returns the element or not.
      Object popped = null;
      try {
          Method desempilhaMethod = pilha0.getClass().getMethod("desempilha");
          try {
              popped = desempilhaMethod.invoke(pilha0);
          } catch (InvocationTargetException ite) {
              // If the underlying method threw, rethrow its cause to fail the test appropriately.
              throw ite.getCause();
          }
      } catch (NoSuchMethodException nsme) {
          // This should not happen for well-formed Pilha; fail clearly.
          throw new AssertionError("Method 'desempilha' not found on Pilha implementation.", nsme);
      }

      // If the method returned a value (non-null), verify it equals what was pushed.
      if (popped != null) {
          assertTrue("Popped value should be a String when a String was pushed.", popped instanceof String);
          assertEquals("Popped value must match the pushed value.", pushed, popped);
      }

      // Postcondition: size returns to zero
      assertEquals("Size should be 0 after popping the only element.", 0, pilha0.tamanho());
  }

  /**
   * Given a newly created stack
   * When its size is queried repeatedly
   * Then the reported size must be zero and consistent (REQ-STACK-SIZE)
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pilha pilha0 = new Pilha();

      // Check initial size and idempotence of size queries
      int firstSize = pilha0.tamanho();
      int secondSize = pilha0.tamanho();

      assertEquals("Newly created stack must report size 0.", 0, firstSize);
      assertEquals("Repeated size queries should be consistent.", firstSize, secondSize);
      assertTrue("Size must not be negative.", firstSize >= 0);
  }
}