package ds.seed5482;

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

    private Fila createFilaWithOneObject(Object obj) {
        Fila fila = new Fila();
        fila.enfileira(obj);
        return fila;
    }

    private void expectFilaEmptyException(Fila fila) {
        try {
            fila.desenfileira();
            fail("Expected Exception when desenfileira called on empty fila");
        } catch(Exception e) {
            assertEquals("Erro: A fila esta vazia", e.getMessage());
            verifyException("ds.Fila", e);
        }
    }



}