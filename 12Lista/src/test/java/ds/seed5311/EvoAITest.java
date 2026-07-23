package ds.seed5311;

import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Marker interface for unit tests so that tests can be classified in build pipelines.
 */
interface UnitTest {}

/**
 * Improved, maintainable tests for Lista.
 *
 * Notes:
 * - Each test follows Given-When-Then comments.
 * - Tests include descriptive assertion messages and additional checks.
 * - Tests capture System.out to verify imprime() behavior without relying on side effects.
 *
 * Requirement traceability:
 * - REQ-LISTA-001: A newly created list must report empty via vazia().
 * - REQ-LISTA-002: After inserting an element the list must report non-empty.
 * - REQ-LISTA-003: imprime() should not throw and should reflect inserted elements.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * REQ-LISTA-003
   *
   * Given: an empty list
   * When:  inserting a single, non-empty element and printing the list
   * Then:  the list must no longer be empty and the printed output must contain the inserted element
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    Lista lista0 = new Lista();
    final String element = "elem-0";

    // Precondition
    assertTrue("Precondition failed: newly created list should be empty", lista0.vazia());

    // When
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(baos, true));
      lista0.insere(element);
      // Verify state change immediately after action
      assertFalse("After inserting an element, vazia() should return false", lista0.vazia());
      // Exercise imprime() to produce observable output
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }

    // Then
    String printed = baos.toString();
    assertNotNull("imprime() should produce a non-null output string", printed);
    assertTrue("imprime() output should contain the inserted element: " + element, printed.contains(element));
  }

  /**
   * REQ-LISTA-001
   *
   * Given: a newly created list
   * When:  querying vazia() and printing the list
   * Then:  vazia() returns true and calling imprime() does not modify the list state
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    Lista lista0 = new Lista();

    // When / Then - state check
    assertTrue("New list must be empty (vazia() == true) as a baseline behavior", lista0.vazia());

    // When: call imprime() and ensure it does not throw and does not change emptiness
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(baos, true));
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }

    // Then: imprime should not have changed list state
    assertTrue("Calling imprime() on an empty list should not change its empty state", lista0.vazia());
    // Basic sanity check on output: it should not contain an obvious exception message
    String printed = baos.toString();
    assertNotNull("Captured imprime() output should not be null", printed);
    assertFalse("imprime() output should not contain 'Exception' text", printed.contains("Exception"));
  }

  /**
   * REQ-LISTA-002
   *
   * Given: an empty list
   * When:  inserting a representative non-empty element
   * Then:  vazia() becomes false and imprime() reflects the inserted element
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    Lista lista0 = new Lista();
    final String element = "test2-item";

    // Precondition
    assertTrue("Precondition: list must start empty", lista0.vazia());

    // When
    lista0.insere(element);

    // Then: check multiple properties (state and observable output)
    assertFalse("After insertion the list must not be empty", lista0.vazia());

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(baos, true));
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }

    String printed = baos.toString();
    assertNotNull("imprime() should produce output after insertion", printed);
    assertTrue("Printed output should include the inserted element: " + element, printed.contains(element));
  }
}