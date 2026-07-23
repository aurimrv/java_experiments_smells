package ds.seed7992;

import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

/**
 * Improved tests for ds.Pilha.
 *
 * Each test documents the requirement it is validating (REQ-...),
 * follows a Given-When-Then structure, and contains multiple, descriptive assertions.
 *
 * Note: this class intentionally preserves the original test method names (test0, test1, test2)
 * to remain compatible with existing references while improving the assertions and structure.
 */
@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoAITest extends Pilha_ESTest_scaffolding {

    private Pilha pilha;

    @Before
    public void setUp() {
        // Initialize a fresh stack before each test to ensure isolation.
        pilha = new Pilha();
    }

    /**
     * REQ-POP-001: Popping an empty stack must throw an Exception indicating the stack is empty.
     *
     * Given an empty Pilha,
     * When desempilha() is invoked,
     * Then an Exception is thrown and the stack remains empty (size = 0).
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        assertNotNull("Setup produced a null Pilha instance", pilha);
        assertEquals("Newly created stack should have size 0", 0, pilha.tamanho());

        // When / Then
        try {
            pilha.desempilha();
            fail("Expected Exception when popping an empty stack (REQ-POP-001)");
        } catch (Exception e) {
            // Exception should indicate the stack is empty and should not modify state.
            String message = e.getMessage();
            assertNotNull("Exception message must not be null", message);
            assertTrue("Exception message should indicate empty stack: " + message,
                    message.toLowerCase().contains("vazia") || message.toLowerCase().contains("empty"));
            // Ensure no state change occurred
            assertEquals("Size must remain 0 after a failed pop", 0, pilha.tamanho());
        }
    }

    /**
     * REQ-PUSHPOP-001: Pushing an element then popping it should return the same element
     * and update the size correctly (LIFO behavior).
     *
     * Given an empty Pilha and an arbitrary object,
     * When the object is empilhado() and then desempilhado(),
     * Then the returned object is the same instance and the stack size returns to 0.
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given
        Object object0 = new Object();
        assertEquals("Initial size must be zero before push", 0, pilha.tamanho());

        // When: push the object
        pilha.empilha(object0);

        // Then: size should increase to 1
        assertEquals("Size must be 1 after one push", 1, pilha.tamanho());

        // When: pop the object
        Object popped = pilha.desempilha();

        // Then: popped object must be the exact same instance (identity) and size should be back to 0
        assertSame("Popped object should be the same instance that was pushed", object0, popped);
        assertEquals("Size must return to 0 after popping the only element", 0, pilha.tamanho());

        // Additional sanity: further pop should still throw (stack is empty again)
        try {
            pilha.desempilha();
            fail("Expected Exception when popping after stack became empty again (REQ-POP-001)");
        } catch (Exception e) {
            assertNotNull("Exception message must not be null", e.getMessage());
        }
    }

    /**
     * REQ-SIZE-001: tamanho() must return the current number of elements and be non-negative.
     *
     * Given a newly created Pilha,
     * When tamanho() is queried,
     * Then it returns 0 and never returns a negative value.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given / When
        int initialSize = pilha.tamanho();

        // Then
        assertEquals("New stack must report size 0", 0, initialSize);
        assertTrue("Stack size must be non-negative", initialSize >= 0);

        // Additional checks: pushing multiple items updates size accordingly
        Object a = "a";
        Object b = "b";
        pilha.empilha(a);
        assertEquals("Size must be 1 after pushing one element", 1, pilha.tamanho());
        pilha.empilha(b);
        assertEquals("Size must be 2 after pushing two elements", 2, pilha.tamanho());

        // Pop one and verify size decremented
        Object popped = pilha.desempilha();
        assertEquals("Popping should reduce size by one", 1, pilha.tamanho());
        assertSame("Popped element must be the last pushed (LIFO)", b, popped);

        // Clear remaining and verify size returns to zero
        pilha.desempilha();
        assertEquals("After removing all elements size must be 0", 0, pilha.tamanho());
    }
}