package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fila_ESTest_scaffolding {

    private static final String TEST_STRING = "o)P&]5H9P";

    private Fila createFilaWithOneElement() {
        Fila fila = new Fila();
        fila.enfileira(TEST_STRING);
        return fila;
    }

    private void expectFilaEmptyException(Fila fila) {
        try {
            fila.desenfileira();
            fail("Expected Exception with message 'Erro: A fila esta vazia'");
        } catch(Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }

    private void expectFilaFullException(Fila fila, Object obj) {
        try {
            fila.enfileira(obj);
            fail("Expected Exception with message 'Erro: A fila esta cheia'");
        } catch(Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Fila fila0 = new Fila();
        fila0.enfileira(""); // boundary value test: empty string
        fila0.enfileira(TEST_STRING); // typical value
        fila0.imprime();
        assertEquals("Rear index should be 1 after enqueue", 1, fila0.tras);
        assertEquals(TEST_STRING, fila0.dados[1]); // assuming internal array 'dados' accessible
        assertEquals(0, fila0.frente);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Fila fila0 = new Fila();
        expectFilaEmptyException(fila0);
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Fila fila0 = new Fila();
        fila0.frente = 1;
        expectFilaFullException(fila0, fila0);
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Fila fila0 = new Fila();
        fila0.enfileira(""); // boundary value test: empty string
        fila0.enfileira(TEST_STRING); // typical value
        fila0.desenfileira();
        assertEquals("Rear index should be 1 after enqueue and dequeue", 1, fila0.tras);
        assertEquals(0, fila0.frente);
        // Additional assertions on queue state if accessible
    }
}