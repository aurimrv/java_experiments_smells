package ds.seed1448;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test501");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test502");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test503");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test504");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test505");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test506");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        java.lang.Object obj11 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash15.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!]");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test507");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test508");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object[] objArray22 = tabelaHash20.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) objArray22);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test509");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test510");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object obj26 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash20.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray47 = tabelaHash43.recuperaItens();
        java.lang.Object obj49 = tabelaHash43.pesquisa("");
        java.lang.Object obj51 = null;
        tabelaHash43.insere("", obj51);
        tabelaHash43.retira("");
        tabelaHash43.imprime();
        java.lang.Object obj57 = tabelaHash43.pesquisa("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object obj64 = tabelaHash59.pesquisa("");
        tabelaHash59.retira("hi!");
        java.lang.Object[] objArray67 = tabelaHash59.recuperaItens();
        tabelaHash43.insere("", (java.lang.Object) tabelaHash59);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0f + "'", obj49, 0.0f);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test511");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test512");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object obj24 = tabelaHash18.pesquisa("");
        java.lang.Object obj26 = null;
        tabelaHash18.insere("", obj26);
        java.lang.Object[] objArray28 = tabelaHash18.recuperaItens();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray34 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray34);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[[0.0, 1.0]]");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test513");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test514");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test515");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test516");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test517");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test518");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        java.lang.Object obj40 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 0.0f);
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.retira("");
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray63 = tabelaHash59.recuperaItens();
        java.lang.Object obj65 = tabelaHash59.pesquisa("");
        java.lang.Object obj67 = null;
        tabelaHash59.insere("", obj67);
        tabelaHash51.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray70 = tabelaHash51.recuperaItens();
        java.lang.Object obj72 = tabelaHash51.pesquisa("");
        java.lang.Object[] objArray73 = tabelaHash51.recuperaItens();
        java.lang.Class<?> wildcardClass74 = tabelaHash51.getClass();
        tabelaHash43.insere("", (java.lang.Object) wildcardClass74);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        java.lang.Class<?> wildcardClass77 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0f + "'", obj65, 0.0f);
        org.junit.Assert.assertNotNull(objArray70);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 1]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "" + "'", obj72, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test519");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test520");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) '4');
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test521");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test522");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object[] objArray28 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object[] objArray30 = tabelaHash13.recuperaItens();
        java.lang.Class<?> wildcardClass31 = objArray30.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test523");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        java.lang.Object obj27 = tabelaHash12.pesquisa("hi!");
        java.lang.Object[] objArray28 = tabelaHash12.recuperaItens();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test524");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray18);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test525");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test526");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        java.lang.Object obj24 = null;
        tabelaHash16.insere("", obj24);
        tabelaHash8.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray27 = tabelaHash8.recuperaItens();
        java.lang.Object obj29 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray30 = tabelaHash8.recuperaItens();
        java.lang.Class<?> wildcardClass31 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass31);
        java.lang.Object[] objArray33 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0f + "'", obj22, 0.0f);
        org.junit.Assert.assertNotNull(objArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test527");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test528");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test529");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test530");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Object obj29 = tabelaHash23.pesquisa("");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        java.lang.Object obj34 = tabelaHash23.pesquisa("");
        tabelaHash23.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass39 = objArray38.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0f + "'", obj29, 0.0f);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0f + "'", obj34, 0.0f);
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, ]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, ]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test531");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test532");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test533");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test534");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray48 = tabelaHash44.recuperaItens();
        java.lang.Object obj50 = tabelaHash44.pesquisa("");
        java.lang.Object obj52 = null;
        tabelaHash44.insere("", obj52);
        tabelaHash44.retira("");
        tabelaHash44.imprime();
        java.lang.Object obj58 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash44.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Class<?> wildcardClass62 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0f + "'", obj50, 0.0f);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test535");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object obj20 = null;
        tabelaHash12.insere("", obj20);
        java.lang.Object[] objArray22 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test536");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test537");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test538");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.retira("");
        tabelaHash5.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash5.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        java.lang.Object obj23 = null;
        tabelaHash15.insere("", obj23);
        java.lang.Object[] objArray25 = tabelaHash15.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash5.insere("hi!", obj33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object[] objArray38 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray39 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("hi!");
        java.lang.Object[] objArray42 = tabelaHash36.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray44 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Class<?> wildcardClass46 = tabelaHash5.getClass();
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test539");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[, 1]");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test540");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash8.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash20.retira("hi!");
        tabelaHash20.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) 0.0f);
        tabelaHash32.imprime();
        tabelaHash32.retira("");
        tabelaHash32.retira("hi!");
        java.lang.Object obj42 = tabelaHash32.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash8.insere("", (java.lang.Object) "");
        java.lang.Object obj46 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray52 = tabelaHash48.recuperaItens();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash48);
        java.lang.Object[] objArray54 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.retira("hi!");
        java.lang.Object[] objArray60 = tabelaHash56.recuperaItens();
        java.lang.Object[] objArray61 = tabelaHash56.recuperaItens();
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        tabelaHash8.insere("", obj63);
        java.lang.Object obj66 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + "" + "'", obj46, "");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[, ]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + "" + "'", obj66, "");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test541");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        java.lang.Object obj35 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash8.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        java.lang.Object[] objArray52 = tabelaHash50.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) objArray52);
        tabelaHash42.retira("");
        java.lang.Object[] objArray56 = tabelaHash42.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray56);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 0.0f);
        tabelaHash59.insere("", (java.lang.Object) 0);
        tabelaHash59.retira("hi!");
        java.lang.Object obj69 = null;
        tabelaHash59.insere("hi!", obj69);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1]");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test542");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test543");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test544");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test545");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "" + "'", obj23, "");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test546");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray37 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj42 = tabelaHash33.pesquisa("");
        java.lang.Object[] objArray43 = tabelaHash33.recuperaItens();
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        java.lang.Object obj47 = tabelaHash33.pesquisa("");
        java.lang.Object obj49 = tabelaHash33.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj56 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0f + "'", obj42, 0.0f);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0f + "'", obj45, 0.0f);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0f + "'", obj47, 0.0f);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test547");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test548");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test549");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test550");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test551");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj17 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.retira("hi!");
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) objArray35);
        tabelaHash9.retira("hi!");
        java.lang.Object obj40 = null;
        tabelaHash9.insere("hi!", obj40);
        java.lang.Object[] objArray42 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass44 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null, []]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test552");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj25 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test553");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj17 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.retira("hi!");
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash9.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) objArray35);
        tabelaHash9.retira("hi!");
        java.lang.Object obj40 = null;
        tabelaHash9.insere("hi!", obj40);
        java.lang.Object[] objArray42 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[], null]");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test554");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test555");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash9.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test556");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.imprime();
        tabelaHash36.retira("");
        tabelaHash36.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        tabelaHash48.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        java.lang.Object[] objArray58 = tabelaHash56.recuperaItens();
        tabelaHash48.insere("hi!", (java.lang.Object) objArray58);
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray65 = tabelaHash61.recuperaItens();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash61);
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash61);
        tabelaHash34.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj70 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[0.0]");
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test557");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test558");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0f + "'", obj13, 0.0f);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0f + "'", obj15, 0.0f);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test559");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        java.lang.Object obj40 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 0.0f);
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.retira("");
        tabelaHash51.imprime();
        tabelaHash51.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray63 = tabelaHash59.recuperaItens();
        java.lang.Object obj65 = tabelaHash59.pesquisa("");
        java.lang.Object obj67 = null;
        tabelaHash59.insere("", obj67);
        tabelaHash51.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray70 = tabelaHash51.recuperaItens();
        java.lang.Object obj72 = tabelaHash51.pesquisa("");
        java.lang.Object[] objArray73 = tabelaHash51.recuperaItens();
        java.lang.Class<?> wildcardClass74 = tabelaHash51.getClass();
        tabelaHash43.insere("", (java.lang.Object) wildcardClass74);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 0.0f + "'", obj65, 0.0f);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + "" + "'", obj72, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test560");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test561");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test562");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test563");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test564");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        java.lang.Object obj35 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash8.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash42.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        java.lang.Object[] objArray52 = tabelaHash50.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) objArray52);
        tabelaHash42.retira("");
        java.lang.Object[] objArray56 = tabelaHash42.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray56);
        java.lang.Class<?> wildcardClass58 = objArray56.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test565");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test566");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test567");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test568");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object obj24 = tabelaHash18.pesquisa("");
        java.lang.Object obj26 = null;
        tabelaHash18.insere("", obj26);
        java.lang.Object[] objArray28 = tabelaHash18.recuperaItens();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray34 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray34);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray41 = tabelaHash37.recuperaItens();
        java.lang.Object obj43 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash37.pesquisa("hi!");
        java.lang.Object[] objArray48 = tabelaHash37.recuperaItens();
        java.lang.Object obj50 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("", (java.lang.Object) 0.0f);
        tabelaHash52.imprime();
        tabelaHash52.retira("");
        tabelaHash52.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash37.retira("hi!");
        tabelaHash37.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0.0]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[0.0]");
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test569");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test570");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test571");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0f + "'", obj13, 0.0f);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test572");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test573");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj25 = tabelaHash12.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = obj25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test574");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        java.lang.Object obj35 = tabelaHash29.pesquisa("");
        java.lang.Object obj37 = null;
        tabelaHash29.insere("", obj37);
        tabelaHash21.insere("", (java.lang.Object) "");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        java.lang.Object obj44 = null;
        tabelaHash21.insere("", obj44);
        java.lang.Object[] objArray46 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray48 = tabelaHash21.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0f + "'", obj35, 0.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertNotNull(objArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[, 1]");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test575");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray48 = tabelaHash44.recuperaItens();
        java.lang.Object obj50 = tabelaHash44.pesquisa("");
        java.lang.Object obj52 = null;
        tabelaHash44.insere("", obj52);
        tabelaHash44.retira("");
        tabelaHash44.imprime();
        java.lang.Object obj58 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash44.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash44);
        java.lang.Object obj63 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        tabelaHash65.imprime();
        java.lang.Object obj70 = tabelaHash65.pesquisa("");
        tabelaHash65.retira("hi!");
        tabelaHash65.retira("");
        java.lang.Object[] objArray75 = tabelaHash65.recuperaItens();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash44.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0f + "'", obj50, 0.0f);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test576");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test577");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        tabelaHash23.retira("hi!");
        java.lang.Object obj33 = tabelaHash23.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj40 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray42 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test578");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object[] objArray35 = tabelaHash33.recuperaItens();
        tabelaHash25.insere("hi!", (java.lang.Object) objArray35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray42 = tabelaHash38.recuperaItens();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray50 = tabelaHash46.recuperaItens();
        java.lang.Object obj52 = tabelaHash46.pesquisa("");
        java.lang.Object obj54 = null;
        tabelaHash46.insere("", obj54);
        tabelaHash46.retira("");
        tabelaHash46.imprime();
        java.lang.Object obj60 = tabelaHash46.pesquisa("hi!");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray66 = tabelaHash62.recuperaItens();
        tabelaHash62.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj71 = tabelaHash62.pesquisa("");
        tabelaHash46.insere("hi!", (java.lang.Object) "");
        tabelaHash46.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash46);
        java.lang.Object obj76 = tabelaHash46.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash46);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 0.0f + "'", obj52, 0.0f);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj71 + "' != '" + 0.0f + "'", obj71, 0.0f);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "" + "'", obj76, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test579");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test580");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 10L + "'", obj32, 10L);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test581");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test582");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test583");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash24.recuperaItens();
        java.lang.Object obj36 = tabelaHash24.pesquisa("");
        java.lang.Object obj38 = tabelaHash24.pesquisa("");
        java.lang.Object obj40 = tabelaHash24.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj43 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        java.lang.Object obj50 = tabelaHash45.pesquisa("");
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash45.retira("");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("", (java.lang.Object) 0.0f);
        tabelaHash56.imprime();
        tabelaHash56.retira("");
        tabelaHash56.retira("hi!");
        tabelaHash56.retira("");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("", (java.lang.Object) 0.0f);
        tabelaHash68.imprime();
        tabelaHash68.retira("");
        tabelaHash68.retira("hi!");
        java.lang.Object obj78 = tabelaHash68.pesquisa("");
        tabelaHash56.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash56.retira("hi!");
        tabelaHash56.retira("hi!");
        java.lang.Object obj85 = tabelaHash56.pesquisa("");
        tabelaHash45.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash56);
        java.lang.Object[] objArray88 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Class<?> wildcardClass90 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 0.0f + "'", obj33, 0.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 0.0f + "'", obj36, 0.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0f + "'", obj38, 0.0f);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test584");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test585");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test586");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 0 + "'", obj14, (short) 0);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test587");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test588");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray32 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.retira("");
        java.lang.Object[] objArray39 = tabelaHash35.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Class<?> wildcardClass41 = tabelaHash21.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test589");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test590");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        tabelaHash26.retira("hi!");
        java.lang.Object obj36 = tabelaHash26.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash14.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj41 = tabelaHash14.pesquisa("");
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test591");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        tabelaHash23.retira("hi!");
        java.lang.Object obj33 = tabelaHash23.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj45 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test592");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass27 = tabelaHash23.getClass();
        tabelaHash15.insere("", (java.lang.Object) wildcardClass27);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        java.lang.Object[] objArray33 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash31.recuperaItens();
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        java.lang.Object obj39 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        java.lang.Object obj42 = tabelaHash31.pesquisa("hi!");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0f + "'", obj13, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test593");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test594");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        tabelaHash26.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj35 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray36 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object[] objArray39 = tabelaHash26.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray44 = tabelaHash0.recuperaItens();
        java.lang.Object obj46 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0f + "'", obj35, 0.0f);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 1 + "'", obj46, 1);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test595");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test596");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        java.lang.Object obj33 = null;
        tabelaHash25.insere("", obj33);
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        java.lang.Object obj39 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        tabelaHash41.retira("hi!");
        java.lang.Object[] objArray49 = tabelaHash41.recuperaItens();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash41.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash41);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0f + "'", obj31, 0.0f);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test597");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test598");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.insere("hi!", (java.lang.Object) "");
        tabelaHash25.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test599");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass32 = obj31.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test600");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test601");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test602");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray23);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test603");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray19);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test604");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test605");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test606");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        java.lang.Object[] objArray33 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 0.0f);
        tabelaHash35.imprime();
        tabelaHash35.imprime();
        java.lang.Object obj42 = tabelaHash35.pesquisa("");
        tabelaHash35.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 0.0f + "'", obj42, 0.0f);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test607");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test608");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test609");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray14);
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0, []]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test610");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test611");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test612");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test613");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test614");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test615");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test616");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test617");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test618");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash5.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash5.recuperaItens();
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test619");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.insere("hi!", (java.lang.Object) "");
        tabelaHash25.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test620");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test621");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test622");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.imprime();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test623");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) 1.0d);
        tabelaHash13.retira("");
        java.lang.Object[] objArray24 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test624");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test625");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj27 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test626");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test627");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test628");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test629");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.insere("", (java.lang.Object) 1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test630");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test631");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test632");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 100);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test633");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash15.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.retira("");
        tabelaHash27.imprime();
        tabelaHash27.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object[] objArray37 = tabelaHash35.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) objArray37);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash27.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object obj48 = tabelaHash15.pesquisa("");
        java.lang.Class<?> wildcardClass49 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray51 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10]");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test634");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test635");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test636");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        java.lang.Object obj32 = null;
        tabelaHash24.insere("", obj32);
        tabelaHash16.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray35 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 1]");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test637");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test638");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test639");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.imprime();
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test640");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test641");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test642");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test643");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test644");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        java.lang.Object obj37 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test645");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a]");
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test646");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object obj26 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash20.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Class<?> wildcardClass42 = tabelaHash20.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test647");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test648");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test649");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) 0.0f);
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        tabelaHash22.retira("hi!");
        tabelaHash22.retira("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 0.0f);
        tabelaHash34.imprime();
        tabelaHash34.retira("");
        tabelaHash34.retira("hi!");
        java.lang.Object obj44 = tabelaHash34.pesquisa("");
        tabelaHash22.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash10.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray47 = tabelaHash10.recuperaItens();
        java.lang.Object obj49 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.imprime();
        java.lang.Object[] objArray53 = tabelaHash51.recuperaItens();
        tabelaHash51.imprime();
        tabelaHash51.retira("hi!");
        tabelaHash51.retira("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray60 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray60);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[, ]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[, ]");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test650");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash13.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0f + "'", obj23, 0.0f);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0.0]");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test651");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test652");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test653");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash29.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test654");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        tabelaHash26.retira("hi!");
        tabelaHash26.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) 0.0f);
        tabelaHash38.imprime();
        tabelaHash38.retira("");
        tabelaHash38.retira("hi!");
        java.lang.Object obj48 = tabelaHash38.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash38);
        tabelaHash14.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray51 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Class<?> wildcardClass54 = tabelaHash14.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass54);
        java.lang.Object obj57 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass58 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 0.0f + "'", obj57, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test655");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test656");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test657");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj46 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test658");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test659");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test660");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        java.lang.Object obj32 = null;
        tabelaHash24.insere("", obj32);
        tabelaHash16.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray35 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray37 = tabelaHash16.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object[] objArray41 = tabelaHash39.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash39.recuperaItens();
        tabelaHash39.imprime();
        java.lang.Object obj45 = null;
        tabelaHash39.insere("", obj45);
        tabelaHash16.insere("hi!", obj45);
        tabelaHash16.imprime();
        java.lang.Object obj50 = null;
        tabelaHash16.insere("hi!", obj50);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test661");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj29 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray30 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray38 = tabelaHash34.recuperaItens();
        java.lang.Object[] objArray39 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash11.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray44 = tabelaHash11.recuperaItens();
        java.lang.Class<?> wildcardClass45 = objArray44.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass45);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0f + "'", obj29, 0.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[0.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test662");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test663");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test664");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test665");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass24 = tabelaHash15.getClass();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test666");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test667");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("");
        java.lang.Object obj29 = null;
        tabelaHash21.insere("", obj29);
        java.lang.Object[] objArray31 = tabelaHash21.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        tabelaHash11.insere("hi!", obj39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        java.lang.Object[] objArray44 = tabelaHash42.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash42.recuperaItens();
        tabelaHash42.retira("hi!");
        java.lang.Object[] objArray48 = tabelaHash42.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray50 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray50);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test668");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object obj24 = tabelaHash18.pesquisa("");
        java.lang.Object obj26 = null;
        tabelaHash18.insere("", obj26);
        java.lang.Object[] objArray28 = tabelaHash18.recuperaItens();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray34 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray34);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray41 = tabelaHash37.recuperaItens();
        java.lang.Object obj43 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash37.pesquisa("hi!");
        java.lang.Object[] objArray48 = tabelaHash37.recuperaItens();
        java.lang.Object obj50 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("", (java.lang.Object) 0.0f);
        tabelaHash52.imprime();
        tabelaHash52.retira("");
        tabelaHash52.imprime();
        tabelaHash37.insere("", (java.lang.Object) tabelaHash52);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("", (java.lang.Object) 0.0f);
        tabelaHash63.imprime();
        tabelaHash63.retira("");
        tabelaHash63.imprime();
        tabelaHash63.retira("");
        tabelaHash63.retira("hi!");
        java.lang.Object[] objArray75 = tabelaHash63.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray75);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0.0]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[0.0]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test669");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test670");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1]");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test671");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test672");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Object[] objArray25 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray28 = tabelaHash8.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test673");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test674");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray14);
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test675");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test676");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("");
        java.lang.Object obj29 = null;
        tabelaHash21.insere("", obj29);
        java.lang.Object[] objArray31 = tabelaHash21.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj45 = tabelaHash36.pesquisa("");
        java.lang.Object[] objArray46 = tabelaHash36.recuperaItens();
        java.lang.Class<?> wildcardClass47 = objArray46.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass47);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1 + "'", obj19, 1);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 0.0f + "'", obj45, 0.0f);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test677");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test678");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj19 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        java.lang.Object obj24 = tabelaHash10.pesquisa("");
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0f + "'", obj22, 0.0f);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test679");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test680");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 0.0f);
        tabelaHash28.insere("", (java.lang.Object) 0);
        java.lang.Object[] objArray35 = tabelaHash28.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray35);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test681");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash19.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) objArray24);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.retira("");
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        tabelaHash31.retira("hi!");
        java.lang.Object obj40 = tabelaHash31.pesquisa("");
        java.lang.Object obj42 = tabelaHash31.pesquisa("");
        java.lang.Object obj44 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        tabelaHash46.imprime();
        java.lang.Object[] objArray50 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash46);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test682");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        tabelaHash26.insere("", (java.lang.Object) 'a');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test683");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test684");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("hi!");
        tabelaHash5.imprime();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test685");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test686");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = obj32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test687");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        java.lang.Object obj11 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash15.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass19);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test688");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test689");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test690");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = null;
        tabelaHash0.insere("", obj13);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test691");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test692");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test693");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test694");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test695");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test696");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass37 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0f + "'", obj32, 0.0f);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test697");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray7 = tabelaHash3.recuperaItens();
        java.lang.Object obj9 = tabelaHash3.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash3.insere("", obj11);
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object obj24 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass30 = tabelaHash26.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.retira("hi!");
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("", (java.lang.Object) 0.0f);
        tabelaHash48.imprime();
        tabelaHash48.retira("");
        tabelaHash48.retira("hi!");
        tabelaHash48.retira("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("", (java.lang.Object) 0.0f);
        tabelaHash60.imprime();
        tabelaHash60.retira("");
        tabelaHash60.retira("hi!");
        java.lang.Object obj70 = tabelaHash60.pesquisa("");
        tabelaHash48.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash36.insere("", (java.lang.Object) "");
        java.lang.Object obj74 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray80 = tabelaHash76.recuperaItens();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash76);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj84 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass85 = obj84.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "" + "'", obj74, "");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + "hi!" + "'", obj84, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test698");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object obj20 = null;
        tabelaHash12.insere("", obj20);
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        java.lang.Object obj26 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj39 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", obj39);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test699");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray15);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test700");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object[] objArray48 = tabelaHash46.recuperaItens();
        tabelaHash46.imprime();
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        java.lang.Object[] objArray52 = tabelaHash46.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray52);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test701");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = null;
        tabelaHash0.insere("", obj19);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test702");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.retira("");
        tabelaHash31.imprime();
        tabelaHash31.retira("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.retira("hi!");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray49 = tabelaHash45.recuperaItens();
        java.lang.Object obj51 = tabelaHash45.pesquisa("");
        java.lang.Object obj53 = null;
        tabelaHash45.insere("", obj53);
        tabelaHash45.retira("");
        tabelaHash45.imprime();
        java.lang.Object[] objArray58 = tabelaHash45.recuperaItens();
        tabelaHash45.imprime();
        tabelaHash45.retira("");
        tabelaHash31.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0f + "'", obj51, 0.0f);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test703");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test704");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj25 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("");
        java.lang.Object[] objArray39 = tabelaHash28.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash12.retira("");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test705");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray7 = tabelaHash3.recuperaItens();
        java.lang.Object obj9 = tabelaHash3.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash3.insere("", obj11);
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test706");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass24 = objArray23.getClass();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test707");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.imprime();
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        tabelaHash15.insere("hi!", obj33);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test708");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test709");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.insere("hi!", (java.lang.Object) "");
        tabelaHash25.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test710");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray17 = tabelaHash9.recuperaItens();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj27 = tabelaHash19.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash9.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray42 = tabelaHash9.recuperaItens();
        java.lang.Class<?> wildcardClass43 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test711");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        java.lang.Object obj32 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object[] objArray35 = tabelaHash26.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj38 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass40 = tabelaHash13.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0f + "'", obj32, 0.0f);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test712");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test713");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        java.lang.Object[] objArray29 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray29);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test714");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object obj18 = null;
        tabelaHash10.insere("", obj18);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash0.insere("hi!", obj28);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        java.lang.Object[] objArray33 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("hi!");
        java.lang.Object[] objArray37 = tabelaHash31.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray45 = tabelaHash41.recuperaItens();
        java.lang.Object[] objArray46 = tabelaHash41.recuperaItens();
        tabelaHash41.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj51 = tabelaHash41.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash41);
        java.lang.Object[] objArray53 = tabelaHash41.recuperaItens();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("", (java.lang.Object) 0.0f);
        tabelaHash55.imprime();
        tabelaHash55.retira("");
        java.lang.Object obj63 = tabelaHash55.pesquisa("");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.insere("", (java.lang.Object) 0.0f);
        tabelaHash65.imprime();
        tabelaHash65.retira("");
        java.lang.Object obj73 = tabelaHash65.pesquisa("");
        tabelaHash55.insere("hi!", (java.lang.Object) tabelaHash65);
        tabelaHash65.retira("hi!");
        java.lang.Object[] objArray77 = tabelaHash65.recuperaItens();
        tabelaHash41.insere("hi!", (java.lang.Object) objArray77);
        java.lang.Object obj80 = tabelaHash41.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0.0]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0.0]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 0.0f + "'", obj80, 0.0f);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test715");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test716");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash10.recuperaItens();
        java.lang.Object obj21 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test717");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test718");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj25 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) 0.0f);
        tabelaHash28.imprime();
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("");
        java.lang.Object[] objArray39 = tabelaHash28.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray46 = tabelaHash42.recuperaItens();
        java.lang.Object obj48 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj52 = tabelaHash42.pesquisa("hi!");
        java.lang.Object[] objArray53 = tabelaHash42.recuperaItens();
        tabelaHash42.retira("hi!");
        java.lang.Object[] objArray56 = tabelaHash42.recuperaItens();
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash42.retira("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash42.imprime();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0.0]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[0.0]");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test719");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test720");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test721");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test722");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test723");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        tabelaHash26.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj35 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray36 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object[] objArray39 = tabelaHash26.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray44 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.retira("hi!");
        java.lang.Object obj51 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray55 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash46);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0f + "'", obj35, 0.0f);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0]");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test724");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash13.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        java.lang.Object obj40 = tabelaHash25.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test725");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.imprime();
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        tabelaHash15.insere("hi!", obj33);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test726");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test727");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        tabelaHash28.imprime();
        java.lang.Object obj39 = tabelaHash28.pesquisa("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash10.retira("");
        java.lang.Object[] objArray43 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test728");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test729");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test730");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        java.lang.Object obj27 = tabelaHash21.pesquisa("");
        java.lang.Object obj29 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.retira("");
        tabelaHash8.insere("", (java.lang.Object) "");
        tabelaHash8.imprime();
        java.lang.Object obj38 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray42 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0f + "'", obj32, 0.0f);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 0.0f + "'", obj38, 0.0f);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0f + "'", obj41, 0.0f);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0.0, ]");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test731");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash20.retira("hi!");
        tabelaHash20.retira("hi!");
        java.lang.Object obj29 = tabelaHash20.pesquisa("");
        tabelaHash20.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray39 = tabelaHash35.recuperaItens();
        java.lang.Object obj41 = tabelaHash35.pesquisa("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass47 = tabelaHash43.getClass();
        tabelaHash35.insere("", (java.lang.Object) wildcardClass47);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash35);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0f + "'", obj41, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test732");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash26.recuperaItens();
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        tabelaHash0.insere("hi!", obj34);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray41 = tabelaHash37.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash37.recuperaItens();
        tabelaHash37.retira("hi!");
        java.lang.Object[] objArray45 = tabelaHash37.recuperaItens();
        java.lang.Object[] objArray46 = tabelaHash37.recuperaItens();
        java.lang.Object obj48 = tabelaHash37.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray54 = tabelaHash50.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash50.recuperaItens();
        tabelaHash50.retira("hi!");
        java.lang.Object[] objArray58 = tabelaHash50.recuperaItens();
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj65 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        java.lang.Object obj68 = tabelaHash60.pesquisa("");
        java.lang.Object[] objArray69 = tabelaHash60.recuperaItens();
        tabelaHash60.retira("hi!");
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        tabelaHash73.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray77 = tabelaHash73.recuperaItens();
        java.lang.Object[] objArray78 = tabelaHash73.recuperaItens();
        tabelaHash73.retira("hi!");
        tabelaHash60.insere("", (java.lang.Object) tabelaHash73);
        tabelaHash50.insere("", (java.lang.Object) "");
        tabelaHash50.retira("");
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash50);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 0.0f + "'", obj34, 0.0f);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[0.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0f + "'", obj48, 0.0f);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[0.0]");
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 0.0f + "'", obj68, 0.0f);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[0.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[0.0]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[0.0]");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test733");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray30 = tabelaHash12.recuperaItens();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test734");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test735");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = null;
        tabelaHash8.insere("", obj16);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test736");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash25.retira("hi!");
        java.lang.Object obj35 = tabelaHash25.pesquisa("");
        tabelaHash25.imprime();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object[] objArray42 = tabelaHash40.recuperaItens();
        java.lang.Object[] objArray43 = tabelaHash40.recuperaItens();
        tabelaHash40.imprime();
        tabelaHash40.retira("hi!");
        java.lang.Object obj48 = tabelaHash40.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray54 = tabelaHash50.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash50.recuperaItens();
        tabelaHash50.retira("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        tabelaHash59.imprime();
        java.lang.Object[] objArray63 = tabelaHash59.recuperaItens();
        java.lang.Object[] objArray64 = tabelaHash59.recuperaItens();
        tabelaHash50.insere("hi!", (java.lang.Object) objArray64);
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray67 = tabelaHash40.recuperaItens();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash40);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray74 = tabelaHash70.recuperaItens();
        java.lang.Object obj76 = tabelaHash70.pesquisa("");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass82 = tabelaHash78.getClass();
        tabelaHash70.insere("", (java.lang.Object) wildcardClass82);
        tabelaHash70.retira("hi!");
        java.lang.Object[] objArray86 = tabelaHash70.recuperaItens();
        tabelaHash70.imprime();
        tabelaHash40.insere("", (java.lang.Object) tabelaHash70);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + 0.0f + "'", obj76, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[0.0]");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test737");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("", obj11);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test738");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash17.recuperaItens();
        java.lang.Class<?> wildcardClass24 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass24);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test739");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test740");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) objArray23);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test741");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test742");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test743");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        java.lang.Object obj39 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        java.lang.Object[] objArray43 = tabelaHash41.recuperaItens();
        tabelaHash41.imprime();
        tabelaHash41.retira("hi!");
        tabelaHash41.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj51 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray52 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass53 = objArray52.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "" + "'", obj51, "");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test744");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test745");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        java.lang.Object obj35 = tabelaHash29.pesquisa("");
        java.lang.Object obj37 = null;
        tabelaHash29.insere("", obj37);
        tabelaHash21.insere("", (java.lang.Object) "");
        tabelaHash21.imprime();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        java.lang.Object obj44 = null;
        tabelaHash21.insere("", obj44);
        java.lang.Object[] objArray46 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 0.0f + "'", obj35, 0.0f);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "" + "'", obj42, "");
        org.junit.Assert.assertNotNull(objArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, 1]");
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test746");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj12 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test747");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash19.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) objArray24);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test748");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test749");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test750");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.retira("hi!");
        java.lang.Object obj24 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj27 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test751");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test752");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object[] objArray22 = tabelaHash20.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) objArray22);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray37 = tabelaHash33.recuperaItens();
        java.lang.Object obj39 = tabelaHash33.pesquisa("");
        java.lang.Object obj41 = null;
        tabelaHash33.insere("", obj41);
        tabelaHash33.retira("");
        tabelaHash33.imprime();
        java.lang.Object obj47 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray53 = tabelaHash49.recuperaItens();
        tabelaHash49.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj58 = tabelaHash49.pesquisa("");
        tabelaHash33.insere("hi!", (java.lang.Object) "");
        tabelaHash33.imprime();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash25.imprime();
        tabelaHash25.retira("hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0f + "'", obj39, 0.0f);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 0.0f + "'", obj58, 0.0f);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test753");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test754");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test755");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test756");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop1.test757");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass26 = tabelaHash16.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass26);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.retira("");
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray41 = tabelaHash37.recuperaItens();
        java.lang.Object obj43 = tabelaHash37.pesquisa("");
        java.lang.Object obj45 = null;
        tabelaHash37.insere("", obj45);
        tabelaHash29.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray48 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0.0f + "'", obj43, 0.0f);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[, 1]");
    }
}
