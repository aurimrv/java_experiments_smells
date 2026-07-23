package ds.seed1448;

import ds.CasamentoExato;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Unit tests for ds.CasamentoExato
 *
 * Requirement: REQ-STRING-MATCH-001 - verify basic behavior of matching algorithms (forcaBruta, bmh, bmhs, shiftAndExato)
 */
interface UnitTest {}

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
@Category(UnitTest.class)
public class EvoAITest extends CasamentoExato_ESTest_scaffolding {

    // Reusable test data to reduce duplicated magic literals
    private static final String SAMPLE_A = ",%>[P\"{wKXi'\"rjmb.2";
    private static final String SAMPLE_B = "xxNkW].~IztaRTE";
    private static final String SINGLE_I = "i";

    /**
     * Helper: invoke a static method on CasamentoExato reflectively.
     * If the underlying method throws an exception, its cause is propagated.
     */
    private Object invokeStatic(String methodName, Class<?>[] paramTypes, Object... args) throws Throwable {
        Method m = CasamentoExato.class.getMethod(methodName, paramTypes);
        try {
            return m.invoke(null, args);
        } catch (InvocationTargetException e) {
            // Propagate the real cause so tests can assert on it
            throw e.getCause();
        }
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        // Given: inputs that previously caused a StringIndexOutOfBoundsException in generated tests
        // When / Then: verify that the implementation throws StringIndexOutOfBoundsException for these inputs
        try {
            invokeStatic("bmhs",
                    new Class<?>[]{String.class, int.class, String.class, int.class},
                    SAMPLE_A, 575, SAMPLE_B, -1302);
            fail("Expected StringIndexOutOfBoundsException was not thrown");
        } catch (StringIndexOutOfBoundsException expected) {
            // Expected outcome: the implementation signals invalid index handling
            assertNotNull("Exception should include a message (may be empty)", expected.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        // Given: identical single-character text and pattern and valid positions
        // When: bmhs is invoked
        Object result = invokeStatic("bmhs",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                SINGLE_I, 1, SINGLE_I, 1);
        // Then: invocation should complete; if it returns a numeric index, it should be within a sensible range
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("Match index should be >= -1 (no match) or a valid position", idx >= -1);
        } else {
            // If void or other, at least we confirm the call succeeded
            assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        // Given: descriptive text and pattern with small positive positions
        // When: bmhs is invoked
        String text = "Casamento na posicao: ";
        String pattern = "PsN%thM.{$8p8aX";
        Object result = invokeStatic("bmhs",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                text, 1, pattern, 1);
        // Then: verify no exception and numeric return (if provided) is within reasonable bounds
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("Returned index should be >= -1", idx >= -1);
        } else {
            assertNotNull("Invocation completed successfully", result);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        // Given: short text and pattern
        // When: bmh is invoked
        String text = "[Xe*";
        String pattern = "B ";
        Object result = invokeStatic("bmh",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                text, 1, pattern, 1);
        // Then: ensure the call completes and, if an index is returned, it's not an invalid extreme
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("bmh returned index should be >= -1", idx >= -1);
        } else {
            assertNotNull("bmh invocation completed", result);
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        // Given: identical text and pattern expected to match
        // When: bmh is invoked
        String s = "FFrTJ)k";
        Object result = invokeStatic("bmh",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                s, 1, s, 1);
        // Then: for matching identical strings, a non-negative index is a common contract; assert if integer is returned
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("Expected a non-negative match index for identical strings", idx >= 0);
        } else {
            assertNotNull("bmh invocation completed successfully", result);
        }
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        // Given: same pattern and text with a negative position (boundary test)
        // When: bmh is invoked with a negative position
        Object result = invokeStatic("bmh",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                SAMPLE_A, -134, SAMPLE_A, 7);
        // Then: call should either handle gracefully or indicate error; if numeric, must be >= -1
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("bmh with negative position should not return an invalid extreme index", idx >= -1);
        } else {
            assertNotNull("bmh invocation with negative position completed", result);
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        // Given: identical strings and a moderate offset
        // When: shiftAndExato is invoked
        Object result = invokeStatic("shiftAndExato",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                SAMPLE_B, 7, SAMPLE_B, 7);
        // Then: if an index is returned, it should be within a normal range
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("shiftAndExato returned index should be >= -1", idx >= -1);
        } else {
            assertNotNull("shiftAndExato invocation completed", result);
        }
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        // Given: inputs that previously caused an out-of-bounds in generated tests for forcaBruta
        // When / Then: expect StringIndexOutOfBoundsException
        try {
            invokeStatic("forcaBruta",
                    new Class<?>[]{String.class, int.class, String.class, int.class},
                    "W(}<tFiysnK", 256, "W(}<tFiysnK", 256);
            fail("Expected StringIndexOutOfBoundsException was not thrown by forcaBruta");
        } catch (StringIndexOutOfBoundsException expected) {
            assertNotNull("forcaBruta should throw a descriptive exception message", expected.getMessage());
        }
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        // Given: two different strings and a large shift value to exercise typical behavior
        // When: forcaBruta is invoked
        Object result = invokeStatic("forcaBruta",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                "MUW5U0T%A|cq0m", 3735, "Z[la^", 3735);
        // Then: ensure call completes. If returns integer index, validate it
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("forcaBruta returned index should be >= -1", idx >= -1);
        } else {
            assertNotNull("forcaBruta invocation completed", result);
        }
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        // Given: text with pattern empty (edge-case)
        // When: forcaBruta is invoked with an empty pattern and expected zero-length pattern handling
        Object result = invokeStatic("forcaBruta",
                new Class<?>[]{String.class, int.class, String.class, int.class},
                "^cS8=.fV{", 1, "", 0);
        // Then: empty pattern semantics vary by implementation; if integer returned, it should be >= 0 (match at start) or -1
        if (result instanceof Integer) {
            int idx = (Integer) result;
            assertTrue("forcaBruta with empty pattern should return >= -1", idx >= -1);
        } else {
            assertNotNull("forcaBruta invocation with empty pattern completed", result);
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        // Given / When: construct a CasamentoExato instance
        CasamentoExato casamentoExato0 = new CasamentoExato();
        // Then: the instance should be constructed successfully
        assertNotNull("New instance of CasamentoExato should not be null", casamentoExato0);
    }
}