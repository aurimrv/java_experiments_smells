package ds.seed5503;

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
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        java.lang.Object obj7 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray9 = tabelaHash4.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash4.insere("hi!", (java.lang.Object) "");
        tabelaHash4.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash4.retira("");
        java.lang.Class<?> wildcardClass15 = tabelaHash4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash4.imprime();
        java.lang.Object[] objArray9 = tabelaHash4.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray18 = tabelaHash15.recuperaItens();
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass17 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object[] objArray11 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        tabelaHash15.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass24 = tabelaHash15.getClass();
        tabelaHash9.insere("", (java.lang.Object) wildcardClass24);
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNull(obj2);
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        java.lang.Object[] objArray20 = tabelaHash4.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj32 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.TabelaHash]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.retira("");
        java.lang.Class<?> wildcardClass26 = tabelaHash15.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass26);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[ ]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        tabelaHash24.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass33 = tabelaHash24.getClass();
        tabelaHash18.insere("", (java.lang.Object) wildcardClass33);
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass23 = tabelaHash14.getClass();
        tabelaHash8.insere("", (java.lang.Object) wildcardClass23);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.retira("hi!");
        java.lang.Object obj30 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray31);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[class ds.TabelaHash]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass16 = tabelaHash7.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        tabelaHash0.retira("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10L);
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass21 = tabelaHash17.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[ ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[ ]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        java.lang.Object[] objArray19 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass22 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass23 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass16 = tabelaHash15.getClass();
        tabelaHash11.insere("", (java.lang.Object) wildcardClass16);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10L);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 10L + "'", obj8, 10L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.TabelaHash]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[class ds.TabelaHash]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object obj15 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj18);
        java.lang.Object obj21 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        tabelaHash28.retira("");
        tabelaHash24.insere("", (java.lang.Object) "");
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Class<?> wildcardClass39 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.imprime();
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.TabelaHash]");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        tabelaHash14.insere("", (java.lang.Object) 100);
        tabelaHash14.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj27 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + ' ' + "'", obj27, ' ');
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100,  ]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = tabelaHash17.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash17.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        java.lang.Object[] objArray31 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray31);
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100,  ]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash22);
        java.lang.Object obj26 = tabelaHash14.pesquisa("");
        tabelaHash14.imprime();
        java.lang.Object obj29 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash14.recuperaItens();
        java.lang.Class<?> wildcardClass31 = tabelaHash14.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (-1.0f) + "'", obj26, (-1.0f));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object obj25 = tabelaHash22.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass31 = tabelaHash22.getClass();
        tabelaHash16.insere("", (java.lang.Object) wildcardClass31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass34 = tabelaHash16.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10L);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass16 = tabelaHash7.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray20 = tabelaHash17.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) objArray21);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash28);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        tabelaHash24.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash9.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("hi!");
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        tabelaHash21.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass30 = tabelaHash21.getClass();
        tabelaHash15.insere("", (java.lang.Object) wildcardClass30);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj34 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
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
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("");
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray35 = tabelaHash17.recuperaItens();
        java.lang.Class<?> wildcardClass36 = objArray35.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj15 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash9.imprime();
        java.lang.Object[] objArray21 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj25 = tabelaHash9.pesquisa("");
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0f) + "'", obj25, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray14);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = tabelaHash17.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash17.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray33 = tabelaHash17.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100,  ]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0d + "'", obj9, 0.0d);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[class ds.TabelaHash, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[class ds.TabelaHash, -1.0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        java.lang.Object[] objArray22 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("hi!");
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj29 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray30 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray30);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj17 = null;
        tabelaHash0.insere("hi!", obj17);
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("hi!");
        java.lang.Object[] objArray23 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object obj26 = tabelaHash20.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object obj30 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object obj34 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object[] objArray39 = tabelaHash38.recuperaItens();
        tabelaHash38.imprime();
        java.lang.Object[] objArray41 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("hi!");
        java.lang.Object obj45 = tabelaHash38.pesquisa("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.retira("");
        java.lang.Object[] objArray17 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj21 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", obj21);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj39 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object[] objArray42 = tabelaHash41.recuperaItens();
        tabelaHash33.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Object obj45 = tabelaHash33.pesquisa("");
        tabelaHash24.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0d + "'", obj7, 0.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        java.lang.Object[] objArray19 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj32 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object[] objArray38 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        java.lang.Object obj45 = tabelaHash42.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash42.recuperaItens();
        tabelaHash42.imprime();
        tabelaHash42.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass51 = tabelaHash42.getClass();
        tabelaHash36.insere("", (java.lang.Object) wildcardClass51);
        java.lang.Object obj54 = tabelaHash36.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "class ds.TabelaHash");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray35 = tabelaHash24.recuperaItens();
        java.lang.Class<?> wildcardClass36 = tabelaHash24.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash16.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray33 = tabelaHash30.recuperaItens();
        tabelaHash30.retira("hi!");
        java.lang.Object obj37 = tabelaHash30.pesquisa("hi!");
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray39 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash24.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj20 = null;
        tabelaHash0.insere("", obj20);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj13 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash7.imprime();
        java.lang.Object[] objArray19 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj15 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash9.imprime();
        java.lang.Object[] objArray21 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object obj25 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash9.recuperaItens();
        java.lang.Object obj28 = tabelaHash9.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (-1.0f) + "'", obj25, (-1.0f));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj21 = tabelaHash17.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.imprime();
        java.lang.Object[] objArray26 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        java.lang.Object obj33 = tabelaHash30.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        tabelaHash30.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass39 = tabelaHash30.getClass();
        tabelaHash24.insere("", (java.lang.Object) wildcardClass39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        java.lang.Object obj47 = tabelaHash42.pesquisa("");
        tabelaHash24.insere("hi!", obj47);
        tabelaHash11.insere("hi!", obj47);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash18.imprime();
        tabelaHash18.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object obj38 = tabelaHash36.pesquisa("hi!");
        tabelaHash36.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        tabelaHash43.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash43.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash36.insere("", (java.lang.Object) tabelaHash47);
        java.lang.Object obj53 = null;
        tabelaHash36.insere("", obj53);
        java.lang.Object[] objArray55 = tabelaHash36.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) objArray55);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        tabelaHash8.insere("", (java.lang.Object) 100);
        tabelaHash8.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj21 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object[] objArray28 = tabelaHash17.recuperaItens();
        java.lang.Class<?> wildcardClass29 = tabelaHash17.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash13.imprime();
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray26);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj15 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash9.imprime();
        java.lang.Object[] objArray21 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.retira("");
        tabelaHash5.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Object obj30 = tabelaHash14.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.retira("hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass29 = tabelaHash18.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100 + "'", obj18, 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1.0]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.retira("");
        tabelaHash22.retira("");
        tabelaHash18.insere("", (java.lang.Object) "");
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 100);
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj45 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj52 = tabelaHash32.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100,  ]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 100 + "'", obj52, 100);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj21 = tabelaHash17.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray23 = tabelaHash17.recuperaItens();
        java.lang.Class<?> wildcardClass24 = tabelaHash17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Object obj16 = tabelaHash13.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        tabelaHash13.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass22 = tabelaHash13.getClass();
        tabelaHash6.insere("hi!", (java.lang.Object) wildcardClass22);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        java.lang.Object obj32 = tabelaHash21.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj21 = tabelaHash17.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray10 = tabelaHash5.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.retira("");
        tabelaHash22.retira("");
        tabelaHash18.insere("", (java.lang.Object) "");
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 100);
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj45 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100,  ]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash17.insere("hi!", (java.lang.Object) '4');
        tabelaHash17.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        tabelaHash21.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj20 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.retira("");
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj15 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray18 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        java.lang.Object obj22 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.retira("hi!");
        tabelaHash26.retira("hi!");
        java.lang.Object obj32 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash26.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object[] objArray35 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray35);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.retira("");
        tabelaHash38.retira("");
        tabelaHash38.imprime();
        java.lang.Object obj45 = tabelaHash38.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash38.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = tabelaHash17.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        tabelaHash17.insere("", (java.lang.Object) 100);
        tabelaHash17.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj30 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray33 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100,  ]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        tabelaHash4.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = obj2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[]]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash34.imprime();
        tabelaHash30.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.retira("hi!");
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash39);
        tabelaHash39.retira("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        tabelaHash46.retira("");
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        tabelaHash46.retira("");
        java.lang.Object[] objArray54 = tabelaHash46.recuperaItens();
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        java.lang.Object[] objArray57 = tabelaHash56.recuperaItens();
        tabelaHash56.imprime();
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        tabelaHash60.imprime();
        tabelaHash56.insere("", (java.lang.Object) tabelaHash60);
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        tabelaHash65.imprime();
        tabelaHash65.retira("");
        tabelaHash56.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash65.retira("");
        java.lang.Object obj73 = tabelaHash65.pesquisa("hi!");
        tabelaHash46.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash39.insere("hi!", (java.lang.Object) "");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object obj78 = tabelaHash21.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(obj78);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash5.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash7.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass16 = tabelaHash7.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.retira("");
        java.lang.Object[] objArray17 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("");
        java.lang.Object obj21 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        java.lang.Object[] objArray9 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1.0]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray27);
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.retira("");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("");
        java.lang.Object obj27 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object obj18 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash16.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        tabelaHash16.imprime();
        java.lang.Object obj25 = tabelaHash16.pesquisa("hi!");
        tabelaHash7.insere("hi!", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object[] objArray30 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        java.lang.Object obj37 = tabelaHash34.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        tabelaHash34.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass43 = tabelaHash34.getClass();
        tabelaHash28.insere("", (java.lang.Object) wildcardClass43);
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) (-1));
        tabelaHash28.imprime();
        java.lang.Class<?> wildcardClass51 = tabelaHash28.getClass();
        tabelaHash7.insere("", (java.lang.Object) wildcardClass51);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = tabelaHash28.pesquisa("hi!");
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        tabelaHash28.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass37 = tabelaHash28.getClass();
        tabelaHash21.insere("hi!", (java.lang.Object) wildcardClass37);
        tabelaHash21.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("");
        java.lang.Object[] objArray44 = tabelaHash21.recuperaItens();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        java.lang.Object obj25 = tabelaHash8.pesquisa("hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.retira("");
        tabelaHash28.retira("");
        tabelaHash24.insere("", (java.lang.Object) "");
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        java.lang.Object[] objArray41 = tabelaHash40.recuperaItens();
        tabelaHash40.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash40.getClass();
        tabelaHash24.insere("hi!", (java.lang.Object) wildcardClass43);
        tabelaHash24.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.retira("");
        java.lang.Object obj12 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        java.lang.Object[] objArray15 = tabelaHash7.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        tabelaHash23.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass32 = tabelaHash23.getClass();
        tabelaHash17.insere("", (java.lang.Object) wildcardClass32);
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("hi!");
        java.lang.Object obj39 = tabelaHash17.pesquisa("");
        java.lang.Object[] objArray40 = tabelaHash17.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[class ds.TabelaHash]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object obj6 = tabelaHash4.pesquisa("hi!");
        tabelaHash4.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        java.lang.Object obj17 = tabelaHash10.pesquisa("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        tabelaHash21.imprime();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass29 = tabelaHash4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", obj23);
        tabelaHash0.retira("");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object obj9 = tabelaHash7.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash7.recuperaItens();
        java.lang.Object obj13 = tabelaHash7.pesquisa("");
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Object obj28 = tabelaHash16.pesquisa("");
        tabelaHash7.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash8.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj26 = tabelaHash17.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray16 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray27);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj32 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray35 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[class ds.TabelaHash]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object obj11 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object obj15 = tabelaHash9.pesquisa("");
        tabelaHash9.imprime();
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = obj18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.retira("");
        tabelaHash22.retira("");
        tabelaHash18.insere("", (java.lang.Object) "");
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 100);
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj45 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass51 = tabelaHash32.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100,  ]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[1.0]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj28 = tabelaHash22.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash22.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray33 = tabelaHash22.recuperaItens();
        tabelaHash22.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("");
        tabelaHash16.retira("");
        tabelaHash12.insere("", (java.lang.Object) "");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (-1.0f) + "'", obj23, (-1.0f));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (-1.0f) + "'", obj28, (-1.0f));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        java.lang.Object obj16 = tabelaHash13.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash22);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        tabelaHash27.retira("");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = tabelaHash33.pesquisa("hi!");
        java.lang.Object[] objArray37 = tabelaHash33.recuperaItens();
        tabelaHash33.imprime();
        java.lang.Object[] objArray39 = tabelaHash33.recuperaItens();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj42 = tabelaHash18.pesquisa("");
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        tabelaHash44.retira("");
        java.lang.Object obj49 = tabelaHash44.pesquisa("hi!");
        java.lang.Object[] objArray50 = tabelaHash44.recuperaItens();
        java.lang.Object obj52 = tabelaHash44.pesquisa("");
        java.lang.Object[] objArray53 = tabelaHash44.recuperaItens();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash44);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash5.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray15 = tabelaHash7.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj24 = null;
        tabelaHash17.insere("", obj24);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash30.insere("hi!", (java.lang.Object) "");
        tabelaHash30.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj50 = tabelaHash30.pesquisa("hi!");
        java.lang.Class<?> wildcardClass51 = tabelaHash30.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.retira("");
        tabelaHash16.retira("");
        tabelaHash12.insere("", (java.lang.Object) "");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray27 = tabelaHash12.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.retira("");
        tabelaHash29.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash29.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        java.lang.Object[] objArray8 = tabelaHash4.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("");
        java.lang.Object[] objArray17 = tabelaHash14.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) objArray17);
        tabelaHash4.insere("hi!", (java.lang.Object) objArray17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash0.imprime();
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        java.lang.Object obj8 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        tabelaHash5.insere("", (java.lang.Object) 100);
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.retira("");
        tabelaHash22.retira("");
        tabelaHash18.insere("", (java.lang.Object) "");
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        tabelaHash32.insere("", (java.lang.Object) 100);
        tabelaHash32.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj45 = tabelaHash32.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass53 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + ' ' + "'", obj45, ' ');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100,  ]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        java.lang.Object obj33 = tabelaHash30.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray35 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 10L);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 10L + "'", obj13, 10L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = tabelaHash36.pesquisa("hi!");
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        tabelaHash36.imprime();
        tabelaHash36.insere("", (java.lang.Object) 100);
        tabelaHash36.insere("hi!", (java.lang.Object) ' ');
        tabelaHash17.insere("", (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray27);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object[] objArray41 = tabelaHash38.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash38.recuperaItens();
        tabelaHash38.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray46 = tabelaHash38.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash38.recuperaItens();
        java.lang.Class<?> wildcardClass48 = tabelaHash38.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass48);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[1.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100,  ]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj11 = tabelaHash5.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj17 = tabelaHash5.pesquisa("");
        tabelaHash5.imprime();
        java.lang.Object obj20 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray21 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        tabelaHash0.imprime();
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1.0]");
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj32 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass37 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object obj7 = tabelaHash5.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 100);
        tabelaHash12.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Object obj28 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + ' ' + "'", obj28, ' ');
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj25 = tabelaHash19.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        java.lang.Object obj34 = tabelaHash19.pesquisa("");
        java.lang.Object[] objArray35 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray35);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + ' ' + "'", obj15, ' ');
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + ' ' + "'", obj17, ' ');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1.0f) + "'", obj31, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (-1.0f) + "'", obj34, (-1.0f));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1.0]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash30.insere("hi!", (java.lang.Object) "");
        tabelaHash30.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj50 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.retira("hi!");
        tabelaHash52.retira("hi!");
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object obj22 = tabelaHash20.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash20.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray25 = tabelaHash15.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj28 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (-1.0f) + "'", obj15, (-1.0f));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        tabelaHash8.retira("");
        java.lang.Object obj24 = tabelaHash8.pesquisa("");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        java.lang.Object obj12 = tabelaHash5.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        java.lang.Object obj7 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray12 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj21 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.retira("");
        java.lang.Object obj12 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray19 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (-1.0f) + "'", obj10, (-1.0f));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass14 = tabelaHash13.getClass();
        tabelaHash9.insere("", (java.lang.Object) wildcardClass14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash17.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.retira("");
        tabelaHash5.insere("", (java.lang.Object) "");
        tabelaHash5.imprime();
        java.lang.Object[] objArray16 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray16);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj21 = tabelaHash17.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash11.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj27 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash21.imprime();
        java.lang.Object[] objArray33 = tabelaHash21.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray35 = tabelaHash11.recuperaItens();
        java.lang.Class<?> wildcardClass36 = objArray35.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("", obj14);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object[] objArray19 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object obj26 = tabelaHash24.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("hi!");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.retira("");
        tabelaHash40.retira("");
        tabelaHash36.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass46 = tabelaHash36.getClass();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass15 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.retira("");
        tabelaHash4.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (-1));
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object[] objArray27 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("");
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash34.imprime();
        java.lang.Object[] objArray46 = tabelaHash34.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash34.recuperaItens();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object obj50 = tabelaHash34.pesquisa("");
        java.lang.Object[] objArray51 = tabelaHash34.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1.0]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (-1.0f) + "'", obj50, (-1.0f));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1.0]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 0.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        java.lang.Object obj21 = tabelaHash17.pesquisa("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass23 = tabelaHash17.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("hi!");
        java.lang.Object[] objArray27 = tabelaHash24.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = objArray27.getClass();
        tabelaHash0.insere("", (java.lang.Object) objArray27);
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
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        tabelaHash9.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj24 = tabelaHash17.pesquisa("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.retira("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        java.lang.Object obj44 = tabelaHash41.pesquisa("hi!");
        java.lang.Object[] objArray45 = tabelaHash41.recuperaItens();
        tabelaHash41.imprime();
        java.lang.Object[] objArray47 = tabelaHash41.recuperaItens();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Object obj50 = tabelaHash26.pesquisa("");
        tabelaHash17.insere("", obj50);
        tabelaHash17.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = tabelaHash16.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        tabelaHash16.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass25);
        tabelaHash10.imprime();
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj32 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object[] objArray42 = tabelaHash40.recuperaItens();
        tabelaHash40.retira("");
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = tabelaHash46.pesquisa("hi!");
        java.lang.Object[] objArray50 = tabelaHash46.recuperaItens();
        tabelaHash46.imprime();
        tabelaHash46.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass55 = tabelaHash46.getClass();
        tabelaHash40.insere("", (java.lang.Object) wildcardClass55);
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "class ds.TabelaHash");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[class ds.TabelaHash]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.imprime();
        tabelaHash4.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash4);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash4.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash26.insere("", (java.lang.Object) tabelaHash30);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        tabelaHash35.retira("");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash35.retira("");
        java.lang.Object obj43 = tabelaHash35.pesquisa("hi!");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash9.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray46 = tabelaHash9.recuperaItens();
        java.lang.Class<?> wildcardClass47 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass5 = tabelaHash4.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass5);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj14 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash16);
        tabelaHash8.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        java.lang.Object[] objArray27 = tabelaHash22.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash22.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray28);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash23.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) objArray31);
        tabelaHash19.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object obj9 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        java.lang.Object[] objArray11 = tabelaHash5.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        java.lang.Object obj17 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass14 = tabelaHash13.getClass();
        tabelaHash9.insere("", (java.lang.Object) wildcardClass14);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj23 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash17.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.retira("hi!");
        java.lang.Object[] objArray37 = tabelaHash34.recuperaItens();
        tabelaHash34.retira("hi!");
        tabelaHash34.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object obj45 = tabelaHash43.pesquisa("hi!");
        java.lang.Object[] objArray46 = tabelaHash43.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash43.recuperaItens();
        java.lang.Object obj49 = tabelaHash43.pesquisa("");
        tabelaHash43.imprime();
        java.lang.Object obj52 = tabelaHash43.pesquisa("hi!");
        tabelaHash34.insere("hi!", obj52);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        java.lang.Object[] objArray57 = tabelaHash55.recuperaItens();
        tabelaHash55.retira("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.imprime();
        java.lang.Object obj64 = tabelaHash61.pesquisa("hi!");
        java.lang.Object[] objArray65 = tabelaHash61.recuperaItens();
        tabelaHash61.imprime();
        tabelaHash61.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass70 = tabelaHash61.getClass();
        tabelaHash55.insere("", (java.lang.Object) wildcardClass70);
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash55.insere("", (java.lang.Object) (-1));
        tabelaHash55.imprime();
        java.lang.Class<?> wildcardClass78 = tabelaHash55.getClass();
        tabelaHash34.insere("", (java.lang.Object) wildcardClass78);
        tabelaHash34.retira("");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash34);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object obj8 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.retira("");
        tabelaHash6.insere("", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object obj24 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray31 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("hi!");
        java.lang.Object obj35 = tabelaHash28.pesquisa("hi!");
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj10 = tabelaHash4.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj17 = null;
        tabelaHash0.insere("hi!", obj17);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object obj10 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash5.recuperaItens();
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object obj14 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object[] objArray21 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("hi!");
        java.lang.Object obj25 = tabelaHash18.pesquisa("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        java.lang.Object[] objArray8 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("", (java.lang.Object) 1.0d);
        tabelaHash5.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (-1.0f) + "'", obj12, (-1.0f));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0f) + "'", obj17, (-1.0f));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100,  ]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj40 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash30.insere("hi!", (java.lang.Object) "");
        tabelaHash30.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj50 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object[] objArray53 = tabelaHash52.recuperaItens();
        tabelaHash52.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj58 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object[] objArray61 = tabelaHash60.recuperaItens();
        tabelaHash52.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash30.insere("", (java.lang.Object) tabelaHash52);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "" + "'", obj50, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) (short) 1);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.insere("", (java.lang.Object) 100);
        tabelaHash12.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj25 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = tabelaHash29.pesquisa("hi!");
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        tabelaHash29.imprime();
        tabelaHash29.insere("", (java.lang.Object) 100);
        tabelaHash29.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj42 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object obj46 = tabelaHash29.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj46);
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + ' ' + "'", obj25, ' ');
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + ' ' + "'", obj42, ' ');
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + ' ' + "'", obj46, ' ');
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        tabelaHash7.retira("");
        java.lang.Object obj12 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray19 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1.0]");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[1.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        tabelaHash6.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        java.lang.Object obj33 = tabelaHash30.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray35 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object obj40 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "class ds.TabelaHash");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) (-1.0f));
        java.lang.Object obj26 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash20.imprime();
        java.lang.Class<?> wildcardClass32 = tabelaHash20.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + ' ' + "'", obj16, ' ');
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100);
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object[] objArray18 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object obj25 = tabelaHash22.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash22.imprime();
        tabelaHash22.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass31 = tabelaHash22.getClass();
        tabelaHash16.insere("", (java.lang.Object) wildcardClass31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object obj37 = tabelaHash35.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash35.recuperaItens();
        java.lang.Object[] objArray39 = tabelaHash35.recuperaItens();
        java.lang.Object obj41 = tabelaHash35.pesquisa("");
        tabelaHash35.imprime();
        java.lang.Object obj44 = tabelaHash35.pesquisa("hi!");
        java.lang.Object[] objArray45 = tabelaHash35.recuperaItens();
        tabelaHash16.insere("", (java.lang.Object) objArray45);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100,  ]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
    }
}

