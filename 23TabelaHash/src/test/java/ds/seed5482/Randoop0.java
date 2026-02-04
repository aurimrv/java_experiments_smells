package ds.seed5482;

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
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = obj3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("", obj11);
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[[-1]]");
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        java.lang.Object obj15 = tabelaHash11.pesquisa("");
        java.lang.Object obj17 = new java.lang.Object();
        tabelaHash11.insere("hi!", obj17);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass21 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Class<?> wildcardClass14 = tabelaHash12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass22 = tabelaHash10.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash4.imprime();
        java.lang.Object[] objArray11 = tabelaHash4.recuperaItens();
        tabelaHash4.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object[] objArray15 = tabelaHash4.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray15);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, a]");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass45 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass22 = objArray21.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash31.recuperaItens();
        java.lang.Object obj35 = tabelaHash31.pesquisa("");
        java.lang.Object obj37 = new java.lang.Object();
        tabelaHash31.insere("hi!", obj37);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass40 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash12.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj37 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Object[] objArray39 = tabelaHash12.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) -1 + "'", obj27, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj6);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        tabelaHash25.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj40 = tabelaHash35.pesquisa("");
        java.lang.Object obj42 = tabelaHash35.pesquisa("");
        tabelaHash35.retira("");
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Class<?> wildcardClass46 = tabelaHash25.getClass();
        tabelaHash10.insere("", (java.lang.Object) wildcardClass46);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) -1 + "'", obj40, (short) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object obj23 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("");
        java.lang.Object obj29 = tabelaHash21.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash21.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = null;
        tabelaHash0.insere("", obj12);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("");
        java.lang.Object obj35 = null;
        tabelaHash24.insere("", obj35);
        java.lang.Object obj38 = tabelaHash24.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("");
        java.lang.Object obj43 = tabelaHash24.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) -1 + "'", obj31, (short) -1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj18 = tabelaHash9.pesquisa("");
        java.lang.Object obj20 = tabelaHash9.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Object obj11 = null;
        tabelaHash0.insere("hi!", obj11);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = null;
        tabelaHash0.insere("", obj11);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) 100L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) ' ');
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object obj30 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.imprime();
        tabelaHash27.retira("hi!");
        java.lang.Object obj35 = tabelaHash27.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj42 = tabelaHash37.pesquisa("");
        tabelaHash37.imprime();
        java.lang.Object obj45 = tabelaHash37.pesquisa("hi!");
        tabelaHash37.imprime();
        tabelaHash27.insere("", (java.lang.Object) tabelaHash37);
        tabelaHash37.imprime();
        java.lang.Object obj50 = tabelaHash37.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) -1 + "'", obj50, (short) -1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        java.lang.Object[] objArray18 = tabelaHash12.recuperaItens();
        tabelaHash12.imprime();
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        tabelaHash12.retira("");
        tabelaHash12.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1]");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj32 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass30 = tabelaHash9.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass30);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash34.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass24 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash27.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash21.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj46 = tabelaHash21.pesquisa("hi!");
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj57 = null;
        tabelaHash0.insere("hi!", obj57);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass2 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass23 = tabelaHash15.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash25.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1]");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[-1]]");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        tabelaHash21.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass35 = tabelaHash31.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray29 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray29);
        java.lang.Class<?> wildcardClass31 = objArray29.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("");
        java.lang.Object obj35 = null;
        tabelaHash24.insere("", obj35);
        java.lang.Object obj38 = tabelaHash24.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("");
        java.lang.Object[] objArray42 = tabelaHash24.recuperaItens();
        java.lang.Class<?> wildcardClass43 = objArray42.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) -1 + "'", obj31, (short) -1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash12.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        java.lang.Object obj10 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        java.lang.Object obj15 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj22 = tabelaHash17.pesquisa("");
        tabelaHash17.imprime();
        java.lang.Object obj25 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.imprime();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj29 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("", obj29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass36 = objArray35.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj25 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = obj25.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash25.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray35 = tabelaHash25.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash20.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) objArray26);
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj32 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Class<?> wildcardClass37 = tabelaHash17.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Class<?> wildcardClass41 = tabelaHash28.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj42 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash20.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) objArray26);
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj32 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray37 = tabelaHash17.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        java.lang.Object[] objArray47 = tabelaHash41.recuperaItens();
        tabelaHash41.imprime();
        java.lang.Object[] objArray49 = tabelaHash41.recuperaItens();
        tabelaHash41.retira("");
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        tabelaHash53.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj68 = tabelaHash63.pesquisa("");
        java.lang.Object obj70 = tabelaHash63.pesquisa("");
        tabelaHash63.retira("");
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash63);
        java.lang.Object[] objArray74 = tabelaHash63.recuperaItens();
        java.lang.Object[] objArray75 = tabelaHash63.recuperaItens();
        ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
        java.lang.Object[] objArray78 = tabelaHash77.recuperaItens();
        java.lang.Object obj80 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.imprime();
        tabelaHash77.retira("hi!");
        java.lang.Object obj85 = tabelaHash77.pesquisa("");
        java.lang.Object obj87 = tabelaHash77.pesquisa("hi!");
        tabelaHash77.retira("");
        tabelaHash63.insere("hi!", (java.lang.Object) tabelaHash77);
        tabelaHash41.insere("", (java.lang.Object) "hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash41);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) -1 + "'", obj46, (short) -1);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[-1]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + (short) -1 + "'", obj68, (short) -1);
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + (short) -1 + "'", obj70, (short) -1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[]");
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        tabelaHash8.imprime();
        java.lang.Object obj16 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object obj20 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj22 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("");
        tabelaHash18.insere("", (java.lang.Object) (-1.0f));
        tabelaHash8.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj30 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray31 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (-1.0f) + "'", obj30, (-1.0f));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1, -1.0]");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        java.lang.Object obj41 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash10.recuperaItens();
        java.lang.Object obj26 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass23 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("");
        tabelaHash33.insere("", (java.lang.Object) (-1.0f));
        tabelaHash23.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj45 = tabelaHash23.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash23);
        java.lang.Class<?> wildcardClass47 = tabelaHash23.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) -1 + "'", obj28, (short) -1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        tabelaHash21.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Class<?> wildcardClass35 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj20 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray22);
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass22 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray17 = tabelaHash8.recuperaItens();
        java.lang.Object obj19 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray20);
        tabelaHash0.imprime();
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass33 = tabelaHash24.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash24.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass10 = objArray9.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("");
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[[-1]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray16 = tabelaHash10.recuperaItens();
        tabelaHash10.imprime();
        java.lang.Object obj19 = new java.lang.Object();
        tabelaHash10.insere("hi!", obj19);
        tabelaHash0.insere("", obj19);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[[-1]]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[-1]]");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj15 = tabelaHash12.pesquisa("");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        java.lang.Object obj41 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj48 = tabelaHash43.pesquisa("");
        tabelaHash43.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        java.lang.Object obj60 = tabelaHash53.pesquisa("");
        tabelaHash53.retira("");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        java.lang.Object obj65 = tabelaHash43.pesquisa("hi!");
        java.lang.Object[] objArray66 = tabelaHash43.recuperaItens();
        java.lang.Object obj68 = tabelaHash43.pesquisa("hi!");
        tabelaHash10.insere("", obj68);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) -1 + "'", obj48, (short) -1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) -1 + "'", obj60, (short) -1);
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(obj68);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass26 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash12.imprime();
        tabelaHash12.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        tabelaHash21.retira("hi!");
        tabelaHash18.insere("", (java.lang.Object) "hi!");
        tabelaHash10.insere("", (java.lang.Object) tabelaHash18);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        tabelaHash12.imprime();
        java.lang.Object[] objArray20 = tabelaHash12.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        java.lang.Object obj26 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        java.lang.Object obj24 = tabelaHash10.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj6);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash20.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) objArray26);
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj32 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash0.retira("hi!");
        java.lang.Object obj40 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) -1 + "'", obj40, (short) -1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        java.lang.Object obj26 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("");
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        java.lang.Class<?> wildcardClass32 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        tabelaHash41.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray50 = tabelaHash41.recuperaItens();
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        java.lang.Object[] objArray53 = tabelaHash41.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass55 = tabelaHash24.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) -1 + "'", obj46, (short) -1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[-1]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1, -1.0]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object[] objArray55 = tabelaHash54.recuperaItens();
        java.lang.Object[] objArray56 = tabelaHash54.recuperaItens();
        tabelaHash54.retira("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj65 = tabelaHash60.pesquisa("");
        tabelaHash60.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj75 = tabelaHash70.pesquisa("");
        java.lang.Object obj77 = tabelaHash70.pesquisa("");
        tabelaHash70.retira("");
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash70);
        java.lang.Object obj82 = tabelaHash60.pesquisa("hi!");
        tabelaHash54.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (short) -1 + "'", obj75, (short) -1);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (short) -1 + "'", obj77, (short) -1);
        org.junit.Assert.assertNotNull(obj82);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.imprime();
        java.lang.Class<?> wildcardClass46 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
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
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash33.retira("hi!");
        java.lang.Object[] objArray47 = tabelaHash33.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[-1]");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj55 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + (short) -1 + "'", obj55, (short) -1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        tabelaHash10.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("");
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        java.lang.Object obj49 = null;
        tabelaHash38.insere("", obj49);
        java.lang.Object obj52 = tabelaHash38.pesquisa("");
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash38);
        tabelaHash38.retira("");
        tabelaHash38.retira("");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) -1 + "'", obj31, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        java.lang.Object obj6 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj6);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray17 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object obj28 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash26.pesquisa("hi!");
        tabelaHash26.retira("");
        tabelaHash26.insere("", (java.lang.Object) (-1.0f));
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash26);
        tabelaHash26.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = null;
        tabelaHash0.insere("hi!", obj9);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash34.retira("");
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash24.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj49 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        java.lang.Object[] objArray51 = tabelaHash24.recuperaItens();
        java.lang.Object obj53 = tabelaHash24.pesquisa("hi!");
        tabelaHash12.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) -1 + "'", obj39, (short) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) -1 + "'", obj41, (short) -1);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(obj53);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object[] objArray55 = tabelaHash54.recuperaItens();
        java.lang.Object[] objArray56 = tabelaHash54.recuperaItens();
        java.lang.Object obj58 = tabelaHash54.pesquisa("");
        java.lang.Object obj60 = new java.lang.Object();
        tabelaHash54.insere("hi!", obj60);
        java.lang.Class<?> wildcardClass62 = tabelaHash54.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash54);
        java.lang.Object obj65 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        java.lang.Object obj27 = tabelaHash10.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = obj27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass19 = tabelaHash8.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass19);
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        java.lang.Object[] objArray40 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj43 = new java.lang.Object();
        tabelaHash34.insere("hi!", obj43);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) -1 + "'", obj39, (short) -1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray25);
        java.lang.Object obj28 = tabelaHash6.pesquisa("");
        java.lang.Object[] objArray29 = tabelaHash6.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[-1]]");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash10.recuperaItens();
        java.lang.Object obj26 = tabelaHash10.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Class<?> wildcardClass37 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash4.insere("", (java.lang.Object) 100.0d);
        tabelaHash4.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray30 = tabelaHash19.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj42 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray43 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash33.pesquisa("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        java.lang.Object[] objArray51 = tabelaHash50.recuperaItens();
        java.lang.Object obj53 = tabelaHash50.pesquisa("hi!");
        tabelaHash50.imprime();
        tabelaHash50.retira("hi!");
        java.lang.Object obj58 = tabelaHash50.pesquisa("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj65 = tabelaHash60.pesquisa("");
        tabelaHash60.imprime();
        java.lang.Object obj68 = tabelaHash60.pesquisa("hi!");
        tabelaHash60.imprime();
        tabelaHash50.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash60.imprime();
        java.lang.Object[] objArray72 = tabelaHash60.recuperaItens();
        java.lang.Class<?> wildcardClass73 = objArray72.getClass();
        tabelaHash33.insere("", (java.lang.Object) wildcardClass73);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) -1 + "'", obj48, (short) -1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Object obj27 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash6.pesquisa("hi!");
        java.lang.Class<?> wildcardClass47 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.insere("", (java.lang.Object) 100.0d);
        tabelaHash61.retira("hi!");
        tabelaHash57.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass74 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (short) -1 + "'", obj66, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("hi!");
        java.lang.Object[] objArray49 = tabelaHash6.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[[-1]]");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass40 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        java.lang.Object[] objArray26 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj4 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray23);
        tabelaHash15.retira("");
        java.lang.Object[] objArray27 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.imprime();
        java.lang.Object[] objArray46 = tabelaHash6.recuperaItens();
        java.lang.Class<?> wildcardClass47 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[[-1]]");
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray25);
        java.lang.Object obj28 = tabelaHash6.pesquisa("");
        java.lang.Object obj30 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray40 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object[] objArray26 = tabelaHash20.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) objArray26);
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) tabelaHash17);
        java.lang.Object obj32 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash17.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1]");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        java.lang.Object obj41 = null;
        tabelaHash24.insere("hi!", obj41);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        java.lang.Object obj31 = tabelaHash24.pesquisa("");
        tabelaHash24.retira("");
        java.lang.Object obj35 = null;
        tabelaHash24.insere("", obj35);
        java.lang.Object obj38 = tabelaHash24.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("");
        java.lang.Object[] objArray42 = tabelaHash24.recuperaItens();
        tabelaHash24.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) -1 + "'", obj31, (short) -1);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray37 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj41 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        java.lang.Object[] objArray29 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray29);
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object obj18 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        tabelaHash15.retira("hi!");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object obj27 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash25.pesquisa("hi!");
        tabelaHash25.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        java.lang.Object[] objArray37 = tabelaHash36.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("");
        tabelaHash36.retira("hi!");
        tabelaHash33.insere("", (java.lang.Object) "hi!");
        tabelaHash25.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        java.lang.Object[] objArray47 = tabelaHash46.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash46);
        tabelaHash15.insere("", (java.lang.Object) tabelaHash46);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash33.retira("hi!");
        java.lang.Object obj48 = tabelaHash33.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) -1 + "'", obj48, (short) -1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray17 = tabelaHash8.recuperaItens();
        java.lang.Object obj19 = tabelaHash8.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray20);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash11.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass16);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash12.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj37 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Object[] objArray39 = tabelaHash12.recuperaItens();
        java.lang.Object obj41 = tabelaHash12.pesquisa("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        java.lang.Object[] objArray44 = tabelaHash43.recuperaItens();
        java.lang.Object[] objArray45 = tabelaHash43.recuperaItens();
        java.lang.Object obj47 = tabelaHash43.pesquisa("");
        java.lang.Object obj49 = new java.lang.Object();
        tabelaHash43.insere("hi!", obj49);
        tabelaHash12.insere("", (java.lang.Object) tabelaHash43);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash43);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) -1 + "'", obj27, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        java.lang.Object obj25 = tabelaHash14.pesquisa("hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj32 = tabelaHash27.pesquisa("");
        java.lang.Object[] objArray33 = tabelaHash27.recuperaItens();
        tabelaHash27.imprime();
        java.lang.Object[] objArray35 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.imprime();
        tabelaHash27.retira("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj47 = tabelaHash42.pesquisa("");
        tabelaHash42.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj57 = tabelaHash52.pesquisa("");
        java.lang.Object obj59 = tabelaHash52.pesquisa("");
        tabelaHash52.retira("");
        tabelaHash42.insere("hi!", (java.lang.Object) tabelaHash52);
        java.lang.Object obj64 = tabelaHash42.pesquisa("hi!");
        tabelaHash27.insere("hi!", obj64);
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        java.lang.Object[] objArray69 = tabelaHash68.recuperaItens();
        java.lang.Object[] objArray70 = tabelaHash68.recuperaItens();
        java.lang.Object obj72 = tabelaHash68.pesquisa("");
        java.lang.Object obj74 = new java.lang.Object();
        tabelaHash68.insere("hi!", obj74);
        java.lang.Class<?> wildcardClass76 = tabelaHash68.getClass();
        tabelaHash14.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) -1 + "'", obj32, (short) -1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) -1 + "'", obj47, (short) -1);
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + (short) -1 + "'", obj57, (short) -1);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + (short) -1 + "'", obj59, (short) -1);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash33.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) -1 + "'", obj46, (short) -1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.retira("hi!");
        tabelaHash10.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj18 = null;
        tabelaHash0.insere("hi!", obj18);
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = new java.lang.Object();
        tabelaHash0.insere("hi!", obj9);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj22 = null;
        tabelaHash11.insere("", obj22);
        java.lang.Object obj25 = tabelaHash11.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("", obj3);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        java.lang.Object[] objArray10 = tabelaHash9.recuperaItens();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("", obj12);
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj18 = null;
        tabelaHash0.insere("hi!", obj18);
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        java.lang.Object obj15 = tabelaHash8.pesquisa("");
        tabelaHash8.retira("");
        java.lang.Object obj19 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray20);
        java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj23 = tabelaHash18.pesquisa("");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray29 = tabelaHash18.recuperaItens();
        java.lang.Object obj31 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("");
        java.lang.Object obj35 = tabelaHash18.pesquisa("");
        java.lang.Object[] objArray36 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        java.lang.Object[] objArray25 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object obj29 = tabelaHash27.pesquisa("hi!");
        java.lang.Object obj31 = tabelaHash27.pesquisa("hi!");
        tabelaHash27.retira("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        java.lang.Object[] objArray36 = tabelaHash35.recuperaItens();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object[] objArray39 = tabelaHash38.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("");
        tabelaHash38.retira("hi!");
        tabelaHash35.insere("", (java.lang.Object) "hi!");
        tabelaHash27.insere("", (java.lang.Object) tabelaHash35);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object[] objArray49 = tabelaHash48.recuperaItens();
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash35.imprime();
        tabelaHash10.insere("", (java.lang.Object) tabelaHash35);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object[] objArray20 = tabelaHash6.recuperaItens();
        java.lang.Object obj22 = tabelaHash6.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[[-1]]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, a]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray23);
        tabelaHash15.retira("");
        java.lang.Object[] objArray27 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object obj33 = tabelaHash31.pesquisa("hi!");
        tabelaHash31.imprime();
        java.lang.Object obj36 = tabelaHash31.pesquisa("hi!");
        tabelaHash0.insere("", obj36);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.imprime();
        java.lang.Object[] objArray46 = tabelaHash6.recuperaItens();
        java.lang.Object obj48 = tabelaHash6.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[[-1]]");
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object obj15 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.insere("hi!", (java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass19 = tabelaHash12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj31 = tabelaHash26.pesquisa("");
        java.lang.Object[] objArray32 = tabelaHash26.recuperaItens();
        tabelaHash26.imprime();
        java.lang.Object[] objArray34 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray35 = tabelaHash26.recuperaItens();
        tabelaHash6.insere("hi!", (java.lang.Object) objArray35);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (short) -1 + "'", obj31, (short) -1);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[-1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.imprime();
        java.lang.Class<?> wildcardClass23 = tabelaHash6.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        java.lang.Object[] objArray7 = tabelaHash6.recuperaItens();
        java.lang.Object obj9 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.imprime();
        tabelaHash6.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        java.lang.Object obj23 = tabelaHash14.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 0);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        java.lang.Object[] objArray40 = tabelaHash24.recuperaItens();
        java.lang.Object obj42 = tabelaHash24.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        java.lang.Object[] objArray32 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash31.recuperaItens();
        java.lang.Object obj35 = tabelaHash31.pesquisa("");
        java.lang.Object obj37 = new java.lang.Object();
        tabelaHash31.insere("hi!", obj37);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash31);
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        java.lang.Object obj43 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) -1 + "'", obj41, (short) -1);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        java.lang.Object obj41 = tabelaHash10.pesquisa("hi!");
        ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
        tabelaHash43.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj48 = tabelaHash43.pesquisa("");
        tabelaHash43.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj58 = tabelaHash53.pesquisa("");
        java.lang.Object obj60 = tabelaHash53.pesquisa("");
        tabelaHash53.retira("");
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash53);
        tabelaHash43.insere("", (java.lang.Object) (byte) 10);
        tabelaHash43.retira("");
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        java.lang.Object[] objArray71 = tabelaHash70.recuperaItens();
        java.lang.Object[] objArray72 = tabelaHash70.recuperaItens();
        tabelaHash70.retira("");
        tabelaHash70.retira("hi!");
        tabelaHash70.imprime();
        tabelaHash43.insere("hi!", (java.lang.Object) tabelaHash70);
        java.lang.Object obj80 = tabelaHash43.pesquisa("");
        java.lang.Object[] objArray81 = tabelaHash43.recuperaItens();
        tabelaHash43.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) -1 + "'", obj48, (short) -1);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + (short) -1 + "'", obj60, (short) -1);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        java.lang.Object obj18 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        tabelaHash11.retira("");
        tabelaHash11.imprime();
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj13 = tabelaHash8.pesquisa("");
        tabelaHash8.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj23 = tabelaHash18.pesquisa("");
        java.lang.Object obj25 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash8.imprime();
        tabelaHash8.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj37 = tabelaHash32.pesquisa("");
        tabelaHash32.insere("", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass41 = tabelaHash32.getClass();
        tabelaHash8.insere("", (java.lang.Object) tabelaHash32);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass44 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + (short) -1 + "'", obj13, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) -1 + "'", obj37, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        tabelaHash12.imprime();
        java.lang.Class<?> wildcardClass15 = tabelaHash12.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        java.lang.Object[] objArray19 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash18.recuperaItens();
        tabelaHash18.retira("");
        tabelaHash18.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash27);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        java.lang.Object[] objArray31 = tabelaHash30.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash30.recuperaItens();
        tabelaHash30.retira("");
        java.lang.Object obj36 = tabelaHash30.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) tabelaHash30);
        java.lang.Object obj39 = tabelaHash30.pesquisa("");
        tabelaHash0.insere("hi!", obj39);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray25);
        tabelaHash6.retira("");
        java.lang.Object obj30 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray34);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "hi!" + "'", obj37, "hi!");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj47 = tabelaHash42.pesquisa("");
        java.lang.Object obj49 = tabelaHash42.pesquisa("");
        tabelaHash42.retira("");
        tabelaHash42.retira("");
        tabelaHash42.imprime();
        java.lang.Object[] objArray55 = tabelaHash42.recuperaItens();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object obj58 = tabelaHash31.pesquisa("");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj65 = tabelaHash60.pesquisa("");
        tabelaHash60.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
        tabelaHash70.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj75 = tabelaHash70.pesquisa("");
        java.lang.Object obj77 = tabelaHash70.pesquisa("");
        tabelaHash70.retira("");
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash70);
        tabelaHash60.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj85 = tabelaHash60.pesquisa("hi!");
        java.lang.Object[] objArray86 = tabelaHash60.recuperaItens();
        tabelaHash60.retira("");
        java.lang.Object[] objArray89 = tabelaHash60.recuperaItens();
        java.lang.Class<?> wildcardClass90 = tabelaHash60.getClass();
        tabelaHash31.insere("", (java.lang.Object) tabelaHash60);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) -1 + "'", obj47, (short) -1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + (short) -1 + "'", obj49, (short) -1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + (short) -1 + "'", obj75, (short) -1);
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + (short) -1 + "'", obj77, (short) -1);
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj31 = null;
        tabelaHash0.insere("", obj31);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object[] objArray16 = tabelaHash14.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) objArray16);
        tabelaHash8.retira("");
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray20);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = obj23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object obj12 = tabelaHash10.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        tabelaHash10.insere("", (java.lang.Object) (-1.0f));
        tabelaHash0.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1, -1.0]");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) -1 + "'", obj28, (short) -1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        tabelaHash19.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.retira("");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj41 = tabelaHash19.pesquisa("hi!");
        java.lang.Object[] objArray42 = tabelaHash19.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) objArray42);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) -1 + "'", obj34, (short) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash4.insere("", (java.lang.Object) 100.0d);
        tabelaHash4.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object obj21 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj23 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj31 = tabelaHash19.pesquisa("");
        tabelaHash19.imprime();
        java.lang.Object obj34 = tabelaHash19.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        tabelaHash24.retira("");
        tabelaHash24.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        java.lang.Object[] objArray31 = tabelaHash25.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) tabelaHash25);
        java.lang.Object obj34 = null;
        tabelaHash25.insere("hi!", obj34);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash25.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object obj23 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj32 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj42 = tabelaHash37.pesquisa("");
        java.lang.Object obj44 = tabelaHash37.pesquisa("");
        tabelaHash37.retira("");
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray48 = tabelaHash37.recuperaItens();
        java.lang.Object[] objArray49 = tabelaHash37.recuperaItens();
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object[] objArray52 = tabelaHash51.recuperaItens();
        java.lang.Object obj54 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.imprime();
        tabelaHash51.retira("hi!");
        java.lang.Object obj59 = tabelaHash51.pesquisa("");
        java.lang.Object obj61 = tabelaHash51.pesquisa("hi!");
        tabelaHash51.retira("");
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash51.retira("hi!");
        ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
        tabelaHash68.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj73 = tabelaHash68.pesquisa("");
        tabelaHash68.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray77 = tabelaHash68.recuperaItens();
        java.lang.Object obj79 = tabelaHash68.pesquisa("hi!");
        java.lang.Object[] objArray80 = tabelaHash68.recuperaItens();
        tabelaHash51.insere("", (java.lang.Object) tabelaHash68);
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash51);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) -1 + "'", obj32, (short) -1);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (short) -1 + "'", obj42, (short) -1);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + (short) -1 + "'", obj44, (short) -1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + (short) -1 + "'", obj73, (short) -1);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[-1]");
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[-1]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object obj17 = tabelaHash15.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash15.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object[] objArray23 = tabelaHash21.recuperaItens();
        tabelaHash15.insere("", (java.lang.Object) objArray23);
        tabelaHash15.retira("");
        java.lang.Object[] objArray27 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray29 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        java.lang.Object[] objArray26 = tabelaHash25.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("");
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object obj10 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj12 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object[] objArray16 = tabelaHash14.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) objArray16);
        tabelaHash8.retira("");
        java.lang.Object[] objArray20 = tabelaHash8.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray20);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
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
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        java.lang.Object obj26 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (short) 100);
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 100.0f);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash10.retira("");
        java.lang.Object obj41 = tabelaHash10.pesquisa("hi!");
        java.lang.Class<?> wildcardClass42 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash6.recuperaItens();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        tabelaHash15.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        java.lang.Object obj32 = tabelaHash25.pesquisa("");
        tabelaHash25.retira("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash25);
        tabelaHash25.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj45 = tabelaHash40.pesquisa("");
        java.lang.Object[] objArray46 = tabelaHash40.recuperaItens();
        tabelaHash40.imprime();
        java.lang.Object obj49 = new java.lang.Object();
        tabelaHash40.insere("hi!", obj49);
        tabelaHash6.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        tabelaHash6.imprime();
        tabelaHash6.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + (short) -1 + "'", obj30, (short) -1);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (short) -1 + "'", obj32, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[-1]");
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        tabelaHash14.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray23 = tabelaHash14.recuperaItens();
        java.lang.Object obj25 = tabelaHash14.pesquisa("");
        tabelaHash14.retira("hi!");
        java.lang.Object obj29 = tabelaHash14.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj29);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) -1 + "'", obj19, (short) -1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[-1]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray14 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash10.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray15);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) -1 + "'", obj48, (short) -1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj36 = tabelaHash31.pesquisa("");
        java.lang.Object obj38 = tabelaHash31.pesquisa("");
        tabelaHash31.retira("");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash31);
        tabelaHash21.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object[] objArray45 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) 10L);
        java.lang.Object[] objArray49 = tabelaHash21.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) objArray49);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object obj41 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj43 = tabelaHash39.pesquisa("hi!");
        tabelaHash39.retira("");
        java.lang.Object obj47 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj54 = tabelaHash49.pesquisa("");
        tabelaHash49.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj59 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        java.lang.Object[] objArray61 = tabelaHash49.recuperaItens();
        tabelaHash39.insere("", (java.lang.Object) objArray61);
        tabelaHash0.insere("hi!", (java.lang.Object) objArray61);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) -1 + "'", obj54, (short) -1);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[-1]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, a]");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray17 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        tabelaHash20.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj35 = tabelaHash30.pesquisa("");
        java.lang.Object obj37 = tabelaHash30.pesquisa("");
        tabelaHash30.retira("");
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash30);
        tabelaHash30.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj50 = tabelaHash45.pesquisa("");
        java.lang.Object[] objArray51 = tabelaHash45.recuperaItens();
        tabelaHash45.imprime();
        java.lang.Object obj54 = new java.lang.Object();
        tabelaHash45.insere("hi!", obj54);
        tabelaHash11.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj58 = tabelaHash11.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1]");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + (short) -1 + "'", obj35, (short) -1);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (short) -1 + "'", obj37, (short) -1);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + (short) -1 + "'", obj50, (short) -1);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[-1]");
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + (short) -1 + "'", obj58, (short) -1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash21.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray25);
        java.lang.Object obj28 = tabelaHash6.pesquisa("");
        tabelaHash6.imprime();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj28 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray34);
        java.lang.Object obj37 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass40 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "hi!" + "'", obj37, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        java.lang.Object obj41 = tabelaHash34.pesquisa("");
        tabelaHash34.retira("");
        java.lang.Object obj45 = null;
        tabelaHash34.insere("", obj45);
        java.lang.Object obj48 = tabelaHash34.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) -1 + "'", obj39, (short) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) -1 + "'", obj41, (short) -1);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash6.recuperaItens();
        tabelaHash3.insere("", (java.lang.Object) objArray12);
        tabelaHash3.imprime();
        java.lang.Object[] objArray15 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray15);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[[-1]]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object obj6 = null;
        tabelaHash0.insere("", obj6);
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null]");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        tabelaHash10.imprime();
        java.lang.Object obj18 = tabelaHash10.pesquisa("hi!");
        tabelaHash10.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash24.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) tabelaHash36);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        java.lang.Object[] objArray40 = tabelaHash39.recuperaItens();
        java.lang.Object[] objArray41 = tabelaHash39.recuperaItens();
        tabelaHash39.retira("");
        java.lang.Object obj45 = tabelaHash39.pesquisa("");
        tabelaHash36.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Object obj48 = tabelaHash39.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        tabelaHash6.retira("");
        tabelaHash6.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) 100.0d);
        java.lang.Object obj29 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj10 = tabelaHash5.pesquisa("");
        tabelaHash5.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj20 = tabelaHash15.pesquisa("");
        java.lang.Object obj22 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("");
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash15);
        tabelaHash5.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj30 = tabelaHash5.pesquisa("hi!");
        tabelaHash5.imprime();
        java.lang.Object[] objArray32 = tabelaHash5.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray33);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (short) -1 + "'", obj10, (short) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + (short) -1 + "'", obj22, (short) -1);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        java.lang.Object[] objArray52 = tabelaHash46.recuperaItens();
        tabelaHash46.imprime();
        java.lang.Object[] objArray54 = tabelaHash46.recuperaItens();
        java.lang.Object[] objArray55 = tabelaHash46.recuperaItens();
        java.lang.Object[] objArray56 = tabelaHash46.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash46);
        java.lang.Object obj59 = tabelaHash46.pesquisa("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) -1 + "'", obj51, (short) -1);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[-1]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[-1]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[-1]");
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash4 = new ds.TabelaHash();
        tabelaHash4.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj9 = tabelaHash4.pesquisa("");
        tabelaHash4.insere("", (java.lang.Object) 100.0d);
        tabelaHash4.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        java.lang.Object obj22 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.imprime();
        tabelaHash12.retira("");
        java.lang.Object[] objArray21 = tabelaHash12.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        java.lang.Object[] objArray28 = tabelaHash27.recuperaItens();
        java.lang.Object[] objArray29 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("");
        tabelaHash27.retira("hi!");
        tabelaHash27.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash9.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj34 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj37 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object obj43 = tabelaHash40.pesquisa("");
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj54 = tabelaHash49.pesquisa("");
        java.lang.Object[] objArray55 = tabelaHash49.recuperaItens();
        tabelaHash46.insere("", (java.lang.Object) objArray55);
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) tabelaHash46);
        java.lang.Object obj61 = tabelaHash46.pesquisa("");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        java.lang.Object[] objArray64 = tabelaHash63.recuperaItens();
        java.lang.Object obj66 = tabelaHash63.pesquisa("hi!");
        tabelaHash63.imprime();
        tabelaHash63.retira("hi!");
        java.lang.Object obj71 = tabelaHash63.pesquisa("hi!");
        ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
        tabelaHash73.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj78 = tabelaHash73.pesquisa("");
        tabelaHash73.imprime();
        java.lang.Object obj81 = tabelaHash73.pesquisa("hi!");
        tabelaHash73.imprime();
        tabelaHash63.insere("", (java.lang.Object) tabelaHash73);
        tabelaHash46.insere("", (java.lang.Object) tabelaHash73);
        java.lang.Object[] objArray85 = tabelaHash73.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash73);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + (byte) -1 + "'", obj37, (byte) -1);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + (short) -1 + "'", obj54, (short) -1);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1]");
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertEquals("'" + obj78 + "' != '" + (short) -1 + "'", obj78, (short) -1);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[-1]");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.imprime();
        java.lang.Object obj26 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj29 = tabelaHash23.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj40 = tabelaHash35.pesquisa("");
        java.lang.Object[] objArray41 = tabelaHash35.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) objArray41);
        tabelaHash32.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash32);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + (short) -1 + "'", obj40, (short) -1);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[-1]");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object obj20 = tabelaHash13.pesquisa("");
        tabelaHash13.retira("");
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        java.lang.Object[] objArray26 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray27 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, a]");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + (short) -1 + "'", obj20, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[-1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[-1, a]");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        java.lang.Object[] objArray9 = tabelaHash8.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        java.lang.Object[] objArray12 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash8.insere("", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash8);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        java.lang.Object[] objArray22 = tabelaHash21.recuperaItens();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash8.imprime();
        tabelaHash8.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + (short) -1 + "'", obj12, (short) -1);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash54 = new ds.TabelaHash();
        java.lang.Object[] objArray55 = tabelaHash54.recuperaItens();
        java.lang.Object[] objArray56 = tabelaHash54.recuperaItens();
        java.lang.Object obj58 = tabelaHash54.pesquisa("");
        java.lang.Object obj60 = new java.lang.Object();
        tabelaHash54.insere("hi!", obj60);
        java.lang.Class<?> wildcardClass62 = tabelaHash54.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash54);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj23 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass25 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object[] objArray8 = tabelaHash6.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray8);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object[] objArray14 = tabelaHash13.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        tabelaHash19.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj34 = tabelaHash29.pesquisa("");
        java.lang.Object obj36 = tabelaHash29.pesquisa("");
        tabelaHash29.retira("");
        tabelaHash19.insere("hi!", (java.lang.Object) tabelaHash29);
        java.lang.Object obj41 = tabelaHash19.pesquisa("hi!");
        java.lang.Object[] objArray42 = tabelaHash19.recuperaItens();
        tabelaHash13.insere("", (java.lang.Object) objArray42);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("");
        java.lang.Object[] objArray47 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (short) -1 + "'", obj34, (short) -1);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (short) -1 + "'", obj36, (short) -1);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj39 = tabelaHash34.pesquisa("");
        java.lang.Object[] objArray40 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj43 = new java.lang.Object();
        tabelaHash34.insere("hi!", obj43);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray48 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) -1 + "'", obj39, (short) -1);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1]");
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + (short) -1 + "'", obj47, (short) -1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[-1, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[-1, ]");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        java.lang.Object obj16 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash14);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object obj35 = tabelaHash33.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("");
        tabelaHash33.insere("", (java.lang.Object) (-1.0f));
        tabelaHash23.insere("hi!", (java.lang.Object) (-1.0f));
        java.lang.Object obj45 = tabelaHash23.pesquisa("hi!");
        tabelaHash14.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        java.lang.Object[] objArray49 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray50 = tabelaHash48.recuperaItens();
        java.lang.Object obj52 = tabelaHash48.pesquisa("");
        java.lang.Object obj54 = new java.lang.Object();
        tabelaHash48.insere("hi!", obj54);
        tabelaHash14.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        java.lang.Object obj65 = tabelaHash58.pesquisa("");
        tabelaHash58.retira("");
        tabelaHash58.retira("");
        java.lang.Class<?> wildcardClass70 = tabelaHash58.getClass();
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash58);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) -1 + "'", obj28, (short) -1);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (-1.0f) + "'", obj45, (-1.0f));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (short) -1 + "'", obj63, (short) -1);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + (short) -1 + "'", obj65, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
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
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        tabelaHash24.insere("", (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass33 = tabelaHash24.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        java.lang.Object[] objArray8 = tabelaHash7.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        java.lang.Object[] objArray11 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray12 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        tabelaHash7.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj25 = null;
        tabelaHash0.insere("hi!", obj25);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        java.lang.Object obj21 = null;
        tabelaHash15.insere("", obj21);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        java.lang.Object[] objArray20 = tabelaHash19.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash19.recuperaItens();
        java.lang.Object obj23 = tabelaHash19.pesquisa("");
        java.lang.Object obj25 = new java.lang.Object();
        tabelaHash19.insere("hi!", obj25);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.imprime();
        tabelaHash10.retira("hi!");
        java.lang.Class<?> wildcardClass24 = tabelaHash10.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash10.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj11 = tabelaHash6.pesquisa("");
        tabelaHash6.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj21 = tabelaHash16.pesquisa("");
        java.lang.Object obj23 = tabelaHash16.pesquisa("");
        tabelaHash16.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash6.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj31 = tabelaHash6.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + (short) -1 + "'", obj21, (short) -1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + (short) -1 + "'", obj23, (short) -1);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj51 = tabelaHash46.pesquisa("");
        tabelaHash46.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj61 = tabelaHash56.pesquisa("");
        java.lang.Object obj63 = tabelaHash56.pesquisa("");
        tabelaHash56.retira("");
        tabelaHash46.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash46.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj71 = tabelaHash46.pesquisa("hi!");
        tabelaHash46.imprime();
        java.lang.Object[] objArray73 = tabelaHash46.recuperaItens();
        java.lang.Object obj75 = tabelaHash46.pesquisa("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash33.imprime();
        tabelaHash33.retira("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + (short) -1 + "'", obj51, (short) -1);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + (short) -1 + "'", obj61, (short) -1);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (short) -1 + "'", obj63, (short) -1);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash9.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj34 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray36 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1, hi!]");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.insere("", (java.lang.Object) 100.0d);
        tabelaHash61.retira("hi!");
        tabelaHash57.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray74 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass75 = objArray74.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (short) -1 + "'", obj66, (short) -1);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[-1, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[-1, hi!]");
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = tabelaHash15.pesquisa("");
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj29 = tabelaHash24.pesquisa("");
        java.lang.Object[] objArray30 = tabelaHash24.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) objArray30);
        tabelaHash21.retira("hi!");
        tabelaHash15.insere("", (java.lang.Object) tabelaHash21);
        java.lang.Object obj36 = tabelaHash21.pesquisa("");
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        java.lang.Object[] objArray39 = tabelaHash38.recuperaItens();
        java.lang.Object obj41 = tabelaHash38.pesquisa("hi!");
        tabelaHash38.imprime();
        tabelaHash38.retira("hi!");
        java.lang.Object obj46 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj53 = tabelaHash48.pesquisa("");
        tabelaHash48.imprime();
        java.lang.Object obj56 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.imprime();
        tabelaHash38.insere("", (java.lang.Object) tabelaHash48);
        tabelaHash21.insere("", (java.lang.Object) tabelaHash48);
        java.lang.Object obj61 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("hi!");
        java.lang.Object obj65 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        java.lang.Object[] objArray68 = tabelaHash67.recuperaItens();
        java.lang.Object obj70 = tabelaHash67.pesquisa("hi!");
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        tabelaHash67.imprime();
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        java.lang.Object[] objArray76 = tabelaHash75.recuperaItens();
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        java.lang.Object[] objArray79 = tabelaHash78.recuperaItens();
        java.lang.Object[] objArray80 = tabelaHash78.recuperaItens();
        tabelaHash78.retira("");
        tabelaHash78.retira("hi!");
        tabelaHash75.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass86 = tabelaHash75.getClass();
        tabelaHash67.insere("hi!", (java.lang.Object) wildcardClass86);
        java.lang.Object obj89 = tabelaHash67.pesquisa("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1]");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (short) -1 + "'", obj53, (short) -1);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[]");
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[]");
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(obj89);
        org.junit.Assert.assertEquals(obj89.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj89), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj89), "class ds.TabelaHash");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object[] objArray36 = tabelaHash28.recuperaItens();
        tabelaHash28.retira("");
        tabelaHash28.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[-1]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[-1]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object[] objArray21 = tabelaHash10.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash10.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        java.lang.Object[] objArray25 = tabelaHash24.recuperaItens();
        java.lang.Object obj27 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.imprime();
        tabelaHash24.retira("hi!");
        java.lang.Object obj32 = tabelaHash24.pesquisa("");
        java.lang.Object obj34 = tabelaHash24.pesquisa("hi!");
        tabelaHash24.retira("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash24.retira("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj46 = tabelaHash41.pesquisa("");
        tabelaHash41.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray50 = tabelaHash41.recuperaItens();
        java.lang.Object obj52 = tabelaHash41.pesquisa("hi!");
        java.lang.Object[] objArray53 = tabelaHash41.recuperaItens();
        tabelaHash24.insere("", (java.lang.Object) tabelaHash41);
        java.lang.Object obj56 = tabelaHash24.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj63 = tabelaHash58.pesquisa("");
        tabelaHash58.imprime();
        java.lang.Object obj66 = tabelaHash58.pesquisa("hi!");
        tabelaHash24.insere("", (java.lang.Object) tabelaHash58);
        java.lang.Class<?> wildcardClass68 = tabelaHash58.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + (short) -1 + "'", obj46, (short) -1);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[-1]");
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + (short) -1 + "'", obj63, (short) -1);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (short) -1 + "'", obj9, (short) -1);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1]");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.imprime();
        java.lang.Object obj19 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj28 = tabelaHash23.pesquisa("");
        tabelaHash23.imprime();
        java.lang.Object[] objArray30 = tabelaHash23.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash23);
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        java.lang.Object[] objArray34 = tabelaHash33.recuperaItens();
        java.lang.Object obj36 = null;
        tabelaHash33.insere("", obj36);
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash23.imprime();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + (short) -1 + "'", obj28, (short) -1);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash9.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) objArray15);
        tabelaHash6.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash6);
        java.lang.Object obj21 = tabelaHash6.pesquisa("");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        java.lang.Object obj26 = tabelaHash23.pesquisa("hi!");
        tabelaHash23.imprime();
        tabelaHash23.retira("hi!");
        java.lang.Object obj31 = tabelaHash23.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj38 = tabelaHash33.pesquisa("");
        tabelaHash33.imprime();
        java.lang.Object obj41 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.imprime();
        tabelaHash23.insere("", (java.lang.Object) tabelaHash33);
        tabelaHash6.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Object obj46 = tabelaHash6.pesquisa("");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1]");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + (short) -1 + "'", obj38, (short) -1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray23 = tabelaHash0.recuperaItens();
        java.lang.Object obj25 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (short) -1 + "'", obj25, (short) -1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        tabelaHash3.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj8 = tabelaHash3.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash3.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray9);
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj17 = tabelaHash12.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        java.lang.Object obj29 = tabelaHash22.pesquisa("");
        tabelaHash22.retira("");
        tabelaHash12.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash22.retira("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj41 = tabelaHash36.pesquisa("");
        java.lang.Object obj43 = tabelaHash36.pesquisa("");
        tabelaHash36.retira("");
        java.lang.Object obj47 = null;
        tabelaHash36.insere("", obj47);
        java.lang.Object obj50 = tabelaHash36.pesquisa("");
        tabelaHash22.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash36.retira("");
        java.lang.Object obj55 = tabelaHash36.pesquisa("hi!");
        tabelaHash0.insere("hi!", obj55);
        java.lang.Object obj58 = null;
        tabelaHash0.insere("", obj58);
        java.lang.Class<?> wildcardClass60 = tabelaHash0.getClass();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) -1 + "'", obj8, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + (short) -1 + "'", obj27, (short) -1);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + (short) -1 + "'", obj29, (short) -1);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (short) -1 + "'", obj41, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj18 = tabelaHash13.pesquisa("");
        java.lang.Object[] objArray19 = tabelaHash13.recuperaItens();
        tabelaHash13.imprime();
        java.lang.Object[] objArray21 = tabelaHash13.recuperaItens();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj33 = tabelaHash28.pesquisa("");
        tabelaHash28.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        java.lang.Object obj45 = tabelaHash38.pesquisa("");
        tabelaHash38.retira("");
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash38);
        java.lang.Object obj50 = tabelaHash28.pesquisa("hi!");
        tabelaHash13.insere("hi!", obj50);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) 1);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        java.lang.Object obj59 = tabelaHash57.pesquisa("");
        ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
        tabelaHash61.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj66 = tabelaHash61.pesquisa("");
        tabelaHash61.insere("", (java.lang.Object) 100.0d);
        tabelaHash61.retira("hi!");
        tabelaHash57.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object obj76 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) -1 + "'", obj18, (short) -1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + (short) -1 + "'", obj33, (short) -1);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + (short) -1 + "'", obj43, (short) -1);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + (short) -1 + "'", obj45, (short) -1);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + (short) -1 + "'", obj66, (short) -1);
        org.junit.Assert.assertEquals("'" + obj76 + "' != '" + "hi!" + "'", obj76, "hi!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj24 = tabelaHash15.pesquisa("");
        java.lang.Object obj26 = tabelaHash15.pesquisa("");
        tabelaHash15.retira("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        tabelaHash0.retira("");
        java.lang.Object[] objArray35 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass36 = objArray35.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        java.lang.Object obj22 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash10.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        java.lang.Object obj15 = tabelaHash13.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.retira("");
        java.lang.Object obj21 = tabelaHash13.pesquisa("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        java.lang.Object[] objArray24 = tabelaHash23.recuperaItens();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        java.lang.Object[] objArray27 = tabelaHash26.recuperaItens();
        java.lang.Object[] objArray28 = tabelaHash26.recuperaItens();
        tabelaHash26.retira("");
        tabelaHash26.retira("hi!");
        tabelaHash23.insere("", (java.lang.Object) "hi!");
        tabelaHash13.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray35 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.imprime();
        tabelaHash13.retira("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray2 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) -1 + "'", obj7, (short) -1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj31 = null;
        tabelaHash0.insere("", obj31);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        java.lang.Object obj17 = tabelaHash10.pesquisa("");
        tabelaHash10.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash10);
        tabelaHash0.insere("", (java.lang.Object) (byte) 10);
        tabelaHash0.retira("");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) -1 + "'", obj15, (short) -1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        java.lang.Object obj16 = tabelaHash9.pesquisa("");
        tabelaHash9.retira("");
        java.lang.Object obj20 = tabelaHash9.pesquisa("");
        java.lang.Object[] objArray21 = tabelaHash9.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash9.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (short) -1 + "'", obj16, (short) -1);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object obj2 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj4 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
        java.lang.Object[] objArray4 = tabelaHash3.recuperaItens();
        java.lang.Object[] objArray5 = tabelaHash3.recuperaItens();
        tabelaHash3.retira("");
        tabelaHash3.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash12);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        java.lang.Object[] objArray16 = tabelaHash15.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash15.recuperaItens();
        tabelaHash15.retira("");
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        tabelaHash12.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray23 = tabelaHash15.recuperaItens();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) 'a');
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[a]");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        tabelaHash9.insere("", (java.lang.Object) 100.0d);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj24 = tabelaHash19.pesquisa("");
        java.lang.Object obj26 = tabelaHash19.pesquisa("");
        tabelaHash19.retira("");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash9.insere("", (java.lang.Object) (byte) 10);
        java.lang.Object obj34 = tabelaHash9.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass36 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) -1 + "'", obj14, (short) -1);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (short) -1 + "'", obj24, (short) -1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + (short) -1 + "'", obj26, (short) -1);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("", (java.lang.Object) (short) -1);
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) 100.0d);
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) -1 + "'", obj5, (short) -1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1]");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (short) -1 + "'", obj11, (short) -1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
    }
}

