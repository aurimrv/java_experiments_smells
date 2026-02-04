package ds.seed9006;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test001");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 1);
        tabelaHash16.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass28 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass30 = tabelaHash8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = null;
        tabelaHash0.insere("hi!", obj4);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Class<?> wildcardClass43 = tabelaHash35.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash8.recuperaItens();
        java.lang.Class<?> wildcardClass24 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Class<?> wildcardClass22 = tabelaHash8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        java.lang.Class<?> wildcardClass26 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj21 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(obj37);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object[] objArray18 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray18);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass25 = tabelaHash9.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj18);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray18);
        java.lang.Object obj21 = null;
        tabelaHash0.insere("", obj21);
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray35 = tabelaHash30.recuperaItens();
        tabelaHash30.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.insere("", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass12 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        tabelaHash4.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj30 = null;
        tabelaHash0.insere("hi!", obj30);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.imprime();
        java.lang.Object obj37 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        java.lang.Object[] objArray42 = tabelaHash33.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.insere("", (java.lang.Object) 1);
        tabelaHash44.imprime();
        tabelaHash44.retira("hi!");
        java.lang.Object obj53 = tabelaHash44.pesquisa("hi!");
        java.lang.Object[] objArray54 = tabelaHash44.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash44.recuperaItens();
        tabelaHash33.insere("", (java.lang.Object) objArray55);
        tabelaHash0.insere("", (java.lang.Object) objArray55);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1]");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 1);
        tabelaHash16.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass28 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.insere("", (java.lang.Object) 1);
        tabelaHash4.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj13 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash4.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Class<?> wildcardClass22 = tabelaHash8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) 0.0d);
        tabelaHash14.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        tabelaHash0.retira("");
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = obj22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object obj24 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object[] objArray34 = tabelaHash26.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object[] objArray36 = tabelaHash26.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        java.lang.Object obj32 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash28.retira("");
        java.lang.Object[] objArray38 = tabelaHash28.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        java.lang.Object obj30 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) '#');
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1 + "'", obj30, 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.retira("");
        tabelaHash18.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 1);
        tabelaHash32.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj41 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash18.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj21 = tabelaHash8.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.insere("", (java.lang.Object) 1);
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray22);
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray28);
        java.lang.Object obj32 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray18);
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash35.retira("");
        tabelaHash35.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash35.pesquisa("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object[] objArray54 = tabelaHash53.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash53.recuperaItens();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash53);
        java.lang.Object[] objArray57 = tabelaHash35.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1 + "'", obj48, 1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj18);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("");
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 1);
        tabelaHash31.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray43 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray44 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash31.recuperaItens();
        java.lang.Object obj47 = tabelaHash31.pesquisa("");
        tabelaHash0.insere("", obj47);
        java.lang.Class<?> wildcardClass49 = obj47.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1 + "'", obj47, 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        java.lang.Object obj42 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.retira("");
        java.lang.Object obj29 = tabelaHash19.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash11.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "" + "'", obj35, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj5 = null;
        tabelaHash0.insere("", obj5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj11 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.retira("");
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        tabelaHash7.insere("", obj25);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[null]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj23 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash9.recuperaItens();
        java.lang.Object obj26 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        tabelaHash27.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj37 = tabelaHash27.pesquisa("");
        java.lang.Object obj39 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "hi!" + "'", obj37, "hi!");
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj18);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("");
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.insere("", (java.lang.Object) 1);
        tabelaHash31.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray43 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray44 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash31.recuperaItens();
        java.lang.Object obj47 = tabelaHash31.pesquisa("");
        tabelaHash0.insere("", obj47);
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 1 + "'", obj47, 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray43 = tabelaHash35.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object obj33 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.retira("hi!");
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray40 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0.0]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj36 = tabelaHash26.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray18);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        java.lang.Object obj37 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) objArray38);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray41 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        tabelaHash43.imprime();
        java.lang.Object obj47 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.retira("hi!");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object[] objArray52 = tabelaHash51.recuperaItens();
        tabelaHash51.imprime();
        java.lang.Object obj55 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.retira("hi!");
        tabelaHash51.insere("", (java.lang.Object) 0.0f);
        tabelaHash43.insere("", (java.lang.Object) 0.0f);
        tabelaHash43.imprime();
        tabelaHash43.retira("");
        tabelaHash43.retira("hi!");
        java.lang.Object obj68 = tabelaHash43.pesquisa("");
        java.lang.Object[] objArray69 = tabelaHash43.recuperaItens();
        java.lang.Class<?> wildcardClass70 = tabelaHash43.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash20.recuperaItens();
        java.lang.Object obj36 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.retira("");
        java.lang.Object obj42 = tabelaHash38.pesquisa("hi!");
        java.lang.Object obj44 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        java.lang.Object[] objArray46 = tabelaHash38.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash38);
        java.lang.Class<?> wildcardClass48 = tabelaHash20.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass48);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1 + "'", obj36, 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("");
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        tabelaHash12.insere("", obj30);
        tabelaHash12.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash12.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = obj37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj30 = null;
        tabelaHash0.insere("hi!", obj30);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash4.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray14);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 1);
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.retira("");
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("hi!");
        tabelaHash34.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash34.recuperaItens();
        tabelaHash30.insere("", (java.lang.Object) objArray44);
        tabelaHash0.insere("hi!", (java.lang.Object) objArray44);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[1]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        java.lang.Object obj27 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 1);
        tabelaHash16.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray28 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash16.recuperaItens();
        java.lang.Object obj32 = tabelaHash16.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.retira("");
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        java.lang.Object[] objArray42 = tabelaHash34.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray44 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray44);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj23 = null;
        tabelaHash9.insere("hi!", obj23);
        java.lang.Object obj26 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 1);
        tabelaHash24.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        java.lang.Object obj40 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        java.lang.Object obj46 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        java.lang.Object[] objArray50 = tabelaHash42.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object obj53 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Class<?> wildcardClass56 = tabelaHash24.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1]");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1 + "'", obj53, 1);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        java.lang.Object obj8 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("hi!");
        tabelaHash4.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray14 = tabelaHash4.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray14);
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[[0.0]]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass22 = objArray21.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object obj24 = null;
        tabelaHash8.insere("", obj24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 0.0f + "'", obj21, 0.0f);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.imprime();
        java.lang.Object[] objArray36 = tabelaHash33.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) objArray36);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 1);
        tabelaHash32.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj41 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object[] objArray44 = tabelaHash32.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash32.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash32.retira("hi!");
        java.lang.Object obj50 = tabelaHash32.pesquisa("");
        java.lang.Object[] objArray51 = tabelaHash32.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray51);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1 + "'", obj50, 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.retira("");
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        java.lang.Object[] objArray40 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash20.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash9.retira("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash9.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object obj24 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object[] objArray34 = tabelaHash26.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash26);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.imprime();
        java.lang.Object obj41 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.retira("hi!");
        tabelaHash37.retira("");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.retira("");
        java.lang.Object obj53 = tabelaHash49.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash49.pesquisa("hi!");
        tabelaHash37.insere("", obj55);
        tabelaHash37.retira("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash26.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        tabelaHash36.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray48 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash36.recuperaItens();
        java.lang.Object obj52 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.retira("");
        java.lang.Object obj58 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        java.lang.Object[] objArray62 = tabelaHash54.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Class<?> wildcardClass65 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 1);
        tabelaHash24.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        java.lang.Object obj40 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        java.lang.Object obj46 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        java.lang.Object[] objArray50 = tabelaHash42.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object obj53 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash0.retira("hi!");
        java.lang.Object obj59 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray60 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1]");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1 + "'", obj53, 1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "hi!" + "'", obj59, "hi!");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("");
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        java.lang.Object[] objArray32 = tabelaHash24.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.retira("");
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        java.lang.Object[] objArray40 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray43 = tabelaHash20.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[1]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        java.lang.Object obj42 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 1);
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.imprime();
        java.lang.Object obj35 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.retira("hi!");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object[] objArray40 = tabelaHash39.recuperaItens();
        tabelaHash39.imprime();
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("hi!");
        tabelaHash39.insere("", (java.lang.Object) 0.0f);
        tabelaHash31.insere("", (java.lang.Object) 0.0f);
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        java.lang.Class<?> wildcardClass53 = tabelaHash31.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass53);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 1);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash22.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        java.lang.Object obj36 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        tabelaHash32.retira("");
        java.lang.Object[] objArray41 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) 0.0d);
        tabelaHash32.imprime();
        java.lang.Object obj47 = tabelaHash32.pesquisa("");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object[] objArray54 = tabelaHash53.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash53.recuperaItens();
        tabelaHash53.retira("");
        java.lang.Object obj59 = tabelaHash53.pesquisa("hi!");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        tabelaHash61.insere("", (java.lang.Object) 1);
        tabelaHash61.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj70 = tabelaHash61.pesquisa("hi!");
        tabelaHash61.imprime();
        tabelaHash53.insere("", (java.lang.Object) tabelaHash61);
        java.lang.Object[] objArray73 = tabelaHash61.recuperaItens();
        java.lang.Object[] objArray74 = tabelaHash61.recuperaItens();
        tabelaHash49.insere("", (java.lang.Object) tabelaHash61);
        java.lang.Object[] objArray76 = tabelaHash49.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) objArray76);
        tabelaHash22.insere("hi!", (java.lang.Object) objArray76);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 0.0d + "'", obj47, 0.0d);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[1]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1]");
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) 1);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object obj26 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.retira("");
        tabelaHash22.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray34 = tabelaHash22.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj37 = tabelaHash10.pesquisa("");
        java.lang.Object obj39 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("", obj39);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 1 + "'", obj39, 1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 0.0d);
        tabelaHash6.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        java.lang.Object obj42 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object obj48 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray54 = tabelaHash44.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) objArray54);
        java.lang.Object obj57 = null;
        tabelaHash36.insere("", obj57);
        java.lang.Object[] objArray59 = tabelaHash36.recuperaItens();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("");
        tabelaHash15.retira("");
        tabelaHash15.insere("", (java.lang.Object) (short) 100);
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object obj29 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj29);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object[] objArray35 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[1, 1]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj18);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 1 + "'", obj14, 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.imprime();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        java.lang.Object[] objArray38 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 1);
        tabelaHash6.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj15 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        java.lang.Object obj24 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("");
        tabelaHash18.retira("hi!");
        tabelaHash18.imprime();
        java.lang.Object obj31 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray32 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj35 = tabelaHash18.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash26);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        java.lang.Object obj42 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object obj48 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray54 = tabelaHash44.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) objArray54);
        java.lang.Object obj57 = null;
        tabelaHash36.insere("", obj57);
        java.lang.Object[] objArray59 = tabelaHash36.recuperaItens();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash36.retira("hi!");
        tabelaHash36.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[0.0]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[1]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.insere("", (java.lang.Object) 1);
        tabelaHash26.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object[] objArray38 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray39 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash26.recuperaItens();
        java.lang.Object obj42 = tabelaHash26.pesquisa("");
        tabelaHash0.insere("", obj42);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[1]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        tabelaHash14.retira("hi!");
        tabelaHash14.imprime();
        java.lang.Object obj27 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.retira("");
        java.lang.Object obj29 = tabelaHash19.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash11.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray35 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.retira("");
        tabelaHash5.retira("");
        tabelaHash5.insere("", (java.lang.Object) (short) 100);
        tabelaHash5.retira("");
        tabelaHash5.imprime();
        tabelaHash5.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.imprime();
        java.lang.Object obj29 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("hi!");
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        java.lang.Object obj37 = tabelaHash25.pesquisa("");
        java.lang.Object obj39 = tabelaHash25.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray41 = tabelaHash9.recuperaItens();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 0.0f + "'", obj37, 0.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0f + "'", obj39, 0.0f);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        tabelaHash36.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray48 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash36.recuperaItens();
        java.lang.Object obj52 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.retira("");
        java.lang.Object obj58 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        java.lang.Object[] objArray62 = tabelaHash54.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object obj66 = tabelaHash36.pesquisa("");
        java.lang.Object[] objArray67 = tabelaHash36.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1 + "'", obj66, 1);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[1]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        java.lang.Object obj30 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash12.recuperaItens();
        java.lang.Object obj33 = tabelaHash12.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 1 + "'", obj30, 1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1]");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        java.lang.Object[] objArray17 = tabelaHash12.recuperaItens();
        java.lang.Object obj19 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.retira("");
        java.lang.Object obj31 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.imprime();
        java.lang.Object obj41 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.retira("hi!");
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        tabelaHash37.imprime();
        java.lang.Object obj49 = tabelaHash37.pesquisa("");
        java.lang.Object obj51 = tabelaHash37.pesquisa("");
        tabelaHash21.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 0.0f + "'", obj49, 0.0f);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 0.0f + "'", obj51, 0.0f);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.retira("");
        tabelaHash40.retira("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object[] objArray47 = tabelaHash46.recuperaItens();
        java.lang.Object[] objArray48 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("");
        java.lang.Object obj52 = tabelaHash46.pesquisa("hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.imprime();
        tabelaHash54.insere("", (java.lang.Object) 1);
        tabelaHash54.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj63 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        tabelaHash46.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash40.insere("", (java.lang.Object) tabelaHash46);
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.retira("");
        java.lang.Object obj72 = tabelaHash68.pesquisa("hi!");
        tabelaHash68.retira("");
        tabelaHash46.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash68.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash68);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[], 1]");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash35.retira("");
        tabelaHash35.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash35.pesquisa("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object[] objArray54 = tabelaHash53.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash53.recuperaItens();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash53);
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        java.lang.Object obj60 = tabelaHash53.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1 + "'", obj48, 1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray18);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 1);
        tabelaHash16.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj25 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash16.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("");
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        java.lang.Object[] objArray35 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object obj38 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash30.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object obj26 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object[] objArray35 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj39 = null;
        tabelaHash0.insere("", obj39);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash16.insere("", (java.lang.Object) 0.0f);
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        java.lang.Object[] objArray38 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0d + "'", obj14, 0.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object obj32 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("");
        tabelaHash28.retira("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object[] objArray41 = tabelaHash40.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash40.recuperaItens();
        tabelaHash40.retira("");
        java.lang.Object obj46 = tabelaHash40.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.insere("", (java.lang.Object) 1);
        tabelaHash48.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj57 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash40.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Object[] objArray60 = tabelaHash48.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[1]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        java.lang.Object obj32 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        java.lang.Object[] objArray40 = tabelaHash37.recuperaItens();
        tabelaHash37.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash37.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object obj17 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object obj24 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        java.lang.Object[] objArray34 = tabelaHash26.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj37 = tabelaHash8.pesquisa("");
        java.lang.Object obj39 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray40 = tabelaHash8.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 1 + "'", obj37, 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[1]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj23 = null;
        tabelaHash9.insere("hi!", obj23);
        tabelaHash9.retira("hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1 + "'", obj9, 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("hi!");
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        java.lang.Object[] objArray39 = tabelaHash18.recuperaItens();
        java.lang.Object obj41 = null;
        tabelaHash18.insere("", obj41);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0.0]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj11 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 0.0d);
        tabelaHash6.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) true);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[true]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        tabelaHash8.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) 1);
        tabelaHash10.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash22.retira("");
        java.lang.Object obj28 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.retira("hi!");
        tabelaHash30.retira("");
        tabelaHash30.retira("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object obj10 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 0.0d);
        tabelaHash6.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = obj14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        tabelaHash12.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash8.insere("hi!", obj23);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 1);
        tabelaHash24.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        java.lang.Object obj40 = tabelaHash24.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        java.lang.Object obj46 = tabelaHash42.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        java.lang.Object[] objArray50 = tabelaHash42.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object obj53 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass58 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1]");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 1 + "'", obj53, 1);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash35.retira("");
        tabelaHash35.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash35.pesquisa("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1 + "'", obj48, 1);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", obj18);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        java.lang.Object obj27 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash23.recuperaItens();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Object[] objArray32 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray32);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 1);
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        java.lang.Object[] objArray30 = tabelaHash22.recuperaItens();
        java.lang.Object obj32 = tabelaHash22.pesquisa("");
        java.lang.Object obj34 = tabelaHash22.pesquisa("");
        java.lang.Object obj36 = tabelaHash22.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1 + "'", obj32, 1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 1 + "'", obj34, 1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 1 + "'", obj36, 1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object obj26 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object[] objArray35 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Class<?> wildcardClass38 = tabelaHash14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, ]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.retira("");
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash39.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash39.recuperaItens();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Object[] objArray48 = tabelaHash39.recuperaItens();
        java.lang.Object obj50 = tabelaHash39.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash39.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 1);
        tabelaHash13.imprime();
        tabelaHash13.retira("hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("");
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray31 = tabelaHash24.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray33 = tabelaHash13.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.imprime();
        java.lang.Object obj40 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.retira("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object obj48 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.retira("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.retira("");
        java.lang.Object obj64 = tabelaHash60.pesquisa("hi!");
        java.lang.Object[] objArray65 = tabelaHash60.recuperaItens();
        tabelaHash60.retira("hi!");
        java.lang.Object[] objArray68 = tabelaHash60.recuperaItens();
        java.lang.Class<?> wildcardClass69 = tabelaHash60.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass69);
        java.lang.Object obj72 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) 1);
        tabelaHash10.imprime();
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.insere("", (java.lang.Object) 1);
        tabelaHash19.imprime();
        tabelaHash19.retira("hi!");
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        java.lang.Object[] objArray29 = tabelaHash19.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 1L);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("");
        java.lang.Object obj42 = tabelaHash36.pesquisa("hi!");
        java.lang.Object[] objArray43 = tabelaHash36.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash36.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        java.lang.Object obj37 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        java.lang.Object obj40 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray43 = tabelaHash24.recuperaItens();
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        java.lang.Object[] objArray48 = tabelaHash45.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash45.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) objArray49);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.retira("");
        java.lang.Object obj57 = tabelaHash53.pesquisa("hi!");
        java.lang.Object[] objArray58 = tabelaHash53.recuperaItens();
        tabelaHash53.imprime();
        tabelaHash53.retira("");
        java.lang.Object obj63 = tabelaHash53.pesquisa("");
        java.lang.Object obj65 = tabelaHash53.pesquisa("hi!");
        java.lang.Object[] objArray66 = tabelaHash53.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray66);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        java.lang.Object obj37 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) objArray38);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray41 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj45 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1]");
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 1);
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Class<?> wildcardClass29 = tabelaHash22.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash22.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object[] objArray40 = tabelaHash39.recuperaItens();
        tabelaHash39.imprime();
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        tabelaHash47.imprime();
        java.lang.Object obj51 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.retira("hi!");
        tabelaHash47.insere("", (java.lang.Object) 0.0f);
        tabelaHash39.insere("", (java.lang.Object) 0.0f);
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        java.lang.Object[] objArray60 = tabelaHash39.recuperaItens();
        java.lang.Object[] objArray61 = tabelaHash39.recuperaItens();
        tabelaHash39.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass65 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, ]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[0.0]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 1);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray28 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        tabelaHash36.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray48 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash36.recuperaItens();
        java.lang.Object obj52 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.retira("");
        java.lang.Object obj58 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        java.lang.Object[] objArray62 = tabelaHash54.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash36.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1 + "'", obj10, 1);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1 + "'", obj12, 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        java.lang.Object obj24 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 1 + "'", obj13, 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[1]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 1 + "'", obj28, 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1, 1]");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray28);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass37 = tabelaHash32.getClass();
        tabelaHash9.insere("", (java.lang.Object) wildcardClass37);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object[] objArray42 = tabelaHash41.recuperaItens();
        java.lang.Object[] objArray43 = tabelaHash41.recuperaItens();
        tabelaHash41.retira("");
        java.lang.Object obj47 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.insere("", (java.lang.Object) 1);
        tabelaHash49.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj58 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        tabelaHash41.insere("", (java.lang.Object) tabelaHash49);
        java.lang.Object[] objArray61 = tabelaHash49.recuperaItens();
        java.lang.Object[] objArray62 = tabelaHash49.recuperaItens();
        java.lang.Object[] objArray63 = tabelaHash49.recuperaItens();
        java.lang.Object obj65 = tabelaHash49.pesquisa("");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.retira("");
        java.lang.Object obj71 = tabelaHash67.pesquisa("hi!");
        java.lang.Object obj73 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.imprime();
        java.lang.Object[] objArray75 = tabelaHash67.recuperaItens();
        tabelaHash49.insere("", (java.lang.Object) tabelaHash67);
        java.lang.Object obj78 = tabelaHash49.pesquisa("");
        tabelaHash49.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash49);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[1]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[1]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[1]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 1 + "'", obj65, 1);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + 1 + "'", obj78, 1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        java.lang.Object obj32 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray36 = tabelaHash6.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.insere("", (java.lang.Object) 1);
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("");
        tabelaHash34.imprime();
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash26.insere("", (java.lang.Object) "");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object obj27 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        java.lang.Object obj38 = null;
        tabelaHash15.insere("", obj38);
        java.lang.Object[] objArray40 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass44 = tabelaHash15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        java.lang.Object obj22 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash11.pesquisa("");
        java.lang.Class<?> wildcardClass25 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object obj32 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("");
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray37 = tabelaHash28.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("");
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 1);
        tabelaHash42.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj51 = tabelaHash42.pesquisa("hi!");
        tabelaHash42.imprime();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray54 = tabelaHash42.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash42.recuperaItens();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash21.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[1]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[1]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100]");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("");
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        java.lang.Object obj38 = tabelaHash28.pesquisa("");
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        java.lang.Object obj42 = tabelaHash28.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object obj45 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 1 + "'", obj42, 1);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 1);
        tabelaHash6.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj15 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object obj20 = tabelaHash16.pesquisa("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 1);
        tabelaHash28.imprime();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.retira("");
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash39.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash39.recuperaItens();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Object[] objArray48 = tabelaHash39.recuperaItens();
        java.lang.Object obj50 = tabelaHash39.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass52 = tabelaHash39.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[1]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 1);
        tabelaHash21.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.imprime();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.insere("", (java.lang.Object) 1);
        tabelaHash40.imprime();
        tabelaHash40.retira("hi!");
        java.lang.Object[] objArray48 = tabelaHash40.recuperaItens();
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.retira("");
        java.lang.Object obj55 = tabelaHash51.pesquisa("hi!");
        java.lang.Object obj57 = tabelaHash51.pesquisa("hi!");
        java.lang.Object[] objArray58 = tabelaHash51.recuperaItens();
        tabelaHash40.insere("", (java.lang.Object) tabelaHash51);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[1, ]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[1, ]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object obj34 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.retira("hi!");
        tabelaHash30.retira("");
        java.lang.Object obj40 = tabelaHash30.pesquisa("hi!");
        java.lang.Object obj42 = tabelaHash30.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object obj48 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object[] objArray53 = tabelaHash52.recuperaItens();
        tabelaHash52.imprime();
        java.lang.Object obj56 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.retira("hi!");
        tabelaHash52.insere("", (java.lang.Object) 0.0f);
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        tabelaHash44.imprime();
        tabelaHash44.imprime();
        java.lang.Object[] objArray65 = tabelaHash44.recuperaItens();
        java.lang.Object[] objArray66 = tabelaHash44.recuperaItens();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash30.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[0.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[0.0]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.imprime();
        java.lang.Object obj29 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("hi!");
        tabelaHash25.retira("");
        java.lang.Object obj35 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.imprime();
        java.lang.Object obj41 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object[] objArray46 = tabelaHash45.recuperaItens();
        tabelaHash45.imprime();
        java.lang.Object obj49 = tabelaHash45.pesquisa("hi!");
        tabelaHash45.retira("hi!");
        tabelaHash45.insere("", (java.lang.Object) 0.0f);
        tabelaHash37.insere("", (java.lang.Object) 0.0f);
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object[] objArray61 = tabelaHash60.recuperaItens();
        tabelaHash60.imprime();
        java.lang.Object obj64 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.retira("hi!");
        tabelaHash60.retira("");
        tabelaHash60.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj73 = tabelaHash60.pesquisa("hi!");
        java.lang.Object obj75 = tabelaHash60.pesquisa("");
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash60);
        tabelaHash60.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 1 + "'", obj73, 1);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray28);
        java.lang.Object obj32 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 10);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("");
        tabelaHash13.retira("");
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object obj26 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.retira("");
        java.lang.Object obj32 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.imprime();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Class<?> wildcardClass42 = objArray41.getClass();
        tabelaHash22.insere("hi!", (java.lang.Object) objArray41);
        tabelaHash22.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 10 + "'", obj11, 10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object obj27 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        java.lang.Object obj38 = null;
        tabelaHash15.insere("", obj38);
        java.lang.Object[] objArray40 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0.0]");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0f + "'", obj29, 0.0f);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0, []]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj29 = tabelaHash15.pesquisa("");
        java.lang.Class<?> wildcardClass30 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass30);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0d + "'", obj29, 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object obj24 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 1);
        tabelaHash29.imprime();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash38.insere("", (java.lang.Object) 1);
        tabelaHash38.imprime();
        tabelaHash38.retira("hi!");
        java.lang.Object obj47 = tabelaHash38.pesquisa("hi!");
        java.lang.Object[] objArray48 = tabelaHash38.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash38.recuperaItens();
        tabelaHash38.insere("hi!", (java.lang.Object) 1L);
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash38);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        java.lang.Object[] objArray56 = tabelaHash55.recuperaItens();
        java.lang.Object[] objArray57 = tabelaHash55.recuperaItens();
        tabelaHash55.retira("");
        java.lang.Object obj61 = tabelaHash55.pesquisa("hi!");
        java.lang.Object[] objArray62 = tabelaHash55.recuperaItens();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash55);
        tabelaHash8.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 1 + "'", obj24, 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.insere("", (java.lang.Object) 1);
        tabelaHash20.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        java.lang.Object[] objArray46 = tabelaHash44.recuperaItens();
        tabelaHash44.retira("");
        java.lang.Object obj50 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.insere("", (java.lang.Object) 1);
        tabelaHash52.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj61 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        tabelaHash44.insere("", (java.lang.Object) tabelaHash52);
        java.lang.Object[] objArray64 = tabelaHash52.recuperaItens();
        java.lang.Object[] objArray65 = tabelaHash52.recuperaItens();
        java.lang.Object[] objArray66 = tabelaHash52.recuperaItens();
        java.lang.Object obj68 = tabelaHash52.pesquisa("");
        tabelaHash52.imprime();
        tabelaHash52.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[1]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[1]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[1]");
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 1 + "'", obj68, 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object obj18 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object obj26 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        tabelaHash14.retira("");
        tabelaHash14.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray28);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.retira("");
        tabelaHash33.retira("");
        tabelaHash33.insere("", (java.lang.Object) (short) 100);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("");
        tabelaHash42.retira("");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object[] objArray49 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash48.recuperaItens();
        tabelaHash48.retira("");
        java.lang.Object obj54 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.insere("", (java.lang.Object) 1);
        tabelaHash56.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash56);
        tabelaHash42.insere("", (java.lang.Object) tabelaHash48);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.retira("");
        java.lang.Object obj74 = tabelaHash70.pesquisa("hi!");
        tabelaHash70.retira("");
        tabelaHash48.insere("", (java.lang.Object) tabelaHash70);
        tabelaHash33.insere("", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object obj13 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 1);
        tabelaHash15.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj24 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("hi!");
        java.lang.Object obj31 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1 + "'", obj31, 1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        java.lang.Object obj18 = tabelaHash8.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 0.0f + "'", obj29, 0.0f);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object obj17 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.imprime();
        java.lang.Object obj40 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.retira("hi!");
        tabelaHash36.retira("");
        tabelaHash36.retira("hi!");
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash28.imprime();
        java.lang.Object[] objArray49 = tabelaHash28.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object[] objArray53 = tabelaHash52.recuperaItens();
        tabelaHash52.imprime();
        java.lang.Object obj56 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.retira("hi!");
        tabelaHash52.insere("", (java.lang.Object) 0.0f);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object obj65 = tabelaHash63.pesquisa("");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        tabelaHash67.insere("", (java.lang.Object) 1);
        tabelaHash67.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj76 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.imprime();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash67);
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash67);
        tabelaHash67.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash67);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[hi!]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        java.lang.Object obj27 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("");
        tabelaHash34.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) "hi!");
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        tabelaHash47.imprime();
        java.lang.Object obj51 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.retira("hi!");
        tabelaHash47.retira("");
        tabelaHash47.retira("hi!");
        tabelaHash47.imprime();
        java.lang.Object obj60 = tabelaHash47.pesquisa("hi!");
        java.lang.Object[] objArray61 = tabelaHash47.recuperaItens();
        java.lang.Object obj63 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash47.pesquisa("hi!");
        java.lang.Object[] objArray66 = tabelaHash47.recuperaItens();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        java.lang.Object[] objArray71 = tabelaHash68.recuperaItens();
        java.lang.Object[] objArray72 = tabelaHash68.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) objArray72);
        tabelaHash23.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        java.lang.Object[] objArray78 = tabelaHash77.recuperaItens();
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        java.lang.Object[] objArray81 = tabelaHash80.recuperaItens();
        tabelaHash80.imprime();
        java.lang.Object obj84 = tabelaHash80.pesquisa("hi!");
        tabelaHash77.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj87 = tabelaHash77.pesquisa("");
        java.lang.Object[] objArray88 = tabelaHash77.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray88);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertEquals("'" + obj87 + "' != '" + "hi!" + "'", obj87, "hi!");
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[hi!]");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 1);
        tabelaHash8.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash27.imprime();
        java.lang.Object obj31 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        java.lang.Object obj37 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash27.pesquisa("");
        java.lang.Class<?> wildcardClass40 = tabelaHash27.getClass();
        tabelaHash8.insere("hi!", (java.lang.Object) wildcardClass40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[1]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[1]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) 1);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[1]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 1);
        tabelaHash32.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj41 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object[] objArray44 = tabelaHash32.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash32.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash32.retira("hi!");
        java.lang.Object obj50 = tabelaHash32.pesquisa("");
        java.lang.Object[] objArray51 = tabelaHash32.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray51);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[1]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1 + "'", obj50, 1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[1]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray28);
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("hi!");
        tabelaHash19.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.imprime();
        java.lang.Object obj40 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.retira("hi!");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object obj48 = tabelaHash44.pesquisa("hi!");
        tabelaHash44.retira("hi!");
        tabelaHash44.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.insere("", (java.lang.Object) 0.0f);
        tabelaHash36.retira("");
        java.lang.Object obj58 = tabelaHash36.pesquisa("");
        java.lang.Object[] objArray59 = tabelaHash36.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj62 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 1);
        tabelaHash12.insere("", (java.lang.Object) (short) 1);
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        java.lang.Object obj27 = tabelaHash23.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.insere("hi!", (java.lang.Object) 10);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj38 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.retira("");
        tabelaHash34.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) "hi!");
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        tabelaHash47.imprime();
        java.lang.Object obj51 = tabelaHash47.pesquisa("hi!");
        tabelaHash47.retira("hi!");
        tabelaHash47.retira("");
        tabelaHash47.retira("hi!");
        tabelaHash47.imprime();
        java.lang.Object obj60 = tabelaHash47.pesquisa("hi!");
        java.lang.Object[] objArray61 = tabelaHash47.recuperaItens();
        java.lang.Object obj63 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj65 = tabelaHash47.pesquisa("hi!");
        java.lang.Object[] objArray66 = tabelaHash47.recuperaItens();
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.imprime();
        tabelaHash68.imprime();
        java.lang.Object[] objArray71 = tabelaHash68.recuperaItens();
        java.lang.Object[] objArray72 = tabelaHash68.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) objArray72);
        tabelaHash23.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object[] objArray76 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[hi!]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("");
        java.lang.Object obj28 = tabelaHash24.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash24.pesquisa("hi!");
        tabelaHash12.insere("", obj30);
        tabelaHash12.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash12.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 0.0f + "'", obj39, 0.0f);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        java.lang.Object obj34 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 1);
        tabelaHash36.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.imprime();
        tabelaHash28.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray48 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash36.recuperaItens();
        java.lang.Object obj52 = tabelaHash36.pesquisa("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.retira("");
        java.lang.Object obj58 = tabelaHash54.pesquisa("hi!");
        java.lang.Object obj60 = tabelaHash54.pesquisa("hi!");
        tabelaHash54.imprime();
        java.lang.Object[] objArray62 = tabelaHash54.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash36);
        java.lang.Object obj66 = tabelaHash36.pesquisa("");
        tabelaHash36.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[1]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[1]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 1 + "'", obj52, 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 1 + "'", obj66, 1);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 0.0f + "'", obj26, 0.0f);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object obj39 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("hi!");
        tabelaHash35.retira("");
        tabelaHash35.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj48 = tabelaHash35.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash35.pesquisa("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        java.lang.Object obj56 = tabelaHash35.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 1 + "'", obj48, 1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj22 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 1 + "'", obj22, 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj19 = tabelaHash9.pesquisa("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        java.lang.Object[] objArray24 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.imprime();
        java.lang.Object obj7 = tabelaHash3.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray28);
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 1);
        tabelaHash14.insere("", (java.lang.Object) (short) 1);
        java.lang.Object obj23 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray27 = tabelaHash6.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray27);
    }
}
