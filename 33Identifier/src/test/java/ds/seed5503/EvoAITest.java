package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Marker interface used to categorize unit tests for selective execution.
 * Must be package-level and declared before the test class.
 */
interface UnitTest {}

/**
 * Improved tests for Identifier with clearer structure, messages, and helper reuse.
 *
 * Traceability:
 *  - @see REQ-IDENT-001 : Identifier character/identifier validation requirements
 *
 * Notes:
 *  - Tests retain the original @Test method names to preserve external references.
 *  - Each test follows a Given-When-Then style (comments) and includes descriptive assertion messages.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  // Reusable requirement identifier for traceability in assertions/messages.
  private static final String REQ_ID = "REQ-IDENT-001";

  /**
   * Helper to create an Identifier instance.
   * Centralizes construction to avoid duplicated setup in tests.
   */
  private Identifier createIdentifier() {
    return new Identifier();
  }

  /**
   * Helper to assert that repeated calls are deterministic for a given character.
   */
  private void assertDeterministicForChar(Identifier id, char c) {
    boolean first = id.valid_s(c);
    boolean second = id.valid_s(c);
    assertEquals("Determinism check failed for char '" + c + "' (" + REQ_ID + ")", first, second);
  }

  /**
   * Test scenario: validate single character '~' is not considered valid by valid_s.
   *
   * Given: an Identifier instance and the character '~'
   * When:  valid_s is invoked
   * Then:  it should return false and be deterministic on repeated calls
   *
   * Requirement: REQ-IDENT-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Identifier identifier0 = createIdentifier();
      assertNotNull("Identifier instance should be created (" + REQ_ID + ")", identifier0);

      // When
      boolean resultFirst = identifier0.valid_s('~');

      // Then
      assertFalse("Expected '~' to be invalid according to identifier rules (" + REQ_ID + ")", resultFirst);

      // Additional property: calling again yields same result (idempotence/determinism)
      assertDeterministicForChar(identifier0, '~');
  }

  /**
   * Test scenario: validate single character '7' behavior and determinism.
   *
   * Given: an Identifier instance and the digit '7'
   * When:  valid_s is invoked
   * Then:  it should return a stable boolean (expected false based on prior behavior)
   *
   * Requirement: REQ-IDENT-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Identifier identifier0 = createIdentifier();
      assertNotNull("Identifier instance should be created (" + REQ_ID + ")", identifier0);

      // When
      boolean resultFirst = identifier0.valid_s('7');

      // Then
      assertFalse("Expected '7' to be invalid according to identifier rules in this implementation (" + REQ_ID + ")", resultFirst);

      // Additional property: repeated calls return the same result
      assertDeterministicForChar(identifier0, '7');
  }

  /**
   * Test scenario: validate multi-character string "qzQFN4".
   *
   * Given: an Identifier instance and the input string "qzQFN4"
   * When:  validateIdentifier is invoked
   * Then:  it should return false for this input and be deterministic on repeated invocations
   *
   * Requirement: REQ-IDENT-001
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Identifier identifier0 = createIdentifier();
      assertNotNull("Identifier instance should be created (" + REQ_ID + ")", identifier0);
      final String input = "qzQFN4";

      // When
      boolean resultFirst = identifier0.validateIdentifier(input);

      // Then
      assertFalse("Expected validateIdentifier(\"" + input + "\") to be false for this implementation (" + REQ_ID + ")", resultFirst);

      // Additional property: repeated calls yield same outcome
      boolean resultSecond = identifier0.validateIdentifier(input);
      assertEquals("Repeated invocation must produce the same result (" + REQ_ID + ")", resultFirst, resultSecond);
  }

  /**
   * Test scenario: validate string with special characters "R$ZAc7 #*Q{yJv".
   *
   * Given: an Identifier instance and a string containing whitespace and special characters
   * When:  validateIdentifier is invoked
   * Then:  it should return false and be deterministic on repeated invocations
   *
   * Requirement: REQ-IDENT-001
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Identifier identifier0 = createIdentifier();
      assertNotNull("Identifier instance should be created (" + REQ_ID + ")", identifier0);
      final String specialInput = "R$ZAc7 #*Q{yJv";

      // When
      boolean resultFirst = identifier0.validateIdentifier(specialInput);

      // Then
      assertFalse("Expected validateIdentifier for string with special characters to be false (" + REQ_ID + ")", resultFirst);

      // Additional property: repeated calls yield same outcome
      boolean resultSecond = identifier0.validateIdentifier(specialInput);
      assertEquals("Repeated invocation must produce the same result for special input (" + REQ_ID + ")", resultFirst, resultSecond);
  }

  /**
   * Test scenario: null input to validateIdentifier should be handled gracefully and return false.
   *
   * Given: an Identifier instance and a null input
   * When:  validateIdentifier is invoked with null
   * Then:  it should return false and not throw an exception
   *
   * Requirement: REQ-IDENT-001
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Identifier identifier0 = createIdentifier();
      assertNotNull("Identifier instance should be created (" + REQ_ID + ")", identifier0);

      // When / Then: the method should handle null without throwing and return false
      boolean result = false;
      try {
          result = identifier0.validateIdentifier((String) null);
      } catch (Exception ex) {
          fail("validateIdentifier(null) should not throw an exception (" + REQ_ID + "), but threw: " + ex);
      }

      assertFalse("Expected validateIdentifier(null) to be false and handled gracefully (" + REQ_ID + ")", result);

      // Additional property: subsequent calls with null remain consistent
      boolean resultSecond = identifier0.validateIdentifier((String) null);
      assertEquals("validateIdentifier(null) should be deterministic across invocations (" + REQ_ID + ")", result, resultSecond);
  }
}