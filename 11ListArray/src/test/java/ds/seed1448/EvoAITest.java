package ds.seed1448;

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
 * Traceability:
 * - REQ-LIST-001: Basic list operations (insert, empty check, printing)
 *
 * Notes:
 * - Tests are written in Given-When-Then style.
 * - Category marker is provided to allow selective execution.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  /**
   * Given an empty list,
   * when a single element is inserted and the list is printed,
   * then the list should report one element (ultimo == 1), not be empty, and the printed output should contain the element.
   *
   * REQ-LIST-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("Precondition: newly created list should be empty", lista0.vazia());
      // Use a predictable string element so printed output can be asserted deterministically
      String element = "element-0";

      // When
      lista0.insere(element);

      // Capture printed output to assert on it
      PrintStream originalOut = System.out;
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      try {
          System.setOut(new PrintStream(baos));
          lista0.imprime();
      } finally {
          System.setOut(originalOut);
      }

      // Then
      assertEquals("After inserting one element, 'ultimo' should be 1", 1, lista0.ultimo);
      assertFalse("After inserting one element, list should not be empty", lista0.vazia());
      String printed = baos.toString();
      assertNotNull("Printed output should not be null", printed);
      assertFalse("Printed output should not be empty", printed.trim().isEmpty());
      assertTrue("Printed output should contain the inserted element's toString()", printed.contains(element));
  }

  /**
   * Given a newly created list,
   * when queried for emptiness and internal indices,
   * then it should be empty, primeira index 0 and pos equal -1.
   *
   * REQ-LIST-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();

      // When / Then (initial state checks)
      assertTrue("New list should be empty (vazia == true)", lista0.vazia());
      assertEquals("New list 'primeiro' should be initialized to 0", 0, lista0.primeiro);
      assertEquals("New list 'pos' should be initialized to -1", -1, lista0.pos);
  }

  /**
   * Given a list whose internal array has been artificially set to size zero,
   * when attempting to insert an element,
   * then an exception indicating the list is full should be thrown and the list state should remain unchanged.
   *
   * REQ-LIST-ERROR-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      // Simulate the full/invalid internal state by assigning an array of length 0
      lista0.item = new Object[0];
      int initialPrimeiro = lista0.primeiro;
      int initialUltimo = lista0.ultimo;
      int initialPos = lista0.pos;

      Object object0 = new Object();

      // When / Then
      try {
          lista0.insere(object0);
          fail("Expecting exception when inserting into a list whose internal array has length 0");
      } catch (Exception e) {
          // Assert that the exception message indicates the list is full (localized message as used by Lista)
          String msg = e.getMessage();
          assertNotNull("Exception thrown should contain a message describing the error", msg);
          assertTrue("Exception message should indicate the list is full", msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full") || msg.toLowerCase().contains("erro"));
      }

      // Ensure state did not unexpectedly change after the failed insert
      assertEquals("Internal array length should remain 0 after failed insert", 0, lista0.item.length);
      assertEquals("primeiro should remain unchanged after failed insert", initialPrimeiro, lista0.primeiro);
      assertEquals("ultimo should remain unchanged after failed insert", initialUltimo, lista0.ultimo);
      assertEquals("pos should remain unchanged after failed insert", initialPos, lista0.pos);
  }

  /**
   * Given an empty list,
   * when a single Object is inserted,
   * then the list should report one element and no longer be empty.
   *
   * REQ-LIST-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Lista lista0 = new Lista();
      assertTrue("Precondition: list should start empty", lista0.vazia());

      // When
      Object object0 = new Object();
      lista0.insere(object0);

      // Then
      assertEquals("After inserting one element, 'ultimo' should be 1", 1, lista0.ultimo);
      assertFalse("After inserting one element, list should not be empty", lista0.vazia());
  }
}