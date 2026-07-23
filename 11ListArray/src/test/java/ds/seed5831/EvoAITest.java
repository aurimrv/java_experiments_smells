package ds.seed5831;

import ds.Lista;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Lista exercising basic public behaviours.
 *
 * Requirement traceability:
 * - REQ-001: Basic list operations (vazia, insere, imprime) must behave without throwing for normal inputs.
 *
 * Notes:
 * - Tests exercise public API only (no internal field manipulation).
 * - Tests follow Given-When-Then style comments for clarity.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a newly created list
    Lista lista = new Lista();

    // When: we inspect its emptiness and attempt to print its contents
    boolean initiallyEmpty = lista.vazia();
    try {
      lista.imprime(); // Should be a no-op or print nothing but must not throw for an empty list
    } catch (RuntimeException e) {
      // Then: fail with a clear message indicating imprime() should be safe on an empty list
      fail("imprime() on a newly created empty Lista should not throw, but it threw: " + e);
    }

    // Then: the list reports it is empty
    assertTrue("A newly created Lista should report vazia() == true", initiallyEmpty);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a new list
    Lista lista = new Lista();

    // When: we insert a single element
    String element = "element-1";
    try {
      lista.insere(element);
    } catch (Exception e) {
      fail("insere(element) should succeed for a single element insertion, but threw: " + e);
    }

    // Then: the list should no longer be empty and printing should not throw
    assertFalse("After inserting one element, vazia() should be false", lista.vazia());
    try {
      lista.imprime();
    } catch (RuntimeException e) {
      fail("imprime() after inserting one element should not throw, but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: a new list
    Lista lista = new Lista();

    // When: we insert two distinct elements (simple growth scenario)
    Object first = "first";
    Object second = "second";
    try {
      lista.insere(first);
      lista.insere(second);
    } catch (Exception e) {
      fail("Inserting two elements in succession should not throw for a normally sized Lista, but threw: " + e);
    }

    // Then: the list remains non-empty
    assertFalse("Lista should be non-empty after two insertions", lista.vazia());

    // And printing the list should be safe
    try {
      lista.imprime();
    } catch (RuntimeException e) {
      fail("imprime() after two insertions should not throw, but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: a new list
    Lista lista = new Lista();

    // When: inserting the list object into itself (self-referential insertion)
    // This checks that insere accepts arbitrary objects and does not immediately cause a failure.
    try {
      lista.insere(lista);
    } catch (Exception e) {
      fail("insere(self) should not throw an unexpected exception; caught: " + e);
    }

    // Then: the list reports non-empty and can be printed without throwing
    assertFalse("After inserting the list into itself, vazia() should be false", lista.vazia());
    try {
      lista.imprime();
    } catch (RuntimeException e) {
      fail("imprime() after self-insertion should not throw, but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given: a fresh list
    Lista lista = new Lista();

    // When: perform a sequence of operations that represent a typical usage scenario
    try {
      lista.insere("alpha");
      lista.insere("beta");
      lista.insere("gamma");
    } catch (Exception e) {
      fail("Typical multiple insertions should not throw for a functioning Lista implementation, but threw: " + e);
    }

    // Then: the list should not be empty and printing should be successful
    assertFalse("Lista should not be empty after multiple insertions", lista.vazia());
    try {
      lista.imprime();
    } catch (RuntimeException e) {
      fail("imprime() after multiple insertions should not throw, but threw: " + e);
    }
  }
}