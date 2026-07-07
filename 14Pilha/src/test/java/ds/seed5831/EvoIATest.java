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

    private static final String EMPTY_STACK_ERROR = "Erro: A pilha esta vazia";
    private static final String TEST_ELEMENT = "i";
    private static final int EMPTY_STACK_SIZE = 0;

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha = new Pilha();
        try {
            pilha.desempilha();
            fail("Expected Exception when desempilha() is called on empty stack");
        } catch (Exception e) {
            assertEquals(EMPTY_STACK_ERROR, e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha = new Pilha();
        pilha.empilha(TEST_ELEMENT);
        Object popped = pilha.desempilha();
        assertEquals(TEST_ELEMENT, popped);
        assertEquals("Stack size should be zero after push and pop", 0, pilha.tamanho());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha = new Pilha();
        int size = pilha.tamanho();
        assertEquals("New stack should have size zero", EMPTY_STACK_SIZE, size);
        assertTrue(pilha.vazia());
    }
}