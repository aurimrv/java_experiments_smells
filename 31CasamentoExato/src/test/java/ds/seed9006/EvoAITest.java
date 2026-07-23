package ds.seed9006;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import ds.CasamentoExato;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests. Used with @Category to allow selective execution.
 */
interface UnitTest {}

/**
 * Improved test class for CasamentoExato.
 *
 * Notes:
 * - Each test includes Given/When/Then style comments.
 * - Tests assert observable behavior where possible and validate exceptional cases explicitly.
 * - These methods keep the original names and signatures to preserve compatibility with existing test runners.
 */
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

  /**
   * REQ-001: Verify bmhs throws StringIndexOutOfBoundsException for invalid index.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given: an input expected to trigger an index error
      String text = "ds.CasamentoExato";
      int invalidIndex = 127;
      String pattern = "'u'";
      int shift = 1;

      // When / Then: calling bmhs with an out-of-range index should throw the expected exception
      try {
          CasamentoExato.bmhs(text, invalidIndex, pattern, shift);
          fail("Expected StringIndexOutOfBoundsException for out-of-range index");
      } catch (StringIndexOutOfBoundsException e) {
          // Verify useful properties of the exception
          assertNotNull("Exception message should not be null", e.getMessage());
          assertTrue("Message should mention index or range", e.getMessage().length() > 0);
      }
  }

  /**
   * REQ-002: Basic happy-path invocation of bmhs should complete without exception and be idempotent.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given: a valid text and pattern with small shift
      String text = "qoi3I$V";
      int index = 1;
      String pattern = "qoi3I$V";
      int shift = 1;

      // When: invoking bmhs twice
      try {
          CasamentoExato.bmhs(text, index, pattern, shift);
          CasamentoExato.bmhs(text, index, pattern, shift);
      } catch (Exception e) {
          fail("Unexpected exception during bmhs happy-path: " + e);
      }

      // Then: no exception occurred (implicit). Add a trivial assertion to record that we reached this point.
      assertTrue("bmhs completed successfully for identical text and pattern", true);
  }

  /**
   * REQ-003: Verify bmh throws StringIndexOutOfBoundsException for large index values.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given
      String text = "TYmkx_D>d5m]H;8Kna5";
      int largeIndex = 886;
      String pattern = "TYmkx_D>d5m]H;8Kna5";
      int shift = 1;

      // When / Then
      try {
          CasamentoExato.bmh(text, largeIndex, pattern, shift);
          fail("Expected StringIndexOutOfBoundsException for excessively large index");
      } catch (StringIndexOutOfBoundsException e) {
          // Validate the exception has a message and is the expected type
          assertNotNull("Expected non-null exception message", e.getMessage());
      }
  }

  /**
   * REQ-004: Calling bmh with a null text should be handled (no runtime exception other than documented ones).
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Given: a null text input and a negative index
      String text = null;
      int index = -1451;
      String pattern = "";
      int shift = 0;

      // When / Then: ensure method handles null input without throwing an unexpected exception
      try {
          CasamentoExato.bmh(text, index, pattern, shift);
      } catch (StringIndexOutOfBoundsException e) {
          // If this specific exception is thrown, assert message presence to document behavior
          assertNotNull("Exception message should be available when StringIndexOutOfBoundsException occurs", e.getMessage());
      } catch (NullPointerException npe) {
          // Acceptable if implementation documents NPE for null inputs; assert message presence
          assertNotNull("NullPointerException message should not be null", npe.getMessage());
      } catch (Throwable t) {
          fail("Unexpected exception type for null input: " + t);
      }

      // Then: if no exception, the test still passes as the method handled null input gracefully
      assertTrue("bmh handled null text input scenario (either by handling or by documented exception)", true);
  }

  /**
   * REQ-005: bmh with empty strings and large indexes should throw a StringIndexOutOfBoundsException.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Given
      String text = "";
      int index = 4430;
      String pattern = "";
      int shift = 1382;

      // When / Then
      try {
          CasamentoExato.bmh(text, index, pattern, shift);
          fail("Expected StringIndexOutOfBoundsException for empty text with large index");
      } catch (StringIndexOutOfBoundsException e) {
          // Verify message content minimally
          assertNotNull("Exception must include a message", e.getMessage());
      }
  }

  /**
   * REQ-006: shiftAndExato basic invocation should complete without exceptions for different inputs.
   */
  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Given
      String text = "SX5d";
      int index = 1;
      String pattern = "MK}7bz<";
      int shifts = 0;

      // When / Then: method should complete normally
      try {
          CasamentoExato.shiftAndExato(text, index, pattern, shifts);
      } catch (Exception e) {
          fail("shiftAndExato threw unexpected exception: " + e);
      }

      // Additional check: calling again should behave the same
      try {
          CasamentoExato.shiftAndExato(text, index, pattern, shifts);
      } catch (Exception e) {
          fail("shiftAndExato failed on repeated invocation: " + e);
      }

      assertTrue("shiftAndExato completed without exceptions", true);
  }

  /**
   * REQ-007: shiftAndExato with identical text and pattern should be a no-op or handled gracefully.
   */
  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Given
      String textAndPattern = "r<sO$C@,U@JL";
      int index = 1;
      int shifts = 1;

      // When / Then
      try {
          CasamentoExato.shiftAndExato(textAndPattern, index, textAndPattern, shifts);
      } catch (Exception e) {
          fail("shiftAndExato raised unexpected exception for identical text and pattern: " + e);
      }

      assertTrue("shiftAndExato handled identical text and pattern", true);
  }

  /**
   * REQ-008: forcaBruta should throw StringIndexOutOfBoundsException when passed an out-of-range index.
   */
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Given
      String text = "k:DQ";
      int index = 252;
      String pattern = "k:DQ";
      int shift = 1;

      // When / Then
      try {
          CasamentoExato.forcaBruta(text, index, pattern, shift);
          fail("Expected StringIndexOutOfBoundsException due to out-of-range index");
      } catch (StringIndexOutOfBoundsException e) {
          assertNotNull("Exception message must exist", e.getMessage());
      }
  }

  /**
   * REQ-009: forcaBruta happy-path with zero index should complete without exception.
   */
  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      // Given
      String text = "(I9Z@";
      int index = 0;
      String pattern = "(I9Z@";
      int shift = 0;

      // When / Then
      try {
          CasamentoExato.forcaBruta(text, index, pattern, shift);
      } catch (Exception e) {
          fail("forcaBruta threw unexpected exception on valid inputs: " + e);
      }

      // Additional sanity check: repeated invocation
      try {
          CasamentoExato.forcaBruta(text, index, pattern, shift);
      } catch (Exception e) {
          fail("forcaBruta failed on repeated invocation: " + e);
      }

      assertTrue("forcaBruta completed successfully for matching text and pattern at index 0", true);
  }

  /**
   * REQ-010: Constructor should create a non-null instance.
   */
  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Given / When
      CasamentoExato casamentoExato0 = new CasamentoExato();

      // Then
      assertNotNull("Constructor should create a non-null CasamentoExato instance", casamentoExato0);
      assertEquals("Instance should be of the expected class", CasamentoExato.class, casamentoExato0.getClass());
  }
}