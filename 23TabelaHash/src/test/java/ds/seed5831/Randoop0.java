package ds.seed5831;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("hi!");
        tabelaHash4.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = obj24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass22 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass6 = tabelaHash5.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass6);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("hi!");
        tabelaHash4.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        tabelaHash14.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass22 = tabelaHash14.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        tabelaHash17.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object[] objArray32 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj38 = tabelaHash29.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray20 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray20);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("");
        java.lang.Object obj17 = tabelaHash13.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        java.lang.Object[] objArray23 = tabelaHash17.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        tabelaHash8.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass30 = tabelaHash17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0d);
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass15 = tabelaHash8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("hi!");
        tabelaHash4.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass10);
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
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        java.lang.Object[] objArray17 = tabelaHash12.recuperaItens();
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("");
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        java.lang.Object[] objArray29 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash34.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass47 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        java.lang.Object obj30 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        java.lang.Object obj34 = tabelaHash20.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("hi!");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.retira("hi!");
        tabelaHash4.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray34 = tabelaHash20.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass37 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = null;
        tabelaHash6.insere("hi!", obj14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray33 = tabelaHash30.recuperaItens();
        tabelaHash30.retira("");
        tabelaHash24.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray37 = tabelaHash24.recuperaItens();
        tabelaHash8.insere("hi!", (java.lang.Object) objArray37);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        java.lang.Object[] objArray23 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray23);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        tabelaHash0.insere("", (java.lang.Object) 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        java.lang.Object obj34 = tabelaHash27.pesquisa("");
        tabelaHash27.retira("hi!");
        java.lang.Object obj38 = tabelaHash27.pesquisa("");
        java.lang.Object obj40 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 1);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        java.lang.Object[] objArray27 = tabelaHash15.recuperaItens();
        java.lang.Object obj29 = tabelaHash15.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass6 = tabelaHash5.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class ds.TabelaHash");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("hi!");
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash31.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass41 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        java.lang.Object[] objArray27 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object[] objArray24 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        java.lang.Object[] objArray27 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = objArray27.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.retira("");
        java.lang.Object[] objArray23 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
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
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object[] objArray32 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object obj37 = tabelaHash23.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash23.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        tabelaHash0.retira("");
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) '4');
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object[] objArray32 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object obj37 = tabelaHash23.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash23.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Object[] objArray40 = tabelaHash23.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        tabelaHash0.retira("");
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.retira("hi!");
        tabelaHash22.retira("");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.retira("hi!");
        java.lang.Object obj33 = tabelaHash22.pesquisa("");
        tabelaHash22.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object obj13 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.retira("");
        java.lang.Object obj24 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray28);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash24.imprime();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object[] objArray17 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object[] objArray23 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj28 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj30 = null;
        tabelaHash14.insere("", obj30);
        tabelaHash14.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj29 = null;
        tabelaHash0.insere("hi!", obj29);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass6 = tabelaHash5.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class ds.TabelaHash");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        java.lang.Object obj24 = tabelaHash8.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
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
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        java.lang.Object[] objArray29 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object[] objArray39 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("hi!");
        tabelaHash38.retira("");
        tabelaHash38.imprime();
        tabelaHash38.imprime();
        java.lang.Object[] objArray46 = tabelaHash38.recuperaItens();
        tabelaHash23.insere("", (java.lang.Object) objArray46);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.retira("");
        java.lang.Object[] objArray52 = tabelaHash49.recuperaItens();
        java.lang.Class<?> wildcardClass53 = objArray52.getClass();
        tabelaHash23.insere("", (java.lang.Object) wildcardClass53);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object[] objArray32 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object obj37 = tabelaHash23.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash23.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Object obj41 = tabelaHash23.pesquisa("hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1 + "'", obj15, 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray17);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj29 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("", obj29);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray34 = tabelaHash20.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj38 = tabelaHash9.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("");
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash15.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray26 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("hi!");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.retira("hi!");
        java.lang.Object[] objArray36 = tabelaHash33.recuperaItens();
        java.lang.Class<?> wildcardClass37 = tabelaHash33.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass37);
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash10.insere("", (java.lang.Object) 1);
        java.lang.Object obj25 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray26);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 1 + "'", obj25, 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("");
        java.lang.Class<?> wildcardClass29 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object obj16 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray21);
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object[] objArray14 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj19 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[a]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object[] objArray25 = tabelaHash22.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass28 = tabelaHash27.getClass();
        tabelaHash22.insere("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = tabelaHash22.pesquisa("hi!");
        tabelaHash12.insere("", obj31);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        java.lang.Object obj43 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash34.pesquisa("hi!");
        tabelaHash34.imprime();
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("hi!");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash18.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        java.lang.Object obj13 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray20 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        java.lang.Object obj34 = tabelaHash30.pesquisa("");
        java.lang.Object obj36 = tabelaHash30.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[class ds.TabelaHash]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        tabelaHash8.imprime();
        java.lang.Object[] objArray19 = tabelaHash8.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj16 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.retira("");
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray29 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        java.lang.Class<?> wildcardClass32 = tabelaHash18.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        tabelaHash20.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object[] objArray29 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        java.lang.Object[] objArray35 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray40);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        java.lang.Object[] objArray23 = tabelaHash8.recuperaItens();
        java.lang.Object obj25 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass18 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        java.lang.Object obj13 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0f);
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 10.0f + "'", obj20, 10.0f);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray32 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray32);
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray33 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray34);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        java.lang.Object obj13 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("hi!");
        java.lang.Object obj17 = tabelaHash6.pesquisa("");
        java.lang.Object obj19 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash6.recuperaItens();
        java.lang.Object obj22 = tabelaHash6.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash6.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        tabelaHash13.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash6.insere("hi!", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.imprime();
        tabelaHash26.retira("");
        java.lang.Object[] objArray34 = tabelaHash26.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray34);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj8);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object[] objArray17 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("");
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash23.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) objArray28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.retira("");
        java.lang.Object[] objArray23 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj28 = tabelaHash20.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
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
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        java.lang.Object obj16 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass6 = tabelaHash5.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("hi!");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("hi!");
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object obj43 = tabelaHash28.pesquisa("hi!");
        java.lang.Object[] objArray44 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash28.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray45);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray23);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("");
        java.lang.Object[] objArray29 = tabelaHash26.recuperaItens();
        java.lang.Class<?> wildcardClass30 = objArray29.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        java.lang.Object obj32 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("hi!");
        java.lang.Object obj30 = tabelaHash26.pesquisa("");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash26.retira("");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.retira("");
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        java.lang.Object[] objArray33 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        tabelaHash27.retira("");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj41 = tabelaHash27.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.retira("");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        tabelaHash4.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        tabelaHash22.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object[] objArray37 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("");
        tabelaHash28.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray42 = tabelaHash34.recuperaItens();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash8.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("");
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        tabelaHash23.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("hi!");
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash31.imprime();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash11.retira("hi!");
        java.lang.Object obj42 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        java.lang.Object obj29 = tabelaHash23.pesquisa("");
        tabelaHash23.insere("", (java.lang.Object) 1);
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.retira("hi!");
        java.lang.Object[] objArray41 = tabelaHash38.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash38.recuperaItens();
        tabelaHash38.imprime();
        java.lang.Object[] objArray44 = tabelaHash38.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash38);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("hi!");
        java.lang.Object obj20 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray21 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.retira("");
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass11 = tabelaHash10.getClass();
        tabelaHash5.insere("hi!", (java.lang.Object) wildcardClass11);
        tabelaHash0.insere("", (java.lang.Object) wildcardClass11);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        java.lang.Object obj34 = tabelaHash30.pesquisa("");
        java.lang.Object obj36 = tabelaHash30.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray33 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray34);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        java.lang.Object[] objArray25 = tabelaHash22.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        tabelaHash22.insere("", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray35 = tabelaHash22.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = null;
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        tabelaHash19.retira("");
        java.lang.Object[] objArray25 = tabelaHash19.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        java.lang.Object[] objArray20 = tabelaHash17.recuperaItens();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass23 = tabelaHash22.getClass();
        tabelaHash17.insere("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        java.lang.Class<?> wildcardClass32 = tabelaHash28.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0f);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object[] objArray16 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        java.lang.Object obj25 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        java.lang.Object[] objArray32 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.imprime();
        java.lang.Object[] objArray38 = tabelaHash35.recuperaItens();
        tabelaHash35.retira("");
        tabelaHash29.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj43 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj45 = null;
        tabelaHash29.insere("", obj45);
        java.lang.Object[] objArray47 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("", (java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass14 = tabelaHash6.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("hi!");
        java.lang.Object obj20 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray21 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.imprime();
        java.lang.Object[] objArray28 = tabelaHash25.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass31 = tabelaHash30.getClass();
        tabelaHash25.insere("hi!", (java.lang.Object) wildcardClass31);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray35 = tabelaHash25.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj22 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
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
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.retira("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("");
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object obj23 = tabelaHash13.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object[] objArray29 = tabelaHash26.recuperaItens();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.imprime();
        java.lang.Object[] objArray34 = tabelaHash31.recuperaItens();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass37 = tabelaHash36.getClass();
        tabelaHash31.insere("hi!", (java.lang.Object) wildcardClass37);
        tabelaHash26.insere("", (java.lang.Object) wildcardClass37);
        java.lang.Object obj41 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray42 = tabelaHash26.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        java.lang.Object[] objArray45 = tabelaHash44.recuperaItens();
        tabelaHash44.imprime();
        java.lang.Object[] objArray47 = tabelaHash44.recuperaItens();
        tabelaHash44.retira("");
        java.lang.Object[] objArray50 = tabelaHash44.recuperaItens();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
    }
}

