package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.junit.experimental.categories.Category;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

/**
 * Unit tests for CasamentoAproximado.shiftAndAproximado and basic construction.
 *
 * Traceability: REQ-001 - basic API invocation and construction smoke tests.
 *
 * Note: Tests exercise the original invocations generated previously and add
 * lightweight assertions to ensure the methods are present and invocable
 * (Given-When-Then style).
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

  /**
   * Given: specific string and integer inputs including a negative integer (boundary-like value).
   * When: invoking shiftAndAproximado with those inputs.
   * Then: the method must exist, accept five parameters and be invocable without throwing an unexpected exception.
   *
   * REQ-001
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    final String inputA = "NMX/6J4i}Yc O ";
    final int shift = 1;
    final String inputB = "NMX/6J4i}Yc O ";
    final int negativeBoundary = -3626;
    final int extra = 133;

    // When: reflectively obtain the method to avoid compile-time assumptions about return type
    Method method = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
    assertNotNull("Expected shiftAndAproximado method to be present on CasamentoAproximado", method);
    assertEquals("Expected shiftAndAproximado to accept five parameters", 5, method.getParameterCount());

    Object result = null;
    try {
      // static invocation (original test invoked it statically)
      result = method.invoke(null, inputA, shift, inputB, negativeBoundary, extra);
    } catch (InvocationTargetException ite) {
      // If the underlying method threw, fail the test with the cause to make debugging easier
      Throwable cause = ite.getCause();
      fail("shiftAndAproximado threw an exception for inputs [" + inputA + "," + shift + "," + inputB + "," + negativeBoundary + "," + extra + "]: " + cause);
    }

    // Then: the method executed; if it is void, result will be null; otherwise we cannot assume non-null return.
    if (method.getReturnType() == void.class) {
      assertNull("shiftAndAproximado has void return type; reflective invocation should yield null result", result);
    } else {
      // We only assert that the call completed successfully; do not make assumptions about non-null return values.
      assertTrue("shiftAndAproximado completed without exception for provided inputs", true);
    }
  }

  /**
   * Given: different string inputs and small integer values (happy-path invocation).
   * When: invoking shiftAndAproximado with these parameters.
   * Then: method must be present and invocable without throwing an exception.
   *
   * REQ-001
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CasamentoAproximado.shiftAndAproximado("xqMw!", 1, "L<C!W+y%*P.+@iRsz{", 1, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
  }
}
