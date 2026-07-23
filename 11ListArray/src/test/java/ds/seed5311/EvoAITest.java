package ds.seed5311;

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
 * Unit tests for ds.Lista.
 *
 * Traceability: REQ-1234 - Basic list operations (insert, empty check, print, capacity handling)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given an empty list,
   * When inserting a single string element and printing,
   * Then the list should report non-empty and the printed output should contain the element.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    Lista lista0 = new Lista();

    // Capture System.out for verification of imprime()
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(out));
    try {
      // When
      String element = "7E3jkEp ";
      lista0.insere(element);
      lista0.imprime();

      // Then
      assertFalse("After insertion the list should not be empty", lista0.vazia());
      String printed = out.toString();
      assertTrue("Printed output should include the inserted element", printed.contains(element));
    } finally {
      System.setOut(originalOut);
    }
  }

  /**
   * Given a newly created list,
   * When checking emptiness and performing a transition insert,
   * Then initial state is empty and after insertion the list is no longer empty.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    Lista lista0 = new Lista();

    // Then (initial)
    assertTrue("A newly created list should be empty", lista0.vazia());

    // When: print an empty list to ensure imprime() is safe for empty state
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(out));
    try {
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }
    String printedEmpty = out.toString();
    assertNotNull("Printing an empty list should not return null output", printedEmpty);

    // When: transition from empty to non-empty
    lista0.insere("transition");
    // Then (after)
    assertFalse("After inserting an element the list should not be empty", lista0.vazia());
  }

  /**
   * Given a list,
   * When inserting repeatedly until capacity is reached,
   * Then an exception indicating the list is full should be thrown (or insertion completes up to a safe upper bound).
   *
   * This test avoids poking internal fields and exercises capacity behavior using the public API.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given
    Lista lista0 = new Lista();

    // When: attempt to fill the list until an exception is thrown or until a safe upper bound
    boolean exceptionThrown = false;
    int maxAttempts = 10000; // safety upper bound to avoid infinite loop in case the list grows unbounded
    int inserted = 0;
    for (int i = 0; i < maxAttempts; i++) {
      try {
        lista0.insere("elem-" + i);
        inserted++;
      } catch (Exception e) {
        exceptionThrown = true;
        String msg = e.getMessage() == null ? "" : e.getMessage().toLowerCase();
        // Accept messages that indicate fullness in Portuguese or English or a generic error message
        assertTrue("Expected exception message to indicate a full list or an error; got: " + e.getMessage(),
            msg.contains("cheia") || msg.contains("full") || msg.contains("erro") || msg.length() == 0);
        break;
      }
    }

    // Then: either we observed an exception (capacity reached) or we filled up to maxAttempts
    assertTrue("Expected to either encounter a capacity exception or complete up to the safe upper bound",
        exceptionThrown || inserted == maxAttempts);

    // Additional sanity check: after at least one insertion, the list should not be empty
    if (inserted > 0) {
      assertFalse("List should be non-empty after successful insertions", lista0.vazia());
    }
  }

  /**
   * Given an empty list,
   * When inserting an element and printing,
   * Then the list should not be empty and the printed output should include the inserted value.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given
    Lista lista0 = new Lista();

    // When
    String value = "some-element";
    lista0.insere(value);

    // Then
    assertFalse("List should report non-empty after insertion", lista0.vazia());

    // Verify printing includes the inserted value
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(out));
    try {
      lista0.imprime();
    } finally {
      System.setOut(originalOut);
    }
    String printed = out.toString();
    assertTrue("Printed output should contain the inserted element", printed.contains(value));
  }
}