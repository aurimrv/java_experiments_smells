package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import java.util.Objects;

/**
 * Improved, human-maintained unit tests for Identifier.
 * Each test documents the scenario (Given-When-Then) and includes descriptive assertion messages
 * for easier diagnosis on failure. These tests exercise happy-path and several error-path scenarios
 * including null handling and strings containing clearly invalid characters.
 *
 * Traceability: REQ-IDENT-001 (basic identifier validation behavior)
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given: an Identifier instance and characters that are not alphanumeric
    Identifier identifier = new Identifier();
    char ch1 = '~';
    // When: we check whether the character is a valid start character
    boolean isValidStart = identifier.valid_s(ch1);
    // Then: non-alphanumeric characters should not be valid start characters.
    // We also assert the character is not reported as a letter or digit by the JDK,
    // which supports the expectation that Identifier should reject it.
    assertFalse("Expected '~' to be rejected as a valid start character", isValidStart);
    assertFalse("Sanity: '~' should not be a letter or digit according to Character", Character.isLetterOrDigit(ch1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: an Identifier instance and an ASCII punctuation character
    Identifier identifier = new Identifier();
    char ch = '(';
    // When: we ask if it is valid as a start character
    boolean result = identifier.valid_s(ch);
    // Then: punctuation should not be valid as a start character.
    assertFalse("Expected '(' to be rejected as a valid start character", result);
    // Additional sanity check: '(' is not letter or digit
    assertFalse("Sanity: '(' should not be a letter or digit according to Character", Character.isLetterOrDigit(ch));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given: an Identifier instance and a simple lowercase identifier string
    Identifier identifier = new Identifier();
    String input = "w";
    // When: we validate the identifier
    boolean valid = identifier.validateIdentifier(input);
    // Then: a single lowercase letter should be a valid identifier.
    assertTrue("Expected single lowercase letter \"" + input + "\" to be recognized as a valid identifier", valid);
    // And the corresponding start-character check should agree
    assertTrue("valid_s should accept the letter 'w' when used as a start character", identifier.valid_s('w'));
    // Sanity: verify JDK classification of the character
    assertTrue("Sanity: 'w' should be a letter according to Character", Character.isLetter('w'));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given: an Identifier instance and a complex string containing several punctuation and control characters
    Identifier identifier = new Identifier();
    String input = "NC?{?nGl'@0z\u0002M%_";
    // When: we validate the identifier
    boolean valid = identifier.validateIdentifier(input);
    // Then: the complex string should be invalid (contains characters like '?', '{', '\u0002', '%' which are not typical identifier chars)
    assertFalse("Expected complex string with punctuation/control characters to be invalid: " + input, valid);
    // Additionally assert that the input contains at least one character that is not letter, digit, or underscore,
    // which is a likely cause of invalidation.
    boolean hasClearlyInvalidChar = false;
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      if (!(Character.isLetterOrDigit(c) || c == '_')) {
        hasClearlyInvalidChar = true;
        break;
      }
    }
    assertTrue("Test precondition: the input must contain at least one non-alphanumeric non-underscore character", hasClearlyInvalidChar);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given: an Identifier instance and a string that appears to include an uppercase character
    Identifier identifier = new Identifier();
    String input = "rjAn7dps";
    // When: we validate the identifier
    boolean valid = identifier.validateIdentifier(input);
    // Then: according to observed behavior this string is invalid; record that outcome with a descriptive message.
    assertFalse("Observed behavior: \"" + input + "\" should be considered invalid by validateIdentifier", valid);
    // Sanity checks: confirm the string indeed contains an uppercase character which may be the source of invalidation.
    boolean containsUppercase = false;
    for (int i = 0; i < input.length(); i++) {
      if (Character.isUpperCase(input.charAt(i))) {
        containsUppercase = true;
        break;
      }
    }
    assertTrue("Sanity: the input should contain at least one uppercase character (possible reason for invalidation)", containsUppercase);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    // Given: an Identifier instance and a null input
    Identifier identifier = new Identifier();
    // When/Then: validateIdentifier should handle null gracefully and return false rather than throwing
    boolean valid = false;
    try {
      valid = identifier.validateIdentifier((String) null);
    } catch (Exception ex) {
      fail("validateIdentifier should not throw when given null; it should return false. Threw: " + ex);
    }
    assertFalse("validateIdentifier(null) should return false (null is not a valid identifier)", valid);
    // Also assert that the method respects the contract: null input should be treated as invalid
    assertFalse("Double-check: null is not a valid identifier", identifier.validateIdentifier(null));
  }
}