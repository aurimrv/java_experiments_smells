package ds.seed9006;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Object createTestObject() {
        return new Object();
    }

    private Lista createEmptyList() {
        return new Lista();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista0 = createEmptyList();
        Object object0 = createTestObject();
        lista0.insere(object0);
        lista0.imprime();
        assertFalse("List should not be empty after insertion", lista0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista0 = createEmptyList();
        boolean boolean0 = lista0.vazia();
        assertTrue("List should be empty when newly created", boolean0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista0 = createEmptyList();
        Object object0 = createTestObject();
        lista0.insere(object0);
        boolean boolean0 = lista0.vazia();
        assertFalse("List should not be empty after insertion", boolean0);
    }
}