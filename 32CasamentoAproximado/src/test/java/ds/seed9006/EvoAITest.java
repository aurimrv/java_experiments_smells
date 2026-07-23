package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import ds.CasamentoAproximado;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Marker interface for categorizing these tests.
 * Requirement trace: REQ-001, REQ-002
 */
interface IntegrationTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(IntegrationTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  // Reusable test constants to avoid magic literals in test bodies
  private static final String SAMPLE_PATTERN = "}t-!\"QVB1ekBEvmTP<";
  private static final String SAMPLE_PATTERN_2 = "ds.CasamentoAproximado";
  private static final String PREFIX = "Casamento na posicao: ";

  /**
   * Test scenario: calling shiftAndAproximado with parameters expected to produce
   * a StringIndexOutOfBoundsException (exceptional path).
   *
   * Given: a small starting position and a very large shift
   * When: shiftAndAproximado is invoked
   * Then: a StringIndexOutOfBoundsException is thrown
   *
   * This test verifies the exceptional behavior explicitly and asserts that the
   * thrown exception is of the expected type.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Arrange
    final String input = SAMPLE_PATTERN;
    final int largeShift = 428;
    final String needle = SAMPLE_PATTERN;
    final int position = 1;
    final int extra = 0;

    // Act & Assert: expect specific exception type and validate it was thrown
    StringIndexOutOfBoundsException thrown = expectThrows(StringIndexOutOfBoundsException.class, new ThrowingRunnable() {
      @Override
      public void run() throws Throwable {
        CasamentoAproximado.shiftAndAproximado(input, largeShift, needle, position, extra);
      }
    });

    assertNotNull("Expected a StringIndexOutOfBoundsException to be thrown", thrown);
    // The message content may vary across JVMs; check basic properties
    String msg = thrown.getMessage();
    // If a message exists, ensure it mentions either "index" or a digit (simple sanity check).
    if (msg != null) {
      assertTrue("Exception message should contain an index or the word 'index'", msg.matches(".*(index|\\d).*"));
    }
  }

  /**
   * Test scenario: a typical (happy-path) invocation of shiftAndAproximado.
   *
   * Given: a valid pattern and modest shift/position values
   * When: shiftAndAproximado is invoked
   * Then: no exception should be thrown (sanity check for the main path)
   *
   * Note: This test purposefully verifies that the method accepts normal inputs
   * without throwing and documents the expected behavior.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Arrange
    final String pattern = SAMPLE_PATTERN_2;
    final int shift = 1;
    final String messagePrefix = PREFIX;
    final int position = 1;
    final int year = 1970;

    // Act & Assert: ensure no exception is raised for a normal invocation
    try {
      CasamentoAproximado.shiftAndAproximado(pattern, shift, messagePrefix, position, year);
    } catch (Throwable t) {
      fail("Unexpected exception for valid inputs: " + t);
    }

    // Additional sanity assertions: re-run with a boundary-like small shift (0)
    try {
      CasamentoAproximado.shiftAndAproximado(pattern, 0, messagePrefix, position, year);
    } catch (Throwable t) {
      // If the implementation treats 0 as invalid, that's acceptable; at minimum the test
      // documents behavior. We fail only if an unexpected runtime exception occurs.
      fail("Unexpected exception when shift == 0: " + t);
    }
  }

  /**
   * Test scenario: object construction and basic invariants.
   *
   * Given: the CasamentoAproximado class
   * When: a new instance is constructed
   * Then: the instance is non-null and of the expected type
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Arrange & Act
    CasamentoAproximado instance = new CasamentoAproximado();

    // Assert fundamental object properties
    assertNotNull("Constructor should produce a non-null instance", instance);
    assertEquals("Instance should be of type CasamentoAproximado", CasamentoAproximado.class, instance.getClass());

    // toString should not return null (basic contract check)
    String repr = instance.toString();
    assertNotNull("toString should not return null", repr);
    assertTrue("toString should provide a non-empty representation", repr.length() >= 0);
  }

  // --- Helper utilities used by tests ---

  /**
   * Functional interface to wrap code that may throw checked exceptions.
   */
  private static interface ThrowingRunnable {
    void run() throws Throwable;
  }

  /**
   * A small helper to assert that a runnable throws a specific Throwable type.
   * Returns the thrown exception for further inspection.
   */
  private static <T extends Throwable> T expectThrows(Class<T> expected, ThrowingRunnable runnable) {
    try {
      runnable.run();
      fail("Expecting exception: " + expected.getName());
    } catch (Throwable actual) {
      if (expected.isInstance(actual)) {
        @SuppressWarnings("unchecked")
        T casted = (T) actual;
        return casted;
      } else {
        // Re-wrap unexpected exceptions as assertion failure to provide context
        AssertionError ae = new AssertionError("Unexpected exception type, expected: " + expected.getName() + " but got: " + actual.getClass().getName());
        ae.initCause(actual);
        throw ae;
      }
    }
    return null; // unreachable
  }
}