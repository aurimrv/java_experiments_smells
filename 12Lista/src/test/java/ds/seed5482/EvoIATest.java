package ds.seed5482;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Lista createListaWithOneObject() {
        Lista lista = new Lista();
        lista.insere(new Object());
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista0 = createListaWithOneObject();
        assertFalse("List should not be empty after insertion", lista0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista0 = createEmptyLista();
        assertTrue("List should be empty initially", lista0.vazia());
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista0 = createListaWithOneObject();
        assertFalse("List should not be empty after insertion", lista0.vazia());
    }
}