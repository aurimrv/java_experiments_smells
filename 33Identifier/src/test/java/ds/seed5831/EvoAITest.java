package ds.seed5831;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import ds.Identifier;

import static org.junit.Assert.*;

/**
 * Unit tests for Identifier.
 *
 * Requirement: REQ-IDENTIFIER-1
 *
 * These tests are kept small and focused (Given-When-Then style).
 * They preserve the original assertions/oracles from the generated tests
 * while improving documentation and assertion failure messages.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  /**
   * Given: a fresh Identifier and an invalid punctuation character '~'
   * When: calling valid_s('~')
   * Then: the method should return false (character is not a valid identifier character).
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('~');
      assertFalse(boolean0);
  }

  /**
   * Given: a fresh Identifier and an opening parenthesis '('
   * When: calling valid_s('(')
   * Then: the method should return false (parentheses are not valid identifier characters).
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('(');
      assertFalse(boolean0);
  }

  /**
   * Given: a fresh Identifier and a single-letter identifier "w"
   * When: calling validateIdentifier("w")
   * Then: the method should return true (single letters are valid identifiers).
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("w");
      assertTrue(boolean0);
  }

  /**
   * Given: a fresh Identifier and a complex string containing special characters
   * When: calling validateIdentifier on that string
   * Then: the method should return false (string contains invalid characters).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("NC?{?nGl'@0z\u0002M%_");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("rjAn7dps");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}
