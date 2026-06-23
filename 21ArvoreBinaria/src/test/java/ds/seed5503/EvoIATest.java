package ds.seed5503;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends ArvoreBinaria_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2214));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: expect exception on testa()
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2470));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: call testa()
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-1));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: expect exception on testa()
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2470));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: call testa()
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-611));
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.retira(meuItem0);
        assertEquals(4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-611));
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(0);
        arvoreBinaria0.retira(meuItem1);
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2079));
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem((-3478));
        arvoreBinaria0.retira(meuItem1);
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2470));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: remove and assert
        arvoreBinaria0.retira(meuItem0);
        assertFalse(meuItem0.equals((Object) new MeuItem((-1502))));
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2165));
        arvoreBinaria0.insere(meuItem0);
        // Act & Assert: remove and assert
        arvoreBinaria0.retira(meuItem0);
        assertFalse(meuItem0.equals((Object) new MeuItem((-611))));
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2165));
        arvoreBinaria0.insere(meuItem0);
        assertEquals(4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-2165));
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem((-611));
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-1));
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem((-2165));
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem((-611));
        arvoreBinaria0.insere(meuItem0);
        Item item0 = arvoreBinaria0.pesquisa(meuItem0);
        assertSame(meuItem0, item0);
    }
}