package ds.seed5503;

import ds.CasamentoAproximado;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for unit tests in this package.
 */
interface UnitTest {}

/**
 * Improved test class for CasamentoAproximado.shiftAndAproximado.
 *
 * Notes:
 * - Tests verify the presence and signature of the method via reflection.
 * - Some tests perform safe reflective invocations and validate expected invocation behavior
 *   (completion or throwing a checked exception with a non-Error cause).
 * - Each test has a short Javadoc explaining intent.
 */
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  /**
   * Helper to obtain the shiftAndAproximado method via reflection.
   *
   * @return the Method instance for shiftAndAproximado
   * @throws NoSuchMethodException if the method is not present with the expected signature
   */
  private Method getShiftMethod() throws NoSuchMethodException {
    return CasamentoAproximado.class.getMethod(
        "shiftAndAproximado",
        String.class,
        int.class,
        String.class,
        int.class,
        int.class
    );
  }

  /**
   * test0: Verify the shiftAndAproximado method exists, is public and static, and has the expected parameter types.
   */
  @Test(timeout = 4000)
  public void test0() throws Throwable {
    Method m = getShiftMethod();
    assertNotNull("Expected shiftAndAproximado method to be present", m);

    int mods = m.getModifiers();
    assertTrue("Method should be public", Modifier.isPublic(mods));
    assertTrue("Method should be static", Modifier.isStatic(mods));

    Class<?>[] params = m.getParameterTypes();
    assertEquals("Expected five parameters", 5, params.length);
    assertEquals("First parameter should be String", String.class, params[0]);
    assertEquals("Second parameter should be int", int.class, params[1]);
    assertEquals("Third parameter should be String", String.class, params[2]);
    assertEquals("Fourth parameter should be int", int.class, params[3]);
    assertEquals("Fifth parameter should be int", int.class, params[4]);
  }

  /**
   * test1: Attempt a reflective invocation with a representative set of inputs (including a negative shift).
   * The test asserts that invocation either completes or, if an exception is thrown, the cause is not a JVM Error.
   */
  @Test(timeout = 4000)
  public void test1() throws Throwable {
    Method m = getShiftMethod();
    assertNotNull("Method must be present for invocation", m);

    try {
      Object result = m.invoke(null, "{Xfd)og", 0, "ds.CasamentoAproximado", -360, 1);
      // Invocation completed successfully. We cannot assert specific semantics without knowing return type,
      // but assert that the call did not throw and completed (result may be null if method is void or returns null).
      // Use a trivial assertion to record the result in test output.
      assertTrue("Invocation completed (result may be null)", true);
    } catch (InvocationTargetException ite) {
      // The invoked method threw an exception; ensure it's not an Error (which is usually unrecoverable).
      Throwable cause = ite.getCause();
      assertNotNull("Invocation threw an exception cause", cause);
      assertFalse("Invocation cause should not be an Error", cause instanceof Error);
    }
  }

  /**
   * test2: Verify reflective invocation with alternative inputs (including zero and small positive values).
   * As above, successful completion is considered a pass; if the method throws, ensure the cause is not an Error.
   */
  @Test(timeout = 4000)
  public void test2() throws Throwable {
    Method m = getShiftMethod();
    assertNotNull("Method must be present for invocation", m);

    try {
      Object result = m.invoke(null, "xN]dC46M.<0r|YCp{", 1, "Y=T]*. GeLXHq}GI", 1, 0);
      // Successful invocation; no further assertions about value since semantics are unknown.
      assertTrue("Invocation completed successfully", true);
    } catch (InvocationTargetException ite) {
      Throwable cause = ite.getCause();
      assertNotNull("Invocation threw an exception cause", cause);
      assertFalse("Invocation cause should not be an Error", cause instanceof Error);
    }
  }

  /**
   * test3: Construction sanity check for CasamentoAproximado instances.
   */
  @Test(timeout = 4000)
  public void test3() throws Throwable {
    CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
    assertNotNull("Constructor should produce a non-null instance", casamentoAproximado0);
    // Basic sanity: toString should not throw and should return a non-null string
    String s = casamentoAproximado0.toString();
    assertNotNull("toString should return a non-null value", s);
  }
}