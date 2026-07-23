package ds.seed5482;

import ds.Lista;
import org.junit.Test;
import org.junit.Before;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Lista.
 *
 * Requirements traceability:
 * - REQ-001: Validate behavior of imprime() when internal indices are invalid.
 * - REQ-002: Verify empty-list observations (vazia(), ultimo, pos) on a fresh Lista.
 * - REQ-003: Verify vazia() behavior when internal 'primeiro' is set to an invalid negative value.
 * - REQ-004: Verify insere() throws when the list appears full.
 * - REQ-005: Verify successful insertion updates public observable state.
 *
 * Tests follow Given-When-Then structure in comments and include descriptive assertion messages.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest extends Lista_ESTest_scaffolding {

    // Centralized helpers to interact with Lista internal integer fields.
    // Using reflection avoids sprinkling raw field access throughout tests
    // and documents intent (test-only manipulation of internals).
    private void setIntField(Lista lista, String fieldName, int value) {
        try {
            Field f = Lista.class.getDeclaredField(fieldName);
            f.setAccessible(true);
            f.setInt(lista, value);
        } catch (NoSuchFieldException nsfe) {
            // Try public field fallback
            try {
                Field f = Lista.class.getField(fieldName);
                f.setInt(lista, value);
            } catch (Exception e) {
                throw new RuntimeException("Unable to set field '" + fieldName + "': " + e.getMessage(), e);
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to set field '" + fieldName + "': " + e.getMessage(), e);
        }
    }

    private int getIntField(Lista lista, String fieldName) {
        try {
            Field f = Lista.class.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.getInt(lista);
        } catch (NoSuchFieldException nsfe) {
            try {
                Field f = Lista.class.getField(fieldName);
                return f.getInt(lista);
            } catch (Exception e) {
                throw new RuntimeException("Unable to read field '" + fieldName + "': " + e.getMessage(), e);
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to read field '" + fieldName + "': " + e.getMessage(), e);
        }
    }

    @Before
    public void setUp() {
        // No global setup required; individual tests create and control their Lista instances.
    }

    /**
     * REQ-001:
     * Given: a freshly created Lista
     * When: its internal 'primeiro' index is set to a negative value and imprime() is invoked
     * Then: an ArrayIndexOutOfBoundsException is expected and the exception message should reference the invalid index
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When
        final int badIndex = -411;
        setIntField(lista0, "primeiro", badIndex);

        // Then
        try {
            lista0.imprime();
            fail("Expected ArrayIndexOutOfBoundsException when 'primeiro' is negative (badIndex=" + badIndex + ")");
        } catch (ArrayIndexOutOfBoundsException e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should not be null for ArrayIndexOutOfBoundsException", msg);
            assertTrue("Exception message should contain the invalid index value (" + badIndex + "): " + msg,
                    msg.contains(String.valueOf(badIndex)));
        }
    }

    /**
     * REQ-002:
     * Given: a newly constructed Lista
     * When: imprime() is invoked on an empty list
     * Then: the operation should not throw and observable state indicates empty (vazia()==true, ultimo==0, pos==-1)
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When / Then
        try {
            lista0.imprime();
        } catch (Exception e) {
            fail("imprime() on a fresh empty Lista should not throw: " + e.getMessage());
        }

        assertTrue("A newly created Lista should be reported as empty (vazia()==true).", lista0.vazia());
        assertEquals("ultimo should be 0 for a newly created Lista.", 0, getIntField(lista0, "ultimo"));
        assertEquals("pos should be -1 for a newly created Lista.", -1, getIntField(lista0, "pos"));
    }

    /**
     * REQ-002 (additional checks):
     * Given: a newly constructed Lista
     * When: vazia() is queried
     * Then: it returns true and internal indices reflect empty-list contract
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When
        boolean empty = lista0.vazia();

        // Then
        assertTrue("vazia() must return true for a freshly created list.", empty);
        assertEquals("ultimo should be 0 on an empty list.", 0, getIntField(lista0, "ultimo"));
        assertEquals("pos should be -1 on an empty list.", -1, getIntField(lista0, "pos"));
        // Also assert that calling imprime() does not change the empty-status
        lista0.imprime();
        assertTrue("imprime() should not change emptiness of a fresh list.", lista0.vazia());
    }

    /**
     * REQ-003:
     * Given: a Lista whose internal 'primeiro' index is set to an invalid negative value
     * When: vazia() is called
     * Then: it should report non-empty (as per original implementation expectations) and the 'primeiro' value remains as set
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        final int invalidPrimeiro = -1108;

        // When
        setIntField(lista0, "primeiro", invalidPrimeiro);
        boolean empty = lista0.vazia();

        // Then
        // The original behavior expected vazia() to be false when primeiro was set to this invalid negative value.
        assertFalse("With 'primeiro' set to " + invalidPrimeiro + ", vazia() was expected to return false.", empty);
        assertEquals("The 'primeiro' field should reflect the test mutation.", invalidPrimeiro, getIntField(lista0, "primeiro"));
    }

    /**
     * REQ-004:
     * Given: a Lista manipulated to appear full by setting its 'ultimo' index to a large value
     * When: insere(null) is attempted
     * Then: an Exception indicating the list is full is expected and observable state should remain unchanged
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given
        Lista lista0 = new Lista();
        // Use a large positive index to simulate "full" internal state as in original test.
        final int simulatedFullIndex = 1603;
        setIntField(lista0, "ultimo", 1);   // match original sequence where ultimo was set to 1 then to 1603
        setIntField(lista0, "ultimo", simulatedFullIndex);

        // Capture pre-insert state for later comparison
        final int beforeUltimo = getIntField(lista0, "ultimo");
        final int beforePos = getIntField(lista0, "pos");

        // When / Then
        try {
            lista0.insere((Object) null);
            fail("Expected Exception when inserting into a list simulated as full (ultimo=" + simulatedFullIndex + ")");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception message should be present when insere fails due to full list.", msg);
            assertTrue("Exception message should indicate the list is full (contain 'cheia' or 'full'). Actual message: " + msg,
                    msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        }

        // State should not have advanced after a failed insertion
        assertEquals("ultimo should remain unchanged after failed insere attempt.", beforeUltimo, getIntField(lista0, "ultimo"));
        assertEquals("pos should remain unchanged after failed insere attempt.", beforePos, getIntField(lista0, "pos"));
    }

    /**
     * REQ-005:
     * Given: an empty Lista
     * When: insere(null) is called
     * Then: the insertion should succeed and public observable counters should be updated accordingly
     */
    @Test(timeout = 4000)
    public void test5() throws Throwable {
        // Given
        Lista lista0 = new Lista();

        // When
        try {
            lista0.insere((Object) null);
        } catch (Exception e) {
            fail("insere(null) on an empty Lista should not throw: " + e.getMessage());
        }

        // Then
        assertEquals("After inserting one element, ultimo should be 1.", 1, getIntField(lista0, "ultimo"));
        // pos semantics may vary; check that vazia() reports false and ultimo advanced
        assertFalse("After inserting an element, vazia() should return false.", lista0.vazia());
    }
}