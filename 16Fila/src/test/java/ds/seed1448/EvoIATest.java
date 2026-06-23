package ds.seed1448;

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

    private Fila createFila() {
        return new Fila();
    }

    private Object createObject() {
        return new Object();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Fila fila0 = createFila();
        Object object0 = createObject();
        fila0.enfileira(object0);
        fila0.imprime();
        assertFalse("Queue should not be empty after enqueue", fila0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Fila fila0 = createFila();
        try {
            fila0.desenfileira();
            fail("Expected Exception when dequeuing empty queue");
        } catch (Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Fila fila0 = createFila();
        Object object0 = createObject();
        fila0.enfileira(object0);
        Object object1 = fila0.desenfileira();
        assertSame("Dequeued object should be the same as enqueued", object1, object0);
    }
}