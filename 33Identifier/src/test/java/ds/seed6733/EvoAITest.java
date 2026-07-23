package ds.seed6733;

import ds.Identifier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Marker interface for unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test class for Identifier.
 *
 * <p>Each test documents the requirement it addresses (REQ-IDENT-001 for identifier validation)
 * and uses multiple, descriptive assertions where possible. Tests are structured with simple
 * Given-When-Then comments and include determinism checks (idempotence) to ensure stable behavior.</p>
 */
@RunWith(JUnit4.class)
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-IDENT-001: validateIdentifier must reject identifiers containing special punctuation.
   *
   * Given a complex string containing punctuation and special characters,
   * when validateIdentifier is invoked, then it should return false and behave deterministically.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String input = "ayy/a49=}H~%oXnC0f";

      // When
      boolean firstResult = identifier0.validateIdentifier(input);
      boolean secondResult = identifier0.validateIdentifier(input);

      // Then
      assertFalse("Complex string with special characters should be invalid", firstResult);
      assertEquals("validateIdentifier should return the same result on repeated calls (deterministic)", firstResult, secondResult);

      // Sanity: verify that at least one known invalid character in the string is treated as invalid by valid_s()
      // (this helps document why the overall result is false)
      boolean braceValid = identifier0.valid_s('}');
      assertFalse("Character '}' is expected to be invalid according to valid_s()", braceValid);
  }

  /**
   * REQ-IDENT-001: valid_s should indicate whether a single character is allowed in identifiers.
   *
   * Given the closing brace character, when valid_s is called, then it should indicate the character is invalid
   * and validateIdentifier should agree for a single-character identifier.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      char ch = '}';

      // When
      boolean singleCharValidity = identifier0.valid_s(ch);

      // Then
      assertFalse("Closing brace '}' should not be considered a valid identifier character", singleCharValidity);
      assertEquals("valid_s should be deterministic for the same character", singleCharValidity, identifier0.valid_s(ch));

      // And: a one-character identifier consisting of the invalid character should be rejected
      boolean identResult = identifier0.validateIdentifier(String.valueOf(ch));
      assertFalse("A single '}' should not be a valid identifier", identResult);
  }

  /**
   * REQ-IDENT-001: Single-letter identifiers should usually be allowed.
   *
   * Given the single character 'l', when validateIdentifier is invoked, then it should return true and
   * agree with valid_s for that character.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String input = "l";

      // When
      boolean idResult = identifier0.validateIdentifier(input);
      boolean charResult = identifier0.valid_s('l');

      // Then
      assertTrue("Single lowercase letter 'l' should be a valid identifier", idResult);
      assertEquals("validateIdentifier for a single-letter input should agree with valid_s('l')", idResult, charResult);
      assertEquals("validateIdentifier should be deterministic for the same input", idResult, identifier0.validateIdentifier(input));
  }

  /**
   * REQ-IDENT-001: Quotation characters are not valid identifier characters.
   *
   * Given a single quote character, when validateIdentifier is invoked, then it should return false and behave deterministically.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String input = "'";

      // When
      boolean first = identifier0.validateIdentifier(input);

      // Then
      assertFalse("Single quote (') should not be a valid identifier", first);
      assertEquals("validateIdentifier should be deterministic for single quote input", first, identifier0.validateIdentifier(input));

      // Additional sanity: the quote character itself should not be considered a valid identifier character
      assertFalse("valid_s should indicate quote is invalid", identifier0.valid_s('\''));
  }

  /**
   * REQ-IDENT-001: validateIdentifier must handle null inputs gracefully.
   *
   * Given a null string, when validateIdentifier is invoked, then it should return false and not throw.
   * The test also checks determinism for null and for the empty string (no expectation on empty value).
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();

      // When
      boolean nullResult = identifier0.validateIdentifier((String) null);

      // Then
      assertFalse("Null input should not be considered a valid identifier", nullResult);
      assertEquals("validateIdentifier should be deterministic for null input", nullResult, identifier0.validateIdentifier((String) null));

      // Boundary check (ensure no exception and determinism for empty string; do not assert a specific true/false value for empty)
      boolean emptyFirst = identifier0.validateIdentifier("");
      boolean emptySecond = identifier0.validateIdentifier("");
      assertEquals("validateIdentifier should be deterministic for empty string", emptyFirst, emptySecond);
  }
}