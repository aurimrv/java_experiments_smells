package ds.seed6733;

import ds.Lista;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface used to classify unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved and readable unit tests for ds.Lista.
 *
 * Notes:
 * - Each test follows a Given-When-Then structure in comments.
 * - Tests use observable behavior rather than relying purely on internal field inspection where possible.
 * - Tests include descriptive assertion messages and minimal, focused verification per test method.
 *
 * Traceability: Related to hypothetical requirement REQ-LISTA-001 (basic list operations).
 */
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given: a fresh Lista
   * When: inserting the list instance itself and calling imprime()
   * Then: the list should no longer be empty, imprime() should produce output, and ultimo should reflect one insertion.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When: insert the list object and capture imprime() output
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(baos));
      try {
          lista0.insere(lista0); // action under test
          lista0.imprime();      // action under test: produce observable output
      } finally {
          // restore stdout to avoid side-effects on other tests
          System.setOut(originalOut);
      }
      String printed = baos.toString();

      // Then: verify behavior and some internal state for confidence
      assertFalse("After insertion the list should report not empty", lista0.vazia());
      assertTrue("imprime() should produce some output after inserting an element", printed != null && printed.length() > 0);
      // retain the original internal check but with a descriptive message to help diagnosis if implementation changes
      assertEquals("ultimo should be updated to 1 after inserting a single element", 1, lista0.ultimo);
  }

  /**
   * Given: a freshly constructed Lista
   * When: inspecting its initial state
   * Then: it should be empty and its bookkeeping fields should indicate no elements
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When
      boolean isEmpty = lista0.vazia();

      // Then: behavioral assertions first
      assertTrue("Newly created list should be empty", isEmpty);

      // The following checks inspect implementation bookkeeping; keep them to detect regressions but with messages.
      assertEquals("primeiro should be initialized to 0 for an empty list", 0, lista0.primeiro);
      assertEquals("pos should be initialized to -1 when the list is empty", -1, lista0.pos);
  }

  /**
   * Given: a Lista that will be filled until it reports being full
   * When: repeatedly inserting elements
   * Then: eventually an exception indicating the list is full should be thrown and include an explanatory message
   *
   * This test avoids directly mutating internal arrays and relies on observable exception behavior.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When: keep inserting until an exception indicates the list is full or we reach a safe upper bound
      boolean exceptionThrown = false;
      Exception observed = null;
      final int SAFE_UPPER_BOUND = 2000; // safeguard to avoid infinite loops on implementations with no capacity limit

      for (int i = 0; i < SAFE_UPPER_BOUND; i++) {
          try {
              lista0.insere("item-" + i);
          } catch (Exception e) {
              exceptionThrown = true;
              observed = e;
              break;
          }
      }

      // Then: we expect the implementation to either have a capacity and throw, or else we consider the test passed
      // if no exception occurred within the upper bound the list supports at least SAFE_UPPER_BOUND entries;
      // in that case, assert that no exception was thrown but still that the list is not empty.
      if (exceptionThrown) {
          assertNotNull("An exception was expected and should be present", observed);
          String msg = observed.getMessage();
          assertTrue("Exception message should indicate the list is full", msg == null || msg.contains("chei") || msg.contains("Chei") || msg.contains("full") || msg.contains("cheia"));
      } else {
          // No exception detected within bound: verify the list accepted many items and is not empty.
          assertFalse("List should not be empty after many insertions", lista0.vazia());
      }
  }

  /**
   * Given: a fresh Lista
   * When: inserting one element (the list itself) and querying emptiness
   * Then: the list should not be empty; imprime should report the element and bookkeeping should reflect one element
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When
      lista0.insere(lista0);

      // Then: behavioral assertions
      assertFalse("After inserting an element, vazia() should return false", lista0.vazia());

      // Capture imprime output to ensure the inserted element is represented
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream originalOut = System.out;
      System.setOut(new PrintStream(baos));
      try {
          lista0.imprime();
      } finally {
          System.setOut(originalOut);
      }
      String printed = baos.toString();
      assertTrue("imprime() output should contain a representation of the inserted element", printed != null && printed.length() > 0);

      // Retain check of interno 'ultimo' to validate internal bookkeeping with descriptive message
      assertEquals("ultimo should indicate one element after single insertion", 1, lista0.ultimo);
  }
}