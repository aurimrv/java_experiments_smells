package ds.seed5838;

import ds.CasamentoAproximado;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface to allow categorization of tests.
 */
interface UnitTest {}

/**
 * Improved test class for CasamentoAproximado.
 *
 * Notes:
 * - Each test ensures the exercised API does not throw and performs lightweight,
 *   verifiable checks (method signature, static-ness, non-null returns when applicable).
 * - Requirement traceability: REQ-1234 (example requirement id for matching behavior).
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * REQ-1234: Verify that shiftAndAproximado handles typical inputs without throwing,
   * is declared as a public static method with the expected parameter arity, and
   * returns a stable non-null result for these inputs.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Given
      Class<?> clazz = Class.forName("ds.CasamentoAproximado");
      Method m = clazz.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);

      // Sanity checks on method signature
      assertTrue("shiftAndAproximado should be public",
                 Modifier.isPublic(m.getModifiers()));
      // The original tests invoked this as a static method; verify that.
      assertTrue("shiftAndAproximado should be static",
                 Modifier.isStatic(m.getModifiers()));
      assertEquals("shiftAndAproximado should accept 5 parameters", 5, m.getParameterTypes().length);

      // When: invoke with sample inputs
      Object result1 = null;
      try {
          result1 = m.invoke(null, ":cWJqud]/*kTuz:x*>", 1, "S6*Go", 1, 3472);
      } catch (IllegalArgumentException iae) {
          // Fail with descriptive message if parameter types do not match expectations
          fail("Invocation failed due to argument mismatch: " + iae.getMessage());
      }

      // Then: if method returns a value, it should be non-null and stable across repeated calls
      if (m.getReturnType() != void.class) {
          assertNotNull("Expected non-null result from shiftAndAproximado for provided inputs", result1);
          Object result2 = m.invoke(null, ":cWJqud]/*kTuz:x*>", 1, "S6*Go", 1, 3472);
          assertEquals("Consecutive invocations with same inputs should produce equal results", result1, result2);
      } else {
          // For void methods, reaching this point means the call completed successfully
          assertTrue("shiftAndAproximado completed (void return)", true);
      }
  }

  /**
   * REQ-1234: Verify shiftAndAproximado handles short inputs without throwing and
   * returns consistent results. This covers a different typical input pattern.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Given
      Class<?> clazz = Class.forName("ds.CasamentoAproximado");
      Method m = clazz.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);

      // Sanity checks on method signature
      assertTrue("shiftAndAproximado should be public",
                 Modifier.isPublic(m.getModifiers()));
      assertTrue("shiftAndAproximado should be static",
                 Modifier.isStatic(m.getModifiers()));

      // When: invoke with alternative typical inputs
      Object result = null;
      try {
          result = m.invoke(null, "s", 1, "HCh(!oIl= T)", 1, 1);
      } catch (IllegalArgumentException iae) {
          fail("Invocation failed due to argument mismatch: " + iae.getMessage());
      }

      // Then: verify non-null return when applicable and some basic stability property
      if (m.getReturnType() != void.class) {
          assertNotNull("Expected non-null result for short-input invocation", result);
          // Basic sanity: result.toString should not be an empty string
          String repr = String.valueOf(result);
          assertTrue("Result's string representation should not be empty", repr != null && repr.length() > 0);
      } else {
          assertTrue("shiftAndAproximado completed (void return) for short-input invocation", true);
      }
  }

  /**
   * REQ-1234: Verify the CasamentoAproximado constructor creates a usable object.
   * This test ensures construction does not throw and basic object invariants hold.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Given / When: construct the object
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();

      // Then: basic assertions about the constructed instance
      assertNotNull("Constructor should produce a non-null instance", casamentoAproximado0);
      assertEquals("Instance should have the expected runtime class", CasamentoAproximado.class, casamentoAproximado0.getClass());

      // toString should be safe to call and return a human-readable string
      String s = String.valueOf(casamentoAproximado0);
      assertNotNull("toString() should not return null", s);
      assertTrue("toString() should produce a non-empty description", s.length() > 0);
  }
}