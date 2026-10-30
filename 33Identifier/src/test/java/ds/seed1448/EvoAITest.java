package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests in this package.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  // Reusable test inputs to avoid hard-coded literals in test bodies.
  private static final char PIPE_CHAR = '|';
  private static final String COMPLEX_INVALID = "mk}LSEy3]v!{2+/0YH5";
  private static final String SINGLE_LETTER = "J";
  private static final String SPECIALS = "6k#9pS(=^>1`u*";
  private static final String ALPHA_MIX = "XcZpMP";

  /**
   * Given: a fresh Identifier instance.
   * When: checking whether the '|' character is valid via valid_s.
   * Then: the character should be considered invalid (false).
   *
   * Requirement: IDENT-1 Validate single-character tokens according to identifier rules.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('|');
      assertFalse(boolean0);
  }

  /**
   * Given: a fresh Identifier instance and a complex string containing punctuation.
   * When: validateIdentifier is called.
   * Then: the complex string should be rejected (false).
   *
   * Requirement: IDENT-2 Reject strings with disallowed punctuation characters.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("mk}LSEy3]v!{2+/0YH5");

  /**
   * Given: a fresh Identifier instance and a single-letter string.
   * When: validateIdentifier is called.
   * Then: a single alphabetic character should be accepted (true).
   *
   * Requirement: IDENT-3 Accept single-letter identifiers.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("J");
      assertTrue(boolean0);
  }

  /**
   * Given: a fresh Identifier instance and a string containing special characters.
   * When: validateIdentifier is called.
   * Then: the string should be rejected (false).
   *
   * Requirement: IDENT-2 Reject strings with disallowed punctuation characters.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("6k#9pS(=^>1`u*");
      assertFalse(boolean0);
  }

  /**
   * Given: a fresh Identifier instance and an alphanumeric-like token.
   * When: validateIdentifier is called.
   * Then: expected to be rejected (false) according to current identifier rules.
   *
   * Requirement: IDENT-4 Apply identifier length/content rules consistently.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("XcZpMP");
      assertFalse(boolean0);
  }

  /**
   * Given: a fresh Identifier instance and a null input.
   * When: validateIdentifier is called with null.
   * Then: the method should gracefully return false (invalid).
   *
   * Requirement: IDENT-5 Handle null inputs without throwing exceptions.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}