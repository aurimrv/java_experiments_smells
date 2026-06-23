package ds.seed1448;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.ArvoreBinaria;
import ds.Item;
import ds.MeuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true)
public class EvoIATest extends ArvoreBinaria_ESTest_scaffolding {

    private ArvoreBinaria createArvoreComItem(int chave) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        MeuItem item = new MeuItem(chave);
        arvore.insere(item);
        return arvore;
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(17);
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(508);
        arvoreBinaria0.retira(new MeuItem(508));
        assertEquals(4, new MeuItem(508).tamanho());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(508);
        arvoreBinaria0.retira(new MeuItem(508));
        assertEquals(4, new MeuItem(508).tamanho());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        MeuItem meuItem1 = new MeuItem(30);
        arvoreBinaria0.retira(meuItem1);
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(508);
        MeuItem meuItem1 = new MeuItem(-1887);
        arvoreBinaria0.retira(meuItem1);
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem3 = new MeuItem(-401);
        arvoreBinaria0.insere(meuItem3);
        arvoreBinaria0.retira(meuItem3);
        assertNotNull(meuItem3);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        arvoreBinaria0.insere(new MeuItem(4));
        assertEquals(4, new MeuItem(4).tamanho());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        MeuItem meuItem1 = new MeuItem(34);
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(4);
        MeuItem meuItem1 = new MeuItem(0);
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = createArvoreComItem(-340);
        MeuItem meuItem0 = new MeuItem(-340);
        Item item0 = arvoreBinaria0.pesquisa(meuItem0);
        assertSame(item0, meuItem0);
    }
}