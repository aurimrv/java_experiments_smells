package ds.seed5831;

import ds.Lista;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Unit tests for Lista class.
 *
 * Requirement trace:
 * - LIST-001: Basic list lifecycle (empty -> insert -> print) behavior.
 *
 * These tests follow a Given-When-Then structure in each method and include
 * multiple, descriptive assertions to improve diagnostic information on failure.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given a new list,
   * When an element is inserted and the list is printed,
   * Then the list should report non-empty and printing should not alter emptiness.
   *
   * Requirement: LIST-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("A newly created list must be empty", lista0.vazia());

      // When
      lista0.insere("g_S");

      // capture output of imprime() to ensure it executes without throwing
      String output = captureStdout(new Runnable() {
          @Override
          public void run() {
              lista0.imprime();
          }
      });

      // Then
      assertFalse("After inserting an element the list should not be empty", lista0.vazia());
      assertNotNull("imprime() should produce a (possibly empty) string rather than null", output);
      // imprime() should not change emptiness state
      assertFalse("imprime() must not alter the emptiness state of the list", lista0.vazia());
  }

  /**
   * Given a freshly created list,
   * When inspected and then an element is added,
   * Then the list transitions from empty to non-empty.
   *
   * Requirement: LIST-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When / Then (initial state)
      assertTrue("New list should report as empty", lista0.vazia());

      // When - print the empty list (should not throw)
      String beforePrint = captureStdout(new Runnable() {
          @Override
          public void run() {
              lista0.imprime();
          }
      });

      // Then - printing an empty list should be a valid operation
      assertNotNull("Printing an empty list should produce a non-null output string", beforePrint);

      // When - insert a boundary value (empty string) to exercise a boundary case
      lista0.insere("");

      // Then - list should now be non-empty
      assertFalse("List should not be empty after inserting an empty string element", lista0.vazia());
  }

  /**
   * Given a new list,
   * When an element is inserted (including a boundary empty-string),
   * Then subsequent queries should report non-empty consistently.
   *
   * Requirement: LIST-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("Start with an empty list", lista0.vazia());

      // When - insert a normal element
      lista0.insere("g_S");

      // Then - should be non-empty
      assertFalse("List should be non-empty after inserting 'g_S'", lista0.vazia());

      // When - insert an additional boundary element (empty string)
      lista0.insere("");

      // Then - list remains non-empty and consistent across queries
      assertFalse("List must remain non-empty after inserting an additional empty-string element", lista0.vazia());

      // Also assert that repeated queries are stable
      boolean secondCheck = lista0.vazia();
      assertFalse("Subsequent calls to vazia() should consistently report non-empty", secondCheck);
  }

  /**
   * Helper to capture standard output produced by a Runnable action.
   * Restores System.out after the action completes.
   */
  private String captureStdout(Runnable action) {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream capturingOut = new PrintStream(baos);
      try {
          System.setOut(capturingOut);
          action.run();
      } finally {
          capturingOut.flush();
          System.setOut(originalOut);
          try {
              capturingOut.close();
          } catch (Exception ignored) {
              // nothing to do
          }
      }
      return baos.toString();
  }
}