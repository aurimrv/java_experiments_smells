package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Fila;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Fila_ESTest_scaffolding {

    private Fila createFilaWithFrente(int frente) {
        Fila fila = new Fila();
        fila.frente = frente;
        return fila;
    }

    private Fila createEmptyFila() {
        return new Fila();
    }

    private Fila createFilaWithTras(int tras) {
        Fila fila = new Fila();
        fila.tras = tras;
        return fila;
    }

    private Fila createFila() {
        return new Fila();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Fila fila0 = createFilaWithFrente(588);
        try {
            fila0.imprime();
            fail("Expected NullPointerException when calling imprime method");
        } catch (NullPointerException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Fila fila0 = createEmptyFila();
        fila0.imprime();
        assertEquals("Tras should be 0 after imprime", 0, fila0.tras);
        assertNotNull("Fila object should not be null", fila0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Fila fila0 = createEmptyFila();
        try {
            fila0.desenfileira();
            fail("Expected Exception when calling desenfileira on empty fila");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Fila", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Fila fila0 = createFilaWithTras(-1);
        try {
            fila0.enfileira("Erro: A fila esta vazia");
            fail("Expected Exception when calling enfileira with tras = -1");
        } catch (Exception e) {
            assertNotNull("Exception should not be null", e);
            verifyException("ds.Fila", e);
        }
    }


}