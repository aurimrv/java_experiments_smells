package ds.seed5482;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Pilha pilha0 = new Pilha();
        try {
            pilha0.desempilha();
            fail("Expected exception when desempilha called on empty stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta vazia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Pilha pilha0 = new Pilha();
        Object object0 = new Object();
        pilha0.empilha(object0);
        assertEquals("Stack pointer should be 1 after push", 1, pilha0.topo);
        assertSame("Top item should be the pushed object", object0, pilha0.item[pilha0.topo - 1]);

        Object popped = pilha0.desempilha();
        assertSame("Popped item should be the pushed object", object0, popped);
        assertTrue("Stack should be empty after pop", pilha0.vazia());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = new Pilha();
        Object[] objectArray0 = new Object[0];
        pilha0.item = objectArray0;
        try {
            pilha0.empilha(null);
            fail("Expected exception when empilha called on full stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Pilha pilha0 = new Pilha();
        int int0 = pilha0.tamanho();
        assertEquals("Stack size should be zero on new stack", 0, int0);
    }
}