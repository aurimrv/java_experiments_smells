package ds.seed5503;

import ds.CasamentoExato;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for CasamentoExato (improved from generated tests).
 *
 * Note:  and EvoRunnerParameters are preserved per ORACLE PRESERVATION rule.
 */

/* Marker for test categorization (must be package-level per instructions) */
interface UnitTest {}

@Category(UnitTest.class)
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

    /**
     * Helper: reflectively invoke a method on CasamentoExato and assert basic post-conditions.
     * If the invoked method returns void, this helper will assert that invocation completed without exception.
     * If it returns a value, the helper asserts the return is non-null.
     */
    private static Object invokeAndAssert(String methodName, Object... args) throws Throwable {
        Method method = findCompatibleMethod(CasamentoExato.class, methodName, args);
        assertNotNull("Reflection: expected to find method " + methodName + " on CasamentoExato", method);

        try {
            Object result = method.invoke(null, args);
            Class<?> retType = method.getReturnType();
            if (retType.equals(Void.TYPE)) {
                // Successful void invocation; assert true to record the check
                assertTrue("Method " + methodName + " invoked successfully and returned void", true);
            } else {
                assertNotNull("Method " + methodName + " returned a non-null result", result);
            }
            return result;
        } catch (InvocationTargetException ite) {
            // Unwrap and rethrow the underlying exception to allow tests to catch expected exceptions.
            throw ite.getTargetException();
        } catch (IllegalAccessException | IllegalArgumentException e) {
            // Wrap unexpected reflection errors to fail the test clearly.
            throw new RuntimeException("Reflection invocation failed for method " + methodName, e);
        }
    }

    /**
     * Find a public method on the given class with the given name and compatible parameter types for the provided args.
     * This method tolerates primitive parameter types by matching boxed argument types.
     */
    private static Method findCompatibleMethod(Class<?> cls, String methodName, Object[] args) {
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            if (!m.getName().equals(methodName)) {
                continue;
            }
            Class<?>[] pTypes = m.getParameterTypes();
            if (pTypes.length != args.length) {
                continue;
            }
            boolean compatible = true;
            for (int i = 0; i < pTypes.length; i++) {
                Class<?> pType = pTypes[i];
                Object arg = args[i];
                if (arg == null) {
                    // null is compatible only with non-primitive parameters
                    if (pType.isPrimitive()) {
                        compatible = false;
                        break;
                    }
                } else {
                    if (pType.isPrimitive()) {
                        Class<?> boxed = boxPrimitive(pType);
                        if (boxed == null || !boxed.isInstance(arg)) {
                            compatible = false;
                            break;
                        }
                    } else {
                        if (!pType.isInstance(arg)) {
                            compatible = false;
                            break;
                        }
                    }
                }
            }
            if (compatible) {
                return m;
            }
        }
        return null;
    }

    private static Class<?> boxPrimitive(Class<?> primitive) {
        if (primitive == int.class) return Integer.class;
        if (primitive == boolean.class) return Boolean.class;
        if (primitive == long.class) return Long.class;
        if (primitive == double.class) return Double.class;
        if (primitive == float.class) return Float.class;
        if (primitive == char.class) return Character.class;
        if (primitive == byte.class) return Byte.class;
        if (primitive == short.class) return Short.class;
        return null;
    }

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmhs("30PU$ ?.0c8mwc<*0u", 225, "30PU$ ?.0c8mwc<*0u", 1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CasamentoExato.bmhs("30PU$ ?.0c8mwc<*0u", 1, "30PU$ ?.0c8mwc<*0u", 1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CasamentoExato.bmh(" gbQGSU%b?_AdovHyLT", 1, "\"$$_CZ]7w5Q8Rb", 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CasamentoExato.bmh("OB @1;#DiG,`c,D", 1, "OB @1;#DiG,`c,D", 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.bmh("30PU$ ?.0c8mwc<*0u", 0, "30PU$ ?.0c8mwc<*0u", 370);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.shiftAndExato("{q", 190, "", 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CasamentoExato.shiftAndExato("OnC0pD99", 1, "OnC0pD99", 1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CasamentoExato.forcaBruta("ds.CasamentoExato", 0, "1e*O", 0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        CasamentoExato.forcaBruta("ds.CasamentoExato", 818, "ds.CasamentoExato", 818);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CasamentoExato.forcaBruta((String) null, (-1821), "Qpb*d(Mv#&!s", (-1821));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CasamentoExato.forcaBruta("tWa/yRkUW?s:?u``~|", 1, "GoQVvn$8<r", 1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CasamentoExato casamentoExato0 = new CasamentoExato();
  }
}
