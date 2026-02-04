package ds.seed6733;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
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
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
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
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 100.0d + "'", obj18, 100.0d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Ignore
    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj25);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) true);
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass22 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.retira("");
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass23 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        tabelaHash14.retira("");
        java.lang.Object[] objArray24 = tabelaHash14.recuperaItens();
        java.lang.Object obj26 = tabelaHash14.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash21.insere("", (java.lang.Object) "hi!");
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash21.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.retira("");
        tabelaHash28.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray38 = tabelaHash28.recuperaItens();
        java.lang.Class<?> wildcardClass39 = objArray38.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj25);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray39 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("");
        java.lang.Object[] objArray43 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray44 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash31.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray45);
        java.lang.Class<?> wildcardClass47 = objArray45.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.retira("");
        java.lang.Object obj22 = tabelaHash14.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray23);
        java.lang.Class<?> wildcardClass25 = objArray23.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash35.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Ignore
    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash4.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = tabelaHash4.recuperaItens();
        java.lang.Object obj14 = tabelaHash4.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
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
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.retira("");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.insere("", (java.lang.Object) "hi!");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj22);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object obj52 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.retira("");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        tabelaHash13.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0]");
    }

    @Ignore
    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        java.lang.Object obj25 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.retira("");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.insere("", (java.lang.Object) "hi!");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        java.lang.Object[] objArray20 = tabelaHash17.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        java.lang.Class<?> wildcardClass22 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.retira("");
        java.lang.Object obj14 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        java.lang.Object obj17 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash23.getClass();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.retira("");
        java.lang.Object obj50 = tabelaHash42.pesquisa("");
        java.lang.Class<?> wildcardClass51 = tabelaHash42.getClass();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj25);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash31.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash31.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray39 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash31.recuperaItens();
        tabelaHash31.retira("");
        java.lang.Object[] objArray43 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray44 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash31.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray45);
        java.lang.Object obj48 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100.0]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[100.0]");
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj37 = tabelaHash20.pesquisa("");
        tabelaHash20.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.retira("");
        tabelaHash28.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray38 = tabelaHash28.recuperaItens();
        java.lang.Class<?> wildcardClass39 = objArray38.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object[] objArray49 = tabelaHash48.recuperaItens();
        tabelaHash48.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash48.retira("");
        java.lang.Object obj56 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        java.lang.Object obj59 = tabelaHash48.pesquisa("");
        tabelaHash48.retira("hi!");
        tabelaHash48.retira("");
        ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
        java.lang.Object[] objArray66 = tabelaHash65.recuperaItens();
        tabelaHash65.imprime();
        java.lang.Object[] objArray68 = tabelaHash65.recuperaItens();
        java.lang.Object[] objArray69 = tabelaHash65.recuperaItens();
        java.lang.Class<?> wildcardClass70 = tabelaHash65.getClass();
        tabelaHash48.insere("", (java.lang.Object) tabelaHash65);
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash65);
        ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
        java.lang.Object[] objArray75 = tabelaHash74.recuperaItens();
        tabelaHash74.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash74.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray82 = tabelaHash74.recuperaItens();
        ds.TabelaHash tabelaHash84 = new ds.TabelaHash();
        java.lang.Object[] objArray85 = tabelaHash84.recuperaItens();
        tabelaHash84.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash84.retira("");
        java.lang.Object obj92 = tabelaHash84.pesquisa("");
        java.lang.Class<?> wildcardClass93 = tabelaHash84.getClass();
        tabelaHash74.insere("", (java.lang.Object) tabelaHash84);
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash84);
        java.lang.Object obj97 = tabelaHash42.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 100.0d + "'", obj56, 100.0d);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNotNull(objArray82);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.insere("", (java.lang.Object) "hi!");
        tabelaHash28.retira("");
        java.lang.Object[] objArray38 = tabelaHash28.recuperaItens();
        java.lang.Object obj40 = tabelaHash28.pesquisa("hi!");
        java.lang.Object[] objArray41 = tabelaHash28.recuperaItens();
        java.lang.Object obj43 = null;
        tabelaHash28.insere("", obj43);
        tabelaHash0.insere("hi!", obj43);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 100.0d + "'", obj40, 100.0d);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100.0]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.retira("");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        tabelaHash12.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.insere("", (java.lang.Object) "hi!");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash12.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash16.imprime();
        java.lang.Object[] objArray26 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        tabelaHash16.retira("");
        java.lang.Object obj32 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash4.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray12 = tabelaHash4.recuperaItens();
        tabelaHash4.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj27 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash29.retira("");
        tabelaHash29.retira("");
        tabelaHash29.imprime();
        java.lang.Object[] objArray39 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash29.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray51 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass52 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        tabelaHash0.insere("", obj25);
        tabelaHash0.insere("", (java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.retira("");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray46 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0]");
        org.junit.Assert.assertNotNull(objArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[hi!, 100.0]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash47.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray52 = tabelaHash20.recuperaItens();
        java.lang.Class<?> wildcardClass53 = tabelaHash20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.retira("");
        java.lang.Object obj18 = tabelaHash10.pesquisa("");
        java.lang.Class<?> wildcardClass19 = tabelaHash10.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash22.insere("", (java.lang.Object) "hi!");
        tabelaHash22.retira("");
        tabelaHash22.imprime();
        java.lang.Object[] objArray33 = tabelaHash22.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) objArray33);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100.0]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        java.lang.Object obj22 = tabelaHash19.pesquisa("");
        java.lang.Object obj24 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray25);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("");
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj35 = tabelaHash20.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100.0]");
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100L);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        tabelaHash5.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash5.retira("");
        java.lang.Object[] objArray12 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        tabelaHash5.retira("hi!");
        tabelaHash5.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.retira("");
        java.lang.Object obj33 = tabelaHash25.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash25.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        tabelaHash25.retira("hi!");
        java.lang.Class<?> wildcardClass40 = tabelaHash25.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash25);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 10.0f + "'", obj37, 10.0f);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("");
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash29.retira("");
        tabelaHash29.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray39 = tabelaHash29.recuperaItens();
        java.lang.Object obj41 = tabelaHash29.pesquisa("hi!");
        java.lang.Object[] objArray42 = tabelaHash29.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray42);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10.0, 100.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 100.0d + "'", obj41, 100.0d);
        org.junit.Assert.assertNotNull(objArray42);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, 100.0]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash21.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("");
        tabelaHash21.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 100.0d + "'", obj30, 100.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        java.lang.Class<?> wildcardClass32 = tabelaHash23.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Class<?> wildcardClass34 = tabelaHash23.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass34);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Ignore
    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.insere("", (java.lang.Object) "hi!");
        tabelaHash17.retira("");
        tabelaHash17.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Ignore
    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash32.imprime();
        java.lang.Object[] objArray45 = tabelaHash32.recuperaItens();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash32);
        java.lang.Object obj48 = tabelaHash32.pesquisa("");
        tabelaHash0.insere("", obj48);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "hi!" + "'", obj48, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 100L);
        tabelaHash0.imprime();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.retira("");
        java.lang.Object obj14 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        java.lang.Object obj17 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash23.getClass();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.retira("");
        java.lang.Object obj50 = tabelaHash42.pesquisa("");
        java.lang.Class<?> wildcardClass51 = tabelaHash42.getClass();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object obj55 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash26.retira("");
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray35 = tabelaHash26.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash15.retira("");
        java.lang.Class<?> wildcardClass39 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray50 = tabelaHash42.recuperaItens();
        java.lang.Object[] objArray51 = tabelaHash42.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray51);
        java.lang.Class<?> wildcardClass53 = objArray51.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray51);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        tabelaHash43.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash43.retira("");
        java.lang.Object obj51 = tabelaHash43.pesquisa("");
        java.lang.Object[] objArray52 = tabelaHash43.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash32.retira("");
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Class<?> wildcardClass59 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.insere("", (java.lang.Object) "hi!");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        java.lang.Object[] objArray17 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray17);
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[100.0]]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash21.insere("", (java.lang.Object) "hi!");
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash21.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj36 = tabelaHash21.pesquisa("");
        java.lang.Class<?> wildcardClass37 = tabelaHash21.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.retira("");
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash24.retira("");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash24.recuperaItens();
        java.lang.Object obj35 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Object[] objArray38 = tabelaHash24.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100.0]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 100.0d + "'", obj13, 100.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj27 = tabelaHash15.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash27.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray35 = tabelaHash27.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash27.imprime();
        java.lang.Object[] objArray40 = tabelaHash27.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0, hi!]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object[] objArray21 = tabelaHash11.recuperaItens();
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj23);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object[] objArray53 = tabelaHash52.recuperaItens();
        tabelaHash52.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash52.insere("", (java.lang.Object) "hi!");
        tabelaHash52.retira("");
        tabelaHash52.imprime();
        java.lang.Object obj64 = tabelaHash52.pesquisa("hi!");
        tabelaHash52.imprime();
        java.lang.Object[] objArray66 = tabelaHash52.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray66);
        java.lang.Object obj69 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertEquals("'" + obj64 + "' != '" + 100.0d + "'", obj64, 100.0d);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[100.0]");
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj37 = tabelaHash20.pesquisa("");
        java.lang.Class<?> wildcardClass38 = tabelaHash20.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        java.lang.Object[] objArray5 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash4.insere("", (java.lang.Object) "hi!");
        tabelaHash4.retira("");
        tabelaHash4.imprime();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash16.imprime();
        java.lang.Object[] objArray29 = tabelaHash16.recuperaItens();
        tabelaHash4.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass31 = tabelaHash4.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash4);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.retira("");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj47 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 100.0d + "'", obj47, 100.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("hi!");
        java.lang.Object obj32 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("", obj32);
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 100.0d + "'", obj35, 100.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.retira("");
        java.lang.Object obj36 = tabelaHash28.pesquisa("");
        java.lang.Class<?> wildcardClass37 = tabelaHash28.getClass();
        tabelaHash18.insere("", (java.lang.Object) tabelaHash28);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.retira("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray33 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        java.lang.Class<?> wildcardClass35 = tabelaHash30.getClass();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray37 = tabelaHash30.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash30.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash26.retira("");
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray35 = tabelaHash26.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash15.retira("");
        java.lang.Class<?> wildcardClass39 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass39);
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class ds.TabelaHash");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        java.lang.Class<?> wildcardClass31 = objArray30.getClass();
        tabelaHash16.insere("", (java.lang.Object) wildcardClass31);
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        tabelaHash36.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash36.retira("");
        tabelaHash36.retira("");
        tabelaHash36.imprime();
        java.lang.Object[] objArray46 = tabelaHash36.recuperaItens();
        java.lang.Object obj48 = tabelaHash36.pesquisa("");
        tabelaHash16.insere("", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100.0]");
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100);
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.insere("", (java.lang.Object) "hi!");
        tabelaHash37.retira("");
        java.lang.Object[] objArray47 = tabelaHash37.recuperaItens();
        java.lang.Object obj49 = tabelaHash37.pesquisa("hi!");
        java.lang.Object[] objArray50 = tabelaHash37.recuperaItens();
        tabelaHash37.retira("hi!");
        java.lang.Class<?> wildcardClass53 = tabelaHash37.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 100.0d + "'", obj49, 100.0d);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash8.retira("");
        tabelaHash8.imprime();
        java.lang.Object obj20 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object[] objArray30 = tabelaHash20.recuperaItens();
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash9.insere("", obj32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray35 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNotNull(objArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[hi!, 100.0]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object[] objArray21 = tabelaHash11.recuperaItens();
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj23);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, hi!]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[hi!]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.imprime();
        java.lang.Object[] objArray17 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash14.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray13 = tabelaHash10.recuperaItens();
        java.lang.Object obj15 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        java.lang.Object obj42 = tabelaHash30.pesquisa("hi!");
        tabelaHash30.imprime();
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash10.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass47 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 100.0d + "'", obj42, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        java.lang.Object obj37 = tabelaHash20.pesquisa("");
        tabelaHash20.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray17 = tabelaHash9.recuperaItens();
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        java.lang.Object[] objArray30 = tabelaHash20.recuperaItens();
        java.lang.Object obj32 = tabelaHash20.pesquisa("");
        tabelaHash9.insere("", obj32);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash27.retira("");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        java.lang.Object obj41 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        java.lang.Class<?> wildcardClass43 = tabelaHash27.getClass();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100.0]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        java.lang.Object obj39 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        java.lang.Object[] objArray42 = tabelaHash41.recuperaItens();
        tabelaHash41.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash41.retira("");
        tabelaHash41.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 10.0f + "'", obj37, 10.0f);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 10.0f + "'", obj39, 10.0f);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        tabelaHash0.insere("", (java.lang.Object) (-1L));
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.retira("");
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray33 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray34 = tabelaHash25.recuperaItens();
        tabelaHash25.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!, 100.0]");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.retira("");
        java.lang.Object obj27 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj30 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("hi!");
        java.lang.Class<?> wildcardClass33 = tabelaHash19.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj36 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 100.0d + "'", obj27, 100.0d);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.retira("");
        java.lang.Object[] objArray16 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        tabelaHash24.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash24.retira("");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash24.recuperaItens();
        java.lang.Object obj35 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Class<?> wildcardClass38 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[100.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash18.pesquisa("");
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0d + "'", obj31, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Ignore
    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) true);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.retira("");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray46 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash13.recuperaItens();
        java.lang.Object obj49 = tabelaHash13.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[100.0]");
        org.junit.Assert.assertNotNull(objArray46);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.retira("");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Object obj23 = tabelaHash12.pesquisa("");
        tabelaHash12.retira("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash12.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass26);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 100.0d + "'", obj20, 100.0d);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash47.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray52 = tabelaHash20.recuperaItens();
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object[] objArray55 = tabelaHash54.recuperaItens();
        tabelaHash54.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash54.imprime();
        tabelaHash20.insere("", (java.lang.Object) tabelaHash54);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash47.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash37);
        tabelaHash37.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.retira("");
        tabelaHash15.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray29 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100.0]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash12.imprime();
        java.lang.Object[] objArray25 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray27 = tabelaHash12.recuperaItens();
        java.lang.Object obj29 = tabelaHash12.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 10.0f + "'", obj37, 10.0f);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        tabelaHash25.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash25.retira("");
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        java.lang.Object[] objArray35 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash25.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[100.0]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100);
        tabelaHash13.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass38 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("");
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100.0]");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.retira("");
        java.lang.Object obj14 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        java.lang.Object obj17 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.imprime();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash23.getClass();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        java.lang.Object[] objArray43 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash42.retira("");
        java.lang.Object obj50 = tabelaHash42.pesquisa("");
        java.lang.Class<?> wildcardClass51 = tabelaHash42.getClass();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray54 = tabelaHash42.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 100.0d + "'", obj14, 100.0d);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100.0]");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj22);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj22);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash33.retira("");
        tabelaHash33.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray43 = tabelaHash33.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) objArray43);
        java.lang.Object obj46 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100.0, 10.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj32 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        java.lang.Object[] objArray35 = tabelaHash34.recuperaItens();
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        tabelaHash37.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray47 = tabelaHash37.recuperaItens();
        tabelaHash34.insere("hi!", (java.lang.Object) objArray47);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object[] objArray51 = tabelaHash50.recuperaItens();
        tabelaHash50.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash50.retira("");
        java.lang.Object obj58 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        java.lang.Object obj61 = tabelaHash50.pesquisa("");
        tabelaHash50.retira("hi!");
        tabelaHash50.retira("");
        java.lang.Object[] objArray66 = tabelaHash50.recuperaItens();
        tabelaHash34.insere("hi!", (java.lang.Object) objArray66);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray47);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 100.0d + "'", obj58, 100.0d);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass25 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        java.lang.Object[] objArray30 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100.0]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.retira("");
        java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("");
        tabelaHash14.retira("");
        tabelaHash14.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        tabelaHash30.retira("");
        tabelaHash30.imprime();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 100.0d + "'", obj22, 100.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.retira("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.retira("");
        java.lang.Object[] objArray19 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        java.lang.Object[] objArray23 = tabelaHash22.recuperaItens();
        tabelaHash22.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash22.retira("");
        java.lang.Object[] objArray29 = tabelaHash22.recuperaItens();
        java.lang.Object obj31 = tabelaHash22.pesquisa("hi!");
        tabelaHash22.retira("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash22);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 100.0d + "'", obj31, 100.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray51 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        java.lang.Object[] objArray54 = tabelaHash53.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash53.recuperaItens();
        tabelaHash53.retira("hi!");
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass63 = tabelaHash59.getClass();
        tabelaHash53.insere("", (java.lang.Object) tabelaHash59);
        java.lang.Object[] objArray65 = tabelaHash53.recuperaItens();
        java.lang.Object obj67 = tabelaHash53.pesquisa("");
        tabelaHash53.retira("");
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object[] objArray72 = tabelaHash71.recuperaItens();
        tabelaHash71.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash71.retira("");
        tabelaHash71.insere("", (java.lang.Object) 10.0d);
        tabelaHash71.imprime();
        tabelaHash53.insere("", (java.lang.Object) tabelaHash71);
        java.lang.Object[] objArray83 = tabelaHash53.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Object[] objArray85 = tabelaHash53.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object[] objArray15 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray22 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash14.retira("");
        java.lang.Object[] objArray26 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash14.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) 100);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray49 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        java.lang.Object[] objArray53 = tabelaHash52.recuperaItens();
        tabelaHash52.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash52.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray60 = tabelaHash52.recuperaItens();
        java.lang.Object[] objArray61 = tabelaHash52.recuperaItens();
        tabelaHash52.retira("");
        java.lang.Object[] objArray64 = tabelaHash52.recuperaItens();
        java.lang.Object[] objArray65 = tabelaHash52.recuperaItens();
        java.lang.Object[] objArray66 = tabelaHash52.recuperaItens();
        tabelaHash52.insere("hi!", (java.lang.Object) 100);
        tabelaHash52.retira("hi!");
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        java.lang.Object[] objArray74 = tabelaHash73.recuperaItens();
        tabelaHash73.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash73.insere("", (java.lang.Object) "hi!");
        tabelaHash73.retira("");
        tabelaHash73.imprime();
        tabelaHash73.retira("hi!");
        tabelaHash52.insere("", (java.lang.Object) tabelaHash73);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash73);
        java.lang.Class<?> wildcardClass88 = tabelaHash73.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray60);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray61);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[100.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[100.0]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[100.0]");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash18.pesquisa("");
        java.lang.Object obj33 = tabelaHash18.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 10.0d + "'", obj31, 10.0d);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 10.0d + "'", obj33, 10.0d);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object[] objArray39 = tabelaHash38.recuperaItens();
        tabelaHash38.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash38.retira("");
        tabelaHash38.retira("");
        tabelaHash38.imprime();
        java.lang.Object[] objArray48 = tabelaHash38.recuperaItens();
        java.lang.Object obj50 = tabelaHash38.pesquisa("");
        java.lang.Class<?> wildcardClass51 = tabelaHash38.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass51);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100.0]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!]");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 100.0d + "'", obj6, 100.0d);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 10.0f);
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        java.lang.Object[] objArray6 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash5.recuperaItens();
        tabelaHash5.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass15 = tabelaHash11.getClass();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray17 = tabelaHash5.recuperaItens();
        java.lang.Object obj19 = tabelaHash5.pesquisa("");
        tabelaHash5.retira("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        tabelaHash23.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash23.retira("");
        tabelaHash23.insere("", (java.lang.Object) 10.0d);
        tabelaHash23.imprime();
        tabelaHash5.insere("", (java.lang.Object) tabelaHash23);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        java.lang.Object obj45 = tabelaHash37.pesquisa("");
        java.lang.Object[] objArray46 = tabelaHash37.recuperaItens();
        tabelaHash37.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100.0]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object[] objArray21 = tabelaHash11.recuperaItens();
        java.lang.Object obj23 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj23);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, hi!]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, 100.0]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        tabelaHash3.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray13 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray13);
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray28 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash20.recuperaItens();
        tabelaHash20.retira("");
        java.lang.Object[] objArray32 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray34 = tabelaHash20.recuperaItens();
        tabelaHash20.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[100.0]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 10.0d);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        java.lang.Object[] objArray25 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object[] objArray28 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.insere("", (java.lang.Object) "hi!");
        tabelaHash32.retira("");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        tabelaHash43.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash43.insere("", (java.lang.Object) "hi!");
        tabelaHash43.retira("");
        tabelaHash43.imprime();
        java.lang.Object obj55 = tabelaHash43.pesquisa("hi!");
        tabelaHash43.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash43);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash43);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        java.lang.Object[] objArray61 = tabelaHash60.recuperaItens();
        tabelaHash60.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash60.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray68 = tabelaHash60.recuperaItens();
        tabelaHash60.imprime();
        ds.TabelaHash tabelaHash71 = new ds.TabelaHash();
        java.lang.Object[] objArray72 = tabelaHash71.recuperaItens();
        tabelaHash71.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash71.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray79 = tabelaHash71.recuperaItens();
        tabelaHash71.imprime();
        java.lang.Object[] objArray81 = tabelaHash71.recuperaItens();
        java.lang.Object obj83 = tabelaHash71.pesquisa("");
        tabelaHash60.insere("", obj83);
        tabelaHash60.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10.0, 100.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 100.0d + "'", obj12, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100.0]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + 100.0d + "'", obj55, 100.0d);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(objArray68);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(objArray79);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray81);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj83 + "' != '" + "hi!" + "'", obj83, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray18 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        tabelaHash0.insere("hi!", obj22);
        tabelaHash0.retira("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.retira("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Class<?> wildcardClass27 = objArray25.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash9.insere("", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash20.insere("", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        tabelaHash20.imprime();
        java.lang.Object obj32 = tabelaHash20.pesquisa("hi!");
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        java.lang.Object[] objArray38 = tabelaHash37.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash37.retira("");
        tabelaHash37.retira("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash47.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray52 = tabelaHash20.recuperaItens();
        java.lang.Class<?> wildcardClass53 = objArray52.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 100.0d + "'", obj32, 100.0d);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash21.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray29 = tabelaHash21.recuperaItens();
        tabelaHash21.imprime();
        java.lang.Object[] objArray31 = tabelaHash21.recuperaItens();
        java.lang.Object obj33 = tabelaHash21.pesquisa("");
        tabelaHash11.insere("hi!", obj33);
        tabelaHash11.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 100.0d + "'", obj19, 100.0d);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0]");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass10 = tabelaHash6.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) 10.0d);
        tabelaHash18.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        java.lang.Object[] objArray33 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash32.retira("");
        tabelaHash32.retira("");
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        tabelaHash43.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash43.retira("");
        java.lang.Object obj51 = tabelaHash43.pesquisa("");
        tabelaHash32.insere("", obj51);
        tabelaHash32.retira("");
        java.lang.Class<?> wildcardClass55 = tabelaHash32.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass55);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.retira("");
        java.lang.Object obj24 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        java.lang.Object[] objArray30 = tabelaHash29.recuperaItens();
        tabelaHash29.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash29.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash29.recuperaItens();
        tabelaHash29.retira("");
        java.lang.Object[] objArray41 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray43 = tabelaHash29.recuperaItens();
        tabelaHash29.insere("hi!", (java.lang.Object) true);
        tabelaHash16.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        java.lang.Object[] objArray50 = tabelaHash49.recuperaItens();
        tabelaHash49.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash49.retira("");
        java.lang.Object[] objArray56 = tabelaHash49.recuperaItens();
        tabelaHash49.retira("");
        tabelaHash49.retira("hi!");
        tabelaHash29.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        java.lang.Object[] objArray65 = tabelaHash64.recuperaItens();
        tabelaHash64.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash64.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray72 = tabelaHash64.recuperaItens();
        tabelaHash64.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash64.insere("hi!", (java.lang.Object) (-1L));
        tabelaHash29.insere("", (java.lang.Object) "hi!");
        tabelaHash29.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(objArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100.0]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[100.0]");
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray72);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[hi!, 100.0]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, hi!]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + 100.0d + "'", obj28, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        tabelaHash26.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash26.retira("");
        java.lang.Object obj34 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray35 = tabelaHash26.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) tabelaHash26);
        tabelaHash15.retira("");
        java.lang.Class<?> wildcardClass39 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass28 = tabelaHash16.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
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
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!, 100.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        java.lang.Object[] objArray13 = tabelaHash12.recuperaItens();
        tabelaHash12.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash12.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj21 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.retira("");
        java.lang.Object obj25 = tabelaHash12.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash13.retira("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        tabelaHash13.retira("");
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray29 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 100.0d + "'", obj21, 100.0d);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100.0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        java.lang.Class<?> wildcardClass26 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 100.0d + "'", obj23, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        java.lang.Object[] objArray27 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray34 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!, 100.0]");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        tabelaHash15.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash15.retira("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash10.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[100.0]");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj19);
        tabelaHash0.insere("", (java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        tabelaHash3.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash3.retira("");
        java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
        tabelaHash3.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.imprime();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 100.0d + "'", obj11, 100.0d);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash19.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash30.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray38 = tabelaHash30.recuperaItens();
        tabelaHash30.imprime();
        java.lang.Object[] objArray40 = tabelaHash30.recuperaItens();
        java.lang.Object obj42 = tabelaHash30.pesquisa("");
        tabelaHash19.insere("", obj42);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        java.lang.Object[] objArray46 = tabelaHash45.recuperaItens();
        tabelaHash45.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash45.retira("");
        java.lang.Object obj53 = tabelaHash45.pesquisa("hi!");
        tabelaHash19.insere("", (java.lang.Object) tabelaHash45);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 100.0d + "'", obj53, 100.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100.0d + "'", obj16, 100.0d);
        org.junit.Assert.assertNotNull(objArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!, 100.0]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 10.0d);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", obj19);
        tabelaHash0.retira("");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 100.0d + "'", obj24, 100.0d);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash6.retira("hi!");
        tabelaHash6.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
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
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 100.0d + "'", obj9, 100.0d);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash11.retira("");
        java.lang.Object obj19 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj25);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        java.lang.Object[] objArray29 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash28.retira("");
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        java.lang.Class<?> wildcardClass38 = tabelaHash28.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass38);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[100.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) (-1L));
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.insere("", (java.lang.Object) "hi!");
        tabelaHash16.retira("");
        tabelaHash16.imprime();
        java.lang.Object[] objArray27 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        java.lang.Object[] objArray48 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash47.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray55 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash47.imprime();
        java.lang.Object[] objArray60 = tabelaHash47.recuperaItens();
        tabelaHash35.insere("", (java.lang.Object) tabelaHash47);
        tabelaHash47.insere("", (java.lang.Object) (byte) -1);
        tabelaHash16.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[100.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray60);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!, 100.0]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash6.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray14 = tabelaHash6.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        java.lang.Object[] objArray17 = tabelaHash16.recuperaItens();
        tabelaHash16.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash16.retira("");
        java.lang.Object obj24 = tabelaHash16.pesquisa("");
        java.lang.Class<?> wildcardClass25 = tabelaHash16.getClass();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray27 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[hi!, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(objArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[hi!, 100.0]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, hi!]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0]");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100.0d + "'", obj15, 100.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        java.lang.Object[] objArray18 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj28 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("hi!");
        java.lang.Object obj32 = tabelaHash17.pesquisa("hi!");
        tabelaHash0.insere("", obj32);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) 100.0d);
        tabelaHash35.retira("");
        java.lang.Object obj43 = tabelaHash35.pesquisa("");
        java.lang.Object[] objArray44 = tabelaHash35.recuperaItens();
        java.lang.Object obj46 = tabelaHash35.pesquisa("");
        java.lang.Object[] objArray47 = tabelaHash35.recuperaItens();
        java.lang.Object[] objArray48 = tabelaHash35.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[100.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 100.0d + "'", obj25, 100.0d);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100.0]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[100.0]");
    }
}
