package ds.seed5311;

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





    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(0);
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.retira(meuItem0);
        assertEquals(4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(-1692);
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(0);
        arvoreBinaria0.retira(meuItem1);
        assertEquals(4, meuItem1.tamanho());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(0);
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(-1);
        arvoreBinaria0.retira(meuItem1);
        assertFalse(meuItem1.equals((Object) meuItem0));
    }







    @Test(timeout = 4000)
    public void test08() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(-1724);
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(0);
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(0);
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = new MeuItem(-1);
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull(item0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = new MeuItem(0);
        arvoreBinaria0.insere(meuItem0);
        Item item0 = arvoreBinaria0.pesquisa(meuItem0);
        assertSame(meuItem0, item0);
    }


}