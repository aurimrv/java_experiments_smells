package ds.seed9121;

import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for ds.Lista.
 *
 * Requirement traceability: REQ-LISTA-1 (basic list operations)
 *
 * Notes:
 * - Tests focus on public behavior (insere, vazia, imprime) and avoid coupling to internal fields.
 * - Each test follows a single, clear Arrange-Act-Assert pattern.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Arrange: new empty list
   * Act: insert a single element
   * Assert: list reports non-empty and imprime() includes the element's toString()
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      Object element = new Object() {
          @Override
          public String toString() {
              return "UNIQUE-ELEMENT-OBJ";
          }
      };

      // When (single Act)
      lista0.insere(element);

      // Then
      assertFalse("After inserting one element, lista.vazia() should be false", lista0.vazia());

      // And imprime() should output a representation containing the element's toString()
      String output = captureStdOut(() -> lista0.imprime());
      assertNotNull("imprime() output should not be null", output);
      assertTrue("imprime() should contain the inserted element's toString()",
              output.contains("UNIQUE-ELEMENT-OBJ"));
  }

  /**
   * Arrange: new empty list
   * Act: inspect initial state via public API
   * Assert: list is empty and imprime() does not throw and yields a string (possibly empty)
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When / Then (initial state)
      assertTrue("Newly created list should report as empty (vazia())", lista0.vazia());

      // Calling imprime() on an empty list should not throw and should produce some textual output (may be empty)
      String output = captureStdOut(() -> lista0.imprime());
      assertNotNull("imprime() must produce a non-null String even for an empty list", output);
  }

  /**
   * Arrange: new list
   * Act: insert one element
   * Assert: vazia() flips to false and imprime() contains the element marker
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      String marker = "ITEM-42";

      // When
      lista0.insere(marker);

      // Then
      assertFalse("List with one item should not be empty", lista0.vazia());
      String output = captureStdOut(() -> lista0.imprime());
      assertTrue("imprime() should include the inserted string marker", output.contains(marker));
  }

  /**
   * Arrange: new list
   * Act: insert multiple elements
   * Assert: imprime() output preserves insertion order (first appears before second)
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      String first = "FIRST";
      String second = "SECOND";
      String third = "THIRD";

      // When (multiple inserts to exercise ordered behavior)
      lista0.insere(first);
      lista0.insere(second);
      lista0.insere(third);

      // Then
      String output = captureStdOut(() -> lista0.imprime());
      assertNotNull("imprime() must produce output after multiple inserts", output);

      int idxFirst = output.indexOf(first);
      int idxSecond = output.indexOf(second);
      int idxThird = output.indexOf(third);

      assertTrue("imprime() should contain the first inserted element", idxFirst >= 0);
      assertTrue("imprime() should contain the second inserted element", idxSecond >= 0);
      assertTrue("imprime() should contain the third inserted element", idxThird >= 0);

      assertTrue("Order should be preserved: FIRST before SECOND", idxFirst < idxSecond);
      assertTrue("Order should be preserved: SECOND before THIRD", idxSecond < idxThird);
  }

  // Helper to capture System.out output from a runnable action.
  private static String captureStdOut(Runnable action) {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      try {
          System.setOut(ps);
          action.run();
      } finally {
          System.setOut(originalOut);
          try {
              ps.close();
              baos.close();
          } catch (Exception ignored) {}
      }
      return new String(baos.toByteArray());
  }
}