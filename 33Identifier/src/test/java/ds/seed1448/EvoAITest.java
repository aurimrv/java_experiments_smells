package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Identifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for Identifier.
 *
 * <p>These tests exercise a small, focused set of requirements for the Identifier
 * utility: basic acceptance of simple identifiers, rejection of invalid inputs,
 * and stable/consistent behavior across repeated invocations. Tests are intentionally
 * small and focused (Unit tests). Trace: REQ-IDENT-001.</p>
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends Identifier_ESTest_scaffolding {

  /**
   * Given a character that is not allowed in identifiers,
   * when valid_s is invoked,
   * then the result should be false and the result must be stable across calls.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();

      // When
      char illegal = '|';
      boolean first = identifier0.valid_s(illegal);

      // Then
      assertFalse("Character '|' should not be considered valid as part of an identifier", first);
      // Verify idempotence / reproducibility
      boolean second = identifier0.valid_s(illegal);
      assertEquals("valid_s must return a stable result for repeated calls with the same input", first, second);
  }

  /**
   * Given a long string containing a variety of non-identifier characters,
   * when validateIdentifier is invoked,
   * then the result should be false and be reproducible.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String input = "mk}LSEy3]v!{2+/0YH5";

      // When
      boolean first = identifier0.validateIdentifier(input);

      // Then
      assertFalse("A string containing punctuation/brackets should be rejected as an identifier", first);
      // Reproducibility check
      assertEquals("validateIdentifier should be deterministic for the same input", first, identifier0.validateIdentifier(input));
  }

  /**
   * Given a single-letter identifier,
   * when validateIdentifier is invoked,
   * then it should be considered valid. Also ensure repeated calls are consistent.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String single = "J";

      // When
      boolean result = identifier0.validateIdentifier(single);

      // Then
      assertTrue("Single-letter identifier 'J' is expected to be valid", result);
      // Ensure deterministic behavior across repeated calls
      assertEquals("validateIdentifier must return the same result on repeated calls for the same input", result, identifier0.validateIdentifier(new String(single)));
  }

  /**
   * Given a string containing digits and a variety of special characters,
   * when validateIdentifier is invoked,
   * then it should be rejected and behavior should be consistent.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String complicated = "6k#9pS(=^>1`u*";

      // When
      boolean first = identifier0.validateIdentifier(complicated);

      // Then
      assertFalse("Strings containing special characters should not be valid identifiers", first);
      // Consistency check
      assertEquals("Subsequent calls should yield the same boolean result", first, identifier0.validateIdentifier(complicated));
  }

  /**
   * Given a short alphabetic string,
   * when validateIdentifier is invoked,
   * then the result is asserted (keeps parity with original expectations) and checked for determinism.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();
      String alpha = "XcZpMP";

      // When
      boolean first = identifier0.validateIdentifier(alpha);

      // Then
      assertFalse("The sample alphabetic string is expected (per original test) to be rejected; this documents that expectation", first);
      // Determinism
      assertEquals("validateIdentifier should behave deterministically for identical inputs", first, identifier0.validateIdentifier(alpha));
  }

  /**
   * Given a null input,
   * when validateIdentifier is invoked,
   * then it should safely return false (not throw) and be consistent across calls.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      Identifier identifier0 = new Identifier();

      // When
      boolean first = identifier0.validateIdentifier((String) null);

      // Then
      assertFalse("Null input must be handled and considered invalid (should not throw an exception)", first);
      // Reproducibility: calling again should return the same value (and not throw)
      assertEquals("Calling validateIdentifier repeatedly with null must yield consistent results", first, identifier0.validateIdentifier((String) null));
  }
}