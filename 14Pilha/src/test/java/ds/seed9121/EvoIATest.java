package ds.seed9121;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Pilha_ESTest_scaffolding {

    private Pilha createEmptyStack() {
        return new Pilha();
    }

    private Object createTestObject() {
        return new Object();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = createEmptyStack();
        try {
            pilha0.desempilha();
            fail("Expected Exception when desempilha() is called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = createEmptyStack();
        Object object0 = createTestObject();
        pilha0.empilha(object0);
        Object popped = pilha0.desempilha();
        assertSame(object0, popped);
        assertEquals("Stack size should be zero after push and pop", 0, pilha0.tamanho());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = createEmptyStack();
        int int0 = pilha0.tamanho();
        assertEquals("Stack size should be zero for new stack", 0, int0);
    }
}