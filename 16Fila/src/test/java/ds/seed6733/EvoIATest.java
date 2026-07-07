package ds.seed6733;

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

    private Fila createFilaWithObject(Object obj) {
        Fila fila = new Fila();
        fila.enfileira(obj);
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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Fila fila0 = createFilaWithObject(new Object());
        // Removed unnecessary print call to keep test concise and focused
        assertFalse("Queue should not be empty after enqueue", fila0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Fila fila0 = new Fila();
        expectEmptyQueueException(fila0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Fila fila0 = createFilaWithObject("");
        Object object0 = fila0.desenfileira();
        assertEquals("Dequeued object should be empty string", "", object0);
    }
}