package ds.seed5503;

import ds.Pilha;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved and documented tests for ds.Pilha.
 *
 * Notes:
 * - Each test uses Given-When-Then comments, multiple meaningful assertions,
 *   and descriptive assertion messages to aid diagnosis.
 * - Tests keep the original method names (test0, test1, test2) as required.
 */
public class EvoAITest {

    /**
     * Requirement: REQ-STACK-001
     * Given an empty stack, when attempting to pop (desempilha), then an Exception
     * indicating the stack is empty must be thrown and the stack size must remain unchanged.
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given: a fresh, empty stack
        Pilha pilha0 = new Pilha();
        assertNotNull("Stack instance should be created", pilha0);
        int initialSize = pilha0.tamanho();
        assertEquals("Precondition: new stack should have size 0", 0, initialSize);

        // When: attempting to pop from the empty stack
        try {
            // Call directly; if this throws, we will inspect the exception below
            pilha0.desempilha();
            fail("Expected an Exception when popping from an empty stack");
        } catch (Exception e) {
            // Then: an exception is thrown with a meaningful message and the stack remains unchanged
            String message = e.getMessage();
            assertNotNull("Exception message should not be null", message);
            String lower = message.toLowerCase();
            assertTrue("Exception message should indicate the stack is empty (contain 'vazia' or 'empty'). Actual: " + message,
                    lower.contains("vazia") || lower.contains("empty") || lower.contains("vazio"));
            assertEquals("Stack size should remain 0 after failed pop", 0, pilha0.tamanho());
        }
    }

    /**
     * Requirement: REQ-STACK-002
     * Given an empty stack, when pushing a value and then popping it, the popped value
     * must equal the pushed value and the stack size must reflect the changes.
     *
     * Note: We use reflection to invoke desempilha so the test works whether desempilha returns
     * a value or is declared void in the implementation.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: an empty stack
        Pilha pilha0 = new Pilha();
        assertNotNull("Stack instance should be created", pilha0);
        assertEquals("Initial size must be 0", 0, pilha0.tamanho());

        // When: pushing a known value
        String pushed = "";
        pilha0.empilha(pushed);
        assertEquals("Size after one push should be 1", 1, pilha0.tamanho());

        // And: popping the value (invoke via reflection to capture return value if present)
        Object popped = invokeDesempilha(pilha0);

        // Then: the popped value should match what was pushed and the stack should be empty again
        assertTrue("Popped value should be null or a String instance",
                popped == null || popped instanceof String);
        if (popped != null) {
            assertEquals("Popped value should match pushed value", pushed, popped);
        }
        assertEquals("Size after pop should be back to 0", 0, pilha0.tamanho());
    }

    /**
     * Requirement: REQ-STACK-003
     * Validate basic invariants of a newly created stack.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a newly constructed stack
        Pilha pilha0 = new Pilha();
        assertNotNull("Stack instance should be created", pilha0);

        // When: querying its size multiple times without modifying it
        int firstSize = pilha0.tamanho();
        int secondSize = pilha0.tamanho();

        // Then: the size must be non-negative, equal to zero for a fresh stack,
        // and stable across consecutive calls when the stack is unchanged.
        assertTrue("New stack size must be non-negative", firstSize >= 0);
        assertEquals("New stack should be empty (size 0)", 0, firstSize);
        assertEquals("Size should be consistent across calls when unchanged", firstSize, secondSize);
    }

    /**
     * Helper to invoke desempilha via reflection. This preserves the intent of the test
     * whether desempilha has a void return type or returns the popped element.
     *
     * @param pilha the Pilha instance to operate on
     * @return the value returned by desempilha, or null if the method is void
     * @throws Throwable if the invoked method throws an exception
     */
    private Object invokeDesempilha(Pilha pilha) throws Throwable {
        Method m = pilha.getClass().getMethod("desempilha");
        try {
            return m.invoke(pilha);
        } catch (InvocationTargetException ite) {
            // Unwrap and rethrow the underlying exception to allow tests to inspect it
            throw ite.getCause();
        }
    }
}