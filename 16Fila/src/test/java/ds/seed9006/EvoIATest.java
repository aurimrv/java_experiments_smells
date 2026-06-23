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

    private Fila createFilaWithOneElement() {
        Fila fila = new Fila();
        fila.enfileira("ds.Fila$Celula");
        return fila;
    }


    private void expectEmptyQueueException(Fila fila) {
        try {
            fila.desenfileira();
            fail("Expecting exception: Exception");
        } catch(Exception e) {
            verifyException("ds.Fila", e);
        }
    }


}