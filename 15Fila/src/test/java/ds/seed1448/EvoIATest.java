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

    private Fila createFilaWithOneElement() {
        Fila fila = new Fila();
        fila.enfileira("p6sXgWE}Q>&j&");
        return fila;
    }

    private void expectEmptyQueueException(Fila fila) {
        try {
            fila.desenfileira();
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.Fila", e);
        }
    }

    private void setupFullFila(Fila fila) {
        fila.item = new Object[2];
        fila.tras = 1867;
    }

    private void expectFullQueueException(Fila fila) {
        try {
            fila.enfileira("Erro: A fila esta cheia");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Fila fila0 = createFilaWithOneElement();
        fila0.imprime();
        assertEquals("Rear index should be 1 after enqueue", 1, fila0.tras);
        assertEquals(0, fila0.frente);
        assertNotNull(fila0.item);
        assertEquals("p6sXgWE}Q>&j&", fila0.item[0]);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Fila fila0 = new Fila();
        expectEmptyQueueException(fila0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Fila fila0 = createFilaWithOneElement();
        fila0.desenfileira();
        assertEquals("Front index should be 1 after dequeue", 1, fila0.frente);
        assertEquals(0, fila0.tras);
        assertNull(fila0.item[0]);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Fila fila0 = new Fila();
        setupFullFila(fila0);
        expectFullQueueException(fila0);
    }
}