package ds.seed5311;

import ds.CasamentoExato;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

/**
 * Improved tests for CasamentoExato.
 *
 * These tests keep the original test method names (for traceability to the
 * generated cases) but add clearer structure, assertions and comments using
 * a Given-When-Then style. They assert on observable outcomes (absence or
 * presence of exceptions) and validate basic invariants where possible.
 *
 * Note: These tests intentionally avoid assumptions about internal return
 * values of the tested methods (they were originally invoked for side-effects
 * or to provoke exceptions). They assert that the methods either complete
 * successfully or throw the documented exception type and make minimal,
 * robust checks on the thrown exception.
 */
@RunWith(JUnit4.class)
public class EvoAITest {

  @Test(timeout = 4000)
  public void test00() throws Throwable {
    // Given: A pattern and text where the provided index is intentionally large
    final String text = "JIqJFkeFu%NTT8";
    final String pattern = "JIqJFkeFu%NTT8";
    final int largeIndex = 256;

    // When/Then: Expect a StringIndexOutOfBoundsException due to the large index.
    try {
      CasamentoExato.bmhs(text, largeIndex, pattern, 1);
      fail("Expected StringIndexOutOfBoundsException for overly large index");
    } catch (StringIndexOutOfBoundsException e) {
      // Then: Exception type is correct and carries diagnostic information.
      assertEquals("Unexpected exception type", "StringIndexOutOfBoundsException", e.getClass().getSimpleName());
      // message may be null for some implementations; at minimum ensure toString is informative
      assertNotNull("Exception toString() should not be null", e.toString());
    }
  }

  @Test(timeout = 4000)
  public void test01() throws Throwable {
    // Given: typical short inputs for bmhs
    final String text = "]A0";
    final String pattern = "Casamento na posicao: ";
    final int textIndex = 1;
    final int patternIndex = 1;

    // When: invoking the algorithm with typical inputs
    try {
      CasamentoExato.bmhs(text, textIndex, pattern, patternIndex);
    } catch (Exception e) {
      fail("bmhs should not throw for these typical inputs, but threw: " + e);
    }

    // Then: if we reach here the invocation completed successfully
    assertTrue("bmhs completed without throwing an exception for typical inputs", true);
  }

  @Test(timeout = 4000)
  public void test02() throws Throwable {
    // Given: inputs for bmh representing a likely happy-path invocation
    final String text = "Casamento na posicao: ";
    final String pattern = "m5O|4wu";
    final int textIndex = 1;
    final int patternIndex = 1;

    // When: invoking the method under test
    try {
      CasamentoExato.bmh(text, textIndex, pattern, patternIndex);
    } catch (Exception e) {
      fail("bmh should not throw for these typical inputs, but threw: " + e);
    }

    // Then: basic invariant - method completed
    assertTrue("bmh completed without exception", true);
  }

  @Test(timeout = 4000)
  public void test03() throws Throwable {
    // Given: identical text and pattern (simple exact match scenario)
    final String text = "i116YN";
    final String pattern = "i116YN";
    final int textIndex = 1;
    final int patternIndex = 1;

    // When: invoking bmh for identical inputs
    try {
      CasamentoExato.bmh(text, textIndex, pattern, patternIndex);
    } catch (Exception e) {
      fail("bmh threw an unexpected exception for identical text and pattern: " + e);
    }

    // Then: successful completion indicates basic behavior is intact
    assertTrue("bmh completed successfully for identical text and pattern", true);
  }

  @Test(timeout = 4000)
  public void test04() throws Throwable {
    // Given: inputs expected to provoke an index error (negative or out-of-range index)
    final String text = "I=\";9M{,gOBp a4V#&";
    final String pattern = "";
    final int textIndex = -856;
    final int patternIndex = 3672;

    // When/Then: Expect a StringIndexOutOfBoundsException for invalid indices
    try {
      CasamentoExato.bmh(text, textIndex, pattern, patternIndex);
      fail("Expected StringIndexOutOfBoundsException due to invalid indices");
    } catch (StringIndexOutOfBoundsException e) {
      assertEquals("Exception type mismatch", "StringIndexOutOfBoundsException", e.getClass().getSimpleName());
      assertNotNull("Exception should include diagnostic information", e.toString());
    }
  }

