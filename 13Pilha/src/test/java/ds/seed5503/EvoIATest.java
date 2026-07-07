package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Pilha_ESTest_scaffolding {

    private Pilha createEmptyPilha() {
        return new Pilha();
    }

    private Pilha createFullPilha() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("");
        pilha.empilha(new Object());
        pilha.empilha(new Object());
        pilha.item = new Object[2];
        return pilha;
    }

    private Object createTestObject() {
        return new Object();
    }

    private Pilha createPilhaWithObjects() throws Exception {
        Pilha pilha = new Pilha();
        pilha.empilha("");
        pilha.desempilha();
        Object obj = createTestObject();
        pilha.empilha(obj);
        pilha.desempilha();
        pilha.empilha(obj);
        pilha.empilha(obj);
        return pilha;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        try {
            pilha0.desempilha();
            fail("Expected Exception when desempilha called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = createFullPilha();
        try {
            pilha0.empilha("");
            fail("Expected Exception when empilha called on full stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = new Pilha();
        int int0 = pilha0.tamanho();
        assertEquals("Expected stack size to be 0 for new stack", 0, int0);
    }
}