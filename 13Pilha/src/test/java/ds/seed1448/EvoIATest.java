package ds.seed1448;

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

    private Pilha createPilhaWithTopoOne() {
        Pilha p = new Pilha();
        p.topo = 1;
        return p;
    }

    private Pilha createFullPilha() {
        Pilha p = new Pilha();
        p.topo = 1;
        p.item = new Object[1];
        return p;
    }

    private Object createTestObject() {
        return new Object();
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
        Pilha pilha0 = createPilhaWithTopoOne();
        pilha0.desempilha();
        assertEquals("Expected stack size to be 0 after desempilha", 0, pilha0.tamanho());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Pilha pilha0 = createFullPilha();
        try {
            pilha0.empilha(pilha0);
            fail("Expected exception when empilha is called on full stack");
        } catch (Exception e) {
            assertEquals("Erro: A pilha esta cheia", e.getMessage());
            verifyException("ds.Pilha", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        Object object0 = createTestObject();
        pilha0.empilha(object0);
        assertEquals("Expected topo to be 1 after empilha", 1, pilha0.topo);
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Pilha pilha0 = createEmptyPilha();
        int int0 = pilha0.tamanho();
        assertEquals("Expected tamanho to be 0 for new stack", 0, int0);
    }
}