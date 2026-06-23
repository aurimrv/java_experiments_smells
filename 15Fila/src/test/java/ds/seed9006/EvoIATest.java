package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fila_ESTest_scaffolding {

    private Fila createFilaWithOneElement(String element) {
        Fila fila = new Fila();
        fila.enfileira(element);
        return fila;
    }

    private Fila createEmptyFila() {
        return new Fila();
    }

    private Fila createFullFila() {
        Fila fila = new Fila();
        fila.frente = 1; // simulate full queue state
        return fila;
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Fila fila0 = createFilaWithOneElement(")f[4)[.qr6e");
        fila0.imprime();
        assertEquals("Rear index should be 1 after enqueue", 1, fila0.tras);
        assertEquals(0, fila0.frente);
        // Additional assertions could verify internal state if accessible
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Fila fila0 = createEmptyFila();
        try { 
            fila0.desenfileira();
            fail("Expected Exception when dequeuing empty queue");
        } catch(Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test2()  throws Throwable  {
        Fila fila0 = createFullFila();
        try { 
            fila0.enfileira("2jR}Dx:GZI");
            fail("Expected Exception when enqueuing on full queue");
        } catch(Exception e) {
            assertEquals("Erro: A fila esta cheia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Fila fila0 = createFilaWithOneElement(")f[4)[.qr6e");
        fila0.desenfileira();
        assertEquals("Rear index should be 1 after enqueue and dequeue", 1, fila0.tras);
        assertEquals(0, fila0.frente);
        // Optionally verify queue is empty after dequeue
        // assertTrue(fila0.isEmpty());
    }
}