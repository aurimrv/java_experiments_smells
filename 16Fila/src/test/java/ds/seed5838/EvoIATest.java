package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fila_ESTest_scaffolding {

    private Fila createEmptyFila() {
        return new Fila();
    }

    private Fila createFilaWithElement(Object element) {
        Fila fila = new Fila();
        fila.enfileira(element);
        return fila;
    }

    private Fila createFilaWithNull() {
        Fila fila = new Fila();
        fila.enfileira(null);
        return fila;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Fila fila0 = createEmptyFila();
        fila0.imprime();
        assertTrue("Queue should be empty after creation", fila0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Fila fila0 = createEmptyFila();
        try {
            fila0.desenfileira();
            fail("Expected Exception when dequeuing empty queue");
        } catch(Exception e) {
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Fila fila0 = createFilaWithElement("P.");
        Object object0 = fila0.desenfileira();
        assertEquals("Expected dequeued element to be 'P.'", "P.", object0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Fila fila0 = createFilaWithNull();
        try {
            fila0.imprime();
            fail("Expected NullPointerException when printing queue with null element");
        } catch(NullPointerException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }
}