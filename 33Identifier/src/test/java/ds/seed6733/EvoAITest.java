package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface for unit tests so they can be categorized.
 */
interface UnitTest {}

/**
 * Improved tests for Identifier.
 *
 * Note: This class preserves the original test method names and EvoSuite runner annotations
 * as required by the project's test infrastructure.
 */

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  /**
   * Given an Identifier instance,
   * When validateIdentifier is invoked with a complex string containing punctuation,
   * Then the result should be false (invalid identifier).
   *
   * Traceability: REQ-IDENT-INVALID-CHAR
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("ayy/a49=}H~%oXnC0f");

      // Then
      assertFalse("Expected the complex string with punctuation to be invalid", boolean0);
  }

  /**
   * Given an Identifier instance,
   * When valid_s is called with a disallowed character ('}'),
   * Then the method should return false indicating the character is not valid.
   *
   * Traceability: REQ-IDENT-CHAR-VALIDATION
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('}');

      // Then
      assertFalse("The '}' character should be considered invalid by valid_s", boolean0);
  }

  /**
   * Given an Identifier instance,
   * When validateIdentifier is invoked with a single-letter identifier ("l"),
   * Then the method should accept it (return true).
   *
   * Traceability: REQ-IDENT-SIMPLE_VALID
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("l");
      assertTrue(boolean0);
  }

  /**
   * Given an Identifier instance,
   * When validateIdentifier is invoked with a single-quote character ("'"),
   * Then the method should return false (invalid identifier).
   *
   * Traceability: REQ-IDENT-INVALID-CHAR
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("'");
      assertFalse(boolean0);
  }

  /**
   * Given an Identifier instance,
   * When validateIdentifier is invoked with the string "MUDAVr",
   * Then the method is expected to return false according to the current specification.
   *
   * Traceability: REQ-IDENT-CASE-SENSITIVE
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("MUDAVr");
      assertFalse(boolean0);
  }

  /**
   * Given an Identifier instance,
   * When validateIdentifier is invoked with a null input,
   * Then the method should safely return false (invalid).
   *
   * Traceability: REQ-IDENT-NULL-SAFE
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }
}