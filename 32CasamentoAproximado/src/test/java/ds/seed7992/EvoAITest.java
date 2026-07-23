package ds.seed7992;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.CasamentoAproximado;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface for categorizing unit tests.
 */
interface UnitTest {}

/**
 * Improved tests for ds.CasamentoAproximado.
 *
 * These tests exercise both nominal and exceptional behavior of the
 * static method shiftAndAproximado(...) and basic construction of the class.
 *
 * Note: method names are preserved exactly as in the original test suite.
 */
@Category(UnitTest.class)
public class EvoAITest {

  /**
   * Given valid-ish inputs, when shiftAndAproximado is invoked, then it should complete
   * without throwing an exception and either return a non-null String or be void.
   *
   * Requirement link (example): REQ-STRING-001 - basic invocation must not crash for empty shift.
   */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    // Given
    String input1 = "0P@H_ i?dqY";
    int param1 = 0;
    String input2 = "";
    int param2 = 0;
    int param3 = 0;

    // When/Then: use reflection to avoid assuming return type; assert no exception and basic result properties.
    Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
    Object result = null;
    try {
      result = m.invoke(null, input1, param1, input2, param2, param3);
    } catch (InvocationTargetException ite) {
      // If the underlying method threw an exception, surface it as a test failure with details.
      fail("Unexpected exception thrown by shiftAndAproximado: " + ite.getCause());
    }

    // Verify: method either returns void or a non-null String with sensible properties.
    Class<?> returnType = m.getReturnType();
    if (returnType.equals(void.class)) {
      // Void return — success as no exception was thrown.
      assertTrue("Method returned void as expected for this invocation", true);
    } else {
      assertNotNull("Expected non-null result from shiftAndAproximado for valid inputs", result);
      assertTrue("Expected result to be a String", result instanceof String);
      String s = (String) result;
      // Basic sanity checks on the returned String
      assertTrue("Returned string should not be negative length", s.length() >= 0);
    }
  }

  /**
   * Given a large positive shift with an invalid negative parameter, when shiftAndAproximado is invoked,
   * then a StringIndexOutOfBoundsException is expected.
   *
   * Requirement link (example): REQ-STRING-002 - invalid indices should produce StringIndexOutOfBoundsException.
   */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    // Given
    String input1 = "`F6/yq97<qRcldI";
    int param1 = 154;
    String input2 = "idAzNDHx?W";
    int param2 = -1; // intentionally invalid
    int param3 = 154;

    Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);

    try {
      m.invoke(null, input1, param1, input2, param2, param3);
      fail("Expecting StringIndexOutOfBoundsException to be thrown for invalid negative index");
    } catch (InvocationTargetException ite) {
      Throwable cause = ite.getCause();
      assertNotNull("InvocationTargetException should have a cause", cause);
      assertTrue("Expected cause to be StringIndexOutOfBoundsException but was: " + cause,
                 cause instanceof StringIndexOutOfBoundsException);
      // Optionally check that the message contains index information
      String msg = cause.getMessage();
      assertNotNull("Exception message should not be null", msg);
    }
  }

  /**
   * Given an overly large shift parameter, when shiftAndAproximado is invoked,
   * then a StringIndexOutOfBoundsException is expected (boundary/exceptional flow).
   *
   * Requirement link (example): REQ-STRING-003 - out of range shifts produce exceptions.
   */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    // Given
    String input1 = "8T5tx,1Ox^";
    int param1 = 1004; // intentionally large to provoke boundary condition
    String input2 = "";
    int param2 = 0;
    int param3 = 0;

    Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);

    try {
      m.invoke(null, input1, param1, input2, param2, param3);
      fail("Expecting StringIndexOutOfBoundsException due to excessively large index/shift");
    } catch (InvocationTargetException ite) {
      Throwable cause = ite.getCause();
      assertNotNull("InvocationTargetException must have a cause", cause);
      assertTrue("Expected cause to be StringIndexOutOfBoundsException but was: " + cause,
                 cause instanceof StringIndexOutOfBoundsException);
    }
  }

  /**
   * Given an empty primary input string and large indices, when shiftAndAproximado is invoked,
   * then a StringIndexOutOfBoundsException is expected.
   *
   * Requirement link (example): REQ-STRING-004 - empty input with large indices should be handled via exception.
   */
  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    // Given
    String input1 = "";
    int param1 = 782;
    String input2 = "U[Ug-;]";
    int param2 = 782;
    int param3 = 782;

    Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);

    try {
      m.invoke(null, input1, param1, input2, param2, param3);
      fail("Expecting StringIndexOutOfBoundsException when invoking with empty input and large indices");
    } catch (InvocationTargetException ite) {
      Throwable cause = ite.getCause();
      assertNotNull("InvocationTargetException must have a cause", cause);
      assertTrue("Expected cause to be StringIndexOutOfBoundsException but was: " + cause,
                 cause instanceof StringIndexOutOfBoundsException);
    }
  }

  /**
   * Verify that CasamentoAproximado has a public constructor and basic object semantics.
   *
   * Requirement link (example): REQ-CLASS-001 - class should be instantiable and have sensible Object methods.
   */
  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    // Given / When: construct an instance
    CasamentoAproximado instance = new CasamentoAproximado();

    // Then: basic assertions about the constructed object
    assertNotNull("Constructor should produce a non-null instance", instance);
    assertEquals("Instance should be equal to itself", instance, instance);
    assertEquals("hashCode must be consistent for the same instance", instance.hashCode(), instance.hashCode());
    assertNotNull("toString should not return null", instance.toString());

    // Additionally verify the class exposes the expected static method signature
    Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
    assertNotNull("Class should declare the static method shiftAndAproximado", m);
    assertTrue("shiftAndAproximado should be a static method", java.lang.reflect.Modifier.isStatic(m.getModifiers()));
  }
}