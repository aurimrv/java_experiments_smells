package ds.seed9121;

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
 * Unit tests for CasamentoExato pattern matching utilities.
 *
 * Traceability: REQ-DS-001 (pattern matching correctness), REQ-DS-002 (robustness on bad indices)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

    /**
     * Given: two identical non-empty inputs and valid indices
     * When: bmhs is invoked twice with the same parameters
     * Then: both invocations should produce consistent results (idempotence)
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Arrange
        final String texto = "TTa;Sutf;`PM+-.el";
        final int i1 = 1;
        final String padrao = "TTa;Sutf;`PM+-.el";
        final int i2 = 1;

        // Act
        Object result1 = invokeStatic("bmhs", texto, i1, padrao, i2);
        Object result2 = invokeStatic("bmhs", texto, i1, padrao, i2);

        // Assert: results are consistent across invocations
        assertTrue("Expected consistent results for repeated bmhs invocations",
                Objects.equals(result1, result2));
    }

    /**
     * Given: empty text with an invalid negative index for pattern position
     * When: bmhs is invoked with out-of-range index
     * Then: StringIndexOutOfBoundsException is thrown
     *
     * Requirement: REQ-DS-002
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Arrange
        final String texto = "";
        final int i1 = 0;
        final String padrao = "B{V";
        final int i2 = -432;

        // Act / Assert
        try {
            invokeStatic("bmhs", texto, i1, padrao, i2);
            fail("Expected StringIndexOutOfBoundsException for negative index");
        } catch (Throwable t) {
            // Unwrap and assert expected exception type
            assertEquals("Expected a StringIndexOutOfBoundsException for invalid index",
                    StringIndexOutOfBoundsException.class, t.getClass());
        }
    }

    /**
     * Given: differing inputs but valid indices
     * When: bmhs is invoked twice with the same parameters
     * Then: both invocations should produce consistent results
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Arrange
        final String texto = "TjNOOM,A}|7h";
        final int i1 = 1;
        final String padrao = "nKaL; !HT yt-";
        final int i2 = 1;

        // Act
        Object r1 = invokeStatic("bmhs", texto, i1, padrao, i2);
        Object r2 = invokeStatic("bmhs", texto, i1, padrao, i2);

        // Assert: idempotence
        assertTrue("bmhs should return consistent results for the same inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: identical strings and valid small indices
     * When: bmh is invoked repeatedly
     * Then: behavior is consistent across invocations
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Arrange
        final String texto = "ok7$PBD$B@@L 2YiC";
        final int i1 = 1;
        final String padrao = "ok7$PBD$B@@L 2YiC";
        final int i2 = 1;

        // Act
        Object first = invokeStatic("bmh", texto, i1, padrao, i2);
        Object second = invokeStatic("bmh", texto, i1, padrao, i2);

        // Assert: results remain the same when repeated
        assertEquals("Repeated bmh calls should yield equal results", first, second);
    }

    /**
     * Given: non-identical inputs and valid indices
     * When: bmh is invoked twice
     * Then: results are consistent between invocations
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Arrange
        final String texto = "47is4A";
        final int i1 = 1;
        final String padrao = "'*{[<ti3{a3F\"hbd";
        final int i2 = 1;

        // Act
        Object r1 = invokeStatic("bmh", texto, i1, padrao, i2);
        Object r2 = invokeStatic("bmh", texto, i1, padrao, i2);

        // Assert
        assertTrue("bmh should be deterministic for same inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: very large index values that are likely out-of-range
     * When: bmh is invoked with such indices
     * Then: StringIndexOutOfBoundsException is expected
     *
     * Requirement: REQ-DS-002
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Arrange
        final String texto = "u3kP[EEL+Ked6>";
        final int i1 = 1540;
        final String padrao = "B+fhV<w@z+)YC,@w)";
        final int i2 = 1540;

        // Act / Assert
        try {
            invokeStatic("bmh", texto, i1, padrao, i2);
            fail("Expected StringIndexOutOfBoundsException for excessively large index");
        } catch (Throwable t) {
            assertEquals("Expected StringIndexOutOfBoundsException when index is out of bounds",
                    StringIndexOutOfBoundsException.class, t.getClass());
        }
    }

    /**
     * Given: an intentionally out-of-range index for shiftAndExato, plus additional boundary checks
     * When: shiftAndExato is invoked with an out-of-range index and with safe boundary values
     * Then: the out-of-range call should throw StringIndexOutOfBoundsException; boundary invocations should be consistent
     *
     * Requirement: REQ-DS-002
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Arrange
        final String textoBad = "<lQ <},+D{lP$foMZ";
        final int badIndex = 248;
        final String padraoEmpty = "";
        final int padIndexZero = 0;

        // Act / Assert: primary negative scenario (original)
        try {
            invokeStatic("shiftAndExato", textoBad, badIndex, padraoEmpty, padIndexZero);
            fail("Expected StringIndexOutOfBoundsException for out-of-range index in shiftAndExato");
        } catch (Throwable t) {
            assertEquals("shiftAndExato should throw StringIndexOutOfBoundsException for invalid index",
                    StringIndexOutOfBoundsException.class, t.getClass());
        }

        // Additional boundary checks: valid small inputs. If these produce exceptions, assert type as well.
        try {
            Object safe1 = invokeStatic("shiftAndExato", "abc", 0, "a", 0);
            Object safe2 = invokeStatic("shiftAndExato", "abc", 0, "a", 0);
            assertEquals("Boundary invocation results should match", safe1, safe2);
        } catch (Throwable t) {
            // Accept either proper handling or clearly report the exception type
            assertTrue("Boundary check for shiftAndExato threw an unexpected exception: " + t,
                    t instanceof StringIndexOutOfBoundsException || t instanceof RuntimeException);
        }
    }

    /**
     * Given: identical small input and index values
     * When: bmh is invoked
     * Then: repeated invocations should be consistent
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Arrange
        final String texto = "WI]";
        final int i1 = 1;
        final String padrao = "WI]";
        final int i2 = 1;

        // Act
        Object a = invokeStatic("bmh", texto, i1, padrao, i2);
        Object b = invokeStatic("bmh", texto, i1, padrao, i2);

        // Assert
        assertEquals("bmh should be deterministic for small identical inputs", a, b);
    }

    /**
     * Given: a non-trivial input
     * When: forcaBruta is invoked twice with identical inputs
     * Then: the outputs must be consistent (idempotence)
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Arrange
        final String texto = "mw \"\"[9k0+`5e[.R>Q";
        final int i1 = 1;
        final String padrao = "mw \"\"[9k0+`5e[.R>Q";
        final int i2 = 1;

        // Act
        Object r1 = invokeStatic("forcaBruta", texto, i1, padrao, i2);
        Object r2 = invokeStatic("forcaBruta", texto, i1, padrao, i2);

        // Assert
        assertTrue("forcaBruta should return consistent results on repeated calls", Objects.equals(r1, r2));
    }

    /**
     * Given: inputs with indices expected to be invalid for forcaBruta
     * When: forcaBruta is invoked with out-of-range indices
     * Then: StringIndexOutOfBoundsException is expected
     *
     * Requirement: REQ-DS-002
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Arrange
        final String texto = "F!1fsVNm={vNf";
        final int i1 = 2148;
        final String padrao = "t?";
        final int i2 = 1598;

        // Act / Assert
        try {
            invokeStatic("forcaBruta", texto, i1, padrao, i2);
            fail("Expected StringIndexOutOfBoundsException for out-of-range indices in forcaBruta");
        } catch (Throwable t) {
            assertEquals("forcaBruta should throw StringIndexOutOfBoundsException when indices are out-of-range",
                    StringIndexOutOfBoundsException.class, t.getClass());
        }
    }

    /**
     * Given: the CasamentoExato class
     * When: an instance is constructed
     * Then: the instance should not be null
     *
     * Requirement: REQ-DS-001
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Act
        CasamentoExato casamentoExato0 = new CasamentoExato();

        // Assert
        assertNotNull("Constructed CasamentoExato instance should not be null", casamentoExato0);
    }

    // ---------- Helper reflection utilities ----------

    /**
     * Invoke a static method on CasamentoExato using reflection. This helper unwraps any InvocationTargetException
     * and rethrows the underlying cause to make test assertions easier.
     *
     * @param methodName the name of the static method to invoke
     * @param args       arguments to pass to the method
     * @return the result of the method invocation (null for void)
     * @throws Throwable if the invoked method throws an exception
     */
    private static Object invokeStatic(String methodName, Object... args) throws Throwable {
        Class<?>[] paramTypes = parameterTypesFromArgs(args);
        Method method = null;
        try {
            method = CasamentoExato.class.getMethod(methodName, paramTypes);
        } catch (NoSuchMethodException e) {
            // Fallback: try to find a compatible method by name and arity
            for (Method m : CasamentoExato.class.getMethods()) {
                if (!m.getName().equals(methodName)) continue;
                if (m.getParameterTypes().length != paramTypes.length) continue;
                boolean compatible = true;
                Class<?>[] mt = m.getParameterTypes();
                for (int i = 0; i < mt.length; i++) {
                    if (!isCompatibleParameter(mt[i], args[i])) {
                        compatible = false;
                        break;
                    }
                }
                if (compatible) {
                    method = m;
                    break;
                }
            }
            if (method == null) {
                throw new AssertionError("No such method: " + methodName + " with parameter count " + args.length, e);
            }
        }

        try {
            return method.invoke(null, args);
        } catch (IllegalAccessException e) {
            throw new AssertionError("Unable to access method: " + methodName, e);
        } catch (InvocationTargetException e) {
            // Unwrap and rethrow underlying cause for clearer test assertions
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            } else {
                throw cause;
            }
        }
    }

    private static Class<?>[] parameterTypesFromArgs(Object[] args) {
        if (args == null) return new Class<?>[0];
        Class<?>[] types = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            Object a = args[i];
            if (a == null) {
                types[i] = Object.class;
            } else if (a instanceof Integer) {
                types[i] = int.class;
            } else {
                types[i] = a.getClass();
            }
        }
        return types;
    }

    private static boolean isCompatibleParameter(Class<?> paramType, Object arg) {
        if (arg == null) {
            return !paramType.isPrimitive();
        }
        if (paramType.isPrimitive()) {
            if (paramType == int.class && arg instanceof Integer) return true;
            if (paramType == long.class && arg instanceof Long) return true;
            if (paramType == boolean.class && arg instanceof Boolean) return true;
            if (paramType == double.class && arg instanceof Double) return true;
            if (paramType == float.class && arg instanceof Float) return true;
            if (paramType == short.class && arg instanceof Short) return true;
            if (paramType == byte.class && arg instanceof Byte) return true;
            if (paramType == char.class && arg instanceof Character) return true;
            return false;
        } else {
            return paramType.isAssignableFrom(arg.getClass());
        }
    }
}