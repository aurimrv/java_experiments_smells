package ds.seed5503;

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

    private void pushAndPopEmptyString(Pilha pilha) {
        pilha.empilha("");
        pilha.desempilha();
    }

    private int getPilhaSize(Pilha pilha) {
        return pilha.tamanho();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        try {
            pilha0.desempilha();
            fail("Expected exception when desempilha is called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        pushAndPopEmptyString(pilha0);
        assertEquals("Stack size should be zero after push and pop", 0, pilha0.tamanho());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        int int0 = getPilhaSize(pilha0);
        assertEquals("Stack size should be zero for new stack", 0, int0);
    }
}