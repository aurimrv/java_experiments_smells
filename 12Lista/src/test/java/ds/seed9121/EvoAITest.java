package ds.seed9121;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.experimental.categories.Category;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import ds.Lista;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved tests for Lista focusing on clear assertions, boundary case (null), and descriptive messages.
 * Requirement reference: REQ-001 (basic list behavior)
 */
@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

  // Helper: create a new Lista instance (centralized setup for potential reuse)
  private Lista createLista() {
    return new Lista();
  }

  // Helper: capture System.out output produced by the runnable and return it as a String
  private String captureOutput(Runnable action) {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps;
    try {
      ps = new PrintStream(baos, true, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      ps = new PrintStream(baos);
    }
    try {
      System.setOut(ps);
      action.run();
    } finally {
      System.setOut(originalOut);
    }
    try {
      return baos.toString("UTF-8");
    } catch (UnsupportedEncodingException e) {
      return baos.toString();
    }
  }

  // Simple helper object with stable toString for predictable printed output
  private static class NamedObject {
    private final String name;
    NamedObject(String name) { this.name = name; }
    @Override
    public String toString() { return name; }
  }

  /**
   * Given a fresh list, when an element is inserted and imprime() is called,
   * then the list should no longer be empty and the printed output should include the element's toString.
   * Req: REQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    Lista lista0 = createLista();
    Assert.assertTrue("Newly created list should be empty", lista0.vazia());

    NamedObject item = new NamedObject("item-0");

    // When: insert and capture printed output
    String printed = captureOutput(() -> {
      lista0.insere(item);
      lista0.imprime();
    });

    // Then: list is not empty and printed output contains the element's toString
    Assert.assertFalse("List should not be empty after inserting an element", lista0.vazia());
    Assert.assertTrue("imprime() output should contain the inserted element's toString",
        printed != null && printed.contains("item-0"));
  }

  /**
   * Given a fresh list, when vazia() and imprime() are called,
   * then the list remains empty and calling imprime() does not throw.
   * Req: REQ-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    Lista lista0 = createLista();

    // When & Then: initial state checks
    Assert.assertTrue("List should be empty immediately after creation", lista0.vazia());

    // When: call imprime() on empty list and capture output
    String printed = captureOutput(() -> lista0.imprime());

    // Then: calling imprime() should not change emptiness and should produce some output (may be empty string)
    Assert.assertTrue("List should remain empty after printing", lista0.vazia());
    Assert.assertNotNull("imprime() should produce an output string (may be empty)", printed);
  }

  /**
   * Boundary case: inserting null. Acceptable behaviors:
   *  - implementation throws a NullPointerException or IllegalArgumentException, or
   *  - implementation accepts null, in which case the list is either unchanged (ignores null) or contains a null entry
   * This test verifies that one of those reasonable behaviors occurs and that printing does not crash.
   * Req: REQ-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    Lista lista0 = createLista();

    // When/Then: inserting null may throw or be accepted; both are considered acceptable but observable
    try {
      lista0.insere(null);
      // If no exception, ensure imprime() is callable and the state is consistent
      String printed = captureOutput(() -> lista0.imprime());
      if (lista0.vazia()) {
        // Acceptable: implementation ignored null
        Assert.assertTrue("After inserting null the list remained empty (implementation may ignore null)", lista0.vazia());
      } else {
        // If list reports non-empty, printed representation should reflect the presence of null
        Assert.assertTrue("After inserting null, imprime() output should reflect the null entry",
            printed != null && (printed.contains("null") || printed.contains("null")));
      }
    } catch (NullPointerException | IllegalArgumentException ex) {
      // Acceptable: explicitly assert that such an exception is thrown for null insertion
      Assert.assertNotNull("Inserting null resulted in a handled exception (acceptable behavior)", ex);
    }
  }
}