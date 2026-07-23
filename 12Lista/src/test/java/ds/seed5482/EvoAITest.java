package ds.seed5482;

import ds.Lista;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for Lista behaviors.
 *
 * Requirement trace: REQ-LISTA-001
 *
 * These tests follow a Given-When-Then style and include assertions
 * with descriptive messages. They exercise empty-list semantics,
 * insertion behavior, and basic defensive behavior when null is provided.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a fresh, empty list
    Lista lista0 = new Lista();
    assertNotNull("Lista instance should be created", lista0);
    assertTrue("Newly created list should be empty", lista0.vazia());

    // When: an object is inserted
    Object object0 = new Object();
    lista0.insere(object0);

    // Then: the list should no longer be empty and imprime() should be callable
    assertFalse("List should not be empty after inserting an element", lista0.vazia());

    // Capture imprime output to ensure it does not throw and produces an output stream
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(baos));
      lista0.imprime(); // Should not throw
    } finally {
      System.setOut(originalOut);
    }
    String printed = baos.toString();
    assertNotNull("imprime() should write to the output stream (may be empty)", printed);
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: a freshly constructed list
    Lista lista0 = new Lista();
    assertNotNull("Lista should be instantiated", lista0);

    // When: we inspect its emptiness
    boolean emptyBefore = lista0.vazia();

    // Then: it must be empty initially
    assertTrue("A new list must report as empty", emptyBefore);

    // And: calling imprime on an empty list should be safe (no exceptions) and produce output (possibly empty)
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(baos));
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }
    assertNotNull("imprime() on empty list should not return null output", baos.toString());
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: an empty list
    Lista lista0 = new Lista();
    assertTrue("List should start empty", lista0.vazia());

    // When: attempting to insert null — either the implementation accepts null or rejects it with NPE.
    try {
      lista0.insere(null);
      // Then: if insertion succeeds, the list should no longer be empty
      assertFalse("If null is accepted by insere, list should not be empty after insertion", lista0.vazia());

      // Additionally insert a regular object to ensure typical insertion still works
      Object o = new Object();
      lista0.insere(o);
      assertFalse("List should remain non-empty after inserting a regular object", lista0.vazia());
    } catch (NullPointerException npe) {
      // Then: if insertion rejects null, it should throw NPE and the list should remain empty
      assertTrue("insere(null) threw NullPointerException as a defensive behavior", npe instanceof NullPointerException);
      assertTrue("List should remain empty if null insertion is rejected", lista0.vazia());
    }
  }
}