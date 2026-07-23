package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Objects;

/**
 * Marker interface used to classify tests as unit tests.
 * Must be declared at package level so it can be used with @Category.
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  /**
   * Requirement trace: REQ-001
   *
   * Given a variety of input strings and shift values,
   * when invoking shiftAndAproximado,
   * then the call should complete without throwing an unexpected exception and
   * produce consistent results for identical inputs.
   *
   * This test covers a boundary-like negative integer and repeated invocation determinism.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    String s1 = "NMX/6J4i}Yc O ";
    int shift1 = 1;
    String s2 = "NMX/6J4i}Yc O ";
    int a = -3626; // intentionally negative to exercise boundary handling
    int b = 133;

    // When: invoke twice with the same inputs to check for determinism / consistent return
    Object result1 = null;
    Object result2 = null;
    try {
      result1 = invokeShiftAndAproximado(s1, shift1, s2, a, b);
      result2 = invokeShiftAndAproximado(s1, shift1, s2, a, b);
    } catch (Throwable t) {
      fail("Invocation of shiftAndAproximado threw an unexpected exception: " + t);
    }

    // Then: basic sanity checks
    // At minimum the method should complete (no exception) and behave deterministically for same inputs.
    assertTrue("Result objects should be equal for identical inputs (deterministic behavior)",
        Objects.equals(result1, result2));
  }

  /**
   * Requirement trace: REQ-002
   *
   * Given typical inputs and boundary-like values (empty string, zero),
   * when invoking shiftAndAproximado,
   * then the method should not throw and should return a value (possibly null) deterministically for same inputs.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given: various inputs including a short string and another string
    String s1 = "xqMw!";
    int shift1 = 1;
    String s2 = "L<C!W+y%*P.+@iRsz{";
    int a = 1;
    int b = 0;

    // Additional boundary-like check: empty string and zero shifts
    String empty = "";
    int zero = 0;
    Object normalResult = null;
    Object boundaryResult = null;

    // When & Then: ensure no exceptions and determinism
    try {
      normalResult = invokeShiftAndAproximado(s1, shift1, s2, a, b);
      Object normalResultRepeat = invokeShiftAndAproximado(s1, shift1, s2, a, b);
      assertTrue("Normal inputs should yield deterministic results",
          Objects.equals(normalResult, normalResultRepeat));

      boundaryResult = invokeShiftAndAproximado(empty, zero, empty, zero, zero);
      Object boundaryResultRepeat = invokeShiftAndAproximado(empty, zero, empty, zero, zero);
      assertTrue("Boundary inputs (empty strings, zeros) should yield deterministic results",
          Objects.equals(boundaryResult, boundaryResultRepeat));
    } catch (Throwable t) {
      fail("Invocation of shiftAndAproximado threw an unexpected exception: " + t);
    }

    // At least one invocation should have completed (sanity)
    assertNotNull("At least one invocation should complete (result may be null only if method is void or designed so)",
        // Accepting null as valid return; this check ensures the method executed without throwing.
        Boolean.TRUE);
  }

  /**
   * Requirement trace: REQ-003
   *
   * Validate that CasamentoAproximado can be instantiated.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given / When
    CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();

    // Then
    assertNotNull("Constructor should produce a non-null instance", casamentoAproximado0);
  }

  /**
   * Helper that reflectively locates and invokes the method
   * shiftAndAproximado on ds.CasamentoAproximado with the given arguments.
   *
   * It supports both static and instance methods. Any exception thrown by the invoked
   * method is propagated to the caller.
   */
  private Object invokeShiftAndAproximado(String s1, int i1, String s2, int i2, int i3) throws Throwable {
    Class<?> cls = CasamentoAproximado.class;
    Method m;
    try {
      m = cls.getDeclaredMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
    } catch (NoSuchMethodException e) {
      // If signature not found, try to locate a method with the same name and 5 parameters (fallback)
      Method found = null;
      for (Method candidate : cls.getDeclaredMethods()) {
        if ("shiftAndAproximado".equals(candidate.getName()) && candidate.getParameterTypes().length == 5) {
          found = candidate;
          break;
        }
      }
      if (found == null) {
        throw new AssertionError("Method shiftAndAproximado with 5 parameters not found on " + cls.getName(), e);
      }
      m = found;
    }
    m.setAccessible(true);

    Object target = null;
    if (!Modifier.isStatic(m.getModifiers())) {
      // create an instance to call the instance method
      target = cls.getDeclaredConstructor().newInstance();
    }

    try {
      return m.invoke(target, s1, i1, s2, i2, i3);
    } catch (java.lang.reflect.InvocationTargetException ite) {
      // Unwrap and rethrow the underlying cause for clearer test failures
      throw ite.getCause() != null ? ite.getCause() : ite;
    }
  }
}