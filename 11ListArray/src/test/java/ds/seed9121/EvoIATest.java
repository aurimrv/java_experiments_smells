package ds.seed9121;

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

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Lista lista = new Lista();
        Object obj = new Object();
        lista.insere(obj);
        lista.imprime();
        assertEquals("The last index should be 1 after one insertion", 1, lista.ultimo);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Lista lista = new Lista();
        boolean isEmpty = lista.vazia();
        assertEquals("The first index should be 0 on new list", 0, lista.primeiro);
        assertTrue("List should be empty initially", isEmpty);
        assertEquals("Position should be -1 on new list", -1, lista.pos);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Lista lista = new Lista();
        Object obj = new Object();
        lista.insere(obj);
        boolean isEmpty = lista.vazia();
        assertEquals("The last index should be 1 after insertion", 1, lista.ultimo);
        assertFalse("List should not be empty after insertion", isEmpty);
    }


}