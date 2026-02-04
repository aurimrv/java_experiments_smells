package ds.seed1448;

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
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
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
        java.lang.Class<?> wildcardClass20 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[a]");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
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
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
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
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
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
        java.lang.Class<?> wildcardClass19 = tabelaHash13.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
    }

    @Ignore
    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
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
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
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
        java.lang.Class<?> wildcardClass38 = objArray37.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
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
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
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
        tabelaHash13.retira("hi!");
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

    @Ignore
    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
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
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
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
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1 + "'", obj11, 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 100 + "'", obj16, 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
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
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
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
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
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
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Ignore
    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
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
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
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
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj12 = tabelaHash7.pesquisa("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash7.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
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
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, ]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[, ]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object[] objArray20 = tabelaHash16.recuperaItens();
        java.lang.Object obj22 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
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
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 0.0f + "'", obj20, 0.0f);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
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
        java.lang.Object obj27 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
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
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
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
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
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
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
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
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1 + "'", obj21, 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
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
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
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
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
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
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray26);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[]]");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", obj16);
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
    }

    @Ignore
    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
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
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
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
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
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
        tabelaHash0.retira("");
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
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
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
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
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
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.retira("hi!");
        java.lang.Object[] objArray33 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 0.0f);
        tabelaHash29.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) 0.0f);
        tabelaHash41.imprime();
        tabelaHash41.retira("");
        tabelaHash41.retira("hi!");
        tabelaHash41.retira("");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("", (java.lang.Object) 0.0f);
        tabelaHash53.imprime();
        tabelaHash53.retira("");
        tabelaHash53.retira("hi!");
        java.lang.Object obj63 = tabelaHash53.pesquisa("");
        tabelaHash41.insere("", (java.lang.Object) tabelaHash53);
        tabelaHash29.insere("", (java.lang.Object) "");
        java.lang.Object obj67 = tabelaHash29.pesquisa("");
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray73 = tabelaHash69.recuperaItens();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash69);
        java.lang.Object[] objArray75 = tabelaHash29.recuperaItens();
        java.lang.Class<?> wildcardClass76 = tabelaHash29.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "" + "'", obj67, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[0.0]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
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
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
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
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
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
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("", (java.lang.Object) 0.0f);
        tabelaHash2.imprime();
        tabelaHash2.retira("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[hi!]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
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
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash10.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
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
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj14 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("", obj14);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
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
        java.lang.Object obj63 = tabelaHash33.pesquisa("hi!");
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
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "" + "'", obj63, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray19);
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
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
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
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        java.lang.Object obj37 = tabelaHash31.pesquisa("");
        java.lang.Object obj39 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass43 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        java.lang.Object obj25 = null;
        tabelaHash17.insere("", obj25);
        tabelaHash17.retira("");
        tabelaHash14.insere("hi!", (java.lang.Object) "");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 0.0f + "'", obj23, 0.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        tabelaHash9.imprime();
        tabelaHash9.imprime();
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj18 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 0.0f + "'", obj18, 0.0f);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
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
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
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
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj9);
    }

    @Ignore
    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
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
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
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
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
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
        tabelaHash0.retira("hi!");
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
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("", (java.lang.Object) 0.0f);
        tabelaHash7.imprime();
        tabelaHash7.retira("");
        java.lang.Object obj15 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        tabelaHash17.imprime();
        tabelaHash17.retira("");
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.retira("hi!");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
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
        tabelaHash10.retira("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
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
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
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
        java.lang.Class<?> wildcardClass15 = tabelaHash10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray13 = tabelaHash9.recuperaItens();
        java.lang.Object obj15 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.retira("");
        tabelaHash19.imprime();
        java.lang.Class<?> wildcardClass23 = tabelaHash19.getClass();
        tabelaHash9.insere("hi!", (java.lang.Object) wildcardClass23);
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 0.0f + "'", obj15, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
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
        java.lang.Class<?> wildcardClass23 = tabelaHash10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        java.lang.Class<?> wildcardClass26 = tabelaHash14.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
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
        java.lang.Object[] objArray63 = tabelaHash25.recuperaItens();
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
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[0.0]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
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
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) '4');
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
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
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
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
        tabelaHash0.imprime();
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
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
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
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        java.lang.Object obj16 = tabelaHash10.pesquisa("hi!");
        tabelaHash0.insere("", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[1, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[1, null]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray51 = tabelaHash47.recuperaItens();
        java.lang.Object obj53 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj55 = tabelaHash47.pesquisa("hi!");
        tabelaHash40.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0.0]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0);
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj22 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        java.lang.Object obj25 = tabelaHash17.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash17.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) objArray26);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 0.0f + "'", obj25, 0.0f);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0.0]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray10 = tabelaHash6.recuperaItens();
        java.lang.Object obj12 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
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
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
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
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
    }

    @Ignore
    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
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
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
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
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
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
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
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
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
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
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.retira("");
        java.lang.Object[] objArray26 = tabelaHash22.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray26);
        tabelaHash0.retira("hi!");
        java.lang.Object obj31 = null;
        tabelaHash0.insere("hi!", obj31);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
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
        java.lang.Object obj27 = tabelaHash13.pesquisa("");
        java.lang.Object obj29 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 0.0f + "'", obj27, 0.0f);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
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
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object[] objArray14 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        java.lang.Object obj20 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        java.lang.Object obj23 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
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
        java.lang.Object obj24 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        tabelaHash23.imprime();
        tabelaHash23.retira("");
        tabelaHash23.retira("hi!");
        tabelaHash23.retira("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 0.0f);
        tabelaHash35.imprime();
        tabelaHash35.retira("");
        tabelaHash35.retira("hi!");
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash11.insere("", (java.lang.Object) "");
        java.lang.Object obj49 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        tabelaHash51.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray55 = tabelaHash51.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash51);
        java.lang.Object[] objArray57 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.imprime();
        tabelaHash59.retira("hi!");
        java.lang.Object[] objArray63 = tabelaHash59.recuperaItens();
        java.lang.Object[] objArray64 = tabelaHash59.recuperaItens();
        java.lang.Object obj66 = tabelaHash59.pesquisa("");
        tabelaHash11.insere("", obj66);
        java.lang.Object obj69 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash72 = new ds.TabelaHash();
        tabelaHash72.retira("");
        tabelaHash72.imprime();
        tabelaHash72.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj80 = tabelaHash72.pesquisa("hi!");
        java.lang.Class<?> wildcardClass81 = tabelaHash72.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash72);
        java.lang.Class<?> wildcardClass83 = tabelaHash72.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "" + "'", obj49, "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[0.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[, ]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertEquals("'" + obj69 + "' != '" + "" + "'", obj69, "");
        org.junit.Assert.assertEquals("'" + obj80 + "' != '" + 1 + "'", obj80, 1);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.insere("", (java.lang.Object) 0);
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        java.lang.Object obj13 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash15.recuperaItens();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
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
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj11);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
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
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
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
    }

    @Ignore
    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
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
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray35);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[, 1]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, 1]");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 1 + "'", obj38, 1);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = obj11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 0.0f + "'", obj13, 0.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
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
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray28 = tabelaHash24.recuperaItens();
        java.lang.Object obj30 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash24.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray31);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
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
        java.lang.Object obj23 = null;
        tabelaHash0.insere("", obj23);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
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
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 0.0f + "'", obj10, 0.0f);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
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
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
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
        tabelaHash10.retira("hi!");
        java.lang.Object obj25 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
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
    }

    @Ignore
    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
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
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
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
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        tabelaHash42.retira("hi!");
        tabelaHash42.retira("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) 0.0f);
        tabelaHash54.imprime();
        tabelaHash54.retira("");
        tabelaHash54.retira("hi!");
        java.lang.Object obj64 = tabelaHash54.pesquisa("");
        tabelaHash42.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash42.retira("hi!");
        tabelaHash42.retira("hi!");
        java.lang.Object obj71 = tabelaHash42.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray74 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(objArray74);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray18 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("hi!");
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj28 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        java.lang.Object obj31 = tabelaHash23.pesquisa("");
        java.lang.Object[] objArray32 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) tabelaHash36);
        tabelaHash13.insere("", (java.lang.Object) "");
        tabelaHash13.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object obj50 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0f + "'", obj31, 0.0f);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0.0f + "'", obj50, 0.0f);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass40 = objArray39.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[, ]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
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
        java.lang.Object obj20 = tabelaHash13.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
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
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = null;
        tabelaHash13.insere("", obj21);
        tabelaHash13.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        tabelaHash10.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
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
        java.lang.Object[] objArray50 = tabelaHash0.recuperaItens();
        java.lang.Object obj52 = tabelaHash0.pesquisa("hi!");
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
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[, ]");
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + "" + "'", obj52, "");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) (-1.0d));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
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
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass12 = tabelaHash8.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass12);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object obj17 = tabelaHash11.pesquisa("");
        java.lang.Object obj19 = null;
        tabelaHash11.insere("", obj19);
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        tabelaHash26.imprime();
        tabelaHash26.retira("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray36 = tabelaHash32.recuperaItens();
        java.lang.Object obj38 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("hi!");
        tabelaHash26.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash11.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0f + "'", obj17, 0.0f);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
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
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
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
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
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
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("", (java.lang.Object) 0.0f);
        tabelaHash2.imprime();
        tabelaHash2.retira("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
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
        java.lang.Object[] objArray73 = tabelaHash36.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[, ]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1, ]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1, ]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
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
        tabelaHash10.retira("hi!");
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
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
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
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
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 0.0f + "'", obj12, 0.0f);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj11 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        java.lang.Object obj23 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[0.0]");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = null;
        tabelaHash0.insere("", obj9);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
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
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        tabelaHash5.imprime();
        tabelaHash5.imprime();
        tabelaHash5.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash5);
        tabelaHash5.retira("");
        java.lang.Object[] objArray16 = tabelaHash5.recuperaItens();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
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
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.retira("");
        tabelaHash32.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj40 = tabelaHash32.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray46 = tabelaHash42.recuperaItens();
        java.lang.Object obj48 = tabelaHash42.pesquisa("");
        java.lang.Object obj50 = null;
        tabelaHash42.insere("", obj50);
        java.lang.Object[] objArray52 = tabelaHash42.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash42);
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.retira("");
        tabelaHash55.imprime();
        java.lang.Object obj60 = tabelaHash55.pesquisa("");
        tabelaHash32.insere("hi!", obj60);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        java.lang.Object[] objArray65 = tabelaHash63.recuperaItens();
        java.lang.Object[] objArray66 = tabelaHash63.recuperaItens();
        tabelaHash63.retira("hi!");
        java.lang.Object[] objArray69 = tabelaHash63.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash63);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
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
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 1 + "'", obj40, 1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + 0.0f + "'", obj48, 0.0f);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0.0]");
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
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
        tabelaHash25.retira("hi!");
        java.lang.Object obj41 = tabelaHash25.pesquisa("hi!");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 0.0f + "'", obj8, 0.0f);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
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
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj22 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0f + "'", obj22, 0.0f);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
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
        java.lang.Object obj29 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash31.retira("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        tabelaHash42.retira("hi!");
        tabelaHash42.retira("");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        tabelaHash54.insere("", (java.lang.Object) 0.0f);
        tabelaHash54.imprime();
        tabelaHash54.retira("");
        tabelaHash54.retira("hi!");
        java.lang.Object obj64 = tabelaHash54.pesquisa("");
        tabelaHash42.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash42.retira("hi!");
        tabelaHash42.retira("hi!");
        java.lang.Object obj71 = tabelaHash42.pesquisa("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object obj75 = tabelaHash0.pesquisa("");
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
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + "hi!" + "'", obj75, "hi!");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
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
        java.lang.Class<?> wildcardClass40 = tabelaHash14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
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
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
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
        java.lang.Object[] objArray23 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray23);
        tabelaHash0.imprime();
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
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
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
        tabelaHash0.imprime();
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
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
        java.lang.Object obj21 = null;
        tabelaHash0.insere("", obj21);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
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
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
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
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
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
        java.lang.Object[] objArray53 = tabelaHash0.recuperaItens();
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
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) 100);
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
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
        java.lang.Object obj16 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
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
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
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
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        java.lang.Object obj26 = tabelaHash12.pesquisa("");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
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
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
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
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass43 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("", (java.lang.Object) 0.0f);
        tabelaHash2.imprime();
        tabelaHash2.retira("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj36 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        java.lang.Object obj16 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj16);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0, null, null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0, null, null]");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
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
        tabelaHash23.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("");
        java.lang.Object[] objArray36 = tabelaHash23.recuperaItens();
        tabelaHash23.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0f + "'", obj32, 0.0f);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        java.lang.Object obj21 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) 0.0f);
        tabelaHash24.imprime();
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        java.lang.Object obj34 = tabelaHash24.pesquisa("");
        tabelaHash24.imprime();
        java.lang.Object[] objArray36 = tabelaHash24.recuperaItens();
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        java.lang.Object[] objArray39 = tabelaHash24.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.retira("");
        tabelaHash29.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj37 = tabelaHash29.pesquisa("");
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        tabelaHash29.retira("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        tabelaHash43.imprime();
        java.lang.Object[] objArray47 = tabelaHash43.recuperaItens();
        java.lang.Object obj49 = tabelaHash43.pesquisa("");
        java.lang.Object obj51 = tabelaHash43.pesquisa("hi!");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.retira("");
        tabelaHash53.imprime();
        tabelaHash53.retira("hi!");
        tabelaHash53.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Object[] objArray62 = tabelaHash29.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray62);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.insere("", (java.lang.Object) 0.0f);
        tabelaHash2.imprime();
        tabelaHash2.retira("");
        tabelaHash2.imprime();
        tabelaHash2.insere("hi!", (java.lang.Object) 10L);
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.retira("");
        tabelaHash14.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object[] objArray24 = tabelaHash22.recuperaItens();
        tabelaHash14.insere("hi!", (java.lang.Object) objArray24);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray31 = tabelaHash27.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[0.0]");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        tabelaHash14.imprime();
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        java.lang.Object obj20 = tabelaHash14.pesquisa("");
        java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.retira("");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash24);
        java.lang.Class<?> wildcardClass33 = tabelaHash24.getClass();
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
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
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
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
        tabelaHash0.retira("");
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
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        java.lang.Object[] objArray25 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray26 = tabelaHash23.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj34 = tabelaHash29.pesquisa("hi!");
        tabelaHash29.imprime();
        tabelaHash29.retira("hi!");
        java.lang.Object[] objArray38 = tabelaHash29.recuperaItens();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj43 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[0.0]");
        org.junit.Assert.assertNotNull(obj43);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
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
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.imprime();
        tabelaHash40.retira("");
        tabelaHash40.retira("");
        tabelaHash31.insere("", (java.lang.Object) tabelaHash40);
        java.lang.Class<?> wildcardClass53 = tabelaHash40.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
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
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.retira("hi!");
        java.lang.Object[] objArray52 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray53 = tabelaHash48.recuperaItens();
        java.lang.Object obj55 = tabelaHash48.pesquisa("");
        tabelaHash0.insere("", obj55);
        java.lang.Class<?> wildcardClass57 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[, ]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0]");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
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
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
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
        java.lang.Object obj38 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray44 = tabelaHash40.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.retira("");
        java.lang.Object[] objArray48 = tabelaHash40.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "" + "'", obj38, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[0.0]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[0.0]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        tabelaHash12.imprime();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = null;
        tabelaHash0.insere("hi!", obj8);
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
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
        tabelaHash0.retira("hi!");
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
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
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
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
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
        tabelaHash0.retira("");
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
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash8.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash14);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) 0.0f);
        tabelaHash27.imprime();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[0.0]");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        java.lang.Object obj20 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash14.pesquisa("hi!");
        java.lang.Object obj24 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray30 = tabelaHash26.recuperaItens();
        java.lang.Object obj32 = tabelaHash26.pesquisa("");
        java.lang.Object obj34 = null;
        tabelaHash26.insere("", obj34);
        java.lang.Object[] objArray36 = tabelaHash26.recuperaItens();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash26);
        java.lang.Object obj39 = null;
        tabelaHash14.insere("hi!", obj39);
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) 0.0f);
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        tabelaHash42.retira("");
        java.lang.Class<?> wildcardClass52 = tabelaHash42.getClass();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 0.0f + "'", obj32, 0.0f);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Ignore
    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
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
        tabelaHash16.imprime();
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
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
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
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
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
        tabelaHash0.retira("hi!");
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
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        java.lang.Object obj33 = null;
        tabelaHash25.insere("", obj33);
        java.lang.Object[] objArray35 = tabelaHash25.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 0.0f + "'", obj31, 0.0f);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0]");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
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
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
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
        tabelaHash11.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        tabelaHash14.retira("hi!");
        java.lang.Object obj19 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass25 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.retira("");
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        java.lang.Object[] objArray33 = tabelaHash27.recuperaItens();
        java.lang.Object obj35 = tabelaHash27.pesquisa("");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.retira("");
        tabelaHash37.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj45 = tabelaHash37.pesquisa("");
        java.lang.Object obj47 = tabelaHash37.pesquisa("");
        tabelaHash37.retira("hi!");
        tabelaHash27.insere("", (java.lang.Object) "hi!");
        tabelaHash27.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass53 = tabelaHash10.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Ignore
    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[, ]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
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
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("");
        tabelaHash9.imprime();
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.retira("hi!");
        tabelaHash9.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 0.0f + "'", obj7, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
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
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) 0.0f);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        java.lang.Object obj16 = tabelaHash8.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) 0.0f);
        tabelaHash18.imprime();
        tabelaHash18.retira("");
        java.lang.Object obj26 = tabelaHash18.pesquisa("");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass28 = tabelaHash8.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass28);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0.0]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
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
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
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
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
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
        java.lang.Object[] objArray33 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass34 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
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
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
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
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray9 = tabelaHash5.recuperaItens();
        java.lang.Object obj11 = tabelaHash5.pesquisa("");
        java.lang.Object obj13 = null;
        tabelaHash5.insere("", obj13);
        java.lang.Object[] objArray15 = tabelaHash5.recuperaItens();
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
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
        tabelaHash16.imprime();
        tabelaHash16.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = obj13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
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
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.insere("hi!", (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
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
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
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
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray52 = tabelaHash48.recuperaItens();
        java.lang.Object obj54 = tabelaHash48.pesquisa("");
        java.lang.Object obj56 = null;
        tabelaHash48.insere("", obj56);
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        java.lang.Object obj62 = tabelaHash48.pesquisa("hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray68 = tabelaHash64.recuperaItens();
        tabelaHash64.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj73 = tabelaHash64.pesquisa("");
        tabelaHash48.insere("hi!", (java.lang.Object) "");
        tabelaHash48.imprime();
        tabelaHash40.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object[] objArray78 = tabelaHash0.recuperaItens();
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
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 0.0f + "'", obj54, 0.0f);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 0.0f + "'", obj73, 0.0f);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[0.0, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[0.0, ]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
    }

    @Ignore
    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
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
        tabelaHash0.retira("");
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 0.0f + "'", obj14, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 1 + "'", obj23, 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
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
        java.lang.Object[] objArray44 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[0.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
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
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
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
        tabelaHash10.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) 0.0f);
        tabelaHash30.imprime();
        tabelaHash30.imprime();
        tabelaHash30.retira("");
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash10.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
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
        tabelaHash34.imprime();
        tabelaHash34.imprime();
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
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
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
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[0.0]");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        java.lang.Object obj24 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
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
        java.lang.Class<?> wildcardClass34 = objArray33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object[] objArray10 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray10);
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        java.lang.Object obj21 = tabelaHash16.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
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
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
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
        java.lang.Object[] objArray26 = tabelaHash20.recuperaItens();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
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
        tabelaHash33.retira("hi!");
        tabelaHash33.imprime();
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
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
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
        tabelaHash0.retira("");
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
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
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
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
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) 0.0f);
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.retira("");
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash25);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 0.0f + "'", obj11, 0.0f);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray16 = tabelaHash12.recuperaItens();
        java.lang.Object obj18 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash12.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash12.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash12.getClass();
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[0.0]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
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
        java.lang.Class<?> wildcardClass41 = tabelaHash28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
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
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
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
        tabelaHash0.retira("");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
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
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
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
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.retira("");
        tabelaHash25.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) 1);
        java.lang.Object obj33 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray39 = tabelaHash35.recuperaItens();
        java.lang.Object obj41 = tabelaHash35.pesquisa("");
        java.lang.Object obj43 = null;
        tabelaHash35.insere("", obj43);
        java.lang.Object[] objArray45 = tabelaHash35.recuperaItens();
        tabelaHash25.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.retira("");
        tabelaHash48.imprime();
        java.lang.Object obj53 = tabelaHash48.pesquisa("");
        tabelaHash25.insere("hi!", obj53);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        java.lang.Object[] objArray60 = tabelaHash56.recuperaItens();
        java.lang.Object obj62 = tabelaHash56.pesquisa("");
        java.lang.Object obj64 = tabelaHash56.pesquisa("hi!");
        java.lang.Object obj66 = tabelaHash56.pesquisa("hi!");
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj69 = tabelaHash25.pesquisa("");
        tabelaHash5.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1 + "'", obj33, 1);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 0.0f + "'", obj41, 0.0f);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[0.0]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(obj69);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
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
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) 0.0f);
        tabelaHash10.imprime();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Object obj20 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        tabelaHash25.imprime();
        java.lang.Object[] objArray29 = tabelaHash25.recuperaItens();
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        java.lang.Object obj33 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.retira("");
        tabelaHash35.imprime();
        tabelaHash35.retira("hi!");
        tabelaHash35.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash35);
        tabelaHash25.retira("hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash25);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
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
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 0.0f + "'", obj22, 0.0f);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[, 1]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[, 1]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[0]");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.retira("");
        tabelaHash10.imprime();
        tabelaHash10.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash10.insere("hi!", (java.lang.Object) objArray20);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray27 = tabelaHash23.recuperaItens();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        tabelaHash30.retira("");
        java.lang.Object[] objArray34 = tabelaHash30.recuperaItens();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object obj37 = tabelaHash30.pesquisa("hi!");
        tabelaHash0.insere("", obj37);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
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
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
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
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
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
        tabelaHash0.imprime();
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
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
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
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        java.lang.Object obj37 = tabelaHash31.pesquisa("");
        java.lang.Object obj39 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj44 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1 + "'", obj8, 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0.0f + "'", obj16, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = tabelaHash13.recuperaItens();
        java.lang.Object obj19 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray22 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[0.0]");
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = null;
        tabelaHash0.insere("", obj8);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray18 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray19 = tabelaHash14.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash14.recuperaItens();
        java.lang.Class<?> wildcardClass21 = tabelaHash14.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[class ds.TabelaHash]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
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
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
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
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
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
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
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
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
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
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0.0f + "'", obj6, 0.0f);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
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
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) 0.0f);
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) 0.0f);
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        tabelaHash15.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[0.0]");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[0.0]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
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
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[0.0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 0.0f + "'", obj9, 0.0f);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }
}
