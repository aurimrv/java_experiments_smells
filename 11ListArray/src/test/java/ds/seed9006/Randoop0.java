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
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.primeiro;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d), 10.0f, int19 };
        lista10.item = objArray20;
        int int22 = lista10.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        java.lang.Object[] objArray10 = null;
        lista7.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        lista26.imprime();
        lista26.primeiro = '4';
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { lista18, int22, 35, lista24, lista26 };
        lista7.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) '#');
        int int42 = lista39.ultimo;
        int int43 = lista39.primeiro;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), objArray6, objArray37, int43, '#' };
        lista0.item = objArray6;
        java.lang.Class<?> wildcardClass50 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        boolean boolean8 = lista6.vazia();
        int int9 = lista6.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        boolean boolean2 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        lista10.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass8 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        int int11 = lista0.ultimo;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        lista11.insere((java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista6.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        boolean boolean27 = lista25.vazia();
        lista25.insere((java.lang.Object) (short) 100);
        int int30 = lista25.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.ultimo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        lista0.ultimo = '4';
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objArray11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        int int37 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        lista13.imprime();
        lista13.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.primeiro;
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        int int18 = lista0.ultimo;
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.ultimo;
        lista0.primeiro = 35;
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        lista23.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        int int31 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        int int11 = lista0.ultimo;
        lista0.pos = 35;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        int int31 = lista23.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        java.lang.Object[] objArray8 = lista6.item;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = (short) 1;
        lista0.ultimo = 97;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        int int5 = lista0.pos;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.imprime();
        java.lang.Object[] objArray45 = lista0.item;
        lista0.ultimo = (short) 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        lista23.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 52;
        lista0.ultimo = (short) 100;
        lista0.insere((java.lang.Object) 10.0f);
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        int int23 = lista15.ultimo;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista24.ultimo = (-1);
        boolean boolean28 = lista24.vazia();
        int int29 = lista24.ultimo;
        lista24.ultimo = 97;
        // The following exception was thrown during execution in test generation
        try {
            lista15.insere((java.lang.Object) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.primeiro;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) '#');
        lista6.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista10.item = objArray30;
        lista6.item = objArray30;
        lista0.insere((java.lang.Object) objArray30);
        java.lang.Class<?> wildcardClass35 = objArray30.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = 10;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.pos = 1;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.pos = (byte) 0;
        lista8.pos = '4';
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista8.insere((java.lang.Object) objArray30);
        int int33 = lista8.ultimo;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        java.lang.Object[] objArray36 = lista34.item;
        java.lang.Object[] objArray37 = lista34.item;
        lista34.pos = 100;
        java.lang.Object[] objArray40 = lista34.item;
        lista8.item = objArray40;
        lista8.primeiro = 100;
        java.lang.Object[] objArray44 = lista8.item;
        int int45 = lista8.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        int int7 = lista5.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        java.lang.Object[] objArray11 = lista9.item;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        java.lang.Object[] objArray14 = lista12.item;
        java.lang.Object[] objArray15 = null;
        lista12.item = objArray15;
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.primeiro = '#';
        int int21 = lista17.pos;
        int int22 = lista17.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista17.insere((java.lang.Object) lista23);
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        int int27 = lista25.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.primeiro = '#';
        int int35 = lista31.pos;
        java.lang.Object[] objArray36 = null;
        lista31.item = objArray36;
        lista31.imprime();
        lista31.primeiro = '4';
        boolean boolean41 = lista31.vazia();
        java.lang.Object[] objArray42 = new java.lang.Object[] { lista23, int27, 35, lista29, lista31 };
        lista12.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) '#');
        int int47 = lista44.ultimo;
        int int48 = lista44.primeiro;
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        lista49.primeiro = '#';
        java.lang.Object[] objArray53 = new java.lang.Object[] { (-1.0d), objArray11, objArray42, int48, '#' };
        lista5.item = objArray11;
        lista0.item = objArray11;
        boolean boolean56 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        int int46 = lista4.pos;
        lista4.pos = '#';
        java.lang.Object[] objArray49 = lista4.item;
        java.lang.Class<?> wildcardClass50 = objArray49.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = (short) 1;
        lista0.ultimo = 97;
        boolean boolean14 = lista0.vazia();
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        boolean boolean17 = lista15.vazia();
        lista15.insere((java.lang.Object) (short) 100);
        int int20 = lista15.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.insere((java.lang.Object) '#');
        lista21.imprime();
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.primeiro;
        lista25.pos = ' ';
        lista25.pos = 0;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.primeiro = '#';
        int int35 = lista31.pos;
        int int36 = lista31.ultimo;
        ds.Lista lista37 = new ds.Lista();
        lista31.insere((java.lang.Object) lista37);
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        int int41 = lista39.pos;
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        lista39.item = objArray43;
        java.lang.Object[] objArray45 = lista39.item;
        lista37.item = objArray45;
        lista25.item = objArray45;
        lista21.item = objArray45;
        lista15.insere((java.lang.Object) objArray45);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = (byte) 10;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = (byte) 0;
        lista7.pos = '4';
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.primeiro = '#';
        int int19 = lista15.pos;
        int int20 = lista15.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista15.insere((java.lang.Object) lista21);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        java.lang.Object[] objArray29 = lista23.item;
        lista21.item = objArray29;
        lista7.insere((java.lang.Object) objArray29);
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.pos = ' ';
        lista14.pos = 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista28.item = objArray32;
        java.lang.Object[] objArray34 = lista28.item;
        lista26.item = objArray34;
        lista14.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.primeiro = '#';
        int int41 = lista37.pos;
        java.lang.Object[] objArray42 = null;
        lista37.item = objArray42;
        int int44 = lista37.primeiro;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        int int47 = lista45.pos;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista45.item = objArray49;
        lista37.item = objArray49;
        lista14.item = objArray49;
        lista10.insere((java.lang.Object) lista14);
        lista10.imprime();
        java.lang.Object[] objArray55 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        lista0.primeiro = (byte) 100;
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.primeiro = '#';
        int int43 = lista39.pos;
        java.lang.Object[] objArray44 = null;
        lista39.item = objArray44;
        java.lang.Object[] objArray46 = lista39.item;
        boolean boolean47 = lista39.vazia();
        lista0.insere((java.lang.Object) lista39);
        ds.Lista lista49 = new ds.Lista();
        int int50 = lista49.primeiro;
        lista49.pos = ' ';
        lista49.pos = 0;
        int int55 = lista49.ultimo;
        int int56 = lista49.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista39.insere((java.lang.Object) int56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.primeiro = '#';
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.primeiro;
        lista38.pos = ' ';
        lista38.pos = 0;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        int int48 = lista44.pos;
        int int49 = lista44.ultimo;
        ds.Lista lista50 = new ds.Lista();
        lista44.insere((java.lang.Object) lista50);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        int int54 = lista52.pos;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista52.item = objArray56;
        java.lang.Object[] objArray58 = lista52.item;
        lista50.item = objArray58;
        lista38.item = objArray58;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        lista61.primeiro = '#';
        int int65 = lista61.pos;
        java.lang.Object[] objArray66 = null;
        lista61.item = objArray66;
        int int68 = lista61.primeiro;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        int int71 = lista69.pos;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        lista69.item = objArray73;
        lista61.item = objArray73;
        lista38.item = objArray73;
        lista34.insere((java.lang.Object) lista38);
        lista34.imprime();
        java.lang.Object[] objArray79 = lista34.item;
        lista34.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista34);
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        int int16 = lista14.pos;
        int int17 = lista14.primeiro;
        lista0.insere((java.lang.Object) int17);
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 10;
        int int13 = lista0.primeiro;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        lista3.insere((java.lang.Object) '#');
        int int6 = lista3.ultimo;
        java.lang.Object[] objArray7 = lista3.item;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        lista40.primeiro = '#';
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = null;
        lista40.item = objArray45;
        int int47 = lista40.primeiro;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista48.item = objArray52;
        lista40.item = objArray52;
        lista17.item = objArray52;
        lista13.insere((java.lang.Object) lista17);
        lista17.pos = ' ';
        ds.Lista lista59 = new ds.Lista();
        int int60 = lista59.primeiro;
        java.lang.Object[] objArray61 = lista59.item;
        lista59.imprime();
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.primeiro;
        lista63.pos = ' ';
        lista63.pos = (byte) 0;
        lista63.pos = '4';
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.primeiro = '#';
        int int75 = lista71.pos;
        int int76 = lista71.ultimo;
        ds.Lista lista77 = new ds.Lista();
        lista71.insere((java.lang.Object) lista77);
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        int int81 = lista79.pos;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        lista79.item = objArray83;
        java.lang.Object[] objArray85 = lista79.item;
        lista77.item = objArray85;
        lista63.insere((java.lang.Object) objArray85);
        lista59.item = objArray85;
        lista17.item = objArray85;
        lista0.item = objArray85;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        int int37 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        lista0.ultimo = 0;
        int int41 = lista0.ultimo;
        int int42 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        java.lang.Object[] objArray14 = lista12.item;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        java.lang.Object[] objArray17 = lista15.item;
        java.lang.Object[] objArray18 = null;
        lista15.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        int int30 = lista28.ultimo;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.primeiro = '#';
        int int38 = lista34.pos;
        java.lang.Object[] objArray39 = null;
        lista34.item = objArray39;
        lista34.imprime();
        lista34.primeiro = '4';
        boolean boolean44 = lista34.vazia();
        java.lang.Object[] objArray45 = new java.lang.Object[] { lista26, int30, 35, lista32, lista34 };
        lista15.item = objArray45;
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) '#');
        int int50 = lista47.ultimo;
        int int51 = lista47.primeiro;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.primeiro = '#';
        java.lang.Object[] objArray56 = new java.lang.Object[] { (-1.0d), objArray14, objArray45, int51, '#' };
        lista8.item = objArray14;
        java.lang.Object[] objArray58 = lista8.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) '#');
        lista12.imprime();
        int int16 = lista12.primeiro;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        lista12.item = objArray37;
        java.lang.Class<?> wildcardClass41 = lista12.getClass();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        boolean boolean45 = lista43.vazia();
        java.lang.Object[] objArray46 = lista43.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) '#');
        lista47.imprime();
        int int51 = lista47.primeiro;
        java.lang.Object[] objArray52 = lista47.item;
        lista47.primeiro = 0;
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.primeiro;
        lista55.pos = ' ';
        lista55.ultimo = (byte) -1;
        lista47.insere((java.lang.Object) lista55);
        java.lang.Object[] objArray62 = lista47.item;
        lista43.item = objArray62;
        lista0.item = objArray62;
        int int65 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.ultimo;
        int int25 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        boolean boolean15 = lista0.vazia();
        lista0.insere((java.lang.Object) 10L);
        int int18 = lista0.primeiro;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.primeiro;
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.imprime();
        java.lang.Object[] objArray45 = lista0.item;
        lista0.ultimo = (short) 1;
        int int48 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        lista0.ultimo = 0;
        int int41 = lista0.ultimo;
        int int42 = lista0.pos;
        java.lang.Class<?> wildcardClass43 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = (short) 1;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        int int31 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        lista4.imprime();
        int int47 = lista4.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = (byte) 1;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        int int46 = lista4.pos;
        lista4.pos = '#';
        lista4.ultimo = (short) -1;
        int int51 = lista4.ultimo;
        lista4.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.primeiro = '#';
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.primeiro;
        lista38.pos = ' ';
        lista38.pos = 0;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        int int48 = lista44.pos;
        int int49 = lista44.ultimo;
        ds.Lista lista50 = new ds.Lista();
        lista44.insere((java.lang.Object) lista50);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        int int54 = lista52.pos;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista52.item = objArray56;
        java.lang.Object[] objArray58 = lista52.item;
        lista50.item = objArray58;
        lista38.item = objArray58;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        lista61.primeiro = '#';
        int int65 = lista61.pos;
        java.lang.Object[] objArray66 = null;
        lista61.item = objArray66;
        int int68 = lista61.primeiro;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        int int71 = lista69.pos;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        lista69.item = objArray73;
        lista61.item = objArray73;
        lista38.item = objArray73;
        lista34.insere((java.lang.Object) lista38);
        lista34.imprime();
        java.lang.Object[] objArray79 = lista34.item;
        lista34.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista34);
        boolean boolean83 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        java.lang.Object[] objArray21 = null;
        lista16.item = objArray21;
        int int23 = lista16.primeiro;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        lista16.item = objArray28;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.primeiro;
        lista31.pos = ' ';
        lista31.pos = (byte) 0;
        int int37 = lista31.ultimo;
        lista16.insere((java.lang.Object) lista31);
        lista0.insere((java.lang.Object) lista16);
        int int40 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.primeiro = 1;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        lista20.pos = ' ';
        lista20.pos = 0;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        int int31 = lista26.ultimo;
        ds.Lista lista32 = new ds.Lista();
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        int int36 = lista34.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista34.item = objArray38;
        java.lang.Object[] objArray40 = lista34.item;
        lista32.item = objArray40;
        lista20.item = objArray40;
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.primeiro = '#';
        int int47 = lista43.pos;
        java.lang.Object[] objArray48 = null;
        lista43.item = objArray48;
        int int50 = lista43.primeiro;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        int int53 = lista51.pos;
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        lista51.item = objArray55;
        lista43.item = objArray55;
        lista20.item = objArray55;
        lista16.insere((java.lang.Object) lista20);
        lista16.imprime();
        java.lang.Object[] objArray61 = lista16.item;
        lista16.ultimo = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        int int11 = lista0.ultimo;
        lista0.pos = 35;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean21 = lista13.vazia();
        lista13.primeiro = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.insere((java.lang.Object) '#');
        lista24.imprime();
        int int28 = lista24.pos;
        int int29 = lista24.primeiro;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.primeiro;
        ds.Lista lista32 = new ds.Lista();
        lista32.insere((java.lang.Object) '#');
        int int35 = lista32.ultimo;
        java.lang.Object[] objArray36 = lista32.item;
        lista30.item = objArray36;
        lista24.item = objArray36;
        lista13.item = objArray36;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        java.lang.Object[] objArray10 = null;
        lista7.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        lista26.imprime();
        lista26.primeiro = '4';
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { lista18, int22, 35, lista24, lista26 };
        lista7.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) '#');
        int int42 = lista39.ultimo;
        int int43 = lista39.primeiro;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), objArray6, objArray37, int43, '#' };
        lista0.item = objArray6;
        lista0.pos = ' ';
        int int52 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) '#');
        int int5 = lista2.ultimo;
        java.lang.Object[] objArray6 = lista2.item;
        lista0.item = objArray6;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        lista0.primeiro = 35;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        lista0.primeiro = (-1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = 0;
        lista0.pos = (short) -1;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista6.item = objArray20;
        lista0.item = objArray20;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        java.lang.Object[] objArray29 = null;
        lista24.item = objArray29;
        int int31 = lista24.primeiro;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        lista24.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.pos = ' ';
        lista39.pos = (byte) 0;
        int int45 = lista39.ultimo;
        lista24.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray47 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        int int49 = lista24.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.primeiro;
        lista8.pos = 0;
        lista8.primeiro = 1;
        lista0.insere((java.lang.Object) 1);
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.primeiro = 1;
        lista0.pos = 35;
        int int17 = lista0.primeiro;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        int int25 = lista18.primeiro;
        lista18.imprime();
        int int27 = lista18.primeiro;
        java.lang.Object[] objArray28 = lista18.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        lista4.pos = '4';
        int int48 = lista4.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean21 = lista13.vazia();
        lista13.primeiro = (short) 10;
        lista13.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista13.insere((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(objArray12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        int int16 = lista10.ultimo;
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        java.lang.Object[] objArray23 = null;
        lista18.item = objArray23;
        int int25 = lista18.primeiro;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        lista18.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.primeiro;
        lista33.pos = ' ';
        lista33.pos = (byte) 0;
        int int39 = lista33.ultimo;
        lista18.insere((java.lang.Object) lista33);
        java.lang.Object[] objArray41 = lista18.item;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.primeiro;
        lista42.pos = ' ';
        lista42.pos = 0;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        lista48.primeiro = '#';
        int int52 = lista48.pos;
        int int53 = lista48.ultimo;
        ds.Lista lista54 = new ds.Lista();
        lista48.insere((java.lang.Object) lista54);
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        int int58 = lista56.pos;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista56.item = objArray60;
        java.lang.Object[] objArray62 = lista56.item;
        lista54.item = objArray62;
        lista42.item = objArray62;
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        lista65.primeiro = '#';
        int int69 = lista65.pos;
        java.lang.Object[] objArray70 = null;
        lista65.item = objArray70;
        int int72 = lista65.primeiro;
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        int int75 = lista73.pos;
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        lista73.item = objArray77;
        lista65.item = objArray77;
        lista42.item = objArray77;
        lista18.item = objArray77;
        java.lang.Object[] objArray82 = new java.lang.Object[] { lista18 };
        lista10.item = objArray82;
        lista0.item = objArray82;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.ultimo;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.primeiro;
        lista5.pos = ' ';
        lista5.pos = 0;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        lista11.primeiro = '#';
        int int15 = lista11.pos;
        int int16 = lista11.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista11.insere((java.lang.Object) lista17);
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        int int21 = lista19.pos;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        lista19.item = objArray23;
        java.lang.Object[] objArray25 = lista19.item;
        lista17.item = objArray25;
        lista5.item = objArray25;
        lista0.item = objArray25;
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        java.lang.Class<?> wildcardClass35 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        int int3 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.ultimo;
        lista0.primeiro = 35;
        int int27 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        lista0.ultimo = (short) 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        int int18 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        lista0.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean44 = lista4.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        lista0.primeiro = 100;
        lista0.imprime();
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        java.lang.Object[] objArray8 = lista6.item;
        lista6.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = (byte) 0;
        lista10.pos = '4';
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista10.insere((java.lang.Object) objArray32);
        lista6.item = objArray32;
        lista6.ultimo = 1;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.primeiro = '#';
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.primeiro;
        lista42.pos = ' ';
        lista42.pos = 0;
        ds.Lista lista48 = new ds.Lista();
        boolean boolean49 = lista48.vazia();
        lista48.primeiro = '#';
        int int52 = lista48.pos;
        int int53 = lista48.ultimo;
        ds.Lista lista54 = new ds.Lista();
        lista48.insere((java.lang.Object) lista54);
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        int int58 = lista56.pos;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        lista56.item = objArray60;
        java.lang.Object[] objArray62 = lista56.item;
        lista54.item = objArray62;
        lista42.item = objArray62;
        ds.Lista lista65 = new ds.Lista();
        boolean boolean66 = lista65.vazia();
        lista65.primeiro = '#';
        int int69 = lista65.pos;
        java.lang.Object[] objArray70 = null;
        lista65.item = objArray70;
        int int72 = lista65.primeiro;
        ds.Lista lista73 = new ds.Lista();
        java.lang.Object[] objArray74 = lista73.item;
        int int75 = lista73.pos;
        ds.Lista lista76 = new ds.Lista();
        java.lang.Object[] objArray77 = lista76.item;
        lista73.item = objArray77;
        lista65.item = objArray77;
        lista42.item = objArray77;
        lista38.insere((java.lang.Object) lista42);
        lista38.imprime();
        java.lang.Object[] objArray83 = lista38.item;
        lista6.item = objArray83;
        lista0.item = objArray83;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        lista0.ultimo = '4';
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        int int8 = lista0.primeiro;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        java.lang.Object[] objArray11 = lista7.item;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) '#');
        int int17 = lista14.ultimo;
        java.lang.Object[] objArray18 = lista14.item;
        lista12.item = objArray18;
        lista7.item = objArray18;
        lista0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = (byte) 1;
        lista0.pos = 0;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = (byte) 0;
        lista7.pos = '4';
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.primeiro = '#';
        int int19 = lista15.pos;
        int int20 = lista15.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista15.insere((java.lang.Object) lista21);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        java.lang.Object[] objArray29 = lista23.item;
        lista21.item = objArray29;
        lista7.insere((java.lang.Object) objArray29);
        int int32 = lista7.ultimo;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.primeiro;
        java.lang.Object[] objArray35 = lista33.item;
        java.lang.Object[] objArray36 = lista33.item;
        lista33.pos = 100;
        java.lang.Object[] objArray39 = lista33.item;
        lista7.item = objArray39;
        lista0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        boolean boolean14 = lista12.vazia();
        boolean boolean15 = lista12.vazia();
        lista12.ultimo = (byte) -1;
        lista12.primeiro = 35;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista8.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        lista0.insere((java.lang.Object) lista7);
        lista0.primeiro = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.imprime();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Class<?> wildcardClass14 = lista7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = (short) 100;
        int int12 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) '#');
        lista6.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista10.item = objArray30;
        lista6.item = objArray30;
        lista0.insere((java.lang.Object) objArray30);
        int int35 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        lista0.ultimo = (byte) -1;
        lista0.pos = '4';
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.ultimo = '#';
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.primeiro = '#';
        int int13 = lista9.pos;
        java.lang.Object[] objArray14 = null;
        lista9.item = objArray14;
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista17.item = objArray21;
        lista9.item = objArray21;
        lista9.insere((java.lang.Object) (byte) -1);
        lista9.pos = 97;
        int int28 = lista9.primeiro;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        boolean boolean31 = lista29.vazia();
        lista29.insere((java.lang.Object) (short) 100);
        java.lang.Object[] objArray34 = lista29.item;
        lista9.item = objArray34;
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        lista0.ultimo = '4';
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.item = objArray12;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        int int14 = lista8.primeiro;
        lista8.pos = 52;
        int int17 = lista8.primeiro;
        boolean boolean18 = lista8.vazia();
        lista6.insere((java.lang.Object) lista8);
        lista6.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 52;
        lista0.primeiro = 32;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.pos = 52;
        lista0.primeiro = 100;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        lista2.imprime();
        int int4 = lista2.pos;
        lista0.insere((java.lang.Object) lista2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) '#');
        int int13 = lista10.ultimo;
        java.lang.Object[] objArray14 = lista10.item;
        lista8.item = objArray14;
        lista0.insere((java.lang.Object) lista8);
        boolean boolean17 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        int int20 = lista14.ultimo;
        lista14.imprime();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.primeiro = '#';
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = null;
        lista22.item = objArray27;
        int int29 = lista22.primeiro;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        int int32 = lista30.pos;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista30.item = objArray34;
        lista22.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        lista37.pos = ' ';
        lista37.pos = (byte) 0;
        int int43 = lista37.ultimo;
        lista22.insere((java.lang.Object) lista37);
        java.lang.Object[] objArray45 = lista22.item;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        lista46.pos = ' ';
        lista46.pos = 0;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.primeiro = '#';
        int int56 = lista52.pos;
        int int57 = lista52.ultimo;
        ds.Lista lista58 = new ds.Lista();
        lista52.insere((java.lang.Object) lista58);
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        int int62 = lista60.pos;
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        lista60.item = objArray64;
        java.lang.Object[] objArray66 = lista60.item;
        lista58.item = objArray66;
        lista46.item = objArray66;
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        lista69.primeiro = '#';
        int int73 = lista69.pos;
        java.lang.Object[] objArray74 = null;
        lista69.item = objArray74;
        int int76 = lista69.primeiro;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        lista77.item = objArray81;
        lista69.item = objArray81;
        lista46.item = objArray81;
        lista22.item = objArray81;
        java.lang.Object[] objArray86 = new java.lang.Object[] { lista22 };
        lista14.item = objArray86;
        lista0.item = objArray86;
        lista0.pos = 'a';
        int int91 = lista0.ultimo;
        int int92 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        lista0.pos = 0;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        lista0.primeiro = (short) 0;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.pos = ' ';
        lista14.pos = 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista28.item = objArray32;
        java.lang.Object[] objArray34 = lista28.item;
        lista26.item = objArray34;
        lista14.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.primeiro = '#';
        int int41 = lista37.pos;
        java.lang.Object[] objArray42 = null;
        lista37.item = objArray42;
        int int44 = lista37.primeiro;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        int int47 = lista45.pos;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista45.item = objArray49;
        lista37.item = objArray49;
        lista14.item = objArray49;
        lista10.insere((java.lang.Object) lista14);
        lista10.imprime();
        java.lang.Object[] objArray55 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean57 = lista10.vazia();
        int int58 = lista10.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.pos = ' ';
        lista24.pos = (byte) 0;
        lista24.pos = (short) 10;
        lista24.primeiro = 35;
        lista24.insere((java.lang.Object) (short) 1);
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        lista36.primeiro = '#';
        lista36.primeiro = (short) 0;
        lista36.insere((java.lang.Object) (-1L));
        ds.Lista lista44 = new ds.Lista();
        lista44.insere((java.lang.Object) '#');
        int int47 = lista44.ultimo;
        java.lang.Object[] objArray48 = lista44.item;
        lista36.item = objArray48;
        java.lang.Object[] objArray50 = lista36.item;
        lista24.insere((java.lang.Object) objArray50);
        int int52 = lista24.primeiro;
        lista0.insere((java.lang.Object) int52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = (byte) 1;
        lista0.pos = 97;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        java.lang.Object[] objArray29 = null;
        lista24.item = objArray29;
        int int31 = lista24.primeiro;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        lista24.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.pos = ' ';
        lista39.pos = (byte) 0;
        int int45 = lista39.ultimo;
        lista24.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray47 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        lista0.imprime();
        int int50 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        boolean boolean6 = lista0.vazia();
        lista0.pos = 97;
        lista0.ultimo = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.primeiro = (byte) 10;
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.primeiro = '#';
        int int18 = lista14.pos;
        java.lang.Object[] objArray19 = null;
        lista14.item = objArray19;
        int int21 = lista14.primeiro;
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        int int24 = lista22.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista22.item = objArray26;
        lista14.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.primeiro;
        lista29.pos = ' ';
        lista29.pos = (byte) 0;
        int int35 = lista29.ultimo;
        lista14.insere((java.lang.Object) lista29);
        java.lang.Object[] objArray37 = lista14.item;
        int int38 = lista14.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = '#';
        java.lang.Object obj9 = null;
        lista0.insere(obj9);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista5.primeiro = (short) 0;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.primeiro;
        java.lang.Object[] objArray24 = lista22.item;
        java.lang.Object[] objArray25 = null;
        lista22.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        int int32 = lista27.ultimo;
        ds.Lista lista33 = new ds.Lista();
        lista27.insere((java.lang.Object) lista33);
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.ultimo;
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.primeiro = '#';
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = null;
        lista41.item = objArray46;
        lista41.imprime();
        lista41.primeiro = '4';
        boolean boolean51 = lista41.vazia();
        java.lang.Object[] objArray52 = new java.lang.Object[] { lista33, int37, 35, lista39, lista41 };
        lista22.item = objArray52;
        lista5.item = objArray52;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        boolean boolean57 = lista55.vazia();
        java.lang.Object[] objArray58 = lista55.item;
        lista5.item = objArray58;
        lista0.item = objArray58;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        lista0.item = objArray11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        boolean boolean10 = lista0.vazia();
        lista0.pos = '#';
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        int int10 = lista0.primeiro;
        lista0.pos = (byte) 10;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.primeiro;
        lista18.pos = ' ';
        lista18.pos = 0;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        int int29 = lista24.ultimo;
        ds.Lista lista30 = new ds.Lista();
        lista24.insere((java.lang.Object) lista30);
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        java.lang.Object[] objArray38 = lista32.item;
        lista30.item = objArray38;
        lista18.item = objArray38;
        ds.Lista lista41 = new ds.Lista();
        boolean boolean42 = lista41.vazia();
        lista41.primeiro = '#';
        int int45 = lista41.pos;
        java.lang.Object[] objArray46 = null;
        lista41.item = objArray46;
        int int48 = lista41.primeiro;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        int int51 = lista49.pos;
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        lista49.item = objArray53;
        lista41.item = objArray53;
        lista18.item = objArray53;
        lista14.insere((java.lang.Object) lista18);
        lista18.pos = ' ';
        ds.Lista lista60 = new ds.Lista();
        int int61 = lista60.primeiro;
        java.lang.Object[] objArray62 = lista60.item;
        lista60.imprime();
        ds.Lista lista64 = new ds.Lista();
        int int65 = lista64.primeiro;
        lista64.pos = ' ';
        lista64.pos = (byte) 0;
        lista64.pos = '4';
        ds.Lista lista72 = new ds.Lista();
        boolean boolean73 = lista72.vazia();
        lista72.primeiro = '#';
        int int76 = lista72.pos;
        int int77 = lista72.ultimo;
        ds.Lista lista78 = new ds.Lista();
        lista72.insere((java.lang.Object) lista78);
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        int int82 = lista80.pos;
        ds.Lista lista83 = new ds.Lista();
        java.lang.Object[] objArray84 = lista83.item;
        lista80.item = objArray84;
        java.lang.Object[] objArray86 = lista80.item;
        lista78.item = objArray86;
        lista64.insere((java.lang.Object) objArray86);
        lista60.item = objArray86;
        lista18.item = objArray86;
        lista0.item = objArray86;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        boolean boolean8 = lista0.vazia();
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        lista0.ultimo = 0;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        java.lang.Object[] objArray10 = lista8.item;
        java.lang.Object[] objArray11 = null;
        lista8.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.ultimo;
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        lista27.imprime();
        lista27.primeiro = '4';
        boolean boolean37 = lista27.vazia();
        java.lang.Object[] objArray38 = new java.lang.Object[] { lista19, int23, 35, lista25, lista27 };
        lista8.item = objArray38;
        lista8.pos = 1;
        int int42 = lista8.primeiro;
        lista8.ultimo = (short) 10;
        int int45 = lista8.ultimo;
        lista8.ultimo = (-1);
        lista8.pos = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        lista0.pos = 0;
        lista0.primeiro = 1;
        lista0.pos = 52;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        lista0.ultimo = 0;
        int int41 = lista0.ultimo;
        lista0.imprime();
        int int43 = lista0.pos;
        int int44 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.ultimo = 1;
        lista4.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        int int14 = lista8.primeiro;
        lista8.pos = 52;
        int int17 = lista8.primeiro;
        boolean boolean18 = lista8.vazia();
        lista6.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray20 = lista8.item;
        lista8.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        boolean boolean10 = lista0.vazia();
        lista0.pos = '#';
        int int13 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.ultimo;
        lista0.primeiro = 10;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = (short) 1;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.ultimo = (byte) 10;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        boolean boolean7 = lista5.vazia();
        lista5.insere((java.lang.Object) (short) 100);
        int int10 = lista5.primeiro;
        lista5.pos = (-1);
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        int int15 = lista13.primeiro;
        lista13.imprime();
        java.lang.Object[] objArray17 = lista13.item;
        lista5.item = objArray17;
        lista0.insere((java.lang.Object) objArray17);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        lista0.primeiro = 100;
        java.lang.Object[] objArray36 = lista0.item;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        java.lang.Object[] objArray21 = null;
        lista16.item = objArray21;
        int int23 = lista16.primeiro;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        lista16.item = objArray28;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.primeiro;
        lista31.pos = ' ';
        lista31.pos = (byte) 0;
        int int37 = lista31.ultimo;
        lista16.insere((java.lang.Object) lista31);
        lista0.insere((java.lang.Object) lista16);
        lista0.ultimo = 32;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        lista40.primeiro = '#';
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = null;
        lista40.item = objArray45;
        int int47 = lista40.primeiro;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista48.item = objArray52;
        lista40.item = objArray52;
        lista17.item = objArray52;
        lista13.insere((java.lang.Object) lista17);
        lista17.pos = ' ';
        ds.Lista lista59 = new ds.Lista();
        int int60 = lista59.primeiro;
        java.lang.Object[] objArray61 = lista59.item;
        lista59.imprime();
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.primeiro;
        lista63.pos = ' ';
        lista63.pos = (byte) 0;
        lista63.pos = '4';
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.primeiro = '#';
        int int75 = lista71.pos;
        int int76 = lista71.ultimo;
        ds.Lista lista77 = new ds.Lista();
        lista71.insere((java.lang.Object) lista77);
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        int int81 = lista79.pos;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        lista79.item = objArray83;
        java.lang.Object[] objArray85 = lista79.item;
        lista77.item = objArray85;
        lista63.insere((java.lang.Object) objArray85);
        lista59.item = objArray85;
        lista17.item = objArray85;
        lista0.item = objArray85;
        lista0.ultimo = (byte) 1;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        lista0.imprime();
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        boolean boolean14 = lista0.vazia();
        lista0.primeiro = '4';
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        int int6 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.primeiro = 1;
        lista0.pos = 35;
        int int17 = lista0.primeiro;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.primeiro;
        lista22.pos = ' ';
        lista22.pos = 0;
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.primeiro = '#';
        int int32 = lista28.pos;
        int int33 = lista28.ultimo;
        ds.Lista lista34 = new ds.Lista();
        lista28.insere((java.lang.Object) lista34);
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        int int38 = lista36.pos;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista36.item = objArray40;
        java.lang.Object[] objArray42 = lista36.item;
        lista34.item = objArray42;
        lista22.item = objArray42;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        lista45.primeiro = '#';
        int int49 = lista45.pos;
        java.lang.Object[] objArray50 = null;
        lista45.item = objArray50;
        int int52 = lista45.primeiro;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        int int55 = lista53.pos;
        ds.Lista lista56 = new ds.Lista();
        java.lang.Object[] objArray57 = lista56.item;
        lista53.item = objArray57;
        lista45.item = objArray57;
        lista22.item = objArray57;
        lista18.insere((java.lang.Object) lista22);
        lista18.ultimo = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        lista0.pos = 1;
        java.lang.Class<?> wildcardClass34 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = 10;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        java.lang.Object[] objArray11 = lista9.item;
        java.lang.Object[] objArray12 = lista9.item;
        lista0.item = objArray12;
        int int14 = lista0.primeiro;
        lista0.primeiro = 97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        java.lang.Object[] objArray48 = lista46.item;
        lista46.imprime();
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.primeiro;
        lista50.pos = ' ';
        lista50.pos = (byte) 0;
        lista50.pos = '4';
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        lista58.primeiro = '#';
        int int62 = lista58.pos;
        int int63 = lista58.ultimo;
        ds.Lista lista64 = new ds.Lista();
        lista58.insere((java.lang.Object) lista64);
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        int int68 = lista66.pos;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        lista66.item = objArray70;
        java.lang.Object[] objArray72 = lista66.item;
        lista64.item = objArray72;
        lista50.insere((java.lang.Object) objArray72);
        lista46.item = objArray72;
        lista4.item = objArray72;
        lista4.ultimo = 100;
        int int79 = lista4.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        java.lang.Object[] objArray48 = lista46.item;
        lista46.imprime();
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.primeiro;
        lista50.pos = ' ';
        lista50.pos = (byte) 0;
        lista50.pos = '4';
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        lista58.primeiro = '#';
        int int62 = lista58.pos;
        int int63 = lista58.ultimo;
        ds.Lista lista64 = new ds.Lista();
        lista58.insere((java.lang.Object) lista64);
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        int int68 = lista66.pos;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        lista66.item = objArray70;
        java.lang.Object[] objArray72 = lista66.item;
        lista64.item = objArray72;
        lista50.insere((java.lang.Object) objArray72);
        lista46.item = objArray72;
        lista4.item = objArray72;
        java.lang.Object[] objArray77 = lista4.item;
        java.lang.Class<?> wildcardClass78 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.imprime();
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        lista0.pos = 97;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        java.lang.Object[] objArray12 = lista10.item;
        java.lang.Object[] objArray13 = null;
        lista10.item = objArray13;
        java.lang.Class<?> wildcardClass15 = lista10.getClass();
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        lista0.pos = 1;
        int int34 = lista0.primeiro;
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        lista0.ultimo = '4';
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) '#');
        lista12.imprime();
        int int16 = lista12.primeiro;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        lista12.item = objArray37;
        java.lang.Class<?> wildcardClass41 = lista12.getClass();
        lista0.insere((java.lang.Object) lista12);
        boolean boolean43 = lista12.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = (byte) 0;
        lista10.pos = '4';
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.imprime();
        int int9 = lista0.primeiro;
        lista0.primeiro = ' ';
        lista0.ultimo = (short) 100;
        lista0.ultimo = 101;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        ds.Lista lista4 = new ds.Lista();
        boolean boolean5 = lista4.vazia();
        lista4.primeiro = '#';
        int int8 = lista4.pos;
        java.lang.Object[] objArray9 = null;
        lista4.item = objArray9;
        lista4.imprime();
        lista4.primeiro = '4';
        boolean boolean14 = lista4.vazia();
        java.lang.Object[] objArray15 = lista4.item;
        int int16 = lista4.primeiro;
        lista4.imprime();
        lista4.primeiro = (byte) 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.pos = ' ';
        lista24.pos = 0;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        int int35 = lista30.ultimo;
        ds.Lista lista36 = new ds.Lista();
        lista30.insere((java.lang.Object) lista36);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        java.lang.Object[] objArray44 = lista38.item;
        lista36.item = objArray44;
        lista24.item = objArray44;
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.primeiro = '#';
        int int51 = lista47.pos;
        java.lang.Object[] objArray52 = null;
        lista47.item = objArray52;
        int int54 = lista47.primeiro;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        int int57 = lista55.pos;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        lista55.item = objArray59;
        lista47.item = objArray59;
        lista24.item = objArray59;
        lista20.insere((java.lang.Object) lista24);
        lista24.pos = ' ';
        ds.Lista lista66 = new ds.Lista();
        int int67 = lista66.primeiro;
        java.lang.Object[] objArray68 = lista66.item;
        lista66.imprime();
        ds.Lista lista70 = new ds.Lista();
        int int71 = lista70.primeiro;
        lista70.pos = ' ';
        lista70.pos = (byte) 0;
        lista70.pos = '4';
        ds.Lista lista78 = new ds.Lista();
        boolean boolean79 = lista78.vazia();
        lista78.primeiro = '#';
        int int82 = lista78.pos;
        int int83 = lista78.ultimo;
        ds.Lista lista84 = new ds.Lista();
        lista78.insere((java.lang.Object) lista84);
        ds.Lista lista86 = new ds.Lista();
        java.lang.Object[] objArray87 = lista86.item;
        int int88 = lista86.pos;
        ds.Lista lista89 = new ds.Lista();
        java.lang.Object[] objArray90 = lista89.item;
        lista86.item = objArray90;
        java.lang.Object[] objArray92 = lista86.item;
        lista84.item = objArray92;
        lista70.insere((java.lang.Object) objArray92);
        lista66.item = objArray92;
        lista24.item = objArray92;
        java.lang.Object[] objArray97 = lista24.item;
        lista4.item = objArray97;
        lista0.item = objArray97;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.pos = 52;
        int int9 = lista0.primeiro;
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) '#');
        lista10.imprime();
        int int14 = lista10.pos;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 35;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        lista0.pos = 1;
        int int34 = lista0.primeiro;
        lista0.ultimo = (short) 10;
        lista0.primeiro = (short) 0;
        boolean boolean39 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = 2;
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) '#');
        lista9.imprime();
        int int13 = lista9.primeiro;
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = 0;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.ultimo = (byte) -1;
        lista9.insere((java.lang.Object) lista17);
        lista9.primeiro = (short) 0;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = null;
        lista26.item = objArray29;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.primeiro = '#';
        int int35 = lista31.pos;
        int int36 = lista31.ultimo;
        ds.Lista lista37 = new ds.Lista();
        lista31.insere((java.lang.Object) lista37);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        int int41 = lista39.ultimo;
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        lista45.primeiro = '#';
        int int49 = lista45.pos;
        java.lang.Object[] objArray50 = null;
        lista45.item = objArray50;
        lista45.imprime();
        lista45.primeiro = '4';
        boolean boolean55 = lista45.vazia();
        java.lang.Object[] objArray56 = new java.lang.Object[] { lista37, int41, 35, lista43, lista45 };
        lista26.item = objArray56;
        lista9.item = objArray56;
        int int59 = lista9.primeiro;
        int int60 = lista9.primeiro;
        java.lang.Object[] objArray61 = lista9.item;
        lista0.item = objArray61;
        int int63 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) '#');
        int int13 = lista10.ultimo;
        java.lang.Object[] objArray14 = lista10.item;
        lista8.item = objArray14;
        lista0.insere((java.lang.Object) lista8);
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        lista0.pos = 10;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.primeiro;
        lista0.ultimo = (short) -1;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        lista0.pos = (-1);
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        int int10 = lista8.primeiro;
        lista8.imprime();
        java.lang.Object[] objArray12 = lista8.item;
        lista0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.primeiro;
        lista23.pos = ' ';
        lista23.pos = (byte) 0;
        int int29 = lista23.ultimo;
        lista8.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray31 = lista8.item;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.primeiro;
        lista32.pos = ' ';
        lista32.pos = 0;
        ds.Lista lista38 = new ds.Lista();
        boolean boolean39 = lista38.vazia();
        lista38.primeiro = '#';
        int int42 = lista38.pos;
        int int43 = lista38.ultimo;
        ds.Lista lista44 = new ds.Lista();
        lista38.insere((java.lang.Object) lista44);
        ds.Lista lista46 = new ds.Lista();
        java.lang.Object[] objArray47 = lista46.item;
        int int48 = lista46.pos;
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        lista46.item = objArray50;
        java.lang.Object[] objArray52 = lista46.item;
        lista44.item = objArray52;
        lista32.item = objArray52;
        ds.Lista lista55 = new ds.Lista();
        boolean boolean56 = lista55.vazia();
        lista55.primeiro = '#';
        int int59 = lista55.pos;
        java.lang.Object[] objArray60 = null;
        lista55.item = objArray60;
        int int62 = lista55.primeiro;
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        int int65 = lista63.pos;
        ds.Lista lista66 = new ds.Lista();
        java.lang.Object[] objArray67 = lista66.item;
        lista63.item = objArray67;
        lista55.item = objArray67;
        lista32.item = objArray67;
        lista8.item = objArray67;
        java.lang.Object[] objArray72 = new java.lang.Object[] { lista8 };
        lista0.item = objArray72;
        int int74 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        lista0.primeiro = (byte) 100;
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.primeiro = '#';
        int int43 = lista39.pos;
        java.lang.Object[] objArray44 = null;
        lista39.item = objArray44;
        java.lang.Object[] objArray46 = lista39.item;
        boolean boolean47 = lista39.vazia();
        lista0.insere((java.lang.Object) lista39);
        ds.Lista lista49 = new ds.Lista();
        java.lang.Object[] objArray50 = lista49.item;
        int int51 = lista49.pos;
        ds.Lista lista53 = new ds.Lista();
        int int54 = lista53.primeiro;
        java.lang.Object[] objArray55 = lista53.item;
        ds.Lista lista56 = new ds.Lista();
        int int57 = lista56.primeiro;
        java.lang.Object[] objArray58 = lista56.item;
        java.lang.Object[] objArray59 = null;
        lista56.item = objArray59;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        lista61.primeiro = '#';
        int int65 = lista61.pos;
        int int66 = lista61.ultimo;
        ds.Lista lista67 = new ds.Lista();
        lista61.insere((java.lang.Object) lista67);
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        int int71 = lista69.ultimo;
        ds.Lista lista73 = new ds.Lista();
        lista73.imprime();
        ds.Lista lista75 = new ds.Lista();
        boolean boolean76 = lista75.vazia();
        lista75.primeiro = '#';
        int int79 = lista75.pos;
        java.lang.Object[] objArray80 = null;
        lista75.item = objArray80;
        lista75.imprime();
        lista75.primeiro = '4';
        boolean boolean85 = lista75.vazia();
        java.lang.Object[] objArray86 = new java.lang.Object[] { lista67, int71, 35, lista73, lista75 };
        lista56.item = objArray86;
        ds.Lista lista88 = new ds.Lista();
        lista88.insere((java.lang.Object) '#');
        int int91 = lista88.ultimo;
        int int92 = lista88.primeiro;
        ds.Lista lista93 = new ds.Lista();
        boolean boolean94 = lista93.vazia();
        lista93.primeiro = '#';
        java.lang.Object[] objArray97 = new java.lang.Object[] { (-1.0d), objArray55, objArray86, int92, '#' };
        lista49.item = objArray55;
        lista0.item = objArray55;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(objArray97);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        int int9 = lista0.primeiro;
        int int10 = lista0.ultimo;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        boolean boolean12 = lista8.vazia();
        lista8.pos = 10;
        java.lang.Object[] objArray15 = lista8.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = 0;
        lista8.insere((java.lang.Object) lista15);
        lista8.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 0;
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        lista0.primeiro = (short) 0;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        java.lang.Object[] objArray19 = lista17.item;
        java.lang.Object[] objArray20 = null;
        lista17.item = objArray20;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.primeiro = '#';
        int int26 = lista22.pos;
        int int27 = lista22.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        int int32 = lista30.ultimo;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        lista36.primeiro = '#';
        int int40 = lista36.pos;
        java.lang.Object[] objArray41 = null;
        lista36.item = objArray41;
        lista36.imprime();
        lista36.primeiro = '4';
        boolean boolean46 = lista36.vazia();
        java.lang.Object[] objArray47 = new java.lang.Object[] { lista28, int32, 35, lista34, lista36 };
        lista17.item = objArray47;
        lista0.item = objArray47;
        ds.Lista lista50 = new ds.Lista();
        boolean boolean51 = lista50.vazia();
        boolean boolean52 = lista50.vazia();
        java.lang.Object[] objArray53 = lista50.item;
        lista0.item = objArray53;
        boolean boolean55 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) '#');
        int int5 = lista2.ultimo;
        java.lang.Object[] objArray6 = lista2.item;
        lista0.item = objArray6;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        int int11 = lista0.ultimo;
        lista0.pos = 35;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.ultimo = (short) 100;
        lista0.pos = '4';
        int int48 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.primeiro = '#';
        int int18 = lista14.pos;
        int int19 = lista14.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista22 = new ds.Lista();
        java.lang.Object[] objArray23 = lista22.item;
        int int24 = lista22.pos;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        lista22.item = objArray26;
        java.lang.Object[] objArray28 = lista22.item;
        lista20.item = objArray28;
        lista8.item = objArray28;
        lista0.insere((java.lang.Object) objArray28);
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        boolean boolean35 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        lista0.pos = '#';
        lista0.primeiro = (short) 100;
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = (short) 100;
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = null;
        lista0.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.primeiro = '#';
        lista25.primeiro = (short) 0;
        lista25.insere((java.lang.Object) (-1L));
        lista25.primeiro = (-1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        java.lang.Class<?> wildcardClass25 = objArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        lista0.primeiro = (-1);
        int int41 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        int int32 = lista0.pos;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        lista23.item = objArray27;
        int int29 = lista23.primeiro;
        lista0.insere((java.lang.Object) lista23);
        lista23.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.ultimo = 1;
        java.lang.Class<?> wildcardClass46 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.pos;
        lista0.pos = 32;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        lista18.imprime();
        lista18.primeiro = 97;
        lista0.insere((java.lang.Object) 97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.primeiro;
        ds.Lista lista25 = new ds.Lista();
        boolean boolean26 = lista25.vazia();
        lista25.primeiro = '#';
        boolean boolean29 = lista25.vazia();
        lista25.pos = 10;
        java.lang.Object[] objArray32 = lista25.item;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.ultimo = 'a';
        lista0.ultimo = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        lista10.imprime();
        lista0.insere((java.lang.Object) lista10);
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.primeiro;
        java.lang.Object[] objArray7 = lista5.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, '#', lista5 };
        lista0.item = objArray8;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        lista0.ultimo = (byte) 100;
        int int17 = lista0.primeiro;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        int int23 = lista21.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista21.item = objArray25;
        java.lang.Object[] objArray27 = lista21.item;
        lista19.item = objArray27;
        lista7.item = objArray27;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        java.lang.Object[] objArray35 = null;
        lista30.item = objArray35;
        int int37 = lista30.primeiro;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        lista30.item = objArray42;
        lista7.item = objArray42;
        lista3.insere((java.lang.Object) lista7);
        lista7.pos = ' ';
        lista7.imprime();
        lista7.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        int int53 = lista0.primeiro;
        boolean boolean54 = lista0.vazia();
        int int55 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        java.lang.Object[] objArray29 = null;
        lista24.item = objArray29;
        int int31 = lista24.primeiro;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        lista24.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.pos = ' ';
        lista39.pos = (byte) 0;
        int int45 = lista39.ultimo;
        lista24.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray47 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        java.lang.Object[] objArray49 = null;
        lista24.item = objArray49;
        java.lang.Class<?> wildcardClass51 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        int int32 = lista0.pos;
        int int33 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.ultimo;
        lista0.primeiro = 35;
        lista0.primeiro = (byte) 1;
        lista0.primeiro = (short) -1;
        lista0.pos = 35;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = 2;
        lista0.ultimo = ' ';
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        java.lang.Object[] objArray10 = null;
        lista7.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        lista26.imprime();
        lista26.primeiro = '4';
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { lista18, int22, 35, lista24, lista26 };
        lista7.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) '#');
        int int42 = lista39.ultimo;
        int int43 = lista39.primeiro;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), objArray6, objArray37, int43, '#' };
        lista0.item = objArray6;
        java.lang.Object[] objArray50 = lista0.item;
        int int51 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.primeiro = (short) 1;
        lista0.ultimo = 'a';
        java.lang.Object[] objArray8 = null;
        lista0.item = objArray8;
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        lista4.imprime();
        int int47 = lista4.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = 'a';
        lista0.pos = 52;
        lista0.ultimo = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.primeiro = 1;
        int int15 = lista0.primeiro;
        boolean boolean16 = lista0.vazia();
        int int17 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) '#');
        lista12.imprime();
        int int16 = lista12.primeiro;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        lista12.item = objArray37;
        java.lang.Class<?> wildcardClass41 = lista12.getClass();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        boolean boolean45 = lista43.vazia();
        java.lang.Object[] objArray46 = lista43.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.insere((java.lang.Object) '#');
        lista47.imprime();
        int int51 = lista47.primeiro;
        java.lang.Object[] objArray52 = lista47.item;
        lista47.primeiro = 0;
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.primeiro;
        lista55.pos = ' ';
        lista55.ultimo = (byte) -1;
        lista47.insere((java.lang.Object) lista55);
        java.lang.Object[] objArray62 = lista47.item;
        lista43.item = objArray62;
        lista0.item = objArray62;
        ds.Lista lista65 = new ds.Lista();
        int int66 = lista65.primeiro;
        java.lang.Object[] objArray67 = lista65.item;
        java.lang.Object[] objArray68 = null;
        lista65.item = objArray68;
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        lista70.primeiro = '#';
        int int74 = lista70.pos;
        int int75 = lista70.ultimo;
        ds.Lista lista76 = new ds.Lista();
        lista70.insere((java.lang.Object) lista76);
        ds.Lista lista78 = new ds.Lista();
        lista78.imprime();
        int int80 = lista78.ultimo;
        ds.Lista lista82 = new ds.Lista();
        lista82.imprime();
        ds.Lista lista84 = new ds.Lista();
        boolean boolean85 = lista84.vazia();
        lista84.primeiro = '#';
        int int88 = lista84.pos;
        java.lang.Object[] objArray89 = null;
        lista84.item = objArray89;
        lista84.imprime();
        lista84.primeiro = '4';
        boolean boolean94 = lista84.vazia();
        java.lang.Object[] objArray95 = new java.lang.Object[] { lista76, int80, 35, lista82, lista84 };
        lista65.item = objArray95;
        int int97 = lista65.pos;
        lista0.insere((java.lang.Object) lista65);
        int int99 = lista65.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        lista0.pos = 0;
        lista0.primeiro = 1;
        lista0.pos = 52;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.primeiro;
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0d), 10.0f, int19 };
        lista10.item = objArray20;
        lista10.imprime();
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        int int25 = lista23.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.primeiro;
        java.lang.Object[] objArray29 = lista27.item;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.primeiro;
        java.lang.Object[] objArray32 = lista30.item;
        java.lang.Object[] objArray33 = null;
        lista30.item = objArray33;
        ds.Lista lista35 = new ds.Lista();
        boolean boolean36 = lista35.vazia();
        lista35.primeiro = '#';
        int int39 = lista35.pos;
        int int40 = lista35.ultimo;
        ds.Lista lista41 = new ds.Lista();
        lista35.insere((java.lang.Object) lista41);
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        int int45 = lista43.ultimo;
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        ds.Lista lista49 = new ds.Lista();
        boolean boolean50 = lista49.vazia();
        lista49.primeiro = '#';
        int int53 = lista49.pos;
        java.lang.Object[] objArray54 = null;
        lista49.item = objArray54;
        lista49.imprime();
        lista49.primeiro = '4';
        boolean boolean59 = lista49.vazia();
        java.lang.Object[] objArray60 = new java.lang.Object[] { lista41, int45, 35, lista47, lista49 };
        lista30.item = objArray60;
        ds.Lista lista62 = new ds.Lista();
        lista62.insere((java.lang.Object) '#');
        int int65 = lista62.ultimo;
        int int66 = lista62.primeiro;
        ds.Lista lista67 = new ds.Lista();
        boolean boolean68 = lista67.vazia();
        lista67.primeiro = '#';
        java.lang.Object[] objArray71 = new java.lang.Object[] { (-1.0d), objArray29, objArray60, int66, '#' };
        lista23.item = objArray29;
        java.lang.Object[] objArray73 = lista23.item;
        lista10.item = objArray73;
        lista0.item = objArray73;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.pos = ' ';
        lista14.pos = 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista28.item = objArray32;
        java.lang.Object[] objArray34 = lista28.item;
        lista26.item = objArray34;
        lista14.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.primeiro = '#';
        int int41 = lista37.pos;
        java.lang.Object[] objArray42 = null;
        lista37.item = objArray42;
        int int44 = lista37.primeiro;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        int int47 = lista45.pos;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista45.item = objArray49;
        lista37.item = objArray49;
        lista14.item = objArray49;
        lista10.insere((java.lang.Object) lista14);
        lista10.imprime();
        java.lang.Object[] objArray55 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean57 = lista10.vazia();
        lista10.pos = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 97;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        java.lang.Object[] objArray8 = lista6.item;
        java.lang.Object[] objArray9 = lista6.item;
        int int10 = lista6.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) '#');
        lista11.imprime();
        java.lang.Object[] objArray15 = lista11.item;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) '#');
        int int21 = lista18.ultimo;
        java.lang.Object[] objArray22 = lista18.item;
        lista16.item = objArray22;
        lista11.item = objArray22;
        lista6.item = objArray22;
        lista0.item = objArray22;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = 0;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        lista9.pos = ' ';
        lista9.pos = (byte) 0;
        lista9.pos = (short) 10;
        lista9.primeiro = 35;
        lista9.insere((java.lang.Object) (short) 1);
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.primeiro = '#';
        lista21.primeiro = (short) 0;
        lista21.insere((java.lang.Object) (-1L));
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) '#');
        int int32 = lista29.ultimo;
        java.lang.Object[] objArray33 = lista29.item;
        lista21.item = objArray33;
        java.lang.Object[] objArray35 = lista21.item;
        lista9.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        boolean boolean38 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        int int3 = lista2.primeiro;
        java.lang.Object[] objArray4 = lista2.item;
        lista2.imprime();
        boolean boolean6 = lista2.vazia();
        java.lang.Object[] objArray7 = lista2.item;
        lista0.item = objArray7;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        lista0.pos = 97;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.pos;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.imprime();
        int int10 = lista0.ultimo;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista9.ultimo = (-1);
        boolean boolean13 = lista9.vazia();
        int int14 = lista9.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        ds.Lista lista17 = new ds.Lista();
        boolean boolean18 = lista17.vazia();
        lista17.primeiro = '#';
        int int21 = lista17.pos;
        java.lang.Object[] objArray22 = null;
        lista17.item = objArray22;
        int int24 = lista17.primeiro;
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista25.item = objArray29;
        lista17.item = objArray29;
        lista15.item = objArray29;
        lista9.item = objArray29;
        java.lang.Object[] objArray34 = lista9.item;
        lista0.insere((java.lang.Object) objArray34);
        java.lang.Class<?> wildcardClass36 = objArray34.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = (byte) 0;
        lista4.pos = '4';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        int int22 = lista20.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista20.item = objArray24;
        java.lang.Object[] objArray26 = lista20.item;
        lista18.item = objArray26;
        lista4.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        lista0.ultimo = 1;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        lista32.primeiro = '#';
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.primeiro;
        lista36.pos = ' ';
        lista36.pos = 0;
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.primeiro = '#';
        int int46 = lista42.pos;
        int int47 = lista42.ultimo;
        ds.Lista lista48 = new ds.Lista();
        lista42.insere((java.lang.Object) lista48);
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        int int52 = lista50.pos;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista50.item = objArray54;
        java.lang.Object[] objArray56 = lista50.item;
        lista48.item = objArray56;
        lista36.item = objArray56;
        ds.Lista lista59 = new ds.Lista();
        boolean boolean60 = lista59.vazia();
        lista59.primeiro = '#';
        int int63 = lista59.pos;
        java.lang.Object[] objArray64 = null;
        lista59.item = objArray64;
        int int66 = lista59.primeiro;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        int int69 = lista67.pos;
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        lista67.item = objArray71;
        lista59.item = objArray71;
        lista36.item = objArray71;
        lista32.insere((java.lang.Object) lista36);
        lista32.imprime();
        java.lang.Object[] objArray77 = lista32.item;
        lista0.item = objArray77;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        int int20 = lista14.ultimo;
        lista14.imprime();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.primeiro = '#';
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = null;
        lista22.item = objArray27;
        int int29 = lista22.primeiro;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        int int32 = lista30.pos;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista30.item = objArray34;
        lista22.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        lista37.pos = ' ';
        lista37.pos = (byte) 0;
        int int43 = lista37.ultimo;
        lista22.insere((java.lang.Object) lista37);
        java.lang.Object[] objArray45 = lista22.item;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        lista46.pos = ' ';
        lista46.pos = 0;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.primeiro = '#';
        int int56 = lista52.pos;
        int int57 = lista52.ultimo;
        ds.Lista lista58 = new ds.Lista();
        lista52.insere((java.lang.Object) lista58);
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        int int62 = lista60.pos;
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        lista60.item = objArray64;
        java.lang.Object[] objArray66 = lista60.item;
        lista58.item = objArray66;
        lista46.item = objArray66;
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        lista69.primeiro = '#';
        int int73 = lista69.pos;
        java.lang.Object[] objArray74 = null;
        lista69.item = objArray74;
        int int76 = lista69.primeiro;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        lista77.item = objArray81;
        lista69.item = objArray81;
        lista46.item = objArray81;
        lista22.item = objArray81;
        java.lang.Object[] objArray86 = new java.lang.Object[] { lista22 };
        lista14.item = objArray86;
        lista0.item = objArray86;
        lista0.pos = 'a';
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista0.insere((java.lang.Object) boolean4);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.pos = 0;
        lista8.ultimo = 'a';
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) '#');
        lista16.imprime();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        lista20.pos = ' ';
        lista20.pos = 0;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        int int31 = lista26.ultimo;
        ds.Lista lista32 = new ds.Lista();
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        int int36 = lista34.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista34.item = objArray38;
        java.lang.Object[] objArray40 = lista34.item;
        lista32.item = objArray40;
        lista20.item = objArray40;
        lista16.item = objArray40;
        lista8.item = objArray40;
        lista8.primeiro = (byte) 100;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass48 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        java.lang.Object[] objArray7 = null;
        lista4.item = objArray7;
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        lista9.primeiro = '#';
        int int13 = lista9.pos;
        int int14 = lista9.ultimo;
        ds.Lista lista15 = new ds.Lista();
        lista9.insere((java.lang.Object) lista15);
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        int int19 = lista17.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        lista23.imprime();
        lista23.primeiro = '4';
        boolean boolean33 = lista23.vazia();
        java.lang.Object[] objArray34 = new java.lang.Object[] { lista15, int19, 35, lista21, lista23 };
        lista4.item = objArray34;
        lista0.item = objArray34;
        java.lang.Class<?> wildcardClass37 = objArray34.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        int int11 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        int int4 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = null;
        lista0.item = objArray3;
        ds.Lista lista5 = new ds.Lista();
        boolean boolean6 = lista5.vazia();
        lista5.primeiro = '#';
        int int9 = lista5.pos;
        int int10 = lista5.ultimo;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.ultimo;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = new java.lang.Object[] { lista11, int15, 35, lista17, lista19 };
        lista0.item = objArray30;
        lista0.pos = 1;
        int int34 = lista0.primeiro;
        lista0.ultimo = (short) 10;
        int int37 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        lista0.primeiro = 100;
        java.lang.Object[] objArray36 = lista0.item;
        int int37 = lista0.primeiro;
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) '#');
        lista38.imprime();
        int int42 = lista38.primeiro;
        java.lang.Object[] objArray43 = lista38.item;
        lista38.primeiro = 0;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        lista46.pos = ' ';
        lista46.ultimo = (byte) -1;
        lista38.insere((java.lang.Object) lista46);
        lista38.primeiro = (short) 0;
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.primeiro;
        java.lang.Object[] objArray57 = lista55.item;
        java.lang.Object[] objArray58 = null;
        lista55.item = objArray58;
        ds.Lista lista60 = new ds.Lista();
        boolean boolean61 = lista60.vazia();
        lista60.primeiro = '#';
        int int64 = lista60.pos;
        int int65 = lista60.ultimo;
        ds.Lista lista66 = new ds.Lista();
        lista60.insere((java.lang.Object) lista66);
        ds.Lista lista68 = new ds.Lista();
        lista68.imprime();
        int int70 = lista68.ultimo;
        ds.Lista lista72 = new ds.Lista();
        lista72.imprime();
        ds.Lista lista74 = new ds.Lista();
        boolean boolean75 = lista74.vazia();
        lista74.primeiro = '#';
        int int78 = lista74.pos;
        java.lang.Object[] objArray79 = null;
        lista74.item = objArray79;
        lista74.imprime();
        lista74.primeiro = '4';
        boolean boolean84 = lista74.vazia();
        java.lang.Object[] objArray85 = new java.lang.Object[] { lista66, int70, 35, lista72, lista74 };
        lista55.item = objArray85;
        lista38.item = objArray85;
        int int88 = lista38.primeiro;
        int int89 = lista38.primeiro;
        lista0.insere((java.lang.Object) int89);
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.pos = 97;
        int int19 = lista0.primeiro;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = 0;
        lista0.pos = (short) -1;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        int int39 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.imprime();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) '#');
        lista12.imprime();
        int int16 = lista12.primeiro;
        java.lang.Object[] objArray17 = lista12.item;
        lista0.item = objArray17;
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.ultimo;
        lista0.primeiro = 97;
        lista0.primeiro = '4';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista10.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        lista33.primeiro = '#';
        int int37 = lista33.pos;
        java.lang.Object[] objArray38 = null;
        lista33.item = objArray38;
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        int int43 = lista41.pos;
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        lista41.item = objArray45;
        lista33.item = objArray45;
        lista10.item = objArray45;
        lista6.insere((java.lang.Object) lista10);
        lista10.pos = ' ';
        int int52 = lista10.pos;
        lista10.pos = '#';
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = (byte) -1;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        int int21 = lista13.pos;
        lista13.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        lista0.ultimo = 0;
        int int20 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 0;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.primeiro;
        java.lang.Object[] objArray7 = lista5.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 0L, '#', lista5 };
        lista0.item = objArray8;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.insere((java.lang.Object) '#');
        int int14 = lista11.ultimo;
        int int15 = lista11.primeiro;
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) '#');
        lista16.imprime();
        int int20 = lista16.primeiro;
        java.lang.Object[] objArray21 = lista16.item;
        lista16.primeiro = 0;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.pos = ' ';
        lista24.ultimo = (byte) -1;
        lista16.insere((java.lang.Object) lista24);
        lista11.insere((java.lang.Object) lista24);
        boolean boolean32 = lista24.vazia();
        java.lang.Object[] objArray33 = lista24.item;
        lista24.primeiro = 0;
        lista0.insere((java.lang.Object) lista24);
        lista24.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        lista0.primeiro = 35;
        lista0.insere((java.lang.Object) (short) 1);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        lista12.primeiro = (short) 0;
        lista12.insere((java.lang.Object) (-1L));
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) '#');
        int int23 = lista20.ultimo;
        java.lang.Object[] objArray24 = lista20.item;
        lista12.item = objArray24;
        java.lang.Object[] objArray26 = lista12.item;
        lista0.insere((java.lang.Object) objArray26);
        int int28 = lista0.pos;
        boolean boolean29 = lista0.vazia();
        lista0.ultimo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        java.lang.Object[] objArray29 = null;
        lista24.item = objArray29;
        int int31 = lista24.primeiro;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        lista24.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.pos = ' ';
        lista39.pos = (byte) 0;
        int int45 = lista39.ultimo;
        lista24.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray47 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        lista0.primeiro = '4';
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) '#');
        int int12 = lista9.ultimo;
        lista9.pos = 52;
        lista9.primeiro = 32;
        lista9.primeiro = 0;
        int int19 = lista9.ultimo;
        lista0.insere((java.lang.Object) lista9);
        java.lang.Object[] objArray21 = lista9.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        lista40.primeiro = '#';
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = null;
        lista40.item = objArray45;
        int int47 = lista40.primeiro;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista48.item = objArray52;
        lista40.item = objArray52;
        lista17.item = objArray52;
        lista13.insere((java.lang.Object) lista17);
        lista17.pos = ' ';
        ds.Lista lista59 = new ds.Lista();
        int int60 = lista59.primeiro;
        java.lang.Object[] objArray61 = lista59.item;
        lista59.imprime();
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.primeiro;
        lista63.pos = ' ';
        lista63.pos = (byte) 0;
        lista63.pos = '4';
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.primeiro = '#';
        int int75 = lista71.pos;
        int int76 = lista71.ultimo;
        ds.Lista lista77 = new ds.Lista();
        lista71.insere((java.lang.Object) lista77);
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        int int81 = lista79.pos;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        lista79.item = objArray83;
        java.lang.Object[] objArray85 = lista79.item;
        lista77.item = objArray85;
        lista63.insere((java.lang.Object) objArray85);
        lista59.item = objArray85;
        lista17.item = objArray85;
        lista0.item = objArray85;
        java.lang.Object[] objArray91 = lista0.item;
        lista0.pos = (short) 1;
        int int94 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        lista8.pos = 1;
        ds.Lista lista17 = new ds.Lista();
        lista17.insere((java.lang.Object) '#');
        lista17.imprime();
        int int21 = lista17.primeiro;
        java.lang.Object[] objArray22 = lista17.item;
        lista17.primeiro = 0;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.primeiro;
        lista25.pos = ' ';
        lista25.ultimo = (byte) -1;
        lista17.insere((java.lang.Object) lista25);
        lista17.primeiro = (short) 0;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        java.lang.Object[] objArray36 = lista34.item;
        java.lang.Object[] objArray37 = null;
        lista34.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.primeiro = '#';
        int int43 = lista39.pos;
        int int44 = lista39.ultimo;
        ds.Lista lista45 = new ds.Lista();
        lista39.insere((java.lang.Object) lista45);
        ds.Lista lista47 = new ds.Lista();
        lista47.imprime();
        int int49 = lista47.ultimo;
        ds.Lista lista51 = new ds.Lista();
        lista51.imprime();
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        lista53.primeiro = '#';
        int int57 = lista53.pos;
        java.lang.Object[] objArray58 = null;
        lista53.item = objArray58;
        lista53.imprime();
        lista53.primeiro = '4';
        boolean boolean63 = lista53.vazia();
        java.lang.Object[] objArray64 = new java.lang.Object[] { lista45, int49, 35, lista51, lista53 };
        lista34.item = objArray64;
        lista17.item = objArray64;
        int int67 = lista17.primeiro;
        int int68 = lista17.primeiro;
        java.lang.Object[] objArray69 = lista17.item;
        int int70 = lista17.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista8.insere((java.lang.Object) int70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.primeiro;
        java.lang.Object[] objArray20 = lista18.item;
        lista18.imprime();
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.primeiro;
        lista22.pos = ' ';
        lista22.pos = (byte) 0;
        lista22.pos = '4';
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        int int35 = lista30.ultimo;
        ds.Lista lista36 = new ds.Lista();
        lista30.insere((java.lang.Object) lista36);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        java.lang.Object[] objArray44 = lista38.item;
        lista36.item = objArray44;
        lista22.insere((java.lang.Object) objArray44);
        lista18.item = objArray44;
        lista0.insere((java.lang.Object) objArray44);
        lista0.pos = 0;
        ds.Lista lista51 = new ds.Lista();
        lista51.insere((java.lang.Object) '#');
        lista51.imprime();
        lista0.insere((java.lang.Object) lista51);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        int int11 = lista8.ultimo;
        java.lang.Object[] objArray12 = lista8.item;
        lista0.item = objArray12;
        java.lang.Object[] objArray14 = lista0.item;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        boolean boolean18 = lista16.vazia();
        lista16.insere((java.lang.Object) (short) 100);
        int int21 = lista16.ultimo;
        java.lang.Object[] objArray22 = lista16.item;
        lista0.item = objArray22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        java.lang.Object[] objArray26 = lista24.item;
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.pos = ' ';
        lista28.pos = (byte) 0;
        lista28.pos = '4';
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        lista36.primeiro = '#';
        int int40 = lista36.pos;
        int int41 = lista36.ultimo;
        ds.Lista lista42 = new ds.Lista();
        lista36.insere((java.lang.Object) lista42);
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista44.item = objArray48;
        java.lang.Object[] objArray50 = lista44.item;
        lista42.item = objArray50;
        lista28.insere((java.lang.Object) objArray50);
        lista24.item = objArray50;
        lista6.insere((java.lang.Object) objArray50);
        lista6.pos = 0;
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray58 = lista6.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = (short) 100;
        int int12 = lista0.ultimo;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        int int24 = lista0.ultimo;
        lista0.primeiro = 35;
        lista0.primeiro = (byte) 1;
        lista0.primeiro = (short) -1;
        lista0.pos = 35;
        ds.Lista lista33 = new ds.Lista();
        boolean boolean34 = lista33.vazia();
        int int35 = lista33.primeiro;
        lista33.imprime();
        java.lang.Object[] objArray37 = lista33.item;
        lista0.item = objArray37;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.pos;
        lista0.pos = (byte) 10;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        int int23 = lista0.pos;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) -1;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.primeiro;
        lista5.pos = ' ';
        lista5.pos = (byte) 0;
        lista5.pos = '4';
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        int int23 = lista21.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista21.item = objArray25;
        java.lang.Object[] objArray27 = lista21.item;
        lista19.item = objArray27;
        lista5.insere((java.lang.Object) objArray27);
        int int30 = lista5.ultimo;
        int int31 = lista5.pos;
        int int32 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        int int34 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.pos = '#';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        ds.Lista lista25 = new ds.Lista();
        java.lang.Object[] objArray26 = lista25.item;
        int int27 = lista25.pos;
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        lista25.item = objArray29;
        int int31 = lista25.ultimo;
        lista25.imprime();
        lista25.primeiro = 1;
        int int35 = lista25.pos;
        lista0.insere((java.lang.Object) int35);
        int int37 = lista0.ultimo;
        java.lang.Object[] objArray38 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.pos = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        int int11 = lista6.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        java.lang.Object[] objArray20 = lista14.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        lista23.item = objArray35;
        lista0.item = objArray35;
        lista0.ultimo = 0;
        int int41 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.ultimo;
        java.lang.Object[] objArray17 = null;
        lista0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        int int11 = lista9.primeiro;
        int int12 = lista9.pos;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int15 = lista9.pos;
        boolean boolean16 = lista9.vazia();
        int int17 = lista9.primeiro;
        java.lang.Object[] objArray18 = lista9.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        lista0.pos = 'a';
        java.lang.Object[] objArray37 = lista0.item;
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        lista0.ultimo = 97;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        lista0.insere((java.lang.Object) lista7);
        lista0.primeiro = (byte) -1;
        lista0.ultimo = (byte) 0;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        java.lang.Object[] objArray10 = null;
        lista7.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        lista26.imprime();
        lista26.primeiro = '4';
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { lista18, int22, 35, lista24, lista26 };
        lista7.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) '#');
        int int42 = lista39.ultimo;
        int int43 = lista39.primeiro;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), objArray6, objArray37, int43, '#' };
        lista0.item = objArray6;
        java.lang.Object[] objArray50 = lista0.item;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.primeiro;
        lista51.pos = ' ';
        lista51.pos = 0;
        int int57 = lista51.ultimo;
        lista51.primeiro = (byte) 10;
        lista0.insere((java.lang.Object) (byte) 10);
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        int int23 = lista21.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista21.item = objArray25;
        java.lang.Object[] objArray27 = lista21.item;
        lista19.item = objArray27;
        lista7.item = objArray27;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        java.lang.Object[] objArray35 = null;
        lista30.item = objArray35;
        int int37 = lista30.primeiro;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        lista30.item = objArray42;
        lista7.item = objArray42;
        lista3.insere((java.lang.Object) lista7);
        lista7.pos = ' ';
        lista7.imprime();
        lista7.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        int int53 = lista0.primeiro;
        java.lang.Object obj54 = null;
        lista0.insere(obj54);
        boolean boolean56 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.primeiro;
        lista5.pos = ' ';
        lista5.pos = (byte) 0;
        lista5.pos = '4';
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        int int23 = lista21.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista21.item = objArray25;
        java.lang.Object[] objArray27 = lista21.item;
        lista19.item = objArray27;
        lista5.insere((java.lang.Object) objArray27);
        int int30 = lista5.ultimo;
        int int31 = lista5.pos;
        int int32 = lista5.pos;
        lista0.insere((java.lang.Object) lista5);
        lista5.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        lista12.insere((java.lang.Object) '#');
        lista12.imprime();
        int int16 = lista12.primeiro;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        lista12.item = objArray37;
        java.lang.Class<?> wildcardClass41 = lista12.getClass();
        lista0.insere((java.lang.Object) lista12);
        ds.Lista lista43 = new ds.Lista();
        boolean boolean44 = lista43.vazia();
        lista43.primeiro = '#';
        ds.Lista lista47 = new ds.Lista();
        int int48 = lista47.primeiro;
        lista47.pos = ' ';
        lista47.pos = 0;
        ds.Lista lista53 = new ds.Lista();
        boolean boolean54 = lista53.vazia();
        lista53.primeiro = '#';
        int int57 = lista53.pos;
        int int58 = lista53.ultimo;
        ds.Lista lista59 = new ds.Lista();
        lista53.insere((java.lang.Object) lista59);
        ds.Lista lista61 = new ds.Lista();
        java.lang.Object[] objArray62 = lista61.item;
        int int63 = lista61.pos;
        ds.Lista lista64 = new ds.Lista();
        java.lang.Object[] objArray65 = lista64.item;
        lista61.item = objArray65;
        java.lang.Object[] objArray67 = lista61.item;
        lista59.item = objArray67;
        lista47.item = objArray67;
        ds.Lista lista70 = new ds.Lista();
        boolean boolean71 = lista70.vazia();
        lista70.primeiro = '#';
        int int74 = lista70.pos;
        java.lang.Object[] objArray75 = null;
        lista70.item = objArray75;
        int int77 = lista70.primeiro;
        ds.Lista lista78 = new ds.Lista();
        java.lang.Object[] objArray79 = lista78.item;
        int int80 = lista78.pos;
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray82 = lista81.item;
        lista78.item = objArray82;
        lista70.item = objArray82;
        lista47.item = objArray82;
        lista43.insere((java.lang.Object) lista47);
        lista47.pos = ' ';
        lista47.imprime();
        lista12.insere((java.lang.Object) lista47);
        int int91 = lista12.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 35 + "'", int77 == 35);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.pos = ' ';
        lista28.pos = (byte) 0;
        lista28.pos = '4';
        lista28.ultimo = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = '#';
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        int int9 = lista0.primeiro;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = 0;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        lista9.pos = ' ';
        lista9.pos = (byte) 0;
        lista9.pos = (short) 10;
        lista9.primeiro = 35;
        lista9.insere((java.lang.Object) (short) 1);
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.primeiro = '#';
        lista21.primeiro = (short) 0;
        lista21.insere((java.lang.Object) (-1L));
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) '#');
        int int32 = lista29.ultimo;
        java.lang.Object[] objArray33 = lista29.item;
        lista21.item = objArray33;
        java.lang.Object[] objArray35 = lista21.item;
        lista9.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        java.lang.Object[] objArray38 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        lista12.ultimo = 'a';
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) '#');
        lista20.imprime();
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.pos = ' ';
        lista24.pos = 0;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        int int35 = lista30.ultimo;
        ds.Lista lista36 = new ds.Lista();
        lista30.insere((java.lang.Object) lista36);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        java.lang.Object[] objArray44 = lista38.item;
        lista36.item = objArray44;
        lista24.item = objArray44;
        lista20.item = objArray44;
        lista12.item = objArray44;
        lista12.primeiro = (byte) 100;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        lista51.primeiro = '#';
        int int55 = lista51.pos;
        java.lang.Object[] objArray56 = null;
        lista51.item = objArray56;
        java.lang.Object[] objArray58 = lista51.item;
        boolean boolean59 = lista51.vazia();
        lista12.insere((java.lang.Object) lista51);
        lista12.pos = 10;
        lista0.insere((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 97;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = (byte) 0;
        lista4.pos = '4';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        int int22 = lista20.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista20.item = objArray24;
        java.lang.Object[] objArray26 = lista20.item;
        lista18.item = objArray26;
        lista4.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        int int30 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        lista0.pos = 10;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.pos = 0;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        int int28 = lista23.ultimo;
        ds.Lista lista29 = new ds.Lista();
        lista23.insere((java.lang.Object) lista29);
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        int int33 = lista31.pos;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        lista31.item = objArray35;
        java.lang.Object[] objArray37 = lista31.item;
        lista29.item = objArray37;
        lista17.item = objArray37;
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        lista40.primeiro = '#';
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = null;
        lista40.item = objArray45;
        int int47 = lista40.primeiro;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        int int50 = lista48.pos;
        ds.Lista lista51 = new ds.Lista();
        java.lang.Object[] objArray52 = lista51.item;
        lista48.item = objArray52;
        lista40.item = objArray52;
        lista17.item = objArray52;
        lista13.insere((java.lang.Object) lista17);
        lista17.pos = ' ';
        ds.Lista lista59 = new ds.Lista();
        int int60 = lista59.primeiro;
        java.lang.Object[] objArray61 = lista59.item;
        lista59.imprime();
        ds.Lista lista63 = new ds.Lista();
        int int64 = lista63.primeiro;
        lista63.pos = ' ';
        lista63.pos = (byte) 0;
        lista63.pos = '4';
        ds.Lista lista71 = new ds.Lista();
        boolean boolean72 = lista71.vazia();
        lista71.primeiro = '#';
        int int75 = lista71.pos;
        int int76 = lista71.ultimo;
        ds.Lista lista77 = new ds.Lista();
        lista71.insere((java.lang.Object) lista77);
        ds.Lista lista79 = new ds.Lista();
        java.lang.Object[] objArray80 = lista79.item;
        int int81 = lista79.pos;
        ds.Lista lista82 = new ds.Lista();
        java.lang.Object[] objArray83 = lista82.item;
        lista79.item = objArray83;
        java.lang.Object[] objArray85 = lista79.item;
        lista77.item = objArray85;
        lista63.insere((java.lang.Object) objArray85);
        lista59.item = objArray85;
        lista17.item = objArray85;
        lista0.item = objArray85;
        java.lang.Object[] objArray91 = lista0.item;
        lista0.pos = (short) 1;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = (short) 0;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = 32;
        lista0.pos = 52;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        lista0.imprime();
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.ultimo = (short) 100;
        int int46 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        int int34 = lista0.primeiro;
        lista0.pos = 'a';
        java.lang.Object[] objArray37 = lista0.item;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = 0;
        lista8.insere((java.lang.Object) lista15);
        lista8.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        boolean boolean21 = lista13.vazia();
        java.lang.Object[] objArray22 = lista13.item;
        lista13.imprime();
        lista13.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        int int23 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        int int4 = lista0.pos;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.imprime();
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.pos;
        int int16 = lista0.ultimo;
        int int17 = lista0.primeiro;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        lista0.pos = (-1);
        int int8 = lista0.ultimo;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        lista0.imprime();
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        lista0.primeiro = 32;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        boolean boolean23 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        lista0.ultimo = 0;
        int int20 = lista0.pos;
        int int21 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) -1;
        int int10 = lista0.ultimo;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.primeiro = '#';
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        ds.Lista lista13 = new ds.Lista();
        boolean boolean14 = lista13.vazia();
        lista13.primeiro = '#';
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista13.insere((java.lang.Object) lista19);
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        int int23 = lista21.pos;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista21.item = objArray25;
        java.lang.Object[] objArray27 = lista21.item;
        lista19.item = objArray27;
        lista7.item = objArray27;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        java.lang.Object[] objArray35 = null;
        lista30.item = objArray35;
        int int37 = lista30.primeiro;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        lista30.item = objArray42;
        lista7.item = objArray42;
        lista3.insere((java.lang.Object) lista7);
        lista7.pos = ' ';
        lista7.imprime();
        lista7.ultimo = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        int int53 = lista0.primeiro;
        int int54 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        int int3 = lista0.primeiro;
        lista0.pos = (short) 100;
        ds.Lista lista6 = new ds.Lista();
        boolean boolean7 = lista6.vazia();
        lista6.primeiro = '#';
        int int10 = lista6.pos;
        java.lang.Object[] objArray11 = null;
        lista6.item = objArray11;
        lista6.imprime();
        lista6.primeiro = '4';
        lista6.imprime();
        int int17 = lista6.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista18.insere((java.lang.Object) '#');
        lista18.imprime();
        int int22 = lista18.primeiro;
        java.lang.Object[] objArray23 = lista18.item;
        lista6.item = objArray23;
        java.lang.Object[] objArray25 = lista6.item;
        java.lang.Object[] objArray26 = lista6.item;
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        java.lang.Object[] objArray7 = lista4.item;
        lista0.item = objArray7;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.primeiro;
        lista0.imprime();
        int int14 = lista0.primeiro;
        ds.Lista lista15 = new ds.Lista();
        lista15.insere((java.lang.Object) '#');
        int int18 = lista15.ultimo;
        int int19 = lista15.primeiro;
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) '#');
        lista20.imprime();
        int int24 = lista20.primeiro;
        java.lang.Object[] objArray25 = lista20.item;
        lista20.primeiro = 0;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.pos = ' ';
        lista28.ultimo = (byte) -1;
        lista20.insere((java.lang.Object) lista28);
        lista15.insere((java.lang.Object) lista28);
        lista28.imprime();
        java.lang.Object[] objArray37 = lista28.item;
        lista0.item = objArray37;
        boolean boolean39 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        java.lang.Object[] objArray26 = lista24.item;
        lista24.imprime();
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.pos = ' ';
        lista28.pos = (byte) 0;
        lista28.pos = '4';
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        lista36.primeiro = '#';
        int int40 = lista36.pos;
        int int41 = lista36.ultimo;
        ds.Lista lista42 = new ds.Lista();
        lista36.insere((java.lang.Object) lista42);
        ds.Lista lista44 = new ds.Lista();
        java.lang.Object[] objArray45 = lista44.item;
        int int46 = lista44.pos;
        ds.Lista lista47 = new ds.Lista();
        java.lang.Object[] objArray48 = lista47.item;
        lista44.item = objArray48;
        java.lang.Object[] objArray50 = lista44.item;
        lista42.item = objArray50;
        lista28.insere((java.lang.Object) objArray50);
        lista24.item = objArray50;
        lista6.insere((java.lang.Object) objArray50);
        lista6.pos = 0;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista58 = new ds.Lista();
        int int59 = lista58.primeiro;
        lista58.pos = ' ';
        lista58.pos = 0;
        lista58.ultimo = 'a';
        boolean boolean66 = lista58.vazia();
        int int67 = lista58.ultimo;
        int int68 = lista58.pos;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        int int71 = lista69.pos;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        lista69.item = objArray73;
        lista58.item = objArray73;
        lista6.insere((java.lang.Object) objArray73);
        java.lang.Object[] objArray77 = lista6.item;
        int int78 = lista6.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        java.lang.Object[] objArray14 = lista8.item;
        lista6.item = objArray14;
        lista6.ultimo = (byte) 100;
        int int18 = lista6.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        int int12 = lista0.pos;
        boolean boolean13 = lista0.vazia();
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.pos;
        int int16 = lista0.ultimo;
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        lista15.ultimo = (byte) 10;
        java.lang.Object[] objArray25 = lista15.item;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        int int33 = lista26.primeiro;
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        int int36 = lista34.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista34.item = objArray38;
        lista26.item = objArray38;
        boolean boolean41 = lista26.vazia();
        lista26.insere((java.lang.Object) 10L);
        lista26.imprime();
        java.lang.Object obj45 = null;
        lista26.insere(obj45);
        lista26.pos = (short) 0;
        java.lang.Object[] objArray49 = lista26.item;
        lista15.item = objArray49;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 1);
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.pos = 100;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        int int23 = lista15.ultimo;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.primeiro;
        lista28.pos = ' ';
        lista28.pos = 0;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.primeiro = '#';
        int int38 = lista34.pos;
        int int39 = lista34.ultimo;
        ds.Lista lista40 = new ds.Lista();
        lista34.insere((java.lang.Object) lista40);
        ds.Lista lista42 = new ds.Lista();
        java.lang.Object[] objArray43 = lista42.item;
        int int44 = lista42.pos;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista42.item = objArray46;
        java.lang.Object[] objArray48 = lista42.item;
        lista40.item = objArray48;
        lista28.item = objArray48;
        ds.Lista lista51 = new ds.Lista();
        boolean boolean52 = lista51.vazia();
        lista51.primeiro = '#';
        int int55 = lista51.pos;
        java.lang.Object[] objArray56 = null;
        lista51.item = objArray56;
        int int58 = lista51.primeiro;
        ds.Lista lista59 = new ds.Lista();
        java.lang.Object[] objArray60 = lista59.item;
        int int61 = lista59.pos;
        ds.Lista lista62 = new ds.Lista();
        java.lang.Object[] objArray63 = lista62.item;
        lista59.item = objArray63;
        lista51.item = objArray63;
        lista28.item = objArray63;
        lista24.insere((java.lang.Object) lista28);
        lista24.imprime();
        java.lang.Object[] objArray69 = lista24.item;
        lista24.ultimo = (short) 1;
        lista15.insere((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass73 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        int int9 = lista0.primeiro;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.pos = ' ';
        lista14.pos = 0;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        int int25 = lista20.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista20.insere((java.lang.Object) lista26);
        ds.Lista lista28 = new ds.Lista();
        java.lang.Object[] objArray29 = lista28.item;
        int int30 = lista28.pos;
        ds.Lista lista31 = new ds.Lista();
        java.lang.Object[] objArray32 = lista31.item;
        lista28.item = objArray32;
        java.lang.Object[] objArray34 = lista28.item;
        lista26.item = objArray34;
        lista14.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        boolean boolean38 = lista37.vazia();
        lista37.primeiro = '#';
        int int41 = lista37.pos;
        java.lang.Object[] objArray42 = null;
        lista37.item = objArray42;
        int int44 = lista37.primeiro;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        int int47 = lista45.pos;
        ds.Lista lista48 = new ds.Lista();
        java.lang.Object[] objArray49 = lista48.item;
        lista45.item = objArray49;
        lista37.item = objArray49;
        lista14.item = objArray49;
        lista10.insere((java.lang.Object) lista14);
        lista10.imprime();
        java.lang.Object[] objArray55 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        boolean boolean57 = lista10.vazia();
        java.lang.Class<?> wildcardClass58 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.ultimo = (short) 100;
        ds.Lista lista46 = new ds.Lista();
        boolean boolean47 = lista46.vazia();
        lista46.primeiro = '#';
        int int50 = lista46.pos;
        int int51 = lista46.ultimo;
        ds.Lista lista52 = new ds.Lista();
        lista46.insere((java.lang.Object) lista52);
        ds.Lista lista54 = new ds.Lista();
        java.lang.Object[] objArray55 = lista54.item;
        int int56 = lista54.pos;
        ds.Lista lista57 = new ds.Lista();
        java.lang.Object[] objArray58 = lista57.item;
        lista54.item = objArray58;
        int int60 = lista54.primeiro;
        lista54.pos = 52;
        int int63 = lista54.primeiro;
        boolean boolean64 = lista54.vazia();
        lista52.insere((java.lang.Object) lista54);
        java.lang.Object[] objArray66 = lista54.item;
        lista0.item = objArray66;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.primeiro;
        lista0.pos = 32;
        lista0.pos = (byte) 10;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.imprime();
        boolean boolean11 = lista0.vazia();
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.primeiro;
        lista23.pos = ' ';
        lista23.pos = 0;
        ds.Lista lista29 = new ds.Lista();
        boolean boolean30 = lista29.vazia();
        lista29.primeiro = '#';
        int int33 = lista29.pos;
        int int34 = lista29.ultimo;
        ds.Lista lista35 = new ds.Lista();
        lista29.insere((java.lang.Object) lista35);
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        int int39 = lista37.pos;
        ds.Lista lista40 = new ds.Lista();
        java.lang.Object[] objArray41 = lista40.item;
        lista37.item = objArray41;
        java.lang.Object[] objArray43 = lista37.item;
        lista35.item = objArray43;
        lista23.item = objArray43;
        int int46 = lista23.pos;
        lista23.ultimo = (short) -1;
        lista15.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        java.lang.Object[] objArray14 = lista8.item;
        lista6.item = objArray14;
        lista6.ultimo = 1;
        java.lang.Class<?> wildcardClass18 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        lista0.pos = 52;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 0;
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 2;
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        int int13 = lista11.pos;
        java.lang.Object[] objArray14 = lista11.item;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        lista2.imprime();
        lista2.primeiro = '4';
        lista2.imprime();
        int int13 = lista2.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista14.insere((java.lang.Object) '#');
        lista14.imprime();
        int int18 = lista14.primeiro;
        java.lang.Object[] objArray19 = lista14.item;
        lista2.item = objArray19;
        java.lang.Object[] objArray21 = lista2.item;
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        java.lang.Object[] objArray11 = lista9.item;
        java.lang.Object[] objArray12 = lista9.item;
        lista0.item = objArray12;
        int int14 = lista0.primeiro;
        boolean boolean15 = lista0.vazia();
        java.lang.Object[] objArray16 = null;
        lista0.item = objArray16;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.imprime();
        lista0.pos = 35;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.ultimo;
        lista0.primeiro = 97;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        java.lang.Class<?> wildcardClass9 = objArray7.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        lista0.primeiro = (short) 0;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        java.lang.Object[] objArray19 = lista17.item;
        java.lang.Object[] objArray20 = null;
        lista17.item = objArray20;
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.primeiro = '#';
        int int26 = lista22.pos;
        int int27 = lista22.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista22.insere((java.lang.Object) lista28);
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        int int32 = lista30.ultimo;
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        ds.Lista lista36 = new ds.Lista();
        boolean boolean37 = lista36.vazia();
        lista36.primeiro = '#';
        int int40 = lista36.pos;
        java.lang.Object[] objArray41 = null;
        lista36.item = objArray41;
        lista36.imprime();
        lista36.primeiro = '4';
        boolean boolean46 = lista36.vazia();
        java.lang.Object[] objArray47 = new java.lang.Object[] { lista28, int32, 35, lista34, lista36 };
        lista17.item = objArray47;
        lista0.item = objArray47;
        boolean boolean50 = lista0.vazia();
        int int51 = lista0.primeiro;
        int int52 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        lista0.imprime();
        int int7 = lista0.primeiro;
        lista0.pos = (byte) -1;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.primeiro;
        lista11.pos = ' ';
        lista11.pos = (byte) 0;
        lista11.pos = '4';
        lista11.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) '#');
        int int23 = lista20.ultimo;
        lista20.pos = 52;
        lista20.primeiro = 32;
        lista20.primeiro = 0;
        int int30 = lista20.ultimo;
        lista11.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass32 = lista11.getClass();
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.insere((java.lang.Object) (-1L));
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        int int44 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        lista0.primeiro = (short) 0;
        lista0.ultimo = '#';
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.pos = 1;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        int int14 = lista12.pos;
        int int15 = lista12.primeiro;
        lista0.insere((java.lang.Object) int15);
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = lista26.item;
        lista26.pos = 100;
        java.lang.Object[] objArray32 = lista26.item;
        lista0.item = objArray32;
        ds.Lista lista34 = new ds.Lista();
        boolean boolean35 = lista34.vazia();
        lista34.primeiro = '#';
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.primeiro;
        lista38.pos = ' ';
        lista38.pos = 0;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        int int48 = lista44.pos;
        int int49 = lista44.ultimo;
        ds.Lista lista50 = new ds.Lista();
        lista44.insere((java.lang.Object) lista50);
        ds.Lista lista52 = new ds.Lista();
        java.lang.Object[] objArray53 = lista52.item;
        int int54 = lista52.pos;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        lista52.item = objArray56;
        java.lang.Object[] objArray58 = lista52.item;
        lista50.item = objArray58;
        lista38.item = objArray58;
        ds.Lista lista61 = new ds.Lista();
        boolean boolean62 = lista61.vazia();
        lista61.primeiro = '#';
        int int65 = lista61.pos;
        java.lang.Object[] objArray66 = null;
        lista61.item = objArray66;
        int int68 = lista61.primeiro;
        ds.Lista lista69 = new ds.Lista();
        java.lang.Object[] objArray70 = lista69.item;
        int int71 = lista69.pos;
        ds.Lista lista72 = new ds.Lista();
        java.lang.Object[] objArray73 = lista72.item;
        lista69.item = objArray73;
        lista61.item = objArray73;
        lista38.item = objArray73;
        lista34.insere((java.lang.Object) lista38);
        lista34.imprime();
        java.lang.Object[] objArray79 = lista34.item;
        lista34.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista34);
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 35 + "'", int68 == 35);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(objArray79);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        java.lang.Object[] objArray7 = lista0.item;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        int int23 = lista15.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        ds.Lista lista2 = new ds.Lista();
        lista2.insere((java.lang.Object) '#');
        int int5 = lista2.ultimo;
        java.lang.Object[] objArray6 = lista2.item;
        lista0.item = objArray6;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.imprime();
        lista0.primeiro = 0;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        lista9.pos = ' ';
        lista9.pos = (byte) 0;
        lista9.pos = (short) 10;
        lista9.primeiro = 35;
        lista9.insere((java.lang.Object) (short) 1);
        ds.Lista lista21 = new ds.Lista();
        boolean boolean22 = lista21.vazia();
        lista21.primeiro = '#';
        lista21.primeiro = (short) 0;
        lista21.insere((java.lang.Object) (-1L));
        ds.Lista lista29 = new ds.Lista();
        lista29.insere((java.lang.Object) '#');
        int int32 = lista29.ultimo;
        java.lang.Object[] objArray33 = lista29.item;
        lista21.item = objArray33;
        java.lang.Object[] objArray35 = lista21.item;
        lista9.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) '#');
        lista38.imprime();
        int int42 = lista38.pos;
        int int43 = lista38.primeiro;
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        ds.Lista lista46 = new ds.Lista();
        lista46.insere((java.lang.Object) '#');
        int int49 = lista46.ultimo;
        java.lang.Object[] objArray50 = lista46.item;
        lista44.item = objArray50;
        lista38.item = objArray50;
        lista0.item = objArray50;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.pos = 0;
        lista8.ultimo = 'a';
        ds.Lista lista16 = new ds.Lista();
        lista16.insere((java.lang.Object) '#');
        lista16.imprime();
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        lista20.pos = ' ';
        lista20.pos = 0;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        int int31 = lista26.ultimo;
        ds.Lista lista32 = new ds.Lista();
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista34 = new ds.Lista();
        java.lang.Object[] objArray35 = lista34.item;
        int int36 = lista34.pos;
        ds.Lista lista37 = new ds.Lista();
        java.lang.Object[] objArray38 = lista37.item;
        lista34.item = objArray38;
        java.lang.Object[] objArray40 = lista34.item;
        lista32.item = objArray40;
        lista20.item = objArray40;
        lista16.item = objArray40;
        lista8.item = objArray40;
        lista8.primeiro = (byte) 100;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Class<?> wildcardClass48 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        int int26 = lista0.pos;
        int int27 = lista0.pos;
        java.lang.Object[] objArray28 = null;
        lista0.item = objArray28;
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        boolean boolean4 = lista0.vazia();
        lista0.pos = 10;
        lista0.pos = '4';
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista0.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        lista14.item = objArray18;
        int int20 = lista14.ultimo;
        lista14.imprime();
        ds.Lista lista22 = new ds.Lista();
        boolean boolean23 = lista22.vazia();
        lista22.primeiro = '#';
        int int26 = lista22.pos;
        java.lang.Object[] objArray27 = null;
        lista22.item = objArray27;
        int int29 = lista22.primeiro;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        int int32 = lista30.pos;
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        lista30.item = objArray34;
        lista22.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        lista37.pos = ' ';
        lista37.pos = (byte) 0;
        int int43 = lista37.ultimo;
        lista22.insere((java.lang.Object) lista37);
        java.lang.Object[] objArray45 = lista22.item;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.primeiro;
        lista46.pos = ' ';
        lista46.pos = 0;
        ds.Lista lista52 = new ds.Lista();
        boolean boolean53 = lista52.vazia();
        lista52.primeiro = '#';
        int int56 = lista52.pos;
        int int57 = lista52.ultimo;
        ds.Lista lista58 = new ds.Lista();
        lista52.insere((java.lang.Object) lista58);
        ds.Lista lista60 = new ds.Lista();
        java.lang.Object[] objArray61 = lista60.item;
        int int62 = lista60.pos;
        ds.Lista lista63 = new ds.Lista();
        java.lang.Object[] objArray64 = lista63.item;
        lista60.item = objArray64;
        java.lang.Object[] objArray66 = lista60.item;
        lista58.item = objArray66;
        lista46.item = objArray66;
        ds.Lista lista69 = new ds.Lista();
        boolean boolean70 = lista69.vazia();
        lista69.primeiro = '#';
        int int73 = lista69.pos;
        java.lang.Object[] objArray74 = null;
        lista69.item = objArray74;
        int int76 = lista69.primeiro;
        ds.Lista lista77 = new ds.Lista();
        java.lang.Object[] objArray78 = lista77.item;
        int int79 = lista77.pos;
        ds.Lista lista80 = new ds.Lista();
        java.lang.Object[] objArray81 = lista80.item;
        lista77.item = objArray81;
        lista69.item = objArray81;
        lista46.item = objArray81;
        lista22.item = objArray81;
        java.lang.Object[] objArray86 = new java.lang.Object[] { lista22 };
        lista14.item = objArray86;
        lista0.item = objArray86;
        lista0.ultimo = 32;
        java.lang.Object[] objArray91 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 35 + "'", int76 == 35);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        boolean boolean15 = lista0.vazia();
        lista0.primeiro = 35;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista0.imprime();
        java.lang.Object[] objArray45 = lista0.item;
        int int46 = lista0.pos;
        java.lang.Object[] objArray47 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        boolean boolean4 = lista3.vazia();
        lista3.primeiro = '#';
        int int7 = lista3.pos;
        java.lang.Object[] objArray8 = null;
        lista3.item = objArray8;
        int int10 = lista3.primeiro;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        int int13 = lista11.pos;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista11.item = objArray15;
        lista3.item = objArray15;
        boolean boolean18 = lista3.vazia();
        lista3.insere((java.lang.Object) 10L);
        lista3.imprime();
        int int22 = lista3.primeiro;
        lista0.insere((java.lang.Object) int22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        int int21 = lista13.pos;
        java.lang.Object[] objArray22 = lista13.item;
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        int int27 = lista23.pos;
        java.lang.Object[] objArray28 = null;
        lista23.item = objArray28;
        lista23.imprime();
        lista23.primeiro = '4';
        lista23.imprime();
        int int34 = lista23.ultimo;
        ds.Lista lista35 = new ds.Lista();
        lista35.insere((java.lang.Object) '#');
        lista35.imprime();
        int int39 = lista35.primeiro;
        java.lang.Object[] objArray40 = lista35.item;
        lista23.item = objArray40;
        lista13.item = objArray40;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        lista0.imprime();
        int int9 = lista0.primeiro;
        lista0.primeiro = ' ';
        lista0.ultimo = (short) 100;
        lista0.ultimo = 101;
        java.lang.Object[] objArray16 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        lista0.imprime();
        lista0.imprime();
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista11.ultimo = (-1);
        boolean boolean15 = lista11.vazia();
        int int16 = lista11.ultimo;
        lista0.insere((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = (byte) 0;
        lista4.pos = '4';
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        int int22 = lista20.pos;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista20.item = objArray24;
        java.lang.Object[] objArray26 = lista20.item;
        lista18.item = objArray26;
        lista4.insere((java.lang.Object) objArray26);
        lista0.item = objArray26;
        lista0.ultimo = 1;
        ds.Lista lista32 = new ds.Lista();
        boolean boolean33 = lista32.vazia();
        lista32.primeiro = '#';
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.primeiro;
        lista36.pos = ' ';
        lista36.pos = 0;
        ds.Lista lista42 = new ds.Lista();
        boolean boolean43 = lista42.vazia();
        lista42.primeiro = '#';
        int int46 = lista42.pos;
        int int47 = lista42.ultimo;
        ds.Lista lista48 = new ds.Lista();
        lista42.insere((java.lang.Object) lista48);
        ds.Lista lista50 = new ds.Lista();
        java.lang.Object[] objArray51 = lista50.item;
        int int52 = lista50.pos;
        ds.Lista lista53 = new ds.Lista();
        java.lang.Object[] objArray54 = lista53.item;
        lista50.item = objArray54;
        java.lang.Object[] objArray56 = lista50.item;
        lista48.item = objArray56;
        lista36.item = objArray56;
        ds.Lista lista59 = new ds.Lista();
        boolean boolean60 = lista59.vazia();
        lista59.primeiro = '#';
        int int63 = lista59.pos;
        java.lang.Object[] objArray64 = null;
        lista59.item = objArray64;
        int int66 = lista59.primeiro;
        ds.Lista lista67 = new ds.Lista();
        java.lang.Object[] objArray68 = lista67.item;
        int int69 = lista67.pos;
        ds.Lista lista70 = new ds.Lista();
        java.lang.Object[] objArray71 = lista70.item;
        lista67.item = objArray71;
        lista59.item = objArray71;
        lista36.item = objArray71;
        lista32.insere((java.lang.Object) lista36);
        lista32.imprime();
        java.lang.Object[] objArray77 = lista32.item;
        lista0.item = objArray77;
        ds.Lista lista79 = new ds.Lista();
        boolean boolean80 = lista79.vazia();
        boolean boolean81 = lista79.vazia();
        lista79.insere((java.lang.Object) (short) 100);
        ds.Lista lista84 = new ds.Lista();
        lista84.imprime();
        java.lang.Object[] objArray86 = lista84.item;
        lista79.item = objArray86;
        lista0.insere((java.lang.Object) objArray86);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 35 + "'", int66 == 35);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objArray86);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray8 = lista7.item;
        int int9 = lista7.primeiro;
        java.lang.Object[] objArray10 = new java.lang.Object[] { (-1.0d), 10.0f, int9 };
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = (short) 10;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        int int10 = lista7.primeiro;
        java.lang.Object[] objArray11 = null;
        lista7.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        java.lang.Object[] objArray15 = lista13.item;
        java.lang.Object[] objArray16 = lista13.item;
        lista7.item = objArray16;
        lista0.insere((java.lang.Object) objArray16);
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = (short) 10;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        lista7.ultimo = 'a';
        boolean boolean15 = lista7.vazia();
        int int16 = lista7.ultimo;
        int int17 = lista7.pos;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        lista7.item = objArray22;
        lista0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 101;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray15 = lista0.item;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = 2;
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) '#');
        lista9.imprime();
        int int13 = lista9.primeiro;
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = 0;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.pos = ' ';
        lista17.ultimo = (byte) -1;
        lista9.insere((java.lang.Object) lista17);
        lista9.primeiro = (short) 0;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        java.lang.Object[] objArray28 = lista26.item;
        java.lang.Object[] objArray29 = null;
        lista26.item = objArray29;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.primeiro = '#';
        int int35 = lista31.pos;
        int int36 = lista31.ultimo;
        ds.Lista lista37 = new ds.Lista();
        lista31.insere((java.lang.Object) lista37);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        int int41 = lista39.ultimo;
        ds.Lista lista43 = new ds.Lista();
        lista43.imprime();
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        lista45.primeiro = '#';
        int int49 = lista45.pos;
        java.lang.Object[] objArray50 = null;
        lista45.item = objArray50;
        lista45.imprime();
        lista45.primeiro = '4';
        boolean boolean55 = lista45.vazia();
        java.lang.Object[] objArray56 = new java.lang.Object[] { lista37, int41, 35, lista43, lista45 };
        lista26.item = objArray56;
        lista9.item = objArray56;
        int int59 = lista9.primeiro;
        int int60 = lista9.primeiro;
        java.lang.Object[] objArray61 = lista9.item;
        lista0.item = objArray61;
        java.lang.Class<?> wildcardClass63 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.pos = ' ';
        lista7.pos = 0;
        lista0.insere((java.lang.Object) lista7);
        int int14 = lista7.pos;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        int int11 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray7 = lista6.item;
        int int8 = lista6.pos;
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray10 = lista9.item;
        lista6.item = objArray10;
        java.lang.Object[] objArray12 = lista6.item;
        int int13 = lista6.primeiro;
        lista6.ultimo = 10;
        lista6.pos = 97;
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        lista0.primeiro = (byte) 100;
        ds.Lista lista39 = new ds.Lista();
        boolean boolean40 = lista39.vazia();
        lista39.primeiro = '#';
        int int43 = lista39.pos;
        java.lang.Object[] objArray44 = null;
        lista39.item = objArray44;
        java.lang.Object[] objArray46 = lista39.item;
        boolean boolean47 = lista39.vazia();
        lista0.insere((java.lang.Object) lista39);
        lista39.ultimo = 10;
        int int51 = lista39.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        lista0.ultimo = '4';
        lista0.pos = '#';
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        java.lang.Object[] objArray11 = lista9.item;
        lista9.imprime();
        boolean boolean13 = lista9.vazia();
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        lista2.primeiro = '#';
        int int6 = lista2.pos;
        java.lang.Object[] objArray7 = null;
        lista2.item = objArray7;
        int int9 = lista2.primeiro;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        lista2.item = objArray14;
        lista0.item = objArray14;
        int int18 = lista0.ultimo;
        ds.Lista lista19 = new ds.Lista();
        boolean boolean20 = lista19.vazia();
        lista19.primeiro = '#';
        int int23 = lista19.pos;
        java.lang.Object[] objArray24 = null;
        lista19.item = objArray24;
        lista19.imprime();
        lista19.primeiro = '4';
        boolean boolean29 = lista19.vazia();
        java.lang.Object[] objArray30 = lista19.item;
        int int31 = lista19.ultimo;
        lista19.primeiro = 1;
        lista0.insere((java.lang.Object) lista19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(objArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        lista0.ultimo = (short) 10;
        lista0.pos = 101;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        lista0.imprime();
        int int24 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray6 = lista5.item;
        int int7 = lista5.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        java.lang.Object[] objArray12 = lista10.item;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 0L, '#', lista10 };
        lista5.item = objArray13;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        int int46 = lista4.pos;
        lista4.pos = '#';
        int int49 = lista4.pos;
        java.lang.Object[] objArray50 = lista4.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(objArray50);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.insere((java.lang.Object) '#');
        lista9.imprime();
        int int13 = lista9.primeiro;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        int int16 = lista14.pos;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.primeiro;
        java.lang.Object[] objArray20 = lista18.item;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.primeiro;
        java.lang.Object[] objArray23 = lista21.item;
        java.lang.Object[] objArray24 = null;
        lista21.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        int int31 = lista26.ultimo;
        ds.Lista lista32 = new ds.Lista();
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        int int36 = lista34.ultimo;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        ds.Lista lista40 = new ds.Lista();
        boolean boolean41 = lista40.vazia();
        lista40.primeiro = '#';
        int int44 = lista40.pos;
        java.lang.Object[] objArray45 = null;
        lista40.item = objArray45;
        lista40.imprime();
        lista40.primeiro = '4';
        boolean boolean50 = lista40.vazia();
        java.lang.Object[] objArray51 = new java.lang.Object[] { lista32, int36, 35, lista38, lista40 };
        lista21.item = objArray51;
        ds.Lista lista53 = new ds.Lista();
        lista53.insere((java.lang.Object) '#');
        int int56 = lista53.ultimo;
        int int57 = lista53.primeiro;
        ds.Lista lista58 = new ds.Lista();
        boolean boolean59 = lista58.vazia();
        lista58.primeiro = '#';
        java.lang.Object[] objArray62 = new java.lang.Object[] { (-1.0d), objArray20, objArray51, int57, '#' };
        lista14.item = objArray20;
        lista9.item = objArray20;
        lista0.item = objArray20;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray62);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        lista0.pos = 52;
        lista0.primeiro = 32;
        lista0.primeiro = 0;
        int int10 = lista0.ultimo;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        boolean boolean25 = lista24.vazia();
        lista24.primeiro = '#';
        int int28 = lista24.pos;
        java.lang.Object[] objArray29 = null;
        lista24.item = objArray29;
        int int31 = lista24.primeiro;
        ds.Lista lista32 = new ds.Lista();
        java.lang.Object[] objArray33 = lista32.item;
        int int34 = lista32.pos;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        lista32.item = objArray36;
        lista24.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.pos = ' ';
        lista39.pos = (byte) 0;
        int int45 = lista39.ultimo;
        lista24.insere((java.lang.Object) lista39);
        java.lang.Object[] objArray47 = lista24.item;
        lista0.insere((java.lang.Object) lista24);
        int int49 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass51 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.imprime();
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        int int6 = lista0.ultimo;
        lista0.primeiro = (byte) 10;
        lista0.pos = ' ';
        ds.Lista lista11 = new ds.Lista();
        boolean boolean12 = lista11.vazia();
        boolean boolean13 = lista11.vazia();
        lista11.insere((java.lang.Object) (short) 100);
        int int16 = lista11.primeiro;
        int int17 = lista11.primeiro;
        lista11.ultimo = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        boolean boolean21 = lista20.vazia();
        lista20.primeiro = '#';
        int int24 = lista20.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        int int29 = lista27.primeiro;
        java.lang.Object[] objArray30 = new java.lang.Object[] { (-1.0d), 10.0f, int29 };
        lista20.item = objArray30;
        lista20.imprime();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray34 = lista33.item;
        int int35 = lista33.pos;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.primeiro;
        java.lang.Object[] objArray39 = lista37.item;
        ds.Lista lista40 = new ds.Lista();
        int int41 = lista40.primeiro;
        java.lang.Object[] objArray42 = lista40.item;
        java.lang.Object[] objArray43 = null;
        lista40.item = objArray43;
        ds.Lista lista45 = new ds.Lista();
        boolean boolean46 = lista45.vazia();
        lista45.primeiro = '#';
        int int49 = lista45.pos;
        int int50 = lista45.ultimo;
        ds.Lista lista51 = new ds.Lista();
        lista45.insere((java.lang.Object) lista51);
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        int int55 = lista53.ultimo;
        ds.Lista lista57 = new ds.Lista();
        lista57.imprime();
        ds.Lista lista59 = new ds.Lista();
        boolean boolean60 = lista59.vazia();
        lista59.primeiro = '#';
        int int63 = lista59.pos;
        java.lang.Object[] objArray64 = null;
        lista59.item = objArray64;
        lista59.imprime();
        lista59.primeiro = '4';
        boolean boolean69 = lista59.vazia();
        java.lang.Object[] objArray70 = new java.lang.Object[] { lista51, int55, 35, lista57, lista59 };
        lista40.item = objArray70;
        ds.Lista lista72 = new ds.Lista();
        lista72.insere((java.lang.Object) '#');
        int int75 = lista72.ultimo;
        int int76 = lista72.primeiro;
        ds.Lista lista77 = new ds.Lista();
        boolean boolean78 = lista77.vazia();
        lista77.primeiro = '#';
        java.lang.Object[] objArray81 = new java.lang.Object[] { (-1.0d), objArray39, objArray70, int76, '#' };
        lista33.item = objArray39;
        java.lang.Object[] objArray83 = lista33.item;
        lista20.item = objArray83;
        lista11.item = objArray83;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[-1.0, 10.0, 0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray83);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        boolean boolean15 = lista0.vazia();
        lista0.primeiro = 35;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.ultimo = (byte) 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray22 = lista7.item;
        lista0.item = objArray22;
        java.lang.Object[] objArray24 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.pos = ' ';
        lista4.pos = 0;
        ds.Lista lista10 = new ds.Lista();
        boolean boolean11 = lista10.vazia();
        lista10.primeiro = '#';
        int int14 = lista10.pos;
        int int15 = lista10.ultimo;
        ds.Lista lista16 = new ds.Lista();
        lista10.insere((java.lang.Object) lista16);
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        int int20 = lista18.pos;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista18.item = objArray22;
        java.lang.Object[] objArray24 = lista18.item;
        lista16.item = objArray24;
        lista4.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        boolean boolean28 = lista27.vazia();
        lista27.primeiro = '#';
        int int31 = lista27.pos;
        java.lang.Object[] objArray32 = null;
        lista27.item = objArray32;
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        java.lang.Object[] objArray36 = lista35.item;
        int int37 = lista35.pos;
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        lista35.item = objArray39;
        lista27.item = objArray39;
        lista4.item = objArray39;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = ' ';
        lista4.imprime();
        lista4.ultimo = (byte) 100;
        lista4.pos = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray39);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        java.lang.Object[] objArray6 = lista4.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        java.lang.Object[] objArray9 = lista7.item;
        java.lang.Object[] objArray10 = null;
        lista7.item = objArray10;
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        int int16 = lista12.pos;
        int int17 = lista12.ultimo;
        ds.Lista lista18 = new ds.Lista();
        lista12.insere((java.lang.Object) lista18);
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        ds.Lista lista26 = new ds.Lista();
        boolean boolean27 = lista26.vazia();
        lista26.primeiro = '#';
        int int30 = lista26.pos;
        java.lang.Object[] objArray31 = null;
        lista26.item = objArray31;
        lista26.imprime();
        lista26.primeiro = '4';
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = new java.lang.Object[] { lista18, int22, 35, lista24, lista26 };
        lista7.item = objArray37;
        ds.Lista lista39 = new ds.Lista();
        lista39.insere((java.lang.Object) '#');
        int int42 = lista39.ultimo;
        int int43 = lista39.primeiro;
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1.0d), objArray6, objArray37, int43, '#' };
        lista0.item = objArray6;
        lista0.pos = ' ';
        int int52 = lista0.ultimo;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        lista0.primeiro = (short) 0;
        ds.Lista lista17 = new ds.Lista();
        java.lang.Object[] objArray18 = lista17.item;
        int int19 = lista17.pos;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray21 = lista20.item;
        lista17.item = objArray21;
        lista17.imprime();
        lista0.insere((java.lang.Object) lista17);
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = (short) 10;
        lista0.primeiro = 35;
        lista0.insere((java.lang.Object) (short) 1);
        ds.Lista lista12 = new ds.Lista();
        boolean boolean13 = lista12.vazia();
        lista12.primeiro = '#';
        lista12.primeiro = (short) 0;
        lista12.insere((java.lang.Object) (-1L));
        ds.Lista lista20 = new ds.Lista();
        lista20.insere((java.lang.Object) '#');
        int int23 = lista20.ultimo;
        java.lang.Object[] objArray24 = lista20.item;
        lista12.item = objArray24;
        java.lang.Object[] objArray26 = lista12.item;
        lista0.insere((java.lang.Object) objArray26);
        int int28 = lista0.pos;
        boolean boolean29 = lista0.vazia();
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = 0;
        lista0.ultimo = 'a';
        ds.Lista lista8 = new ds.Lista();
        lista8.insere((java.lang.Object) '#');
        lista8.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.pos = ' ';
        lista12.pos = 0;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        lista18.primeiro = '#';
        int int22 = lista18.pos;
        int int23 = lista18.ultimo;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista26 = new ds.Lista();
        java.lang.Object[] objArray27 = lista26.item;
        int int28 = lista26.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        lista26.item = objArray30;
        java.lang.Object[] objArray32 = lista26.item;
        lista24.item = objArray32;
        lista12.item = objArray32;
        lista8.item = objArray32;
        lista0.item = objArray32;
        lista0.primeiro = (byte) 100;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.pos = ' ';
        lista8.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista8);
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        lista16.primeiro = 10;
        java.lang.Object[] objArray21 = lista16.item;
        lista8.item = objArray21;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        ds.Lista lista9 = new ds.Lista();
        boolean boolean10 = lista9.vazia();
        int int11 = lista9.primeiro;
        int int12 = lista9.pos;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int15 = lista9.pos;
        boolean boolean16 = lista9.vazia();
        int int17 = lista9.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.insere((java.lang.Object) '#');
        lista5.imprime();
        int int9 = lista5.primeiro;
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = 0;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.primeiro;
        lista13.pos = ' ';
        lista13.ultimo = (byte) -1;
        lista5.insere((java.lang.Object) lista13);
        lista0.insere((java.lang.Object) lista13);
        int int21 = lista13.pos;
        lista13.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        int int8 = lista5.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        java.lang.Object[] objArray11 = lista9.item;
        java.lang.Object[] objArray12 = null;
        lista9.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        lista14.primeiro = '#';
        int int18 = lista14.pos;
        int int19 = lista14.ultimo;
        ds.Lista lista20 = new ds.Lista();
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        int int24 = lista22.ultimo;
        ds.Lista lista26 = new ds.Lista();
        lista26.imprime();
        ds.Lista lista28 = new ds.Lista();
        boolean boolean29 = lista28.vazia();
        lista28.primeiro = '#';
        int int32 = lista28.pos;
        java.lang.Object[] objArray33 = null;
        lista28.item = objArray33;
        lista28.imprime();
        lista28.primeiro = '4';
        boolean boolean38 = lista28.vazia();
        java.lang.Object[] objArray39 = new java.lang.Object[] { lista20, int24, 35, lista26, lista28 };
        lista9.item = objArray39;
        lista5.item = objArray39;
        lista5.imprime();
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista44 = new ds.Lista();
        boolean boolean45 = lista44.vazia();
        lista44.primeiro = '#';
        lista44.primeiro = (short) 0;
        lista44.ultimo = '#';
        lista44.ultimo = (short) 1;
        java.lang.Object[] objArray54 = lista44.item;
        lista5.item = objArray54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.ultimo = (-1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        java.lang.Object[] objArray13 = null;
        lista8.item = objArray13;
        int int15 = lista8.primeiro;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        lista8.item = objArray20;
        lista6.item = objArray20;
        lista0.item = objArray20;
        int int25 = lista0.pos;
        int int26 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.ultimo = 0;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        ds.Lista lista10 = new ds.Lista();
        lista10.insere((java.lang.Object) '#');
        int int13 = lista10.ultimo;
        java.lang.Object[] objArray14 = lista10.item;
        lista8.item = objArray14;
        lista0.insere((java.lang.Object) lista8);
        int int17 = lista8.primeiro;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.primeiro;
        java.lang.Object[] objArray20 = lista18.item;
        int int21 = lista18.primeiro;
        java.lang.Object[] objArray22 = null;
        lista18.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        java.lang.Object[] objArray26 = lista24.item;
        java.lang.Object[] objArray27 = lista24.item;
        lista18.item = objArray27;
        lista8.insere((java.lang.Object) lista18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.insere((java.lang.Object) '#');
        lista6.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.pos = ' ';
        lista10.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        boolean boolean17 = lista16.vazia();
        lista16.primeiro = '#';
        int int20 = lista16.pos;
        int int21 = lista16.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        int int26 = lista24.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista24.item = objArray28;
        java.lang.Object[] objArray30 = lista24.item;
        lista22.item = objArray30;
        lista10.item = objArray30;
        lista6.item = objArray30;
        lista0.insere((java.lang.Object) objArray30);
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.ultimo;
        ds.Lista lista38 = new ds.Lista();
        lista38.insere((java.lang.Object) '#');
        int int41 = lista38.ultimo;
        java.lang.Object[] objArray42 = lista38.item;
        lista35.item = objArray42;
        lista0.item = objArray42;
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 100;
        lista0.ultimo = 32;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray23 = lista0.item;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.pos = ' ';
        lista24.pos = 0;
        ds.Lista lista30 = new ds.Lista();
        boolean boolean31 = lista30.vazia();
        lista30.primeiro = '#';
        int int34 = lista30.pos;
        int int35 = lista30.ultimo;
        ds.Lista lista36 = new ds.Lista();
        lista30.insere((java.lang.Object) lista36);
        ds.Lista lista38 = new ds.Lista();
        java.lang.Object[] objArray39 = lista38.item;
        int int40 = lista38.pos;
        ds.Lista lista41 = new ds.Lista();
        java.lang.Object[] objArray42 = lista41.item;
        lista38.item = objArray42;
        java.lang.Object[] objArray44 = lista38.item;
        lista36.item = objArray44;
        lista24.item = objArray44;
        ds.Lista lista47 = new ds.Lista();
        boolean boolean48 = lista47.vazia();
        lista47.primeiro = '#';
        int int51 = lista47.pos;
        java.lang.Object[] objArray52 = null;
        lista47.item = objArray52;
        int int54 = lista47.primeiro;
        ds.Lista lista55 = new ds.Lista();
        java.lang.Object[] objArray56 = lista55.item;
        int int57 = lista55.pos;
        ds.Lista lista58 = new ds.Lista();
        java.lang.Object[] objArray59 = lista58.item;
        lista55.item = objArray59;
        lista47.item = objArray59;
        lista24.item = objArray59;
        lista0.item = objArray59;
        int int64 = lista0.primeiro;
        ds.Lista lista65 = new ds.Lista();
        int int66 = lista65.primeiro;
        lista65.pos = ' ';
        lista65.pos = (byte) 0;
        lista65.pos = '4';
        ds.Lista lista73 = new ds.Lista();
        boolean boolean74 = lista73.vazia();
        lista73.primeiro = '#';
        int int77 = lista73.pos;
        int int78 = lista73.ultimo;
        ds.Lista lista79 = new ds.Lista();
        lista73.insere((java.lang.Object) lista79);
        ds.Lista lista81 = new ds.Lista();
        java.lang.Object[] objArray82 = lista81.item;
        int int83 = lista81.pos;
        ds.Lista lista84 = new ds.Lista();
        java.lang.Object[] objArray85 = lista84.item;
        lista81.item = objArray85;
        java.lang.Object[] objArray87 = lista81.item;
        lista79.item = objArray87;
        lista65.insere((java.lang.Object) objArray87);
        lista0.item = objArray87;
        int int91 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.insere((java.lang.Object) (byte) 100);
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        lista0.ultimo = ' ';
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        int int12 = lista10.pos;
        ds.Lista lista13 = new ds.Lista();
        java.lang.Object[] objArray14 = lista13.item;
        lista10.item = objArray14;
        int int16 = lista10.ultimo;
        lista10.imprime();
        lista10.primeiro = 1;
        boolean boolean20 = lista10.vazia();
        int int21 = lista10.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.primeiro;
        lista22.pos = ' ';
        lista22.pos = 0;
        int int28 = lista22.ultimo;
        int int29 = lista22.pos;
        int int30 = lista22.pos;
        ds.Lista lista31 = new ds.Lista();
        boolean boolean32 = lista31.vazia();
        lista31.primeiro = '#';
        boolean boolean35 = lista31.vazia();
        lista31.pos = 10;
        java.lang.Object[] objArray38 = lista31.item;
        lista22.item = objArray38;
        lista10.item = objArray38;
        lista0.item = objArray38;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        ds.Lista lista7 = new ds.Lista();
        lista7.insere((java.lang.Object) '#');
        lista7.imprime();
        int int11 = lista7.primeiro;
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = 0;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.ultimo = (byte) -1;
        lista7.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista15);
        lista15.ultimo = (byte) 10;
        java.lang.Object[] objArray25 = lista15.item;
        int int26 = lista15.ultimo;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int25 = lista0.ultimo;
        int int26 = lista0.pos;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        int int29 = lista27.pos;
        ds.Lista lista30 = new ds.Lista();
        java.lang.Object[] objArray31 = lista30.item;
        lista27.item = objArray31;
        int int33 = lista27.ultimo;
        lista27.imprime();
        lista27.primeiro = 1;
        lista27.primeiro = ' ';
        lista27.pos = '#';
        java.lang.Object[] objArray41 = lista27.item;
        lista0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        lista0.imprime();
        lista0.primeiro = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        lista0.primeiro = 1;
        ds.Lista lista15 = new ds.Lista();
        boolean boolean16 = lista15.vazia();
        lista15.primeiro = '#';
        lista15.primeiro = (short) 0;
        lista15.insere((java.lang.Object) (-1L));
        ds.Lista lista23 = new ds.Lista();
        lista23.insere((java.lang.Object) '#');
        int int26 = lista23.ultimo;
        java.lang.Object[] objArray27 = lista23.item;
        lista15.item = objArray27;
        java.lang.Object[] objArray29 = lista15.item;
        lista0.item = objArray29;
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 1;
        lista0.primeiro = ' ';
        lista0.pos = '#';
        java.lang.Object[] objArray14 = lista0.item;
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray16 = lista15.item;
        int int17 = lista15.pos;
        ds.Lista lista18 = new ds.Lista();
        java.lang.Object[] objArray19 = lista18.item;
        lista15.item = objArray19;
        int int21 = lista15.ultimo;
        lista15.imprime();
        lista15.primeiro = 1;
        int int25 = lista15.ultimo;
        java.lang.Object[] objArray26 = lista15.item;
        lista0.item = objArray26;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = 2;
        int int9 = lista0.ultimo;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        lista0.primeiro = '#';
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray9 = lista8.item;
        int int10 = lista8.pos;
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray12 = lista11.item;
        lista8.item = objArray12;
        lista0.item = objArray12;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.pos = ' ';
        lista15.pos = (byte) 0;
        int int21 = lista15.ultimo;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista23 = new ds.Lista();
        boolean boolean24 = lista23.vazia();
        lista23.primeiro = '#';
        lista23.primeiro = (short) 0;
        lista23.insere((java.lang.Object) (-1L));
        lista23.imprime();
        lista0.insere((java.lang.Object) lista23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.pos = ' ';
        lista0.pos = (byte) 0;
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        lista8.primeiro = '#';
        int int12 = lista8.pos;
        int int13 = lista8.ultimo;
        ds.Lista lista14 = new ds.Lista();
        lista8.insere((java.lang.Object) lista14);
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        int int18 = lista16.pos;
        ds.Lista lista19 = new ds.Lista();
        java.lang.Object[] objArray20 = lista19.item;
        lista16.item = objArray20;
        java.lang.Object[] objArray22 = lista16.item;
        lista14.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        java.lang.Object[] objArray25 = lista0.item;
        lista0.pos = ' ';
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        lista0.insere((java.lang.Object) (short) 100);
        int int5 = lista0.ultimo;
        lista0.primeiro = 97;
        lista0.primeiro = '4';
        lista0.primeiro = 0;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        lista0.insere((java.lang.Object) '#');
        lista0.imprime();
        int int4 = lista0.primeiro;
        lista0.pos = (byte) 100;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        boolean boolean2 = lista0.vazia();
        boolean boolean3 = lista0.vazia();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 101;
        java.lang.Object[] objArray9 = null;
        lista0.item = objArray9;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        int int2 = lista0.pos;
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray4 = lista3.item;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = 32;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }
}

