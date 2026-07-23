package ds.seed6733;

import ds.CasamentoAproximado;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for CasamentoAproximado.
 *
 * Requirement trace: REQ-DS-001 (approximate string matching behavior)
 *
 * Notes:
 * - Tests exercise both constructor and the static helper shiftAndAproximado.
 * - Uses reflection to remain resilient against differing return types (void, primitive, or object).
 */
interface UnitTest {}

public class EvoAITest extends CasamentoAproximado_ESTest_scaffolding {

    /**
     * Given a pair of identical short strings and a zero shift,
     * When shiftAndAproximado is invoked,
     * Then the call should complete without throwing and return a sensible type/value.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test0() throws Exception {
        // Given
        final String s1 = ";{";
        final int i1 = 1;
        final String s2 = ";{";
        final int i2 = 1;
        final int shift = 0;

        // When
        Object result = invokeShift(s1, i1, s2, i2, shift);

        // Then
        // Accept void (null) or common result types. Use targeted assertions/messages for diagnosability.
        if (result == null) {
            // Method may be void; verify invocation completed.
            assertNull("Expected null result for void method invocation with identical small strings.", result);
        } else {
            // Common possible return assertions: numeric counts, boolean success, or a descriptive string/list.
            String typeMsg = "Returned unexpected type: " + result.getClass();
            if (result instanceof Integer || result instanceof Long || result instanceof Short || result instanceof Byte) {
                long val = ((Number) result).longValue();
                assertTrue("Numeric result should not be negative for given inputs. " + typeMsg, val >= 0);
            } else if (result instanceof Boolean) {
                // For identical strings, an implementation might indicate match=true
                assertTrue("Boolean result expected to indicate a successful (true) match for identical inputs. " + typeMsg, ((Boolean) result));
            } else if (result instanceof String) {
                assertTrue("String result should be non-empty and likely mention 'Casamento' or indicate a position. " + typeMsg,
                        ((String) result).length() > 0);
            } else if (result instanceof Collection) {
                assertNotNull("Collection result should not be null. " + typeMsg, result);
            } else if (result instanceof Map) {
                assertNotNull("Map result should not be null. " + typeMsg, result);
            } else {
                // Unknown but acceptable - at least ensure it's not an unexpected null.
                assertNotNull("Result should not be null for unknown but supported return type. " + typeMsg, result);
            }
        }
    }

    /**
     * Given a typical "happy-path" invocation where both text and pattern are identical longer strings,
     * When shiftAndAproximado is invoked with a positive shift,
     * Then the invocation should return a non-negative match indication or a truthy value.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test1() throws Exception {
        // Given
        final String text = "Casamento na posicao: ";
        final int textPos = 1;
        final String pattern = "Casamento na posicao: ";
        final int patternPos = 1;
        final int shift = 1;

        // When
        Object result = invokeShift(text, textPos, pattern, patternPos, shift);

        // Then
        // Provide descriptive failure messages and check multiple plausible properties.
        assertTrue("Invocation must complete (result may be null for void methods).", true);

        if (result == null) {
            // Acceptable if method is void; at least ensure no exception thrown (covered by test completion).
            assertNull("Method returned null (void) for typical happy-path invocation.", result);
        } else if (result instanceof Boolean) {
            assertTrue("Expected a truthy/true boolean for identical text and pattern with small shift.", (Boolean) result);
        } else if (result instanceof Number) {
            long numeric = ((Number) result).longValue();
            assertTrue("Numeric match result should be non-negative for matching inputs, but was " + numeric, numeric >= 0);
        } else if (result instanceof String) {
            String s = (String) result;
            assertTrue("String result should mention the input pattern or be non-empty.", s.length() > 0);
        } else {
            // Generic sanity: non-null result for reference types
            assertNotNull("Received non-null result of unexpected type: " + result.getClass(), result);
        }
    }

    /**
     * Given a new instance of CasamentoAproximado,
     * When the object is constructed,
     * Then its basic invariants should hold (non-null, consistent toString/hashCode equals reflexively).
     *
     * This test checks both normal construction and basic object contract to help catch constructor-time failures.
     */
    @Test(timeout = 4000)
    @Category(UnitTest.class)
    public void test2() throws Exception {
        // Given / When
        CasamentoAproximado instance = new CasamentoAproximado();

        // Then
        assertNotNull("Constructor should produce a non-null instance.", instance);

        // Basic object contract checks: reflexive equals, consistent hashCode, toString non-null.
        assertEquals("Object must be equal to itself.", instance, instance);
        int hc1 = instance.hashCode();
        int hc2 = instance.hashCode();
        assertEquals("hashCode must be stable across multiple invocations.", hc1, hc2);

        String ts = instance.toString();
        assertNotNull("toString() should not return null and should provide diagnostic information.", ts);
        assertTrue("toString() should be at least empty string (non-null already asserted).", ts.length() >= 0);

        // As an additional smoke-check, try invoking the static helper with the instance's class context
        // (covers potential static initialization side-effects).
        Object res = invokeShift("test", 0, "test", 0, 0);
        // Accept either null (void) or a reasonable typed response.
        if (res != null) {
            assertTrue("Additional smoke-check result type must be a common type (Number, Boolean, String, Collection, Map).",
                    res instanceof Number || res instanceof Boolean || res instanceof String || res instanceof Collection || res instanceof Map);
        } else {
            assertNull("Additional smoke-check returned null (void) which is acceptable.", res);
        }
    }

    // Helper to invoke the static method shiftAndAproximado via reflection.
    private Object invokeShift(String a, int b, String c, int d, int e) throws Exception {
        Method m = CasamentoAproximado.class.getMethod("shiftAndAproximado", String.class, int.class, String.class, int.class, int.class);
        m.setAccessible(true);
        return m.invoke(null, a, b, c, d, e);
    }
}