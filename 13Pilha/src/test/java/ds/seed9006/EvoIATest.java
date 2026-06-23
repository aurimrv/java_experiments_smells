package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Pilha;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Pilha_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Pilha pilha0 = new Pilha();
        try {
            pilha0.desempilha();
            fail("Expected Exception when desempilha called on empty stack");
        } catch(Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    private Object[] createEmptyStackArray() {
        return new Object[0];
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Pilha pilha0 = new Pilha();
        pilha0.item = createEmptyStackArray();
        Object object0 = new Object();
        try {
            pilha0.empilha(object0);
            fail("Expected Exception when empilha called on full stack");
        } catch(Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }



    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Pilha pilha0 = new Pilha();
        int int0 = pilha0.tamanho();
        assertEquals("Stack size should be 0 for new stack", 0, int0);
        assertTrue("Stack should be empty", pilha0.vazia());
    }
}