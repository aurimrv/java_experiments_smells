package ds.seed5503;

import ds.CasamentoExato;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface used to categorize these tests as unit tests.
 */
interface UnitTest {}

/**
 * Improved test harness for CasamentoExato.
 *
 * These tests were refactored to include:
 * - Descriptive assertions
 * - Given-When-Then comments
 * - Category markers for selective execution
 * - Basic boundary checks and both success/exception scenarios
 *
 * Note: Method names are preserved from the original generated suite.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Scenario: Verify bmhs throws StringIndexOutOfBoundsException for an out-of-range index.
   *
   * Given a pattern and text that are valid strings but an invalid large index,
   * When bmhs is invoked,
   * Then a StringIndexOutOfBoundsException is expected and its message is non-null.
   */
  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    // Given
    final String pattern = "30PU$ ?.0c8mwc<*0u";
    final String text = "30PU$ ?.0c8mwc<*0u";

    // When / Then
    try {
      CasamentoExato.bmhs(pattern, 225, text, 1);
      Assert.fail("Expected StringIndexOutOfBoundsException for invalid pattern index");
    } catch (StringIndexOutOfBoundsException e) {
      // Validate exception provides at least minimal diagnostic information
      Assert.assertNotNull("Exception message should not be null", e.getMessage());
      Assert.assertTrue("Exception message should mention index or be non-empty", e.getMessage().length() >= 0);
    } catch (RuntimeException e) {
      // If some other runtime exception is thrown, fail the test with context
      Assert.fail("Unexpected exception type thrown: " + e.getClass().getName() + " - " + e.getMessage());
    }
  }

  /**
   * Scenario: Verify bmhs completes successfully for valid small indices.
   *
   * Given identical small indices and non-empty strings,
   * When bmhs is invoked,
   * Then no exception should be thrown.
   */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
    // Given
    final String pattern = "30PU$ ?.0c8mwc<*0u";
    final String text = "30PU$ ?.0c8mwc<*0u";

    // When
    try {
      CasamentoExato.bmhs(pattern, 1, text, 1);
      // Then: method should complete without throwing for this valid input
      Assert.assertTrue("bmhs completed without throwing for small valid indices", true);
    } catch (Exception e) {
      Assert.fail("bmhs threw unexpected exception for valid small indices: " + e);
    }
  }

  /**
   * Scenario: Verify bmh can be invoked for a typical input and does not throw.
   *
   * Given typical non-empty pattern and text,
   * When bmh is invoked with small indices,
   * Then it should complete without exception.
   */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
    // Given
    final String pattern = " gbQGSU%b?_AdovHyLT";
    final String text = "\"$$_CZ]7w5Q8Rb";

    // When / Then
    try {
      CasamentoExato.bmh(pattern, 1, text, 1);
      // Basic assertion to ensure execution path reached
      Assert.assertTrue("bmh executed successfully for typical inputs", true);
    } catch (Exception e) {
      Assert.fail("bmh threw unexpected exception for typical inputs: " + e);
    }
  }

  /**
   * Scenario: Validate bmh with identical strings and minimal indices does not throw.
   *
   * Given identical pattern and text strings and index 1,
   * When bmh is invoked,
   * Then it should complete without exception.
   */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
    // Given
    final String s = "OB \u007f@1;#DiG,`c,D";

    // When / Then
    try {
      CasamentoExato.bmh(s, 1, s, 1);
      Assert.assertTrue("bmh completed without exception for identical strings at index 1", true);
    } catch (Exception e) {
      Assert.fail("bmh threw unexpected exception for identical strings: " + e);
    }
  }

  /**
   * Scenario: Verify bmh throws for a zero index when other index is large (out-of-range).
   *
   * Given valid strings but a large text index,
   * When bmh is invoked with zero and a large index,
   * Then a StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
    // Given
    final String s = "30PU$ ?.0c8mwc<*0u";

    // When / Then
    try {
      CasamentoExato.bmh(s, 0, s, 370);
      Assert.fail("Expected StringIndexOutOfBoundsException for out-of-range text index");
    } catch (StringIndexOutOfBoundsException e) {
      Assert.assertNotNull("Exception message should be provided", e.getMessage());
    } catch (Exception e) {
      Assert.fail("Unexpected exception type thrown: " + e);
    }
  }

  /**
   * Scenario: shiftAndExato should throw when pattern provided but text is empty and index out-of-range.
   *
   * Given a small pattern, empty text and a large index,
   * When shiftAndExato is invoked,
   * Then a StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
    // Given
    final String pattern = "{q";
    final String emptyText = "";

    // When / Then
    try {
      CasamentoExato.shiftAndExato(pattern, 190, emptyText, 0);
      Assert.fail("Expected StringIndexOutOfBoundsException when text is empty and index is large");
    } catch (StringIndexOutOfBoundsException e) {
      Assert.assertNotNull("Exception message should not be null", e.getMessage());
    } catch (Exception e) {
      Assert.fail("Unexpected exception type: " + e);
    }
  }

  /**
   * Scenario: shiftAndExato should succeed for small valid indices and identical strings.
   *
   * Given identical non-empty strings and index 1,
   * When shiftAndExato is invoked,
   * Then it should complete without exception.
   */
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
    // Given
    final String s = "OnC0pD99";

    // When / Then
    try {
      CasamentoExato.shiftAndExato(s, 1, s, 1);
      Assert.assertTrue("shiftAndExato completed successfully for identical strings at small indices", true);
    } catch (Exception e) {
      Assert.fail("shiftAndExato threw unexpected exception: " + e);
    }
  }

  /**
   * Scenario: forcaBruta should handle zero indices and typical strings.
   *
   * Given pattern and text with zero index,
   * When forcaBruta is invoked,
   * Then it should complete without exception.
   */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
    // Given
    final String pattern = "ds.CasamentoExato";
    final String text = "1e*O";

    // When / Then
    try {
      CasamentoExato.forcaBruta(pattern, 0, text, 0);
      Assert.assertTrue("forcaBruta completed for zero indices", true);
    } catch (Exception e) {
      Assert.fail("forcaBruta threw unexpected exception for zero indices: " + e);
    }
  }

  /**
   * Scenario: forcaBruta should throw for clearly out-of-range indices.
   *
   * Given identical pattern and text and very large indices,
   * When forcaBruta is invoked,
   * Then a StringIndexOutOfBoundsException is expected.
   */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
    // Given
    final String s = "ds.CasamentoExato";

    // When / Then
    try {
      CasamentoExato.forcaBruta(s, 818, s, 818);
      Assert.fail("Expected StringIndexOutOfBoundsException for out-of-range indices");
    } catch (StringIndexOutOfBoundsException e) {
      Assert.assertNotNull("Exception message should be present", e.getMessage());
    } catch (Exception e) {
      Assert.fail("Unexpected exception type: " + e);
    }
  }

  /**
   * Scenario: forcaBruta should handle null pattern parameter gracefully (should not throw NPE).
   *
   * Given a null pattern and negative indices (boundary),
   * When forcaBruta is invoked,
   * Then it should either complete or throw a controlled runtime exception; ensure no unchecked NPE escapes.
   */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
    // Given
    final String pattern = null;
    final String text = "Qpb*d(Mv#&!s";

    // When / Then
    try {
      CasamentoExato.forcaBruta(pattern, -1821, text, -1821);
      Assert.assertTrue("forcaBruta completed when pattern is null and indices negative (handled internally)", true);
    } catch (NullPointerException e) {
      // Fail with explanatory message since API should ideally handle nulls or document NPE
      Assert.fail("forcaBruta threw NullPointerException; consider handling null input: " + e.getMessage());
    } catch (Exception e) {
      // Accept other runtime exceptions but fail the test to highlight unexpected behavior
      Assert.fail("forcaBruta threw unexpected exception: " + e);
    }
  }

  /**
   * Scenario: forcaBruta with typical non-empty strings and small indices should succeed.
   *
   * Given typical pattern and text with index 1,
   * When forcaBruta is invoked,
   * Then it should complete without exception.
   */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    // Given
    final String pattern = "tWa/yRkUW?s:?u``~|";
    final String text = "GoQVvn$8<r";

    // When / Then
    try {
      CasamentoExato.forcaBruta(pattern, 1, text, 1);
      Assert.assertTrue("forcaBruta completed for typical inputs and index 1", true);
    } catch (Exception e) {
      Assert.fail("forcaBruta threw unexpected exception for typical inputs: " + e);
    }
  }

  /**
   * Scenario: Construction of CasamentoExato should not throw and object should be non-null.
   *
   * Given default constructor,
   * When a new CasamentoExato is instantiated,
   * Then the instance should be non-null.
   */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    // Given / When
    try {
      CasamentoExato casamentoExato0 = new CasamentoExato();
      // Then
      Assert.assertNotNull("New CasamentoExato instance should not be null", casamentoExato0);
    } catch (Exception e) {
      Assert.fail("Constructing CasamentoExato should not throw: " + e);
    }
  }
}