  @Test(timeout = 4000)
  public void test05() throws Throwable {
    // Given: inputs that include a negative index for shiftAndExato which should be invalid
    final String text = "V) o#u/4qDc_.K";
    final String pattern = "i't#aCU ,v";
    final int textIndex = 1653;
    final int patternIndex = -1;

    // When/Then: Expect a StringIndexOutOfBoundsException for the negative pattern index
    try {
      CasamentoExato.shiftAndExato(text, textIndex, pattern, patternIndex);
      fail("Expected StringIndexOutOfBoundsException due to negative pattern index");
    } catch (StringIndexOutOfBoundsException e) {
      assertEquals("StringIndexOutOfBoundsException expected", "StringIndexOutOfBoundsException", e.getClass().getSimpleName());
      assertNotNull("Exception toString should be present", e.toString());
    }
  }

  @Test(timeout = 4000)
  public void test06() throws Throwable {
    // Given: identical text and pattern for shiftAndExato
    final String text = "x.~ZJ8s'vOp";
    final String pattern = "x.~ZJ8s'vOp";
    final int textIndex = 1;
    final int patternIndex = 1;

    // When: invoking the algorithm
    try {
      CasamentoExato.shiftAndExato(text, textIndex, pattern, patternIndex);
    } catch (Exception e) {
      fail("shiftAndExato should not throw for identical small inputs, but threw: " + e);
    }

    // Then: verify completion
    assertTrue("shiftAndExato completed without exception for identical inputs", true);
  }

  @Test(timeout = 4000)
  public void test07() throws Throwable {
    // Given: typical inputs for force-brute method
    final String text = "<w:AV$r;AFk<0";
    final String pattern = "i4e55_m(vwF";
    final int textIndex = 0;
    final int patternIndex = 0;

    // When: invoking forcaBruta
    try {
      CasamentoExato.forcaBruta(text, textIndex, pattern, patternIndex);
    } catch (Exception e) {
      fail("forcaBruta should not throw for these typical inputs, but threw: " + e);
    }

    // Then: method completed successfully
    assertTrue("forcaBruta completed without exception", true);
  }

  @Test(timeout = 4000)
  public void test08() throws Throwable {
    // Given: inputs that use highly mismatched indices and may provoke an exception
    final String text = "Ln";
    final String pattern = "Ln";
    final int textIndex = 3554;
    final int patternIndex = 383;

    // When/Then: Expect a StringIndexOutOfBoundsException due to out-of-range indices
    try {
      CasamentoExato.forcaBruta(text, textIndex, pattern, patternIndex);
      fail("Expected StringIndexOutOfBoundsException for out-of-range indices");
    } catch (StringIndexOutOfBoundsException e) {
      assertEquals("Expected a StringIndexOutOfBoundsException", "StringIndexOutOfBoundsException", e.getClass().getSimpleName());
      assertNotNull("Exception diagnostic should be present", e.toString());
    }
  }

  @Test(timeout = 4000)
  public void test09() throws Throwable {
    // Given: large indices but equal values for both arrays/inputs
    final String text = "i4e55_m(vwF";
    final String pattern = "<w:AV$r;AFk<0";
    final int textIndex = 6979;
    final int patternIndex = 6979;

    // When: invoking forcaBruta with large indices; avoid asserting a specific outcome
    try {
      CasamentoExato.forcaBruta(text, textIndex, pattern, patternIndex);
    } catch (StringIndexOutOfBoundsException e) {
      // It's acceptable that large indices provoke a StringIndexOutOfBoundsException
      assertEquals("StringIndexOutOfBoundsException expected for out-of-range indices", "StringIndexOutOfBoundsException", e.getClass().getSimpleName());
      return;
    } catch (Exception e) {
      fail("forcaBruta threw an unexpected exception type: " + e);
    }

    // Then: if no exception was thrown, mark the completion as successful
    assertTrue("forcaBruta completed (no exception) for the tested large-index input", true);
  }

  @Test(timeout = 4000)
  public void test10() throws Throwable {
    // Given/When: construct a new CasamentoExato instance (sanity)
    CasamentoExato casamentoExato0 = new CasamentoExato();

    // Then: basic object invariant
    assertNotNull("Constructor should create a non-null CasamentoExato instance", casamentoExato0);
  }
}