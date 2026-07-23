package ds.seed9006;

import ds.Pilha;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Pilha.
 *
 * These tests exercise basic stack invariants and common operations:
 * - New stack should be empty (tamanho == 0, vazia() == true).
 * - Pushing increases tamanho and follows LIFO on desempilha().
 * - Popping an empty stack should raise an exception with a descriptive message.
 *
 * Traceability:
 * - Requirement: REQ-STACK-001 (Basic stack behavior)
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    private Pilha pilha;

    @Before
    public void setUp() {
        // Given a fresh stack before each test
        pilha = new Pilha();
    }

    /**
     * test0: When popping from an empty stack, an exception is expected.
     *
     * Given: a newly constructed Pilha (empty)
     * When:  desempilha() is invoked
     * Then:  an exception is thrown and its message indicates the stack is empty
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Preconditions
        assertTrue("Newly created stack should be empty", pilha.vazia());
        assertEquals("Newly created stack should have size 0", 0, pilha.tamanho());

        // Action + Verification
        try {
            pilha.desempilha();
            fail("Expected an exception when popping from an empty stack");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception thrown should have a message describing the error", msg);
            // Accept messages that mention 'vazia' or 'empty' (support for different locales)
            String lower = msg.toLowerCase();
            assertTrue("Exception message should indicate the stack is empty: " + msg,
                    lower.contains("vazia") || lower.contains("empty"));
        }
    }

    /**
     * test1: Verify multiple pushes increase size and desempilha follows LIFO.
     *
     * Given: an empty Pilha
     * When:  several items are empilhado
     * Then:  tamanho increments after each push and desempilha returns items in reverse order
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        assertTrue("Stack must start empty", pilha.vazia());
        final Object first = "first";
        final Object second = "second";
        final Object third = "third";

        // When: push items
        pilha.empilha(first);
        assertEquals("Size should be 1 after one push", 1, pilha.tamanho());
        assertFalse("Stack should not be empty after one push", pilha.vazia());

        pilha.empilha(second);
        assertEquals("Size should be 2 after two pushes", 2, pilha.tamanho());

        pilha.empilha(third);
        assertEquals("Size should be 3 after three pushes", 3, pilha.tamanho());

        // Then: desempilha returns items in LIFO order
        Object popped1 = pilha.desempilha();
        assertEquals("First popped element should be the last pushed (third)", third, popped1);
        assertEquals("Size should decrement after pop", 2, pilha.tamanho());

        Object popped2 = pilha.desempilha();
        assertEquals("Second popped element should be the second pushed", second, popped2);
        assertEquals("Size should decrement after second pop", 1, pilha.tamanho());

        Object popped3 = pilha.desempilha();
        assertEquals("Third popped element should be the first pushed", first, popped3);
        assertTrue("Stack should be empty after popping all elements", pilha.vazia());
        assertEquals("Size should be 0 after popping all elements", 0, pilha.tamanho());
    }

    /**
     * test2: Push a single element and verify size and emptiness before and after pop.
     *
     * Given: an empty Pilha
     * When:  a single, non-empty string is empilhado and then desempilhado
     * Then:  size and empty-status reflect the operations and the popped value matches the pushed value
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        assertEquals("Initial size must be zero", 0, pilha.tamanho());
        assertTrue("Initial stack should be empty", pilha.vazia());

        // When
        String value = "Erro: A pilha esta cheia"; // use a meaningful string value (not null)
        pilha.empilha(value);

        // Then: after push
        assertEquals("Size should be 1 after pushing one element", 1, pilha.tamanho());
        assertFalse("Stack should not be empty after pushing one element", pilha.vazia());

        // When removing
        Object popped = pilha.desempilha();

        // Then: popped value equals pushed value and stack is empty again
        assertEquals("Popped value should match the pushed value", value, popped);
        assertEquals("Size should return to 0 after popping the only element", 0, pilha.tamanho());
        assertTrue("Stack should be empty after popping the only element", pilha.vazia());
    }

    /**
     * test3: A freshly constructed stack should report tamanho() == 0 and vazia() == true.
     *
     * This test documents the expected initial invariants for the Pilha class.
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given a new stack
        // Then verify invariants
        assertEquals("New stack should have size zero", 0, pilha.tamanho());
        assertTrue("New stack should report empty (vazia)", pilha.vazia());

        // Sanity check: performing a simple push/pop roundtrip preserves invariants
        String element = "roundtrip";
        pilha.empilha(element);
        assertFalse("Stack should not be empty after push", pilha.vazia());
        assertEquals("Size should be 1 after push", 1, pilha.tamanho());

        Object popped = pilha.desempilha();
        assertEquals("Popped element must be the one that was pushed", element, popped);
        assertEquals("Size should be zero after popping the pushed element", 0, pilha.tamanho());
        assertTrue("Stack should be empty after popping the pushed element", pilha.vazia());
    }
}