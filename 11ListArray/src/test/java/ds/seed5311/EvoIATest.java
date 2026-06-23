package ds.seed5311;

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

    private Lista createListaWithOneElement(String element) {
        Lista lista = new Lista();
        lista.insere(element);
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }

    private Lista createFullLista() {
        Lista lista = new Lista();
        lista.ultimo = 2845; // simulate full list
        return lista;
    }

    private Lista createListaWithObject(Object obj) {
        Lista lista = new Lista();
        lista.insere(obj);
        return lista;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista0 = createListaWithOneElement(""); // boundary test with empty string
        lista0.imprime();
        assertEquals("List last index should be 1 after insertion", 1, lista0.ultimo);
        assertFalse("List should not be empty after insertion", lista0.vazia());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista0 = createEmptyLista();
        boolean boolean0 = lista0.vazia();
        assertEquals("Initial position should be -1", -1, lista0.pos);
        assertEquals("Last index should be 0 on empty list", 0, lista0.ultimo);
        assertTrue("List should be empty initially", boolean0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista0 = createFullLista();
        Object object0 = new Object();
        try {
            lista0.insere(object0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            verifyException("ds.Lista", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Lista lista0 = createListaWithObject(null); // boundary test inserting null
        boolean boolean0 = lista0.vazia();
        assertEquals("List last index should be 1 after insertion", 1, lista0.ultimo);
        assertFalse("List should not be empty after insertion", boolean0);
    }
}