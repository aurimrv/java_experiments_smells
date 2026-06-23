package ds.seed6733;

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

    private void expectEmptyStackExceptionOnDesempilha(Pilha pilha) {
        try {
            pilha.desempilha();
            fail("Expected Exception when desempilha is called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    private Pilha createStackWithOneObject() {
        Pilha pilha = new Pilha();
        pilha.empilha(new Object());
        return pilha;
    }

    private Pilha createEmptyStack() {
        return new Pilha();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = new Pilha();
        expectEmptyStackExceptionOnDesempilha(pilha0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = createStackWithOneObject();
        Object pushed = new Object();
        pilha0.empilha(pushed);
        Object popped = pilha0.desempilha();
        assertEquals("Stack size should be zero after pop", 0, pilha0.tamanho());
        assertSame("Popped object should be the one pushed", pushed, popped);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = createEmptyStack();
        int int0 = pilha0.tamanho();
        assertEquals("Stack size should be zero for new stack", 0, int0);
    }
}