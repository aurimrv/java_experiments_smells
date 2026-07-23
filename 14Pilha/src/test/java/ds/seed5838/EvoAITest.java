package ds.seed5838;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface to tag tests that address functional requirements.
 * Defined at package level so it can be referenced by @Category.
 */
interface Requirement {}

/*
 * Improved and more descriptive tests for Pilha.
 * Each test method is kept with the original name (test0, test1, test2)
 * but refactored to include clearer assertions, messages, and simple
 * requirement linkage via @Category(Requirement.class).
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

  /**
   * REQ-001: Popping an empty stack must throw an Exception with a clear message.
   *
   * Given an empty Pilha,
   * When desempilha is invoked,
   * Then an Exception is thrown and the stack remains empty.
   */
  @Test(timeout = 4000)
  @Category(Requirement.class)
  public void test0() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("REQ-001 Precondition: newly created stack should have size 0", 0, pilha0.tamanho());

    // When / Then
    try {
      pilha0.desempilha();
      fail("REQ-001: Expected Exception when popping an empty stack (desempilha)");
    } catch (Exception e) {
      // Verify the exception type and message to make failure reasons explicit
      assertTrue("REQ-001: Expected an Exception to be thrown when popping empty stack", e instanceof Exception);
      String expectedMessage = "Erro: A pilha esta vazia";
      assertEquals("REQ-001: Exception message must indicate the stack is empty", expectedMessage, e.getMessage());
      // Stack should still be empty after the failed operation
      assertEquals("REQ-001: Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
    }
  }

  /**
   * REQ-002: Pushing a null element should be supported.
   *
   * Given an empty Pilha,
   * When empilha(null) is invoked,
   * Then tamanho reflects the pushed element and desempilha returns null restoring size.
   */
  @Test(timeout = 4000)
  @Category(Requirement.class)
  public void test1() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("REQ-002 Precondition: stack must start empty", 0, pilha0.tamanho());

    // When
    pilha0.empilha((Object) null);

    // Then - multiple, descriptive assertions to validate behavior
    assertEquals("REQ-002 After empilha(null) the size should be 1", 1, pilha0.tamanho());
    Object popped = pilha0.desempilha();
    assertNull("REQ-002 desempilha should return the previously pushed null value", popped);
    assertEquals("REQ-002 After desempilha the size should return to 0", 0, pilha0.tamanho());
  }

  /**
   * REQ-003: Basic push/pop operations should behave as LIFO and adjust size accordingly.
   *
   * Given a new Pilha,
   * When multiple empilha operations are performed,
   * Then desempilha returns elements in reverse order and tamanho updates correctly.
   */
  @Test(timeout = 4000)
  @Category(Requirement.class)
  public void test2() throws Throwable {
    // Given
    Pilha pilha0 = new Pilha();
    assertEquals("REQ-003 Newly created stack must have size 0", 0, pilha0.tamanho());

    // When - push two elements
    pilha0.empilha("first");
    pilha0.empilha("second");

    // Then - size should reflect two elements and popped order should be LIFO
    assertEquals("REQ-003 Size after two pushes should be 2", 2, pilha0.tamanho());
    Object popped1 = pilha0.desempilha();
    assertEquals("REQ-003 First pop should return the last pushed element ('second')", "second", popped1);
    assertEquals("REQ-003 Size after one pop should be 1", 1, pilha0.tamanho());
    Object popped2 = pilha0.desempilha();
    assertEquals("REQ-003 Second pop should return the first pushed element ('first')", "first", popped2);
    assertEquals("REQ-003 Final size after popping all elements should be 0", 0, pilha0.tamanho());
  }
}