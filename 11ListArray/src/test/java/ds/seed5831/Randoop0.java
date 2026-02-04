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
        ds.Lista lista0 = new ds.Lista();
        java.lang.Class<?> wildcardClass1 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.pos = 0;
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.primeiro = (byte) 10;
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100 };
        lista13.item = objArray21;
        lista0.item = objArray21;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = (-1);
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        int int12 = lista7.pos;
        java.lang.Object[] objArray13 = lista7.item;
        lista7.ultimo = 10;
        lista0.insere((java.lang.Object) lista7);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        lista0.primeiro = (byte) 1;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        java.lang.Class<?> wildcardClass29 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d };
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        int int13 = lista7.primeiro;
        boolean boolean14 = lista7.vazia();
        int int15 = lista7.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        java.lang.Object[] objArray21 = lista16.item;
        int int22 = lista16.primeiro;
        boolean boolean23 = lista16.vazia();
        lista7.insere((java.lang.Object) boolean23);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100 };
        lista6.item = objArray14;
        lista0.item = objArray14;
        java.lang.Class<?> wildcardClass17 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100 };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass25 = objArray21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        java.lang.Class<?> wildcardClass31 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        lista7.primeiro = (byte) -1;
        lista7.insere((java.lang.Object) 35);
        lista7.ultimo = (short) 1;
        lista7.pos = (short) 10;
        int int20 = lista7.pos;
        int int21 = lista7.pos;
        java.lang.Class<?> wildcardClass22 = lista7.getClass();
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        lista0.pos = 100;
        boolean boolean26 = lista0.vazia();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        java.lang.Object[] objArray12 = lista8.item;
        lista0.item = objArray12;
        int int14 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        int int12 = lista7.pos;
        java.lang.Object[] objArray13 = lista7.item;
        lista0.item = objArray13;
        int int15 = lista0.ultimo;
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int15 = lista6.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        java.lang.Object[] objArray34 = lista29.item;
        int int35 = lista29.primeiro;
        lista29.imprime();
        java.lang.Class<?> wildcardClass37 = lista29.getClass();
        lista15.insere((java.lang.Object) wildcardClass37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        java.lang.Object[] objArray24 = lista15.item;
        lista15.ultimo = 52;
        java.lang.Class<?> wildcardClass27 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        lista25.ultimo = 0;
        int int29 = lista25.pos;
        java.lang.Object obj30 = null;
        lista25.insere(obj30);
        lista15.insere((java.lang.Object) lista25);
        // The following exception was thrown during execution in test generation
        try {
            lista15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        java.lang.Class<?> wildcardClass12 = lista8.getClass();
        lista0.insere((java.lang.Object) lista8);
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.primeiro;
        lista14.ultimo = 10;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        int int23 = lista18.ultimo;
        java.lang.Object[] objArray24 = lista18.item;
        lista18.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        lista26.primeiro = (byte) -1;
        lista26.insere((java.lang.Object) 35);
        ds.Lista lista35 = new ds.Lista();
        lista35.ultimo = 100;
        lista35.primeiro = '#';
        java.lang.Object[] objArray40 = lista35.item;
        lista26.item = objArray40;
        lista18.item = objArray40;
        java.lang.Object[] objArray43 = lista18.item;
        lista14.item = objArray43;
        lista8.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista8.primeiro = (byte) -1;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        lista16.ultimo = 10;
        lista16.pos = ' ';
        lista16.ultimo = 1;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        lista26.primeiro = 0;
        lista8.insere((java.lang.Object) 0);
        lista0.insere((java.lang.Object) 0);
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        java.lang.Object[] objArray12 = lista8.item;
        lista0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        int int9 = lista4.ultimo;
        java.lang.Object[] objArray10 = lista4.item;
        lista4.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        lista12.primeiro = (byte) -1;
        lista12.insere((java.lang.Object) 35);
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista4.item = objArray26;
        java.lang.Object[] objArray29 = lista4.item;
        lista0.item = objArray29;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        int int13 = lista8.ultimo;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        java.lang.Object[] objArray27 = lista21.item;
        lista16.item = objArray27;
        lista16.ultimo = 'a';
        boolean boolean31 = lista16.vazia();
        lista16.pos = 'a';
        java.lang.Object[] objArray34 = lista16.item;
        lista8.item = objArray34;
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        lista0.pos = (short) 1;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista2.item = objArray13;
        lista0.item = objArray13;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.primeiro = 54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        lista0.primeiro = 35;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista5.primeiro = '4';
        lista5.imprime();
        boolean boolean11 = lista5.vazia();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista12.primeiro = (byte) -1;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.primeiro;
        lista20.ultimo = 10;
        lista20.pos = ' ';
        lista20.ultimo = 1;
        java.lang.Object[] objArray28 = lista20.item;
        lista12.item = objArray28;
        lista5.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray31 = lista5.item;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        int int37 = lista32.ultimo;
        java.lang.Object[] objArray38 = lista32.item;
        lista32.pos = 0;
        int int41 = lista32.primeiro;
        ds.Lista lista42 = new ds.Lista();
        lista42.ultimo = 100;
        lista42.ultimo = '4';
        lista42.primeiro = (byte) -1;
        lista42.insere((java.lang.Object) 35);
        lista42.ultimo = (short) 1;
        lista42.pos = (short) 10;
        ds.Lista lista55 = new ds.Lista();
        int int56 = lista55.pos;
        int int57 = lista55.ultimo;
        lista55.primeiro = '#';
        ds.Lista lista60 = new ds.Lista();
        lista60.ultimo = 100;
        java.lang.Object[] objArray63 = new java.lang.Object[] { 100 };
        lista55.item = objArray63;
        lista42.item = objArray63;
        lista32.item = objArray63;
        lista5.item = objArray63;
        lista0.item = objArray63;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[100]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        int int17 = lista12.ultimo;
        java.lang.Object[] objArray18 = lista12.item;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.imprime();
        lista19.ultimo = ' ';
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '#';
        java.lang.Object[] objArray30 = lista25.item;
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        lista19.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray34 = lista19.item;
        lista12.insere((java.lang.Object) objArray34);
        lista0.item = objArray34;
        java.lang.Class<?> wildcardClass37 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray15 = lista0.item;
        java.lang.Class<?> wildcardClass16 = objArray15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        lista24.ultimo = (byte) 1;
        java.lang.Class<?> wildcardClass35 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        lista0.pos = 53;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        int int6 = lista0.ultimo;
        lista0.pos = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        lista9.primeiro = (byte) -1;
        java.lang.Object[] objArray16 = lista9.item;
        lista0.item = objArray16;
        lista0.ultimo = 35;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        int int13 = lista8.ultimo;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        lista8.imprime();
        int int17 = lista8.pos;
        lista8.pos = 0;
        lista0.insere((java.lang.Object) lista8);
        lista8.pos = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        lista0.pos = 54;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        lista0.primeiro = 35;
        lista0.primeiro = (-1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        lista0.pos = (short) -1;
        int int10 = lista0.pos;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.pos = (short) 100;
        boolean boolean15 = lista0.vazia();
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Class<?> wildcardClass17 = objArray16.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = (byte) -1;
        int int17 = lista9.primeiro;
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        lista18.primeiro = '#';
        java.lang.Object[] objArray23 = lista18.item;
        lista9.item = objArray23;
        lista0.item = objArray23;
        java.lang.Class<?> wildcardClass26 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100 };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.pos = 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.pos = 54;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.ultimo = 10;
        lista10.primeiro = (short) 0;
        int int16 = lista10.ultimo;
        lista0.insere((java.lang.Object) int16);
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.primeiro;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = (byte) 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        int int13 = lista8.pos;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        java.lang.Object[] objArray19 = lista14.item;
        lista8.item = objArray19;
        lista8.pos = 1;
        java.lang.Class<?> wildcardClass23 = lista8.getClass();
        lista0.insere((java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = (byte) 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        lista0.primeiro = 35;
        int int23 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        int int11 = lista0.pos;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.imprime();
        lista16.ultimo = ' ';
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        boolean boolean28 = lista22.vazia();
        lista22.imprime();
        lista16.insere((java.lang.Object) lista22);
        java.lang.Object[] objArray31 = lista16.item;
        lista0.item = objArray31;
        int int33 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        lista0.pos = (short) -1;
        boolean boolean20 = lista0.vazia();
        lista0.primeiro = 54;
        java.lang.Object[] objArray23 = lista0.item;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        int int11 = lista0.pos;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = ' ';
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.primeiro;
        lista10.ultimo = 10;
        lista10.primeiro = (short) 0;
        java.lang.Object[] objArray16 = lista10.item;
        lista7.item = objArray16;
        lista0.item = objArray16;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = (byte) -1;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        lista9.item = objArray28;
        lista0.item = objArray28;
        java.lang.Class<?> wildcardClass32 = objArray28.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        boolean boolean13 = lista7.vazia();
        int int14 = lista7.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = '#';
        int int20 = lista15.ultimo;
        java.lang.Object[] objArray21 = lista15.item;
        lista7.insere((java.lang.Object) objArray21);
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.ultimo = 32;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        lista0.pos = 100;
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        java.lang.Class<?> wildcardClass12 = lista8.getClass();
        lista0.insere((java.lang.Object) lista8);
        int int14 = lista8.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        lista24.ultimo = (byte) 1;
        boolean boolean35 = lista24.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 100;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        int int21 = lista16.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        lista16.item = objArray27;
        lista16.pos = 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.primeiro = '#';
        java.lang.Object[] objArray36 = lista31.item;
        lista31.primeiro = 35;
        lista16.insere((java.lang.Object) lista31);
        lista16.pos = 100;
        lista0.insere((java.lang.Object) lista16);
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.pos;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 100;
        lista45.ultimo = '4';
        int int50 = lista45.pos;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        int int53 = lista51.ultimo;
        lista51.primeiro = '#';
        java.lang.Object[] objArray56 = lista51.item;
        lista45.item = objArray56;
        lista43.item = objArray56;
        lista43.primeiro = (short) 1;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        ds.Lista lista66 = new ds.Lista();
        lista66.ultimo = 100;
        lista66.ultimo = '4';
        int int71 = lista66.pos;
        java.lang.Object[] objArray72 = lista66.item;
        lista61.item = objArray72;
        lista61.ultimo = 'a';
        boolean boolean76 = lista61.vazia();
        lista61.pos = 'a';
        java.lang.Object[] objArray79 = lista61.item;
        lista43.item = objArray79;
        boolean boolean81 = lista43.vazia();
        lista0.insere((java.lang.Object) boolean81);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        lista0.primeiro = (byte) 1;
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.ultimo = (short) 0;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (short) 0;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.ultimo;
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        lista0.pos = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = 35;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.imprime();
        lista7.ultimo = ' ';
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        java.lang.Object[] objArray18 = lista13.item;
        boolean boolean19 = lista13.vazia();
        lista13.imprime();
        lista7.insere((java.lang.Object) lista13);
        java.lang.Object[] objArray22 = lista7.item;
        lista0.insere((java.lang.Object) objArray22);
        lista0.imprime();
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = ' ';
        lista25.primeiro = '#';
        boolean boolean30 = lista25.vazia();
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        lista31.ultimo = 0;
        int int35 = lista31.primeiro;
        lista31.imprime();
        lista31.ultimo = 0;
        lista25.insere((java.lang.Object) lista31);
        ds.Lista lista40 = new ds.Lista();
        lista40.ultimo = 100;
        lista40.ultimo = '4';
        int int45 = lista40.pos;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        int int48 = lista46.ultimo;
        lista46.primeiro = '#';
        java.lang.Object[] objArray51 = lista46.item;
        lista40.item = objArray51;
        lista40.pos = 1;
        int int55 = lista40.primeiro;
        lista25.insere((java.lang.Object) int55);
        lista0.insere((java.lang.Object) int55);
        int int58 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray22 = lista16.item;
        lista0.insere((java.lang.Object) objArray22);
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.primeiro = '#';
        java.lang.Object[] objArray35 = lista30.item;
        lista24.item = objArray35;
        lista24.pos = 1;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = 35;
        lista24.insere((java.lang.Object) lista39);
        lista24.pos = 100;
        lista8.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista24);
        int int52 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.primeiro = '#';
        java.lang.Object[] objArray35 = lista30.item;
        lista24.item = objArray35;
        lista24.pos = 1;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = 35;
        lista24.insere((java.lang.Object) lista39);
        lista24.pos = 100;
        lista8.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista24);
        ds.Lista lista52 = new ds.Lista();
        lista52.ultimo = 100;
        lista52.primeiro = '#';
        java.lang.Object[] objArray57 = lista52.item;
        lista24.item = objArray57;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.imprime();
        lista0.ultimo = 'a';
        boolean boolean22 = lista0.vazia();
        int int23 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        int int18 = lista0.primeiro;
        java.lang.Object obj19 = null;
        lista0.insere(obj19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean9 = lista0.vazia();
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        lista0.pos = 'a';
        int int20 = lista0.primeiro;
        int int21 = lista0.primeiro;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista2.item = objArray13;
        lista0.item = objArray13;
        lista0.primeiro = (short) 1;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.ultimo = '4';
        int int28 = lista23.pos;
        java.lang.Object[] objArray29 = lista23.item;
        lista18.item = objArray29;
        lista18.ultimo = 'a';
        boolean boolean33 = lista18.vazia();
        lista18.pos = 'a';
        java.lang.Object[] objArray36 = lista18.item;
        lista0.item = objArray36;
        boolean boolean38 = lista0.vazia();
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.pos;
        lista0.pos = (short) -1;
        int int16 = lista0.ultimo;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100 };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.item = objArray21;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        int int5 = lista0.primeiro;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        lista0.pos = (-1);
        lista0.primeiro = 32;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.pos = (byte) -1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        lista7.primeiro = (short) -1;
        int int16 = lista7.pos;
        lista0.insere((java.lang.Object) lista7);
        int int18 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        lista18.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        lista0.pos = 10;
        int int28 = lista0.ultimo;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        java.lang.Object[] objArray34 = lista29.item;
        boolean boolean35 = lista29.vazia();
        int int36 = lista29.pos;
        lista29.pos = (byte) 1;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        int int44 = lista39.ultimo;
        java.lang.Object[] objArray45 = lista39.item;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        int int48 = lista46.ultimo;
        lista46.imprime();
        lista46.ultimo = ' ';
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.pos;
        int int54 = lista52.ultimo;
        lista52.primeiro = '#';
        java.lang.Object[] objArray57 = lista52.item;
        boolean boolean58 = lista52.vazia();
        lista52.imprime();
        lista46.insere((java.lang.Object) lista52);
        java.lang.Object[] objArray61 = lista46.item;
        lista39.insere((java.lang.Object) objArray61);
        lista29.item = objArray61;
        lista0.item = objArray61;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        lista8.imprime();
        lista8.ultimo = 1;
        lista0.insere((java.lang.Object) lista8);
        lista8.ultimo = 53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Object[] objArray25 = lista0.item;
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        lista0.imprime();
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        java.lang.Object[] objArray33 = lista24.item;
        int int34 = lista24.ultimo;
        int int35 = lista24.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '#';
        int int30 = lista25.ultimo;
        java.lang.Object[] objArray31 = lista25.item;
        lista25.imprime();
        lista25.imprime();
        int int34 = lista25.pos;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        lista35.primeiro = '#';
        ds.Lista lista40 = new ds.Lista();
        lista40.ultimo = 100;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 100 };
        lista35.item = objArray43;
        lista25.item = objArray43;
        lista0.insere((java.lang.Object) objArray43);
        boolean boolean47 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.primeiro;
        lista21.ultimo = 10;
        lista21.primeiro = (short) 0;
        java.lang.Object[] objArray27 = lista21.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 100 };
        lista34.item = objArray42;
        lista28.item = objArray42;
        lista21.item = objArray42;
        lista0.item = objArray42;
        int int47 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.primeiro;
        lista21.ultimo = 10;
        lista21.primeiro = (short) 0;
        java.lang.Object[] objArray27 = lista21.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.primeiro = '#';
        java.lang.Object[] objArray33 = lista28.item;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 100 };
        lista34.item = objArray42;
        lista28.item = objArray42;
        lista21.item = objArray42;
        lista0.item = objArray42;
        java.lang.Object[] objArray47 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[100]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '4';
        lista6.insere((java.lang.Object) 10.0d);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (short) 10;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.ultimo = 10;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d };
        lista4.item = objArray9;
        lista0.item = objArray9;
        lista0.ultimo = 'a';
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.ultimo = 54;
        lista0.ultimo = 54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.primeiro;
        lista27.ultimo = 10;
        lista27.primeiro = (short) 0;
        int int33 = lista27.ultimo;
        lista27.pos = (short) 1;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        lista36.primeiro = (byte) -1;
        java.lang.Object[] objArray43 = lista36.item;
        lista27.item = objArray43;
        lista0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        int int12 = lista7.pos;
        java.lang.Object[] objArray13 = lista7.item;
        lista7.ultimo = 10;
        lista0.insere((java.lang.Object) lista7);
        // The following exception was thrown during execution in test generation
        try {
            lista7.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        lista0.pos = (short) 0;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = 54;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista12.primeiro = (byte) -1;
        int int20 = lista12.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        int int34 = lista29.ultimo;
        java.lang.Object[] objArray35 = lista29.item;
        lista29.imprime();
        lista29.imprime();
        int int38 = lista29.pos;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 100;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100 };
        lista39.item = objArray47;
        lista29.item = objArray47;
        java.lang.Object[] objArray50 = lista29.item;
        int int51 = lista29.ultimo;
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        lista29.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray26 = lista0.item;
        java.lang.Object obj27 = null;
        lista0.insere(obj27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        java.lang.Class<?> wildcardClass12 = lista8.getClass();
        lista0.insere((java.lang.Object) lista8);
        lista8.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '4';
        lista6.insere((java.lang.Object) 10.0d);
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = (short) 10;
        lista0.ultimo = (short) 1;
        int int18 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = ' ';
        int int10 = lista7.ultimo;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        boolean boolean14 = lista8.vazia();
        int int15 = lista8.pos;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        int int21 = lista16.ultimo;
        java.lang.Object[] objArray22 = lista16.item;
        lista8.insere((java.lang.Object) objArray22);
        lista0.item = objArray22;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        lista11.primeiro = (byte) -1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.primeiro;
        lista19.ultimo = 10;
        lista19.pos = ' ';
        lista19.ultimo = 1;
        java.lang.Object[] objArray27 = lista19.item;
        lista11.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        lista29.primeiro = 0;
        lista11.insere((java.lang.Object) 0);
        lista11.pos = 10;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista8.primeiro = (byte) -1;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        lista16.ultimo = 10;
        lista16.pos = ' ';
        lista16.ultimo = 1;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        lista26.primeiro = 0;
        lista8.insere((java.lang.Object) 0);
        lista0.insere((java.lang.Object) 0);
        lista0.primeiro = 10;
        int int37 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray26 = lista0.item;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        int int32 = lista27.ultimo;
        java.lang.Object[] objArray33 = lista27.item;
        lista27.pos = 0;
        int int36 = lista27.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.ultimo = 100;
        lista37.ultimo = '4';
        lista37.primeiro = (byte) -1;
        lista37.insere((java.lang.Object) 35);
        lista37.ultimo = (short) 1;
        lista37.pos = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.pos;
        int int52 = lista50.ultimo;
        lista50.primeiro = '#';
        ds.Lista lista55 = new ds.Lista();
        lista55.ultimo = 100;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 100 };
        lista50.item = objArray58;
        lista37.item = objArray58;
        lista27.item = objArray58;
        lista0.item = objArray58;
        java.lang.Class<?> wildcardClass63 = objArray58.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '#';
        int int30 = lista25.ultimo;
        java.lang.Object[] objArray31 = lista25.item;
        lista25.imprime();
        lista25.imprime();
        int int34 = lista25.pos;
        ds.Lista lista35 = new ds.Lista();
        int int36 = lista35.pos;
        int int37 = lista35.ultimo;
        lista35.primeiro = '#';
        ds.Lista lista40 = new ds.Lista();
        lista40.ultimo = 100;
        java.lang.Object[] objArray43 = new java.lang.Object[] { 100 };
        lista35.item = objArray43;
        lista25.item = objArray43;
        lista0.insere((java.lang.Object) objArray43);
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[100]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        lista0.pos = (short) -1;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        boolean boolean17 = lista11.vazia();
        int int18 = lista11.pos;
        int int19 = lista11.ultimo;
        int int20 = lista11.ultimo;
        java.lang.Object[] objArray21 = lista11.item;
        lista0.item = objArray21;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        boolean boolean3 = lista2.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.ultimo = 100;
        lista4.ultimo = '4';
        int int9 = lista4.pos;
        java.lang.Object[] objArray10 = lista4.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        lista11.ultimo = '4';
        int int16 = lista11.pos;
        java.lang.Object[] objArray17 = lista11.item;
        lista4.item = objArray17;
        int int19 = lista4.ultimo;
        lista2.insere((java.lang.Object) lista4);
        java.lang.Object[] objArray21 = lista2.item;
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(objArray16);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.pos = (short) 100;
        boolean boolean15 = lista0.vazia();
        java.lang.Object[] objArray16 = lista0.item;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.imprime();
        int int16 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        boolean boolean2 = lista0.vazia();
        ds.Lista lista3 = new ds.Lista();
        lista3.ultimo = 100;
        lista3.ultimo = '4';
        int int8 = lista3.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista3.item = objArray14;
        lista3.pos = 1;
        int int18 = lista3.primeiro;
        lista3.primeiro = (short) 1;
        int int21 = lista3.primeiro;
        lista0.insere((java.lang.Object) lista3);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.pos = (short) 100;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        lista15.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        int int18 = lista13.pos;
        java.lang.Object[] objArray19 = lista13.item;
        lista8.item = objArray19;
        int int21 = lista8.primeiro;
        java.lang.Object[] objArray22 = lista8.item;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        int int25 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = (byte) 100;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        int int14 = lista10.primeiro;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray16 = lista10.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Class<?> wildcardClass15 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = 54;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista12.item = objArray23;
        lista12.pos = (short) 100;
        boolean boolean27 = lista12.vazia();
        java.lang.Object[] objArray28 = lista12.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista0.item = objArray22;
        int int24 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        int int18 = lista13.pos;
        java.lang.Object[] objArray19 = lista13.item;
        lista8.item = objArray19;
        int int21 = lista8.primeiro;
        java.lang.Object[] objArray22 = lista8.item;
        lista8.imprime();
        lista0.insere((java.lang.Object) lista8);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray26 = lista0.item;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        int int32 = lista27.ultimo;
        java.lang.Object[] objArray33 = lista27.item;
        lista27.pos = 0;
        int int36 = lista27.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.ultimo = 100;
        lista37.ultimo = '4';
        lista37.primeiro = (byte) -1;
        lista37.insere((java.lang.Object) 35);
        lista37.ultimo = (short) 1;
        lista37.pos = (short) 10;
        ds.Lista lista50 = new ds.Lista();
        int int51 = lista50.pos;
        int int52 = lista50.ultimo;
        lista50.primeiro = '#';
        ds.Lista lista55 = new ds.Lista();
        lista55.ultimo = 100;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 100 };
        lista50.item = objArray58;
        lista37.item = objArray58;
        lista27.item = objArray58;
        lista0.item = objArray58;
        ds.Lista lista63 = new ds.Lista();
        lista63.ultimo = 100;
        lista63.ultimo = '4';
        int int68 = lista63.pos;
        ds.Lista lista69 = new ds.Lista();
        int int70 = lista69.pos;
        int int71 = lista69.ultimo;
        lista69.primeiro = '#';
        java.lang.Object[] objArray74 = lista69.item;
        lista63.item = objArray74;
        lista63.pos = 1;
        int int78 = lista63.pos;
        int int79 = lista63.pos;
        int int80 = lista63.ultimo;
        java.lang.Object[] objArray81 = lista63.item;
        lista0.item = objArray81;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[100]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 52 + "'", int80 == 52);
        org.junit.Assert.assertNotNull(objArray81);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        lista0.pos = 'a';
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = (-1);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista12.item = objArray23;
        int int25 = lista12.primeiro;
        java.lang.Object[] objArray26 = lista12.item;
        lista0.insere((java.lang.Object) objArray26);
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.primeiro;
        lista28.ultimo = 32;
        lista0.insere((java.lang.Object) 32);
        lista0.ultimo = 'a';
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.pos = 53;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = ' ';
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.primeiro = '#';
        java.lang.Object[] objArray18 = lista13.item;
        lista13.primeiro = 35;
        boolean boolean21 = lista13.vazia();
        java.lang.Object[] objArray22 = lista13.item;
        int int23 = lista13.pos;
        lista0.insere((java.lang.Object) int23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        int int15 = lista10.pos;
        java.lang.Object[] objArray16 = lista10.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista10.item = objArray23;
        int int25 = lista10.ultimo;
        lista8.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray27 = lista10.item;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        int int8 = lista0.pos;
        lista0.pos = 0;
        lista0.ultimo = 0;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        int int20 = lista15.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista15.item = objArray26;
        lista0.item = objArray26;
        int int29 = lista0.pos;
        boolean boolean30 = lista0.vazia();
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = 54;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista12.primeiro = (byte) -1;
        int int20 = lista12.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista0.item = objArray26;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        int int34 = lista29.ultimo;
        java.lang.Object[] objArray35 = lista29.item;
        lista29.imprime();
        lista29.imprime();
        int int38 = lista29.pos;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 100;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100 };
        lista39.item = objArray47;
        lista29.item = objArray47;
        java.lang.Object[] objArray50 = lista29.item;
        int int51 = lista29.ultimo;
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        int int54 = lista29.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[100]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.pos = 54;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        boolean boolean24 = lista15.vazia();
        lista15.primeiro = 52;
        lista15.ultimo = 54;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        int int26 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        int int26 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 54;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        lista0.ultimo = (short) 0;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = '#';
        int int19 = lista14.ultimo;
        int int20 = lista14.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '#';
        java.lang.Object[] objArray32 = lista27.item;
        lista21.item = objArray32;
        lista14.item = objArray32;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Object[] objArray36 = lista14.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        lista0.pos = 54;
        int int18 = lista0.ultimo;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray14 = lista7.item;
        int int15 = lista7.primeiro;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        java.lang.Object[] objArray27 = lista21.item;
        lista16.item = objArray27;
        lista7.item = objArray27;
        lista0.item = objArray27;
        int int31 = lista0.primeiro;
        java.lang.Object[] objArray32 = lista0.item;
        java.lang.Object[] objArray33 = null;
        lista0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.ultimo = 32;
        int int18 = lista0.pos;
        boolean boolean19 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        lista13.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass20 = lista13.getClass();
        lista11.insere((java.lang.Object) wildcardClass20);
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista22.item = objArray33;
        lista22.pos = (short) 100;
        boolean boolean37 = lista22.vazia();
        java.lang.Object[] objArray38 = lista22.item;
        lista11.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        java.lang.Object[] objArray41 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        lista25.ultimo = 0;
        int int29 = lista25.pos;
        java.lang.Object obj30 = null;
        lista25.insere(obj30);
        lista15.insere((java.lang.Object) lista25);
        int int33 = lista15.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.pos = (short) 100;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        lista15.item = objArray28;
        lista0.item = objArray28;
        lista0.primeiro = 101;
        int int34 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 101 + "'", int34 == 101);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.insere((java.lang.Object) 1);
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.pos;
        lista0.pos = (short) -1;
        int int16 = lista0.ultimo;
        java.lang.Object[] objArray17 = null;
        lista0.item = objArray17;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        boolean boolean10 = lista7.vazia();
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        int int16 = lista11.ultimo;
        java.lang.Object[] objArray17 = lista11.item;
        lista11.imprime();
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        java.lang.Object[] objArray30 = lista24.item;
        lista19.item = objArray30;
        lista19.ultimo = 'a';
        boolean boolean34 = lista19.vazia();
        lista19.pos = 'a';
        java.lang.Object[] objArray37 = lista19.item;
        lista11.item = objArray37;
        lista7.item = objArray37;
        lista0.item = objArray37;
        java.lang.Class<?> wildcardClass41 = objArray37.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        lista0.ultimo = '#';
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.primeiro;
        lista11.ultimo = 10;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 1.0d };
        lista15.item = objArray20;
        lista11.item = objArray20;
        lista11.ultimo = 'a';
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[1.0]");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        lista0.ultimo = (short) 1;
        lista0.pos = (short) 10;
        int int13 = lista0.primeiro;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        lista0.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.ultimo = 10;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d };
        lista4.item = objArray9;
        lista0.item = objArray9;
        lista0.ultimo = 'a';
        ds.Lista lista14 = new ds.Lista();
        boolean boolean15 = lista14.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        int int21 = lista16.pos;
        java.lang.Object[] objArray22 = lista16.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.ultimo = '4';
        int int28 = lista23.pos;
        java.lang.Object[] objArray29 = lista23.item;
        lista16.item = objArray29;
        int int31 = lista16.ultimo;
        lista14.insere((java.lang.Object) lista16);
        lista14.ultimo = 32;
        java.lang.Object[] objArray35 = lista14.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista14);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass26 = lista9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.ultimo = 54;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista12.primeiro = (byte) -1;
        int int20 = lista12.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista0.item = objArray26;
        lista0.primeiro = 97;
        java.lang.Object[] objArray31 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100 };
        lista6.item = objArray14;
        lista0.item = objArray14;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = (byte) 10;
        lista9.primeiro = 52;
        lista9.pos = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        lista0.ultimo = (byte) 10;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        lista0.pos = 'a';
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista0.item = objArray22;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray22 = lista21.item;
        lista0.item = objArray22;
        int int24 = lista0.primeiro;
        int int25 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        lista17.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass26 = lista17.getClass();
        lista11.insere((java.lang.Object) wildcardClass26);
        int int28 = lista11.pos;
        lista0.insere((java.lang.Object) lista11);
        boolean boolean30 = lista0.vazia();
        int int31 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        lista0.primeiro = (byte) 100;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        lista0.primeiro = (-1);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = 32;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        int int15 = lista10.ultimo;
        java.lang.Object[] objArray16 = lista10.item;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray24 = lista17.item;
        int int25 = lista17.primeiro;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.ultimo = '4';
        int int36 = lista31.pos;
        java.lang.Object[] objArray37 = lista31.item;
        lista26.item = objArray37;
        lista17.item = objArray37;
        lista10.item = objArray37;
        lista0.item = objArray37;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = (byte) 10;
        lista9.pos = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d };
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.insere((java.lang.Object) (byte) 1);
        boolean boolean11 = lista7.vazia();
        int int12 = lista7.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100 };
        lista10.item = objArray18;
        lista0.item = objArray18;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        lista21.ultimo = 'a';
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista21.item = objArray47;
        int int50 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        int int52 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.imprime();
        lista0.ultimo = 'a';
        boolean boolean22 = lista0.vazia();
        java.lang.Object[] objArray23 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        int int16 = lista9.pos;
        lista9.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        int int24 = lista19.ultimo;
        java.lang.Object[] objArray25 = lista19.item;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.imprime();
        lista26.ultimo = ' ';
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        boolean boolean38 = lista32.vazia();
        lista32.imprime();
        lista26.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray41 = lista26.item;
        lista19.insere((java.lang.Object) objArray41);
        lista9.item = objArray41;
        lista0.item = objArray41;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        boolean boolean7 = lista0.vazia();
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '4';
        lista9.imprime();
        boolean boolean15 = lista9.vazia();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        java.lang.Object[] objArray21 = lista16.item;
        lista16.primeiro = (byte) -1;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.primeiro;
        lista24.ultimo = 10;
        lista24.pos = ' ';
        lista24.ultimo = 1;
        java.lang.Object[] objArray32 = lista24.item;
        lista16.item = objArray32;
        lista9.insere((java.lang.Object) lista16);
        lista9.primeiro = (short) 10;
        lista9.ultimo = 0;
        lista9.primeiro = (-1);
        lista0.insere((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.pos = (byte) -1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        lista7.primeiro = (short) -1;
        int int16 = lista7.pos;
        lista0.insere((java.lang.Object) lista7);
        int int18 = lista7.primeiro;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        lista0.ultimo = 32;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.primeiro;
        lista9.ultimo = 10;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 1.0d };
        lista9.item = objArray14;
        lista9.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray14 = lista7.item;
        int int15 = lista7.primeiro;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.ultimo = '4';
        int int26 = lista21.pos;
        java.lang.Object[] objArray27 = lista21.item;
        lista16.item = objArray27;
        lista7.item = objArray27;
        lista0.item = objArray27;
        int int31 = lista0.primeiro;
        boolean boolean32 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.primeiro;
        lista6.ultimo = 10;
        java.lang.Object[] objArray10 = lista6.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        lista0.insere((java.lang.Object) wildcardClass11);
        boolean boolean13 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 10;
        lista0.pos = 1;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.item = objArray24;
        lista0.primeiro = 100;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 100;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = (byte) 0;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        lista21.ultimo = 0;
        int int25 = lista21.primeiro;
        lista21.imprime();
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.primeiro = '4';
        lista27.insere((java.lang.Object) 10.0d);
        lista21.insere((java.lang.Object) lista27);
        lista21.ultimo = (short) 10;
        lista21.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100 };
        lista6.item = objArray14;
        lista0.item = objArray14;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.primeiro;
        lista0.primeiro = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        lista0.pos = 54;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = '#';
        int int9 = lista4.ultimo;
        java.lang.Object[] objArray10 = lista4.item;
        lista4.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        lista12.primeiro = (byte) -1;
        lista12.insere((java.lang.Object) 35);
        ds.Lista lista21 = new ds.Lista();
        lista21.ultimo = 100;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        lista4.item = objArray26;
        java.lang.Object[] objArray29 = lista4.item;
        lista0.item = objArray29;
        boolean boolean31 = lista0.vazia();
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        lista32.primeiro = (byte) -1;
        int int40 = lista32.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.ultimo = 100;
        lista41.primeiro = '#';
        java.lang.Object[] objArray46 = lista41.item;
        lista32.item = objArray46;
        java.lang.Object[] objArray48 = lista32.item;
        lista0.item = objArray48;
        java.lang.Class<?> wildcardClass50 = objArray48.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.primeiro;
        lista0.primeiro = (short) 1;
        lista0.pos = (short) -1;
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        int int34 = lista21.primeiro;
        java.lang.Object[] objArray35 = lista21.item;
        lista0.insere((java.lang.Object) lista21);
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Object[] objArray25 = lista0.item;
        int int26 = lista0.pos;
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        lista0.pos = (short) 0;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.ultimo = '#';
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '4';
        lista16.insere((java.lang.Object) 10.0d);
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        int int25 = lista16.ultimo;
        lista16.ultimo = 97;
        java.lang.Object[] objArray28 = lista16.item;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.ultimo = 32;
        java.lang.Object[] objArray21 = lista0.item;
        int int22 = lista0.ultimo;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = ' ';
        int int26 = lista23.pos;
        int int27 = lista23.pos;
        java.lang.Class<?> wildcardClass28 = lista23.getClass();
        lista0.insere((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.primeiro;
        lista7.ultimo = 10;
        lista7.primeiro = (short) 0;
        java.lang.Object[] objArray13 = lista7.item;
        java.lang.Object[] objArray14 = lista7.item;
        lista0.insere((java.lang.Object) lista7);
        lista0.imprime();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.ultimo = 'a';
        java.lang.Object[] objArray24 = null;
        lista9.item = objArray24;
        lista0.insere((java.lang.Object) lista9);
        int int27 = lista0.ultimo;
        java.lang.Object[] objArray28 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        int int15 = lista9.primeiro;
        boolean boolean16 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean16);
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.ultimo = '4';
        int int25 = lista20.pos;
        java.lang.Object[] objArray26 = lista20.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista20.item = objArray33;
        int int35 = lista20.ultimo;
        lista18.insere((java.lang.Object) lista20);
        java.lang.Class<?> wildcardClass37 = lista20.getClass();
        lista0.insere((java.lang.Object) wildcardClass37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (short) 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista27.item = objArray38;
        lista27.pos = 1;
        ds.Lista lista42 = new ds.Lista();
        lista42.ultimo = 100;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista42.primeiro = 35;
        lista27.insere((java.lang.Object) lista42);
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        int int53 = lista51.ultimo;
        lista51.imprime();
        lista42.insere((java.lang.Object) lista51);
        int int56 = lista51.pos;
        int int57 = lista51.ultimo;
        lista51.primeiro = 0;
        java.lang.Object[] objArray60 = lista51.item;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        int int66 = lista61.ultimo;
        java.lang.Object[] objArray67 = lista61.item;
        lista61.ultimo = 100;
        java.lang.Object[] objArray70 = lista61.item;
        lista51.item = objArray70;
        lista51.primeiro = (short) 100;
        lista51.pos = (short) 100;
        lista0.insere((java.lang.Object) lista51);
        ds.Lista lista77 = new ds.Lista();
        int int78 = lista77.pos;
        int int79 = lista77.ultimo;
        lista77.primeiro = '4';
        lista77.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray84 = lista77.item;
        java.lang.Object[] objArray85 = lista77.item;
        lista0.item = objArray85;
        boolean boolean87 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        lista7.imprime();
        lista7.pos = '4';
        java.lang.Object[] objArray15 = lista7.item;
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        lista8.imprime();
        lista8.ultimo = 1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray17 = lista8.item;
        int int18 = lista8.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int15 = lista6.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        ds.Lista lista2 = new ds.Lista();
        int int3 = lista2.pos;
        lista2.ultimo = 0;
        lista2.imprime();
        lista2.insere((java.lang.Object) 10.0f);
        int int9 = lista2.ultimo;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        int int16 = lista10.primeiro;
        boolean boolean17 = lista10.vazia();
        java.lang.Object[] objArray18 = lista10.item;
        lista2.item = objArray18;
        lista0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        int int16 = lista9.pos;
        lista9.pos = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        int int24 = lista19.ultimo;
        java.lang.Object[] objArray25 = lista19.item;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.imprime();
        lista26.ultimo = ' ';
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        boolean boolean38 = lista32.vazia();
        lista32.imprime();
        lista26.insere((java.lang.Object) lista32);
        java.lang.Object[] objArray41 = lista26.item;
        lista19.insere((java.lang.Object) objArray41);
        lista9.item = objArray41;
        lista0.item = objArray41;
        lista0.pos = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.primeiro;
        boolean boolean31 = lista24.vazia();
        java.lang.Class<?> wildcardClass32 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        java.lang.Object[] objArray18 = lista0.item;
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        int int21 = lista16.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        lista16.item = objArray27;
        lista16.pos = 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.primeiro = '#';
        java.lang.Object[] objArray36 = lista31.item;
        lista31.primeiro = 35;
        lista16.insere((java.lang.Object) lista31);
        lista16.pos = 100;
        lista0.insere((java.lang.Object) lista16);
        int int43 = lista16.ultimo;
        java.lang.Class<?> wildcardClass44 = lista16.getClass();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 53 + "'", int43 == 53);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 0;
        int int13 = lista9.primeiro;
        lista9.imprime();
        lista9.ultimo = 0;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        lista17.primeiro = (byte) -1;
        lista17.insere((java.lang.Object) 35);
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        lista17.item = objArray31;
        lista9.item = objArray31;
        lista9.ultimo = (short) 10;
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista36.pos = 1;
        ds.Lista lista51 = new ds.Lista();
        lista51.ultimo = 100;
        lista51.primeiro = '#';
        java.lang.Object[] objArray56 = lista51.item;
        lista51.primeiro = 35;
        lista36.insere((java.lang.Object) lista51);
        ds.Lista lista60 = new ds.Lista();
        int int61 = lista60.pos;
        int int62 = lista60.ultimo;
        lista60.imprime();
        lista51.insere((java.lang.Object) lista60);
        int int65 = lista60.pos;
        int int66 = lista60.ultimo;
        lista60.primeiro = 0;
        java.lang.Object[] objArray69 = lista60.item;
        ds.Lista lista70 = new ds.Lista();
        int int71 = lista70.pos;
        int int72 = lista70.ultimo;
        lista70.primeiro = '#';
        int int75 = lista70.ultimo;
        java.lang.Object[] objArray76 = lista70.item;
        lista70.ultimo = 100;
        java.lang.Object[] objArray79 = lista70.item;
        lista60.item = objArray79;
        lista60.primeiro = (short) 100;
        lista60.pos = (short) 100;
        lista9.insere((java.lang.Object) lista60);
        ds.Lista lista86 = new ds.Lista();
        int int87 = lista86.pos;
        int int88 = lista86.ultimo;
        lista86.primeiro = '4';
        lista86.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray93 = lista86.item;
        java.lang.Object[] objArray94 = lista86.item;
        lista9.item = objArray94;
        lista0.item = objArray94;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(objArray94);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '4';
        int int11 = lista6.pos;
        int int12 = lista6.primeiro;
        int int13 = lista6.ultimo;
        lista0.insere((java.lang.Object) int13);
        int int15 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        int int17 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 32;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        int int24 = lista15.pos;
        java.lang.Object[] objArray25 = null;
        lista15.item = objArray25;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        java.lang.Object[] objArray33 = lista24.item;
        lista24.pos = (short) 10;
        int int36 = lista24.pos;
        lista24.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        boolean boolean24 = lista15.vazia();
        lista15.primeiro = 52;
        boolean boolean27 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 0;
        lista6.imprime();
        lista6.insere((java.lang.Object) 10.0f);
        lista6.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass15 = lista6.getClass();
        lista0.insere((java.lang.Object) wildcardClass15);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) "");
        lista0.primeiro = 52;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d };
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        int int12 = lista7.ultimo;
        java.lang.Object[] objArray13 = lista7.item;
        lista7.imprime();
        lista7.imprime();
        int int16 = lista7.pos;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        int int19 = lista17.ultimo;
        lista17.primeiro = '#';
        ds.Lista lista22 = new ds.Lista();
        lista22.ultimo = 100;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100 };
        lista17.item = objArray25;
        lista7.item = objArray25;
        java.lang.Object[] objArray28 = lista7.item;
        int int29 = lista7.ultimo;
        java.lang.Object[] objArray30 = lista7.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100]");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        int int6 = lista0.pos;
        lista0.primeiro = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.primeiro = '#';
        java.lang.Object[] objArray35 = lista30.item;
        lista24.item = objArray35;
        lista24.pos = 1;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = 35;
        lista24.insere((java.lang.Object) lista39);
        lista24.pos = 100;
        lista8.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista24);
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.primeiro;
        lista52.ultimo = 10;
        lista52.primeiro = (short) 0;
        java.lang.Object[] objArray58 = lista52.item;
        java.lang.Object[] objArray59 = lista52.item;
        java.lang.Object[] objArray60 = lista52.item;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        java.lang.Object[] objArray66 = lista61.item;
        boolean boolean67 = lista61.vazia();
        int int68 = lista61.pos;
        lista61.pos = (byte) 1;
        ds.Lista lista71 = new ds.Lista();
        int int72 = lista71.pos;
        int int73 = lista71.ultimo;
        lista71.primeiro = '#';
        int int76 = lista71.ultimo;
        java.lang.Object[] objArray77 = lista71.item;
        ds.Lista lista78 = new ds.Lista();
        int int79 = lista78.pos;
        int int80 = lista78.ultimo;
        lista78.imprime();
        lista78.ultimo = ' ';
        ds.Lista lista84 = new ds.Lista();
        int int85 = lista84.pos;
        int int86 = lista84.ultimo;
        lista84.primeiro = '#';
        java.lang.Object[] objArray89 = lista84.item;
        boolean boolean90 = lista84.vazia();
        lista84.imprime();
        lista78.insere((java.lang.Object) lista84);
        java.lang.Object[] objArray93 = lista78.item;
        lista71.insere((java.lang.Object) objArray93);
        lista61.item = objArray93;
        lista52.item = objArray93;
        int int97 = lista52.pos;
        lista0.insere((java.lang.Object) int97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.primeiro = '#';
        java.lang.Object[] objArray35 = lista30.item;
        lista24.item = objArray35;
        lista24.pos = 1;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.primeiro = '#';
        java.lang.Object[] objArray44 = lista39.item;
        lista39.primeiro = 35;
        lista24.insere((java.lang.Object) lista39);
        lista24.pos = 100;
        lista8.insere((java.lang.Object) lista24);
        lista0.insere((java.lang.Object) lista24);
        java.lang.Class<?> wildcardClass52 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        lista16.ultimo = 10;
        lista16.primeiro = (short) 0;
        java.lang.Object[] objArray22 = lista16.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 100 };
        lista29.item = objArray37;
        lista23.item = objArray37;
        lista16.item = objArray37;
        lista8.item = objArray37;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        int int47 = lista42.ultimo;
        java.lang.Object[] objArray48 = lista42.item;
        lista8.item = objArray48;
        lista0.insere((java.lang.Object) lista8);
        int int51 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 35 + "'", int51 == 35);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        int int11 = lista0.ultimo;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        lista0.ultimo = '4';
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        lista16.ultimo = 10;
        lista16.primeiro = (short) 0;
        java.lang.Object[] objArray22 = lista16.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        ds.Lista lista34 = new ds.Lista();
        lista34.ultimo = 100;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 100 };
        lista29.item = objArray37;
        lista23.item = objArray37;
        lista16.item = objArray37;
        lista8.item = objArray37;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        int int47 = lista42.ultimo;
        java.lang.Object[] objArray48 = lista42.item;
        lista8.item = objArray48;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray51 = lista8.item;
        java.lang.Class<?> wildcardClass52 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[100]");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Object[] objArray25 = lista0.item;
        lista0.ultimo = (-1);
        int int28 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.pos = 2;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.ultimo;
        lista20.primeiro = '4';
        lista20.insere((java.lang.Object) 10.0d);
        int int27 = lista20.ultimo;
        java.lang.Object[] objArray28 = lista20.item;
        lista0.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        int int25 = lista0.primeiro;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.primeiro;
        lista17.ultimo = 32;
        int int25 = lista17.primeiro;
        int int26 = lista17.primeiro;
        lista0.insere((java.lang.Object) int26);
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        lista28.primeiro = (byte) -1;
        lista28.insere((java.lang.Object) 35);
        int int37 = lista28.ultimo;
        int int38 = lista28.ultimo;
        int int39 = lista28.primeiro;
        lista28.primeiro = 100;
        lista0.insere((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 53 + "'", int37 == 53);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 53 + "'", int38 == 53);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        int int25 = lista0.ultimo;
        int int26 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        lista26.primeiro = (byte) -1;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        lista34.ultimo = 10;
        lista34.pos = ' ';
        lista34.ultimo = 1;
        java.lang.Object[] objArray42 = lista34.item;
        lista26.item = objArray42;
        lista7.insere((java.lang.Object) lista26);
        java.lang.Object[] objArray45 = lista7.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        int int15 = lista9.primeiro;
        boolean boolean16 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean16);
        lista0.pos = (short) 10;
        int int20 = lista0.pos;
        lista0.ultimo = (short) -1;
        lista0.primeiro = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.primeiro;
        lista24.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        java.lang.Object[] objArray13 = lista8.item;
        lista8.primeiro = (byte) -1;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.primeiro;
        lista16.ultimo = 10;
        lista16.pos = ' ';
        lista16.ultimo = 1;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        lista26.primeiro = 0;
        lista8.insere((java.lang.Object) 0);
        lista0.insere((java.lang.Object) 0);
        lista0.primeiro = 10;
        java.lang.Object[] objArray37 = lista0.item;
        int int38 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        lista11.ultimo = (byte) 0;
        lista11.primeiro = (-1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) 35);
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        int int21 = lista16.pos;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        lista16.item = objArray27;
        lista16.pos = 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.ultimo = 100;
        lista31.primeiro = '#';
        java.lang.Object[] objArray36 = lista31.item;
        lista31.primeiro = 35;
        lista16.insere((java.lang.Object) lista31);
        lista16.pos = 100;
        lista0.insere((java.lang.Object) lista16);
        int int43 = lista0.ultimo;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray46 = lista0.item;
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 54 + "'", int43 == 54);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = (-1);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista12.item = objArray23;
        int int25 = lista12.primeiro;
        java.lang.Object[] objArray26 = lista12.item;
        lista0.insere((java.lang.Object) objArray26);
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.primeiro;
        lista28.ultimo = 32;
        lista0.insere((java.lang.Object) 32);
        lista0.ultimo = 'a';
        lista0.ultimo = 101;
        ds.Lista lista41 = new ds.Lista();
        int int42 = lista41.pos;
        int int43 = lista41.ultimo;
        lista41.primeiro = '#';
        java.lang.Object[] objArray46 = lista41.item;
        int int47 = lista41.primeiro;
        boolean boolean48 = lista41.vazia();
        int int49 = lista41.pos;
        lista41.pos = (byte) 100;
        int int52 = lista41.ultimo;
        lista0.insere((java.lang.Object) lista41);
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        lista17.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass26 = lista17.getClass();
        lista11.insere((java.lang.Object) wildcardClass26);
        int int28 = lista11.pos;
        lista0.insere((java.lang.Object) lista11);
        boolean boolean30 = lista0.vazia();
        lista0.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        lista13.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass20 = lista13.getClass();
        lista11.insere((java.lang.Object) wildcardClass20);
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista22.item = objArray33;
        lista22.pos = (short) 100;
        boolean boolean37 = lista22.vazia();
        java.lang.Object[] objArray38 = lista22.item;
        lista11.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        lista22.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        int int12 = lista7.pos;
        java.lang.Object[] objArray13 = lista7.item;
        lista0.item = objArray13;
        int int15 = lista0.ultimo;
        lista0.primeiro = 10;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        lista0.imprime();
        lista0.ultimo = 54;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.imprime();
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        java.lang.Object[] objArray21 = lista16.item;
        lista16.primeiro = (byte) -1;
        int int24 = lista16.primeiro;
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 100;
        lista25.primeiro = '#';
        java.lang.Object[] objArray30 = lista25.item;
        lista16.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = '#';
        int int37 = lista32.ultimo;
        java.lang.Object[] objArray38 = lista32.item;
        lista16.insere((java.lang.Object) objArray38);
        lista0.item = objArray38;
        int int41 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        lista8.ultimo = (short) 1;
        lista8.pos = (short) 10;
        lista0.insere((java.lang.Object) lista8);
        boolean boolean22 = lista8.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.primeiro = 0;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        boolean boolean24 = lista9.vazia();
        java.lang.Object[] objArray25 = lista9.item;
        lista0.insere((java.lang.Object) objArray25);
        boolean boolean27 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) 10.0f);
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        int int24 = lista15.pos;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        lista25.ultimo = 0;
        int int29 = lista25.pos;
        java.lang.Object obj30 = null;
        lista25.insere(obj30);
        lista15.insere((java.lang.Object) lista25);
        int int33 = lista15.primeiro;
        lista15.pos = ' ';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        int int13 = lista8.ultimo;
        java.lang.Object[] objArray14 = lista8.item;
        lista8.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.ultimo = 100;
        lista16.ultimo = '4';
        lista16.primeiro = (byte) -1;
        lista16.insere((java.lang.Object) 35);
        ds.Lista lista25 = new ds.Lista();
        lista25.ultimo = 100;
        lista25.primeiro = '#';
        java.lang.Object[] objArray30 = lista25.item;
        lista16.item = objArray30;
        lista8.item = objArray30;
        java.lang.Object[] objArray33 = lista8.item;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        java.lang.Object[] objArray39 = lista34.item;
        lista34.primeiro = (byte) -1;
        int int42 = lista34.primeiro;
        ds.Lista lista43 = new ds.Lista();
        lista43.ultimo = 100;
        lista43.primeiro = '#';
        java.lang.Object[] objArray48 = lista43.item;
        lista34.item = objArray48;
        int int50 = lista34.primeiro;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        int int53 = lista51.ultimo;
        lista51.primeiro = '#';
        int int56 = lista51.ultimo;
        java.lang.Object[] objArray57 = lista51.item;
        lista51.imprime();
        lista51.imprime();
        int int60 = lista51.pos;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        ds.Lista lista66 = new ds.Lista();
        lista66.ultimo = 100;
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100 };
        lista61.item = objArray69;
        lista51.item = objArray69;
        java.lang.Object[] objArray72 = lista51.item;
        lista34.item = objArray72;
        lista8.item = objArray72;
        lista0.item = objArray72;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[100]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[100]");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        boolean boolean8 = lista0.vazia();
        java.lang.Object[] objArray9 = lista0.item;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.pos = '4';
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.primeiro = '#';
        lista8.primeiro = (-1);
        java.lang.Object[] objArray15 = lista8.item;
        lista8.pos = 32;
        lista0.insere((java.lang.Object) 32);
        java.lang.Object[] objArray19 = lista0.item;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        lista0.primeiro = 32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        lista0.pos = (short) 10;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = 10;
        lista0.ultimo = 54;
        lista0.ultimo = (byte) 10;
        lista0.primeiro = (-1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100 };
        lista10.item = objArray18;
        lista0.item = objArray18;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        lista21.ultimo = 'a';
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista21.item = objArray47;
        int int50 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        java.lang.Object[] objArray52 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = (short) 0;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        int int20 = lista15.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista15.item = objArray26;
        lista0.item = objArray26;
        lista0.pos = 100;
        lista0.ultimo = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '#';
        lista8.imprime();
        lista8.ultimo = 1;
        lista0.insere((java.lang.Object) lista8);
        java.lang.Object[] objArray17 = lista8.item;
        int int18 = lista8.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        int int7 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.pos = (byte) 100;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        lista0.ultimo = 0;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = ' ';
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        boolean boolean12 = lista6.vazia();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int15 = lista6.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.pos = 54;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = 0;
        lista7.imprime();
        lista7.insere((java.lang.Object) 10.0f);
        lista0.insere((java.lang.Object) lista7);
        lista7.primeiro = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        java.lang.Object[] objArray33 = lista24.item;
        int int34 = lista24.ultimo;
        int int35 = lista24.primeiro;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        int int11 = lista0.pos;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        int int5 = lista0.primeiro;
        lista0.primeiro = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        java.lang.Object[] objArray7 = lista0.item;
        ds.Lista lista8 = new ds.Lista();
        boolean boolean9 = lista8.vazia();
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        int int15 = lista10.pos;
        java.lang.Object[] objArray16 = lista10.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista10.item = objArray23;
        int int25 = lista10.ultimo;
        lista8.insere((java.lang.Object) lista10);
        lista8.ultimo = 32;
        lista8.primeiro = 35;
        lista8.primeiro = (-1);
        java.lang.Object[] objArray33 = lista8.item;
        lista0.item = objArray33;
        lista0.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        lista36.ultimo = (byte) 0;
        int int44 = lista36.ultimo;
        lista0.insere((java.lang.Object) lista36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        lista9.ultimo = (byte) -1;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = ' ';
        int int31 = lista28.pos;
        int int32 = lista28.pos;
        int int33 = lista28.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista9.insere((java.lang.Object) lista28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        lista0.insere((java.lang.Object) 1.0f);
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        lista18.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        java.lang.Object[] objArray26 = lista0.item;
        int int27 = lista0.ultimo;
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.pos;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.primeiro = '#';
        java.lang.Object[] objArray39 = lista34.item;
        lista28.item = objArray39;
        lista28.pos = 1;
        ds.Lista lista43 = new ds.Lista();
        lista43.ultimo = 100;
        lista43.primeiro = '#';
        java.lang.Object[] objArray48 = lista43.item;
        lista43.primeiro = 35;
        lista28.insere((java.lang.Object) lista43);
        boolean boolean52 = lista43.vazia();
        lista43.primeiro = 52;
        lista0.insere((java.lang.Object) lista43);
        java.lang.Object[] objArray56 = lista43.item;
        lista43.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(objArray56);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        lista0.pos = 11;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        lista18.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        lista0.primeiro = '#';
        int int28 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.primeiro;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        lista24.pos = '4';
        int int32 = lista24.primeiro;
        java.lang.Class<?> wildcardClass33 = lista24.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100 };
        lista10.item = objArray18;
        lista0.item = objArray18;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        lista21.ultimo = 'a';
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista21.item = objArray47;
        int int50 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        int int52 = lista0.primeiro;
        int int53 = lista0.primeiro;
        lista0.pos = 52;
        ds.Lista lista56 = new ds.Lista();
        boolean boolean57 = lista56.vazia();
        ds.Lista lista58 = new ds.Lista();
        lista58.ultimo = 100;
        lista58.ultimo = '4';
        int int63 = lista58.pos;
        java.lang.Object[] objArray64 = lista58.item;
        ds.Lista lista65 = new ds.Lista();
        lista65.ultimo = 100;
        lista65.ultimo = '4';
        int int70 = lista65.pos;
        java.lang.Object[] objArray71 = lista65.item;
        lista58.item = objArray71;
        int int73 = lista58.ultimo;
        lista56.insere((java.lang.Object) lista58);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista58);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 52 + "'", int73 == 52);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.primeiro = 32;
        java.lang.Object[] objArray19 = lista0.item;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNull(objArray19);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = (byte) -1;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.primeiro;
        lista23.ultimo = 10;
        lista23.pos = ' ';
        lista23.ultimo = 1;
        java.lang.Object[] objArray31 = lista23.item;
        lista15.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        lista33.primeiro = 0;
        lista15.insere((java.lang.Object) 0);
        java.lang.Object[] objArray41 = lista15.item;
        lista0.item = objArray41;
        lista0.ultimo = 0;
        int int45 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass9 = lista2.getClass();
        lista0.insere((java.lang.Object) wildcardClass9);
        lista0.pos = (short) 0;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        lista0.primeiro = '4';
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        lista0.pos = 100;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (short) 10;
        int int27 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        int int11 = lista0.pos;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        int int17 = lista12.ultimo;
        java.lang.Object[] objArray18 = lista12.item;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.imprime();
        lista19.ultimo = ' ';
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '#';
        java.lang.Object[] objArray30 = lista25.item;
        boolean boolean31 = lista25.vazia();
        lista25.imprime();
        lista19.insere((java.lang.Object) lista25);
        java.lang.Object[] objArray34 = lista19.item;
        lista12.insere((java.lang.Object) objArray34);
        lista0.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        lista37.ultimo = 0;
        int int41 = lista37.pos;
        java.lang.Object obj42 = null;
        lista37.insere(obj42);
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 100;
        lista44.ultimo = '4';
        int int49 = lista44.pos;
        java.lang.Object[] objArray50 = lista44.item;
        lista44.ultimo = 10;
        lista37.insere((java.lang.Object) lista44);
        java.lang.Class<?> wildcardClass54 = lista37.getClass();
        lista0.insere((java.lang.Object) lista37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.pos;
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.ultimo = '4';
        int int12 = lista7.pos;
        java.lang.Object[] objArray13 = lista7.item;
        lista7.ultimo = 10;
        lista0.insere((java.lang.Object) lista7);
        int int17 = lista7.primeiro;
        boolean boolean18 = lista7.vazia();
        boolean boolean19 = lista7.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista5.primeiro = '#';
        java.lang.Object[] objArray10 = lista5.item;
        lista5.primeiro = (byte) -1;
        int int13 = lista5.primeiro;
        lista5.insere((java.lang.Object) 10);
        lista0.insere((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.imprime();
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray26 = lista0.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista27.item = objArray38;
        int int40 = lista27.primeiro;
        java.lang.Object[] objArray41 = lista27.item;
        lista0.item = objArray41;
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.primeiro;
        lista43.ultimo = 10;
        java.lang.Object[] objArray47 = lista43.item;
        int int48 = lista43.primeiro;
        lista0.insere((java.lang.Object) int48);
        lista0.primeiro = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.ultimo = 10;
        int int14 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = (short) 1;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        ds.Lista lista11 = new ds.Lista();
        lista11.ultimo = 100;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100 };
        lista6.item = objArray14;
        lista0.item = objArray14;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = ' ';
        int int10 = lista7.ultimo;
        int int11 = lista7.primeiro;
        ds.Lista lista12 = new ds.Lista();
        lista12.ultimo = 100;
        lista12.ultimo = '4';
        int int17 = lista12.pos;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        java.lang.Object[] objArray23 = lista18.item;
        lista12.item = objArray23;
        lista12.pos = 1;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.primeiro = '#';
        java.lang.Object[] objArray32 = lista27.item;
        lista27.primeiro = 35;
        lista12.insere((java.lang.Object) lista27);
        java.lang.Object[] objArray36 = lista12.item;
        lista7.insere((java.lang.Object) objArray36);
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        lista0.pos = ' ';
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        lista10.primeiro = (byte) -1;
        boolean boolean17 = lista10.vazia();
        boolean boolean18 = lista10.vazia();
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.primeiro = '#';
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        int int29 = lista24.pos;
        java.lang.Object[] objArray30 = lista24.item;
        lista19.item = objArray30;
        lista19.pos = (short) 100;
        java.lang.Object[] objArray34 = lista19.item;
        lista10.item = objArray34;
        lista0.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        int int39 = lista37.ultimo;
        lista37.primeiro = '#';
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        int int44 = lista37.pos;
        boolean boolean45 = lista37.vazia();
        lista0.insere((java.lang.Object) lista37);
        lista37.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (short) 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista27.item = objArray38;
        lista0.item = objArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray4 = lista0.item;
        lista0.ultimo = 10;
        lista0.pos = 1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 0;
        lista9.imprime();
        lista9.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray16 = lista9.item;
        int int17 = lista9.primeiro;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '#';
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.ultimo = '4';
        int int28 = lista23.pos;
        java.lang.Object[] objArray29 = lista23.item;
        lista18.item = objArray29;
        lista9.item = objArray29;
        lista0.item = objArray29;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        int int7 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        lista0.pos = (byte) 100;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.imprime();
        int int20 = lista0.primeiro;
        boolean boolean21 = lista0.vazia();
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.pos = (short) 100;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        boolean boolean15 = lista0.vazia();
        int int16 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        ds.Lista lista14 = new ds.Lista();
        lista14.ultimo = 100;
        lista14.ultimo = '4';
        int int19 = lista14.pos;
        java.lang.Object[] objArray20 = lista14.item;
        lista9.item = objArray20;
        lista9.pos = (short) 100;
        java.lang.Object[] objArray24 = lista9.item;
        lista0.item = objArray24;
        lista0.primeiro = 100;
        java.lang.Object[] objArray28 = lista0.item;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        int int34 = lista29.ultimo;
        java.lang.Object[] objArray35 = lista29.item;
        lista29.pos = 0;
        int int38 = lista29.primeiro;
        ds.Lista lista39 = new ds.Lista();
        lista39.ultimo = 100;
        lista39.ultimo = '4';
        lista39.primeiro = (byte) -1;
        lista39.insere((java.lang.Object) 35);
        lista39.ultimo = (short) 1;
        lista39.pos = (short) 10;
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.pos;
        int int54 = lista52.ultimo;
        lista52.primeiro = '#';
        ds.Lista lista57 = new ds.Lista();
        lista57.ultimo = 100;
        java.lang.Object[] objArray60 = new java.lang.Object[] { 100 };
        lista52.item = objArray60;
        lista39.item = objArray60;
        lista29.item = objArray60;
        lista0.item = objArray60;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[100]");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.primeiro = (byte) 10;
        int int11 = lista0.primeiro;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        boolean boolean9 = lista0.vazia();
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.ultimo = 0;
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        int int16 = lista0.primeiro;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.pos;
        int int8 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int11 = lista0.ultimo;
        lista0.ultimo = 10;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.imprime();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Object[] objArray25 = lista0.item;
        int int26 = lista0.pos;
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        lista0.primeiro = (short) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista9.primeiro = (byte) -1;
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.ultimo;
        lista23.primeiro = '#';
        java.lang.Object[] objArray28 = lista23.item;
        lista17.item = objArray28;
        lista9.item = objArray28;
        lista0.item = objArray28;
        int int32 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        lista0.primeiro = 100;
        lista0.primeiro = 53;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        lista12.primeiro = 0;
        java.lang.Object[] objArray19 = lista12.item;
        lista0.insere((java.lang.Object) objArray19);
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.primeiro;
        lista4.ultimo = 10;
        java.lang.Object[] objArray9 = new java.lang.Object[] { 1.0d };
        lista4.item = objArray9;
        lista0.item = objArray9;
        lista0.ultimo = 'a';
        lista0.primeiro = 1;
        lista0.ultimo = (short) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[1.0]");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        int int19 = lista0.primeiro;
        lista0.primeiro = (short) -1;
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.primeiro = (short) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.ultimo = 100;
        lista10.ultimo = '4';
        lista10.pos = (byte) -1;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        lista17.primeiro = (short) -1;
        int int26 = lista17.pos;
        lista10.insere((java.lang.Object) lista17);
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 97;
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        lista17.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass26 = lista17.getClass();
        lista11.insere((java.lang.Object) wildcardClass26);
        int int28 = lista11.pos;
        lista0.insere((java.lang.Object) lista11);
        lista11.ultimo = 54;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.imprime();
        lista16.ultimo = ' ';
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        java.lang.Object[] objArray27 = lista22.item;
        boolean boolean28 = lista22.vazia();
        lista22.imprime();
        lista16.insere((java.lang.Object) lista22);
        java.lang.Object[] objArray31 = lista16.item;
        lista0.item = objArray31;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.primeiro;
        java.lang.Object[] objArray31 = lista24.item;
        int int32 = lista24.primeiro;
        ds.Lista lista33 = new ds.Lista();
        lista33.ultimo = 100;
        lista33.ultimo = '4';
        lista33.primeiro = (byte) -1;
        lista33.insere((java.lang.Object) 35);
        int int42 = lista33.ultimo;
        int int43 = lista33.pos;
        int int44 = lista33.ultimo;
        lista24.insere((java.lang.Object) int44);
        lista24.ultimo = (byte) 10;
        int int48 = lista24.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 53 + "'", int42 == 53);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 53 + "'", int44 == 53);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        ds.Lista lista18 = new ds.Lista();
        boolean boolean19 = lista18.vazia();
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.ultimo = '4';
        int int25 = lista20.pos;
        java.lang.Object[] objArray26 = lista20.item;
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista20.item = objArray33;
        int int35 = lista20.ultimo;
        lista18.insere((java.lang.Object) lista20);
        lista18.ultimo = 32;
        ds.Lista lista39 = new ds.Lista();
        java.lang.Object[] objArray40 = lista39.item;
        lista18.item = objArray40;
        int int42 = lista18.primeiro;
        lista0.insere((java.lang.Object) int42);
        ds.Lista lista44 = new ds.Lista();
        int int45 = lista44.primeiro;
        lista44.ultimo = 10;
        lista44.pos = ' ';
        lista44.ultimo = 1;
        java.lang.Object[] objArray52 = lista44.item;
        java.lang.Object[] objArray53 = lista44.item;
        lista44.ultimo = 54;
        ds.Lista lista56 = new ds.Lista();
        int int57 = lista56.pos;
        int int58 = lista56.ultimo;
        lista56.primeiro = '#';
        java.lang.Object[] objArray61 = lista56.item;
        lista56.primeiro = (byte) -1;
        int int64 = lista56.primeiro;
        ds.Lista lista65 = new ds.Lista();
        lista65.ultimo = 100;
        lista65.primeiro = '#';
        java.lang.Object[] objArray70 = lista65.item;
        lista56.item = objArray70;
        lista44.item = objArray70;
        lista0.insere((java.lang.Object) objArray70);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.ultimo = 10;
        int int6 = lista0.pos;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.primeiro = '4';
        lista8.imprime();
        boolean boolean14 = lista8.vazia();
        boolean boolean15 = lista8.vazia();
        lista8.ultimo = (short) -1;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = ' ';
        int int21 = lista18.ultimo;
        int int22 = lista18.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.ultimo = 100;
        lista23.ultimo = '4';
        int int28 = lista23.pos;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = '#';
        java.lang.Object[] objArray34 = lista29.item;
        lista23.item = objArray34;
        lista23.pos = 1;
        ds.Lista lista38 = new ds.Lista();
        lista38.ultimo = 100;
        lista38.primeiro = '#';
        java.lang.Object[] objArray43 = lista38.item;
        lista38.primeiro = 35;
        lista23.insere((java.lang.Object) lista38);
        java.lang.Object[] objArray47 = lista23.item;
        lista18.insere((java.lang.Object) objArray47);
        lista8.item = objArray47;
        lista0.item = objArray47;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray47);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        int int7 = lista2.pos;
        java.lang.Object[] objArray8 = lista2.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        java.lang.Object[] objArray15 = lista9.item;
        lista2.item = objArray15;
        int int17 = lista2.ultimo;
        lista0.insere((java.lang.Object) lista2);
        lista0.imprime();
        lista0.ultimo = 'a';
        java.lang.Object[] objArray22 = lista0.item;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.imprime();
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.ultimo = 10;
        lista17.primeiro = (short) 0;
        int int23 = lista17.ultimo;
        lista0.insere((java.lang.Object) lista17);
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = '4';
        lista25.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray32 = lista25.item;
        java.lang.Object[] objArray33 = lista25.item;
        lista25.primeiro = 52;
        lista17.insere((java.lang.Object) 52);
        lista17.ultimo = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        lista0.primeiro = (short) -1;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.ultimo = 10;
        int int6 = lista0.pos;
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = 35;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        boolean boolean15 = lista9.vazia();
        lista9.imprime();
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.primeiro;
        lista17.ultimo = 10;
        lista17.pos = ' ';
        lista17.ultimo = 1;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.primeiro;
        lista25.ultimo = 10;
        lista25.primeiro = (short) 0;
        java.lang.Object[] objArray31 = lista25.item;
        ds.Lista lista32 = new ds.Lista();
        lista32.ultimo = 100;
        lista32.primeiro = '#';
        java.lang.Object[] objArray37 = lista32.item;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        int int40 = lista38.ultimo;
        lista38.primeiro = '#';
        ds.Lista lista43 = new ds.Lista();
        lista43.ultimo = 100;
        java.lang.Object[] objArray46 = new java.lang.Object[] { 100 };
        lista38.item = objArray46;
        lista32.item = objArray46;
        lista25.item = objArray46;
        lista17.item = objArray46;
        ds.Lista lista51 = new ds.Lista();
        int int52 = lista51.pos;
        int int53 = lista51.ultimo;
        lista51.primeiro = '#';
        int int56 = lista51.ultimo;
        java.lang.Object[] objArray57 = lista51.item;
        lista17.item = objArray57;
        lista9.insere((java.lang.Object) lista17);
        int int60 = lista9.ultimo;
        ds.Lista lista61 = new ds.Lista();
        int int62 = lista61.pos;
        int int63 = lista61.ultimo;
        lista61.primeiro = '#';
        java.lang.Object[] objArray66 = lista61.item;
        boolean boolean67 = lista61.vazia();
        int int68 = lista61.pos;
        ds.Lista lista69 = new ds.Lista();
        int int70 = lista69.pos;
        int int71 = lista69.ultimo;
        lista69.primeiro = '#';
        int int74 = lista69.ultimo;
        java.lang.Object[] objArray75 = lista69.item;
        lista61.insere((java.lang.Object) objArray75);
        lista9.item = objArray75;
        java.lang.Object[] objArray78 = lista9.item;
        lista0.item = objArray78;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[100]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = (byte) 1;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        lista7.primeiro = (byte) -1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.primeiro;
        lista15.ultimo = 10;
        lista15.pos = ' ';
        lista15.ultimo = 1;
        java.lang.Object[] objArray23 = lista15.item;
        lista7.item = objArray23;
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = '#';
        java.lang.Object[] objArray31 = lista26.item;
        lista26.primeiro = (byte) -1;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.primeiro;
        lista34.ultimo = 10;
        lista34.pos = ' ';
        lista34.ultimo = 1;
        java.lang.Object[] objArray42 = lista34.item;
        lista26.item = objArray42;
        lista7.insere((java.lang.Object) lista26);
        // The following exception was thrown during execution in test generation
        try {
            lista7.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray42);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        lista0.primeiro = '#';
        lista0.pos = 35;
        lista0.ultimo = 'a';
        lista0.primeiro = (byte) 10;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.imprime();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.primeiro;
        lista12.ultimo = 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '#';
        int int21 = lista16.ultimo;
        java.lang.Object[] objArray22 = lista16.item;
        lista16.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.ultimo = 100;
        lista24.ultimo = '4';
        lista24.primeiro = (byte) -1;
        lista24.insere((java.lang.Object) 35);
        ds.Lista lista33 = new ds.Lista();
        lista33.ultimo = 100;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        lista24.item = objArray38;
        lista16.item = objArray38;
        java.lang.Object[] objArray41 = lista16.item;
        lista12.item = objArray41;
        java.lang.Object[] objArray43 = lista12.item;
        lista0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (short) 10;
        int int27 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.ultimo = '4';
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista9.item = objArray20;
        lista9.pos = 1;
        int int24 = lista9.primeiro;
        lista9.ultimo = 32;
        java.lang.Object[] objArray27 = lista9.item;
        lista0.item = objArray27;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        int int29 = lista24.pos;
        int int30 = lista24.ultimo;
        lista24.primeiro = 0;
        boolean boolean33 = lista24.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100 };
        lista10.item = objArray18;
        lista0.item = objArray18;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        lista21.ultimo = 'a';
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista21.item = objArray47;
        int int50 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        boolean boolean52 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        boolean boolean8 = lista0.vazia();
        lista0.ultimo = 0;
        int int11 = lista0.primeiro;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        boolean boolean1 = lista0.vazia();
        ds.Lista lista2 = new ds.Lista();
        lista2.ultimo = 100;
        lista2.ultimo = '4';
        lista2.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        ds.Lista lista17 = new ds.Lista();
        int int18 = lista17.pos;
        lista17.ultimo = 0;
        lista17.imprime();
        lista17.insere((java.lang.Object) 10.0f);
        lista17.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass26 = lista17.getClass();
        lista11.insere((java.lang.Object) wildcardClass26);
        int int28 = lista11.pos;
        lista0.insere((java.lang.Object) lista11);
        int int30 = lista0.ultimo;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        int int33 = lista31.ultimo;
        lista31.primeiro = '#';
        java.lang.Object[] objArray36 = lista31.item;
        lista31.primeiro = (byte) -1;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.primeiro;
        lista39.ultimo = 10;
        lista39.pos = ' ';
        lista39.ultimo = 1;
        java.lang.Object[] objArray47 = lista39.item;
        lista31.item = objArray47;
        ds.Lista lista49 = new ds.Lista();
        int int50 = lista49.pos;
        int int51 = lista49.ultimo;
        lista49.primeiro = '#';
        lista49.primeiro = 0;
        lista31.insere((java.lang.Object) 0);
        ds.Lista lista57 = new ds.Lista();
        int int58 = lista57.pos;
        lista57.ultimo = 0;
        lista57.ultimo = 0;
        lista57.ultimo = (short) 100;
        ds.Lista lista65 = new ds.Lista();
        int int66 = lista65.pos;
        int int67 = lista65.ultimo;
        lista65.primeiro = '#';
        ds.Lista lista70 = new ds.Lista();
        lista70.ultimo = 100;
        lista70.ultimo = '4';
        int int75 = lista70.pos;
        java.lang.Object[] objArray76 = lista70.item;
        lista65.item = objArray76;
        lista57.item = objArray76;
        lista31.item = objArray76;
        lista0.item = objArray76;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = (byte) 1;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        java.lang.Object[] objArray25 = lista0.item;
        lista0.ultimo = (-1);
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        lista15.primeiro = 35;
        lista0.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.imprime();
        lista15.insere((java.lang.Object) lista24);
        lista15.ultimo = (-1);
        java.lang.Class<?> wildcardClass31 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        java.lang.Object[] objArray11 = lista5.item;
        lista0.item = objArray11;
        lista0.ultimo = 'a';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.ultimo = '4';
        int int20 = lista15.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista15.item = objArray26;
        lista0.item = objArray26;
        int int29 = lista0.pos;
        int int30 = lista0.ultimo;
        int int31 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100 };
        lista10.item = objArray18;
        lista0.item = objArray18;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        lista26.ultimo = '4';
        int int31 = lista26.pos;
        java.lang.Object[] objArray32 = lista26.item;
        lista21.item = objArray32;
        lista21.ultimo = 'a';
        ds.Lista lista36 = new ds.Lista();
        lista36.ultimo = 100;
        lista36.ultimo = '4';
        int int41 = lista36.pos;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        java.lang.Object[] objArray47 = lista42.item;
        lista36.item = objArray47;
        lista21.item = objArray47;
        int int50 = lista21.pos;
        lista0.insere((java.lang.Object) lista21);
        lista0.imprime();
        java.lang.Class<?> wildcardClass53 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.ultimo;
        int int4 = lista0.primeiro;
        ds.Lista lista5 = new ds.Lista();
        lista5.ultimo = 100;
        lista5.ultimo = '4';
        int int10 = lista5.pos;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = '#';
        java.lang.Object[] objArray16 = lista11.item;
        lista5.item = objArray16;
        lista5.pos = 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.ultimo = 100;
        lista20.primeiro = '#';
        java.lang.Object[] objArray25 = lista20.item;
        lista20.primeiro = 35;
        lista5.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray29 = lista5.item;
        lista0.insere((java.lang.Object) objArray29);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.primeiro;
        lista3.ultimo = 10;
        lista3.primeiro = (short) 0;
        java.lang.Object[] objArray9 = lista3.item;
        lista0.item = objArray9;
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        java.lang.Object[] objArray17 = lista12.item;
        lista12.primeiro = (byte) -1;
        int int20 = lista12.primeiro;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        java.lang.Object[] objArray26 = lista21.item;
        lista12.item = objArray26;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        int int30 = lista28.ultimo;
        lista28.primeiro = '4';
        lista28.imprime();
        java.lang.Object[] objArray34 = lista28.item;
        lista12.insere((java.lang.Object) objArray34);
        lista0.item = objArray34;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        lista0.primeiro = (byte) 10;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = '#';
        java.lang.Object[] objArray15 = lista10.item;
        boolean boolean16 = lista10.vazia();
        lista10.imprime();
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.primeiro;
        lista18.ultimo = 10;
        lista18.pos = ' ';
        lista18.ultimo = 1;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.primeiro;
        lista26.ultimo = 10;
        lista26.primeiro = (short) 0;
        java.lang.Object[] objArray32 = lista26.item;
        ds.Lista lista33 = new ds.Lista();
        lista33.ultimo = 100;
        lista33.primeiro = '#';
        java.lang.Object[] objArray38 = lista33.item;
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        int int41 = lista39.ultimo;
        lista39.primeiro = '#';
        ds.Lista lista44 = new ds.Lista();
        lista44.ultimo = 100;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100 };
        lista39.item = objArray47;
        lista33.item = objArray47;
        lista26.item = objArray47;
        lista18.item = objArray47;
        ds.Lista lista52 = new ds.Lista();
        int int53 = lista52.pos;
        int int54 = lista52.ultimo;
        lista52.primeiro = '#';
        int int57 = lista52.ultimo;
        java.lang.Object[] objArray58 = lista52.item;
        lista18.item = objArray58;
        lista10.insere((java.lang.Object) lista18);
        int int61 = lista10.ultimo;
        ds.Lista lista62 = new ds.Lista();
        int int63 = lista62.pos;
        int int64 = lista62.ultimo;
        lista62.primeiro = '#';
        java.lang.Object[] objArray67 = lista62.item;
        boolean boolean68 = lista62.vazia();
        int int69 = lista62.pos;
        ds.Lista lista70 = new ds.Lista();
        int int71 = lista70.pos;
        int int72 = lista70.ultimo;
        lista70.primeiro = '#';
        int int75 = lista70.ultimo;
        java.lang.Object[] objArray76 = lista70.item;
        lista62.insere((java.lang.Object) objArray76);
        lista10.item = objArray76;
        lista0.item = objArray76;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[100]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(objArray76);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.imprime();
        int int8 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.pos = ' ';
        lista8.ultimo = 1;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = '4';
        int int23 = lista18.pos;
        int int24 = lista18.primeiro;
        int int25 = lista18.ultimo;
        lista18.primeiro = (short) 0;
        lista18.pos = 97;
        lista0.insere((java.lang.Object) 97);
        int int31 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        lista0.ultimo = 100;
        lista0.ultimo = '4';
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = '#';
        java.lang.Object[] objArray11 = lista6.item;
        lista0.item = objArray11;
        lista0.pos = 1;
        int int15 = lista0.pos;
        int int16 = lista0.pos;
        int int17 = lista0.ultimo;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = (short) -1;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        lista21.ultimo = 0;
        lista21.imprime();
        lista21.insere((java.lang.Object) 10.0f);
        lista21.primeiro = (short) -1;
        int int30 = lista21.pos;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        int int33 = lista31.ultimo;
        lista31.primeiro = '#';
        int int36 = lista31.ultimo;
        java.lang.Object[] objArray37 = lista31.item;
        lista31.ultimo = 100;
        java.lang.Object[] objArray40 = lista31.item;
        lista21.item = objArray40;
        lista0.item = objArray40;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        java.lang.Object[] objArray7 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 97;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (byte) 1);
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.ultimo;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        java.lang.Object[] objArray5 = new java.lang.Object[] { 1.0d };
        lista0.item = objArray5;
        lista0.primeiro = 0;
        int int9 = lista0.pos;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.pos;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.ultimo = 100;
        lista13.ultimo = '4';
        lista13.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass20 = lista13.getClass();
        lista11.insere((java.lang.Object) wildcardClass20);
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        lista22.primeiro = '#';
        ds.Lista lista27 = new ds.Lista();
        lista27.ultimo = 100;
        lista27.ultimo = '4';
        int int32 = lista27.pos;
        java.lang.Object[] objArray33 = lista27.item;
        lista22.item = objArray33;
        lista22.pos = (short) 100;
        boolean boolean37 = lista22.vazia();
        java.lang.Object[] objArray38 = lista22.item;
        lista11.insere((java.lang.Object) lista22);
        lista0.insere((java.lang.Object) lista22);
        boolean boolean41 = lista0.vazia();
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        int int44 = lista42.ultimo;
        lista42.primeiro = '#';
        ds.Lista lista47 = new ds.Lista();
        lista47.ultimo = 100;
        lista47.ultimo = '4';
        int int52 = lista47.pos;
        java.lang.Object[] objArray53 = lista47.item;
        lista42.item = objArray53;
        lista42.pos = (short) 100;
        java.lang.Object[] objArray57 = lista42.item;
        lista0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        lista0.pos = 0;
        java.lang.Object[] objArray8 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        int int5 = lista0.ultimo;
        int int6 = lista0.ultimo;
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.primeiro = (-1);
        boolean boolean11 = lista0.vazia();
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.primeiro = '#';
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.ultimo = '4';
        int int22 = lista17.pos;
        java.lang.Object[] objArray23 = lista17.item;
        lista12.item = objArray23;
        int int25 = lista12.primeiro;
        java.lang.Object[] objArray26 = lista12.item;
        lista0.insere((java.lang.Object) objArray26);
        ds.Lista lista28 = new ds.Lista();
        lista28.ultimo = 100;
        lista28.ultimo = '4';
        int int33 = lista28.primeiro;
        lista28.ultimo = 32;
        lista0.insere((java.lang.Object) 32);
        lista0.ultimo = 'a';
        java.lang.Object[] objArray39 = null;
        lista0.item = objArray39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = ' ';
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.primeiro = (-1);
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.primeiro = (short) 10;
        lista0.pos = 0;
        lista0.pos = 0;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.ultimo = 100;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        java.lang.Object[] objArray16 = lista0.item;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        int int15 = lista9.primeiro;
        boolean boolean16 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean16);
        lista0.pos = (short) 10;
        int int20 = lista0.pos;
        lista0.ultimo = (short) -1;
        int int23 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '4';
        lista0.insere((java.lang.Object) 10.0d);
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.ultimo = 100;
        lista8.ultimo = '4';
        lista8.primeiro = (byte) -1;
        lista8.insere((java.lang.Object) 35);
        ds.Lista lista17 = new ds.Lista();
        lista17.ultimo = 100;
        lista17.primeiro = '#';
        java.lang.Object[] objArray22 = lista17.item;
        lista8.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (short) 10;
        lista0.primeiro = 53;
        java.lang.Object[] objArray29 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.ultimo = 100;
        lista7.primeiro = '#';
        java.lang.Object[] objArray12 = lista7.item;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = '#';
        ds.Lista lista18 = new ds.Lista();
        lista18.ultimo = 100;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100 };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.item = objArray21;
        lista0.ultimo = 1;
        boolean boolean27 = lista0.vazia();
        java.lang.Object[] objArray28 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[100]");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.primeiro;
        lista0.ultimo = 10;
        lista0.pos = ' ';
        lista0.ultimo = 1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.primeiro;
        lista8.ultimo = 10;
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.ultimo = 100;
        lista15.primeiro = '#';
        java.lang.Object[] objArray20 = lista15.item;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        int int23 = lista21.ultimo;
        lista21.primeiro = '#';
        ds.Lista lista26 = new ds.Lista();
        lista26.ultimo = 100;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 100 };
        lista21.item = objArray29;
        lista15.item = objArray29;
        lista8.item = objArray29;
        lista0.item = objArray29;
        lista0.ultimo = (short) -1;
        boolean boolean36 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[100]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (byte) -1;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        lista0.item = objArray14;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray22 = lista16.item;
        lista0.insere((java.lang.Object) objArray22);
        int int24 = lista0.primeiro;
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = ' ';
        int int28 = lista25.ultimo;
        int int29 = lista25.primeiro;
        ds.Lista lista30 = new ds.Lista();
        lista30.ultimo = 100;
        lista30.ultimo = '4';
        int int35 = lista30.pos;
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        int int38 = lista36.ultimo;
        lista36.primeiro = '#';
        java.lang.Object[] objArray41 = lista36.item;
        lista30.item = objArray41;
        lista30.pos = 1;
        ds.Lista lista45 = new ds.Lista();
        lista45.ultimo = 100;
        lista45.primeiro = '#';
        java.lang.Object[] objArray50 = lista45.item;
        lista45.primeiro = 35;
        lista30.insere((java.lang.Object) lista45);
        java.lang.Object[] objArray54 = lista30.item;
        lista25.insere((java.lang.Object) objArray54);
        int int56 = lista25.ultimo;
        java.lang.Object[] objArray57 = lista25.item;
        lista0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        boolean boolean5 = lista0.vazia();
        lista0.ultimo = (byte) 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = '#';
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        lista9.primeiro = '#';
        java.lang.Object[] objArray14 = lista9.item;
        int int15 = lista9.primeiro;
        boolean boolean16 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean16);
        lista0.pos = (short) 10;
        lista0.imprime();
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.insere((java.lang.Object) 10.0f);
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 0;
        int int4 = lista0.primeiro;
        lista0.imprime();
        lista0.ultimo = 0;
        int int8 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = 0;
        int int14 = lista10.pos;
        lista10.ultimo = 32;
        lista0.insere((java.lang.Object) 32);
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }
}

