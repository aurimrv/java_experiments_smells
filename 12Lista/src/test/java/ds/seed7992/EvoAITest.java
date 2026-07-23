package ds.seed7992;

import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Scenario: inserting a single item and printing should show the item and the list should no longer be empty.
   * Given a new Lista,
   * When I insert one element and call imprime twice,
   * Then the list reports non-empty and consecutive imprime calls produce identical output containing the inserted element.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When
      final String item = "first-item";
      lista0.insere(item);

      // Capture output of imprime safely
      String firstPrint = captureImprime(lista0);

      // Then
      assertFalse("After inserting an item the list should not be empty", lista0.vazia());
      assertNotNull("imprime output should not be null", firstPrint);
      assertTrue("imprime should contain the inserted item", firstPrint.contains(item));

      // And: printing again should not mutate the list; outputs should be equal
      String secondPrint = captureImprime(lista0);
      assertEquals("Consecutive calls to imprime should produce the same output", firstPrint, secondPrint);
  }

  /**
   * Scenario: a newly created list is empty and printing it produces no visible content.
   * Also validate behavior when attempting to insert null: accept either a documented exception (NPE/IAE)
   * or that the list accepts the value and becomes non-empty. This makes the test robust across reasonable implementations.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a fresh, empty list
      Lista lista0 = new Lista();

      // Then: it should report as empty
      assertTrue("A newly created list should be empty", lista0.vazia());

      // And: imprime on an empty list should produce no visible content (only whitespace allowed)
      String emptyPrint = captureImprime(lista0);
      assertTrue("Printing an empty list should produce no non-whitespace characters", emptyPrint == null || emptyPrint.trim().isEmpty());

      // When: try to insert null and allow either exception or acceptance
      boolean acceptedNull = false;
      try {
          lista0.insere(null);
          acceptedNull = true;
      } catch (NullPointerException | IllegalArgumentException expected) {
          // Acceptable behavior: implementation disallows null
      } catch (Throwable unexpected) {
          fail("Inserting null threw an unexpected exception type: " + unexpected);
      }

      if (acceptedNull) {
          // If accepted, the list should now be non-empty and imprime should reflect the insertion (e.g., the string "null" or some mark)
          assertFalse("List should not be empty after accepting a null insertion", lista0.vazia());
          String afterNullPrint = captureImprime(lista0);
          assertNotNull("imprime should return a string even if null was inserted", afterNullPrint);
          assertTrue("imprime after null insertion should contain something to reflect the insertion", !afterNullPrint.trim().isEmpty());
      }
  }

  /**
   * Scenario: multiple insertions preserve order and imprime reflects that order.
   * Given a new Lista,
   * When inserting two distinct elements,
   * Then they should appear in imprime output in insertion order and both must be present.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When
      final String a = "A";
      final String b = "B";
      lista0.insere(a);
      lista0.insere(b);

      // Then
      assertFalse("List should not be empty after inserting elements", lista0.vazia());

      String printed = captureImprime(lista0);
      assertNotNull("imprime must return a non-null string", printed);

      // Both elements should be present
      assertTrue("imprime output should contain the first inserted element", printed.contains(a));
      assertTrue("imprime output should contain the second inserted element", printed.contains(b));

      // And the first element should appear before the second (order preservation)
      int idxA = printed.indexOf(a);
      int idxB = printed.indexOf(b);
      assertTrue("First inserted element should appear before the second in imprime output", idxA >= 0 && idxB >= 0 && idxA <= idxB);
  }

  // Helper to capture the output of lista.imprime() without affecting global stdout permanently.
  private String captureImprime(Lista lista) {
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      try {
          System.setOut(ps);
          // Call the method that prints to System.out
          lista.imprime();
      } catch (Throwable t) {
          // Ensure we restore System.out before propagating
          System.setOut(originalOut);
          throw t;
      } finally {
          System.setOut(originalOut);
          try {
              ps.close();
          } catch (Exception ignore) {
          }
      }
      return baos.toString();
  }
}