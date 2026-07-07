package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Pilha_ESTest_scaffolding {

    private Pilha createEmptyPilha() {
        return new Pilha();
    }

    private Pilha createFullPilha() {
        Pilha pilha = new Pilha();
        pilha.topo = 1;
        pilha.item = new Object[1];
        return pilha;
    }

    private Pilha createPilhaWithOneNull() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha(null);
        return pilha;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        try {
            pilha0.desempilha();
            fail("Expected Exception when desempilha() is called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }




    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        int int0 = pilha0.tamanho();
        assertEquals("Tamanho should be 0 for empty stack", 0, int0);
    }
}