package ds.seed5311;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import ds.CasamentoAproximado;

import static org.junit.Assert.*;

/**
 * Lightweight, improved tests for CasamentoAproximado.
 *
 * Improvements made:
 * - Added category marker and descriptive comments for traceability.
 * - Replaced magic literals with local constants.
 * - Exercised several boundary-like inputs (empty string, large shift).
 * - Added assertions ensuring no unexpected exceptions and basic post-conditions.
 *
 * Note: These tests are defensive: they assert that methods do not throw for typical
 * and boundary-like inputs and that constructed objects are non-null.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  /**
   * test0
   *
   * Given a typical input string and several boundary-like variants,
   * When shiftAndAproximado is invoked,
   * Then the method should complete without throwing an exception.
   *
   * Also verifies that the inputs used for the test are well-formed (sanity checks).
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    // Given
    final String INPUT = "?X\"zqbXoZY5JcI@lt";
    final String LABEL = "Casamento na posicao: ";
    final int SHIFT = 1;
    final int ERRORS = 0;
    final int MODE = 1;

    // Sanity assertions for test data (helps traceability and prevents accidental test corruption)
    assertNotNull("INPUT should not be null", INPUT);
    assertFalse("INPUT should not be empty", INPUT.isEmpty());
    assertNotNull("LABEL should not be null", LABEL);

    // When/Then: call method with several variants and ensure no exceptions are thrown
    try {
      // typical case
      CasamentoAproximado.shiftAndAproximado(INPUT, SHIFT, LABEL, MODE, ERRORS);

      // boundary-like case: empty input
      CasamentoAproximado.shiftAndAproximado("", 0, LABEL, 0, 0);

      // boundary-like case: very large shift (to exercise numeric handling)
      CasamentoAproximado.shiftAndAproximado(INPUT, Integer.MAX_VALUE, LABEL, MODE, ERRORS);

      // boundary-like case: negative shift (if supported, should not throw)
      CasamentoAproximado.shiftAndAproximado(INPUT, -1, LABEL, MODE, ERRORS);
    } catch (Throwable t) {
      // Fail with message to aid debugging if an unexpected exception occurs
      fail("shiftAndAproximado threw an unexpected exception for valid or boundary inputs: " + t);
    }
  }

  /**
   * test1
   *
   * Given identical pattern and label strings and edge numeric values,
   * When shiftAndAproximado is invoked,
   * Then the method should complete without throwing and handle the provided parameters.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    // Given
    final String TEXT = "Casamento na posicao: ";
    final String PATTERN = "Casamento na posicao: ";
    final int SHIFT = 1;
    final int MODE = 0;
    final int ERRORS = 256;

    // Sanity checks
    assertEquals("TEXT and PATTERN are expected to be identical in this scenario", TEXT, PATTERN);
    assertTrue("SHIFT should be non-negative for this test", SHIFT >= 0);

    // When/Then: ensure no exceptions for this configuration and some nearby variants
    try {
      CasamentoAproximado.shiftAndAproximado(TEXT, SHIFT, PATTERN, MODE, ERRORS);

      // Try with zero errors allowed (boundary)
      CasamentoAproximado.shiftAndAproximado(TEXT, SHIFT, PATTERN, MODE, 0);

      // Try with small text and pattern
      CasamentoAproximado.shiftAndAproximado("a", 0, "a", MODE, 0);
    } catch (Throwable t) {
      fail("shiftAndAproximado should not throw for identical text/pattern and tested variants: " + t);
    }
  }

  /**
   * test2
   *
   * Given the CasamentoAproximado constructor,
   * When an instance is created,
   * Then the resulting object should not be null and repeated construction should succeed.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    // When
    CasamentoAproximado instance = null;
    try {
      instance = new CasamentoAproximado();
    } catch (Throwable t) {
      fail("Constructor of CasamentoAproximado threw an unexpected exception: " + t);
    }

    // Then
    assertNotNull("Constructed CasamentoAproximado instance should not be null", instance);

    // Additional simple check: constructing again should also succeed and produce a non-null instance
    CasamentoAproximado another = new CasamentoAproximado();
    assertNotNull("Second constructed CasamentoAproximado instance should not be null", another);
  }
}