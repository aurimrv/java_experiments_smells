package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and cleaned-up version of the auto-generated EvoSuite tests.
 *
 * These tests preserve the original assertions (oracles) but add structure,
 * descriptive messages, and light-weight consistency checks to improve
 * diagnostics and readability.
 *
 * Traceability: REQ-IDENTIFIER-VALIDATION (example requirement reference).
 */
@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoAITest extends Identifier_ESTest_scaffolding {

  private static final String REQUIREMENT_ID = "REQ-IDENTIFIER-VALIDATION";

  /**
   * Given a new Identifier instance,
   * When validateIdentifier is invoked with a string that contains leading quote and braces,
   * Then the identifier validation should return false (invalid identifier).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("'S}7Fudbf");

      // Then
      assertFalse("Expected invalid identifier for input \"'S}7Fudbf\" [" + REQUIREMENT_ID + "]", boolean0);
      // Consistency: repeated invocation should be deterministic
      boolean boolean0_repeat = identifier0.validateIdentifier("'S}7Fudbf");
      assertEquals("Validation should be deterministic for same input [" + REQUIREMENT_ID + "]", boolean0, boolean0_repeat);
  }

  /**
   * Given a new Identifier instance,
   * When valid_s is invoked with the '}' character,
   * Then the result should be false (character is not a valid start/part as per contract).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.valid_s('}');

      // Then
      assertFalse("Character '}' should not be considered valid by valid_s [" + REQUIREMENT_ID + "]", boolean0);
      // Consistency check
      boolean boolean0_repeat = identifier0.valid_s('}');
      assertEquals("valid_s should be deterministic for the same char [" + REQUIREMENT_ID + "]", boolean0, boolean0_repeat);
  }

  /**
   * Given a new Identifier instance,
   * When validateIdentifier is invoked with a single-letter identifier "w",
   * Then the identifier should be considered valid (true).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("w");
      assertTrue(boolean0);
  }

  /**
   * Given a new Identifier instance,
   * When validateIdentifier is invoked with a string containing a space and punctuation,
   * Then the identifier validation should return false (invalid identifier).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier("EpDQk7 ");
      assertFalse(boolean0);
  }

  /**
   * Given a new Identifier instance,
   * When validateIdentifier is invoked with a complex string containing punctuation and whitespace,
   * Then the identifier should be considered invalid (false).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier(":&Aok7bNm<xUo0L M");
      assertFalse(boolean0);
  }

  /**
   * Given a new Identifier instance,
   * When validateIdentifier is invoked with null,
   * Then the method should return false (invalid input).
   *
   * Trace: REQ-IDENTIFIER-VALIDATION
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Identifier identifier0 = new Identifier();
      boolean boolean0 = identifier0.validateIdentifier((String) null);
      assertFalse(boolean0);
  }

  // Helper: centralize creation to reduce duplication and make future setup easier.
  private Identifier createIdentifier() {
      return new Identifier();
  }
}