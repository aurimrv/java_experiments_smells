package ds.seed5838;

import ds.CasamentoExato;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Requirement: REQ-001 - verify pattern matching implementations behave deterministically
 *
 * These tests exercise both nominal and exceptional behaviour for the static
 * matching implementations in CasamentoExato. Each test follows a simple
 * Given-When-Then structure in the comments and asserts observable properties
 * (no exception vs expected exception and idempotence where applicable).
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

    /* Helper: invoke a static method on CasamentoExato via reflection.
     * Returns the raw result of invocation (may be null for void methods).
     * Any reflective exceptions are propagated to the caller.
     */
    private Object invokeStatic(String methodName, Class<?>[] paramTypes, Object... args) throws Exception {
        Method m = CasamentoExato.class.getMethod(methodName, paramTypes);
        m.setAccessible(true);
        return m.invoke(null, args);
    }

    /**
     * Given: invalid large index values for bmhs call
     * When:  bmhs is invoked with those values
     * Then:  a StringIndexOutOfBoundsException is expected to be thrown
     *
     * Requirement: REQ-001-EXC-BOUNDARY
     */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Arrange
        final String s1 = "g-U#E~mB3o:Fjfz";
        final int i1 = 245;
        final String s2 = "g-U#E~mB3o:Fjfz";
        final int i2 = 1;

        // Act & Assert
        try {
            invokeStatic("bmhs", new Class<?>[]{String.class, int.class, String.class, int.class}, s1, i1, s2, i2);
            fail("Expected StringIndexOutOfBoundsException when calling bmhs with out-of-range index");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertNotNull("Exception cause must not be null", cause);
            assertTrue("Expected StringIndexOutOfBoundsException but got: " + cause, cause instanceof StringIndexOutOfBoundsException);
        } catch (NoSuchMethodException nsme) {
            fail("bmhs method signature not found: " + nsme);
        }
    }

    /**
     * Given: two identical short strings and zero offsets
     * When:  bmhs is invoked
     * Then:  invocation should complete and be deterministic (same result when re-invoked)
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Arrange
        final String pattern = "/0bZC^)Rog&;";
        final int pOff = 0;
        final String text = "/0bZC^)Rog&;";
        final int tOff = 0;

        // Act
        Object first = null;
        Object second = null;
        try {
            first = invokeStatic("bmhs", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
            second = invokeStatic("bmhs", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during bmhs invocation: " + ite.getCause());
        }

        // Assert: results stable across repeated calls (idempotence/determinism)
        assertTrue("bmhs should produce consistent results for identical inputs", Objects.equals(first, second));
    }

    /**
     * Given: a typical short pattern and offsets
     * When:  bmh is invoked
     * Then:  invocation should complete without throwing and be deterministic
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Arrange
        final String pattern = ":`G?eOrk6(1|}";
        final int pOff = 1;
        final String text = ":`G?eOrk6(1|}";
        final int tOff = 1;

        // Act
        Object r1 = null;
        Object r2 = null;
        try {
            r1 = invokeStatic("bmh", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
            r2 = invokeStatic("bmh", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during bmh invocation: " + ite.getCause());
        }

        // Assert
        assertTrue("bmh should return consistent results for same inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: a pattern and a text that contains the class name string
     * When:  bmh is invoked
     * Then:  the method should complete and be deterministic
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Arrange
        final String pattern = "nCS,6I^8G(v7dovk";
        final int pOff = 1;
        final String text = "ds.CasamentoExato";
        final int tOff = 1;

        // Act
        Object r1;
        Object r2;
        try {
            r1 = invokeStatic("bmh", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
            r2 = invokeStatic("bmh", new Class<?>[]{String.class, int.class, String.class, int.class}, pattern, pOff, text, tOff);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during bmh invocation: " + ite.getCause());
            return;
        }

        // Assert
        assertTrue("bmh must be deterministic for identical inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: empty strings and large offsets
     * When:  bmh is invoked with offsets outside the string's bounds
     * Then:  StringIndexOutOfBoundsException is expected
     *
     * Requirement: REQ-001-EXC-BOUNDARY
     */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Arrange
        final String empty = "";
        final int off = 1510;

        // Act & Assert
        try {
            invokeStatic("bmh", new Class<?>[]{String.class, int.class, String.class, int.class}, empty, off, empty, off);
            fail("Expected StringIndexOutOfBoundsException when calling bmh with out-of-range offsets");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertNotNull("Cause should be present", cause);
            assertTrue("Expected StringIndexOutOfBoundsException but got: " + cause, cause instanceof StringIndexOutOfBoundsException);
        } catch (NoSuchMethodException nsme) {
            fail("bmh method not found: " + nsme);
        }
    }

    /**
     * Given: two identical strings used for shiftAndExato
     * When:  shiftAndExato is invoked
     * Then:  invocation should complete and be deterministic
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Arrange
        final String p = "EA4iy X,S+h";
        final int po = 1;
        final String t = "EA4iy X,S+h";
        final int to = 1;

        // Act
        Object a;
        Object b;
        try {
            a = invokeStatic("shiftAndExato", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
            b = invokeStatic("shiftAndExato", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during shiftAndExato invocation: " + ite.getCause());
            return;
        }

        // Assert
        assertTrue("shiftAndExato should behave deterministically for same inputs", Objects.equals(a, b));
    }

    /**
     * Given: two different short strings
     * When:  shiftAndExato is invoked
     * Then:  invocation should complete without exception and be stable
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Arrange
        final String p = ";P`>?";
        final int po = 1;
        final String t = "A\"+";
        final int to = 1;

        // Act
        Object r1;
        Object r2;
        try {
            r1 = invokeStatic("shiftAndExato", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
            r2 = invokeStatic("shiftAndExato", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during shiftAndExato: " + ite.getCause());
            return;
        }

        // Assert
        assertTrue("shiftAndExato should return the same result when invoked repeatedly with same inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: a small pattern and an empty text
     * When:  forcaBruta is invoked
     * Then:  invocation should complete successfully and be deterministic
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Arrange
        final String p = "!f";
        final int po = 0;
        final String t = "";
        final int to = 0;

        // Act
        Object o1;
        Object o2;
        try {
            o1 = invokeStatic("forcaBruta", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
            o2 = invokeStatic("forcaBruta", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
        } catch (InvocationTargetException ite) {
            fail("Unexpected exception during forcaBruta invocation: " + ite.getCause());
            return;
        }

        // Assert
        assertTrue("forcaBruta should be deterministic for same inputs", Objects.equals(o1, o2));
    }

    /**
     * Given: inputs that previously triggered an out-of-bounds condition
     * When:  forcaBruta is invoked with those indices
     * Then:  StringIndexOutOfBoundsException is expected
     *
     * Requirement: REQ-001-EXC-BOUNDARY
     */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Arrange
        final String p = "/+/72c^0Kk,EpM";
        final int po = 256;
        final String t = "/+/72c^0Kk,EpM";
        final int to = 256;

        // Act & Assert
        try {
            invokeStatic("forcaBruta", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
            fail("Expected StringIndexOutOfBoundsException when calling forcaBruta with out-of-range offsets");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            assertNotNull("Cause should be present for InvocationTargetException", cause);
            assertTrue("Expected StringIndexOutOfBoundsException but got: " + cause, cause instanceof StringIndexOutOfBoundsException);
        } catch (NoSuchMethodException nsme) {
            fail("forcaBruta method not found: " + nsme);
        }
    }

    /**
     * Given: a pattern and a text containing a class name
     * When:  forcaBruta is invoked with large indices (but within allowed range)
     * Then:  the invocation should complete and produce stable output
     *
     * Requirement: REQ-001-NOMINAL
     */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Arrange
        final String p = "%)5[G/z/";
        final int po = 256;
        final String t = "ds.CasamentoExato";
        final int to = 256;

        // Act
        Object r1;
        Object r2;
        try {
            r1 = invokeStatic("forcaBruta", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
            r2 = invokeStatic("forcaBruta", new Class<?>[]{String.class, int.class, String.class, int.class}, p, po, t, to);
        } catch (InvocationTargetException ite) {
            // If this causes an exception, the test should fail and report the cause.
            fail("Unexpected exception during forcaBruta invocation: " + ite.getCause());
            return;
        }

        // Assert
        assertTrue("forcaBruta should produce repeatable results with same inputs", Objects.equals(r1, r2));
    }

    /**
     * Given: the CasamentoExato class
     * When:  a new instance is constructed
     * Then:  the instance should be non-null and of the correct type
     *
     * Requirement: REQ-001-CONSTR
     */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Act
        CasamentoExato instancia = new CasamentoExato();

        // Assert
        assertNotNull("Constructor should produce a non-null instance", instancia);
        assertEquals("Instance should be of type CasamentoExato", CasamentoExato.class, instancia.getClass());
    }
}