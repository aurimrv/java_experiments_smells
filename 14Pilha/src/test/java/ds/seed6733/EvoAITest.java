package ds.seed6733;

import ds.Pilha;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Unit tests for ds.Pilha (stack) implementation.
 *
 * Requirements covered:
 * - REQ-STACK-001: Popping an empty stack must throw a clear exception.
 * - REQ-STACK-002: Pushing increases size and popping returns the last pushed element (LIFO).
 * - REQ-STACK-003: New stack reports size zero and behaves consistently across multiple push/pop.
 *
 * These tests follow a Given-When-Then structure and include clear assertions with messages
 * to improve diagnosability.
 */
interface UnitTest {}

@Category(UnitTest.class)
public class EvoAITest {

    /**
     * Functional helper to run code that may throw checked exceptions.
     */
    @FunctionalInterface
    private interface ThrowingRunnable {
        void run() throws Throwable;
    }

    /**
     * Simple helper that asserts that the provided runnable throws an exception of the expected type.
     * Returns the thrown exception for further inspection.
     */
    private static <T extends Throwable> T expectException(Class<T> expected, ThrowingRunnable action) {
        try {
            action.run();
        } catch (Throwable e) {
            if (expected.isInstance(e)) {
                return expected.cast(e);
            } else {
                // Wrap unexpected exception types to make test failure clear
                throw new AssertionError("Unexpected exception type thrown. Expected: " + expected.getName() +
                        ", but was: " + e.getClass().getName(), e);
            }
        }
        throw new AssertionError("Expected exception of type " + expected.getName() + " but no exception was thrown.");
    }

    /**
     * Given an empty stack, when attempting to pop, then an Exception is thrown and the stack remains empty.
     *
     * Requirement: REQ-STACK-001
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Pilha pilha0 = new Pilha();

        // When / Then: assert that popping an empty stack throws an Exception with an informative message
        Exception thrown = expectException(Exception.class, () -> pilha0.desempilha());
        assertNotNull("Exception thrown when popping empty stack should have a message", thrown.getMessage());
        String msgLower = thrown.getMessage().toLowerCase();
        assertTrue("Exception message should indicate that the stack is empty", msgLower.contains("vazi"));

        // And: the stack should still report size 0 after the failed pop
        assertEquals("After failed pop, stack size should remain 0", 0, pilha0.tamanho());
    }

    /**
     * Given a stack and an element, when the element is pushed and then popped,
     * then the popped element should be the same instance and the size should update accordingly.
     *
     * Requirement: REQ-STACK-002
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Pilha pilha0 = new Pilha();
        Object object0 = new Object();

        // Pre-condition checks
        assertEquals("Initial stack size should be 0", 0, pilha0.tamanho());
        assertTrue("Initial stack must report non-negative size", pilha0.tamanho() >= 0);

        // When: push (setup for the action under test)
        pilha0.empilha(object0);

        // Intermediate assertion: ensure the push had the expected effect
        assertEquals("Stack size should be 1 after one push", 1, pilha0.tamanho());

        // When: pop (action under test)
        Object popped = pilha0.desempilha();

        // Then: verify popped element and final state
        assertSame("Popped element should be the exact instance that was pushed", object0, popped);
        assertEquals("Stack size should return to 0 after popping the only element", 0, pilha0.tamanho());
        assertTrue("Stack should be empty after popping the only element", pilha0.tamanho() == 0);
    }

    /**
     * Given a new stack, when performing a sequence of pushes and pops,
     * then the size should reflect the operations and elements should be popped in LIFO order.
     *
     * Requirement: REQ-STACK-003
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Pilha pilha0 = new Pilha();

        // Initial state assertions
        assertEquals("Newly created stack should have size 0", 0, pilha0.tamanho());
        assertTrue("Initial size must not be negative", pilha0.tamanho() >= 0);

        // When: push two elements
        Object a = "first";
        Object b = "second";
        pilha0.empilha(a);
        assertEquals("Size should be 1 after pushing one element", 1, pilha0.tamanho());
        pilha0.empilha(b);
        assertEquals("Size should be 2 after pushing two elements", 2, pilha0.tamanho());

        // Then: popping should follow LIFO order and adjust size accordingly
        Object popped1 = pilha0.desempilha();
        assertSame("First pop should return the last pushed element (LIFO)", b, popped1);
        assertEquals("Size should be 1 after one pop", 1, pilha0.tamanho());

        Object popped2 = pilha0.desempilha();
        assertSame("Second pop should return the first pushed element", a, popped2);
        assertEquals("Size should be 0 after popping all elements", 0, pilha0.tamanho());
    }
}