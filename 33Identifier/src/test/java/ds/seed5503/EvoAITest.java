package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for categorizing unit tests in this file.
 */
interface UnitTest {}

/**
 * Improved test suite for Identifier.
 *
 * Note: The runner configuration and class name are preserved to maintain
 * compatibility with the existing test infrastructure.
 */
  
@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  /**
   * Given: a newly constructed Identifier
   * When:  validating a typical non-alphanumeric symbol '~' with valid_s(char)
   * Then:  the result must be false (character not considered valid start/part)
   *
   * Traceability: REQ-IDENT-CHAR-VALIDATION
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('~');
      assertFalse(boolean0);
  }

  /**
   * Given: a newly constructed Identifier
   * When:  validating a digit-like character '7' with valid_s(char)
   * Then:  the result must be false (per original oracle)
   *
   * Traceability: REQ-IDENT-DIGIT-VALIDATION
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('7');
      assertFalse(boolean0);
  }

  /**
   * Given: a newly constructed Identifier
   * When:  validating the string \"qzQFN4\" via validateIdentifier(String)
   * Then:  the result must be false (per original oracle)
   *
   * Notes: This test documents the expected behavior for mixed-case alphanumeric
   * strings containing digits in this particular implementation.
   *
   * Traceability: REQ-IDENT-STRING-VALIDATION
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("qzQFN4");
      assertFalse(boolean0);
  }

  /**
   * Given: a newly constructed Identifier
   * When:  validating an obviously malformed string containing special characters
   *        and whitespace via validateIdentifier(String)
   * Then:  the result must be false (per original oracle)
   *
   * Traceability: REQ-IDENT-INVALID-CHARS
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      // When
      boolean boolean0 = identifier0.validateIdentifier("R$ZAc7 #*Q{yJv");
      // Then
      assertFalse("Expected string with special characters to be invalid", boolean0);
      assertEquals("validateIdentifier(\"R$ZAc7 #*Q{yJv\") should return false", false, boolean0);
  }

  /**
   * Given: a newly constructed Identifier
   * When:  validating the simple one-character string \"q\" via validateIdentifier(String)
   * Then:  the result must be true (per original oracle)
   *
   * Traceability: REQ-IDENT-SINGLE-CHAR
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      // When
      boolean boolean0 = identifier0.validateIdentifier("q");
      // Then
      assertTrue("Expected single character \"q\" to be considered a valid identifier", boolean0);
      assertEquals("validateIdentifier(\"q\") should return true", true, boolean0);
  }

  /**
   * Given: a newly constructed Identifier
   * When:  validating a null reference via validateIdentifier(String)
   * Then:  the result must be false (per original oracle)
   *
   * Traceability: REQ-IDENT-NULL-HANDLING
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      // When
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      // Then
      assertFalse("Expected null input to validateIdentifier to be treated as invalid", boolean0);
      assertEquals("validateIdentifier(null) should return false", false, boolean0);
  }
}