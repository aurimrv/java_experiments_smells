package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Lista createListaWithOneElement(String element) throws Exception {
        Lista lista = new Lista();
        lista.insere(element);
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }

    private Lista createFullLista() {
        Lista lista = new Lista();
        lista.ultimo = 1698;
        return lista;
    }

    private Lista createListaWithObject(Object obj)throws Exception {
        Lista lista = new Lista();
        lista.insere(obj);
        return lista;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista0 = createListaWithOneElement("ds.Lista");
        lista0.imprime();
        assertEquals("Expected last index to be 1 after insertion", 1, lista0.ultimo);
        // Additional assertions could verify list contents or size if accessible.
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista0 = createEmptyLista();
        boolean boolean0 = lista0.vazia();
        assertEquals("Expected last index to be 0 for empty list", 0, lista0.ultimo);
        assertTrue("List should be empty", boolean0);
        assertEquals("Position should be -1 initially", -1, lista0.pos);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista0 = createFullLista();
        Object object0 = new Object();
        try {
            lista0.insere(object0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Erro: A lista esta cheia
            //
            verifyException("ds.Lista", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Object object0 = new Object();
        Lista lista0 = createListaWithObject(object0);
        boolean boolean0 = lista0.vazia();
        assertEquals("Expected last index to be 1 after insertion", 1, lista0.ultimo);
        assertFalse("List should not be empty after insertion", boolean0);
        // Additional assertions could verify list contents.
    }
}