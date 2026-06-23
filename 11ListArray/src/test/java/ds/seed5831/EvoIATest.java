package ds.seed5831;

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

    private Lista createLista() {
        return new Lista();
    }

    private Lista createListaWithState(int primeiro, int ultimo) {
        Lista lista = new Lista();
        lista.primeiro = primeiro;
        lista.ultimo = ultimo;
        return lista;
    }

    private Lista createFullLista() {
        Lista lista = new Lista();
        lista.item = new Object[2];
        lista.ultimo = 179;
        return lista;
    }

    private Lista createListaWithOneItem() {
        Lista lista = new Lista();
        lista.insere(lista);
        return lista;
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista0 = createLista();
        lista0.primeiro = -1;
        try {
            lista0.imprime();
            fail("Expected ArrayIndexOutOfBoundsException when primeiro is -1");
        } catch (ArrayIndexOutOfBoundsException e) {
            assertEquals("-1", e.getMessage());
            verifyException("ds.Lista", e);
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista0 = createLista();
        lista0.imprime();
        assertEquals("pos should be -1", -1, lista0.pos);
        assertEquals("ultimo should be 0", 0, lista0.ultimo);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista0 = createListaWithState(-1, 0);
        assertTrue("Expected lista to be empty for primeiro=-1 and ultimo=0", lista0.vazia());

        lista0 = createListaWithState(179, 179);
        assertTrue("Expected lista to be empty for primeiro=179 and ultimo=179", lista0.vazia());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Lista lista0 = createFullLista();
        try {
            lista0.insere(lista0);
            fail("Expected Exception: Erro: A lista esta cheia");
        } catch (Exception e) {
            assertEquals("Erro: A lista esta cheia", e.getMessage());
            verifyException("ds.Lista", e);
        }
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Lista lista0 = createListaWithOneItem();
        assertEquals("ultimo should be 1 after insertion", 1, lista0.ultimo);
        assertFalse("vazia should return false after insertion", lista0.vazia());
    }
}