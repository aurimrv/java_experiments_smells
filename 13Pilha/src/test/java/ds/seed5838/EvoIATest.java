package ds.seed5838;

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

    private void expectDesempilhaException(Pilha pilha) {
        try {
            pilha.desempilha();
            fail("Expected Exception when desempilha is called on empty stack");
        } catch(Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            assertTrue(e instanceof Exception);
            verifyException("ds.Pilha", e);
        }
    }

    private void expectEmpilhaException(Pilha pilha, Object obj) {
        try {
            pilha.empilha(obj);
            fail("Expected Exception when empilha is called on full stack");
        } catch(Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
            assertTrue(e instanceof Exception);
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = new Pilha();
        expectDesempilhaException(pilha0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = new Pilha();
        pilha0.empilha(null);
        Object object0 = pilha0.desempilha();
        pilha0.empilha(null);
        pilha0.item = new Object[1];
        expectEmpilhaException(pilha0, object0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = new Pilha();
        int int0 = pilha0.tamanho();
        assertEquals("Expected stack size to be 0 for new stack", 0, int0);
        // Additional assertion to improve fault detection
        // Assuming Pilha has a method estaVazia() to check emptiness
        // If not, this line can be removed or replaced
        // assertTrue("Stack should be empty", pilha0.estaVazia());
    }
}