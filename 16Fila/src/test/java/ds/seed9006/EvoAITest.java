package ds.seed9006;

import ds.Fila;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Improved tests for ds.Fila.
 *
 * These tests follow a Given-When-Then structure, include descriptive assertion
 * messages, and verify both normal and exceptional behavior described by:
 * REQ-FILA-001: Dequeuing an empty queue must throw an Exception with message
 * "Erro: A fila esta vazia".
 * REQ-FILA-002: Enqueuing an element should make the queue non-empty and allow
 * retrieving the same element when dequeued.
 */
public class EvoAITest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private Fila emptyFila;

    @Before
    public void setUp() {
        // Provide a fresh queue before each test
        emptyFila = new Fila();
    }

    /**
     * Given an empty queue,
     * When an element is enfileirada,
     * Then the queue must report non-empty and subsequent desenfileira must
     * return the same element and leave the queue empty again.
     *
     * REQ-FILA-002
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        Fila fila = new Fila();
        assertTrue("Precondition: newly created queue should be empty", fila.vazia());

        // When: enqueue a single element (core action)
        final String payload = "ds.Fila$Celula";
        fila.enfileira(payload);

        // Then: basic state checks and behavior
        assertFalse("After enfileira, the queue should not be empty", fila.vazia());

        // Additional verification: dequeuing returns the same payload and empties the queue
        Object dequeued = fila.desenfileira();
        assertEquals("Dequeued element must equal the enqueued element", payload, dequeued);
        assertTrue("Queue should be empty after removing the only element", fila.vazia());
    }

    /**
     * Given an empty queue,
     * When desenfileira is invoked,
     * Then an Exception is thrown with a clear message.
     *
     * REQ-FILA-001
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: ensure queue is empty
        Fila fila = emptyFila;
        assertTrue("Precondition: queue must be empty before attempting to dequeue", fila.vazia());

        // Expect: specific exception type and message
        thrown.expect(Exception.class);
        thrown.expectMessage("Erro: A fila esta vazia");

        // When (core action): attempt to dequeue from empty queue -> should throw
        fila.desenfileira();

        // No explicit Then section here because ExpectedException verifies the outcome.
    }

    /**
     * Given an empty queue,
     * When a value is enfileirada and then desenfileirada,
     * Then the value returned equals the enfileirada value and the queue returns to empty.
     *
     * This test exercises the common enqueue-dequeue roundtrip scenario,
     * verifying both value integrity and post-conditions.
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given
        Fila fila = new Fila();
        assertTrue("Queue should start empty for this roundtrip test", fila.vazia());

        // When (composed scenario: enqueue then dequeue)
        final String value = "ds.Fila$Celula";
        fila.enfileira(value);

        // Sanity check after enqueue
        assertFalse("Queue must not be empty immediately after enqueue", fila.vazia());

        // Core action: dequeue the element and capture result
        Object result = fila.desenfileira();

        // Then: verify integrity and post-state
        assertEquals("The dequeued value must match what was enqueued", value, result);
        assertTrue("Queue should be empty after dequeuing the only element", fila.vazia());
    }
}