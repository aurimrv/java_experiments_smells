package ds.seed5311;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Fila_ESTest_scaffolding {

    private static final String TEST_STRING = "BFvX4s";

    private Fila createFilaWithOneElement() {
        Fila fila = new Fila();
        fila.enfileira(TEST_STRING);
        return fila;
    }

    private Fila createEmptyFila() {
        return new Fila();
    }

    @Test(timeout = 4000)
    // Given a new queue
    // When an element is enqueued
    // Then the queue should not be empty
    public void enfileira_withValidElement_queueIsNotEmpty() throws Throwable {
        Fila fila0 = new Fila();
        fila0.enfileira(""); // boundary test with empty string
        fila0.imprime();
        assertFalse("Queue should not be empty after enqueue", fila0.vazia());
    }

    @Test(timeout = 4000)
    // Given an empty queue
    // When attempting to dequeue
    // Then an exception is thrown
    public void desenfileira_onEmptyQueue_throwsException() throws Throwable {
        Fila fila0 = createEmptyFila();
        try {
            fila0.desenfileira();
            fail("Expecting exception: Exception with message 'Erro: A fila esta vazia'");
        } catch (Exception e) {
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    // Given a queue with one element
    // When dequeuing
    // Then the dequeued element matches the enqueued element
    public void enfileira_then_desenfileira_returnsSameElement() throws Throwable {
        Fila fila0 = createFilaWithOneElement();
        Object object0 = fila0.desenfileira();
        assertEquals("Dequeued element should match enqueued element", TEST_STRING, object0);
    }
}