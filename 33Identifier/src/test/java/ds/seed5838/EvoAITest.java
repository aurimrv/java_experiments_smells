package ds.seed5838;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Identifier.
 *
 * Requirement traceability: REQ-IDENT-001 - Identifier validation rules.
 *
 * The tests exercise a mix of typical and edge-case scenarios and include
 * idempotence and simple cross-checks to detect non-deterministic behavior.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given: a fresh Identifier instance and the character to test
    Identifier identifier0 = new Identifier();
    char input = '(';

    // When: we ask whether the single character is a valid identifier character
    boolean firstResult = identifier0.valid_f(input);

    // Then: expect the implementation to treat '(' as invalid for identifiers
    assertFalse("Character '(' should not be considered a valid identifier character.", firstResult);

    // And: repeated calls should be deterministic (idempotence)
    boolean secondResult = identifier0.valid_f(input);
    assertEquals("valid_f must return the same result on repeated calls for the same input.", firstResult, secondResult);

    // And: for single-character inputs, validateIdentifier should agree with valid_f
    try {
      boolean validateResult = identifier0.validateIdentifier(String.valueOf(input));
      assertEquals("validateIdentifier(singleChar) should be consistent with valid_f for the same character.", firstResult, validateResult);
    } catch (Exception e) {
      fail("validateIdentifier should not throw for single-character input '(' but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given: an Identifier and a simple valid-looking identifier
    Identifier identifier0 = new Identifier();
    String candidate = "p";

    // When: validating the identifier
    boolean firstResult = identifier0.validateIdentifier(candidate);

    // Then: 'p' is expected to be a valid identifier according to the original behavior
    assertTrue("Single lowercase letter 'p' should be a valid identifier.", firstResult);

    // And: results should be stable across repeated invocations
    boolean secondResult = identifier0.validateIdentifier(candidate);
    assertEquals("validateIdentifier must be deterministic for the same input 'p'.", firstResult, secondResult);

    // And: cross-check with valid_f for the single character
    try {
      boolean charCheck = identifier0.valid_f('p');
      assertEquals("valid_f('p') and validateIdentifier(\"p\") should agree for single-character identifier.", charCheck, firstResult);
    } catch (Exception e) {
      fail("valid_f should not throw for character 'p' but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // Given: an Identifier and a complex string containing special characters
    Identifier identifier0 = new Identifier();
    String candidate = "&L_|vCW:e|7`";

    // When: validating the complex candidate
    boolean firstResult = identifier0.validateIdentifier(candidate);

    // Then: the original behavior was to consider this invalid; verify that
    assertFalse("String containing special characters should be considered invalid: " + candidate, firstResult);

    // And: repeated validation must be consistent
    boolean secondResult = identifier0.validateIdentifier(candidate);
    assertEquals("validateIdentifier must be deterministic for the same complex input.", firstResult, secondResult);

    // And: ensure no unexpected exceptions are thrown on repeated checks
    try {
      boolean thirdResult = identifier0.validateIdentifier(new String(candidate));
      assertEquals("Repeated calls with equivalent input should yield the same result.", firstResult, thirdResult);
    } catch (Exception e) {
      fail("validateIdentifier should not throw for complex input but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test3() throws Throwable {
    // Given: an Identifier and a single-pipe character input
    Identifier identifier0 = new Identifier();
    String candidate = "|";

    // When: validating the candidate
    boolean firstResult = identifier0.validateIdentifier(candidate);

    // Then: original expectation was that '|' is invalid
    assertFalse("The '|' character should not form a valid identifier on its own.", firstResult);

    // And: repeated calls should be stable (idempotence)
    boolean secondResult = identifier0.validateIdentifier(candidate);
    assertEquals("validateIdentifier must return the same result on repeated calls for '|'.", firstResult, secondResult);

    // And: cross-check with valid_f for the single char form
    try {
      boolean charCheck = identifier0.valid_f('|');
      assertEquals("For single-character inputs, valid_f and validateIdentifier should be consistent for '|'.", charCheck, firstResult);
    } catch (Exception e) {
      fail("valid_f should not throw for '|' but threw: " + e);
    }
  }

  @Test(timeout = 4000)
  public void test4() throws Throwable {
    // Given: an Identifier and an alphanumeric-looking string
    Identifier identifier0 = new Identifier();
    String candidate = "I7SVNqA";

    // When: validating the alphanumeric candidate
    boolean firstResult = identifier0.validateIdentifier(candidate);

    // Then: original behavior treated this as invalid; assert that
    assertFalse("Alphanumeric string 'I7SVNqA' expected to be invalid per original behavior.", firstResult);

    // And: repeated calls should yield the same result
    boolean secondResult = identifier0.validateIdentifier(candidate);
    assertEquals("validateIdentifier must be deterministic for 'I7SVNqA'.", firstResult, secondResult);

    // And: verify that using a fresh equivalent String produces same outcome (defensive)
    String candidateCopy = new String(candidate);
    boolean copyResult = identifier0.validateIdentifier(candidateCopy);
    assertEquals("Semantically equivalent inputs should produce the same validation result.", firstResult, copyResult);
  }

  @Test(timeout = 4000)
  public void test5() throws Throwable {
    // Given: an Identifier and a null input (error scenario)
    Identifier identifier0 = new Identifier();
    String candidate = null;

    // When/Then: validateIdentifier should handle null gracefully and return false
    try {
      boolean firstResult = identifier0.validateIdentifier(candidate);
      assertFalse("validateIdentifier should return false for null input rather than throwing.", firstResult);

      // And: repeated calls with null should be stable
      boolean secondResult = identifier0.validateIdentifier(candidate);
      assertEquals("validateIdentifier must be deterministic for null input.", firstResult, secondResult);
    } catch (NullPointerException npe) {
      // If the implementation throws NPE, fail the test to indicate non-robust handling
      fail("validateIdentifier must handle null input without throwing NullPointerException.");
    } catch (Exception e) {
      // Any other unexpected exception should fail the test with details
      fail("validateIdentifier threw an unexpected exception for null input: " + e);
    }
  }
}