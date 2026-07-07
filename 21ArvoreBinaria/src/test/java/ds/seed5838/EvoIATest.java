package ds.seed5838;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

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

    private MeuItem createMeuItem(int key) {
        return new MeuItem(key);
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // max int
        arvoreBinaria0.insere(meuItem1);
        Integer integer0 = Integer.valueOf(Integer.MIN_VALUE); // min int
        meuItem1.alteraChave(integer0);
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // max int
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        Object object0 = meuItem0.recuperaChave();
        MeuItem meuItem1 = createMeuItem(Integer.MIN_VALUE); // min int
        MeuItem meuItem2 = createMeuItem(-1); // just outside boundary
        arvoreBinaria0.insere(meuItem2);
        arvoreBinaria0.insere(meuItem1);
        meuItem1.alteraChave(object0);
        try {
            arvoreBinaria0.testa();
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            assertNotNull("Exception should not be null", e);
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.retira(meuItem0);
        assertEquals("Expected size 4 after removal", 4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        MeuItem meuItem1 = createMeuItem(Integer.MIN_VALUE); // min int
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.retira(meuItem0);
        assertEquals("Expected size 4 after removal", 4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(Integer.MIN_VALUE); // min int
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // max int
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.retira(meuItem0);
        assertNotSame("Expected different instances", meuItem0, meuItem1);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(Integer.MIN_VALUE); // min int
        MeuItem meuItem1 = createMeuItem(Integer.MIN_VALUE + 1);
        MeuItem meuItem2 = createMeuItem(0); // boundary zero
        MeuItem meuItem3 = createMeuItem(Integer.MIN_VALUE + 100);
        arvoreBinaria0.insere(meuItem3);
        arvoreBinaria0.insere(meuItem2);
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.retira(meuItem0);
        assertEquals("Expected size 4 after removal", 4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // max int
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.retira(meuItem0);
        assertNotSame("Expected different instances", meuItem0, meuItem1);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MIN_VALUE); // min int
        arvoreBinaria0.insere(meuItem1);
        arvoreBinaria0.testa();
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        arvoreBinaria0.insere(meuItem0);
        assertEquals("Expected size 4 after duplicate insert", 4, meuItem0.tamanho());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MAX_VALUE); // max int
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull("Expected null when searching for non-existent item", item0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        MeuItem meuItem1 = createMeuItem(Integer.MIN_VALUE); // min int
        Item item0 = arvoreBinaria0.pesquisa(meuItem1);
        assertNull("Expected null when searching for non-existent item", item0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        ArvoreBinaria arvoreBinaria0 = new ArvoreBinaria();
        MeuItem meuItem0 = createMeuItem(0); // boundary zero
        arvoreBinaria0.insere(meuItem0);
        Item item0 = arvoreBinaria0.pesquisa(meuItem0);
        assertSame("Expected the same item instance from search", meuItem0, item0);
    }
}