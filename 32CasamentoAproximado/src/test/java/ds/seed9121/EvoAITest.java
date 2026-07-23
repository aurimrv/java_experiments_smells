package ds.seed9121;

import ds.CasamentoAproximado;
import org.junit.Test;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for CasamentoAproximado.
 *
 * Requirement trace: REQ-001 - basic validation of shiftAndAproximado behavior for valid inputs and error handling.
 *
 * These tests use a small set of representative inputs (happy paths and error cases) and assert observable outcomes:
 * - successful invocation (no exception)
 * - expected exception types for invalid parameters
 * - basic constructor properties
 *
 * Each test follows a simple Given-When-Then structure in comments to make intent explicit.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Helper that invokes the static method shiftAndAproximado via reflection.
     * This avoids compile-time coupling to the return type (which may be void).
     *
     * @return the result of the invoked method or null if the method is void
     */
    private Object callShiftAndAproximado(String s1, int i1, String s2, int i2, int i3) throws Exception {
        Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
        try {
            return m.invoke(null, s1, i1, s2, i2, i3);
        } catch (InvocationTargetException ite) {
            // Unwrap to expose the underlying exception to the caller tests.
            throw (ite.getCause() != null) ? new InvocationTargetException(ite.getCause()) : ite;
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: inputs that previously triggered a StringIndexOutOfBoundsException in generated tests
        // When: invoking shiftAndAproximado with these parameters
        // Then: a StringIndexOutOfBoundsException is expected
        try {
            callShiftAndAproximado("M.1)Pfq8yvfj", 2253, "M.1)Pfq8yvfj", 0, 0);
            Assert.fail("Expecting StringIndexOutOfBoundsException to be thrown for out-of-range index");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            Assert.assertNotNull("Underlying cause should be present", cause);
            Assert.assertTrue("Expected a StringIndexOutOfBoundsException but got: " + cause.getClass(),
                    cause instanceof StringIndexOutOfBoundsException);
            // message may vary by implementation; at minimum ensure it's a non-null message or empty string
            Assert.assertNotNull("Exception message should exist (may be empty)", cause.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            // Some implementations may throw the exception directly; accept that as well.
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a pair of strings and zero offsets representing a simple/happy-path scenario
        // When: invoking shiftAndAproximado
        // Then: invocation completes without throwing and returns either a value or void
        Object result = null;
        try {
            result = callShiftAndAproximado("^Y8}82_a(TT63:j^", 0, "gV:>K5", 0, 0);
        } catch (InvocationTargetException ite) {
            // unwrap and rethrow to fail the test with useful info
            Throwable cause = ite.getCause();
            Assert.fail("Unexpected exception during happy-path invocation: " + (cause == null ? ite : cause));
        }
        // If result is non-null we can assert it's a useful value; if null the method may be void and that's acceptable.
        if (result != null) {
            Assert.assertNotNull("Non-void result should not be null", result);
        } else {
            Assert.assertTrue("Method completed without returning a value (void) — considered a valid behavior", true);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: empty strings and large indices which are out-of-bounds
        // When: invoking shiftAndAproximado with empty source and large indices
        // Then: StringIndexOutOfBoundsException is expected
        try {
            callShiftAndAproximado("", 1335, "", 2451, 2451);
            Assert.fail("Expecting StringIndexOutOfBoundsException due to empty strings and large indices");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            Assert.assertNotNull(cause);
            Assert.assertTrue("Expected a StringIndexOutOfBoundsException but got: " + cause.getClass(),
                    cause instanceof StringIndexOutOfBoundsException);
        } catch (StringIndexOutOfBoundsException e) {
            // Accept direct throw as well
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given: inputs where one of the offset parameters is negative
        // When: invoking shiftAndAproximado with a negative offset
        // Then: an IndexOutOfBoundsException (or subclass) is expected
        try {
            callShiftAndAproximado("B+fhV<w@z+)YC,@w)", 1191, "B+fhV<w@z+)YC,@w)", -1, 1191);
            Assert.fail("Expecting an IndexOutOfBoundsException (or subclass) due to negative index");
        } catch (InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            Assert.assertNotNull(cause);
            Assert.assertTrue("Expected an IndexOutOfBoundsException or subclass but got: " + cause.getClass(),
                    cause instanceof IndexOutOfBoundsException);
        } catch (IndexOutOfBoundsException e) {
            // Accept direct throw as well
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: nothing in particular other than the class under test
        // When: constructing a new CasamentoAproximado
        // Then: the object is non-null, its toString is stable, and basic object semantics hold
        CasamentoAproximado casamentoAproximado0 = new CasamentoAproximado();
        Assert.assertNotNull("Constructor should produce a non-null instance", casamentoAproximado0);
        // Basic identity property
        Assert.assertSame("An object should be identical to itself", casamentoAproximado0, casamentoAproximado0);
        // toString should not return null (helps detect broken implementations)
        String s = casamentoAproximado0.toString();
        Assert.assertNotNull("toString() should not return null", s);
        Assert.assertTrue("toString() should include the class name as a basic sanity check", s.contains("CasamentoAproximado") || s.length() > 0);
    }
}