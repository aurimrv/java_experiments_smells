package ds.seed6733;

import ds.Fila;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

/**
 * Marker interface used to categorize unit tests so they can be executed selectively.
 */
interface UnitTest {}

/**
 * Improved test suite for ds.Fila.
 *
 * Notes:
 * - These tests focus on observable behaviour via public API (enfileira, desenfileira, imprime).
 * - Each test is documented with Given-When-Then and includes descriptive assertion messages.
 * - Tests avoid relying on implementation internals where practical and exercise both happy-path
 *   and important error conditions.
 *
 * Requirement traceability (example):
 * - REQ-QUEUE-001: Basic enqueue / dequeue functionality
 * - REQ-QUEUE-002: Empty-queue error handling
 * - REQ-QUEUE-003: Handling of null elements
 * - REQ-QUEUE-004: Full-queue behaviour (observed via exceptions when capacity reached)
 */
@Category(UnitTest.class)
public class EvoAITest {

    private static final int MAX_FILL_ATTEMPTS = 1000;

    private Fila fila;

    @Before
    public void setUp() {
        // Create a fresh queue for each test
        fila = new Fila();
    }

    /**
     * test0
     *
     * Given a queue with a single null element,
     * When imprime() is invoked,
     * Then the implementation may throw NullPointerException during printing,
     * and the queue should still return the null element when dequeued.
     *
     * Requirement: REQ-QUEUE-003
     */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        // Given
        fila.enfileira((Object) null);

        // When: invoke imprime(); it may or may not throw a NullPointerException depending on implementation
        boolean npeThrown = false;
        try {
            fila.imprime();
        } catch (NullPointerException npe) {
            npeThrown = true;
        } catch (Exception ex) {
            // If other exceptions are thrown, fail the test with the unexpected exception
            fail("imprime() threw unexpected exception: " + ex);
        }

        // Then: regardless of imprime() behaviour, dequeuing should return the originally enqueued null
        try {
            Object removed = fila.desenfileira();
            assertNull("Expected the dequeued element to be null after enqueueing null (imprime thrown? " + npeThrown + ")", removed);
        } catch (Exception ex) {
            fail("desenfileira() should succeed after enqueueing null; unexpected exception: " + ex);
        }
    }

    /**
     * test1
     *
     * Given an empty queue,
     * When imprime() is invoked and then an element is enqueued,
     * Then imprime() should not throw and enqueuing/dequeuing should behave FIFO.
     *
     * Requirement: REQ-QUEUE-001
     */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        // Given: a fresh, empty queue (setUp)

        // When: printing an empty queue should not throw
        try {
            fila.imprime();
        } catch (Exception ex) {
            fail("imprime() on an empty queue should not throw, but threw: " + ex);
        }

        // And: enqueue a single element and then dequeue it
        final String payload = "hello";
        try {
            fila.enfileira(payload);
        } catch (Exception ex) {
            fail("enfileira() failed for a typical payload: " + ex);
        }

        try {
            Object removed = fila.desenfileira();
            assertEquals("Dequeued element should match the enqueued payload", payload, removed);
        } catch (Exception ex) {
            fail("desenfileira() should succeed after a single enqueue: " + ex);
        }
    }

    /**
     * test2
     *
     * Given an empty queue,
     * When desenfileira() is invoked,
     * Then an Exception indicating the queue is empty should be thrown with a clear message.
     *
     * Requirement: REQ-QUEUE-002
     */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        // Given: a fresh, empty queue (setUp)

        // When / Then: attempting to dequeue from an empty queue should raise an exception with a helpful message
        try {
            fila.desenfileira();
            fail("Expected an exception when dequeuing from an empty queue");
        } catch (Exception e) {
            // Verify the exception contains a useful message. The original implementation used:
            // "Erro: A fila esta vazia"
            String msg = e.getMessage();
            assertNotNull("Exception thrown when dequeuing empty queue should contain a message", msg);
            assertTrue("Exception message should indicate empty queue: " + msg, msg.toLowerCase().contains("vaz") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("vazia"));
        }
    }

    /**
     * test3
     *
     * Given a queue,
     * When a null element is enqueued and then immediately dequeued,
     * Then the dequeued value should be null and a subsequent dequeue should indicate the queue is empty.
     *
     * Requirement: REQ-QUEUE-003
     */
    @Test(timeout = 4000)
    public void test3() throws Throwable {
        // Given
        fila.enfileira((Object) null);

        // When: dequeue the element we just enqueued
        try {
            Object removed = fila.desenfileira();
            assertNull("Dequeued value should be null when a null value was enqueued", removed);
        } catch (Exception ex) {
            fail("desenfileira() should succeed and return null after enqueueing null: " + ex);
        }

        // Then: the queue should now be empty and further dequeues should fail with an appropriate message
        try {
            fila.desenfileira();
            fail("Expected dequeuing from an empty queue to throw after removing the sole element");
        } catch (Exception e) {
            String msg = e.getMessage();
            assertNotNull("Exception message for empty queue should be non-null", msg);
            assertTrue("Exception message should indicate empty queue: " + msg, msg.toLowerCase().contains("vaz") || msg.toLowerCase().contains("empty") || msg.toLowerCase().contains("vazia"));
        }
    }

    /**
     * test4
     *
     * Given a queue,
     * When many elements are enqueued until capacity is reached or until a practical test limit,
     * Then either an exception indicating the queue is full should be raised or enqueuing succeeds up to the tested limit.
     *
     * Requirement: REQ-QUEUE-004
     */
    @Test(timeout = 4000)
    public void test4() throws Throwable {
        // Given: a fresh queue (setUp)

        // We'll enqueue repeatedly up to MAX_FILL_ATTEMPTS to observe full-queue behaviour deterministically where possible.
        final String first = "first-element";
        boolean firstEnqueued = false;
        boolean fullExceptionObserved = false;
        Exception fullException = null;

        try {
            fila.enfileira(first);
            firstEnqueued = true;
        } catch (Exception ex) {
            fail("Initial enqueue should succeed for a fresh queue; failed with: " + ex);
        }

        // Fill until we observe an exception or reach our practical limit
        for (int i = 0; i < MAX_FILL_ATTEMPTS; i++) {
            try {
                fila.enfileira("x-" + i);
            } catch (Exception e) {
                // We observed an exception while filling; record and stop
                fullExceptionObserved = true;
                fullException = e;
                break;
            }
        }

        if (fullExceptionObserved) {
            // If an exception occurred, assert that it indicates a full queue
            String msg = fullException.getMessage();
            assertNotNull("Full-queue exception should include a message", msg);
            assertTrue("Full-queue exception message should mention fullness (cheia/full): " + msg,
                    msg.toLowerCase().contains("cheia") || msg.toLowerCase().contains("full"));
        } else {
            // No exception observed within our limit: treat this as acceptable (implementation may have large capacity)
            // Verify basic FIFO property by dequeuing the first element enqueued
            try {
                Object removed = fila.desenfileira();
                assertEquals("Dequeued first element should match the first enqueued value when no capacity was reached", first, removed);
            } catch (Exception ex) {
                fail("desenfileira() should succeed after enqueuing elements in the absence of a full-queue exception: " + ex);
            }
        }
    }
}