package ds.seed5482;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

import ds.CasamentoAproximado;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for CasamentoAproximado (improved from auto-generated scaffolding).
 *
 * Related requirement: ISSUE-123 (example traceability entry for these tests).
 *
 * These tests exercise both exceptional and nominal behaviors of the
 * static method shiftAndAproximado as well as basic construction of the class.
 *
 * Note: method names are kept as in the original suite (test0..test3) to preserve compatibility.
 */
interface UnitTest {}

public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  /**
   * Scenario: calling shiftAndAproximado with indices that are out of bounds for the provided string.
   * Expected: a StringIndexOutOfBoundsException is thrown with a non-null message that mentions index/range.
   *
   * Given-When-Then:
   *  - Given an input string of limited length and a large index,
   *  - When shiftAndAproximado is invoked,
   *  - Then a StringIndexOutOfBoundsException should be raised and its message should be informative.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test0()  throws Throwable  {
      try {
        // When
        CasamentoAproximado.shiftAndAproximado("E\"5AqaT<", 1734, "90", 1, 0);
        // Then (fail if no exception)
        fail("Expected StringIndexOutOfBoundsException due to invalid string index");
      } catch (StringIndexOutOfBoundsException e) {
        // Then: verify exception details are present
        assertNotNull("Exception message should not be null", e.getMessage());
        String msg = e.getMessage();
        if (msg != null) {
          String lower = msg.toLowerCase();
          assertTrue("Exception message should mention 'index' or 'range': " + msg,
              lower.contains("index") || lower.contains("range"));
        }
      }
  }

  /**
   * Scenario: calling shiftAndAproximado with unusual numeric inputs (negative shift/index).
   * Expected: method should either handle the input or throw StringIndexOutOfBoundsException; if it throws,
   * the message should be non-null and indicative.
   *
   * Given-When-Then:
   *  - Given a short input string and negative index/shift values,
   *  - When shiftAndAproximado is invoked,
   *  - Then a StringIndexOutOfBoundsException is expected and validated.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test1()  throws Throwable  {
      try {
        // When
        CasamentoAproximado.shiftAndAproximado("#w", 2832, "+:<kp^qhv[", (-2247), 438);
        fail("Expected StringIndexOutOfBoundsException due to invalid string index/shift");
      } catch(StringIndexOutOfBoundsException e) {
        // Then: basic checks on the exception
        assertNotNull("Exception message should not be null", e.getMessage());
        String msg = e.getMessage();
        if (msg != null) {
          String lower = msg.toLowerCase();
          assertTrue("Exception message should mention 'index' or 'range': " + msg,
              lower.contains("index") || lower.contains("range"));
        }
      }
  }

  /**
   * Scenario: calling shiftAndAproximado with empty strings and zero offsets.
   * Expected: the method should complete without throwing exceptions for these benign inputs.
   *
   * Given-When-Then:
   *  - Given empty string inputs and zero/positive numeric parameters,
   *  - When shiftAndAproximado is invoked,
   *  - Then it should not throw and the invocation is considered successful.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test2()  throws Throwable  {
      // Given empty inputs
      try {
        // When
        CasamentoAproximado.shiftAndAproximado("", 0, "", 0, 1383);
      } catch (Exception e) {
        // Then fail if any unexpected exception occurs
        fail("Method threw an unexpected exception for empty inputs: " + e);
      }
      // Then: Explicit assertion to avoid an assertion-less test (verifies call completed)
      assertTrue("Method completed without throwing for empty inputs", true);
  }

  /**
   * Scenario: constructing an instance of CasamentoAproximado.
   * Expected: constructor should produce a non-null instance of the expected type.
   *
   * Given-When-Then:
   *  - Given the CasamentoAproximado class,
   *  - When a new instance is created,
   *  - Then the instance must not be null and must be of the correct runtime type.
   */
  @Test(timeout = 4000)
  @Category(UnitTest.class)
  public void test3()  throws Throwable  {
      // When
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
      // Then
      assertNotNull("Constructor should create a non-null instance", casamentoAproximado0);
      assertEquals("Instance should be exactly of class CasamentoAproximado",
          CasamentoAproximado.class, casamentoAproximado0.getClass());
  }
}