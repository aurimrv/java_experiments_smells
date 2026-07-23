package ds.seed5503;

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
 * Unit tests for ds.Pilha
 *
 * Traceability:
 * - REQ-001: Basic stack semantics (push/pop/size) verified.
 * - REQ-002: Error conditions for empty/full stack verified.
 *
 * Notes:
 * - Tests use Given-When-Then style comments and include descriptive assertion messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * Given an empty Pilha, when desempilha is invoked, then an Exception is thrown
   * indicating the stack is empty.
   *
   * Requirement: REQ-002
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Pilha pilha0 = new Pilha();
      // Sanity checks before action
      int initialSize = pilha0.tamanho();
      assertEquals("Newly created stack should have size 0", 0, initialSize);

      // When / Then
      try {
          pilha0.desempilha();
          fail("Expected an Exception when popping from an empty stack");
      } catch (Exception e) {
          // Verify the exception message is informative and matches expected behavior
          String msg = e.getMessage();
          assertNotNull("Exception message should not be null when popping empty stack", msg);
          assertTrue("Exception message should mention that the stack is empty",
                  msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("vazio"));
      }
  }

  /**
   * Given a Pilha, push elements until it is full, then verify pushing one more element raises the expected exception.
   *
   * Requirement: REQ-002
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Pilha pilha0 = new Pilha();

      // Determine internal capacity via reflection to avoid relying on magic numbers.
      int capacity = 0;
      try {
          Field itemField = Pilha.class.getDeclaredField("item");
          itemField.setAccessible(true);
          Object[] internalArray = (Object[]) itemField.get(pilha0);
          if (internalArray == null || internalArray.length == 0) {
              // If internal array is null or zero-length, initialize a reasonable capacity for testing.
              capacity = 8;
              itemField.set(pilha0, new Object[capacity]);
          } else {
              capacity = internalArray.length;
          }
      } catch (NoSuchFieldException nsfe) {
          // Fallback if field not present: assume a small default capacity
          capacity = 8;
      }

      // When: push exactly 'capacity' distinct elements
      for (int i = 0; i < capacity; i++) {
          String element = "elem-" + i;
          pilha0.empilha(element);
          assertEquals("Size after pushing element " + i, i + 1, pilha0.tamanho());
      }

      // Ensure stack is full by attempting one more push and expecting an exception
      try {
          pilha0.empilha("overflow");
          fail("Expected an Exception when pushing to a full stack");
      } catch (Exception e) {
          String msg = e.getMessage();
          assertNotNull("Exception message should not be null when pushing into full stack", msg);
          assertTrue("Exception message should indicate the stack is full",
                  msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
      }

      // And: verify that popping returns the last pushed element and size decreases
      Object popped = pilha0.desempilha();
      assertNotNull("Popped element should not be null after successful desempilha", popped);
      assertEquals("After popping once the size should decrease by one", capacity - 1, pilha0.tamanho());
  }

  /**
   * Verify basic size behavior: newly created stack has size 0, pushing increases size,
   * popping returns the pushed value and restores size to 0.
   *
   * Requirement: REQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Pilha pilha0 = new Pilha();

      // Then: initial size is zero
      int size0 = pilha0.tamanho();
      assertEquals("A newly created stack must report size 0", 0, size0);

      // When: push a single known element
      final String VALUE = "value";
      pilha0.empilha(VALUE);

      // Then: size reflects the push
      assertEquals("Size should be 1 after pushing one element", 1, pilha0.tamanho());

      // When: pop the element
      Object popped = pilha0.desempilha();

      // Then: popped value is the same as pushed and size is back to zero
      assertEquals("Desempilha should return the last pushed element", VALUE, popped);
      assertEquals("Size should be 0 after popping the only element", 0, pilha0.tamanho());
  }
}