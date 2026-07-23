package ds.seed7992;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests so they can be selected by category.
 * Defined at package-level so it can be referenced by the test class.
 */
interface UnitTest {}

/**
 * Improved tests for ds.Pilha.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Tests include requirement identifiers in their Javadoc for traceability.
 * - Tests avoid direct manipulation of Pilha internals and exercise behavior via the public API.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-STACK-001: Popping an empty stack must throw a descriptive exception.
   *
   * Given an empty Pilha
   * When desempilha is called
   * Then an Exception is thrown and the stack remains empty
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Pre-check: the stack starts empty
    assertEquals("Precondition: new stack should have size 0", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception (REQ-STACK-001): popping an empty stack should throw an exception");
    } catch (Exception e) {
      // Verify that the exception message references an empty stack in a robust way.
      String msg = e.getMessage();
      assertNotNull("Exception message should not be null", msg);
      assertTrue("Exception message should indicate the stack is empty",
          msg.toLowerCase().contains("vazia") || msg.toLowerCase().contains("empty"));

      // The stack should remain empty after the failed pop
      assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * REQ-STACK-002: Pushing an element and then popping it should return the same element and update size.
   *
   * Given a new Pilha
   * When one element is empilha'd and then desempilha'd
   * Then the popped element equals the pushed element and size is updated to 0
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    String value = "element-1";

    // When
    pilha0.empilha(value);

    // Then: size should be 1
    assertEquals("After pushing one element, size should be 1", 1, pilha0.tamanho());

    // When: pop the element
    Object popped = pilha0.desempilha();

    // Then: popped element should match and size should be 0
    assertEquals("Popped element should be the same as pushed element", value, popped);
    assertEquals("After popping the only element, size should be 0", 0, pilha0.tamanho());
  }

  /**
   * REQ-STACK-003: Empilha should throw when the stack reaches its capacity.
   *
   * Given a new Pilha
   * When elements are pushed until capacity is reached
   * Then an exception should be thrown indicating the stack is full
   *
   * This test pushes repeatedly until an exception is observed or a safe upper bound is reached.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    final int MAX_ATTEMPTS = 1024; // safety bound to avoid infinite loops if there is no capacity
    int pushed = 0;
    boolean threw = false;

    // When: keep pushing until exception or limit reached
    for (int i = 0; i < MAX_ATTEMPTS; i++) {
      try {
        pilha0.empilha(i);
        pushed++;
      } catch (Exception e) {
        // Then: verify exception indicates a full stack
        String msg = e.getMessage();
        assertNotNull("Exception message should not be null when stack is full", msg);
        assertTrue("Exception message should indicate the stack is full",
            msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        // The reported size should be positive and no greater than the number of successful pushes
        int sizeAfter = pilha0.tamanho();
        assertTrue("Size after full-stack exception should be >= 0", sizeAfter >= 0);
        assertTrue("Size after exception should be <= number of successful pushes", sizeAfter <= pushed);
        threw = true;
        break;
      }
    }

    if (!threw) {
      // If no exception was thrown within the allowed attempts, fail the test with diagnostic info.
      fail("Expected a full-stack exception within " + MAX_ATTEMPTS + " pushes (REQ-STACK-003). " +
           "Pushed elements: " + pushed + ". Current size: " + pilha0.tamanho());
    }
  }

  /**
   * REQ-STACK-004: New stack should report size 0; pushing increases size and popping follows LIFO.
   *
   * Given a new Pilha
   * When multiple elements are pushed and popped
   * Then size updates correctly and pop order is LIFO
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // Then: initial size is 0
    assertEquals("New stack should have size 0 (REQ-STACK-004)", 0, pilha0.tamanho());

    // When: push two elements
    String first = "first";
    String second = "second";
    pilha0.empilha(first);
    pilha0.empilha(second);

    // Then: size should reflect two elements
    assertEquals("After pushing two elements, size should be 2", 2, pilha0.tamanho());

    // When: pop one element
    Object popped1 = pilha0.desempilha();

    // Then: popped element should be the last pushed (LIFO) and size decremented
    assertEquals("Popped element should follow LIFO order", second, popped1);
    assertEquals("Size should be 1 after one pop", 1, pilha0.tamanho());

    // When: pop the remaining element
    Object popped2 = pilha0.desempilha();

    // Then: popped element should be the first pushed and size is back to 0
    assertEquals("Second popped element should be the first pushed", first, popped2);
    assertEquals("Size should return to 0 after popping all elements", 0, pilha0.tamanho());
  }
}