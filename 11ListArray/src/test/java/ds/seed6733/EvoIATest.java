package ds.seed6733;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.Lista;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class EvoIATest extends Lista_ESTest_scaffolding {

    private Lista createListaWithOneElement(Object element) {
        Lista lista = new Lista();
        lista.insere(element);
        return lista;
    }

    private Lista createEmptyLista() {
        return new Lista();
    }

    private void fillListaToCapacity(Lista lista, Object[] items) {
        for (Object item : items) {
            lista.insere(item);
        }
    }

    @Test(timeout = 4000)
    public void test0()  throws Throwable  {
        Lista lista0 = createListaWithOneElement(lista0);
        lista0.imprime();
        assertEquals("The last index should be 1 after insertion", 1, lista0.ultimo);
        assertFalse("List should not be empty after insertion", lista0.vazia());
        assertEquals(lista0, lista0.item[0]);
    }

    @Test(timeout = 4000)
    public void test1()  throws Throwable  {
        Lista lista0 = createEmptyLista();
        boolean boolean0 = lista0.vazia();
        assertEquals("First index should be 0", 0, lista0.primeiro);
        assertTrue("List should be empty", boolean0);
        assertEquals("Position should be -1", -1, lista0.pos);
    }



    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        Lista lista0 = createListaWithOneElement(lista0);
        boolean boolean0 = lista0.vazia();
        assertEquals("Last index should be 1 after insertion", 1, lista0.ultimo);
        assertFalse("List should not be empty after insertion", boolean0);
        assertEquals(lista0, lista0.item[0]);
    }
}