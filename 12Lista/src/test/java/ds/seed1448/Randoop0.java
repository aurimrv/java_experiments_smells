package ds.seed1448;

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
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.insere((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Class<?> wildcardClass1 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass20 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        // The following exception was thrown during execution in test generation
        try {
            lista3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass26 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass18 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        boolean boolean6 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        java.lang.Class<?> wildcardClass6 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass12 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean11 = lista7.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass10 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass12 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        boolean boolean7 = lista3.vazia();
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 1);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        boolean boolean12 = lista9.vazia();
        lista9.imprime();
        boolean boolean14 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean14);
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass27 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        ds.Lista lista8 = new ds.Lista();
        lista5.insere((java.lang.Object) lista8);
        lista8.insere((java.lang.Object) (-1.0d));
        lista8.imprime();
        boolean boolean13 = lista8.vazia();
        lista8.imprime();
        java.lang.Class<?> wildcardClass15 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.insere((java.lang.Object) (-1.0d));
        boolean boolean24 = lista20.vazia();
        lista20.insere((java.lang.Object) 100);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass30 = lista27.getClass();
        lista20.insere((java.lang.Object) wildcardClass30);
        lista0.insere((java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 1);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        boolean boolean12 = lista9.vazia();
        lista9.imprime();
        boolean boolean14 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean41 = lista25.vazia();
        java.lang.Class<?> wildcardClass42 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass10 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass13 = lista9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        java.lang.Object obj24 = null;
        lista21.insere(obj24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        lista29.insere((java.lang.Object) (-1.0d));
        lista29.imprime();
        boolean boolean34 = lista29.vazia();
        lista29.imprime();
        lista21.insere((java.lang.Object) lista29);
        java.lang.Class<?> wildcardClass37 = lista29.getClass();
        lista3.insere((java.lang.Object) lista29);
        boolean boolean39 = lista29.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        ds.Lista lista8 = new ds.Lista();
        lista5.insere((java.lang.Object) lista8);
        lista8.imprime();
        lista8.imprime();
        lista8.insere((java.lang.Object) 10);
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass15 = lista8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 100L);
        boolean boolean36 = lista30.vazia();
        boolean boolean37 = lista30.vazia();
        lista0.insere((java.lang.Object) boolean37);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        boolean boolean46 = lista42.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista50.insere((java.lang.Object) (-1.0d));
        lista50.imprime();
        lista50.insere((java.lang.Object) (byte) -1);
        boolean boolean57 = lista50.vazia();
        boolean boolean58 = lista50.vazia();
        java.lang.Class<?> wildcardClass59 = lista50.getClass();
        lista42.insere((java.lang.Object) wildcardClass59);
        lista0.insere((java.lang.Object) wildcardClass59);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        lista26.insere((java.lang.Object) (-1.0d));
        lista26.imprime();
        lista26.insere((java.lang.Object) (byte) -1);
        boolean boolean33 = lista26.vazia();
        boolean boolean34 = lista26.vazia();
        lista26.imprime();
        lista18.insere((java.lang.Object) lista26);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.insere((java.lang.Object) (short) 100);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        lista11.insere((java.lang.Object) lista16);
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass25 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 10);
        boolean boolean20 = lista14.vazia();
        lista7.insere((java.lang.Object) lista14);
        lista14.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista26.insere((java.lang.Object) lista34);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        lista44.imprime();
        java.lang.Object obj47 = null;
        lista44.insere(obj47);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.insere((java.lang.Object) (-1.0d));
        lista52.imprime();
        boolean boolean57 = lista52.vazia();
        lista52.imprime();
        lista44.insere((java.lang.Object) lista52);
        java.lang.Class<?> wildcardClass60 = lista52.getClass();
        lista26.insere((java.lang.Object) lista52);
        lista14.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass63 = lista14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 10);
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        boolean boolean35 = lista33.vazia();
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        lista26.insere((java.lang.Object) lista33);
        lista19.insere((java.lang.Object) lista33);
        lista3.insere((java.lang.Object) lista33);
        lista33.imprime();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        java.lang.Class<?> wildcardClass8 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista21.imprime();
        java.lang.Class<?> wildcardClass26 = lista21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        lista0.imprime();
        java.lang.Object obj23 = null;
        lista0.insere(obj23);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista45.insere((java.lang.Object) (-1.0d));
        lista45.imprime();
        boolean boolean50 = lista45.vazia();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        boolean boolean55 = lista45.vazia();
        lista11.insere((java.lang.Object) boolean55);
        java.lang.Class<?> wildcardClass57 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) -1);
        lista28.imprime();
        boolean boolean36 = lista28.vazia();
        boolean boolean37 = lista28.vazia();
        lista0.insere((java.lang.Object) lista28);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        lista39.insere((java.lang.Object) (short) 100);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista47.insere((java.lang.Object) (-1.0d));
        lista47.imprime();
        boolean boolean52 = lista47.vazia();
        lista47.imprime();
        java.lang.Class<?> wildcardClass54 = lista47.getClass();
        lista39.insere((java.lang.Object) wildcardClass54);
        lista28.insere((java.lang.Object) wildcardClass54);
        java.lang.Class<?> wildcardClass57 = lista28.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        lista3.imprime();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        boolean boolean12 = lista3.vazia();
        lista3.imprime();
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass13 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        lista25.imprime();
        lista9.insere((java.lang.Object) lista25);
        java.lang.Class<?> wildcardClass33 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        boolean boolean25 = lista0.vazia();
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        boolean boolean23 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) -1);
        boolean boolean35 = lista28.vazia();
        lista17.insere((java.lang.Object) boolean35);
        lista0.insere((java.lang.Object) lista17);
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        lista8.insere((java.lang.Object) (short) 100);
        boolean boolean13 = lista8.vazia();
        boolean boolean14 = lista8.vazia();
        lista3.insere((java.lang.Object) lista8);
        boolean boolean16 = lista8.vazia();
        java.lang.Class<?> wildcardClass17 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        lista12.insere((java.lang.Object) (byte) -1);
        boolean boolean19 = lista12.vazia();
        boolean boolean20 = lista12.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        lista24.insere((java.lang.Object) (-1.0d));
        boolean boolean28 = lista24.vazia();
        lista24.insere((java.lang.Object) 100);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass34);
        lista12.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista12);
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        boolean boolean17 = lista10.vazia();
        java.lang.Class<?> wildcardClass18 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        boolean boolean9 = lista7.vazia();
        lista7.insere((java.lang.Object) 10);
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        lista12.imprime();
        lista7.insere((java.lang.Object) lista12);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        boolean boolean21 = lista19.vazia();
        lista19.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        boolean boolean29 = lista26.vazia();
        lista26.imprime();
        lista19.insere((java.lang.Object) lista26);
        lista12.insere((java.lang.Object) lista26);
        lista0.insere((java.lang.Object) lista26);
        java.lang.Class<?> wildcardClass34 = lista26.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        boolean boolean13 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass16 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        lista15.insere((java.lang.Object) (-1.0d));
        boolean boolean19 = lista15.vazia();
        lista15.insere((java.lang.Object) 100);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass25 = lista22.getClass();
        lista15.insere((java.lang.Object) wildcardClass25);
        lista3.insere((java.lang.Object) lista15);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        boolean boolean30 = lista28.vazia();
        lista28.imprime();
        lista15.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass33 = lista28.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        ds.Lista lista30 = new ds.Lista();
        lista27.insere((java.lang.Object) lista30);
        lista30.insere((java.lang.Object) (-1.0d));
        lista30.imprime();
        boolean boolean35 = lista30.vazia();
        lista22.insere((java.lang.Object) lista30);
        lista30.imprime();
        java.lang.Object obj38 = null;
        lista30.insere(obj38);
        lista11.insere((java.lang.Object) lista30);
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        boolean boolean26 = lista24.vazia();
        lista24.insere((java.lang.Object) 10);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        boolean boolean33 = lista29.vazia();
        lista0.insere((java.lang.Object) lista29);
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 0.0d);
        ds.Lista lista6 = new ds.Lista();
        lista3.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.insere((java.lang.Object) '4');
        lista6.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) "");
        lista14.imprime();
        lista14.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        lista14.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        boolean boolean30 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        boolean boolean8 = lista3.vazia();
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        lista0.insere((java.lang.Object) (short) 1);
        lista0.imprime();
        boolean boolean18 = lista0.vazia();
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        java.lang.Class<?> wildcardClass16 = lista10.getClass();
        lista3.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean26 = lista5.vazia();
        java.lang.Class<?> wildcardClass27 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        lista11.insere((java.lang.Object) 10);
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        lista11.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        lista20.insere((java.lang.Object) 0.0d);
        boolean boolean26 = lista20.vazia();
        lista20.imprime();
        lista16.insere((java.lang.Object) lista20);
        boolean boolean29 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass31 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista14.insere((java.lang.Object) 10.0d);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        lista21.imprime();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista14.insere((java.lang.Object) lista21);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista29.insere((java.lang.Object) 0.0d);
        boolean boolean35 = lista29.vazia();
        lista29.imprime();
        boolean boolean37 = lista29.vazia();
        lista14.insere((java.lang.Object) boolean37);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) "");
        lista39.imprime();
        lista39.insere((java.lang.Object) 100L);
        boolean boolean45 = lista39.vazia();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        ds.Lista lista49 = new ds.Lista();
        lista46.insere((java.lang.Object) lista49);
        boolean boolean51 = lista49.vazia();
        lista39.insere((java.lang.Object) boolean51);
        lista39.imprime();
        lista14.insere((java.lang.Object) lista39);
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        boolean boolean57 = lista55.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        ds.Lista lista63 = new ds.Lista();
        lista63.imprime();
        lista63.insere((java.lang.Object) '4');
        lista61.insere((java.lang.Object) '4');
        lista55.insere((java.lang.Object) '4');
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) "");
        lista69.imprime();
        lista69.imprime();
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) 0.0d);
        ds.Lista lista77 = new ds.Lista();
        lista74.insere((java.lang.Object) lista77);
        lista77.imprime();
        lista77.imprime();
        lista77.insere((java.lang.Object) 10);
        lista69.insere((java.lang.Object) lista77);
        lista55.insere((java.lang.Object) lista77);
        java.lang.Class<?> wildcardClass85 = lista55.getClass();
        lista14.insere((java.lang.Object) wildcardClass85);
        lista0.insere((java.lang.Object) wildcardClass85);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean15 = lista0.vazia();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        boolean boolean48 = lista46.vazia();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        lista54.insere((java.lang.Object) '4');
        lista52.insere((java.lang.Object) '4');
        lista46.insere((java.lang.Object) '4');
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) "");
        lista60.imprime();
        lista60.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) 0.0d);
        ds.Lista lista68 = new ds.Lista();
        lista65.insere((java.lang.Object) lista68);
        lista68.imprime();
        lista68.imprime();
        lista68.insere((java.lang.Object) 10);
        lista60.insere((java.lang.Object) lista68);
        lista46.insere((java.lang.Object) lista68);
        lista46.imprime();
        lista6.insere((java.lang.Object) lista46);
        boolean boolean78 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean15 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        boolean boolean13 = lista3.vazia();
        lista3.imprime();
        boolean boolean15 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Class<?> wildcardClass6 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean46 = lista6.vazia();
        java.lang.Class<?> wildcardClass47 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        lista13.insere((java.lang.Object) lista31);
        lista13.insere((java.lang.Object) (byte) 10);
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass38 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        lista15.insere((java.lang.Object) (-1.0d));
        boolean boolean19 = lista15.vazia();
        lista15.insere((java.lang.Object) 100);
        lista8.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass23 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        boolean boolean8 = lista3.vazia();
        lista3.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass11 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        lista13.insere((java.lang.Object) lista31);
        lista13.insere((java.lang.Object) (byte) 10);
        lista0.insere((java.lang.Object) lista13);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass17 = lista15.getClass();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        boolean boolean28 = lista22.vazia();
        lista15.insere((java.lang.Object) lista22);
        lista22.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        lista34.insere((java.lang.Object) lista42);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.imprime();
        java.lang.Object obj55 = null;
        lista52.insere(obj55);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        lista60.insere((java.lang.Object) (-1.0d));
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista60.imprime();
        lista52.insere((java.lang.Object) lista60);
        java.lang.Class<?> wildcardClass68 = lista60.getClass();
        lista34.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista34);
        lista0.imprime();
        boolean boolean73 = lista0.vazia();
        boolean boolean74 = lista0.vazia();
        java.lang.Class<?> wildcardClass75 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 0);
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        boolean boolean10 = lista3.vazia();
        java.lang.Class<?> wildcardClass11 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.imprime();
        java.lang.Object obj16 = null;
        lista13.insere(obj16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista21.imprime();
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        lista0.imprime();
        java.lang.Class<?> wildcardClass31 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass33 = lista31.getClass();
        lista24.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass35 = lista31.getClass();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean37 = lista31.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        lista15.insere((java.lang.Object) 0.0d);
        lista15.imprime();
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista3.insere((java.lang.Object) lista15);
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        lista0.imprime();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        boolean boolean8 = lista3.vazia();
        lista3.insere((java.lang.Object) "");
        boolean boolean11 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        ds.Lista lista8 = new ds.Lista();
        lista5.insere((java.lang.Object) lista8);
        lista8.insere((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass12 = lista8.getClass();
        lista0.insere((java.lang.Object) lista8);
        boolean boolean14 = lista8.vazia();
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) 0L);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        lista31.imprime();
        lista31.insere((java.lang.Object) 100L);
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        boolean boolean43 = lista41.vazia();
        lista31.insere((java.lang.Object) boolean43);
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        boolean boolean49 = lista47.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        lista55.insere((java.lang.Object) '4');
        lista53.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) "");
        lista61.imprime();
        lista61.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista69.imprime();
        lista69.insere((java.lang.Object) 10);
        lista61.insere((java.lang.Object) lista69);
        lista47.insere((java.lang.Object) lista69);
        java.lang.Class<?> wildcardClass77 = lista47.getClass();
        lista6.insere((java.lang.Object) wildcardClass77);
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass80 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass30 = lista22.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean19 = lista3.vazia();
        java.lang.Class<?> wildcardClass20 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        lista3.insere((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        boolean boolean28 = lista25.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        boolean boolean34 = lista32.vazia();
        boolean boolean35 = lista32.vazia();
        lista25.insere((java.lang.Object) boolean35);
        lista0.insere((java.lang.Object) lista25);
        boolean boolean38 = lista25.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.insere((java.lang.Object) (short) 100);
        boolean boolean12 = lista7.vazia();
        lista3.insere((java.lang.Object) lista7);
        boolean boolean14 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean18 = lista11.vazia();
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean46 = lista0.vazia();
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        lista7.insere((java.lang.Object) (-1.0d));
        lista7.imprime();
        lista7.insere((java.lang.Object) (byte) -1);
        boolean boolean14 = lista7.vazia();
        boolean boolean15 = lista7.vazia();
        boolean boolean16 = lista7.vazia();
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        lista6.imprime();
        lista6.insere((java.lang.Object) "");
        boolean boolean12 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) "");
        lista14.imprime();
        lista14.insere((java.lang.Object) 100L);
        boolean boolean20 = lista14.vazia();
        boolean boolean21 = lista14.vazia();
        lista14.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        lista23.insere((java.lang.Object) 10.0d);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        lista30.imprime();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista23.insere((java.lang.Object) lista30);
        java.lang.Class<?> wildcardClass38 = lista23.getClass();
        lista14.insere((java.lang.Object) wildcardClass38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        boolean boolean45 = lista43.vazia();
        boolean boolean46 = lista43.vazia();
        lista43.imprime();
        lista14.insere((java.lang.Object) lista43);
        java.lang.Class<?> wildcardClass49 = lista14.getClass();
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) "");
        lista51.imprime();
        lista51.insere((java.lang.Object) (byte) 1);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        boolean boolean62 = lista60.vazia();
        boolean boolean63 = lista60.vazia();
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista51.insere((java.lang.Object) boolean65);
        lista14.insere((java.lang.Object) boolean65);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        boolean boolean28 = lista11.vazia();
        java.lang.Class<?> wildcardClass29 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        boolean boolean25 = lista17.vazia();
        lista17.imprime();
        java.lang.Class<?> wildcardClass27 = lista17.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        java.lang.Class<?> wildcardClass27 = lista5.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        ds.Lista lista8 = new ds.Lista();
        lista5.insere((java.lang.Object) lista8);
        lista8.insere((java.lang.Object) (-1.0d));
        lista8.imprime();
        boolean boolean13 = lista8.vazia();
        lista8.imprime();
        java.lang.Class<?> wildcardClass15 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.insere((java.lang.Object) (-1.0d));
        boolean boolean24 = lista20.vazia();
        lista20.insere((java.lang.Object) 100);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass30 = lista27.getClass();
        lista20.insere((java.lang.Object) wildcardClass30);
        lista0.insere((java.lang.Object) wildcardClass30);
        lista0.insere((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean30 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        boolean boolean14 = lista3.vazia();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista18.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj22 = new java.lang.Object();
        lista18.insere(obj22);
        java.lang.Class<?> wildcardClass24 = obj22.getClass();
        lista3.insere((java.lang.Object) wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        java.lang.Class<?> wildcardClass21 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass22 = lista17.getClass();
        lista9.insere((java.lang.Object) lista17);
        boolean boolean24 = lista17.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        lista5.imprime();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        java.lang.Class<?> wildcardClass12 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass12);
        lista0.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        boolean boolean17 = lista15.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        lista23.insere((java.lang.Object) '4');
        lista21.insere((java.lang.Object) '4');
        lista15.insere((java.lang.Object) '4');
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista29.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista37.imprime();
        lista37.insere((java.lang.Object) 10);
        lista29.insere((java.lang.Object) lista37);
        lista15.insere((java.lang.Object) lista37);
        java.lang.Class<?> wildcardClass45 = lista15.getClass();
        lista0.insere((java.lang.Object) lista15);
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean26 = lista5.vazia();
        boolean boolean27 = lista5.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        boolean boolean21 = lista8.vazia();
        lista8.imprime();
        java.lang.Class<?> wildcardClass23 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.insere((java.lang.Object) (-1.0d));
        lista9.imprime();
        boolean boolean14 = lista9.vazia();
        boolean boolean15 = lista9.vazia();
        java.lang.Class<?> wildcardClass16 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass18 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        lista3.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        boolean boolean22 = lista20.vazia();
        lista20.imprime();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista20.insere((java.lang.Object) lista28);
        lista3.insere((java.lang.Object) lista20);
        lista3.imprime();
        java.lang.Class<?> wildcardClass37 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        lista0.imprime();
        boolean boolean27 = lista0.vazia();
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        boolean boolean29 = lista22.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass36 = lista30.getClass();
        lista22.insere((java.lang.Object) wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        lista21.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.insere((java.lang.Object) (short) 100);
        boolean boolean31 = lista26.vazia();
        boolean boolean32 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        lista0.imprime();
        java.lang.Class<?> wildcardClass37 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.insere((java.lang.Object) (-1.0d));
        lista16.imprime();
        lista16.insere((java.lang.Object) (byte) -1);
        lista16.imprime();
        lista5.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista5);
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        lista3.imprime();
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        lista3.imprime();
        java.lang.Class<?> wildcardClass11 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        lista8.insere((java.lang.Object) (short) 100);
        boolean boolean13 = lista8.vazia();
        boolean boolean14 = lista8.vazia();
        lista3.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass16 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass22 = lista13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        boolean boolean20 = lista18.vazia();
        lista0.insere((java.lang.Object) lista18);
        java.lang.Class<?> wildcardClass22 = lista18.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        java.lang.Class<?> wildcardClass30 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 0.0d);
        ds.Lista lista6 = new ds.Lista();
        lista3.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.insere((java.lang.Object) '4');
        lista6.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass19 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        boolean boolean20 = lista18.vazia();
        lista0.insere((java.lang.Object) lista18);
        boolean boolean22 = lista18.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean41 = lista0.vazia();
        java.lang.Class<?> wildcardClass42 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.imprime();
        java.lang.Object obj23 = null;
        lista20.insere(obj23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        java.lang.Object obj42 = null;
        lista39.insere(obj42);
        lista28.insere(obj42);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        lista45.imprime();
        lista45.insere((java.lang.Object) "");
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.imprime();
        lista45.insere((java.lang.Object) lista54);
        lista28.insere((java.lang.Object) lista54);
        lista10.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass60 = lista28.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        boolean boolean10 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista45.insere((java.lang.Object) (-1.0d));
        lista45.imprime();
        boolean boolean50 = lista45.vazia();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        boolean boolean55 = lista45.vazia();
        lista11.insere((java.lang.Object) boolean55);
        // The following exception was thrown during execution in test generation
        try {
            lista11.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1L);
        boolean boolean3 = lista0.vazia();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) (short) 100);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.insere((java.lang.Object) (-1.0d));
        lista27.imprime();
        boolean boolean32 = lista27.vazia();
        lista27.imprime();
        java.lang.Class<?> wildcardClass34 = lista27.getClass();
        lista19.insere((java.lang.Object) wildcardClass34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        boolean boolean43 = lista39.vazia();
        lista39.insere((java.lang.Object) 100);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass49 = lista46.getClass();
        lista39.insere((java.lang.Object) wildcardClass49);
        lista19.insere((java.lang.Object) wildcardClass49);
        lista0.insere((java.lang.Object) lista19);
        boolean boolean53 = lista19.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean46 = lista6.vazia();
        lista6.imprime();
        java.lang.Class<?> wildcardClass48 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        lista21.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.insere((java.lang.Object) (short) 100);
        boolean boolean31 = lista26.vazia();
        boolean boolean32 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        lista0.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) 0.0d);
        ds.Lista lista40 = new ds.Lista();
        lista37.insere((java.lang.Object) lista40);
        lista37.insere((java.lang.Object) 10.0d);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista47.insere((java.lang.Object) (-1.0d));
        lista47.imprime();
        boolean boolean52 = lista47.vazia();
        lista37.insere((java.lang.Object) boolean52);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista54.insere((java.lang.Object) 100L);
        lista54.imprime();
        lista37.insere((java.lang.Object) lista54);
        boolean boolean62 = lista54.vazia();
        lista0.insere((java.lang.Object) boolean62);
        java.lang.Class<?> wildcardClass64 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        lista22.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass11 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        boolean boolean20 = lista13.vazia();
        java.lang.Class<?> wildcardClass21 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        lista9.imprime();
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass21 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 100L);
        boolean boolean36 = lista30.vazia();
        boolean boolean37 = lista30.vazia();
        lista0.insere((java.lang.Object) boolean37);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        boolean boolean46 = lista42.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista50.insere((java.lang.Object) (-1.0d));
        lista50.imprime();
        lista50.insere((java.lang.Object) (byte) -1);
        boolean boolean57 = lista50.vazia();
        boolean boolean58 = lista50.vazia();
        java.lang.Class<?> wildcardClass59 = lista50.getClass();
        lista42.insere((java.lang.Object) wildcardClass59);
        lista0.insere((java.lang.Object) wildcardClass59);
        boolean boolean62 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        boolean boolean29 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista9.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        lista27.imprime();
        lista9.insere((java.lang.Object) lista27);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.imprime();
        lista35.imprime();
        lista27.insere((java.lang.Object) lista35);
        lista0.insere((java.lang.Object) lista35);
        java.lang.Class<?> wildcardClass41 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        lista11.insere((java.lang.Object) 100);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = lista18.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        lista23.insere((java.lang.Object) 0.0d);
        lista23.imprime();
        java.lang.Class<?> wildcardClass29 = lista23.getClass();
        lista11.insere((java.lang.Object) lista23);
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass32 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) -1);
        lista28.imprime();
        boolean boolean36 = lista28.vazia();
        boolean boolean37 = lista28.vazia();
        lista0.insere((java.lang.Object) lista28);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        lista39.insere((java.lang.Object) (short) 100);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista47.insere((java.lang.Object) (-1.0d));
        lista47.imprime();
        boolean boolean52 = lista47.vazia();
        lista47.imprime();
        java.lang.Class<?> wildcardClass54 = lista47.getClass();
        lista39.insere((java.lang.Object) wildcardClass54);
        lista28.insere((java.lang.Object) wildcardClass54);
        boolean boolean57 = lista28.vazia();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) "");
        lista6.imprime();
        lista6.insere((java.lang.Object) 100L);
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) (-1.0d));
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) -1);
        boolean boolean24 = lista17.vazia();
        lista6.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista6.vazia();
        boolean boolean27 = lista6.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        boolean boolean33 = lista31.vazia();
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        boolean boolean47 = lista45.vazia();
        lista45.imprime();
        lista39.insere((java.lang.Object) lista45);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        lista50.insere((java.lang.Object) 10.0d);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        lista57.imprime();
        lista57.insere((java.lang.Object) "");
        lista57.imprime();
        lista50.insere((java.lang.Object) lista57);
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) "");
        lista65.imprime();
        lista65.insere((java.lang.Object) 0.0d);
        boolean boolean71 = lista65.vazia();
        lista65.imprime();
        boolean boolean73 = lista65.vazia();
        lista50.insere((java.lang.Object) boolean73);
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) "");
        lista75.imprime();
        lista75.insere((java.lang.Object) 100L);
        boolean boolean81 = lista75.vazia();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) 0.0d);
        ds.Lista lista85 = new ds.Lista();
        lista82.insere((java.lang.Object) lista85);
        boolean boolean87 = lista85.vazia();
        lista75.insere((java.lang.Object) boolean87);
        lista75.imprime();
        lista50.insere((java.lang.Object) lista75);
        lista75.imprime();
        lista39.insere((java.lang.Object) lista75);
        lista31.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass95 = lista39.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista17.imprime();
        lista17.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.insere((java.lang.Object) (-1.0d));
        lista9.imprime();
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista16.insere((java.lang.Object) 100L);
        lista16.imprime();
        lista16.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass33 = lista31.getClass();
        lista24.insere((java.lang.Object) lista31);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista38.imprime();
        lista38.imprime();
        lista38.insere((java.lang.Object) 10);
        boolean boolean44 = lista38.vazia();
        lista31.insere((java.lang.Object) lista38);
        lista38.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista50.imprime();
        lista50.imprime();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        lista58.insere((java.lang.Object) (-1.0d));
        lista58.imprime();
        boolean boolean63 = lista58.vazia();
        lista50.insere((java.lang.Object) lista58);
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) 0.0d);
        ds.Lista lista68 = new ds.Lista();
        lista65.insere((java.lang.Object) lista68);
        lista68.imprime();
        java.lang.Object obj71 = null;
        lista68.insere(obj71);
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) 0.0d);
        ds.Lista lista76 = new ds.Lista();
        lista73.insere((java.lang.Object) lista76);
        lista76.insere((java.lang.Object) (-1.0d));
        lista76.imprime();
        boolean boolean81 = lista76.vazia();
        lista76.imprime();
        lista68.insere((java.lang.Object) lista76);
        java.lang.Class<?> wildcardClass84 = lista76.getClass();
        lista50.insere((java.lang.Object) lista76);
        lista38.insere((java.lang.Object) lista50);
        lista16.insere((java.lang.Object) lista50);
        lista16.imprime();
        boolean boolean89 = lista16.vazia();
        lista16.imprime();
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        java.lang.Class<?> wildcardClass28 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista26.insere((java.lang.Object) lista34);
        lista26.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista42.insere((java.lang.Object) 10.0d);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        lista49.imprime();
        lista49.insere((java.lang.Object) "");
        lista49.imprime();
        lista42.insere((java.lang.Object) lista49);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) "");
        lista57.imprime();
        lista57.insere((java.lang.Object) 0.0d);
        boolean boolean63 = lista57.vazia();
        lista57.imprime();
        boolean boolean65 = lista57.vazia();
        lista42.insere((java.lang.Object) boolean65);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) "");
        lista67.imprime();
        lista67.insere((java.lang.Object) 100L);
        boolean boolean73 = lista67.vazia();
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) 0.0d);
        ds.Lista lista77 = new ds.Lista();
        lista74.insere((java.lang.Object) lista77);
        boolean boolean79 = lista77.vazia();
        lista67.insere((java.lang.Object) boolean79);
        lista67.imprime();
        lista42.insere((java.lang.Object) lista67);
        lista67.imprime();
        lista26.insere((java.lang.Object) lista67);
        lista0.insere((java.lang.Object) lista67);
        java.lang.Class<?> wildcardClass86 = lista67.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.insere((java.lang.Object) (short) 1);
        lista8.insere((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass14 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        lista8.insere((java.lang.Object) (short) 100);
        boolean boolean13 = lista8.vazia();
        boolean boolean14 = lista8.vazia();
        lista3.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass16 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        java.lang.Class<?> wildcardClass13 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.insere((java.lang.Object) '4');
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) 0.0d);
        lista37.insere((java.lang.Object) 0.0d);
        boolean boolean42 = lista37.vazia();
        lista37.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) "");
        lista44.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass53 = lista51.getClass();
        lista44.insere((java.lang.Object) lista51);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        boolean boolean60 = lista58.vazia();
        lista58.insere((java.lang.Object) 10);
        ds.Lista lista63 = new ds.Lista();
        lista63.imprime();
        lista63.imprime();
        lista58.insere((java.lang.Object) lista63);
        lista44.insere((java.lang.Object) lista58);
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 0.0d);
        boolean boolean71 = lista68.vazia();
        lista68.imprime();
        ds.Lista lista73 = new ds.Lista();
        lista73.imprime();
        lista73.insere((java.lang.Object) '4');
        lista73.imprime();
        lista68.insere((java.lang.Object) lista73);
        lista44.insere((java.lang.Object) lista73);
        lista73.imprime();
        lista73.imprime();
        lista37.insere((java.lang.Object) lista73);
        lista29.insere((java.lang.Object) lista37);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista5.insere((java.lang.Object) 100L);
        boolean boolean11 = lista5.vazia();
        lista5.imprime();
        lista5.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.insere((java.lang.Object) (short) 100);
        boolean boolean19 = lista14.vazia();
        lista14.imprime();
        lista5.insere((java.lang.Object) lista14);
        java.lang.Class<?> wildcardClass22 = lista5.getClass();
        lista0.insere((java.lang.Object) lista5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        lista37.imprime();
        boolean boolean43 = lista37.vazia();
        boolean boolean44 = lista37.vazia();
        java.lang.Class<?> wildcardClass45 = lista37.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        // The following exception was thrown during execution in test generation
        try {
            lista3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        lista8.imprime();
        lista8.insere((java.lang.Object) "");
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.imprime();
        lista8.insere((java.lang.Object) lista17);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        lista21.imprime();
        lista21.insere((java.lang.Object) "");
        lista21.insere((java.lang.Object) (short) -1);
        lista8.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        boolean boolean24 = lista0.vazia();
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        java.lang.Object obj34 = null;
        lista31.insere(obj34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        lista39.imprime();
        boolean boolean44 = lista39.vazia();
        lista39.imprime();
        lista31.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass47 = lista39.getClass();
        lista13.insere((java.lang.Object) lista39);
        lista3.insere((java.lang.Object) lista13);
        boolean boolean50 = lista3.vazia();
        boolean boolean51 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        lista5.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        lista5.insere((java.lang.Object) lista10);
        boolean boolean31 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista35.insere((java.lang.Object) 10.0d);
        lista35.imprime();
        lista35.imprime();
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        java.lang.Class<?> wildcardClass46 = lista35.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        boolean boolean24 = lista12.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        java.lang.Class<?> wildcardClass25 = lista21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        lista12.insere((java.lang.Object) (byte) -1);
        boolean boolean19 = lista12.vazia();
        boolean boolean20 = lista12.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        lista24.insere((java.lang.Object) (-1.0d));
        boolean boolean28 = lista24.vazia();
        lista24.insere((java.lang.Object) 100);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass34);
        lista12.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista12);
        lista0.imprime();
        java.lang.Class<?> wildcardClass39 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass29 = lista27.getClass();
        lista20.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        lista20.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista20);
        lista20.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista54.insere((java.lang.Object) 100L);
        boolean boolean60 = lista54.vazia();
        lista54.imprime();
        lista54.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) 0.0d);
        lista63.insere((java.lang.Object) (short) 100);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        lista54.insere((java.lang.Object) lista63);
        lista46.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        java.lang.Class<?> wildcardClass73 = lista54.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        lista6.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        lista0.imprime();
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.imprime();
        java.lang.Object obj23 = null;
        lista20.insere(obj23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        java.lang.Object obj42 = null;
        lista39.insere(obj42);
        lista28.insere(obj42);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        lista45.imprime();
        lista45.insere((java.lang.Object) "");
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.imprime();
        lista45.insere((java.lang.Object) lista54);
        lista28.insere((java.lang.Object) lista54);
        lista10.insere((java.lang.Object) lista28);
        boolean boolean60 = lista28.vazia();
        boolean boolean61 = lista28.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = new java.lang.Object();
        lista13.insere(obj17);
        lista13.imprime();
        boolean boolean20 = lista13.vazia();
        java.lang.Class<?> wildcardClass21 = lista13.getClass();
        lista3.insere((java.lang.Object) wildcardClass21);
        boolean boolean23 = lista3.vazia();
        boolean boolean24 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        boolean boolean15 = lista3.vazia();
        java.lang.Class<?> wildcardClass16 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        lista8.insere((java.lang.Object) 100L);
        boolean boolean14 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) (short) 100);
        boolean boolean22 = lista17.vazia();
        lista17.imprime();
        lista8.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.insere((java.lang.Object) (short) 1);
        boolean boolean16 = lista12.vazia();
        lista3.insere((java.lang.Object) boolean16);
        lista3.imprime();
        boolean boolean19 = lista3.vazia();
        java.lang.Class<?> wildcardClass20 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        boolean boolean48 = lista46.vazia();
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        lista54.insere((java.lang.Object) '4');
        lista52.insere((java.lang.Object) '4');
        lista46.insere((java.lang.Object) '4');
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) "");
        lista60.imprime();
        lista60.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) 0.0d);
        ds.Lista lista68 = new ds.Lista();
        lista65.insere((java.lang.Object) lista68);
        lista68.imprime();
        lista68.imprime();
        lista68.insere((java.lang.Object) 10);
        lista60.insere((java.lang.Object) lista68);
        lista46.insere((java.lang.Object) lista68);
        lista46.imprime();
        lista6.insere((java.lang.Object) lista46);
        ds.Lista lista78 = new ds.Lista();
        lista78.imprime();
        boolean boolean80 = lista78.vazia();
        boolean boolean81 = lista78.vazia();
        java.lang.Class<?> wildcardClass82 = lista78.getClass();
        lista46.insere((java.lang.Object) wildcardClass82);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean41 = lista25.vazia();
        boolean boolean42 = lista25.vazia();
        java.lang.Class<?> wildcardClass43 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        lista37.imprime();
        java.lang.Class<?> wildcardClass43 = lista37.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        lista5.imprime();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        java.lang.Class<?> wildcardClass12 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        lista0.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean30 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.insere((java.lang.Object) (-1.0d));
        lista35.imprime();
        lista35.insere((java.lang.Object) (byte) -1);
        boolean boolean42 = lista35.vazia();
        lista24.insere((java.lang.Object) boolean42);
        boolean boolean44 = lista24.vazia();
        boolean boolean45 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) "");
        lista47.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        java.lang.Class<?> wildcardClass56 = lista54.getClass();
        lista47.insere((java.lang.Object) lista54);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        lista61.imprime();
        lista61.imprime();
        lista61.insere((java.lang.Object) 10);
        boolean boolean67 = lista61.vazia();
        lista54.insere((java.lang.Object) lista61);
        lista24.insere((java.lang.Object) lista61);
        lista0.insere((java.lang.Object) lista24);
        lista0.imprime();
        java.lang.Class<?> wildcardClass72 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        lista29.insere((java.lang.Object) 10.0d);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        lista36.imprime();
        lista36.insere((java.lang.Object) "");
        lista36.imprime();
        lista29.insere((java.lang.Object) lista36);
        lista8.insere((java.lang.Object) lista36);
        lista8.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.insere((java.lang.Object) (short) 100);
        boolean boolean12 = lista7.vazia();
        lista3.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        lista3.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        boolean boolean22 = lista20.vazia();
        lista20.imprime();
        lista20.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista20.insere((java.lang.Object) lista28);
        lista3.insere((java.lang.Object) lista20);
        lista3.imprime();
        boolean boolean37 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 10);
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        boolean boolean35 = lista33.vazia();
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        lista26.insere((java.lang.Object) lista33);
        lista19.insere((java.lang.Object) lista33);
        lista3.insere((java.lang.Object) lista33);
        boolean boolean41 = lista33.vazia();
        java.lang.Class<?> wildcardClass42 = lista33.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass20 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean15 = lista0.vazia();
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        boolean boolean28 = lista11.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista11.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 10);
        boolean boolean20 = lista14.vazia();
        lista7.insere((java.lang.Object) lista14);
        lista14.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        boolean boolean29 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        lista31.insere((java.lang.Object) (short) 100);
        boolean boolean36 = lista31.vazia();
        boolean boolean37 = lista31.vazia();
        lista26.insere((java.lang.Object) lista31);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        lista39.insere((java.lang.Object) (short) 100);
        boolean boolean44 = lista39.vazia();
        boolean boolean45 = lista39.vazia();
        java.lang.Class<?> wildcardClass46 = lista39.getClass();
        lista26.insere((java.lang.Object) wildcardClass46);
        lista14.insere((java.lang.Object) wildcardClass46);
        boolean boolean49 = lista14.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass29 = lista27.getClass();
        lista20.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.imprime();
        lista34.imprime();
        lista34.insere((java.lang.Object) 10);
        boolean boolean40 = lista34.vazia();
        lista27.insere((java.lang.Object) lista34);
        lista34.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        boolean boolean48 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.insere((java.lang.Object) (-1.0d));
        lista54.imprime();
        boolean boolean59 = lista54.vazia();
        lista46.insere((java.lang.Object) lista54);
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) 0.0d);
        ds.Lista lista64 = new ds.Lista();
        lista61.insere((java.lang.Object) lista64);
        lista64.imprime();
        java.lang.Object obj67 = null;
        lista64.insere(obj67);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.insere((java.lang.Object) (-1.0d));
        lista72.imprime();
        boolean boolean77 = lista72.vazia();
        lista72.imprime();
        lista64.insere((java.lang.Object) lista72);
        java.lang.Class<?> wildcardClass80 = lista72.getClass();
        lista46.insere((java.lang.Object) lista72);
        lista34.insere((java.lang.Object) lista46);
        lista11.insere((java.lang.Object) lista34);
        boolean boolean84 = lista34.vazia();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        java.lang.Object obj14 = null;
        lista3.insere(obj14);
        boolean boolean16 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        boolean boolean13 = lista3.vazia();
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        lista11.insere((java.lang.Object) 100);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = lista18.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        lista23.insere((java.lang.Object) 0.0d);
        lista23.imprime();
        java.lang.Class<?> wildcardClass29 = lista23.getClass();
        lista11.insere((java.lang.Object) lista23);
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) "");
        lista33.imprime();
        lista33.insere((java.lang.Object) 100L);
        boolean boolean39 = lista33.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        boolean boolean45 = lista43.vazia();
        lista33.insere((java.lang.Object) boolean45);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista50.imprime();
        lista50.imprime();
        lista33.insere((java.lang.Object) lista50);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 0.0d);
        ds.Lista lista59 = new ds.Lista();
        lista56.insere((java.lang.Object) lista59);
        lista59.imprime();
        lista59.imprime();
        lista59.insere((java.lang.Object) 10);
        lista59.imprime();
        lista33.insere((java.lang.Object) lista59);
        lista33.imprime();
        lista3.insere((java.lang.Object) lista33);
        lista3.imprime();
        boolean boolean70 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 0.0d);
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) -1);
        boolean boolean26 = lista19.vazia();
        boolean boolean27 = lista19.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        boolean boolean35 = lista31.vazia();
        lista31.insere((java.lang.Object) 100);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass41 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass41);
        lista19.insere((java.lang.Object) lista31);
        lista7.insere((java.lang.Object) lista19);
        lista3.insere((java.lang.Object) lista7);
        lista7.imprime();
        java.lang.Class<?> wildcardClass47 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista17.imprime();
        java.lang.Object obj24 = null;
        lista17.insere(obj24);
        java.lang.Class<?> wildcardClass26 = lista17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        lista11.insere((java.lang.Object) 100);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = lista18.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        lista23.insere((java.lang.Object) 0.0d);
        lista23.imprime();
        java.lang.Class<?> wildcardClass29 = lista23.getClass();
        lista11.insere((java.lang.Object) lista23);
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) "");
        lista33.imprime();
        lista33.insere((java.lang.Object) 100L);
        boolean boolean39 = lista33.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        boolean boolean45 = lista43.vazia();
        lista33.insere((java.lang.Object) boolean45);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista50.imprime();
        lista50.imprime();
        lista33.insere((java.lang.Object) lista50);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 0.0d);
        ds.Lista lista59 = new ds.Lista();
        lista56.insere((java.lang.Object) lista59);
        lista59.imprime();
        lista59.imprime();
        lista59.insere((java.lang.Object) 10);
        lista59.imprime();
        lista33.insere((java.lang.Object) lista59);
        lista33.imprime();
        lista3.insere((java.lang.Object) lista33);
        lista33.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        lista25.imprime();
        lista25.imprime();
        boolean boolean43 = lista25.vazia();
        java.lang.Class<?> wildcardClass44 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        lista12.insere((java.lang.Object) (byte) -1);
        boolean boolean19 = lista12.vazia();
        boolean boolean20 = lista12.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        lista24.insere((java.lang.Object) (-1.0d));
        boolean boolean28 = lista24.vazia();
        lista24.insere((java.lang.Object) 100);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = lista31.getClass();
        lista24.insere((java.lang.Object) wildcardClass34);
        lista12.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista12);
        java.lang.Class<?> wildcardClass38 = lista12.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        boolean boolean8 = lista3.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.imprime();
        lista9.insere((java.lang.Object) "");
        boolean boolean15 = lista9.vazia();
        boolean boolean16 = lista9.vazia();
        lista3.insere((java.lang.Object) lista9);
        lista9.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        lista9.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.insere((java.lang.Object) '4');
        lista19.insere((java.lang.Object) '4');
        lista19.insere((java.lang.Object) '#');
        lista19.imprime();
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        boolean boolean12 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.imprime();
        lista14.insere((java.lang.Object) "");
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista14.insere((java.lang.Object) lista23);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        lista27.imprime();
        lista27.insere((java.lang.Object) "");
        lista27.insere((java.lang.Object) (short) -1);
        lista14.insere((java.lang.Object) lista27);
        lista3.insere((java.lang.Object) lista27);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) "");
        lista37.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        java.lang.Class<?> wildcardClass46 = lista44.getClass();
        lista37.insere((java.lang.Object) lista44);
        ds.Lista lista48 = new ds.Lista();
        lista48.imprime();
        boolean boolean50 = lista48.vazia();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        ds.Lista lista56 = new ds.Lista();
        lista56.imprime();
        lista56.insere((java.lang.Object) '4');
        lista54.insere((java.lang.Object) '4');
        lista48.insere((java.lang.Object) '4');
        lista44.insere((java.lang.Object) lista48);
        lista3.insere((java.lang.Object) lista44);
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) 0.0d);
        ds.Lista lista67 = new ds.Lista();
        lista64.insere((java.lang.Object) lista67);
        lista67.insere((java.lang.Object) (-1.0d));
        boolean boolean71 = lista67.vazia();
        boolean boolean72 = lista67.vazia();
        lista3.insere((java.lang.Object) lista67);
        java.lang.Class<?> wildcardClass74 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        boolean boolean26 = lista24.vazia();
        lista24.insere((java.lang.Object) 10);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        boolean boolean33 = lista29.vazia();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) "");
        lista35.imprime();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean41 = lista35.vazia();
        boolean boolean42 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista44.insere((java.lang.Object) 10.0d);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        lista51.imprime();
        lista51.insere((java.lang.Object) "");
        lista51.imprime();
        lista44.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass59 = lista44.getClass();
        lista35.insere((java.lang.Object) wildcardClass59);
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.insere((java.lang.Object) (-1.0d));
        boolean boolean17 = lista13.vazia();
        boolean boolean18 = lista13.vazia();
        lista13.insere((java.lang.Object) "");
        boolean boolean21 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean21);
        boolean boolean23 = lista0.vazia();
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) 0L);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        lista31.imprime();
        lista31.insere((java.lang.Object) 100L);
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        boolean boolean43 = lista41.vazia();
        lista31.insere((java.lang.Object) boolean43);
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        boolean boolean49 = lista47.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        lista55.insere((java.lang.Object) '4');
        lista53.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) "");
        lista61.imprime();
        lista61.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista69.imprime();
        lista69.insere((java.lang.Object) 10);
        lista61.insere((java.lang.Object) lista69);
        lista47.insere((java.lang.Object) lista69);
        java.lang.Class<?> wildcardClass77 = lista47.getClass();
        lista6.insere((java.lang.Object) wildcardClass77);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean80 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 0.0d);
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) -1);
        boolean boolean26 = lista19.vazia();
        boolean boolean27 = lista19.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        boolean boolean35 = lista31.vazia();
        lista31.insere((java.lang.Object) 100);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass41 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass41);
        lista19.insere((java.lang.Object) lista31);
        lista7.insere((java.lang.Object) lista19);
        lista3.insere((java.lang.Object) lista7);
        lista7.imprime();
        boolean boolean47 = lista7.vazia();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        lista48.insere((java.lang.Object) 10.0d);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        lista55.imprime();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        lista48.insere((java.lang.Object) lista55);
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) "");
        lista63.imprime();
        lista63.insere((java.lang.Object) 0.0d);
        boolean boolean69 = lista63.vazia();
        lista63.imprime();
        boolean boolean71 = lista63.vazia();
        lista48.insere((java.lang.Object) boolean71);
        ds.Lista lista73 = new ds.Lista();
        lista73.insere((java.lang.Object) "");
        lista73.imprime();
        lista73.insere((java.lang.Object) 100L);
        boolean boolean79 = lista73.vazia();
        ds.Lista lista80 = new ds.Lista();
        lista80.insere((java.lang.Object) 0.0d);
        ds.Lista lista83 = new ds.Lista();
        lista80.insere((java.lang.Object) lista83);
        boolean boolean85 = lista83.vazia();
        lista73.insere((java.lang.Object) boolean85);
        lista73.imprime();
        lista48.insere((java.lang.Object) lista73);
        lista73.imprime();
        lista73.imprime();
        boolean boolean91 = lista73.vazia();
        lista7.insere((java.lang.Object) boolean91);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        lista3.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass22 = lista20.getClass();
        lista13.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista27.imprime();
        lista27.insere((java.lang.Object) 10);
        boolean boolean33 = lista27.vazia();
        lista20.insere((java.lang.Object) lista27);
        lista27.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        boolean boolean41 = lista39.vazia();
        lista39.imprime();
        lista39.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista47.insere((java.lang.Object) (-1.0d));
        lista47.imprime();
        boolean boolean52 = lista47.vazia();
        lista39.insere((java.lang.Object) lista47);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) 0.0d);
        ds.Lista lista57 = new ds.Lista();
        lista54.insere((java.lang.Object) lista57);
        lista57.imprime();
        java.lang.Object obj60 = null;
        lista57.insere(obj60);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) 0.0d);
        ds.Lista lista65 = new ds.Lista();
        lista62.insere((java.lang.Object) lista65);
        lista65.insere((java.lang.Object) (-1.0d));
        lista65.imprime();
        boolean boolean70 = lista65.vazia();
        lista65.imprime();
        lista57.insere((java.lang.Object) lista65);
        java.lang.Class<?> wildcardClass73 = lista65.getClass();
        lista39.insere((java.lang.Object) lista65);
        lista27.insere((java.lang.Object) lista39);
        boolean boolean76 = lista39.vazia();
        lista3.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass78 = lista39.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        boolean boolean18 = lista16.vazia();
        lista16.insere((java.lang.Object) 10);
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        lista16.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 0.0d);
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        lista21.insere((java.lang.Object) lista25);
        lista3.insere((java.lang.Object) lista21);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) "");
        lista35.imprime();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean41 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.insere((java.lang.Object) (-1.0d));
        lista46.imprime();
        lista46.insere((java.lang.Object) (byte) -1);
        boolean boolean53 = lista46.vazia();
        lista35.insere((java.lang.Object) boolean53);
        boolean boolean55 = lista35.vazia();
        boolean boolean56 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) "");
        lista58.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) 0.0d);
        ds.Lista lista65 = new ds.Lista();
        lista62.insere((java.lang.Object) lista65);
        java.lang.Class<?> wildcardClass67 = lista65.getClass();
        lista58.insere((java.lang.Object) lista65);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.imprime();
        lista72.imprime();
        lista72.insere((java.lang.Object) 10);
        boolean boolean78 = lista72.vazia();
        lista65.insere((java.lang.Object) lista72);
        lista35.insere((java.lang.Object) lista72);
        lista21.insere((java.lang.Object) lista72);
        boolean boolean82 = lista72.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista54.insere((java.lang.Object) 100L);
        boolean boolean60 = lista54.vazia();
        lista54.imprime();
        lista54.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) 0.0d);
        lista63.insere((java.lang.Object) (short) 100);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        lista54.insere((java.lang.Object) lista63);
        lista46.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista0.imprime();
        java.lang.Class<?> wildcardClass74 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.imprime();
        java.lang.Object obj23 = null;
        lista20.insere(obj23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        java.lang.Object obj42 = null;
        lista39.insere(obj42);
        lista28.insere(obj42);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        lista45.imprime();
        lista45.insere((java.lang.Object) "");
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.imprime();
        lista45.insere((java.lang.Object) lista54);
        lista28.insere((java.lang.Object) lista54);
        lista10.insere((java.lang.Object) lista28);
        boolean boolean60 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        boolean boolean19 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        boolean boolean17 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) "");
        lista19.imprime();
        lista19.insere((java.lang.Object) 100L);
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) "");
        lista27.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        java.lang.Class<?> wildcardClass36 = lista34.getClass();
        lista27.insere((java.lang.Object) lista34);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        lista41.imprime();
        lista41.imprime();
        lista41.insere((java.lang.Object) 10);
        boolean boolean47 = lista41.vazia();
        lista34.insere((java.lang.Object) lista41);
        lista41.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        boolean boolean55 = lista53.vazia();
        lista53.imprime();
        lista53.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        lista61.insere((java.lang.Object) (-1.0d));
        lista61.imprime();
        boolean boolean66 = lista61.vazia();
        lista53.insere((java.lang.Object) lista61);
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 0.0d);
        ds.Lista lista71 = new ds.Lista();
        lista68.insere((java.lang.Object) lista71);
        lista71.imprime();
        java.lang.Object obj74 = null;
        lista71.insere(obj74);
        ds.Lista lista76 = new ds.Lista();
        lista76.insere((java.lang.Object) 0.0d);
        ds.Lista lista79 = new ds.Lista();
        lista76.insere((java.lang.Object) lista79);
        lista79.insere((java.lang.Object) (-1.0d));
        lista79.imprime();
        boolean boolean84 = lista79.vazia();
        lista79.imprime();
        lista71.insere((java.lang.Object) lista79);
        java.lang.Class<?> wildcardClass87 = lista79.getClass();
        lista53.insere((java.lang.Object) lista79);
        lista41.insere((java.lang.Object) lista53);
        lista19.insere((java.lang.Object) lista53);
        lista19.imprime();
        boolean boolean92 = lista19.vazia();
        boolean boolean93 = lista19.vazia();
        lista10.insere((java.lang.Object) lista19);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean18 = lista11.vazia();
        boolean boolean19 = lista11.vazia();
        java.lang.Class<?> wildcardClass20 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        boolean boolean32 = lista28.vazia();
        lista28.imprime();
        boolean boolean34 = lista28.vazia();
        lista21.insere((java.lang.Object) lista28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) "");
        lista6.imprime();
        lista6.insere((java.lang.Object) 100L);
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) (-1.0d));
        lista17.imprime();
        lista17.insere((java.lang.Object) (byte) -1);
        boolean boolean24 = lista17.vazia();
        lista6.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista6.vazia();
        boolean boolean27 = lista6.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        boolean boolean33 = lista31.vazia();
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        boolean boolean47 = lista45.vazia();
        lista45.imprime();
        lista39.insere((java.lang.Object) lista45);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        lista50.insere((java.lang.Object) 10.0d);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        lista57.imprime();
        lista57.insere((java.lang.Object) "");
        lista57.imprime();
        lista50.insere((java.lang.Object) lista57);
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) "");
        lista65.imprime();
        lista65.insere((java.lang.Object) 0.0d);
        boolean boolean71 = lista65.vazia();
        lista65.imprime();
        boolean boolean73 = lista65.vazia();
        lista50.insere((java.lang.Object) boolean73);
        ds.Lista lista75 = new ds.Lista();
        lista75.insere((java.lang.Object) "");
        lista75.imprime();
        lista75.insere((java.lang.Object) 100L);
        boolean boolean81 = lista75.vazia();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) 0.0d);
        ds.Lista lista85 = new ds.Lista();
        lista82.insere((java.lang.Object) lista85);
        boolean boolean87 = lista85.vazia();
        lista75.insere((java.lang.Object) boolean87);
        lista75.imprime();
        lista50.insere((java.lang.Object) lista75);
        lista75.imprime();
        lista39.insere((java.lang.Object) lista75);
        lista31.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista39);
        boolean boolean95 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) "");
        lista26.imprime();
        lista26.insere((java.lang.Object) 100L);
        lista26.imprime();
        lista9.insere((java.lang.Object) lista26);
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista38.imprime();
        java.lang.Object obj41 = null;
        lista38.insere(obj41);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.insere((java.lang.Object) (-1.0d));
        lista46.imprime();
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista38.insere((java.lang.Object) lista46);
        lista0.insere((java.lang.Object) lista38);
        // The following exception was thrown during execution in test generation
        try {
            lista38.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) (-1.0d));
        lista17.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista25.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        lista33.insere((java.lang.Object) (-1.0d));
        lista33.imprime();
        boolean boolean38 = lista33.vazia();
        lista25.insere((java.lang.Object) lista33);
        java.lang.Class<?> wildcardClass40 = lista25.getClass();
        lista17.insere((java.lang.Object) lista25);
        lista3.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        lista21.imprime();
        lista21.insere((java.lang.Object) "");
        lista21.insere((java.lang.Object) (short) -1);
        lista21.imprime();
        lista8.insere((java.lang.Object) lista21);
        java.lang.Class<?> wildcardClass31 = lista21.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        java.lang.Class<?> wildcardClass29 = lista21.getClass();
        lista3.insere((java.lang.Object) lista21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass22 = lista20.getClass();
        lista13.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        boolean boolean29 = lista27.vazia();
        lista27.insere((java.lang.Object) 10);
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        lista27.insere((java.lang.Object) lista32);
        lista13.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.insere((java.lang.Object) (short) 1);
        boolean boolean42 = lista38.vazia();
        lista13.insere((java.lang.Object) boolean42);
        lista13.imprime();
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        java.lang.Object obj34 = null;
        lista31.insere(obj34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        lista39.imprime();
        boolean boolean44 = lista39.vazia();
        lista39.imprime();
        lista31.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass47 = lista39.getClass();
        lista13.insere((java.lang.Object) lista39);
        lista3.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass50 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.imprime();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 1L);
        boolean boolean6 = lista3.vazia();
        lista0.insere((java.lang.Object) boolean6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 10);
        boolean boolean20 = lista14.vazia();
        lista7.insere((java.lang.Object) lista14);
        lista14.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista26.insere((java.lang.Object) lista34);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        lista44.imprime();
        java.lang.Object obj47 = null;
        lista44.insere(obj47);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.insere((java.lang.Object) (-1.0d));
        lista52.imprime();
        boolean boolean57 = lista52.vazia();
        lista52.imprime();
        lista44.insere((java.lang.Object) lista52);
        java.lang.Class<?> wildcardClass60 = lista52.getClass();
        lista26.insere((java.lang.Object) lista52);
        lista14.insere((java.lang.Object) lista26);
        boolean boolean63 = lista26.vazia();
        java.lang.Class<?> wildcardClass64 = lista26.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        boolean boolean23 = lista17.vazia();
        lista17.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        lista28.insere((java.lang.Object) (byte) -1);
        boolean boolean35 = lista28.vazia();
        lista17.insere((java.lang.Object) boolean35);
        lista0.insere((java.lang.Object) lista17);
        lista17.imprime();
        java.lang.Class<?> wildcardClass39 = lista17.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista20.insere((java.lang.Object) 10.0d);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        ds.Lista lista30 = new ds.Lista();
        lista27.insere((java.lang.Object) lista30);
        lista30.insere((java.lang.Object) (-1.0d));
        lista30.imprime();
        boolean boolean35 = lista30.vazia();
        lista20.insere((java.lang.Object) boolean35);
        boolean boolean37 = lista20.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        lista38.imprime();
        lista20.insere((java.lang.Object) lista38);
        lista20.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) "");
        lista44.imprime();
        lista44.insere((java.lang.Object) 100L);
        boolean boolean50 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) 0.0d);
        ds.Lista lista55 = new ds.Lista();
        lista52.insere((java.lang.Object) lista55);
        lista55.insere((java.lang.Object) (-1.0d));
        lista55.imprime();
        lista55.insere((java.lang.Object) (byte) -1);
        boolean boolean62 = lista55.vazia();
        lista44.insere((java.lang.Object) boolean62);
        boolean boolean64 = lista44.vazia();
        boolean boolean65 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) "");
        lista67.imprime();
        ds.Lista lista71 = new ds.Lista();
        lista71.insere((java.lang.Object) 0.0d);
        ds.Lista lista74 = new ds.Lista();
        lista71.insere((java.lang.Object) lista74);
        java.lang.Class<?> wildcardClass76 = lista74.getClass();
        lista67.insere((java.lang.Object) lista74);
        ds.Lista lista78 = new ds.Lista();
        lista78.insere((java.lang.Object) 0.0d);
        ds.Lista lista81 = new ds.Lista();
        lista78.insere((java.lang.Object) lista81);
        lista81.imprime();
        lista81.imprime();
        lista81.insere((java.lang.Object) 10);
        boolean boolean87 = lista81.vazia();
        lista74.insere((java.lang.Object) lista81);
        lista44.insere((java.lang.Object) lista81);
        lista20.insere((java.lang.Object) lista44);
        lista3.insere((java.lang.Object) lista20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista54.insere((java.lang.Object) 100L);
        boolean boolean60 = lista54.vazia();
        lista54.imprime();
        lista54.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) 0.0d);
        lista63.insere((java.lang.Object) (short) 100);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        lista54.insere((java.lang.Object) lista63);
        lista46.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass75 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        boolean boolean27 = lista3.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) "");
        lista28.imprime();
        lista28.insere((java.lang.Object) 100L);
        boolean boolean34 = lista28.vazia();
        lista28.imprime();
        lista28.imprime();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) 0.0d);
        lista37.insere((java.lang.Object) (short) 100);
        boolean boolean42 = lista37.vazia();
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        lista45.insere((java.lang.Object) 0.0d);
        boolean boolean50 = lista45.vazia();
        java.lang.Class<?> wildcardClass51 = lista45.getClass();
        lista37.insere((java.lang.Object) wildcardClass51);
        lista3.insere((java.lang.Object) wildcardClass51);
        java.lang.Class<?> wildcardClass54 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        lista13.imprime();
        lista13.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        lista8.insere((java.lang.Object) 100L);
        boolean boolean14 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) (short) 100);
        boolean boolean22 = lista17.vazia();
        lista17.imprime();
        lista8.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista8);
        boolean boolean26 = lista0.vazia();
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 0.0d);
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) -1);
        boolean boolean26 = lista19.vazia();
        boolean boolean27 = lista19.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        boolean boolean35 = lista31.vazia();
        lista31.insere((java.lang.Object) 100);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass41 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass41);
        lista19.insere((java.lang.Object) lista31);
        lista7.insere((java.lang.Object) lista19);
        lista3.insere((java.lang.Object) lista7);
        lista7.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) "");
        lista47.imprime();
        lista47.insere((java.lang.Object) 0.0d);
        boolean boolean53 = lista47.vazia();
        lista47.insere((java.lang.Object) 0.0d);
        boolean boolean56 = lista47.vazia();
        java.lang.Class<?> wildcardClass57 = lista47.getClass();
        lista7.insere((java.lang.Object) lista47);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass29 = lista27.getClass();
        lista20.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        lista20.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass45 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        boolean boolean14 = lista3.vazia();
        boolean boolean15 = lista3.vazia();
        java.lang.Class<?> wildcardClass16 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.imprime();
        java.lang.Class<?> wildcardClass20 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        boolean boolean21 = lista12.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        lista22.insere((java.lang.Object) 10.0d);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        lista29.imprime();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista22.insere((java.lang.Object) lista29);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) "");
        lista37.imprime();
        lista37.insere((java.lang.Object) 0.0d);
        boolean boolean43 = lista37.vazia();
        lista37.imprime();
        boolean boolean45 = lista37.vazia();
        lista22.insere((java.lang.Object) boolean45);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) "");
        lista47.imprime();
        lista47.insere((java.lang.Object) 100L);
        boolean boolean53 = lista47.vazia();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) 0.0d);
        ds.Lista lista57 = new ds.Lista();
        lista54.insere((java.lang.Object) lista57);
        boolean boolean59 = lista57.vazia();
        lista47.insere((java.lang.Object) boolean59);
        lista47.imprime();
        lista22.insere((java.lang.Object) lista47);
        ds.Lista lista63 = new ds.Lista();
        lista63.imprime();
        boolean boolean65 = lista63.vazia();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        ds.Lista lista71 = new ds.Lista();
        lista71.imprime();
        lista71.insere((java.lang.Object) '4');
        lista69.insere((java.lang.Object) '4');
        lista63.insere((java.lang.Object) '4');
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) "");
        lista77.imprime();
        lista77.imprime();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) 0.0d);
        ds.Lista lista85 = new ds.Lista();
        lista82.insere((java.lang.Object) lista85);
        lista85.imprime();
        lista85.imprime();
        lista85.insere((java.lang.Object) 10);
        lista77.insere((java.lang.Object) lista85);
        lista63.insere((java.lang.Object) lista85);
        java.lang.Class<?> wildcardClass93 = lista63.getClass();
        lista22.insere((java.lang.Object) wildcardClass93);
        lista22.imprime();
        java.lang.Class<?> wildcardClass96 = lista22.getClass();
        lista12.insere((java.lang.Object) wildcardClass96);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) 0L);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        lista31.imprime();
        lista31.insere((java.lang.Object) 100L);
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        boolean boolean43 = lista41.vazia();
        lista31.insere((java.lang.Object) boolean43);
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        boolean boolean49 = lista47.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        lista55.insere((java.lang.Object) '4');
        lista53.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) "");
        lista61.imprime();
        lista61.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista69.imprime();
        lista69.insere((java.lang.Object) 10);
        lista61.insere((java.lang.Object) lista69);
        lista47.insere((java.lang.Object) lista69);
        java.lang.Class<?> wildcardClass77 = lista47.getClass();
        lista6.insere((java.lang.Object) wildcardClass77);
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean41 = lista25.vazia();
        boolean boolean42 = lista25.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        lista43.insere((java.lang.Object) 0.0d);
        lista43.imprime();
        java.lang.Class<?> wildcardClass49 = lista43.getClass();
        lista25.insere((java.lang.Object) lista43);
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        lista51.insere((java.lang.Object) (short) 1);
        boolean boolean55 = lista51.vazia();
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) "");
        lista56.imprime();
        lista51.insere((java.lang.Object) lista56);
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) "");
        lista61.imprime();
        lista61.insere((java.lang.Object) 100L);
        boolean boolean67 = lista61.vazia();
        lista61.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.insere((java.lang.Object) (-1.0d));
        lista72.imprime();
        lista72.insere((java.lang.Object) (byte) -1);
        lista72.imprime();
        lista61.insere((java.lang.Object) lista72);
        boolean boolean81 = lista61.vazia();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) 0.0d);
        ds.Lista lista85 = new ds.Lista();
        lista82.insere((java.lang.Object) lista85);
        boolean boolean87 = lista85.vazia();
        lista85.insere((java.lang.Object) 10);
        ds.Lista lista90 = new ds.Lista();
        lista90.imprime();
        lista90.imprime();
        lista85.insere((java.lang.Object) lista90);
        boolean boolean94 = lista90.vazia();
        lista61.insere((java.lang.Object) lista90);
        lista51.insere((java.lang.Object) lista61);
        java.lang.Class<?> wildcardClass97 = lista61.getClass();
        lista25.insere((java.lang.Object) wildcardClass97);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) 0.0d);
        lista5.imprime();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        java.lang.Class<?> wildcardClass12 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass12);
        lista0.imprime();
        lista0.insere((java.lang.Object) 1.0f);
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) "");
        lista17.imprime();
        lista17.insere((java.lang.Object) 100L);
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        boolean boolean28 = lista25.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        boolean boolean34 = lista32.vazia();
        boolean boolean35 = lista32.vazia();
        lista25.insere((java.lang.Object) boolean35);
        lista0.insere((java.lang.Object) lista25);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        lista2.insere((java.lang.Object) 0.0d);
        lista2.imprime();
        java.lang.Class<?> wildcardClass8 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista13.insere((java.lang.Object) lista22);
        lista9.insere((java.lang.Object) lista13);
        boolean boolean27 = lista9.vazia();
        java.lang.Class<?> wildcardClass28 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 0.0d);
        ds.Lista lista6 = new ds.Lista();
        lista3.insere((java.lang.Object) lista6);
        lista6.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj10 = new java.lang.Object();
        lista6.insere(obj10);
        lista6.imprime();
        boolean boolean13 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        java.lang.Object obj12 = null;
        lista3.insere(obj12);
        // The following exception was thrown during execution in test generation
        try {
            lista3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        boolean boolean43 = lista41.vazia();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        lista49.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        lista41.insere((java.lang.Object) '4');
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        lista63.imprime();
        lista63.imprime();
        lista63.insere((java.lang.Object) 10);
        lista55.insere((java.lang.Object) lista63);
        lista41.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass71 = lista41.getClass();
        lista0.insere((java.lang.Object) wildcardClass71);
        lista0.insere((java.lang.Object) 10);
        boolean boolean75 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        lista3.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista3.vazia();
        java.lang.Class<?> wildcardClass15 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        lista21.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.insere((java.lang.Object) (short) 100);
        boolean boolean31 = lista26.vazia();
        boolean boolean32 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean36 = lista13.vazia();
        java.lang.Class<?> wildcardClass37 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        java.lang.Object obj36 = null;
        lista29.insere(obj36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object obj46 = null;
        lista0.insere(obj46);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.insere((java.lang.Object) '4');
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        lista29.imprime();
        lista29.imprime();
        lista29.imprime();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.imprime();
        boolean boolean9 = lista3.vazia();
        java.lang.Class<?> wildcardClass10 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.insere((java.lang.Object) 10);
        boolean boolean18 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean18);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        lista0.insere((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.insere((java.lang.Object) (-1.0d));
        boolean boolean27 = lista23.vazia();
        lista13.insere((java.lang.Object) lista23);
        lista13.imprime();
        java.lang.Class<?> wildcardClass30 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (byte) 10);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.insere((java.lang.Object) (short) 1);
        lista11.insere((java.lang.Object) (short) 1);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        boolean boolean30 = lista28.vazia();
        lista28.imprime();
        lista28.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 0.0d);
        ds.Lista lista36 = new ds.Lista();
        lista33.insere((java.lang.Object) lista36);
        lista36.insere((java.lang.Object) (-1.0d));
        lista36.imprime();
        boolean boolean41 = lista36.vazia();
        lista28.insere((java.lang.Object) lista36);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.imprime();
        lista28.insere((java.lang.Object) lista46);
        lista11.insere((java.lang.Object) lista46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        lista8.insere((java.lang.Object) (short) 100);
        boolean boolean13 = lista8.vazia();
        boolean boolean14 = lista8.vazia();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.insere((java.lang.Object) (short) 100);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        java.lang.Class<?> wildcardClass23 = lista16.getClass();
        lista3.insere((java.lang.Object) wildcardClass23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista28.insere((java.lang.Object) lista34);
        lista3.insere((java.lang.Object) lista34);
        java.lang.Class<?> wildcardClass40 = lista34.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        lista23.insere((java.lang.Object) 10.0d);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) "");
        lista23.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        ds.Lista lista30 = new ds.Lista();
        lista27.insere((java.lang.Object) lista30);
        java.lang.Class<?> wildcardClass32 = lista30.getClass();
        lista23.insere((java.lang.Object) lista30);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista37.imprime();
        lista37.insere((java.lang.Object) 10);
        boolean boolean43 = lista37.vazia();
        lista30.insere((java.lang.Object) lista37);
        lista0.insere((java.lang.Object) lista37);
        boolean boolean46 = lista37.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean46 = lista6.vazia();
        lista6.imprime();
        boolean boolean48 = lista6.vazia();
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        lista25.imprime();
        lista9.insere((java.lang.Object) lista25);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 0.0d);
        lista33.insere((java.lang.Object) 0.0d);
        boolean boolean38 = lista33.vazia();
        lista33.imprime();
        lista33.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) "");
        lista41.imprime();
        lista41.insere((java.lang.Object) 100L);
        boolean boolean47 = lista41.vazia();
        lista41.imprime();
        lista41.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        lista50.insere((java.lang.Object) (short) 100);
        boolean boolean55 = lista50.vazia();
        lista50.imprime();
        lista41.insere((java.lang.Object) lista50);
        lista33.insere((java.lang.Object) lista41);
        lista9.insere((java.lang.Object) lista41);
        boolean boolean60 = lista9.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass17 = lista15.getClass();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        boolean boolean28 = lista22.vazia();
        lista15.insere((java.lang.Object) lista22);
        lista22.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        lista34.insere((java.lang.Object) lista42);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.imprime();
        java.lang.Object obj55 = null;
        lista52.insere(obj55);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        lista60.insere((java.lang.Object) (-1.0d));
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista60.imprime();
        lista52.insere((java.lang.Object) lista60);
        java.lang.Class<?> wildcardClass68 = lista60.getClass();
        lista34.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista34);
        lista0.imprime();
        boolean boolean73 = lista0.vazia();
        boolean boolean74 = lista0.vazia();
        boolean boolean75 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.imprime();
        lista3.insere((java.lang.Object) lista22);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        lista31.imprime();
        lista3.insere((java.lang.Object) lista31);
        boolean boolean37 = lista31.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.imprime();
        java.lang.Object obj16 = null;
        lista13.insere(obj16);
        java.lang.Class<?> wildcardClass18 = lista13.getClass();
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.insere((java.lang.Object) (-1.0d));
        lista9.imprime();
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        lista18.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj31 = new java.lang.Object();
        lista27.insere(obj31);
        lista18.insere(obj31);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        ds.Lista lista30 = new ds.Lista();
        lista27.insere((java.lang.Object) lista30);
        lista30.insere((java.lang.Object) (-1.0d));
        lista30.imprime();
        boolean boolean35 = lista30.vazia();
        lista22.insere((java.lang.Object) lista30);
        lista30.imprime();
        java.lang.Object obj38 = null;
        lista30.insere(obj38);
        lista11.insere((java.lang.Object) lista30);
        java.lang.Class<?> wildcardClass41 = lista30.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        lista15.insere((java.lang.Object) '4');
        lista13.insere((java.lang.Object) '4');
        lista13.insere((java.lang.Object) '#');
        boolean boolean22 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        boolean boolean8 = lista3.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.imprime();
        lista9.insere((java.lang.Object) "");
        boolean boolean15 = lista9.vazia();
        boolean boolean16 = lista9.vazia();
        lista3.insere((java.lang.Object) lista9);
        // The following exception was thrown during execution in test generation
        try {
            lista3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        boolean boolean27 = lista3.vazia();
        boolean boolean28 = lista3.vazia();
        java.lang.Class<?> wildcardClass29 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) "");
        lista11.insere((java.lang.Object) false);
        boolean boolean16 = lista11.vazia();
        boolean boolean17 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) "");
        lista19.insere((java.lang.Object) false);
        lista19.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        lista25.insere((java.lang.Object) '4');
        lista19.insere((java.lang.Object) '4');
        lista11.insere((java.lang.Object) '4');
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.insere((java.lang.Object) (short) 1);
        lista31.insere((java.lang.Object) 0L);
        lista11.insere((java.lang.Object) lista31);
        boolean boolean38 = lista31.vazia();
        java.lang.Class<?> wildcardClass39 = lista31.getClass();
        lista0.insere((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista10.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        lista20.imprime();
        java.lang.Object obj23 = null;
        lista20.insere(obj23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista28.insere((java.lang.Object) (-1.0d));
        lista28.imprime();
        boolean boolean33 = lista28.vazia();
        lista28.imprime();
        lista20.insere((java.lang.Object) lista28);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        java.lang.Object obj42 = null;
        lista39.insere(obj42);
        lista28.insere(obj42);
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        lista45.imprime();
        lista45.insere((java.lang.Object) "");
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.imprime();
        lista45.insere((java.lang.Object) lista54);
        lista28.insere((java.lang.Object) lista54);
        lista10.insere((java.lang.Object) lista28);
        lista10.imprime();
        boolean boolean61 = lista10.vazia();
        java.lang.Class<?> wildcardClass62 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean30 = lista24.vazia();
        lista24.imprime();
        boolean boolean32 = lista24.vazia();
        lista9.insere((java.lang.Object) boolean32);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) "");
        lista34.imprime();
        lista34.insere((java.lang.Object) 100L);
        boolean boolean40 = lista34.vazia();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        boolean boolean46 = lista44.vazia();
        lista34.insere((java.lang.Object) boolean46);
        lista34.imprime();
        lista9.insere((java.lang.Object) lista34);
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        boolean boolean52 = lista50.vazia();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        ds.Lista lista58 = new ds.Lista();
        lista58.imprime();
        lista58.insere((java.lang.Object) '4');
        lista56.insere((java.lang.Object) '4');
        lista50.insere((java.lang.Object) '4');
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) "");
        lista64.imprime();
        lista64.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.imprime();
        lista72.imprime();
        lista72.insere((java.lang.Object) 10);
        lista64.insere((java.lang.Object) lista72);
        lista50.insere((java.lang.Object) lista72);
        java.lang.Class<?> wildcardClass80 = lista50.getClass();
        lista9.insere((java.lang.Object) wildcardClass80);
        lista0.insere((java.lang.Object) lista9);
        lista9.imprime();
        ds.Lista lista84 = new ds.Lista();
        lista84.insere((java.lang.Object) 0.0d);
        ds.Lista lista87 = new ds.Lista();
        lista84.insere((java.lang.Object) lista87);
        boolean boolean89 = lista87.vazia();
        boolean boolean90 = lista87.vazia();
        java.lang.Class<?> wildcardClass91 = lista87.getClass();
        lista9.insere((java.lang.Object) wildcardClass91);
        lista9.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.insere((java.lang.Object) (-1.0d));
        lista27.imprime();
        boolean boolean32 = lista27.vazia();
        lista27.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        boolean boolean39 = lista37.vazia();
        boolean boolean40 = lista37.vazia();
        lista37.imprime();
        boolean boolean42 = lista37.vazia();
        lista27.insere((java.lang.Object) lista37);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.insere((java.lang.Object) (short) 1);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        boolean boolean53 = lista51.vazia();
        lista51.insere((java.lang.Object) 10);
        ds.Lista lista56 = new ds.Lista();
        lista56.imprime();
        lista56.imprime();
        lista51.insere((java.lang.Object) lista56);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        boolean boolean65 = lista63.vazia();
        lista63.imprime();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) 0.0d);
        ds.Lista lista70 = new ds.Lista();
        lista67.insere((java.lang.Object) lista70);
        boolean boolean72 = lista70.vazia();
        boolean boolean73 = lista70.vazia();
        lista70.imprime();
        lista63.insere((java.lang.Object) lista70);
        lista56.insere((java.lang.Object) lista70);
        lista44.insere((java.lang.Object) lista70);
        lista27.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        lista12.insere((java.lang.Object) 10.0d);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        lista19.imprime();
        lista19.insere((java.lang.Object) "");
        lista19.imprime();
        lista12.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass27 = lista12.getClass();
        lista8.insere((java.lang.Object) lista12);
        lista8.imprime();
        java.lang.Class<?> wildcardClass30 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        lista0.insere((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        lista15.insere((java.lang.Object) 0.0d);
        lista15.imprime();
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista3.insere((java.lang.Object) lista15);
        boolean boolean23 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean18 = lista11.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Class<?> wildcardClass21 = lista19.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        boolean boolean24 = lista0.vazia();
        boolean boolean25 = lista0.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        lista29.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        lista29.insere((java.lang.Object) lista35);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        lista40.insere((java.lang.Object) 10.0d);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        lista47.imprime();
        lista47.insere((java.lang.Object) "");
        lista47.imprime();
        lista40.insere((java.lang.Object) lista47);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        lista55.insere((java.lang.Object) 0.0d);
        boolean boolean61 = lista55.vazia();
        lista55.imprime();
        boolean boolean63 = lista55.vazia();
        lista40.insere((java.lang.Object) boolean63);
        ds.Lista lista65 = new ds.Lista();
        lista65.insere((java.lang.Object) "");
        lista65.imprime();
        lista65.insere((java.lang.Object) 100L);
        boolean boolean71 = lista65.vazia();
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) 0.0d);
        ds.Lista lista75 = new ds.Lista();
        lista72.insere((java.lang.Object) lista75);
        boolean boolean77 = lista75.vazia();
        lista65.insere((java.lang.Object) boolean77);
        lista65.imprime();
        lista40.insere((java.lang.Object) lista65);
        lista65.imprime();
        lista29.insere((java.lang.Object) lista65);
        boolean boolean83 = lista65.vazia();
        lista0.insere((java.lang.Object) boolean83);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.insere((java.lang.Object) false);
        lista8.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.insere((java.lang.Object) '4');
        lista8.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.insere((java.lang.Object) (short) 1);
        lista20.insere((java.lang.Object) 0L);
        lista0.insere((java.lang.Object) lista20);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        java.lang.Object obj34 = null;
        lista31.insere(obj34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        lista39.imprime();
        boolean boolean44 = lista39.vazia();
        lista39.imprime();
        lista31.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass47 = lista39.getClass();
        lista13.insere((java.lang.Object) lista39);
        lista3.insere((java.lang.Object) lista13);
        lista3.imprime();
        boolean boolean51 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        boolean boolean10 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        boolean boolean14 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        lista11.insere((java.lang.Object) 10);
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        lista11.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        lista20.insere((java.lang.Object) 0.0d);
        boolean boolean26 = lista20.vazia();
        lista20.imprime();
        lista16.insere((java.lang.Object) lista20);
        boolean boolean29 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        lista50.insere((java.lang.Object) (short) 100);
        boolean boolean55 = lista50.vazia();
        lista46.insere((java.lang.Object) lista50);
        boolean boolean57 = lista46.vazia();
        lista34.insere((java.lang.Object) lista46);
        lista0.insere((java.lang.Object) lista34);
        boolean boolean60 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        java.lang.Object obj19 = null;
        lista11.insere(obj19);
        boolean boolean21 = lista11.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        lista22.insere((java.lang.Object) 10.0d);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        lista29.imprime();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista22.insere((java.lang.Object) lista29);
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) "");
        lista37.imprime();
        lista37.insere((java.lang.Object) 0.0d);
        boolean boolean43 = lista37.vazia();
        lista37.imprime();
        boolean boolean45 = lista37.vazia();
        lista22.insere((java.lang.Object) boolean45);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) "");
        lista47.imprime();
        lista47.insere((java.lang.Object) 100L);
        boolean boolean53 = lista47.vazia();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) 0.0d);
        ds.Lista lista57 = new ds.Lista();
        lista54.insere((java.lang.Object) lista57);
        boolean boolean59 = lista57.vazia();
        lista47.insere((java.lang.Object) boolean59);
        lista47.imprime();
        lista22.insere((java.lang.Object) lista47);
        lista11.insere((java.lang.Object) lista47);
        java.lang.Class<?> wildcardClass64 = lista47.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass29 = lista27.getClass();
        lista20.insere((java.lang.Object) lista27);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.imprime();
        lista34.imprime();
        lista34.insere((java.lang.Object) 10);
        boolean boolean40 = lista34.vazia();
        lista27.insere((java.lang.Object) lista34);
        lista34.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        boolean boolean48 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        ds.Lista lista54 = new ds.Lista();
        lista51.insere((java.lang.Object) lista54);
        lista54.insere((java.lang.Object) (-1.0d));
        lista54.imprime();
        boolean boolean59 = lista54.vazia();
        lista46.insere((java.lang.Object) lista54);
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) 0.0d);
        ds.Lista lista64 = new ds.Lista();
        lista61.insere((java.lang.Object) lista64);
        lista64.imprime();
        java.lang.Object obj67 = null;
        lista64.insere(obj67);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.insere((java.lang.Object) (-1.0d));
        lista72.imprime();
        boolean boolean77 = lista72.vazia();
        lista72.imprime();
        lista64.insere((java.lang.Object) lista72);
        java.lang.Class<?> wildcardClass80 = lista72.getClass();
        lista46.insere((java.lang.Object) lista72);
        lista34.insere((java.lang.Object) lista46);
        lista11.insere((java.lang.Object) lista34);
        java.lang.Class<?> wildcardClass84 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        java.lang.Class<?> wildcardClass36 = lista29.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista7.insere((java.lang.Object) 10.0d);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.imprime();
        lista14.insere((java.lang.Object) "");
        lista14.imprime();
        lista7.insere((java.lang.Object) lista14);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista22.insere((java.lang.Object) 0.0d);
        boolean boolean28 = lista22.vazia();
        lista22.imprime();
        boolean boolean30 = lista22.vazia();
        lista7.insere((java.lang.Object) boolean30);
        lista0.insere((java.lang.Object) boolean30);
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        lista13.imprime();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista13.insere((java.lang.Object) lista21);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.imprime();
        java.lang.Object obj34 = null;
        lista31.insere(obj34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        lista39.imprime();
        boolean boolean44 = lista39.vazia();
        lista39.imprime();
        lista31.insere((java.lang.Object) lista39);
        java.lang.Class<?> wildcardClass47 = lista39.getClass();
        lista13.insere((java.lang.Object) lista39);
        lista3.insere((java.lang.Object) lista13);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        boolean boolean53 = lista50.vazia();
        lista50.imprime();
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        lista55.imprime();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        java.lang.Class<?> wildcardClass62 = lista55.getClass();
        lista50.insere((java.lang.Object) wildcardClass62);
        lista50.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.imprime();
        boolean boolean67 = lista65.vazia();
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) 0.0d);
        ds.Lista lista71 = new ds.Lista();
        lista68.insere((java.lang.Object) lista71);
        ds.Lista lista73 = new ds.Lista();
        lista73.imprime();
        lista73.insere((java.lang.Object) '4');
        lista71.insere((java.lang.Object) '4');
        lista65.insere((java.lang.Object) '4');
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) "");
        lista79.imprime();
        lista79.imprime();
        ds.Lista lista84 = new ds.Lista();
        lista84.insere((java.lang.Object) 0.0d);
        ds.Lista lista87 = new ds.Lista();
        lista84.insere((java.lang.Object) lista87);
        lista87.imprime();
        lista87.imprime();
        lista87.insere((java.lang.Object) 10);
        lista79.insere((java.lang.Object) lista87);
        lista65.insere((java.lang.Object) lista87);
        java.lang.Class<?> wildcardClass95 = lista65.getClass();
        lista50.insere((java.lang.Object) lista65);
        lista3.insere((java.lang.Object) lista65);
        boolean boolean98 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass95);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        boolean boolean27 = lista3.vazia();
        boolean boolean28 = lista3.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        boolean boolean34 = lista32.vazia();
        lista32.insere((java.lang.Object) 10);
        ds.Lista lista37 = new ds.Lista();
        lista37.imprime();
        lista37.imprime();
        lista32.insere((java.lang.Object) lista37);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        boolean boolean46 = lista44.vazia();
        lista44.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        boolean boolean53 = lista51.vazia();
        boolean boolean54 = lista51.vazia();
        lista51.imprime();
        lista44.insere((java.lang.Object) lista51);
        lista37.insere((java.lang.Object) lista51);
        lista37.imprime();
        lista3.insere((java.lang.Object) lista37);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        lista63.insere((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass67 = lista63.getClass();
        lista37.insere((java.lang.Object) lista63);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        lista0.insere((java.lang.Object) 0L);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        lista31.imprime();
        lista31.insere((java.lang.Object) 100L);
        boolean boolean37 = lista31.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        boolean boolean43 = lista41.vazia();
        lista31.insere((java.lang.Object) boolean43);
        lista31.imprime();
        lista6.insere((java.lang.Object) lista31);
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        boolean boolean49 = lista47.vazia();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        lista55.insere((java.lang.Object) '4');
        lista53.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) "");
        lista61.imprime();
        lista61.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista69.imprime();
        lista69.insere((java.lang.Object) 10);
        lista61.insere((java.lang.Object) lista69);
        lista47.insere((java.lang.Object) lista69);
        java.lang.Class<?> wildcardClass77 = lista47.getClass();
        lista6.insere((java.lang.Object) wildcardClass77);
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista80 = new ds.Lista();
        lista80.insere((java.lang.Object) 0.0d);
        ds.Lista lista83 = new ds.Lista();
        lista80.insere((java.lang.Object) lista83);
        lista83.imprime();
        java.lang.Object obj86 = null;
        lista83.insere(obj86);
        boolean boolean88 = lista83.vazia();
        ds.Lista lista89 = new ds.Lista();
        lista89.insere((java.lang.Object) 0.0d);
        lista89.imprime();
        lista89.insere((java.lang.Object) "");
        boolean boolean95 = lista89.vazia();
        boolean boolean96 = lista89.vazia();
        lista83.insere((java.lang.Object) lista89);
        lista6.insere((java.lang.Object) lista89);
        java.lang.Class<?> wildcardClass99 = lista89.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        boolean boolean10 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean20 = lista17.vazia();
        lista17.imprime();
        java.lang.Class<?> wildcardClass22 = lista17.getClass();
        lista15.insere((java.lang.Object) lista17);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass33 = lista31.getClass();
        lista24.insere((java.lang.Object) lista31);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        boolean boolean40 = lista38.vazia();
        lista38.insere((java.lang.Object) 10);
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        lista43.imprime();
        lista38.insere((java.lang.Object) lista43);
        lista24.insere((java.lang.Object) lista38);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        boolean boolean51 = lista48.vazia();
        lista48.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        lista53.insere((java.lang.Object) '4');
        lista53.imprime();
        lista48.insere((java.lang.Object) lista53);
        lista24.insere((java.lang.Object) lista53);
        lista15.insere((java.lang.Object) lista53);
        boolean boolean61 = lista15.vazia();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) 0.0d);
        ds.Lista lista65 = new ds.Lista();
        lista62.insere((java.lang.Object) lista65);
        lista65.insere((java.lang.Object) (-1.0d));
        lista65.imprime();
        lista65.insere((java.lang.Object) (byte) -1);
        lista65.imprime();
        boolean boolean73 = lista65.vazia();
        java.lang.Object obj74 = null;
        lista65.insere(obj74);
        lista15.insere((java.lang.Object) lista65);
        lista3.insere((java.lang.Object) lista15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.imprime();
        java.lang.Object obj16 = null;
        lista13.insere(obj16);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista21.imprime();
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass30 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        lista20.imprime();
        lista20.insere((java.lang.Object) "");
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        lista29.imprime();
        lista20.insere((java.lang.Object) lista29);
        lista11.insere((java.lang.Object) lista20);
        boolean boolean34 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        java.lang.Class<?> wildcardClass16 = lista14.getClass();
        lista7.insere((java.lang.Object) lista14);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        lista21.insere((java.lang.Object) 10);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        lista21.insere((java.lang.Object) lista26);
        lista7.insere((java.lang.Object) lista21);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        boolean boolean34 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.insere((java.lang.Object) '4');
        lista36.imprime();
        lista31.insere((java.lang.Object) lista36);
        lista7.insere((java.lang.Object) lista36);
        lista36.imprime();
        lista36.imprime();
        lista0.insere((java.lang.Object) lista36);
        boolean boolean46 = lista36.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) (short) 100);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        lista11.insere((java.lang.Object) "hi!");
        lista0.insere((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) (short) 100);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.insere((java.lang.Object) (-1.0d));
        lista27.imprime();
        boolean boolean32 = lista27.vazia();
        lista27.imprime();
        java.lang.Class<?> wildcardClass34 = lista27.getClass();
        lista19.insere((java.lang.Object) wildcardClass34);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        boolean boolean43 = lista39.vazia();
        lista39.insere((java.lang.Object) 100);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass49 = lista46.getClass();
        lista39.insere((java.lang.Object) wildcardClass49);
        lista19.insere((java.lang.Object) wildcardClass49);
        lista0.insere((java.lang.Object) lista19);
        lista19.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista45.insere((java.lang.Object) (-1.0d));
        lista45.imprime();
        boolean boolean50 = lista45.vazia();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        lista45.imprime();
        boolean boolean55 = lista45.vazia();
        lista11.insere((java.lang.Object) boolean55);
        lista11.insere((java.lang.Object) (byte) 10);
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) 0.0d);
        ds.Lista lista62 = new ds.Lista();
        lista59.insere((java.lang.Object) lista62);
        lista59.insere((java.lang.Object) 10.0d);
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.insere((java.lang.Object) (-1.0d));
        lista69.imprime();
        boolean boolean74 = lista69.vazia();
        lista59.insere((java.lang.Object) boolean74);
        boolean boolean76 = lista59.vazia();
        boolean boolean77 = lista59.vazia();
        lista11.insere((java.lang.Object) lista59);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        lista15.insere((java.lang.Object) (-1.0d));
        boolean boolean19 = lista15.vazia();
        lista15.insere((java.lang.Object) 100);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass25 = lista22.getClass();
        lista15.insere((java.lang.Object) wildcardClass25);
        lista3.insere((java.lang.Object) lista15);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        boolean boolean30 = lista28.vazia();
        lista28.imprime();
        lista15.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass33 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass17 = lista15.getClass();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        boolean boolean28 = lista22.vazia();
        lista15.insere((java.lang.Object) lista22);
        lista22.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        lista34.insere((java.lang.Object) lista42);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.imprime();
        java.lang.Object obj55 = null;
        lista52.insere(obj55);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        lista60.insere((java.lang.Object) (-1.0d));
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista60.imprime();
        lista52.insere((java.lang.Object) lista60);
        java.lang.Class<?> wildcardClass68 = lista60.getClass();
        lista34.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista34);
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) 0.0d);
        ds.Lista lista75 = new ds.Lista();
        lista72.insere((java.lang.Object) lista75);
        boolean boolean77 = lista75.vazia();
        lista75.imprime();
        ds.Lista lista79 = new ds.Lista();
        lista79.insere((java.lang.Object) 0.0d);
        ds.Lista lista82 = new ds.Lista();
        lista79.insere((java.lang.Object) lista82);
        boolean boolean84 = lista82.vazia();
        boolean boolean85 = lista82.vazia();
        lista82.imprime();
        lista75.insere((java.lang.Object) lista82);
        lista75.imprime();
        lista0.insere((java.lang.Object) lista75);
        ds.Lista lista90 = new ds.Lista();
        lista90.insere((java.lang.Object) 0.0d);
        ds.Lista lista93 = new ds.Lista();
        lista90.insere((java.lang.Object) lista93);
        boolean boolean95 = lista93.vazia();
        lista93.imprime();
        java.lang.Class<?> wildcardClass97 = lista93.getClass();
        lista75.insere((java.lang.Object) wildcardClass97);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        lista6.imprime();
        lista6.insere((java.lang.Object) "");
        boolean boolean12 = lista6.vazia();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.imprime();
        lista14.insere((java.lang.Object) "");
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista14.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        lista2.insere((java.lang.Object) 0.0d);
        lista2.imprime();
        java.lang.Class<?> wildcardClass8 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass8);
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.imprime();
        lista3.insere((java.lang.Object) lista22);
        java.lang.Class<?> wildcardClass28 = lista22.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        lista0.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        lista27.imprime();
        lista27.insere((java.lang.Object) "");
        lista27.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        lista25.imprime();
        lista25.imprime();
        lista25.imprime();
        java.lang.Class<?> wildcardClass44 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        boolean boolean27 = lista25.vazia();
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        lista33.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        boolean boolean41 = lista39.vazia();
        lista39.imprime();
        lista33.insere((java.lang.Object) lista39);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista44.insere((java.lang.Object) 10.0d);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        lista51.imprime();
        lista51.insere((java.lang.Object) "");
        lista51.imprime();
        lista44.insere((java.lang.Object) lista51);
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) "");
        lista59.imprime();
        lista59.insere((java.lang.Object) 0.0d);
        boolean boolean65 = lista59.vazia();
        lista59.imprime();
        boolean boolean67 = lista59.vazia();
        lista44.insere((java.lang.Object) boolean67);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) "");
        lista69.imprime();
        lista69.insere((java.lang.Object) 100L);
        boolean boolean75 = lista69.vazia();
        ds.Lista lista76 = new ds.Lista();
        lista76.insere((java.lang.Object) 0.0d);
        ds.Lista lista79 = new ds.Lista();
        lista76.insere((java.lang.Object) lista79);
        boolean boolean81 = lista79.vazia();
        lista69.insere((java.lang.Object) boolean81);
        lista69.imprime();
        lista44.insere((java.lang.Object) lista69);
        lista69.imprime();
        lista33.insere((java.lang.Object) lista69);
        lista25.insere((java.lang.Object) lista33);
        java.lang.Class<?> wildcardClass88 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        lista0.imprime();
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) (short) 100);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        lista25.imprime();
        lista25.imprime();
        lista25.imprime();
        lista25.imprime();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista3.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass14 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        boolean boolean29 = lista27.vazia();
        lista27.insere((java.lang.Object) 10);
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        lista27.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        boolean boolean41 = lista39.vazia();
        lista39.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        boolean boolean48 = lista46.vazia();
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        lista39.insere((java.lang.Object) lista46);
        lista32.insere((java.lang.Object) lista46);
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        lista53.insere((java.lang.Object) 10.0d);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        lista60.imprime();
        lista60.insere((java.lang.Object) "");
        lista60.imprime();
        lista53.insere((java.lang.Object) lista60);
        lista32.insere((java.lang.Object) lista60);
        lista12.insere((java.lang.Object) lista60);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        boolean boolean10 = lista8.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        lista11.insere((java.lang.Object) 0.0d);
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        boolean boolean18 = lista11.vazia();
        lista8.insere((java.lang.Object) boolean18);
        java.lang.Class<?> wildcardClass20 = lista8.getClass();
        lista3.insere((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = null;
        lista3.insere(obj22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        boolean boolean18 = lista11.vazia();
        lista0.insere((java.lang.Object) boolean18);
        boolean boolean20 = lista0.vazia();
        boolean boolean21 = lista0.vazia();
        lista0.imprime();
        java.lang.Object obj23 = null;
        lista0.insere(obj23);
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        boolean boolean9 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean12 = lista3.vazia();
        java.lang.Class<?> wildcardClass13 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        boolean boolean14 = lista11.vazia();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.insere((java.lang.Object) (short) 100);
        boolean boolean21 = lista16.vazia();
        boolean boolean22 = lista16.vazia();
        lista11.insere((java.lang.Object) lista16);
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista25.insere((java.lang.Object) 10.0d);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        lista32.imprime();
        lista32.insere((java.lang.Object) "");
        lista32.imprime();
        lista25.insere((java.lang.Object) lista32);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 0.0d);
        boolean boolean46 = lista40.vazia();
        lista40.imprime();
        boolean boolean48 = lista40.vazia();
        lista25.insere((java.lang.Object) boolean48);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) "");
        lista50.imprime();
        lista50.insere((java.lang.Object) 100L);
        boolean boolean56 = lista50.vazia();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        boolean boolean62 = lista60.vazia();
        lista50.insere((java.lang.Object) boolean62);
        lista50.imprime();
        lista25.insere((java.lang.Object) lista50);
        lista50.imprime();
        lista50.imprime();
        lista50.imprime();
        boolean boolean69 = lista50.vazia();
        lista11.insere((java.lang.Object) lista50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean20 = lista11.vazia();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        java.lang.Object obj25 = null;
        lista22.insere(obj25);
        lista11.insere(obj25);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        lista28.imprime();
        lista28.insere((java.lang.Object) "");
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.imprime();
        lista28.insere((java.lang.Object) lista37);
        lista11.insere((java.lang.Object) lista37);
        java.lang.Class<?> wildcardClass42 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        lista3.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista3.vazia();
        boolean boolean15 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.insere((java.lang.Object) false);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.imprime();
        lista26.insere((java.lang.Object) "");
        boolean boolean32 = lista26.vazia();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) "");
        lista34.imprime();
        lista34.insere((java.lang.Object) 100L);
        boolean boolean40 = lista34.vazia();
        boolean boolean41 = lista34.vazia();
        lista34.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista43.insere((java.lang.Object) 10.0d);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        lista50.imprime();
        lista50.insere((java.lang.Object) "");
        lista50.imprime();
        lista43.insere((java.lang.Object) lista50);
        java.lang.Class<?> wildcardClass58 = lista43.getClass();
        lista34.insere((java.lang.Object) wildcardClass58);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        boolean boolean65 = lista63.vazia();
        boolean boolean66 = lista63.vazia();
        lista63.imprime();
        lista34.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass69 = lista34.getClass();
        lista20.insere((java.lang.Object) lista34);
        lista11.insere((java.lang.Object) lista20);
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) 0.0d);
        boolean boolean75 = lista72.vazia();
        java.lang.Class<?> wildcardClass76 = lista72.getClass();
        lista11.insere((java.lang.Object) wildcardClass76);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        boolean boolean9 = lista7.vazia();
        boolean boolean10 = lista7.vazia();
        lista0.insere((java.lang.Object) boolean10);
        lista0.imprime();
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean19 = lista11.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.insere((java.lang.Object) false);
        lista20.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.imprime();
        lista26.insere((java.lang.Object) "");
        boolean boolean32 = lista26.vazia();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) "");
        lista34.imprime();
        lista34.insere((java.lang.Object) 100L);
        boolean boolean40 = lista34.vazia();
        boolean boolean41 = lista34.vazia();
        lista34.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista43.insere((java.lang.Object) 10.0d);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        lista50.imprime();
        lista50.insere((java.lang.Object) "");
        lista50.imprime();
        lista43.insere((java.lang.Object) lista50);
        java.lang.Class<?> wildcardClass58 = lista43.getClass();
        lista34.insere((java.lang.Object) wildcardClass58);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        boolean boolean65 = lista63.vazia();
        boolean boolean66 = lista63.vazia();
        lista63.imprime();
        lista34.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass69 = lista34.getClass();
        lista20.insere((java.lang.Object) lista34);
        lista11.insere((java.lang.Object) lista20);
        boolean boolean72 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        boolean boolean27 = lista3.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        boolean boolean33 = lista31.vazia();
        lista31.insere((java.lang.Object) 10);
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.imprime();
        lista31.insere((java.lang.Object) lista36);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        boolean boolean45 = lista43.vazia();
        lista43.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        boolean boolean53 = lista50.vazia();
        lista50.imprime();
        lista43.insere((java.lang.Object) lista50);
        lista36.insere((java.lang.Object) lista50);
        ds.Lista lista57 = new ds.Lista();
        boolean boolean58 = lista57.vazia();
        lista57.insere((java.lang.Object) (short) 1);
        boolean boolean61 = lista57.vazia();
        java.lang.Class<?> wildcardClass62 = lista57.getClass();
        lista36.insere((java.lang.Object) wildcardClass62);
        java.lang.Class<?> wildcardClass64 = lista36.getClass();
        lista3.insere((java.lang.Object) lista36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        lista14.imprime();
        lista14.imprime();
        lista14.insere((java.lang.Object) 10);
        boolean boolean20 = lista14.vazia();
        lista7.insere((java.lang.Object) lista14);
        lista14.imprime();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista26.insere((java.lang.Object) lista34);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        lista44.imprime();
        java.lang.Object obj47 = null;
        lista44.insere(obj47);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.insere((java.lang.Object) (-1.0d));
        lista52.imprime();
        boolean boolean57 = lista52.vazia();
        lista52.imprime();
        lista44.insere((java.lang.Object) lista52);
        java.lang.Class<?> wildcardClass60 = lista52.getClass();
        lista26.insere((java.lang.Object) lista52);
        lista14.insere((java.lang.Object) lista26);
        boolean boolean63 = lista26.vazia();
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) 0.0d);
        ds.Lista lista67 = new ds.Lista();
        lista64.insere((java.lang.Object) lista67);
        boolean boolean69 = lista64.vazia();
        boolean boolean70 = lista64.vazia();
        java.lang.Class<?> wildcardClass71 = lista64.getClass();
        lista26.insere((java.lang.Object) wildcardClass71);
        boolean boolean73 = lista26.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 10);
        lista3.imprime();
        lista3.imprime();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        boolean boolean7 = lista3.vazia();
        lista3.imprime();
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.insere((java.lang.Object) (short) 100);
        boolean boolean12 = lista7.vazia();
        lista3.insere((java.lang.Object) lista7);
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        boolean boolean15 = lista9.vazia();
        lista9.imprime();
        java.lang.Class<?> wildcardClass17 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 1);
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        boolean boolean12 = lista9.vazia();
        lista9.imprime();
        boolean boolean14 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean14);
        boolean boolean16 = lista0.vazia();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        lista23.insere((java.lang.Object) 10.0d);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        lista30.imprime();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista23.insere((java.lang.Object) lista30);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        lista38.imprime();
        lista38.insere((java.lang.Object) 0.0d);
        boolean boolean44 = lista38.vazia();
        lista38.imprime();
        boolean boolean46 = lista38.vazia();
        lista23.insere((java.lang.Object) boolean46);
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        lista51.insere((java.lang.Object) (-1.0d));
        lista51.imprime();
        lista51.insere((java.lang.Object) (byte) -1);
        lista51.imprime();
        boolean boolean59 = lista51.vazia();
        boolean boolean60 = lista51.vazia();
        lista23.insere((java.lang.Object) lista51);
        lista17.insere((java.lang.Object) lista23);
        ds.Lista lista63 = new ds.Lista();
        lista63.imprime();
        boolean boolean65 = lista63.vazia();
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        ds.Lista lista71 = new ds.Lista();
        lista71.imprime();
        lista71.insere((java.lang.Object) '4');
        lista69.insere((java.lang.Object) '4');
        lista63.insere((java.lang.Object) '4');
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) "");
        lista77.imprime();
        lista77.imprime();
        ds.Lista lista82 = new ds.Lista();
        lista82.insere((java.lang.Object) 0.0d);
        ds.Lista lista85 = new ds.Lista();
        lista82.insere((java.lang.Object) lista85);
        lista85.imprime();
        lista85.imprime();
        lista85.insere((java.lang.Object) 10);
        lista77.insere((java.lang.Object) lista85);
        lista63.insere((java.lang.Object) lista85);
        lista63.imprime();
        lista23.insere((java.lang.Object) lista63);
        boolean boolean95 = lista63.vazia();
        lista0.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass97 = lista63.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj7 = new java.lang.Object();
        lista3.insere(obj7);
        lista3.imprime();
        boolean boolean10 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean13 = lista3.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.insere((java.lang.Object) (short) 100);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.insere((java.lang.Object) (-1.0d));
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista22.imprime();
        java.lang.Class<?> wildcardClass29 = lista22.getClass();
        lista14.insere((java.lang.Object) wildcardClass29);
        lista3.insere((java.lang.Object) lista14);
        boolean boolean32 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        boolean boolean39 = lista34.vazia();
        lista26.insere((java.lang.Object) lista34);
        lista26.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista42.insere((java.lang.Object) 10.0d);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        lista49.imprime();
        lista49.insere((java.lang.Object) "");
        lista49.imprime();
        lista42.insere((java.lang.Object) lista49);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) "");
        lista57.imprime();
        lista57.insere((java.lang.Object) 0.0d);
        boolean boolean63 = lista57.vazia();
        lista57.imprime();
        boolean boolean65 = lista57.vazia();
        lista42.insere((java.lang.Object) boolean65);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) "");
        lista67.imprime();
        lista67.insere((java.lang.Object) 100L);
        boolean boolean73 = lista67.vazia();
        ds.Lista lista74 = new ds.Lista();
        lista74.insere((java.lang.Object) 0.0d);
        ds.Lista lista77 = new ds.Lista();
        lista74.insere((java.lang.Object) lista77);
        boolean boolean79 = lista77.vazia();
        lista67.insere((java.lang.Object) boolean79);
        lista67.imprime();
        lista42.insere((java.lang.Object) lista67);
        lista67.imprime();
        lista26.insere((java.lang.Object) lista67);
        lista0.insere((java.lang.Object) lista67);
        boolean boolean86 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        boolean boolean28 = lista21.vazia();
        lista10.insere((java.lang.Object) boolean28);
        boolean boolean30 = lista10.vazia();
        boolean boolean31 = lista10.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista35.imprime();
        lista10.insere((java.lang.Object) lista35);
        java.lang.Class<?> wildcardClass40 = lista10.getClass();
        lista0.insere((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        boolean boolean13 = lista10.vazia();
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean16 = lista3.vazia();
        boolean boolean17 = lista3.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) "");
        lista18.imprime();
        lista18.insere((java.lang.Object) 100L);
        lista3.insere((java.lang.Object) lista18);
        boolean boolean25 = lista18.vazia();
        lista18.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass17 = lista15.getClass();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        boolean boolean28 = lista22.vazia();
        lista15.insere((java.lang.Object) lista22);
        lista22.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        lista34.insere((java.lang.Object) lista42);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.imprime();
        java.lang.Object obj55 = null;
        lista52.insere(obj55);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        lista60.insere((java.lang.Object) (-1.0d));
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista60.imprime();
        lista52.insere((java.lang.Object) lista60);
        java.lang.Class<?> wildcardClass68 = lista60.getClass();
        lista34.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista34);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '4');
        lista3.insere((java.lang.Object) '#');
        boolean boolean12 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        lista14.imprime();
        lista14.insere((java.lang.Object) "");
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista14.insere((java.lang.Object) lista23);
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        lista27.imprime();
        lista27.insere((java.lang.Object) "");
        lista27.insere((java.lang.Object) (short) -1);
        lista14.insere((java.lang.Object) lista27);
        lista3.insere((java.lang.Object) lista27);
        boolean boolean37 = lista27.vazia();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.insere((java.lang.Object) (-1.0d));
        boolean boolean17 = lista13.vazia();
        boolean boolean18 = lista13.vazia();
        lista13.insere((java.lang.Object) "");
        boolean boolean21 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean21);
        lista0.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean30 = lista24.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista24.insere((java.lang.Object) boolean36);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) 0.0d);
        ds.Lista lista41 = new ds.Lista();
        lista38.insere((java.lang.Object) lista41);
        boolean boolean43 = lista41.vazia();
        lista41.imprime();
        lista41.imprime();
        lista24.insere((java.lang.Object) lista41);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista50.imprime();
        lista50.imprime();
        lista50.insere((java.lang.Object) 10);
        lista50.imprime();
        lista24.insere((java.lang.Object) lista50);
        lista0.insere((java.lang.Object) lista24);
        lista24.imprime();
        boolean boolean60 = lista24.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista54.insere((java.lang.Object) 100L);
        boolean boolean60 = lista54.vazia();
        lista54.imprime();
        lista54.imprime();
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) 0.0d);
        lista63.insere((java.lang.Object) (short) 100);
        boolean boolean68 = lista63.vazia();
        lista63.imprime();
        lista54.insere((java.lang.Object) lista63);
        lista46.insere((java.lang.Object) lista54);
        lista0.insere((java.lang.Object) lista54);
        lista0.imprime();
        boolean boolean74 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        boolean boolean6 = lista3.vazia();
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.insere((java.lang.Object) '4');
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        java.lang.Class<?> wildcardClass37 = lista29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        boolean boolean18 = lista0.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) 0.0d);
        boolean boolean24 = lista19.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        lista25.insere((java.lang.Object) 10.0d);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        lista32.imprime();
        lista32.insere((java.lang.Object) "");
        lista32.imprime();
        lista25.insere((java.lang.Object) lista32);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 0.0d);
        boolean boolean46 = lista40.vazia();
        lista40.imprime();
        boolean boolean48 = lista40.vazia();
        lista25.insere((java.lang.Object) boolean48);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        lista53.insere((java.lang.Object) (-1.0d));
        lista53.imprime();
        lista53.insere((java.lang.Object) (byte) -1);
        lista53.imprime();
        boolean boolean61 = lista53.vazia();
        boolean boolean62 = lista53.vazia();
        lista25.insere((java.lang.Object) lista53);
        lista19.insere((java.lang.Object) lista25);
        boolean boolean65 = lista19.vazia();
        lista0.insere((java.lang.Object) lista19);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        boolean boolean41 = lista25.vazia();
        boolean boolean42 = lista25.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        lista43.insere((java.lang.Object) 0.0d);
        lista43.imprime();
        java.lang.Class<?> wildcardClass49 = lista43.getClass();
        lista25.insere((java.lang.Object) lista43);
        boolean boolean51 = lista25.vazia();
        java.lang.Class<?> wildcardClass52 = lista25.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        boolean boolean21 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista19.insere((java.lang.Object) 10.0d);
        lista19.imprime();
        boolean boolean27 = lista19.vazia();
        boolean boolean28 = lista19.vazia();
        lista3.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        lista5.insere((java.lang.Object) '4');
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) "");
        lista11.imprime();
        lista11.insere((java.lang.Object) 100L);
        boolean boolean17 = lista11.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        lista11.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) 0.0d);
        ds.Lista lista28 = new ds.Lista();
        lista25.insere((java.lang.Object) lista28);
        boolean boolean30 = lista28.vazia();
        lista28.imprime();
        lista28.imprime();
        lista11.insere((java.lang.Object) lista28);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        boolean boolean39 = lista37.vazia();
        lista37.imprime();
        lista37.imprime();
        ds.Lista lista42 = new ds.Lista();
        lista42.insere((java.lang.Object) 0.0d);
        ds.Lista lista45 = new ds.Lista();
        lista42.insere((java.lang.Object) lista45);
        lista45.insere((java.lang.Object) (-1.0d));
        lista45.imprime();
        boolean boolean50 = lista45.vazia();
        lista37.insere((java.lang.Object) lista45);
        lista37.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        lista53.insere((java.lang.Object) 10.0d);
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        lista60.imprime();
        lista60.insere((java.lang.Object) "");
        lista60.imprime();
        lista53.insere((java.lang.Object) lista60);
        ds.Lista lista68 = new ds.Lista();
        lista68.insere((java.lang.Object) "");
        lista68.imprime();
        lista68.insere((java.lang.Object) 0.0d);
        boolean boolean74 = lista68.vazia();
        lista68.imprime();
        boolean boolean76 = lista68.vazia();
        lista53.insere((java.lang.Object) boolean76);
        ds.Lista lista78 = new ds.Lista();
        lista78.insere((java.lang.Object) "");
        lista78.imprime();
        lista78.insere((java.lang.Object) 100L);
        boolean boolean84 = lista78.vazia();
        ds.Lista lista85 = new ds.Lista();
        lista85.insere((java.lang.Object) 0.0d);
        ds.Lista lista88 = new ds.Lista();
        lista85.insere((java.lang.Object) lista88);
        boolean boolean90 = lista88.vazia();
        lista78.insere((java.lang.Object) boolean90);
        lista78.imprime();
        lista53.insere((java.lang.Object) lista78);
        lista78.imprime();
        lista37.insere((java.lang.Object) lista78);
        lista11.insere((java.lang.Object) lista78);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        java.lang.Object obj17 = null;
        lista0.insere(obj17);
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        lista11.insere((java.lang.Object) 100);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = lista18.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        lista23.insere((java.lang.Object) 0.0d);
        lista23.imprime();
        java.lang.Class<?> wildcardClass29 = lista23.getClass();
        lista11.insere((java.lang.Object) lista23);
        lista3.insere((java.lang.Object) lista11);
        lista3.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) "");
        lista33.imprime();
        lista33.insere((java.lang.Object) 100L);
        boolean boolean39 = lista33.vazia();
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        ds.Lista lista43 = new ds.Lista();
        lista40.insere((java.lang.Object) lista43);
        boolean boolean45 = lista43.vazia();
        lista33.insere((java.lang.Object) boolean45);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista50.imprime();
        lista50.imprime();
        lista33.insere((java.lang.Object) lista50);
        ds.Lista lista56 = new ds.Lista();
        lista56.insere((java.lang.Object) 0.0d);
        ds.Lista lista59 = new ds.Lista();
        lista56.insere((java.lang.Object) lista59);
        lista59.imprime();
        lista59.imprime();
        lista59.insere((java.lang.Object) 10);
        lista59.imprime();
        lista33.insere((java.lang.Object) lista59);
        lista33.imprime();
        lista3.insere((java.lang.Object) lista33);
        lista3.imprime();
        ds.Lista lista70 = new ds.Lista();
        lista70.insere((java.lang.Object) "");
        lista70.insere((java.lang.Object) false);
        lista70.imprime();
        lista3.insere((java.lang.Object) lista70);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.insere((java.lang.Object) (short) -1);
        lista0.insere((java.lang.Object) lista13);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass25 = lista22.getClass();
        lista0.insere((java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        boolean boolean18 = lista16.vazia();
        lista16.insere((java.lang.Object) 10);
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        lista21.imprime();
        lista16.insere((java.lang.Object) lista21);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 0.0d);
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        lista21.insere((java.lang.Object) lista25);
        lista3.insere((java.lang.Object) lista21);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) "");
        lista35.imprime();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean41 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.insere((java.lang.Object) (-1.0d));
        lista46.imprime();
        lista46.insere((java.lang.Object) (byte) -1);
        boolean boolean53 = lista46.vazia();
        lista35.insere((java.lang.Object) boolean53);
        boolean boolean55 = lista35.vazia();
        boolean boolean56 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) "");
        lista58.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) 0.0d);
        ds.Lista lista65 = new ds.Lista();
        lista62.insere((java.lang.Object) lista65);
        java.lang.Class<?> wildcardClass67 = lista65.getClass();
        lista58.insere((java.lang.Object) lista65);
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.imprime();
        lista72.imprime();
        lista72.insere((java.lang.Object) 10);
        boolean boolean78 = lista72.vazia();
        lista65.insere((java.lang.Object) lista72);
        lista35.insere((java.lang.Object) lista72);
        lista21.insere((java.lang.Object) lista72);
        lista21.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.insere((java.lang.Object) (short) 100);
        boolean boolean12 = lista7.vazia();
        lista3.insere((java.lang.Object) lista7);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = new java.lang.Object();
        lista17.insere(obj21);
        lista3.insere(obj21);
        java.lang.Class<?> wildcardClass24 = obj21.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista35.insere((java.lang.Object) 10.0d);
        lista35.imprime();
        lista35.imprime();
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) 0.0d);
        ds.Lista lista49 = new ds.Lista();
        lista46.insere((java.lang.Object) lista49);
        boolean boolean51 = lista49.vazia();
        lista49.insere((java.lang.Object) 10);
        ds.Lista lista54 = new ds.Lista();
        lista54.imprime();
        lista54.imprime();
        lista49.insere((java.lang.Object) lista54);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        lista61.insere((java.lang.Object) (-1.0d));
        boolean boolean65 = lista61.vazia();
        lista61.insere((java.lang.Object) 100);
        lista54.insere((java.lang.Object) lista61);
        lista0.insere((java.lang.Object) lista54);
        boolean boolean70 = lista54.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.insere((java.lang.Object) (-1.0d));
        boolean boolean17 = lista13.vazia();
        boolean boolean18 = lista13.vazia();
        lista13.insere((java.lang.Object) "");
        boolean boolean21 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean21);
        boolean boolean23 = lista0.vazia();
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        lista24.insere((java.lang.Object) 100L);
        boolean boolean30 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.insere((java.lang.Object) (-1.0d));
        lista35.imprime();
        lista35.insere((java.lang.Object) (byte) -1);
        lista35.imprime();
        lista24.insere((java.lang.Object) lista35);
        boolean boolean44 = lista24.vazia();
        ds.Lista lista45 = new ds.Lista();
        lista45.insere((java.lang.Object) 0.0d);
        ds.Lista lista48 = new ds.Lista();
        lista45.insere((java.lang.Object) lista48);
        boolean boolean50 = lista48.vazia();
        lista48.insere((java.lang.Object) 10);
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        lista53.imprime();
        lista48.insere((java.lang.Object) lista53);
        boolean boolean57 = lista53.vazia();
        lista24.insere((java.lang.Object) lista53);
        boolean boolean59 = lista24.vazia();
        lista0.insere((java.lang.Object) boolean59);
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean19 = lista3.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.insere((java.lang.Object) (-1.0d));
        lista23.imprime();
        lista23.insere((java.lang.Object) (byte) -1);
        lista23.imprime();
        lista3.insere((java.lang.Object) lista23);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        boolean boolean20 = lista3.vazia();
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        boolean boolean19 = lista17.vazia();
        lista17.imprime();
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) "");
        lista23.imprime();
        lista23.insere((java.lang.Object) 100L);
        boolean boolean29 = lista23.vazia();
        lista23.imprime();
        lista23.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        lista32.insere((java.lang.Object) (short) 100);
        boolean boolean37 = lista32.vazia();
        lista32.imprime();
        lista23.insere((java.lang.Object) lista32);
        lista17.insere((java.lang.Object) lista23);
        java.lang.Class<?> wildcardClass41 = lista17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista15.insere((java.lang.Object) 10.0d);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        lista22.imprime();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista30.vazia();
        lista30.imprime();
        boolean boolean38 = lista30.vazia();
        lista15.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 100L);
        boolean boolean46 = lista40.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista40.insere((java.lang.Object) boolean52);
        lista40.imprime();
        lista15.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista3.insere((java.lang.Object) lista40);
        boolean boolean58 = lista3.vazia();
        java.lang.Class<?> wildcardClass59 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        lista29.insere((java.lang.Object) 10.0d);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        lista36.imprime();
        lista36.insere((java.lang.Object) "");
        lista36.imprime();
        lista29.insere((java.lang.Object) lista36);
        lista8.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) "");
        lista46.imprime();
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean52 = lista46.vazia();
        lista46.insere((java.lang.Object) 0.0d);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        lista58.insere((java.lang.Object) (-1.0d));
        lista58.imprime();
        lista58.insere((java.lang.Object) (byte) -1);
        boolean boolean65 = lista58.vazia();
        boolean boolean66 = lista58.vazia();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) 0.0d);
        ds.Lista lista70 = new ds.Lista();
        lista67.insere((java.lang.Object) lista70);
        lista70.insere((java.lang.Object) (-1.0d));
        boolean boolean74 = lista70.vazia();
        lista70.insere((java.lang.Object) 100);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass80 = lista77.getClass();
        lista70.insere((java.lang.Object) wildcardClass80);
        lista58.insere((java.lang.Object) lista70);
        lista46.insere((java.lang.Object) lista58);
        lista36.insere((java.lang.Object) lista46);
        lista36.imprime();
        java.lang.Class<?> wildcardClass86 = lista36.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean18 = lista11.vazia();
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Class<?> wildcardClass21 = lista19.getClass();
        lista11.insere((java.lang.Object) wildcardClass21);
        boolean boolean23 = lista11.vazia();
        java.lang.Class<?> wildcardClass24 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        lista11.insere((java.lang.Object) 10);
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        lista16.imprime();
        lista11.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) "");
        lista20.imprime();
        lista20.insere((java.lang.Object) 0.0d);
        boolean boolean26 = lista20.vazia();
        lista20.imprime();
        lista16.insere((java.lang.Object) lista20);
        boolean boolean29 = lista16.vazia();
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.imprime();
        lista46.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        lista50.insere((java.lang.Object) (short) 100);
        boolean boolean55 = lista50.vazia();
        lista46.insere((java.lang.Object) lista50);
        boolean boolean57 = lista46.vazia();
        lista34.insere((java.lang.Object) lista46);
        lista0.insere((java.lang.Object) lista34);
        boolean boolean60 = lista34.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista11.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass26 = lista11.getClass();
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass28 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista11.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 100L);
        boolean boolean27 = lista21.vazia();
        boolean boolean28 = lista21.vazia();
        lista21.imprime();
        lista21.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        boolean boolean38 = lista34.vazia();
        boolean boolean39 = lista34.vazia();
        lista34.insere((java.lang.Object) "");
        boolean boolean42 = lista34.vazia();
        lista21.insere((java.lang.Object) boolean42);
        boolean boolean44 = lista21.vazia();
        lista11.insere((java.lang.Object) lista21);
        java.lang.Class<?> wildcardClass46 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        lista9.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        lista29.imprime();
        java.lang.Object obj32 = null;
        lista29.insere(obj32);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.insere((java.lang.Object) (-1.0d));
        lista37.imprime();
        boolean boolean42 = lista37.vazia();
        lista37.imprime();
        lista29.insere((java.lang.Object) lista37);
        java.lang.Class<?> wildcardClass45 = lista37.getClass();
        lista9.insere((java.lang.Object) lista37);
        lista9.imprime();
        lista9.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 0.0d);
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) -1);
        boolean boolean26 = lista19.vazia();
        boolean boolean27 = lista19.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        boolean boolean35 = lista31.vazia();
        lista31.insere((java.lang.Object) 100);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass41 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass41);
        lista19.insere((java.lang.Object) lista31);
        lista7.insere((java.lang.Object) lista19);
        lista3.insere((java.lang.Object) lista7);
        lista7.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista50.insere((java.lang.Object) (-1.0d));
        lista50.imprime();
        boolean boolean55 = lista50.vazia();
        lista50.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        boolean boolean62 = lista60.vazia();
        boolean boolean63 = lista60.vazia();
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista50.insere((java.lang.Object) lista60);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) 0.0d);
        ds.Lista lista70 = new ds.Lista();
        lista67.insere((java.lang.Object) lista70);
        lista70.insere((java.lang.Object) (-1.0d));
        boolean boolean74 = lista70.vazia();
        lista60.insere((java.lang.Object) lista70);
        lista60.imprime();
        lista60.imprime();
        lista7.insere((java.lang.Object) lista60);
        boolean boolean79 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista9.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) 0.0d);
        ds.Lista lista17 = new ds.Lista();
        lista14.insere((java.lang.Object) lista17);
        lista17.insere((java.lang.Object) (-1.0d));
        lista17.imprime();
        boolean boolean22 = lista17.vazia();
        lista9.insere((java.lang.Object) lista17);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista9.insere((java.lang.Object) lista27);
        lista9.insere((java.lang.Object) (byte) 10);
        boolean boolean33 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean33);
        boolean boolean35 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista15.insere((java.lang.Object) 10.0d);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        lista22.imprime();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista30.vazia();
        lista30.imprime();
        boolean boolean38 = lista30.vazia();
        lista15.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 100L);
        boolean boolean46 = lista40.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista40.insere((java.lang.Object) boolean52);
        lista40.imprime();
        lista15.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista3.insere((java.lang.Object) lista40);
        lista3.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        boolean boolean27 = lista22.vazia();
        lista12.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 100L);
        boolean boolean36 = lista30.vazia();
        boolean boolean37 = lista30.vazia();
        lista0.insere((java.lang.Object) boolean37);
        lista0.imprime();
        boolean boolean40 = lista0.vazia();
        java.lang.Class<?> wildcardClass41 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        boolean boolean24 = lista0.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        boolean boolean44 = lista42.vazia();
        lista42.imprime();
        lista42.imprime();
        lista25.insere((java.lang.Object) lista42);
        lista42.imprime();
        lista0.insere((java.lang.Object) lista42);
        boolean boolean50 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.insere((java.lang.Object) false);
        lista8.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.insere((java.lang.Object) '4');
        lista8.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        boolean boolean20 = lista0.vazia();
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        java.lang.Class<?> wildcardClass16 = lista14.getClass();
        lista7.insere((java.lang.Object) lista14);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        lista21.insere((java.lang.Object) 10);
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        lista26.imprime();
        lista21.insere((java.lang.Object) lista26);
        lista7.insere((java.lang.Object) lista21);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        boolean boolean34 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        lista36.insere((java.lang.Object) '4');
        lista36.imprime();
        lista31.insere((java.lang.Object) lista36);
        lista7.insere((java.lang.Object) lista36);
        lista36.imprime();
        lista36.imprime();
        lista0.insere((java.lang.Object) lista36);
        java.lang.Class<?> wildcardClass46 = lista36.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.insere((java.lang.Object) false);
        lista8.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.insere((java.lang.Object) '4');
        lista8.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        boolean boolean20 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista35.insere((java.lang.Object) 10.0d);
        lista35.imprime();
        lista35.imprime();
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        lista0.imprime();
        java.lang.Class<?> wildcardClass47 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        lista8.insere((java.lang.Object) 100L);
        boolean boolean14 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) (short) 100);
        boolean boolean22 = lista17.vazia();
        lista17.imprime();
        lista8.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista8);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        boolean boolean29 = lista24.vazia();
        lista12.insere((java.lang.Object) boolean29);
        lista12.imprime();
        java.lang.Class<?> wildcardClass32 = lista12.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        lista29.insere((java.lang.Object) 10.0d);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        lista36.imprime();
        lista36.insere((java.lang.Object) "");
        lista36.imprime();
        lista29.insere((java.lang.Object) lista36);
        lista8.insere((java.lang.Object) lista36);
        lista36.imprime();
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) "");
        lista46.imprime();
        lista46.insere((java.lang.Object) 0.0d);
        boolean boolean52 = lista46.vazia();
        lista46.insere((java.lang.Object) 0.0d);
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) 0.0d);
        ds.Lista lista58 = new ds.Lista();
        lista55.insere((java.lang.Object) lista58);
        lista58.insere((java.lang.Object) (-1.0d));
        lista58.imprime();
        lista58.insere((java.lang.Object) (byte) -1);
        boolean boolean65 = lista58.vazia();
        boolean boolean66 = lista58.vazia();
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) 0.0d);
        ds.Lista lista70 = new ds.Lista();
        lista67.insere((java.lang.Object) lista70);
        lista70.insere((java.lang.Object) (-1.0d));
        boolean boolean74 = lista70.vazia();
        lista70.insere((java.lang.Object) 100);
        ds.Lista lista77 = new ds.Lista();
        lista77.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass80 = lista77.getClass();
        lista70.insere((java.lang.Object) wildcardClass80);
        lista58.insere((java.lang.Object) lista70);
        lista46.insere((java.lang.Object) lista58);
        lista36.insere((java.lang.Object) lista46);
        lista36.imprime();
        boolean boolean86 = lista36.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        boolean boolean19 = lista3.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista3.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.imprime();
        lista23.imprime();
        lista23.insere((java.lang.Object) 10);
        boolean boolean29 = lista23.vazia();
        lista16.insere((java.lang.Object) lista23);
        java.lang.Class<?> wildcardClass31 = lista16.getClass();
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean46 = lista10.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista47.insere((java.lang.Object) 10.0d);
        lista47.imprime();
        lista47.imprime();
        lista47.imprime();
        lista10.insere((java.lang.Object) lista47);
        ds.Lista lista58 = new ds.Lista();
        lista58.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        boolean boolean63 = lista60.vazia();
        lista60.imprime();
        java.lang.Class<?> wildcardClass65 = lista60.getClass();
        lista58.insere((java.lang.Object) lista60);
        ds.Lista lista67 = new ds.Lista();
        lista67.insere((java.lang.Object) "");
        lista67.imprime();
        lista67.insere((java.lang.Object) 0.0d);
        lista58.insere((java.lang.Object) lista67);
        java.lang.Class<?> wildcardClass74 = lista58.getClass();
        lista47.insere((java.lang.Object) wildcardClass74);
        lista47.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) "");
        lista26.imprime();
        lista26.insere((java.lang.Object) 100L);
        lista26.imprime();
        lista9.insere((java.lang.Object) lista26);
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) 0.0d);
        ds.Lista lista38 = new ds.Lista();
        lista35.insere((java.lang.Object) lista38);
        lista38.imprime();
        java.lang.Object obj41 = null;
        lista38.insere(obj41);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.insere((java.lang.Object) (-1.0d));
        lista46.imprime();
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        lista38.insere((java.lang.Object) lista46);
        lista0.insere((java.lang.Object) lista38);
        boolean boolean55 = lista0.vazia();
        boolean boolean56 = lista0.vazia();
        java.lang.Class<?> wildcardClass57 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        lista3.imprime();
        boolean boolean11 = lista3.vazia();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        lista15.imprime();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        lista19.insere((java.lang.Object) (short) 100);
        boolean boolean24 = lista19.vazia();
        lista15.insere((java.lang.Object) lista19);
        boolean boolean26 = lista15.vazia();
        lista3.insere((java.lang.Object) lista15);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        lista31.imprime();
        lista31.insere((java.lang.Object) (byte) -1);
        boolean boolean38 = lista31.vazia();
        lista15.insere((java.lang.Object) boolean38);
        lista15.imprime();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 100L);
        lista7.imprime();
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        lista32.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj36 = new java.lang.Object();
        lista32.insere(obj36);
        lista32.imprime();
        boolean boolean39 = lista32.vazia();
        lista32.imprime();
        lista32.imprime();
        boolean boolean42 = lista32.vazia();
        lista22.insere((java.lang.Object) boolean42);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        lista20.imprime();
        lista20.insere((java.lang.Object) "");
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        lista29.imprime();
        lista20.insere((java.lang.Object) lista29);
        lista11.insere((java.lang.Object) lista20);
        lista11.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 0.0d);
        ds.Lista lista6 = new ds.Lista();
        lista3.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.insere((java.lang.Object) '4');
        lista6.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) "");
        lista14.imprime();
        lista14.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        lista14.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        lista0.imprime();
        boolean boolean31 = lista0.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.insere((java.lang.Object) (-1.0d));
        lista35.imprime();
        boolean boolean40 = lista35.vazia();
        lista35.imprime();
        boolean boolean42 = lista35.vazia();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.insere((java.lang.Object) (-1.0d));
        lista46.imprime();
        boolean boolean51 = lista46.vazia();
        lista46.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        boolean boolean58 = lista56.vazia();
        boolean boolean59 = lista56.vazia();
        lista56.imprime();
        boolean boolean61 = lista56.vazia();
        lista46.insere((java.lang.Object) lista56);
        ds.Lista lista63 = new ds.Lista();
        lista63.insere((java.lang.Object) 0.0d);
        ds.Lista lista66 = new ds.Lista();
        lista63.insere((java.lang.Object) lista66);
        lista66.insere((java.lang.Object) (-1.0d));
        boolean boolean70 = lista66.vazia();
        lista56.insere((java.lang.Object) lista66);
        lista35.insere((java.lang.Object) lista66);
        boolean boolean73 = lista35.vazia();
        lista0.insere((java.lang.Object) boolean73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        java.lang.Object obj17 = null;
        lista0.insere(obj17);
        boolean boolean19 = lista0.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        lista23.insere((java.lang.Object) (-1.0d));
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) "");
        lista27.imprime();
        lista27.insere((java.lang.Object) 0.0d);
        boolean boolean33 = lista27.vazia();
        lista27.insere((java.lang.Object) 0.0d);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.insere((java.lang.Object) (-1.0d));
        lista39.imprime();
        lista39.insere((java.lang.Object) (byte) -1);
        boolean boolean46 = lista39.vazia();
        boolean boolean47 = lista39.vazia();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) 0.0d);
        ds.Lista lista51 = new ds.Lista();
        lista48.insere((java.lang.Object) lista51);
        lista51.insere((java.lang.Object) (-1.0d));
        boolean boolean55 = lista51.vazia();
        lista51.insere((java.lang.Object) 100);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass61 = lista58.getClass();
        lista51.insere((java.lang.Object) wildcardClass61);
        lista39.insere((java.lang.Object) lista51);
        lista27.insere((java.lang.Object) lista39);
        lista23.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        boolean boolean8 = lista3.vazia();
        lista3.insere((java.lang.Object) "");
        boolean boolean11 = lista3.vazia();
        boolean boolean12 = lista3.vazia();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        lista16.imprime();
        lista16.imprime();
        java.lang.Class<?> wildcardClass20 = lista16.getClass();
        lista3.insere((java.lang.Object) wildcardClass20);
        boolean boolean22 = lista3.vazia();
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        lista26.insere((java.lang.Object) (-1.0d));
        lista26.imprime();
        boolean boolean31 = lista26.vazia();
        lista26.imprime();
        lista26.imprime();
        lista26.imprime();
        lista26.imprime();
        boolean boolean36 = lista26.vazia();
        boolean boolean37 = lista26.vazia();
        lista3.insere((java.lang.Object) lista26);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) 0.0d);
        ds.Lista lista32 = new ds.Lista();
        lista29.insere((java.lang.Object) lista32);
        lista29.insere((java.lang.Object) 10.0d);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        lista36.imprime();
        lista36.insere((java.lang.Object) "");
        lista36.imprime();
        lista29.insere((java.lang.Object) lista36);
        lista8.insere((java.lang.Object) lista36);
        java.lang.Class<?> wildcardClass45 = lista36.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        boolean boolean25 = lista22.vazia();
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        lista8.insere((java.lang.Object) lista22);
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        lista29.insere((java.lang.Object) (short) 1);
        boolean boolean33 = lista29.vazia();
        java.lang.Class<?> wildcardClass34 = lista29.getClass();
        lista8.insere((java.lang.Object) wildcardClass34);
        lista8.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        lista8.insere((java.lang.Object) 100L);
        boolean boolean14 = lista8.vazia();
        lista8.imprime();
        lista8.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) (short) 100);
        boolean boolean22 = lista17.vazia();
        lista17.imprime();
        lista8.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista8);
        boolean boolean26 = lista0.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) "");
        lista27.insere((java.lang.Object) false);
        boolean boolean32 = lista27.vazia();
        lista0.insere((java.lang.Object) lista27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) "");
        lista26.imprime();
        lista26.insere((java.lang.Object) 100L);
        lista26.imprime();
        lista9.insere((java.lang.Object) lista26);
        lista0.insere((java.lang.Object) lista9);
        boolean boolean35 = lista9.vazia();
        boolean boolean36 = lista9.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) (short) -1);
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        boolean boolean26 = lista9.vazia();
        ds.Lista lista27 = new ds.Lista();
        lista27.insere((java.lang.Object) 0.0d);
        lista27.imprime();
        lista9.insere((java.lang.Object) lista27);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.imprime();
        lista35.imprime();
        lista27.insere((java.lang.Object) lista35);
        lista0.insere((java.lang.Object) lista35);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        lista41.insere((java.lang.Object) 0.0d);
        boolean boolean46 = lista41.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista47.insere((java.lang.Object) 10.0d);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) 0.0d);
        lista54.imprime();
        lista54.insere((java.lang.Object) "");
        lista54.imprime();
        lista47.insere((java.lang.Object) lista54);
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) "");
        lista62.imprime();
        lista62.insere((java.lang.Object) 0.0d);
        boolean boolean68 = lista62.vazia();
        lista62.imprime();
        boolean boolean70 = lista62.vazia();
        lista47.insere((java.lang.Object) boolean70);
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) 0.0d);
        ds.Lista lista75 = new ds.Lista();
        lista72.insere((java.lang.Object) lista75);
        lista75.insere((java.lang.Object) (-1.0d));
        lista75.imprime();
        lista75.insere((java.lang.Object) (byte) -1);
        lista75.imprime();
        boolean boolean83 = lista75.vazia();
        boolean boolean84 = lista75.vazia();
        lista47.insere((java.lang.Object) lista75);
        lista41.insere((java.lang.Object) lista47);
        boolean boolean87 = lista41.vazia();
        boolean boolean88 = lista41.vazia();
        lista0.insere((java.lang.Object) lista41);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean30 = lista24.vazia();
        lista24.imprime();
        boolean boolean32 = lista24.vazia();
        lista9.insere((java.lang.Object) boolean32);
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) "");
        lista34.imprime();
        lista34.insere((java.lang.Object) 100L);
        boolean boolean40 = lista34.vazia();
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        boolean boolean46 = lista44.vazia();
        lista34.insere((java.lang.Object) boolean46);
        lista34.imprime();
        lista9.insere((java.lang.Object) lista34);
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        boolean boolean52 = lista50.vazia();
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        ds.Lista lista58 = new ds.Lista();
        lista58.imprime();
        lista58.insere((java.lang.Object) '4');
        lista56.insere((java.lang.Object) '4');
        lista50.insere((java.lang.Object) '4');
        ds.Lista lista64 = new ds.Lista();
        lista64.insere((java.lang.Object) "");
        lista64.imprime();
        lista64.imprime();
        ds.Lista lista69 = new ds.Lista();
        lista69.insere((java.lang.Object) 0.0d);
        ds.Lista lista72 = new ds.Lista();
        lista69.insere((java.lang.Object) lista72);
        lista72.imprime();
        lista72.imprime();
        lista72.insere((java.lang.Object) 10);
        lista64.insere((java.lang.Object) lista72);
        lista50.insere((java.lang.Object) lista72);
        java.lang.Class<?> wildcardClass80 = lista50.getClass();
        lista9.insere((java.lang.Object) wildcardClass80);
        lista0.insere((java.lang.Object) lista9);
        boolean boolean83 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.imprime();
        lista3.insere((java.lang.Object) lista8);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) "");
        lista12.imprime();
        lista12.insere((java.lang.Object) 0.0d);
        boolean boolean18 = lista12.vazia();
        lista12.imprime();
        lista8.insere((java.lang.Object) lista12);
        boolean boolean21 = lista12.vazia();
        java.lang.Class<?> wildcardClass22 = lista12.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        boolean boolean23 = lista21.vazia();
        boolean boolean24 = lista21.vazia();
        lista21.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        lista26.insere((java.lang.Object) (short) 100);
        boolean boolean31 = lista26.vazia();
        boolean boolean32 = lista26.vazia();
        lista21.insere((java.lang.Object) lista26);
        lista13.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista13);
        java.lang.Class<?> wildcardClass36 = lista13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        ds.Lista lista20 = new ds.Lista();
        lista17.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass22 = lista20.getClass();
        lista13.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        boolean boolean29 = lista27.vazia();
        lista27.insere((java.lang.Object) 10);
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        lista27.insere((java.lang.Object) lista32);
        lista13.insere((java.lang.Object) lista27);
        lista0.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) (-1.0f));
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) 0.0d);
        lista40.insere((java.lang.Object) 0.0d);
        boolean boolean45 = lista40.vazia();
        lista40.imprime();
        lista40.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.insere((java.lang.Object) "");
        lista48.imprime();
        lista48.insere((java.lang.Object) 100L);
        boolean boolean54 = lista48.vazia();
        lista48.imprime();
        lista48.imprime();
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        lista57.insere((java.lang.Object) (short) 100);
        boolean boolean62 = lista57.vazia();
        lista57.imprime();
        lista48.insere((java.lang.Object) lista57);
        lista40.insere((java.lang.Object) lista48);
        lista0.insere((java.lang.Object) lista40);
        java.lang.Class<?> wildcardClass67 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        boolean boolean8 = lista3.vazia();
        java.lang.Class<?> wildcardClass9 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        lista15.insere((java.lang.Object) 0.0d);
        lista15.imprime();
        java.lang.Class<?> wildcardClass21 = lista15.getClass();
        lista3.insere((java.lang.Object) lista15);
        lista3.imprime();
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.insere((java.lang.Object) (short) 1);
        boolean boolean28 = lista24.vazia();
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        lista3.insere((java.lang.Object) lista24);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        lista10.insere((java.lang.Object) (-1.0d));
        lista10.imprime();
        boolean boolean15 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean15);
        boolean boolean17 = lista0.vazia();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        lista18.imprime();
        lista0.insere((java.lang.Object) lista18);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        lista28.insere((java.lang.Object) '4');
        lista26.insere((java.lang.Object) '4');
        boolean boolean33 = lista26.vazia();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) "");
        boolean boolean37 = lista34.vazia();
        lista26.insere((java.lang.Object) boolean37);
        lista18.insere((java.lang.Object) boolean37);
        lista18.imprime();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        boolean boolean25 = lista23.vazia();
        lista23.insere((java.lang.Object) 10);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        lista28.imprime();
        lista23.insere((java.lang.Object) lista28);
        lista9.insere((java.lang.Object) lista23);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.insere((java.lang.Object) '4');
        lista38.imprime();
        lista33.insere((java.lang.Object) lista38);
        lista9.insere((java.lang.Object) lista38);
        lista0.insere((java.lang.Object) lista38);
        lista38.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        lista16.imprime();
        lista16.insere((java.lang.Object) "");
        lista16.imprime();
        lista9.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass24 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) 0.0d);
        ds.Lista lista29 = new ds.Lista();
        lista26.insere((java.lang.Object) lista29);
        boolean boolean31 = lista29.vazia();
        boolean boolean32 = lista29.vazia();
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        boolean boolean35 = lista29.vazia();
        boolean boolean36 = lista29.vazia();
        ds.Lista lista37 = new ds.Lista();
        lista37.insere((java.lang.Object) 0.0d);
        ds.Lista lista40 = new ds.Lista();
        lista37.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista40.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        lista44.insere((java.lang.Object) (short) 100);
        boolean boolean49 = lista44.vazia();
        lista40.insere((java.lang.Object) lista44);
        boolean boolean51 = lista40.vazia();
        lista29.insere((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) (short) 100);
        lista0.insere((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass17 = lista15.getClass();
        lista8.insere((java.lang.Object) lista15);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        boolean boolean28 = lista22.vazia();
        lista15.insere((java.lang.Object) lista22);
        lista22.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.imprime();
        lista34.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        lista42.insere((java.lang.Object) (-1.0d));
        lista42.imprime();
        boolean boolean47 = lista42.vazia();
        lista34.insere((java.lang.Object) lista42);
        ds.Lista lista49 = new ds.Lista();
        lista49.insere((java.lang.Object) 0.0d);
        ds.Lista lista52 = new ds.Lista();
        lista49.insere((java.lang.Object) lista52);
        lista52.imprime();
        java.lang.Object obj55 = null;
        lista52.insere(obj55);
        ds.Lista lista57 = new ds.Lista();
        lista57.insere((java.lang.Object) 0.0d);
        ds.Lista lista60 = new ds.Lista();
        lista57.insere((java.lang.Object) lista60);
        lista60.insere((java.lang.Object) (-1.0d));
        lista60.imprime();
        boolean boolean65 = lista60.vazia();
        lista60.imprime();
        lista52.insere((java.lang.Object) lista60);
        java.lang.Class<?> wildcardClass68 = lista60.getClass();
        lista34.insere((java.lang.Object) lista60);
        lista22.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista34);
        boolean boolean72 = lista0.vazia();
        boolean boolean73 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) 0.0d);
        ds.Lista lista23 = new ds.Lista();
        lista20.insere((java.lang.Object) lista23);
        boolean boolean25 = lista23.vazia();
        lista23.insere((java.lang.Object) 10);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        lista28.imprime();
        lista23.insere((java.lang.Object) lista28);
        lista9.insere((java.lang.Object) lista23);
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        lista38.insere((java.lang.Object) '4');
        lista38.imprime();
        lista33.insere((java.lang.Object) lista38);
        lista9.insere((java.lang.Object) lista38);
        lista0.insere((java.lang.Object) lista38);
        boolean boolean46 = lista0.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista50.insere((java.lang.Object) (-1.0d));
        lista50.imprime();
        lista50.insere((java.lang.Object) (byte) -1);
        lista50.imprime();
        boolean boolean58 = lista50.vazia();
        java.lang.Object obj59 = null;
        lista50.insere(obj59);
        lista0.insere((java.lang.Object) lista50);
        boolean boolean62 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        lista9.imprime();
        boolean boolean26 = lista9.vazia();
        java.lang.Class<?> wildcardClass27 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        boolean boolean13 = lista11.vazia();
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista11.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass26 = lista11.getClass();
        lista3.insere((java.lang.Object) lista11);
        java.lang.Class<?> wildcardClass28 = lista11.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        boolean boolean43 = lista41.vazia();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        lista49.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        lista41.insere((java.lang.Object) '4');
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        lista63.imprime();
        lista63.imprime();
        lista63.insere((java.lang.Object) 10);
        lista55.insere((java.lang.Object) lista63);
        lista41.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass71 = lista41.getClass();
        lista0.insere((java.lang.Object) wildcardClass71);
        lista0.imprime();
        boolean boolean74 = lista0.vazia();
        java.lang.Class<?> wildcardClass75 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista15.insere((java.lang.Object) 10.0d);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        lista22.imprime();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista30.vazia();
        lista30.imprime();
        boolean boolean38 = lista30.vazia();
        lista15.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 100L);
        boolean boolean46 = lista40.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista40.insere((java.lang.Object) boolean52);
        lista40.imprime();
        lista15.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista3.insere((java.lang.Object) lista40);
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        lista61.insere((java.lang.Object) (-1.0d));
        boolean boolean65 = lista61.vazia();
        boolean boolean66 = lista61.vazia();
        lista61.imprime();
        lista61.imprime();
        lista40.insere((java.lang.Object) lista61);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.imprime();
        lista3.insere((java.lang.Object) lista21);
        lista3.insere((java.lang.Object) (byte) 10);
        boolean boolean27 = lista3.vazia();
        java.lang.Class<?> wildcardClass28 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) "");
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        lista10.imprime();
        lista10.insere((java.lang.Object) 100L);
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        lista21.insere((java.lang.Object) (byte) -1);
        lista21.imprime();
        lista10.insere((java.lang.Object) lista21);
        boolean boolean30 = lista10.vazia();
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        boolean boolean36 = lista34.vazia();
        lista34.insere((java.lang.Object) 10);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.imprime();
        lista34.insere((java.lang.Object) lista39);
        boolean boolean43 = lista39.vazia();
        lista10.insere((java.lang.Object) lista39);
        lista0.insere((java.lang.Object) lista10);
        boolean boolean46 = lista10.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        lista47.insere((java.lang.Object) 10.0d);
        lista47.imprime();
        lista47.imprime();
        lista47.imprime();
        lista10.insere((java.lang.Object) lista47);
        lista47.imprime();
        boolean boolean59 = lista47.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 1);
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) "");
        lista4.imprime();
        lista4.insere((java.lang.Object) 100L);
        boolean boolean10 = lista4.vazia();
        lista4.imprime();
        lista4.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.insere((java.lang.Object) (short) 100);
        boolean boolean18 = lista13.vazia();
        lista13.imprime();
        lista4.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean26 = lista21.vazia();
        java.lang.Class<?> wildcardClass27 = lista21.getClass();
        lista13.insere((java.lang.Object) wildcardClass27);
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) "");
        lista29.imprime();
        lista29.insere((java.lang.Object) 100L);
        lista29.imprime();
        lista13.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista29);
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista2.vazia();
        lista2.imprime();
        java.lang.Class<?> wildcardClass7 = lista2.getClass();
        lista0.insere((java.lang.Object) lista2);
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista12.insere((java.lang.Object) (-1.0d));
        lista12.imprime();
        boolean boolean17 = lista12.vazia();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista12.imprime();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.imprime();
        java.lang.Object obj30 = null;
        lista27.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        lista35.insere((java.lang.Object) (-1.0d));
        lista35.imprime();
        boolean boolean40 = lista35.vazia();
        lista35.imprime();
        lista27.insere((java.lang.Object) lista35);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        lista46.imprime();
        java.lang.Object obj49 = null;
        lista46.insere(obj49);
        lista35.insere(obj49);
        ds.Lista lista52 = new ds.Lista();
        lista52.insere((java.lang.Object) 0.0d);
        lista52.imprime();
        lista52.insere((java.lang.Object) "");
        ds.Lista lista58 = new ds.Lista();
        lista58.insere((java.lang.Object) 0.0d);
        ds.Lista lista61 = new ds.Lista();
        lista58.insere((java.lang.Object) lista61);
        lista61.imprime();
        lista52.insere((java.lang.Object) lista61);
        lista35.insere((java.lang.Object) lista61);
        ds.Lista lista66 = new ds.Lista();
        lista66.insere((java.lang.Object) 0.0d);
        ds.Lista lista69 = new ds.Lista();
        lista66.insere((java.lang.Object) lista69);
        lista69.insere((java.lang.Object) (-1.0d));
        lista69.imprime();
        boolean boolean74 = lista69.vazia();
        lista69.imprime();
        lista69.imprime();
        lista69.imprime();
        lista69.imprime();
        boolean boolean79 = lista69.vazia();
        lista35.insere((java.lang.Object) boolean79);
        lista35.insere((java.lang.Object) (byte) 10);
        lista0.insere((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista10 = new ds.Lista();
        lista7.insere((java.lang.Object) lista10);
        boolean boolean12 = lista10.vazia();
        lista0.insere((java.lang.Object) boolean12);
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista7.insere((java.lang.Object) 0.0d);
        boolean boolean13 = lista7.vazia();
        lista7.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        lista19.insere((java.lang.Object) (byte) -1);
        boolean boolean26 = lista19.vazia();
        boolean boolean27 = lista19.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        lista31.insere((java.lang.Object) (-1.0d));
        boolean boolean35 = lista31.vazia();
        lista31.insere((java.lang.Object) 100);
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass41 = lista38.getClass();
        lista31.insere((java.lang.Object) wildcardClass41);
        lista19.insere((java.lang.Object) lista31);
        lista7.insere((java.lang.Object) lista19);
        lista3.insere((java.lang.Object) lista7);
        ds.Lista lista46 = new ds.Lista();
        lista46.imprime();
        boolean boolean48 = lista46.vazia();
        lista46.imprime();
        lista3.insere((java.lang.Object) lista46);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        lista11.insere((java.lang.Object) (byte) -1);
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) 0.0d);
        ds.Lista lista24 = new ds.Lista();
        lista21.insere((java.lang.Object) lista24);
        boolean boolean26 = lista24.vazia();
        lista24.insere((java.lang.Object) 10);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        boolean boolean33 = lista29.vazia();
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) "");
        lista35.imprime();
        lista35.insere((java.lang.Object) 100L);
        boolean boolean41 = lista35.vazia();
        boolean boolean42 = lista35.vazia();
        lista35.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        lista44.insere((java.lang.Object) 10.0d);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) 0.0d);
        lista51.imprime();
        lista51.insere((java.lang.Object) "");
        lista51.imprime();
        lista44.insere((java.lang.Object) lista51);
        java.lang.Class<?> wildcardClass59 = lista44.getClass();
        lista35.insere((java.lang.Object) wildcardClass59);
        lista35.imprime();
        lista0.insere((java.lang.Object) lista35);
        java.lang.Class<?> wildcardClass63 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        lista3.imprime();
        java.lang.Class<?> wildcardClass12 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) "");
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass33 = lista31.getClass();
        lista24.insere((java.lang.Object) lista31);
        java.lang.Class<?> wildcardClass35 = lista31.getClass();
        lista0.insere((java.lang.Object) lista31);
        boolean boolean37 = lista0.vazia();
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.insere((java.lang.Object) 100);
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) "");
        java.lang.Class<?> wildcardClass13 = lista10.getClass();
        lista3.insere((java.lang.Object) wildcardClass13);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista15.insere((java.lang.Object) 10.0d);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        lista22.imprime();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista30.vazia();
        lista30.imprime();
        boolean boolean38 = lista30.vazia();
        lista15.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 100L);
        boolean boolean46 = lista40.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista40.insere((java.lang.Object) boolean52);
        lista40.imprime();
        lista15.insere((java.lang.Object) lista40);
        lista40.imprime();
        lista3.insere((java.lang.Object) lista40);
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        lista60.insere((java.lang.Object) 0.0d);
        lista60.imprime();
        java.lang.Class<?> wildcardClass66 = lista60.getClass();
        lista58.insere((java.lang.Object) wildcardClass66);
        lista3.insere((java.lang.Object) lista58);
        boolean boolean69 = lista3.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        lista15.insere((java.lang.Object) (short) 100);
        boolean boolean20 = lista15.vazia();
        lista11.insere((java.lang.Object) lista15);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        ds.Lista lista25 = new ds.Lista();
        lista22.insere((java.lang.Object) lista25);
        lista25.insere((java.lang.Object) (-1.0d));
        java.lang.Object obj29 = new java.lang.Object();
        lista25.insere(obj29);
        lista11.insere(obj29);
        lista11.imprime();
        ds.Lista lista33 = new ds.Lista();
        lista33.insere((java.lang.Object) "");
        lista33.insere((java.lang.Object) false);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        lista39.insere((java.lang.Object) '4');
        lista33.insere((java.lang.Object) '4');
        lista33.imprime();
        lista33.imprime();
        lista11.insere((java.lang.Object) lista33);
        lista0.insere((java.lang.Object) lista33);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        boolean boolean7 = lista3.vazia();
        lista3.imprime();
        boolean boolean9 = lista3.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        lista10.insere((java.lang.Object) 0.0d);
        boolean boolean15 = lista10.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista16.insere((java.lang.Object) 10.0d);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        lista23.imprime();
        lista23.insere((java.lang.Object) "");
        lista23.imprime();
        lista16.insere((java.lang.Object) lista23);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) "");
        lista31.imprime();
        lista31.insere((java.lang.Object) 0.0d);
        boolean boolean37 = lista31.vazia();
        lista31.imprime();
        boolean boolean39 = lista31.vazia();
        lista16.insere((java.lang.Object) boolean39);
        ds.Lista lista41 = new ds.Lista();
        lista41.insere((java.lang.Object) 0.0d);
        ds.Lista lista44 = new ds.Lista();
        lista41.insere((java.lang.Object) lista44);
        lista44.insere((java.lang.Object) (-1.0d));
        lista44.imprime();
        lista44.insere((java.lang.Object) (byte) -1);
        lista44.imprime();
        boolean boolean52 = lista44.vazia();
        boolean boolean53 = lista44.vazia();
        lista16.insere((java.lang.Object) lista44);
        lista10.insere((java.lang.Object) lista16);
        boolean boolean56 = lista10.vazia();
        lista3.insere((java.lang.Object) lista10);
        boolean boolean58 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) 0.0d);
        ds.Lista lista6 = new ds.Lista();
        lista3.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        lista8.insere((java.lang.Object) '4');
        lista6.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) "");
        lista14.imprime();
        lista14.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        lista22.imprime();
        lista22.imprime();
        lista22.insere((java.lang.Object) 10);
        lista14.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        lista30.imprime();
        lista30.insere((java.lang.Object) "");
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista39.imprime();
        lista30.insere((java.lang.Object) lista39);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) "");
        lista43.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        java.lang.Class<?> wildcardClass52 = lista50.getClass();
        lista43.insere((java.lang.Object) lista50);
        ds.Lista lista54 = new ds.Lista();
        lista54.insere((java.lang.Object) 0.0d);
        ds.Lista lista57 = new ds.Lista();
        lista54.insere((java.lang.Object) lista57);
        boolean boolean59 = lista57.vazia();
        lista57.insere((java.lang.Object) 10);
        ds.Lista lista62 = new ds.Lista();
        lista62.imprime();
        lista62.imprime();
        lista57.insere((java.lang.Object) lista62);
        lista43.insere((java.lang.Object) lista57);
        lista30.insere((java.lang.Object) lista43);
        lista43.imprime();
        lista0.insere((java.lang.Object) lista43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        boolean boolean8 = lista3.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        ds.Lista lista12 = new ds.Lista();
        lista9.insere((java.lang.Object) lista12);
        lista9.insere((java.lang.Object) 10.0d);
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) 0.0d);
        ds.Lista lista19 = new ds.Lista();
        lista16.insere((java.lang.Object) lista19);
        lista19.insere((java.lang.Object) (-1.0d));
        lista19.imprime();
        boolean boolean24 = lista19.vazia();
        lista9.insere((java.lang.Object) boolean24);
        ds.Lista lista26 = new ds.Lista();
        lista26.insere((java.lang.Object) "");
        lista26.imprime();
        lista26.insere((java.lang.Object) 100L);
        boolean boolean32 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.insere((java.lang.Object) 0.0d);
        ds.Lista lista37 = new ds.Lista();
        lista34.insere((java.lang.Object) lista37);
        lista37.insere((java.lang.Object) (-1.0d));
        lista37.imprime();
        lista37.insere((java.lang.Object) (byte) -1);
        boolean boolean44 = lista37.vazia();
        lista26.insere((java.lang.Object) boolean44);
        lista9.insere((java.lang.Object) lista26);
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        lista47.imprime();
        lista47.insere((java.lang.Object) "");
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        lista56.imprime();
        lista47.insere((java.lang.Object) lista56);
        lista26.insere((java.lang.Object) lista56);
        java.lang.Class<?> wildcardClass61 = lista56.getClass();
        lista3.insere((java.lang.Object) wildcardClass61);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        boolean boolean24 = lista0.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) 0.0d);
        ds.Lista lista42 = new ds.Lista();
        lista39.insere((java.lang.Object) lista42);
        boolean boolean44 = lista42.vazia();
        lista42.imprime();
        lista42.imprime();
        lista25.insere((java.lang.Object) lista42);
        lista42.imprime();
        lista0.insere((java.lang.Object) lista42);
        ds.Lista lista50 = new ds.Lista();
        lista50.insere((java.lang.Object) 0.0d);
        ds.Lista lista53 = new ds.Lista();
        lista50.insere((java.lang.Object) lista53);
        boolean boolean55 = lista53.vazia();
        lista42.insere((java.lang.Object) lista53);
        boolean boolean57 = lista53.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        boolean boolean11 = lista9.vazia();
        lista9.imprime();
        lista3.insere((java.lang.Object) lista9);
        boolean boolean14 = lista9.vazia();
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) 0.0d);
        ds.Lista lista18 = new ds.Lista();
        lista15.insere((java.lang.Object) lista18);
        lista15.insere((java.lang.Object) 10.0d);
        ds.Lista lista22 = new ds.Lista();
        lista22.insere((java.lang.Object) 0.0d);
        lista22.imprime();
        lista22.insere((java.lang.Object) "");
        lista22.imprime();
        lista15.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) "");
        lista30.imprime();
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean36 = lista30.vazia();
        lista30.imprime();
        boolean boolean38 = lista30.vazia();
        lista15.insere((java.lang.Object) boolean38);
        ds.Lista lista40 = new ds.Lista();
        lista40.insere((java.lang.Object) "");
        lista40.imprime();
        lista40.insere((java.lang.Object) 100L);
        boolean boolean46 = lista40.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) 0.0d);
        ds.Lista lista50 = new ds.Lista();
        lista47.insere((java.lang.Object) lista50);
        boolean boolean52 = lista50.vazia();
        lista40.insere((java.lang.Object) boolean52);
        lista40.imprime();
        lista15.insere((java.lang.Object) lista40);
        boolean boolean56 = lista15.vazia();
        lista9.insere((java.lang.Object) lista15);
        boolean boolean58 = lista9.vazia();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        lista11.imprime();
        boolean boolean16 = lista11.vazia();
        lista3.insere((java.lang.Object) lista11);
        lista11.imprime();
        boolean boolean19 = lista11.vazia();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.insere((java.lang.Object) (short) 100);
        boolean boolean12 = lista7.vazia();
        lista3.insere((java.lang.Object) lista7);
        boolean boolean14 = lista3.vazia();
        java.lang.Class<?> wildcardClass15 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        boolean boolean8 = lista3.vazia();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        boolean boolean15 = lista13.vazia();
        boolean boolean16 = lista13.vazia();
        lista13.imprime();
        boolean boolean18 = lista13.vazia();
        lista3.insere((java.lang.Object) lista13);
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.insere((java.lang.Object) (short) 1);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        boolean boolean29 = lista27.vazia();
        lista27.insere((java.lang.Object) 10);
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        lista32.imprime();
        lista27.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        boolean boolean41 = lista39.vazia();
        lista39.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        ds.Lista lista46 = new ds.Lista();
        lista43.insere((java.lang.Object) lista46);
        boolean boolean48 = lista46.vazia();
        boolean boolean49 = lista46.vazia();
        lista46.imprime();
        lista39.insere((java.lang.Object) lista46);
        lista32.insere((java.lang.Object) lista46);
        lista20.insere((java.lang.Object) lista46);
        lista3.insere((java.lang.Object) lista20);
        boolean boolean55 = lista20.vazia();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) "");
        lista9.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        ds.Lista lista16 = new ds.Lista();
        lista13.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass18 = lista16.getClass();
        lista9.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.imprime();
        lista3.imprime();
        lista3.insere((java.lang.Object) 10);
        boolean boolean9 = lista3.vazia();
        boolean boolean10 = lista3.vazia();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) 0.0d);
        ds.Lista lista26 = new ds.Lista();
        lista23.insere((java.lang.Object) lista26);
        boolean boolean28 = lista26.vazia();
        lista26.imprime();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        ds.Lista lista33 = new ds.Lista();
        lista30.insere((java.lang.Object) lista33);
        boolean boolean35 = lista33.vazia();
        boolean boolean36 = lista33.vazia();
        lista33.imprime();
        lista26.insere((java.lang.Object) lista33);
        lista19.insere((java.lang.Object) lista33);
        lista3.insere((java.lang.Object) lista33);
        lista3.imprime();
        java.lang.Class<?> wildcardClass42 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        lista11.insere((java.lang.Object) 10.0d);
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) 0.0d);
        ds.Lista lista21 = new ds.Lista();
        lista18.insere((java.lang.Object) lista21);
        lista21.insere((java.lang.Object) (-1.0d));
        lista21.imprime();
        boolean boolean26 = lista21.vazia();
        lista11.insere((java.lang.Object) boolean26);
        boolean boolean28 = lista11.vazia();
        boolean boolean29 = lista11.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.insere((java.lang.Object) 0.0d);
        lista30.insere((java.lang.Object) 0.0d);
        boolean boolean35 = lista30.vazia();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        ds.Lista lista39 = new ds.Lista();
        lista36.insere((java.lang.Object) lista39);
        lista36.insere((java.lang.Object) 10.0d);
        ds.Lista lista43 = new ds.Lista();
        lista43.insere((java.lang.Object) 0.0d);
        lista43.imprime();
        lista43.insere((java.lang.Object) "");
        lista43.imprime();
        lista36.insere((java.lang.Object) lista43);
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) "");
        lista51.imprime();
        lista51.insere((java.lang.Object) 0.0d);
        boolean boolean57 = lista51.vazia();
        lista51.imprime();
        boolean boolean59 = lista51.vazia();
        lista36.insere((java.lang.Object) boolean59);
        ds.Lista lista61 = new ds.Lista();
        lista61.insere((java.lang.Object) 0.0d);
        ds.Lista lista64 = new ds.Lista();
        lista61.insere((java.lang.Object) lista64);
        lista64.insere((java.lang.Object) (-1.0d));
        lista64.imprime();
        lista64.insere((java.lang.Object) (byte) -1);
        lista64.imprime();
        boolean boolean72 = lista64.vazia();
        boolean boolean73 = lista64.vazia();
        lista36.insere((java.lang.Object) lista64);
        lista30.insere((java.lang.Object) lista36);
        boolean boolean76 = lista30.vazia();
        lista11.insere((java.lang.Object) lista30);
        ds.Lista lista78 = new ds.Lista();
        lista78.insere((java.lang.Object) "");
        lista78.insere((java.lang.Object) false);
        boolean boolean83 = lista78.vazia();
        boolean boolean84 = lista78.vazia();
        boolean boolean85 = lista78.vazia();
        boolean boolean86 = lista78.vazia();
        lista30.insere((java.lang.Object) boolean86);
        lista0.insere((java.lang.Object) boolean86);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista3.insere((java.lang.Object) (-1.0d));
        lista3.imprime();
        lista3.insere((java.lang.Object) (byte) -1);
        boolean boolean10 = lista3.vazia();
        boolean boolean11 = lista3.vazia();
        lista3.insere((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass14 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        boolean boolean5 = lista3.vazia();
        lista3.insere((java.lang.Object) 10);
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) 0.0d);
        ds.Lista lista11 = new ds.Lista();
        lista8.insere((java.lang.Object) lista11);
        lista11.insere((java.lang.Object) (-1.0d));
        boolean boolean15 = lista11.vazia();
        boolean boolean16 = lista11.vazia();
        lista11.imprime();
        lista3.insere((java.lang.Object) lista11);
        ds.Lista lista19 = new ds.Lista();
        lista19.insere((java.lang.Object) 0.0d);
        ds.Lista lista22 = new ds.Lista();
        lista19.insere((java.lang.Object) lista22);
        boolean boolean24 = lista22.vazia();
        lista22.imprime();
        lista22.imprime();
        lista3.insere((java.lang.Object) lista22);
        ds.Lista lista28 = new ds.Lista();
        lista28.insere((java.lang.Object) 0.0d);
        ds.Lista lista31 = new ds.Lista();
        lista28.insere((java.lang.Object) lista31);
        boolean boolean33 = lista31.vazia();
        boolean boolean34 = lista31.vazia();
        lista31.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.insere((java.lang.Object) 0.0d);
        lista36.insere((java.lang.Object) (short) 100);
        boolean boolean41 = lista36.vazia();
        boolean boolean42 = lista36.vazia();
        lista31.insere((java.lang.Object) lista36);
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        lista44.insere((java.lang.Object) (short) 100);
        boolean boolean49 = lista44.vazia();
        boolean boolean50 = lista44.vazia();
        java.lang.Class<?> wildcardClass51 = lista44.getClass();
        lista31.insere((java.lang.Object) wildcardClass51);
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) 0.0d);
        ds.Lista lista56 = new ds.Lista();
        lista53.insere((java.lang.Object) lista56);
        lista56.imprime();
        ds.Lista lista59 = new ds.Lista();
        lista59.insere((java.lang.Object) 0.0d);
        ds.Lista lista62 = new ds.Lista();
        lista59.insere((java.lang.Object) lista62);
        boolean boolean64 = lista62.vazia();
        lista62.imprime();
        lista56.insere((java.lang.Object) lista62);
        lista31.insere((java.lang.Object) lista62);
        java.lang.Class<?> wildcardClass68 = lista31.getClass();
        lista22.insere((java.lang.Object) lista31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        boolean boolean9 = lista7.vazia();
        boolean boolean10 = lista7.vazia();
        lista0.insere((java.lang.Object) boolean10);
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) 0.0d);
        ds.Lista lista15 = new ds.Lista();
        lista12.insere((java.lang.Object) lista15);
        boolean boolean17 = lista15.vazia();
        lista15.insere((java.lang.Object) 10);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        lista20.imprime();
        lista15.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        ds.Lista lista27 = new ds.Lista();
        lista24.insere((java.lang.Object) lista27);
        lista27.insere((java.lang.Object) (-1.0d));
        boolean boolean31 = lista27.vazia();
        lista27.insere((java.lang.Object) 100);
        lista20.insere((java.lang.Object) lista27);
        lista27.imprime();
        lista0.insere((java.lang.Object) lista27);
        java.lang.Class<?> wildcardClass37 = lista27.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        ds.Lista lista3 = new ds.Lista();
        lista0.insere((java.lang.Object) lista3);
        lista0.insere((java.lang.Object) 10.0d);
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) 0.0d);
        lista7.imprime();
        lista7.insere((java.lang.Object) "");
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) "");
        lista15.imprime();
        lista15.insere((java.lang.Object) 0.0d);
        boolean boolean21 = lista15.vazia();
        lista15.imprime();
        boolean boolean23 = lista15.vazia();
        lista0.insere((java.lang.Object) boolean23);
        ds.Lista lista25 = new ds.Lista();
        lista25.insere((java.lang.Object) "");
        lista25.imprime();
        lista25.insere((java.lang.Object) 100L);
        boolean boolean31 = lista25.vazia();
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) 0.0d);
        ds.Lista lista35 = new ds.Lista();
        lista32.insere((java.lang.Object) lista35);
        boolean boolean37 = lista35.vazia();
        lista25.insere((java.lang.Object) boolean37);
        lista25.imprime();
        lista0.insere((java.lang.Object) lista25);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        boolean boolean43 = lista41.vazia();
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) 0.0d);
        ds.Lista lista47 = new ds.Lista();
        lista44.insere((java.lang.Object) lista47);
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        lista49.insere((java.lang.Object) '4');
        lista47.insere((java.lang.Object) '4');
        lista41.insere((java.lang.Object) '4');
        ds.Lista lista55 = new ds.Lista();
        lista55.insere((java.lang.Object) "");
        lista55.imprime();
        lista55.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.insere((java.lang.Object) 0.0d);
        ds.Lista lista63 = new ds.Lista();
        lista60.insere((java.lang.Object) lista63);
        lista63.imprime();
        lista63.imprime();
        lista63.insere((java.lang.Object) 10);
        lista55.insere((java.lang.Object) lista63);
        lista41.insere((java.lang.Object) lista63);
        java.lang.Class<?> wildcardClass71 = lista41.getClass();
        lista0.insere((java.lang.Object) wildcardClass71);
        boolean boolean73 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) false);
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) "");
        lista8.insere((java.lang.Object) false);
        lista8.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        lista14.insere((java.lang.Object) '4');
        lista8.insere((java.lang.Object) '4');
        lista0.insere((java.lang.Object) '4');
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) 0.0d);
        lista9.insere((java.lang.Object) (short) 100);
        boolean boolean14 = lista9.vazia();
        lista9.imprime();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) 0.0d);
        lista17.insere((java.lang.Object) 0.0d);
        boolean boolean22 = lista17.vazia();
        java.lang.Class<?> wildcardClass23 = lista17.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        boolean boolean25 = lista9.vazia();
        java.lang.Class<?> wildcardClass26 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        lista0.insere((java.lang.Object) 100L);
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) 0.0d);
        ds.Lista lista13 = new ds.Lista();
        lista10.insere((java.lang.Object) lista13);
        lista13.insere((java.lang.Object) (-1.0d));
        boolean boolean17 = lista13.vazia();
        boolean boolean18 = lista13.vazia();
        lista13.insere((java.lang.Object) "");
        boolean boolean21 = lista13.vazia();
        lista0.insere((java.lang.Object) boolean21);
        boolean boolean23 = lista0.vazia();
        lista0.imprime();
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.insere((java.lang.Object) 0.0d);
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) 0.0d);
        ds.Lista lista9 = new ds.Lista();
        lista6.insere((java.lang.Object) lista9);
        lista6.insere((java.lang.Object) 10.0d);
        ds.Lista lista13 = new ds.Lista();
        lista13.insere((java.lang.Object) 0.0d);
        lista13.imprime();
        lista13.insere((java.lang.Object) "");
        lista13.imprime();
        lista6.insere((java.lang.Object) lista13);
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) "");
        lista21.imprime();
        lista21.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista21.vazia();
        lista21.imprime();
        boolean boolean29 = lista21.vazia();
        lista6.insere((java.lang.Object) boolean29);
        ds.Lista lista31 = new ds.Lista();
        lista31.insere((java.lang.Object) 0.0d);
        ds.Lista lista34 = new ds.Lista();
        lista31.insere((java.lang.Object) lista34);
        lista34.insere((java.lang.Object) (-1.0d));
        lista34.imprime();
        lista34.insere((java.lang.Object) (byte) -1);
        lista34.imprime();
        boolean boolean42 = lista34.vazia();
        boolean boolean43 = lista34.vazia();
        lista6.insere((java.lang.Object) lista34);
        lista0.insere((java.lang.Object) lista6);
        boolean boolean46 = lista6.vazia();
        lista6.imprime();
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) "");
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.insere((java.lang.Object) 0.0d);
        ds.Lista lista7 = new ds.Lista();
        lista4.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass9 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) 0.0d);
        ds.Lista lista14 = new ds.Lista();
        lista11.insere((java.lang.Object) lista14);
        boolean boolean16 = lista14.vazia();
        lista14.insere((java.lang.Object) 10);
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        lista19.imprime();
        lista14.insere((java.lang.Object) lista19);
        lista0.insere((java.lang.Object) lista14);
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) 0.0d);
        boolean boolean27 = lista24.vazia();
        lista24.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        lista29.insere((java.lang.Object) '4');
        lista29.imprime();
        lista24.insere((java.lang.Object) lista29);
        lista0.insere((java.lang.Object) lista29);
        boolean boolean36 = lista0.vazia();
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }
}

