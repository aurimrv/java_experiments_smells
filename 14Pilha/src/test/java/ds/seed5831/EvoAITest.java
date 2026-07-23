package ds.seed5831;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to categorize tests as unit tests.
 */
interface UnitTest {}

/**
 * Improved and documented test class for ds.Pilha.
 *
 * Notes:
 * - Tests are annotated with @Category(UnitTest.class) so they can be selected during execution.
 * - Each test includes Given-When-Then comments and clearer assertion messages.
 * - Requirement references are included in Javadoc for traceability.
 */
public class EvoAITest {

  /**
   * REQ-STACK-EMPTY-001: The stack must throw an exception when attempting to pop from an empty stack.
   *
   * Given: a newly created empty Pilha
   * When: attempting to desempilha (pop)
   * Then: an Exception is thrown with a clear message and the stack size remains 0
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // When / Then
    try {
      pilha0.desempilha();
      fail("Expected Exception when popping from an empty stack (desempilha), but no exception was thrown.");
    } catch (Exception e) {
      // Verify the exception message is the expected one and that the stack remains empty
      assertEquals("Unexpected exception message when popping empty stack",
          "Erro: A pilha esta vazia", e.getMessage());
      assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * REQ-STACK-PUSH-POP-001: Pushing an element followed by popping it should return the same element and restore size to 0.
   *
   * Given: a new Pilha and a single element "i"
   * When: empilha followed by desempilha
   * Then: the popped value equals the pushed value and the size reflects the operations
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    String pushed = "i";

    // When: push the element
    pilha0.empilha(pushed);

    // Then: size should be 1 after a single push
    assertEquals("Size should be 1 after one push", 1, pilha0.tamanho());

    // When: pop the element
    Object popped = pilha0.desempilha();

    // Then: popped value matches and size is back to 0
    assertEquals("Popped value should match pushed value", pushed, popped);
    assertEquals("Size should be 0 after popping the only element", 0, pilha0.tamanho());
    assertTrue("Size should never be negative", pilha0.tamanho() >= 0);
  }

  /**
   * REQ-STACK-INIT-001: A newly constructed Pilha must report size 0 and be considered empty.
   *
   * Given: a newly created Pilha
   * When: querying tamanho()
   * Then: the returned size is 0 and non-negative, and the stack is empty
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();

    // When
    int int0 = pilha0.tamanho();

    // Then: verify multiple properties of initial state
    assertEquals("New stack should have size 0", 0, int0);
    assertTrue("New stack should be empty (size == 0)", int0 == 0);
    assertTrue("Initial size should be non-negative", int0 >= 0);

    // Additional sanity: performing a read-only operation should not change size
    assertEquals("Size should remain unchanged after inspection", 0, pilha0.tamanho());
  }
}