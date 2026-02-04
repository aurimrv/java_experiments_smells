package ds.seed9121;

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
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass4 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Class<?> wildcardClass1 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.insere("", (java.lang.Object) "");
        tabelaHash11.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash7.recuperaItens();
        java.lang.Class<?> wildcardClass18 = objArray17.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = null;
        tabelaHash7.insere("", obj19);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash7.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.retira("hi!");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[-1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[-1]");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object obj17 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        java.lang.Class<?> wildcardClass30 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) true);
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[true, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[true, null]");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass14 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("hi!", obj18);
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray24);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.imprime();
        java.lang.Object obj5 = null;
        tabelaHash2.insere("hi!", obj5);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        java.lang.Object[] objArray1 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass2 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Class<?> wildcardClass30 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray17 = tabelaHash7.recuperaItens();
        java.lang.Object obj19 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Class<?> wildcardClass20 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        java.lang.Object obj21 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = obj16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0, null]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0, null]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass25 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass18 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass27 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj20 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass12 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass6 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null]");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        java.lang.Object[] objArray37 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray40 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass13 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray19 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass24 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        java.lang.Object obj28 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0L + "'", obj30, 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Class<?> wildcardClass17 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[0]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray20 = tabelaHash15.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj26 = tabelaHash21.pesquisa("");
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash30.retira("");
        tabelaHash21.insere("", (java.lang.Object) tabelaHash30);
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        tabelaHash39.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        java.lang.Object obj50 = null;
        tabelaHash47.insere("hi!", obj50);
        java.lang.Object[] objArray52 = tabelaHash47.recuperaItens();
        java.lang.Object obj54 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj56 = tabelaHash47.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash58);
        tabelaHash58.imprime();
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        java.lang.Object obj67 = null;
        tabelaHash64.insere("hi!", obj67);
        tabelaHash64.retira("hi!");
        java.lang.Object[] objArray71 = tabelaHash64.recuperaItens();
        tabelaHash64.retira("hi!");
        tabelaHash58.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash58.imprime();
        java.lang.Object[] objArray76 = tabelaHash58.recuperaItens();
        tabelaHash39.insere("", (java.lang.Object) tabelaHash58);
        java.lang.Object[] objArray78 = tabelaHash39.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash39);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[null]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[hi!]");
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash23.retira("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        java.lang.Object[] objArray37 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object obj40 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass16 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash0.insere("hi!", (java.lang.Object) (short) 1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray19 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null, 1.0]");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        java.lang.Object[] objArray37 = tabelaHash19.recuperaItens();
        tabelaHash19.retira("");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        java.lang.Object obj44 = null;
        tabelaHash41.insere("hi!", obj44);
        tabelaHash41.retira("hi!");
        tabelaHash41.retira("");
        tabelaHash41.retira("hi!");
        tabelaHash41.retira("");
        java.lang.Class<?> wildcardClass54 = tabelaHash41.getClass();
        tabelaHash19.insere("", (java.lang.Object) tabelaHash41);
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Class<?> wildcardClass62 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object obj19 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj19);
        java.lang.Class<?> wildcardClass21 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Object obj20 = null;
        tabelaHash0.insere("hi!", obj20);
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj28 = tabelaHash20.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray19 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object[] objArray33 = tabelaHash28.recuperaItens();
        java.lang.Object obj35 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        java.lang.Object obj40 = null;
        tabelaHash37.insere("hi!", obj40);
        java.lang.Object[] objArray42 = tabelaHash37.recuperaItens();
        java.lang.Object obj44 = tabelaHash37.pesquisa("hi!");
        java.lang.Object obj46 = tabelaHash37.pesquisa("hi!");
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        tabelaHash48.imprime();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash28.insere("", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray53 = tabelaHash37.recuperaItens();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        java.lang.Object obj58 = null;
        tabelaHash55.insere("hi!", obj58);
        java.lang.Object obj61 = tabelaHash55.pesquisa("");
        java.lang.Object[] objArray62 = tabelaHash55.recuperaItens();
        tabelaHash37.insere("hi!", (java.lang.Object) tabelaHash55);
        java.lang.Object obj65 = tabelaHash37.pesquisa("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0, null]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[null]");
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        java.lang.Object obj18 = null;
        tabelaHash15.insere("hi!", obj18);
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        java.lang.Object obj23 = tabelaHash15.pesquisa("hi!");
        java.lang.Object[] objArray24 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray24);
        java.lang.Class<?> wildcardClass26 = objArray24.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj17 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray18 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!]");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        tabelaHash0.retira("hi!");
        java.lang.Object obj21 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.imprime();
        java.lang.Object obj33 = null;
        tabelaHash30.insere("hi!", obj33);
        java.lang.Object[] objArray35 = tabelaHash30.recuperaItens();
        java.lang.Object obj37 = tabelaHash30.pesquisa("hi!");
        java.lang.Object obj39 = tabelaHash30.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        tabelaHash41.imprime();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash41);
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        java.lang.Object obj50 = null;
        tabelaHash47.insere("hi!", obj50);
        java.lang.Object[] objArray52 = tabelaHash47.recuperaItens();
        java.lang.Object obj54 = tabelaHash47.pesquisa("hi!");
        java.lang.Object obj56 = tabelaHash47.pesquisa("hi!");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        tabelaHash58.imprime();
        tabelaHash47.insere("hi!", (java.lang.Object) tabelaHash58);
        java.lang.Object[] objArray62 = tabelaHash58.recuperaItens();
        tabelaHash58.insere("", (java.lang.Object) '4');
        tabelaHash58.retira("");
        tabelaHash41.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass69 = tabelaHash41.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass69);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[null]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[null]");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash13.retira("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash20.retira("hi!");
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        java.lang.Object obj29 = tabelaHash20.pesquisa("");
        tabelaHash13.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object obj32 = tabelaHash13.pesquisa("hi!");
        tabelaHash13.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        java.lang.Object obj24 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("", (java.lang.Object) '4');
        tabelaHash28.retira("");
        tabelaHash11.insere("", (java.lang.Object) "");
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass20 = tabelaHash11.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        java.lang.Object[] objArray26 = tabelaHash21.recuperaItens();
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        java.lang.Object obj41 = null;
        tabelaHash38.insere("hi!", obj41);
        tabelaHash38.retira("hi!");
        java.lang.Object[] objArray45 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray50 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[4, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[4, hi!]");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass17 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = null;
        tabelaHash0.insere("", obj29);
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        tabelaHash29.retira("");
        java.lang.Class<?> wildcardClass36 = tabelaHash29.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass36);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.imprime();
        java.lang.Object obj5 = null;
        tabelaHash2.insere("hi!", obj5);
        tabelaHash2.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash2.recuperaItens();
        tabelaHash2.retira("hi!");
        java.lang.Object obj13 = tabelaHash2.pesquisa("");
        tabelaHash2.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("hi!");
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash2.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash2);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        java.lang.Object obj34 = null;
        tabelaHash31.insere("hi!", obj34);
        java.lang.Object[] objArray36 = tabelaHash31.recuperaItens();
        java.lang.Object obj38 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray46 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object[] objArray52 = tabelaHash51.recuperaItens();
        tabelaHash42.insere("", (java.lang.Object) objArray52);
        tabelaHash42.retira("hi!");
        tabelaHash42.imprime();
        tabelaHash42.retira("hi!");
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.imprime();
        java.lang.Object obj63 = null;
        tabelaHash60.insere("hi!", obj63);
        tabelaHash60.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash69 = new ds.TabelaHash();
        tabelaHash69.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj74 = tabelaHash69.pesquisa("");
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash76.retira("hi!");
        tabelaHash69.insere("hi!", (java.lang.Object) tabelaHash76);
        java.lang.Class<?> wildcardClass83 = tabelaHash76.getClass();
        tabelaHash60.insere("", (java.lang.Object) wildcardClass83);
        tabelaHash42.insere("hi!", (java.lang.Object) "");
        tabelaHash2.insere("hi!", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj39 = null;
        tabelaHash15.insere("hi!", obj39);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass7 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Class<?> wildcardClass19 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash57);
        ds.TabelaHash tabelaHash60 = new ds.TabelaHash();
        tabelaHash60.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj65 = tabelaHash60.pesquisa("");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash67.retira("hi!");
        tabelaHash60.insere("hi!", (java.lang.Object) tabelaHash67);
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash75.retira("hi!");
        ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
        tabelaHash82.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash82.retira("hi!");
        tabelaHash82.imprime();
        tabelaHash82.imprime();
        java.lang.Object obj91 = tabelaHash82.pesquisa("");
        tabelaHash75.insere("hi!", (java.lang.Object) tabelaHash82);
        java.lang.Object obj94 = tabelaHash75.pesquisa("hi!");
        tabelaHash75.imprime();
        java.lang.Object[] objArray96 = tabelaHash75.recuperaItens();
        tabelaHash60.insere("", (java.lang.Object) tabelaHash75);
        tabelaHash29.insere("", (java.lang.Object) tabelaHash75);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(obj94);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        java.lang.Object[] objArray37 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray39 = tabelaHash0.recuperaItens();
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass56 = tabelaHash29.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass3 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = null;
        tabelaHash0.insere("", obj11);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, null]");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object obj37 = tabelaHash9.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object obj43 = null;
        tabelaHash40.insere("hi!", obj43);
        tabelaHash40.retira("hi!");
        tabelaHash40.retira("hi!");
        tabelaHash40.retira("");
        tabelaHash15.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = null;
        tabelaHash0.insere("", obj33);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
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
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        tabelaHash11.imprime();
        java.lang.Object obj21 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj15 = tabelaHash10.pesquisa("");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.retira("hi!");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash17);
        tabelaHash17.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null]");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!]");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[null]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Class<?> wildcardClass18 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash41.retira("hi!");
        tabelaHash41.imprime();
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        java.lang.Object obj52 = null;
        tabelaHash49.insere("hi!", obj52);
        java.lang.Object[] objArray54 = tabelaHash49.recuperaItens();
        java.lang.Object obj56 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.retira("");
        tabelaHash49.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray62 = tabelaHash49.recuperaItens();
        tabelaHash49.insere("", (java.lang.Object) 1.0d);
        tabelaHash41.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj68 = tabelaHash41.pesquisa("");
        java.lang.Object[] objArray69 = tabelaHash41.recuperaItens();
        java.lang.Object obj71 = tabelaHash41.pesquisa("hi!");
        tabelaHash41.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash41);
        java.lang.Object[] objArray74 = tabelaHash41.recuperaItens();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[null]");
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(objArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 1.0d + "'", obj68, 1.0d);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[1.0]");
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[1.0]");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        tabelaHash11.imprime();
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        java.lang.Object obj22 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[4]");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + '4' + "'", obj22, '4');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        java.lang.Class<?> wildcardClass34 = tabelaHash18.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash21.retira("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        java.lang.Object obj37 = tabelaHash28.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object obj40 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.retira("hi!");
        tabelaHash42.insere("", (java.lang.Object) 1.0d);
        tabelaHash42.insere("", (java.lang.Object) 1L);
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash42);
        tabelaHash42.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash42);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(obj40);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNotNull(objArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[, hi!]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass15 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null, a]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null, a]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash18.retira("");
        java.lang.Object[] objArray24 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj14 = tabelaHash9.pesquisa("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.retira("hi!");
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Class<?> wildcardClass23 = tabelaHash16.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        tabelaHash8.retira("hi!");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("hi!");
        java.lang.Object obj19 = tabelaHash8.pesquisa("");
        tabelaHash0.insere("", obj19);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) objArray21);
        tabelaHash11.retira("hi!");
        java.lang.Object obj26 = tabelaHash11.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object[] objArray33 = tabelaHash28.recuperaItens();
        java.lang.Object obj35 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object[] objArray43 = tabelaHash39.recuperaItens();
        java.lang.Class<?> wildcardClass44 = objArray43.getClass();
        tabelaHash21.insere("", (java.lang.Object) objArray43);
        tabelaHash15.insere("", (java.lang.Object) objArray43);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass27 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        java.lang.Object obj41 = null;
        tabelaHash38.insere("hi!", obj41);
        java.lang.Object obj44 = tabelaHash38.pesquisa("");
        java.lang.Object[] objArray45 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        java.lang.Object obj52 = null;
        tabelaHash49.insere("hi!", obj52);
        tabelaHash49.retira("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Object[] objArray57 = tabelaHash49.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) objArray57);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object obj61 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null, ]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null, ]");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "" + "'", obj61, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        java.lang.Object obj39 = tabelaHash29.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = obj39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[4]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[4]");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash8.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash16.retira("hi!");
        ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
        tabelaHash23.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash23.retira("hi!");
        tabelaHash23.imprime();
        tabelaHash23.imprime();
        java.lang.Object obj32 = tabelaHash23.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash23);
        java.lang.Object obj35 = tabelaHash16.pesquisa("hi!");
        tabelaHash16.imprime();
        java.lang.Object[] objArray37 = tabelaHash16.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object obj43 = null;
        tabelaHash40.insere("hi!", obj43);
        java.lang.Object[] objArray45 = tabelaHash40.recuperaItens();
        java.lang.Object obj47 = tabelaHash40.pesquisa("hi!");
        tabelaHash16.insere("hi!", obj47);
        tabelaHash16.insere("", (java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null]");
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray3 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        java.lang.Object obj8 = null;
        tabelaHash5.insere("hi!", obj8);
        java.lang.Object[] objArray10 = tabelaHash5.recuperaItens();
        java.lang.Object obj12 = tabelaHash5.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash5.pesquisa("hi!");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        tabelaHash16.imprime();
        tabelaHash5.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash5.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray23 = tabelaHash5.recuperaItens();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj30 = tabelaHash25.pesquisa("");
        java.lang.Object obj32 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash34.retira("");
        tabelaHash25.insere("", (java.lang.Object) tabelaHash34);
        tabelaHash5.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray42 = tabelaHash34.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        java.lang.Object obj47 = null;
        tabelaHash44.insere("hi!", obj47);
        java.lang.Object[] objArray49 = tabelaHash44.recuperaItens();
        java.lang.Object obj51 = tabelaHash44.pesquisa("hi!");
        java.lang.Object obj53 = tabelaHash44.pesquisa("hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        tabelaHash55.imprime();
        tabelaHash44.insere("hi!", (java.lang.Object) tabelaHash55);
        java.lang.Object[] objArray59 = tabelaHash44.recuperaItens();
        tabelaHash34.insere("", (java.lang.Object) tabelaHash44);
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash62);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[null]");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(objArray59);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        java.lang.Object[] objArray19 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        java.lang.Object[] objArray26 = tabelaHash21.recuperaItens();
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash32.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        java.lang.Object obj41 = null;
        tabelaHash38.insere("hi!", obj41);
        tabelaHash38.retira("hi!");
        java.lang.Object[] objArray45 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("hi!");
        tabelaHash32.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass50 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray11 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        java.lang.Object obj41 = null;
        tabelaHash38.insere("hi!", obj41);
        java.lang.Object[] objArray43 = tabelaHash38.recuperaItens();
        java.lang.Object obj45 = tabelaHash38.pesquisa("hi!");
        java.lang.Object obj47 = tabelaHash38.pesquisa("hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        tabelaHash49.imprime();
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash49);
        tabelaHash49.imprime();
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        java.lang.Object obj58 = null;
        tabelaHash55.insere("hi!", obj58);
        tabelaHash55.retira("hi!");
        java.lang.Object[] objArray62 = tabelaHash55.recuperaItens();
        tabelaHash55.retira("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash49.imprime();
        java.lang.Class<?> wildcardClass67 = tabelaHash49.getClass();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash49);
        tabelaHash29.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[null]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        java.lang.Object obj20 = tabelaHash11.pesquisa("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash11.insere("", (java.lang.Object) false);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1.0d + "'", obj10, 1.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.retira("hi!");
        tabelaHash27.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        java.lang.Object obj37 = null;
        tabelaHash34.insere("hi!", obj37);
        tabelaHash34.retira("hi!");
        java.lang.Object[] objArray41 = tabelaHash34.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray43 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, 1.0]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash13.retira("hi!");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        java.lang.Object obj27 = tabelaHash21.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = null;
        tabelaHash32.insere("hi!", obj35);
        tabelaHash32.retira("hi!");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash32);
        java.lang.Object[] objArray40 = tabelaHash32.recuperaItens();
        tabelaHash13.insere("hi!", (java.lang.Object) objArray40);
        java.lang.Object[] objArray42 = tabelaHash13.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash13);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[null]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[]]");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash57);
        java.lang.Object obj60 = tabelaHash57.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        tabelaHash20.retira("");
        java.lang.Object[] objArray27 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Object[] objArray62 = tabelaHash7.recuperaItens();
        java.lang.Class<?> wildcardClass63 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray24);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1.0, null]");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass5 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        java.lang.Object obj24 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("", (java.lang.Object) '4');
        tabelaHash28.retira("");
        tabelaHash11.insere("", (java.lang.Object) "");
        java.lang.Object obj40 = null;
        tabelaHash11.insere("hi!", obj40);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        java.lang.Object obj15 = tabelaHash6.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        tabelaHash17.imprime();
        tabelaHash6.insere("hi!", (java.lang.Object) tabelaHash17);
        java.lang.Object[] objArray21 = tabelaHash17.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = null;
        tabelaHash32.insere("hi!", obj35);
        java.lang.Object[] objArray37 = tabelaHash32.recuperaItens();
        java.lang.Object obj39 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("");
        tabelaHash32.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray45 = tabelaHash32.recuperaItens();
        tabelaHash32.insere("", (java.lang.Object) 1.0d);
        tabelaHash24.insere("", (java.lang.Object) 1.0d);
        tabelaHash17.insere("", (java.lang.Object) tabelaHash24);
        java.lang.Class<?> wildcardClass51 = tabelaHash17.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[null]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[1.0, null]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object obj39 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj41 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "hi!" + "'", obj39, "hi!");
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash27.retira("");
        java.lang.Object[] objArray33 = tabelaHash27.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray33);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Class<?> wildcardClass36 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass10 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray19 = tabelaHash7.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = null;
        tabelaHash0.insere("", obj33);
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Object obj43 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        tabelaHash36.insere("", (java.lang.Object) false);
        tabelaHash36.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash7.pesquisa("hi!");
        java.lang.Object[] objArray19 = tabelaHash7.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray64 = tabelaHash7.recuperaItens();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        tabelaHash20.retira("");
        java.lang.Object[] objArray27 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[]]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[]]");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[null]");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        tabelaHash20.retira("");
        java.lang.Object[] objArray27 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, null]");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 'a' + "'", obj14, 'a');
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object obj17 = tabelaHash11.pesquisa("");
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.imprime();
        java.lang.Object obj25 = null;
        tabelaHash22.insere("hi!", obj25);
        tabelaHash22.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash11);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash11.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[null]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        java.lang.Object obj25 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray31 = tabelaHash18.recuperaItens();
        java.lang.Object obj33 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash18.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0, null]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1.0, null]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.imprime();
        java.lang.Object obj5 = null;
        tabelaHash2.insere("hi!", obj5);
        tabelaHash2.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash2.recuperaItens();
        tabelaHash2.retira("hi!");
        java.lang.Object obj13 = tabelaHash2.pesquisa("");
        tabelaHash2.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        tabelaHash18.retira("hi!");
        tabelaHash2.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash2.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash2);
        tabelaHash0.imprime();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj16 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0]");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = null;
        tabelaHash26.insere("hi!", obj29);
        tabelaHash26.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj40 = tabelaHash35.pesquisa("");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash42.retira("hi!");
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Class<?> wildcardClass49 = tabelaHash42.getClass();
        tabelaHash26.insere("", (java.lang.Object) wildcardClass49);
        java.lang.Object obj52 = tabelaHash26.pesquisa("hi!");
        java.lang.Object[] objArray53 = tabelaHash26.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash26);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null, 4, class ds.TabelaHash]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null, 4, class ds.TabelaHash]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("");
        java.lang.Class<?> wildcardClass30 = tabelaHash17.getClass();
        tabelaHash7.insere("hi!", (java.lang.Object) wildcardClass30);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object obj29 = null;
        tabelaHash0.insere("", obj29);
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = null;
        tabelaHash33.insere("hi!", obj36);
        tabelaHash33.retira("hi!");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray40);
        java.lang.Class<?> wildcardClass42 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass26 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash7.pesquisa("hi!");
        java.lang.Class<?> wildcardClass20 = tabelaHash7.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass33 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass26 = objArray25.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        java.lang.Object obj37 = null;
        tabelaHash34.insere("hi!", obj37);
        java.lang.Object[] objArray39 = tabelaHash34.recuperaItens();
        java.lang.Object obj41 = tabelaHash34.pesquisa("hi!");
        java.lang.Object obj43 = tabelaHash34.pesquisa("hi!");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.imprime();
        tabelaHash45.imprime();
        tabelaHash34.insere("hi!", (java.lang.Object) tabelaHash45);
        tabelaHash34.insere("", (java.lang.Object) false);
        tabelaHash34.retira("");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj60 = tabelaHash55.pesquisa("");
        java.lang.Object obj62 = tabelaHash55.pesquisa("hi!");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash64.retira("");
        tabelaHash55.insere("", (java.lang.Object) tabelaHash64);
        tabelaHash34.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[null]");
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + "hi!" + "'", obj62, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash17.imprime();
        java.lang.Object obj37 = null;
        tabelaHash17.insere("hi!", obj37);
        tabelaHash0.insere("hi!", obj37);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) objArray21);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        tabelaHash29.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj43 = tabelaHash38.pesquisa("");
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash45.retira("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash45);
        java.lang.Class<?> wildcardClass52 = tabelaHash45.getClass();
        tabelaHash29.insere("", (java.lang.Object) wildcardClass52);
        tabelaHash11.insere("hi!", (java.lang.Object) "");
        tabelaHash11.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        tabelaHash7.insere("", (java.lang.Object) (short) -1);
        tabelaHash7.retira("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash9.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash27.retira("");
        java.lang.Object[] objArray33 = tabelaHash27.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) objArray33);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash9.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[hi!]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        java.lang.Class<?> wildcardClass28 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash57);
        java.lang.Object[] objArray59 = tabelaHash29.recuperaItens();
        java.lang.Object obj61 = tabelaHash29.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "hi!" + "'", obj61, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass28 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.retira("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        java.lang.Object obj32 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        tabelaHash36.insere("", (java.lang.Object) '4');
        tabelaHash36.retira("");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash36);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[null]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash57);
        java.lang.Object obj60 = tabelaHash29.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + "hi!" + "'", obj60, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.retira("hi!");
        tabelaHash20.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        tabelaHash27.retira("hi!");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash20.imprime();
        java.lang.Object[] objArray37 = tabelaHash20.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) objArray37);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        java.lang.Object obj25 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray31 = tabelaHash18.recuperaItens();
        java.lang.Object obj33 = tabelaHash18.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash18.recuperaItens();
        java.lang.Object obj36 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", obj36);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.retira("hi!");
        java.lang.Class<?> wildcardClass42 = tabelaHash39.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass42);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[null, 1.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null, 1.0]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray40 = tabelaHash21.recuperaItens();
        java.lang.Object obj42 = tabelaHash21.pesquisa("");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        java.lang.Object[] objArray24 = tabelaHash19.recuperaItens();
        java.lang.Object obj26 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("");
        tabelaHash19.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray32 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj37 = tabelaHash19.pesquisa("hi!");
        tabelaHash19.retira("");
        java.lang.Class<?> wildcardClass40 = tabelaHash19.getClass();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash19);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[null, 1.0]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null, 1.0]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        java.lang.Object[] objArray20 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj23 = tabelaHash7.pesquisa("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNull(obj23);
    }

    @Ignore
    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, 1.0]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        java.lang.Object obj18 = tabelaHash7.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("");
        java.lang.Object[] objArray26 = tabelaHash19.recuperaItens();
        java.lang.Object obj28 = tabelaHash19.pesquisa("hi!");
        tabelaHash0.insere("", obj28);
        java.lang.Object[] objArray30 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.retira("hi!");
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[a]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash62.retira("");
        java.lang.Object[] objArray68 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray69 = tabelaHash62.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash62);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!]");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[hi!]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash16.recuperaItens();
        java.lang.Class<?> wildcardClass27 = tabelaHash16.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.imprime();
        java.lang.Object obj65 = null;
        tabelaHash62.insere("hi!", obj65);
        java.lang.Object[] objArray67 = tabelaHash62.recuperaItens();
        java.lang.Object obj69 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.retira("");
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray75 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray76 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray77 = tabelaHash62.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash62);
        java.lang.Class<?> wildcardClass79 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[null]");
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objArray75);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray76);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        java.lang.Object[] objArray18 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        java.lang.Object obj34 = null;
        tabelaHash31.insere("hi!", obj34);
        java.lang.Object[] objArray36 = tabelaHash31.recuperaItens();
        java.lang.Object obj38 = tabelaHash31.pesquisa("hi!");
        java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
        ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
        tabelaHash42.imprime();
        tabelaHash42.imprime();
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash42);
        java.lang.Object[] objArray46 = tabelaHash42.recuperaItens();
        tabelaHash42.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash51 = new ds.TabelaHash();
        java.lang.Object[] objArray52 = tabelaHash51.recuperaItens();
        tabelaHash42.insere("", (java.lang.Object) objArray52);
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Object obj56 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
        tabelaHash59.imprime();
        java.lang.Object obj62 = null;
        tabelaHash59.insere("hi!", obj62);
        java.lang.Object obj65 = tabelaHash59.pesquisa("");
        java.lang.Object obj67 = tabelaHash59.pesquisa("hi!");
        java.lang.Object[] objArray68 = tabelaHash59.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray68);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "" + "'", obj56, "");
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[null]");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object obj34 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Object obj43 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray51 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) '4');
        tabelaHash28.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray57 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass58 = objArray57.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = null;
        tabelaHash10.insere("hi!", obj13);
        tabelaHash10.retira("");
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        java.lang.Object obj19 = tabelaHash10.pesquisa("hi!");
        java.lang.Object[] objArray20 = tabelaHash10.recuperaItens();
        java.lang.Class<?> wildcardClass21 = objArray20.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray20);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[null]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = null;
        tabelaHash10.insere("hi!", obj13);
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "class ds.TabelaHash");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "class ds.TabelaHash");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[]]");
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        java.lang.Object obj19 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1.0d + "'", obj19, 1.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = null;
        tabelaHash32.insere("hi!", obj35);
        tabelaHash32.retira("hi!");
        java.lang.Object[] objArray39 = tabelaHash32.recuperaItens();
        tabelaHash32.retira("hi!");
        java.lang.Object obj43 = tabelaHash32.pesquisa("");
        tabelaHash0.insere("", obj43);
        java.lang.Class<?> wildcardClass45 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Object obj37 = tabelaHash9.pesquisa("hi!");
        java.lang.Object[] objArray38 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass9 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = null;
        tabelaHash33.insere("hi!", obj36);
        tabelaHash33.retira("hi!");
        tabelaHash33.retira("");
        tabelaHash33.retira("hi!");
        tabelaHash33.retira("");
        java.lang.Class<?> wildcardClass46 = tabelaHash33.getClass();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass48 = tabelaHash11.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash30.retira("hi!");
        tabelaHash30.imprime();
        ds.TabelaHash tabelaHash38 = new ds.TabelaHash();
        tabelaHash38.imprime();
        java.lang.Object obj41 = null;
        tabelaHash38.insere("hi!", obj41);
        java.lang.Object obj44 = tabelaHash38.pesquisa("");
        java.lang.Object[] objArray45 = tabelaHash38.recuperaItens();
        tabelaHash38.retira("");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.imprime();
        java.lang.Object obj52 = null;
        tabelaHash49.insere("hi!", obj52);
        tabelaHash49.retira("hi!");
        tabelaHash38.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Object[] objArray57 = tabelaHash49.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) objArray57);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash30);
        java.lang.Object[] objArray60 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, null]");
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[null]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object obj42 = tabelaHash36.pesquisa("");
        java.lang.Object[] objArray43 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        java.lang.Object obj50 = null;
        tabelaHash47.insere("hi!", obj50);
        tabelaHash47.retira("hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray55 = tabelaHash47.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) objArray55);
        tabelaHash28.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass61 = tabelaHash20.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[null]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object[] objArray33 = tabelaHash28.recuperaItens();
        java.lang.Object obj35 = tabelaHash28.pesquisa("hi!");
        java.lang.Object obj37 = tabelaHash28.pesquisa("hi!");
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        tabelaHash28.insere("hi!", (java.lang.Object) tabelaHash39);
        java.lang.Object[] objArray43 = tabelaHash39.recuperaItens();
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        tabelaHash39.imprime();
        tabelaHash39.imprime();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        java.lang.Object obj51 = null;
        tabelaHash48.insere("hi!", obj51);
        tabelaHash48.retira("hi!");
        java.lang.Object[] objArray55 = tabelaHash48.recuperaItens();
        tabelaHash48.retira("hi!");
        java.lang.Object obj59 = tabelaHash48.pesquisa("");
        tabelaHash48.insere("hi!", (java.lang.Object) 0L);
        tabelaHash48.retira("");
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash48);
        tabelaHash20.insere("", (java.lang.Object) tabelaHash39);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[0]");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        tabelaHash21.retira("hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray19 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray24 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[1.0]");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object obj38 = null;
        tabelaHash35.insere("hi!", obj38);
        tabelaHash35.retira("hi!");
        tabelaHash35.retira("");
        java.lang.Object obj45 = tabelaHash35.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash35);
        tabelaHash35.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.imprime();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.imprime();
        java.lang.Object obj65 = null;
        tabelaHash62.insere("hi!", obj65);
        java.lang.Object[] objArray67 = tabelaHash62.recuperaItens();
        java.lang.Object obj69 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.retira("");
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray75 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray76 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray77 = tabelaHash62.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash62);
        java.lang.Object[] objArray79 = tabelaHash62.recuperaItens();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[null]");
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objArray75);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray76);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[null, 1.0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        tabelaHash17.retira("");
        tabelaHash17.retira("hi!");
        tabelaHash17.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash17);
        tabelaHash0.insere("", (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = null;
        tabelaHash33.insere("hi!", obj36);
        tabelaHash33.retira("");
        java.lang.Object[] objArray40 = tabelaHash33.recuperaItens();
        java.lang.Object obj42 = tabelaHash33.pesquisa("hi!");
        java.lang.Object[] objArray43 = tabelaHash33.recuperaItens();
        java.lang.Object obj45 = tabelaHash33.pesquisa("hi!");
        tabelaHash33.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash33);
        java.lang.Class<?> wildcardClass49 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[null]");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object obj38 = null;
        tabelaHash35.insere("hi!", obj38);
        java.lang.Object[] objArray40 = tabelaHash35.recuperaItens();
        java.lang.Object obj42 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("");
        tabelaHash35.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray48 = tabelaHash35.recuperaItens();
        tabelaHash35.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj53 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass57 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray48);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[null, 1.0]");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass31 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[, null]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = null;
        tabelaHash14.insere("hi!", obj17);
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = null;
        tabelaHash12.insere("hi!", obj15);
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        java.lang.Object obj24 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass29 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        tabelaHash27.retira("hi!");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        java.lang.Object obj38 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) 0L);
        tabelaHash27.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object obj47 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass48 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = null;
        tabelaHash12.insere("hi!", obj15);
        java.lang.Object obj18 = tabelaHash12.pesquisa("");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        tabelaHash31.insere("", (java.lang.Object) '4');
        tabelaHash12.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass40 = tabelaHash12.getClass();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash12);
        tabelaHash12.retira("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = obj30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object obj23 = tabelaHash17.pesquisa("");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
        tabelaHash26.imprime();
        java.lang.Object obj29 = null;
        tabelaHash26.insere("hi!", obj29);
        java.lang.Object[] objArray31 = tabelaHash26.recuperaItens();
        java.lang.Object obj33 = tabelaHash26.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash26.pesquisa("hi!");
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        tabelaHash37.imprime();
        tabelaHash26.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray41 = tabelaHash37.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash37.recuperaItens();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash37);
        ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
        tabelaHash45.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash45.retira("hi!");
        tabelaHash45.imprime();
        ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
        tabelaHash53.imprime();
        java.lang.Object obj56 = null;
        tabelaHash53.insere("hi!", obj56);
        java.lang.Object obj59 = tabelaHash53.pesquisa("");
        java.lang.Object[] objArray60 = tabelaHash53.recuperaItens();
        tabelaHash53.retira("");
        ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
        tabelaHash64.imprime();
        java.lang.Object obj67 = null;
        tabelaHash64.insere("hi!", obj67);
        tabelaHash64.retira("hi!");
        tabelaHash53.insere("hi!", (java.lang.Object) tabelaHash64);
        java.lang.Object[] objArray72 = tabelaHash64.recuperaItens();
        tabelaHash45.insere("hi!", (java.lang.Object) objArray72);
        tabelaHash45.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash37.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash37);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[null]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[null]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray31 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj35 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 1.0d + "'", obj35, 1.0d);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = null;
        tabelaHash14.insere("hi!", obj17);
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.retira("hi!");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        java.lang.Object obj31 = tabelaHash25.pesquisa("");
        java.lang.Object obj33 = tabelaHash25.pesquisa("hi!");
        java.lang.Object[] objArray34 = tabelaHash25.recuperaItens();
        java.lang.Class<?> wildcardClass35 = tabelaHash25.getClass();
        tabelaHash14.insere("", (java.lang.Object) wildcardClass35);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        tabelaHash0.insere("", (java.lang.Object) objArray13);
        tabelaHash0.imprime();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        java.lang.Object obj33 = tabelaHash27.pesquisa("");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash27);
        java.lang.Class<?> wildcardClass36 = tabelaHash9.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash19.imprime();
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        tabelaHash25.retira("hi!");
        java.lang.Object[] objArray32 = tabelaHash25.recuperaItens();
        tabelaHash25.retira("hi!");
        tabelaHash19.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash19.imprime();
        java.lang.Object[] objArray37 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash19);
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        java.lang.Object obj50 = null;
        tabelaHash47.insere("hi!", obj50);
        tabelaHash47.retira("hi!");
        java.lang.Object[] objArray54 = tabelaHash47.recuperaItens();
        tabelaHash40.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object obj57 = tabelaHash40.pesquisa("hi!");
        tabelaHash19.insere("", obj57);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
        tabelaHash5.imprime();
        java.lang.Object obj8 = null;
        tabelaHash5.insere("hi!", obj8);
        tabelaHash5.insere("hi!", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj19 = tabelaHash14.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash21.retira("hi!");
        tabelaHash14.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Class<?> wildcardClass28 = tabelaHash21.getClass();
        tabelaHash5.insere("", (java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = tabelaHash5.pesquisa("hi!");
        java.lang.Object[] objArray32 = tabelaHash5.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash5);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(objArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[class ds.TabelaHash, null, 4]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[class ds.TabelaHash, null, 4]");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        java.lang.Object obj24 = tabelaHash17.pesquisa("hi!");
        java.lang.Object obj26 = tabelaHash17.pesquisa("hi!");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        tabelaHash28.imprime();
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray32 = tabelaHash28.recuperaItens();
        tabelaHash28.insere("", (java.lang.Object) '4');
        tabelaHash28.retira("");
        tabelaHash11.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.retira("hi!");
        tabelaHash40.insere("", (java.lang.Object) 1.0d);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash40);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        java.lang.Object obj17 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object[] objArray20 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object obj34 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Object obj43 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray51 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) '4');
        tabelaHash28.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj58 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.retira("hi!");
        tabelaHash27.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        java.lang.Object obj37 = null;
        tabelaHash34.insere("hi!", obj37);
        tabelaHash34.retira("hi!");
        java.lang.Object[] objArray41 = tabelaHash34.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray43 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash50.recuperaItens();
        java.lang.Object[] objArray54 = tabelaHash50.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray56 = tabelaHash50.recuperaItens();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[]");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj26 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        tabelaHash20.retira("");
        java.lang.Object[] objArray27 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        java.lang.Object obj31 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + false + "'", obj31, false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass11 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        java.lang.Object[] objArray38 = tabelaHash29.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[hi!]");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = null;
        tabelaHash32.insere("hi!", obj35);
        java.lang.Object[] objArray37 = tabelaHash32.recuperaItens();
        java.lang.Object obj39 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("");
        java.lang.Object[] objArray42 = tabelaHash32.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        java.lang.Object obj47 = null;
        tabelaHash44.insere("hi!", obj47);
        java.lang.Object obj50 = tabelaHash44.pesquisa("");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        java.lang.Object obj55 = null;
        tabelaHash52.insere("hi!", obj55);
        java.lang.Object[] objArray57 = tabelaHash52.recuperaItens();
        java.lang.Object obj59 = tabelaHash52.pesquisa("hi!");
        java.lang.Object obj61 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash63);
        java.lang.Object[] objArray67 = tabelaHash63.recuperaItens();
        tabelaHash63.insere("", (java.lang.Object) '4');
        tabelaHash44.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass72 = tabelaHash44.getClass();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash11.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[null]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[null]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Object obj63 = tabelaHash7.pesquisa("");
        java.lang.Object[] objArray64 = tabelaHash7.recuperaItens();
        java.lang.Class<?> wildcardClass65 = tabelaHash7.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "" + "'", obj63, "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        tabelaHash9.insere("hi!", (java.lang.Object) '4');
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash9);
        tabelaHash9.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        java.lang.Object[] objArray26 = tabelaHash21.recuperaItens();
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash21.pesquisa("hi!");
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        tabelaHash32.imprime();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash32);
        tabelaHash21.insere("", (java.lang.Object) false);
        tabelaHash9.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray40 = tabelaHash9.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null, 4, ]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null, 4, ]");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = null;
        tabelaHash10.insere("hi!", obj13);
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        tabelaHash10.retira("hi!");
        tabelaHash10.retira("");
        java.lang.Class<?> wildcardClass23 = tabelaHash10.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[class ds.TabelaHash]");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        tabelaHash20.retira("");
        java.lang.Object[] objArray27 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[null]");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        java.lang.Object obj25 = tabelaHash18.pesquisa("hi!");
        tabelaHash18.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray31 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray33 = tabelaHash18.recuperaItens();
        java.lang.Object obj35 = tabelaHash18.pesquisa("");
        tabelaHash18.retira("");
        java.lang.Object[] objArray38 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) tabelaHash18);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null, 1.0]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[null, 1.0]");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        java.lang.Object[] objArray24 = tabelaHash20.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash20);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash28.retira("hi!");
        tabelaHash28.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object obj42 = tabelaHash36.pesquisa("");
        java.lang.Object[] objArray43 = tabelaHash36.recuperaItens();
        tabelaHash36.retira("");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        java.lang.Object obj50 = null;
        tabelaHash47.insere("hi!", obj50);
        tabelaHash47.retira("hi!");
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray55 = tabelaHash47.recuperaItens();
        tabelaHash28.insere("hi!", (java.lang.Object) objArray55);
        tabelaHash28.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash20.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[null]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash0.insere("", (java.lang.Object) "");
        java.lang.Object obj29 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        java.lang.Object obj34 = tabelaHash15.pesquisa("hi!");
        tabelaHash15.imprime();
        java.lang.Object[] objArray36 = tabelaHash15.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash15);
        java.lang.Object[] objArray38 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash39.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.imprime();
        tabelaHash15.imprime();
        tabelaHash15.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        java.lang.Object[] objArray26 = tabelaHash21.recuperaItens();
        java.lang.Object obj28 = tabelaHash21.pesquisa("hi!");
        tabelaHash21.retira("");
        tabelaHash21.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray34 = tabelaHash21.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) 1.0d);
        tabelaHash15.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash15.retira("hi!");
        java.lang.Object[] objArray41 = tabelaHash15.recuperaItens();
        java.lang.Object obj43 = tabelaHash15.pesquisa("hi!");
        tabelaHash0.insere("", obj43);
        java.lang.Class<?> wildcardClass45 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[null]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(objArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[1.0, null]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash18.retira("");
        ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
        tabelaHash25.imprime();
        java.lang.Object obj28 = null;
        tabelaHash25.insere("hi!", obj28);
        java.lang.Object[] objArray30 = tabelaHash25.recuperaItens();
        java.lang.Object obj32 = tabelaHash25.pesquisa("hi!");
        java.lang.Object obj34 = tabelaHash25.pesquisa("hi!");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        tabelaHash36.imprime();
        tabelaHash25.insere("hi!", (java.lang.Object) tabelaHash36);
        java.lang.Object[] objArray40 = tabelaHash36.recuperaItens();
        java.lang.Class<?> wildcardClass41 = objArray40.getClass();
        tabelaHash18.insere("", (java.lang.Object) objArray40);
        tabelaHash0.insere("", (java.lang.Object) objArray40);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[null]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        tabelaHash27.retira("hi!");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        java.lang.Object obj38 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) 0L);
        tabelaHash27.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        java.lang.Object[] objArray46 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.retira("hi!");
        tabelaHash11.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        tabelaHash18.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash18.recuperaItens();
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray27 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        java.lang.Object obj30 = tabelaHash18.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash18);
        tabelaHash18.retira("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object obj38 = null;
        tabelaHash35.insere("hi!", obj38);
        java.lang.Object[] objArray40 = tabelaHash35.recuperaItens();
        java.lang.Object obj42 = tabelaHash35.pesquisa("hi!");
        tabelaHash35.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash35);
        java.lang.Object[] objArray46 = tabelaHash18.recuperaItens();
        ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
        tabelaHash48.imprime();
        java.lang.Object obj51 = null;
        tabelaHash48.insere("hi!", obj51);
        java.lang.Object[] objArray53 = tabelaHash48.recuperaItens();
        java.lang.Object obj55 = tabelaHash48.pesquisa("hi!");
        tabelaHash48.retira("");
        tabelaHash48.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray61 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray62 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray63 = tabelaHash48.recuperaItens();
        java.lang.Object[] objArray64 = tabelaHash48.recuperaItens();
        tabelaHash18.insere("hi!", (java.lang.Object) objArray64);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null]");
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[null]");
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(objArray61);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray63);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[null, 1.0]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Object[] objArray62 = tabelaHash7.recuperaItens();
        java.lang.Object obj64 = null;
        tabelaHash7.insere("hi!", obj64);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Class<?> wildcardClass8 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        java.lang.Class<?> wildcardClass56 = tabelaHash39.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass28 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        java.lang.Class<?> wildcardClass23 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "" + "'", obj10, "");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Object[] objArray62 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray63 = tabelaHash7.recuperaItens();
        java.lang.Object obj65 = tabelaHash7.pesquisa("");
        tabelaHash7.retira("");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "" + "'", obj65, "");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1L);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray17 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(objArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[a, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[a, null]");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object obj31 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
        tabelaHash33.imprime();
        java.lang.Object obj36 = null;
        tabelaHash33.insere("hi!", obj36);
        java.lang.Object obj39 = tabelaHash33.pesquisa("hi!");
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash41.retira("hi!");
        tabelaHash33.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash49.retira("hi!");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash56.retira("hi!");
        tabelaHash56.imprime();
        tabelaHash56.imprime();
        java.lang.Object obj65 = tabelaHash56.pesquisa("");
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash56);
        java.lang.Object obj68 = tabelaHash49.pesquisa("hi!");
        tabelaHash49.imprime();
        java.lang.Object[] objArray70 = tabelaHash49.recuperaItens();
        tabelaHash33.insere("hi!", (java.lang.Object) tabelaHash49);
        java.lang.Class<?> wildcardClass72 = tabelaHash49.getClass();
        tabelaHash0.insere("", (java.lang.Object) wildcardClass72);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(obj68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Class<?> wildcardClass32 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[]]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash11.retira("");
        java.lang.Object[] objArray20 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.retira("hi!");
        tabelaHash9.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray29 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[1.0]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[1.0]");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash30 = new ds.TabelaHash();
        tabelaHash30.retira("hi!");
        tabelaHash30.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
        tabelaHash37.imprime();
        java.lang.Object obj40 = null;
        tabelaHash37.insere("hi!", obj40);
        tabelaHash37.retira("hi!");
        java.lang.Object[] objArray44 = tabelaHash37.recuperaItens();
        tabelaHash30.insere("hi!", (java.lang.Object) tabelaHash37);
        java.lang.Object[] objArray46 = tabelaHash37.recuperaItens();
        java.lang.Object[] objArray47 = tabelaHash37.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) objArray47);
        java.lang.Object[] objArray49 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNotNull(objArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[[], hi!]");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
        tabelaHash62.imprime();
        java.lang.Object obj65 = null;
        tabelaHash62.insere("hi!", obj65);
        java.lang.Object[] objArray67 = tabelaHash62.recuperaItens();
        java.lang.Object obj69 = tabelaHash62.pesquisa("hi!");
        tabelaHash62.retira("");
        tabelaHash62.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray75 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray76 = tabelaHash62.recuperaItens();
        java.lang.Object[] objArray77 = tabelaHash62.recuperaItens();
        tabelaHash7.insere("", (java.lang.Object) tabelaHash62);
        ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
        tabelaHash80.imprime();
        java.lang.Object obj83 = null;
        tabelaHash80.insere("hi!", obj83);
        java.lang.Object obj86 = tabelaHash80.pesquisa("");
        tabelaHash7.insere("", (java.lang.Object) tabelaHash80);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[null]");
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(objArray75);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray76);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray77);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[null, 1.0]");
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray40 = tabelaHash21.recuperaItens();
        java.lang.Object[] objArray41 = tabelaHash21.recuperaItens();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[0]");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) (byte) -1);
        java.lang.Object obj7 = tabelaHash0.pesquisa("");
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (byte) -1 + "'", obj7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object obj34 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Object obj43 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray51 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) '4');
        tabelaHash28.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        java.lang.Object obj61 = null;
        tabelaHash58.insere("hi!", obj61);
        java.lang.Object[] objArray63 = tabelaHash58.recuperaItens();
        java.lang.Object obj65 = tabelaHash58.pesquisa("hi!");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        java.lang.Object obj70 = null;
        tabelaHash67.insere("hi!", obj70);
        java.lang.Object[] objArray72 = tabelaHash67.recuperaItens();
        java.lang.Object obj74 = tabelaHash67.pesquisa("hi!");
        java.lang.Object obj76 = tabelaHash67.pesquisa("hi!");
        ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
        tabelaHash78.imprime();
        tabelaHash78.imprime();
        tabelaHash67.insere("hi!", (java.lang.Object) tabelaHash78);
        tabelaHash58.insere("", (java.lang.Object) tabelaHash67);
        java.lang.Object obj84 = tabelaHash67.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash67);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray88 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[null]");
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[null]");
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray40 = tabelaHash21.recuperaItens();
        java.lang.Class<?> wildcardClass41 = objArray40.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object obj14 = tabelaHash8.pesquisa("");
        java.lang.Object[] objArray15 = tabelaHash8.recuperaItens();
        tabelaHash8.retira("");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        java.lang.Object obj22 = null;
        tabelaHash19.insere("hi!", obj22);
        tabelaHash19.retira("hi!");
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray27 = tabelaHash19.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) objArray27);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj35 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash15.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash22.retira("hi!");
        tabelaHash22.imprime();
        tabelaHash22.imprime();
        java.lang.Object obj31 = tabelaHash22.pesquisa("");
        tabelaHash15.insere("hi!", (java.lang.Object) tabelaHash22);
        tabelaHash15.imprime();
        java.lang.Object obj35 = null;
        tabelaHash15.insere("hi!", obj35);
        tabelaHash0.insere("hi!", obj35);
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object obj45 = tabelaHash39.pesquisa("");
        java.lang.Object[] objArray46 = tabelaHash39.recuperaItens();
        tabelaHash39.retira("");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        java.lang.Object obj53 = null;
        tabelaHash50.insere("hi!", obj53);
        tabelaHash50.retira("hi!");
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object obj59 = tabelaHash39.pesquisa("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash39);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[null]");
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj29 = tabelaHash11.pesquisa("hi!");
        java.lang.Object[] objArray30 = tabelaHash11.recuperaItens();
        ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
        tabelaHash32.imprime();
        java.lang.Object obj35 = null;
        tabelaHash32.insere("hi!", obj35);
        java.lang.Object[] objArray37 = tabelaHash32.recuperaItens();
        java.lang.Object obj39 = tabelaHash32.pesquisa("hi!");
        tabelaHash32.retira("");
        java.lang.Object[] objArray42 = tabelaHash32.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        java.lang.Object obj47 = null;
        tabelaHash44.insere("hi!", obj47);
        java.lang.Object obj50 = tabelaHash44.pesquisa("");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        java.lang.Object obj55 = null;
        tabelaHash52.insere("hi!", obj55);
        java.lang.Object[] objArray57 = tabelaHash52.recuperaItens();
        java.lang.Object obj59 = tabelaHash52.pesquisa("hi!");
        java.lang.Object obj61 = tabelaHash52.pesquisa("hi!");
        ds.TabelaHash tabelaHash63 = new ds.TabelaHash();
        tabelaHash63.imprime();
        tabelaHash63.imprime();
        tabelaHash52.insere("hi!", (java.lang.Object) tabelaHash63);
        java.lang.Object[] objArray67 = tabelaHash63.recuperaItens();
        tabelaHash63.insere("", (java.lang.Object) '4');
        tabelaHash44.insere("", (java.lang.Object) "");
        java.lang.Class<?> wildcardClass72 = tabelaHash44.getClass();
        tabelaHash32.insere("", (java.lang.Object) tabelaHash44);
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash32);
        ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
        tabelaHash76.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj81 = tabelaHash76.pesquisa("");
        ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
        tabelaHash83.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash83.retira("hi!");
        tabelaHash76.insere("hi!", (java.lang.Object) tabelaHash83);
        tabelaHash83.imprime();
        tabelaHash83.imprime();
        tabelaHash32.insere("hi!", (java.lang.Object) tabelaHash83);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[null]");
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[null]");
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[null]");
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[]");
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash17.imprime();
        java.lang.Object obj37 = null;
        tabelaHash17.insere("hi!", obj37);
        tabelaHash0.insere("hi!", obj37);
        java.lang.Class<?> wildcardClass40 = tabelaHash0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) 1.0d);
        tabelaHash21.insere("", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray32 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object[] objArray19 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        tabelaHash21.imprime();
        tabelaHash21.retira("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object obj29 = tabelaHash21.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[1.0, null]");
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[1.0, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[1.0, null]");
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object[] objArray25 = tabelaHash9.recuperaItens();
        tabelaHash9.retira("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash9.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
        tabelaHash2.imprime();
        java.lang.Object obj5 = null;
        tabelaHash2.insere("hi!", obj5);
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash6 = new ds.TabelaHash();
        tabelaHash6.imprime();
        java.lang.Object obj9 = null;
        tabelaHash6.insere("hi!", obj9);
        java.lang.Object[] objArray11 = tabelaHash6.recuperaItens();
        java.lang.Object obj13 = tabelaHash6.pesquisa("hi!");
        tabelaHash6.retira("");
        tabelaHash6.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray19 = tabelaHash6.recuperaItens();
        tabelaHash6.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray26 = tabelaHash0.recuperaItens();
        java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[null]");
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray12 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        java.lang.Object obj19 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        java.lang.Object obj32 = null;
        tabelaHash29.insere("hi!", obj32);
        java.lang.Object[] objArray34 = tabelaHash29.recuperaItens();
        java.lang.Object obj36 = tabelaHash29.pesquisa("hi!");
        java.lang.Object obj38 = tabelaHash29.pesquisa("hi!");
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        tabelaHash40.imprime();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash40.imprime();
        ds.TabelaHash tabelaHash46 = new ds.TabelaHash();
        tabelaHash46.imprime();
        java.lang.Object obj49 = null;
        tabelaHash46.insere("hi!", obj49);
        tabelaHash46.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash46.recuperaItens();
        tabelaHash46.retira("hi!");
        tabelaHash40.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash40.imprime();
        java.lang.Object[] objArray58 = tabelaHash40.recuperaItens();
        tabelaHash21.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash7.insere("", (java.lang.Object) "");
        tabelaHash7.imprime();
        java.lang.Object[] objArray62 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray63 = tabelaHash7.recuperaItens();
        java.lang.Object obj65 = tabelaHash7.pesquisa("");
        ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
        tabelaHash67.imprime();
        java.lang.Object obj70 = null;
        tabelaHash67.insere("hi!", obj70);
        java.lang.Object obj73 = tabelaHash67.pesquisa("");
        ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
        tabelaHash75.imprime();
        java.lang.Object obj78 = null;
        tabelaHash75.insere("hi!", obj78);
        java.lang.Object[] objArray80 = tabelaHash75.recuperaItens();
        java.lang.Object obj82 = tabelaHash75.pesquisa("hi!");
        java.lang.Object obj84 = tabelaHash75.pesquisa("hi!");
        ds.TabelaHash tabelaHash86 = new ds.TabelaHash();
        tabelaHash86.imprime();
        tabelaHash86.imprime();
        tabelaHash75.insere("hi!", (java.lang.Object) tabelaHash86);
        java.lang.Object[] objArray90 = tabelaHash86.recuperaItens();
        tabelaHash86.insere("", (java.lang.Object) '4');
        tabelaHash67.insere("", (java.lang.Object) "");
        java.lang.Object[] objArray95 = tabelaHash67.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash67);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[null]");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + "" + "'", obj65, "");
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[null]");
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[]");
        org.junit.Assert.assertNotNull(objArray95);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray95), "[, null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray95), "[, null]");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        tabelaHash29.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        java.lang.Object obj10 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash12 = new ds.TabelaHash();
        tabelaHash12.imprime();
        java.lang.Object obj15 = null;
        tabelaHash12.insere("hi!", obj15);
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("hi!");
        tabelaHash12.retira("");
        java.lang.Object obj24 = tabelaHash12.pesquisa("hi!");
        tabelaHash12.imprime();
        java.lang.Class<?> wildcardClass26 = tabelaHash12.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        java.lang.Object obj30 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class ds.TabelaHash]");
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj14 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Ignore
    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.retira("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray21 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray22 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null, 1.0]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[1.0]");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1.0d + "'", obj8, 1.0d);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        java.lang.Object obj18 = tabelaHash0.pesquisa("");
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, 1.0]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        java.lang.Object[] objArray8 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
        tabelaHash10.imprime();
        java.lang.Object obj13 = null;
        tabelaHash10.insere("hi!", obj13);
        java.lang.Object obj16 = tabelaHash10.pesquisa("");
        java.lang.Object[] objArray17 = tabelaHash10.recuperaItens();
        tabelaHash10.retira("");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        tabelaHash28.retira("hi!");
        java.lang.Object[] objArray35 = tabelaHash28.recuperaItens();
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash28);
        java.lang.Object[] objArray37 = tabelaHash28.recuperaItens();
        tabelaHash28.imprime();
        java.lang.Object obj40 = tabelaHash28.pesquisa("");
        tabelaHash10.insere("hi!", (java.lang.Object) tabelaHash28);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[null]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        java.lang.Object[] objArray37 = tabelaHash29.recuperaItens();
        ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
        tabelaHash39.imprime();
        java.lang.Object obj42 = null;
        tabelaHash39.insere("hi!", obj42);
        java.lang.Object[] objArray44 = tabelaHash39.recuperaItens();
        java.lang.Object obj46 = tabelaHash39.pesquisa("hi!");
        java.lang.Object obj48 = tabelaHash39.pesquisa("hi!");
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.imprime();
        tabelaHash50.imprime();
        tabelaHash39.insere("hi!", (java.lang.Object) tabelaHash50);
        java.lang.Object[] objArray54 = tabelaHash39.recuperaItens();
        tabelaHash29.insere("", (java.lang.Object) tabelaHash39);
        ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) tabelaHash57);
        tabelaHash57.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[null]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) 'a');
        tabelaHash0.retira("");
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj17 = null;
        tabelaHash0.insere("hi!", obj17);
        java.lang.Class<?> wildcardClass19 = tabelaHash0.getClass();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray4 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[hi!]");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        java.lang.Object[] objArray10 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("");
        java.lang.Object obj16 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[null]");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj16 = tabelaHash11.pesquisa("");
        tabelaHash11.retira("");
        java.lang.Object obj20 = tabelaHash11.pesquisa("");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj27 = tabelaHash22.pesquisa("");
        tabelaHash11.insere("", (java.lang.Object) "");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        java.lang.Object[] objArray16 = tabelaHash11.recuperaItens();
        java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
        tabelaHash11.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray24 = tabelaHash11.recuperaItens();
        java.lang.Object[] objArray25 = tabelaHash11.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) objArray25);
        java.lang.Object[] objArray27 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray27);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[null, 1.0], null]");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object[] objArray13 = tabelaHash7.recuperaItens();
        java.lang.Class<?> wildcardClass14 = objArray13.getClass();
        tabelaHash0.insere("", (java.lang.Object) objArray13);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj24 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!]");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        tabelaHash17.retira("hi!");
        java.lang.Object[] objArray24 = tabelaHash17.recuperaItens();
        tabelaHash17.retira("hi!");
        tabelaHash11.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray29 = tabelaHash11.recuperaItens();
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        tabelaHash36.retira("hi!");
        tabelaHash36.retira("");
        tabelaHash36.retira("");
        tabelaHash11.insere("hi!", (java.lang.Object) tabelaHash36);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[hi!]");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object[] objArray16 = tabelaHash7.recuperaItens();
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        tabelaHash7.retira("hi!");
        ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
        tabelaHash22.retira("hi!");
        java.lang.Object[] objArray25 = tabelaHash22.recuperaItens();
        tabelaHash7.insere("hi!", (java.lang.Object) objArray25);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray6 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray9 = tabelaHash0.recuperaItens();
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[null]");
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj13 = tabelaHash0.pesquisa("");
        // The following exception was thrown during execution in test generation
        try {
            tabelaHash0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        tabelaHash0.insere("", (java.lang.Object) false);
        java.lang.Object[] objArray18 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj25 = tabelaHash20.pesquisa("");
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.retira("");
        tabelaHash20.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash29);
        tabelaHash29.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
        tabelaHash15.retira("hi!");
        java.lang.Class<?> wildcardClass18 = tabelaHash15.getClass();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash15);
        java.lang.Object obj21 = tabelaHash15.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.imprime();
        java.lang.Object obj24 = null;
        tabelaHash21.insere("hi!", obj24);
        tabelaHash21.retira("hi!");
        java.lang.Object[] objArray28 = tabelaHash21.recuperaItens();
        tabelaHash21.retira("hi!");
        java.lang.Object obj32 = tabelaHash21.pesquisa("");
        tabelaHash21.insere("hi!", (java.lang.Object) 0L);
        java.lang.Object obj37 = tabelaHash21.pesquisa("");
        tabelaHash21.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        ds.TabelaHash tabelaHash41 = new ds.TabelaHash();
        tabelaHash41.imprime();
        java.lang.Object obj44 = null;
        tabelaHash41.insere("hi!", obj44);
        java.lang.Object[] objArray46 = tabelaHash41.recuperaItens();
        java.lang.Object obj48 = tabelaHash41.pesquisa("hi!");
        java.lang.Object obj50 = tabelaHash41.pesquisa("hi!");
        ds.TabelaHash tabelaHash52 = new ds.TabelaHash();
        tabelaHash52.imprime();
        tabelaHash52.imprime();
        tabelaHash41.insere("hi!", (java.lang.Object) tabelaHash52);
        tabelaHash41.insere("", (java.lang.Object) false);
        tabelaHash41.retira("");
        tabelaHash41.retira("");
        tabelaHash21.insere("hi!", (java.lang.Object) tabelaHash41);
        java.lang.Class<?> wildcardClass64 = tabelaHash21.getClass();
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[null]");
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.imprime();
        java.lang.Object obj12 = null;
        tabelaHash9.insere("hi!", obj12);
        java.lang.Object[] objArray14 = tabelaHash9.recuperaItens();
        java.lang.Object obj16 = tabelaHash9.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash9.pesquisa("hi!");
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        tabelaHash20.imprime();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash20);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        java.lang.Object obj26 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object obj34 = tabelaHash28.pesquisa("");
        ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
        tabelaHash36.imprime();
        java.lang.Object obj39 = null;
        tabelaHash36.insere("hi!", obj39);
        java.lang.Object[] objArray41 = tabelaHash36.recuperaItens();
        java.lang.Object obj43 = tabelaHash36.pesquisa("hi!");
        java.lang.Object obj45 = tabelaHash36.pesquisa("hi!");
        ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
        tabelaHash47.imprime();
        tabelaHash47.imprime();
        tabelaHash36.insere("hi!", (java.lang.Object) tabelaHash47);
        java.lang.Object[] objArray51 = tabelaHash47.recuperaItens();
        tabelaHash47.insere("", (java.lang.Object) '4');
        tabelaHash28.insere("", (java.lang.Object) "");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
        tabelaHash58.imprime();
        java.lang.Object obj61 = null;
        tabelaHash58.insere("hi!", obj61);
        tabelaHash58.retira("hi!");
        tabelaHash58.retira("hi!");
        tabelaHash58.imprime();
        java.lang.Object obj69 = tabelaHash58.pesquisa("hi!");
        tabelaHash0.insere("", (java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null]");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[null]");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object obj8 = tabelaHash0.pesquisa("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("hi!");
        java.lang.Object obj11 = tabelaHash0.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) 0L);
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        tabelaHash16.retira("hi!");
        tabelaHash16.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash16);
        java.lang.Object[] objArray26 = tabelaHash16.recuperaItens();
        ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
        tabelaHash28.imprime();
        java.lang.Object obj31 = null;
        tabelaHash28.insere("hi!", obj31);
        java.lang.Object[] objArray33 = tabelaHash28.recuperaItens();
        java.lang.Object obj35 = tabelaHash28.pesquisa("hi!");
        tabelaHash28.retira("");
        java.lang.Object[] objArray38 = tabelaHash28.recuperaItens();
        java.lang.Class<?> wildcardClass39 = objArray38.getClass();
        tabelaHash16.insere("hi!", (java.lang.Object) objArray38);
        java.lang.Object obj42 = tabelaHash16.pesquisa("");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[null]");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[null]");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
        tabelaHash14.imprime();
        java.lang.Object obj17 = null;
        tabelaHash14.insere("hi!", obj17);
        tabelaHash14.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash14);
        tabelaHash14.retira("hi!");
        tabelaHash14.retira("");
        java.lang.Object obj27 = tabelaHash14.pesquisa("hi!");
        tabelaHash14.retira("hi!");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj13 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Class<?> wildcardClass23 = objArray22.getClass();
        tabelaHash0.insere("", (java.lang.Object) objArray22);
        java.lang.Object[] objArray25 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[[], hi!]");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj18 = tabelaHash7.pesquisa("hi!");
        tabelaHash7.imprime();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object obj15 = tabelaHash0.pesquisa("hi!");
        java.lang.Object[] objArray16 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        java.lang.Object obj21 = null;
        tabelaHash18.insere("hi!", obj21);
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        java.lang.Object obj25 = tabelaHash18.pesquisa("hi!");
        java.lang.Object obj27 = tabelaHash18.pesquisa("hi!");
        ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
        tabelaHash29.imprime();
        tabelaHash29.imprime();
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash29);
        tabelaHash29.imprime();
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.imprime();
        java.lang.Object obj38 = null;
        tabelaHash35.insere("hi!", obj38);
        tabelaHash35.retira("hi!");
        java.lang.Object[] objArray42 = tabelaHash35.recuperaItens();
        tabelaHash35.retira("hi!");
        tabelaHash29.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash29.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash29);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash7.imprime();
        java.lang.Object obj16 = tabelaHash7.pesquisa("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj19 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
        tabelaHash21.retira("hi!");
        tabelaHash21.insere("", (java.lang.Object) 1.0d);
        tabelaHash21.insere("", (java.lang.Object) 1L);
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash21);
        java.lang.Object[] objArray31 = tabelaHash0.recuperaItens();
        java.lang.Object obj33 = tabelaHash0.pesquisa("hi!");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj5 = tabelaHash0.pesquisa("");
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
        tabelaHash9.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash9.retira("");
        tabelaHash0.insere("", (java.lang.Object) tabelaHash9);
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.imprime();
        java.lang.Object obj20 = null;
        tabelaHash17.insere("hi!", obj20);
        java.lang.Object[] objArray22 = tabelaHash17.recuperaItens();
        java.lang.Object obj24 = tabelaHash17.pesquisa("hi!");
        tabelaHash17.retira("");
        tabelaHash17.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray30 = tabelaHash17.recuperaItens();
        tabelaHash17.insere("", (java.lang.Object) 1.0d);
        tabelaHash17.retira("");
        java.lang.Object[] objArray36 = tabelaHash17.recuperaItens();
        tabelaHash9.insere("hi!", (java.lang.Object) tabelaHash17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[null]");
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(objArray30);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[null, 1.0]");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object obj6 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray7 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        java.lang.Object obj14 = null;
        tabelaHash11.insere("hi!", obj14);
        tabelaHash11.retira("hi!");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object obj20 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        java.lang.Object[] objArray21 = tabelaHash20.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) objArray21);
        tabelaHash11.retira("hi!");
        tabelaHash11.imprime();
        java.lang.Object[] objArray26 = tabelaHash11.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[4]");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        tabelaHash0.retira("");
        tabelaHash0.retira("hi!");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        java.lang.Object[] objArray14 = tabelaHash7.recuperaItens();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash7);
        java.lang.Object obj17 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        java.lang.Object[] objArray28 = tabelaHash0.recuperaItens();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[1.0]");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.retira("hi!");
        tabelaHash35.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray41 = tabelaHash35.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash35.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        java.lang.Object obj47 = null;
        tabelaHash44.insere("hi!", obj47);
        tabelaHash44.insere("hi!", (java.lang.Object) '4');
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object[] objArray54 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1.0]");
        org.junit.Assert.assertNotNull(objArray54);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[, hi!]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[, hi!]");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.retira("hi!");
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1L);
        java.lang.Object obj10 = null;
        tabelaHash0.insere("hi!", obj10);
        ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
        tabelaHash13.imprime();
        tabelaHash13.imprime();
        tabelaHash13.retira("");
        tabelaHash13.imprime();
        ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
        tabelaHash20.imprime();
        java.lang.Object obj23 = null;
        tabelaHash20.insere("hi!", obj23);
        java.lang.Object[] objArray25 = tabelaHash20.recuperaItens();
        java.lang.Object obj27 = tabelaHash20.pesquisa("hi!");
        java.lang.Object obj29 = tabelaHash20.pesquisa("hi!");
        ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        tabelaHash20.insere("hi!", (java.lang.Object) tabelaHash31);
        java.lang.Object[] objArray35 = tabelaHash31.recuperaItens();
        java.lang.Object[] objArray36 = tabelaHash31.recuperaItens();
        tabelaHash31.imprime();
        tabelaHash31.imprime();
        ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
        tabelaHash40.imprime();
        java.lang.Object obj43 = null;
        tabelaHash40.insere("hi!", obj43);
        tabelaHash40.retira("hi!");
        java.lang.Object[] objArray47 = tabelaHash40.recuperaItens();
        tabelaHash40.retira("hi!");
        java.lang.Object obj51 = tabelaHash40.pesquisa("");
        tabelaHash40.insere("hi!", (java.lang.Object) 0L);
        tabelaHash40.retira("");
        tabelaHash31.insere("hi!", (java.lang.Object) tabelaHash40);
        tabelaHash13.insere("", (java.lang.Object) tabelaHash40);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash13);
        tabelaHash13.retira("");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[null]");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray13 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray14 = tabelaHash0.recuperaItens();
        java.lang.Object[] objArray15 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
        tabelaHash17.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash17.retira("hi!");
        ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
        tabelaHash24.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash24.retira("hi!");
        tabelaHash24.imprime();
        tabelaHash24.imprime();
        java.lang.Object obj33 = tabelaHash24.pesquisa("");
        tabelaHash17.insere("hi!", (java.lang.Object) tabelaHash24);
        tabelaHash17.imprime();
        java.lang.Object obj37 = null;
        tabelaHash17.insere("hi!", obj37);
        tabelaHash0.insere("hi!", obj37);
        java.lang.Object[] objArray40 = tabelaHash0.recuperaItens();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[null, 1.0]");
        org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[null, 1.0]");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(objArray40);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[null, null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[null, null, 1.0]");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        tabelaHash8.retira("");
        tabelaHash8.insere("hi!", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray21 = tabelaHash8.recuperaItens();
        tabelaHash8.insere("", (java.lang.Object) 1.0d);
        tabelaHash0.insere("", (java.lang.Object) 1.0d);
        java.lang.Object obj27 = tabelaHash0.pesquisa("");
        tabelaHash0.retira("");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(objArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[null, 1.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[null, 1.0]");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + 1.0d + "'", obj27, 1.0d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        tabelaHash7.retira("hi!");
        tabelaHash7.imprime();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash7);
        tabelaHash7.retira("hi!");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        tabelaHash0.imprime();
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
        tabelaHash7.imprime();
        java.lang.Object obj10 = null;
        tabelaHash7.insere("hi!", obj10);
        java.lang.Object[] objArray12 = tabelaHash7.recuperaItens();
        java.lang.Object obj14 = tabelaHash7.pesquisa("hi!");
        java.lang.Object obj16 = tabelaHash7.pesquisa("hi!");
        ds.TabelaHash tabelaHash18 = new ds.TabelaHash();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        tabelaHash7.insere("hi!", (java.lang.Object) tabelaHash18);
        java.lang.Object[] objArray22 = tabelaHash18.recuperaItens();
        java.lang.Object[] objArray23 = tabelaHash18.recuperaItens();
        tabelaHash18.imprime();
        tabelaHash18.imprime();
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.imprime();
        java.lang.Object obj30 = null;
        tabelaHash27.insere("hi!", obj30);
        tabelaHash27.retira("hi!");
        java.lang.Object[] objArray34 = tabelaHash27.recuperaItens();
        tabelaHash27.retira("hi!");
        java.lang.Object obj38 = tabelaHash27.pesquisa("");
        tabelaHash27.insere("hi!", (java.lang.Object) 0L);
        tabelaHash27.retira("");
        tabelaHash18.insere("hi!", (java.lang.Object) tabelaHash27);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash27);
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
        tabelaHash49.insere("hi!", (java.lang.Object) "hi!");
        java.lang.Object obj54 = tabelaHash49.pesquisa("");
        ds.TabelaHash tabelaHash56 = new ds.TabelaHash();
        tabelaHash56.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash56.retira("hi!");
        tabelaHash49.insere("hi!", (java.lang.Object) tabelaHash56);
        tabelaHash56.imprime();
        java.lang.Object obj65 = tabelaHash56.pesquisa("hi!");
        tabelaHash56.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash56);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[null]");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        java.lang.Object[] objArray5 = tabelaHash0.recuperaItens();
        java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
        java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
        ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
        tabelaHash11.imprime();
        tabelaHash11.imprime();
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash11);
        java.lang.Object[] objArray15 = tabelaHash11.recuperaItens();
        tabelaHash11.insere("", (java.lang.Object) '4');
        tabelaHash11.retira("");
        tabelaHash11.retira("hi!");
        java.lang.Object obj24 = tabelaHash11.pesquisa("");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[null]");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.imprime();
        java.lang.Object obj3 = null;
        tabelaHash0.insere("hi!", obj3);
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("hi!");
        tabelaHash0.retira("");
        java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
        tabelaHash0.retira("");
        ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
        tabelaHash16.imprime();
        java.lang.Object obj19 = null;
        tabelaHash16.insere("hi!", obj19);
        java.lang.Object obj22 = tabelaHash16.pesquisa("");
        java.lang.Object[] objArray23 = tabelaHash16.recuperaItens();
        tabelaHash16.retira("");
        ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
        tabelaHash27.retira("hi!");
        tabelaHash27.insere("", (java.lang.Object) 1.0d);
        ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
        tabelaHash34.imprime();
        java.lang.Object obj37 = null;
        tabelaHash34.insere("hi!", obj37);
        tabelaHash34.retira("hi!");
        java.lang.Object[] objArray41 = tabelaHash34.recuperaItens();
        tabelaHash27.insere("hi!", (java.lang.Object) tabelaHash34);
        java.lang.Object[] objArray43 = tabelaHash34.recuperaItens();
        tabelaHash34.imprime();
        java.lang.Object obj46 = tabelaHash34.pesquisa("");
        tabelaHash16.insere("hi!", (java.lang.Object) tabelaHash34);
        tabelaHash0.insere("", (java.lang.Object) tabelaHash34);
        ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
        tabelaHash50.retira("hi!");
        java.lang.Object[] objArray53 = tabelaHash50.recuperaItens();
        java.lang.Object[] objArray54 = tabelaHash50.recuperaItens();
        tabelaHash0.insere("", (java.lang.Object) tabelaHash50);
        tabelaHash50.retira("");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[null]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        tabelaHash0.insere("", (java.lang.Object) "");
        ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
        tabelaHash8.imprime();
        java.lang.Object obj11 = null;
        tabelaHash8.insere("hi!", obj11);
        java.lang.Object[] objArray13 = tabelaHash8.recuperaItens();
        java.lang.Object obj15 = tabelaHash8.pesquisa("hi!");
        java.lang.Object obj17 = tabelaHash8.pesquisa("hi!");
        ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
        tabelaHash19.imprime();
        tabelaHash19.imprime();
        tabelaHash8.insere("hi!", (java.lang.Object) tabelaHash19);
        java.lang.Object[] objArray23 = tabelaHash19.recuperaItens();
        tabelaHash19.insere("", (java.lang.Object) '4');
        tabelaHash19.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash19);
        tabelaHash0.retira("hi!");
        java.lang.Object obj33 = tabelaHash0.pesquisa("");
        ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
        tabelaHash35.retira("hi!");
        tabelaHash35.insere("", (java.lang.Object) 1.0d);
        java.lang.Object[] objArray41 = tabelaHash35.recuperaItens();
        java.lang.Object[] objArray42 = tabelaHash35.recuperaItens();
        ds.TabelaHash tabelaHash44 = new ds.TabelaHash();
        tabelaHash44.imprime();
        java.lang.Object obj47 = null;
        tabelaHash44.insere("hi!", obj47);
        tabelaHash44.insere("hi!", (java.lang.Object) '4');
        tabelaHash35.insere("hi!", (java.lang.Object) tabelaHash44);
        tabelaHash0.insere("hi!", (java.lang.Object) "hi!");
        ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
        tabelaHash55.imprime();
        java.lang.Object obj58 = null;
        tabelaHash55.insere("hi!", obj58);
        java.lang.Object[] objArray60 = tabelaHash55.recuperaItens();
        java.lang.Object obj62 = tabelaHash55.pesquisa("hi!");
        java.lang.Object obj64 = tabelaHash55.pesquisa("hi!");
        ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
        tabelaHash66.imprime();
        tabelaHash66.imprime();
        tabelaHash55.insere("hi!", (java.lang.Object) tabelaHash66);
        java.lang.Object obj71 = tabelaHash66.pesquisa("");
        tabelaHash66.retira("");
        tabelaHash0.insere("hi!", (java.lang.Object) tabelaHash66);
        tabelaHash0.retira("");
        tabelaHash0.imprime();
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "" + "'", obj33, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[1.0]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[1.0]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[null]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[null]");
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj71);
    }
}
