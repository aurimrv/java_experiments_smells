package ds.seed5311;

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
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        int int19 = lista0.pos;
        int int20 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.primeiro = ' ';
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        boolean boolean31 = lista18.vazia();
        java.lang.Class<?> wildcardClass32 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (short) 1;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        lista7.pos = '4';
        lista7.primeiro = '4';
        lista7.imprime();
        java.lang.Object[] objArray15 = lista7.item;
        lista7.imprime();
        lista7.primeiro = 'a';
        int int19 = lista7.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        lista4.pos = '4';
        lista4.primeiro = '4';
        lista4.imprime();
        java.lang.Class<?> wildcardClass12 = lista4.getClass();
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.imprime();
        int int3 = lista1.primeiro;
        lista1.imprime();
        lista0.insere((java.lang.Object) lista1);
        lista1.primeiro = (byte) 0;
        boolean boolean8 = lista1.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Class<?> wildcardClass18 = objArray16.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista13.pos = (short) 0;
        lista0.insere((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.primeiro = ' ';
        lista0.ultimo = 'a';
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = (short) -1;
        lista0.primeiro = (byte) -1;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        int int12 = lista9.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        boolean boolean16 = lista13.vazia();
        lista9.insere((java.lang.Object) boolean16);
        boolean boolean18 = lista9.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray11 = lista6.item;
        int int12 = lista6.primeiro;
        lista0.insere((java.lang.Object) lista6);
        boolean boolean14 = lista6.vazia();
        java.lang.Class<?> wildcardClass15 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.imprime();
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        int int23 = lista0.ultimo;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.primeiro = 0;
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.pos = (byte) 1;
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.imprime();
        int int3 = lista1.primeiro;
        lista1.imprime();
        lista0.insere((java.lang.Object) lista1);
        int int6 = lista0.pos;
        lista0.pos = '4';
        int int9 = lista0.primeiro;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray30 = null;
        lista18.item = objArray30;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        int int11 = lista0.pos;
        int int12 = lista0.ultimo;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 52;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista6.pos = 52;
        lista6.pos = (-1);
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        lista29.imprime();
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        lista44.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista50.item = objArray58;
        lista44.item = objArray58;
        lista37.insere((java.lang.Object) objArray58);
        int int62 = lista37.pos;
        java.lang.Object[] objArray63 = lista37.item;
        lista29.item = objArray63;
        lista6.item = objArray63;
        lista0.item = objArray63;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        lista19.imprime();
        java.lang.Object[] objArray25 = lista19.item;
        lista19.ultimo = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        java.lang.Object[] objArray11 = null;
        lista0.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        lista13.pos = '4';
        lista13.primeiro = '4';
        lista13.imprime();
        java.lang.Object[] objArray21 = lista13.item;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass23 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.imprime();
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        lista0.primeiro = 2;
        lista0.primeiro = 52;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        lista10.item = objArray15;
        boolean boolean17 = lista10.vazia();
        lista10.primeiro = (short) 1;
        lista0.insere((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista13.item = objArray18;
        boolean boolean20 = lista13.vazia();
        lista13.primeiro = (short) 1;
        lista0.insere((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.primeiro = (byte) 100;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        int int15 = lista12.primeiro;
        lista12.insere((java.lang.Object) (byte) 100);
        lista12.ultimo = (short) 0;
        lista12.imprime();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        int int27 = lista0.pos;
        int int28 = lista0.pos;
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.primeiro = ' ';
        lista0.ultimo = 'a';
        lista0.insere((java.lang.Object) 'a');
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = 0;
        int int13 = lista0.ultimo;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = (short) -1;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        java.lang.Object[] objArray44 = lista39.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista39.item = objArray47;
        lista33.item = objArray47;
        lista0.item = objArray47;
        lista0.ultimo = 'a';
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, -1.0]");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.primeiro;
        ds.Lista lista61 = new ds.Lista();
        lista61.primeiro = '4';
        java.lang.Object obj64 = new java.lang.Object();
        lista61.insere(obj64);
        lista61.imprime();
        java.lang.Object[] objArray67 = lista61.item;
        ds.Lista lista68 = new ds.Lista();
        lista68.primeiro = '4';
        java.lang.Object obj71 = new java.lang.Object();
        lista68.insere(obj71);
        lista68.imprime();
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        java.lang.Object obj77 = new java.lang.Object();
        lista74.insere(obj77);
        java.lang.Object[] objArray79 = lista74.item;
        java.lang.Object[] objArray82 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista74.item = objArray82;
        lista68.item = objArray82;
        lista61.insere((java.lang.Object) objArray82);
        lista0.item = objArray82;
        java.lang.Class<?> wildcardClass87 = objArray82.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 0;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        int int11 = lista8.pos;
        int int12 = lista8.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista0.item = objArray25;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        lista0.imprime();
        int int32 = lista0.ultimo;
        java.lang.Object[] objArray33 = lista0.item;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = (short) -1;
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.ultimo;
        lista0.pos = 52;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        lista0.pos = 0;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        int int5 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        int int27 = lista0.pos;
        int int28 = lista0.pos;
        int int29 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        lista0.imprime();
        int int32 = lista0.ultimo;
        java.lang.Class<?> wildcardClass33 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.pos = 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.ultimo = 2;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        lista10.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.primeiro;
        lista13.imprime();
        lista13.imprime();
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        lista0.ultimo = (short) -1;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        java.lang.Class<?> wildcardClass16 = objArray14.getClass();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        java.lang.Object[] objArray71 = lista69.item;
        lista66.item = objArray71;
        lista0.item = objArray71;
        int int74 = lista0.ultimo;
        java.lang.Class<?> wildcardClass75 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        lista0.pos = 52;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.pos = 100;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista8.item = objArray20;
        lista0.item = objArray20;
        lista0.imprime();
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        lista0.imprime();
        int int32 = lista0.ultimo;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        lista33.ultimo = 0;
        int int40 = lista33.pos;
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        java.lang.Object[] objArray43 = lista41.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.imprime();
        java.lang.Object[] objArray46 = lista44.item;
        lista41.item = objArray46;
        boolean boolean48 = lista41.vazia();
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        lista49.pos = '4';
        lista49.primeiro = '4';
        lista49.imprime();
        java.lang.Object[] objArray57 = lista49.item;
        lista41.item = objArray57;
        lista33.item = objArray57;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        java.lang.Object[] objArray21 = lista16.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista16.item = objArray24;
        lista10.item = objArray24;
        java.lang.Object[] objArray27 = lista10.item;
        lista0.insere((java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Class<?> wildcardClass6 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        java.lang.Object[] objArray33 = lista28.item;
        lista0.item = objArray33;
        int int35 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        lista0.pos = 0;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        java.lang.Object[] objArray17 = lista0.item;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.pos = '4';
        lista0.primeiro = (byte) 10;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.ultimo = 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        int int27 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        lista0.primeiro = ' ';
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista0.item = objArray25;
        int int28 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.primeiro;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        lista0.ultimo = 1;
        int int8 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = (short) -1;
        lista0.primeiro = (byte) -1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista10.insere(obj15);
        lista10.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        int int21 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        lista0.ultimo = 32;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.imprime();
        int int3 = lista1.primeiro;
        lista1.imprime();
        lista0.insere((java.lang.Object) lista1);
        lista1.primeiro = (byte) 0;
        lista1.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        boolean boolean8 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.pos = '4';
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        int int5 = lista0.pos;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 0;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        lista0.pos = '#';
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = 0;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        int int10 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.primeiro = ' ';
        lista0.ultimo = 'a';
        lista0.insere((java.lang.Object) 'a');
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        lista0.pos = (-1);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = 10;
        lista0.pos = (short) -1;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.ultimo = 32;
        lista0.primeiro = (byte) 100;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        lista0.primeiro = (short) 100;
        java.lang.Class<?> wildcardClass19 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        lista0.imprime();
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 52;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        boolean boolean19 = lista0.vazia();
        boolean boolean20 = lista0.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        int int24 = lista21.pos;
        lista21.pos = (short) 10;
        boolean boolean27 = lista21.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) boolean27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        java.lang.Object[] objArray26 = lista0.item;
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray37 = lista0.item;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        lista6.primeiro = (byte) 1;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        java.lang.Object[] objArray34 = lista28.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        java.lang.Object[] objArray46 = lista41.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista41.item = objArray49;
        lista35.item = objArray49;
        lista28.insere((java.lang.Object) objArray49);
        int int53 = lista28.primeiro;
        lista28.imprime();
        java.lang.Object[] objArray55 = lista28.item;
        lista6.item = objArray55;
        java.lang.Class<?> wildcardClass57 = objArray55.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 52 + "'", int53 == 52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        lista0.pos = 10;
        int int8 = lista0.ultimo;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        lista0.pos = 52;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.primeiro;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        lista10.insere((java.lang.Object) '#');
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f };
        lista10.item = objArray19;
        java.lang.Object[] objArray21 = lista10.item;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass23 = objArray21.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        int int13 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        int int12 = lista0.ultimo;
        lista0.primeiro = (byte) -1;
        int int15 = lista0.pos;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        lista8.pos = 1;
        lista8.primeiro = '4';
        lista0.insere((java.lang.Object) '4');
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        java.lang.Object[] objArray26 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 0;
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        java.lang.Object[] objArray10 = lista5.item;
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista5.item = objArray13;
        int int15 = lista5.pos;
        java.lang.Object[] objArray16 = null;
        lista5.item = objArray16;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        lista18.pos = '4';
        lista18.primeiro = '4';
        lista18.imprime();
        java.lang.Object[] objArray26 = lista18.item;
        lista5.item = objArray26;
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        lista5.pos = '4';
        lista5.ultimo = (short) -1;
        lista0.insere((java.lang.Object) lista5);
        lista0.primeiro = (byte) 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        lista15.imprime();
        lista15.pos = (short) -1;
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        int int7 = lista0.ultimo;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        lista8.primeiro = (short) 0;
        java.lang.Object[] objArray13 = lista8.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.ultimo = 0;
        int int21 = lista14.pos;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        java.lang.Object[] objArray27 = lista25.item;
        lista22.item = objArray27;
        boolean boolean29 = lista22.vazia();
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        lista30.pos = '4';
        lista30.primeiro = '4';
        lista30.imprime();
        java.lang.Object[] objArray38 = lista30.item;
        lista22.item = objArray38;
        lista14.item = objArray38;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        java.lang.Object[] objArray46 = lista41.item;
        lista41.imprime();
        int int48 = lista41.primeiro;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        java.lang.Object obj52 = new java.lang.Object();
        lista49.insere(obj52);
        lista49.imprime();
        java.lang.Object[] objArray55 = lista49.item;
        ds.Lista lista56 = new ds.Lista();
        lista56.primeiro = '4';
        java.lang.Object obj59 = new java.lang.Object();
        lista56.insere(obj59);
        lista56.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.primeiro = '4';
        java.lang.Object obj65 = new java.lang.Object();
        lista62.insere(obj65);
        java.lang.Object[] objArray67 = lista62.item;
        java.lang.Object[] objArray70 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista62.item = objArray70;
        lista56.item = objArray70;
        lista49.insere((java.lang.Object) objArray70);
        int int74 = lista49.pos;
        java.lang.Object[] objArray75 = lista49.item;
        lista41.item = objArray75;
        lista14.item = objArray75;
        lista14.imprime();
        lista14.imprime();
        lista8.insere((java.lang.Object) lista14);
        int int81 = lista14.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        lista12.ultimo = 10;
        lista12.imprime();
        java.lang.Object[] objArray21 = lista12.item;
        lista9.item = objArray21;
        lista0.item = objArray21;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista0.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        lista13.imprime();
        java.lang.Object[] objArray19 = lista13.item;
        boolean boolean20 = lista13.vazia();
        int int21 = lista13.primeiro;
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = '4';
        java.lang.Object obj28 = new java.lang.Object();
        lista25.insere(obj28);
        lista25.imprime();
        lista25.ultimo = 10;
        lista25.imprime();
        java.lang.Object[] objArray34 = lista25.item;
        lista22.item = objArray34;
        lista13.item = objArray34;
        lista0.item = objArray34;
        java.lang.Class<?> wildcardClass38 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.imprime();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.ultimo = (byte) 100;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.ultimo = (byte) 100;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.primeiro = (short) 10;
        lista0.ultimo = 1;
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.primeiro = (byte) 100;
        lista0.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        boolean boolean25 = lista0.vazia();
        lista0.primeiro = '#';
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        java.lang.Object[] objArray34 = lista28.item;
        java.lang.Object[] objArray35 = lista28.item;
        lista0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        java.lang.Object obj6 = new java.lang.Object();
        lista3.insere(obj6);
        lista3.imprime();
        lista3.ultimo = 10;
        lista3.imprime();
        java.lang.Object[] objArray12 = lista3.item;
        lista0.item = objArray12;
        boolean boolean14 = lista0.vazia();
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.primeiro = (byte) 1;
        boolean boolean11 = lista0.vazia();
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        lista19.pos = '4';
        lista19.primeiro = '4';
        lista19.imprime();
        java.lang.Class<?> wildcardClass27 = lista19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        int int19 = lista0.pos;
        java.lang.Object[] objArray20 = null;
        lista0.item = objArray20;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        boolean boolean28 = lista0.vazia();
        boolean boolean29 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (short) 1;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        boolean boolean26 = lista0.vazia();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista0.item = objArray28;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        lista0.pos = (short) 10;
        java.lang.Class<?> wildcardClass27 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        boolean boolean35 = lista0.vazia();
        int int36 = lista0.pos;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        lista37.imprime();
        lista0.insere((java.lang.Object) lista37);
        lista37.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = (short) 10;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Class<?> wildcardClass20 = objArray19.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        lista0.pos = 10;
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        int int12 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.ultimo;
        int int61 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 52 + "'", int61 == 52);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.imprime();
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista18.primeiro = (short) 0;
        java.lang.Object[] objArray23 = lista18.item;
        lista0.item = objArray23;
        lista0.primeiro = '4';
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        lista15.imprime();
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        lista23.imprime();
        java.lang.Object[] objArray29 = lista23.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista23.insere((java.lang.Object) objArray44);
        int int48 = lista23.pos;
        java.lang.Object[] objArray49 = lista23.item;
        lista15.item = objArray49;
        lista0.item = objArray49;
        lista0.pos = (byte) 0;
        boolean boolean54 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        boolean boolean31 = lista18.vazia();
        java.lang.Object[] objArray32 = lista18.item;
        java.lang.Class<?> wildcardClass33 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        java.lang.Object[] objArray71 = lista69.item;
        lista66.item = objArray71;
        lista0.item = objArray71;
        java.lang.Class<?> wildcardClass74 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.primeiro = (short) 0;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        lista20.imprime();
        java.lang.Object[] objArray26 = lista20.item;
        java.lang.Object[] objArray27 = lista20.item;
        lista0.item = objArray27;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        int int19 = lista10.ultimo;
        java.lang.Class<?> wildcardClass20 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object obj8 = null;
        lista0.insere(obj8);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (short) -1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        java.lang.Object obj12 = new java.lang.Object();
        lista9.insere(obj12);
        lista9.imprime();
        java.lang.Object[] objArray15 = lista9.item;
        lista9.imprime();
        lista9.primeiro = 0;
        lista0.insere((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 35;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        lista10.pos = '4';
        lista10.ultimo = (short) -1;
        int int17 = lista10.primeiro;
        lista10.pos = (short) 10;
        java.lang.Object[] objArray20 = lista10.item;
        lista0.item = objArray20;
        java.lang.Class<?> wildcardClass22 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.pos = 1;
        lista0.primeiro = '4';
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.imprime();
        int int15 = lista0.ultimo;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.primeiro;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista29.insere(obj34);
        lista29.pos = 35;
        lista0.insere((java.lang.Object) lista29);
        int int40 = lista29.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        lista0.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        lista0.pos = '#';
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        lista35.primeiro = (short) -1;
        lista35.primeiro = (byte) -1;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista45.insere(obj50);
        lista45.pos = (byte) 100;
        lista35.insere((java.lang.Object) (byte) 100);
        lista0.insere((java.lang.Object) lista35);
        int int57 = lista35.pos;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        java.lang.Object[] objArray16 = lista11.item;
        lista11.imprime();
        int int18 = lista11.primeiro;
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        lista19.imprime();
        java.lang.Object[] objArray25 = lista19.item;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        lista26.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista32.item = objArray40;
        lista26.item = objArray40;
        lista19.insere((java.lang.Object) objArray40);
        int int44 = lista19.pos;
        java.lang.Object[] objArray45 = lista19.item;
        lista11.item = objArray45;
        lista0.item = objArray45;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray45);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        lista0.primeiro = 2;
        lista0.primeiro = 52;
        java.lang.Object[] objArray10 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        int int27 = lista0.pos;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        lista28.pos = '4';
        lista28.primeiro = '4';
        lista28.imprime();
        java.lang.Object[] objArray36 = lista28.item;
        lista28.imprime();
        lista28.primeiro = 'a';
        lista28.pos = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.ultimo;
        int int28 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        boolean boolean19 = lista0.vazia();
        boolean boolean20 = lista0.vazia();
        int int21 = lista0.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        lista22.imprime();
        java.lang.Object[] objArray28 = lista22.item;
        lista22.ultimo = (short) 0;
        int int31 = lista22.pos;
        int int32 = lista22.ultimo;
        lista22.primeiro = (byte) 0;
        int int35 = lista22.primeiro;
        java.lang.Object[] objArray36 = lista22.item;
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        int int21 = lista18.primeiro;
        lista18.insere((java.lang.Object) (byte) 100);
        lista18.primeiro = ' ';
        lista18.ultimo = 'a';
        java.lang.Object[] objArray28 = lista18.item;
        lista0.item = objArray28;
        java.lang.Class<?> wildcardClass30 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        lista5.ultimo = 0;
        int int12 = lista5.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista13.item = objArray18;
        boolean boolean20 = lista13.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        lista21.pos = '4';
        lista21.primeiro = '4';
        lista21.imprime();
        java.lang.Object[] objArray29 = lista21.item;
        lista13.item = objArray29;
        lista5.item = objArray29;
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.imprime();
        int int39 = lista32.primeiro;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        int int65 = lista40.pos;
        java.lang.Object[] objArray66 = lista40.item;
        lista32.item = objArray66;
        lista5.item = objArray66;
        lista0.item = objArray66;
        int int70 = lista0.ultimo;
        ds.Lista lista71 = new ds.Lista();
        lista71.primeiro = '4';
        java.lang.Object obj74 = new java.lang.Object();
        lista71.insere(obj74);
        java.lang.Object[] objArray76 = lista71.item;
        java.lang.Object[] objArray79 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista71.item = objArray79;
        int int81 = lista71.pos;
        java.lang.Object[] objArray82 = null;
        lista71.item = objArray82;
        ds.Lista lista84 = new ds.Lista();
        lista84.primeiro = '4';
        lista84.pos = '4';
        lista84.primeiro = '4';
        lista84.imprime();
        java.lang.Object[] objArray92 = lista84.item;
        lista71.item = objArray92;
        lista0.insere((java.lang.Object) lista71);
        lista71.pos = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray92);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray30 = lista18.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        java.lang.Object[] objArray36 = lista31.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista31.item = objArray39;
        int int41 = lista31.pos;
        java.lang.Object[] objArray42 = null;
        lista31.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        lista44.pos = '4';
        lista44.primeiro = '4';
        lista44.imprime();
        java.lang.Object[] objArray52 = lista44.item;
        lista31.item = objArray52;
        lista18.insere((java.lang.Object) lista31);
        boolean boolean55 = lista31.vazia();
        int int56 = lista31.primeiro;
        lista31.pos = 100;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        lista0.primeiro = (byte) 10;
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        int int24 = lista21.primeiro;
        boolean boolean25 = lista21.vazia();
        lista21.ultimo = (byte) 0;
        lista21.ultimo = (byte) 1;
        lista0.insere((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista0.primeiro = (short) 0;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        java.lang.Object[] objArray33 = lista28.item;
        lista0.item = objArray33;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        lista35.pos = '4';
        lista35.ultimo = (short) -1;
        lista35.ultimo = 32;
        lista0.insere((java.lang.Object) lista35);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = 1;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        int int12 = lista9.primeiro;
        boolean boolean13 = lista9.vazia();
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.ultimo = (short) -1;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista15.item = objArray31;
        lista9.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista9);
        int int36 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        lista0.pos = '#';
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        java.lang.Class<?> wildcardClass15 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (short) 1;
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        lista11.imprime();
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista11.item = objArray25;
        lista11.imprime();
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista29.item = objArray37;
        int int39 = lista29.pos;
        lista11.insere((java.lang.Object) lista29);
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        int int44 = lista41.primeiro;
        boolean boolean45 = lista41.vazia();
        int int46 = lista41.pos;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        lista47.pos = '4';
        lista47.ultimo = (short) -1;
        int int54 = lista47.primeiro;
        ds.Lista lista55 = new ds.Lista();
        lista55.primeiro = '4';
        java.lang.Object obj58 = new java.lang.Object();
        lista55.insere(obj58);
        java.lang.Object[] objArray60 = lista55.item;
        java.lang.Object[] objArray63 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista55.item = objArray63;
        lista47.item = objArray63;
        lista41.insere((java.lang.Object) lista47);
        boolean boolean67 = lista41.vazia();
        ds.Lista lista68 = new ds.Lista();
        java.lang.Object[] objArray69 = lista68.item;
        lista41.item = objArray69;
        lista29.item = objArray69;
        lista0.item = objArray69;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 52 + "'", int54 == 52);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.ultimo = (-1);
        lista8.ultimo = 52;
        java.lang.Object[] objArray20 = lista8.item;
        lista0.item = objArray20;
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        lista22.ultimo = 0;
        int int29 = lista22.pos;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        java.lang.Object[] objArray32 = lista30.item;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray35 = lista33.item;
        lista30.item = objArray35;
        boolean boolean37 = lista30.vazia();
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        lista38.pos = '4';
        lista38.primeiro = '4';
        lista38.imprime();
        java.lang.Object[] objArray46 = lista38.item;
        lista30.item = objArray46;
        lista22.item = objArray46;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        java.lang.Object obj52 = new java.lang.Object();
        lista49.insere(obj52);
        java.lang.Object[] objArray54 = lista49.item;
        lista49.imprime();
        int int56 = lista49.primeiro;
        ds.Lista lista57 = new ds.Lista();
        lista57.primeiro = '4';
        java.lang.Object obj60 = new java.lang.Object();
        lista57.insere(obj60);
        lista57.imprime();
        java.lang.Object[] objArray63 = lista57.item;
        ds.Lista lista64 = new ds.Lista();
        lista64.primeiro = '4';
        java.lang.Object obj67 = new java.lang.Object();
        lista64.insere(obj67);
        lista64.imprime();
        ds.Lista lista70 = new ds.Lista();
        lista70.primeiro = '4';
        java.lang.Object obj73 = new java.lang.Object();
        lista70.insere(obj73);
        java.lang.Object[] objArray75 = lista70.item;
        java.lang.Object[] objArray78 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista70.item = objArray78;
        lista64.item = objArray78;
        lista57.insere((java.lang.Object) objArray78);
        int int82 = lista57.pos;
        java.lang.Object[] objArray83 = lista57.item;
        lista49.item = objArray83;
        lista22.item = objArray83;
        lista22.imprime();
        lista22.imprime();
        ds.Lista lista88 = new ds.Lista();
        lista88.imprime();
        java.lang.Object[] objArray90 = lista88.item;
        ds.Lista lista91 = new ds.Lista();
        lista91.imprime();
        java.lang.Object[] objArray93 = lista91.item;
        lista88.item = objArray93;
        lista22.item = objArray93;
        lista0.item = objArray93;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        boolean boolean6 = lista0.vazia();
        lista0.pos = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        int int7 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.pos = 'a';
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        lista0.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        boolean boolean28 = lista0.vazia();
        int int29 = lista0.ultimo;
        java.lang.Class<?> wildcardClass30 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.primeiro = (byte) 1;
        int int11 = lista0.primeiro;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista6.pos = 52;
        lista6.pos = (-1);
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        lista29.imprime();
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        lista44.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista50.item = objArray58;
        lista44.item = objArray58;
        lista37.insere((java.lang.Object) objArray58);
        int int62 = lista37.pos;
        java.lang.Object[] objArray63 = lista37.item;
        lista29.item = objArray63;
        lista6.item = objArray63;
        lista0.item = objArray63;
        int int67 = lista0.pos;
        java.lang.Object[] objArray68 = lista0.item;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        lista0.pos = '4';
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray11 = lista9.item;
        lista9.primeiro = (short) 0;
        java.lang.Object[] objArray14 = lista9.item;
        lista0.insere((java.lang.Object) objArray14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.ultimo = ' ';
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (short) 1;
        int int10 = lista0.primeiro;
        int int11 = lista0.pos;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.ultimo;
        lista0.pos = 52;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        int int12 = lista9.pos;
        lista9.pos = ' ';
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.ultimo = (short) -1;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista15.item = objArray31;
        lista15.pos = 52;
        lista15.pos = (-1);
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        java.lang.Object[] objArray43 = lista38.item;
        lista38.imprime();
        int int45 = lista38.primeiro;
        ds.Lista lista46 = new ds.Lista();
        lista46.primeiro = '4';
        java.lang.Object obj49 = new java.lang.Object();
        lista46.insere(obj49);
        lista46.imprime();
        java.lang.Object[] objArray52 = lista46.item;
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        lista53.imprime();
        ds.Lista lista59 = new ds.Lista();
        lista59.primeiro = '4';
        java.lang.Object obj62 = new java.lang.Object();
        lista59.insere(obj62);
        java.lang.Object[] objArray64 = lista59.item;
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista59.item = objArray67;
        lista53.item = objArray67;
        lista46.insere((java.lang.Object) objArray67);
        int int71 = lista46.pos;
        java.lang.Object[] objArray72 = lista46.item;
        lista38.item = objArray72;
        lista15.item = objArray72;
        lista9.item = objArray72;
        lista0.insere((java.lang.Object) objArray72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 0;
        int int16 = lista0.primeiro;
        int int17 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.primeiro;
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista10.insere(obj15);
        lista10.pos = (byte) 100;
        lista10.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        java.lang.Object[] objArray26 = lista21.item;
        lista21.insere((java.lang.Object) '#');
        int int29 = lista21.ultimo;
        lista10.insere((java.lang.Object) lista21);
        lista0.insere((java.lang.Object) lista10);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.primeiro = (byte) 1;
        boolean boolean11 = lista0.vazia();
        lista0.primeiro = (short) -1;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        java.lang.Object[] objArray31 = null;
        lista18.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        lista33.imprime();
        lista33.imprime();
        java.lang.Object[] objArray38 = lista33.item;
        lista18.item = objArray38;
        java.lang.Object[] objArray40 = lista18.item;
        int int41 = lista18.ultimo;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        lista48.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista54.item = objArray62;
        lista48.item = objArray62;
        ds.Lista lista65 = new ds.Lista();
        lista65.primeiro = '4';
        java.lang.Object obj68 = new java.lang.Object();
        lista65.insere(obj68);
        java.lang.Object[] objArray70 = lista65.item;
        java.lang.Object[] objArray73 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista65.item = objArray73;
        lista48.item = objArray73;
        lista42.item = objArray73;
        lista18.item = objArray73;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[10.0, -1.0]");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista0.primeiro = (short) 0;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        boolean boolean30 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        boolean boolean31 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        int int23 = lista0.ultimo;
        int int24 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        lista26.pos = '4';
        lista26.primeiro = '4';
        int int33 = lista26.primeiro;
        int int34 = lista26.primeiro;
        lista26.pos = (byte) 1;
        lista26.pos = (byte) 1;
        lista26.primeiro = (byte) 100;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        java.lang.Object[] objArray46 = lista41.item;
        lista41.imprime();
        int int48 = lista41.primeiro;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        java.lang.Object obj52 = new java.lang.Object();
        lista49.insere(obj52);
        lista49.imprime();
        java.lang.Object[] objArray55 = lista49.item;
        ds.Lista lista56 = new ds.Lista();
        lista56.primeiro = '4';
        java.lang.Object obj59 = new java.lang.Object();
        lista56.insere(obj59);
        lista56.imprime();
        ds.Lista lista62 = new ds.Lista();
        lista62.primeiro = '4';
        java.lang.Object obj65 = new java.lang.Object();
        lista62.insere(obj65);
        java.lang.Object[] objArray67 = lista62.item;
        java.lang.Object[] objArray70 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista62.item = objArray70;
        lista56.item = objArray70;
        lista49.insere((java.lang.Object) objArray70);
        int int74 = lista49.pos;
        java.lang.Object[] objArray75 = lista49.item;
        lista41.item = objArray75;
        lista26.item = objArray75;
        lista0.item = objArray75;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = (short) -1;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        lista33.pos = '4';
        lista33.ultimo = (short) -1;
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        java.lang.Object[] objArray46 = lista41.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista41.item = objArray49;
        lista33.item = objArray49;
        boolean boolean52 = lista33.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista33);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        lista28.item = objArray42;
        lista0.item = objArray42;
        lista0.pos = ' ';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        lista0.pos = (short) 10;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        lista27.pos = '4';
        lista27.primeiro = '4';
        lista27.imprime();
        java.lang.Object[] objArray35 = lista27.item;
        boolean boolean36 = lista27.vazia();
        lista27.pos = 10;
        lista27.pos = (short) -1;
        java.lang.Object[] objArray41 = lista27.item;
        lista0.item = objArray41;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = (short) -1;
        lista0.pos = (byte) -1;
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        int int37 = lista34.primeiro;
        boolean boolean38 = lista34.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) boolean38);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        lista0.pos = (byte) 10;
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        lista0.ultimo = (-1);
        lista0.pos = '4';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.ultimo = (short) 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.primeiro = (byte) 100;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f };
        lista0.item = objArray9;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        lista8.imprime();
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        java.lang.Object[] objArray26 = lista21.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista21.item = objArray29;
        lista15.item = objArray29;
        lista8.insere((java.lang.Object) objArray29);
        int int33 = lista8.pos;
        java.lang.Object[] objArray34 = lista8.item;
        lista0.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        lista36.pos = '4';
        lista36.ultimo = (short) -1;
        int int43 = lista36.primeiro;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista36.item = objArray52;
        lista0.item = objArray52;
        boolean boolean56 = lista0.vazia();
        lista0.pos = '4';
        boolean boolean59 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        lista8.imprime();
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        java.lang.Object[] objArray26 = lista21.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista21.item = objArray29;
        lista15.item = objArray29;
        lista8.insere((java.lang.Object) objArray29);
        int int33 = lista8.pos;
        java.lang.Object[] objArray34 = lista8.item;
        lista0.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        lista36.pos = '4';
        lista36.ultimo = (short) -1;
        int int43 = lista36.primeiro;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista36.item = objArray52;
        lista0.item = objArray52;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        java.lang.Class<?> wildcardClass19 = objArray16.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 32;
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.imprime();
        java.lang.Object[] objArray20 = lista14.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        lista21.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista27.item = objArray35;
        lista21.item = objArray35;
        lista14.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10.0, -1.0]");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.primeiro = '4';
        int int6 = lista3.primeiro;
        boolean boolean7 = lista3.vazia();
        lista0.insere((java.lang.Object) lista3);
        lista3.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = 0;
        lista0.ultimo = 100;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        int int19 = lista16.pos;
        lista16.pos = (short) 10;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        lista22.primeiro = (short) 0;
        java.lang.Object[] objArray27 = lista22.item;
        int int28 = lista22.primeiro;
        lista16.insere((java.lang.Object) lista22);
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista30.primeiro = 0;
        ds.Lista lista49 = new ds.Lista();
        lista49.primeiro = '4';
        java.lang.Object obj52 = new java.lang.Object();
        lista49.insere(obj52);
        lista49.imprime();
        ds.Lista lista55 = new ds.Lista();
        lista55.imprime();
        java.lang.Object[] objArray57 = lista55.item;
        ds.Lista lista58 = new ds.Lista();
        lista58.imprime();
        java.lang.Object[] objArray60 = lista58.item;
        lista55.item = objArray60;
        boolean boolean62 = lista55.vazia();
        ds.Lista lista63 = new ds.Lista();
        lista63.primeiro = '4';
        lista63.pos = '4';
        lista63.primeiro = '4';
        lista63.imprime();
        java.lang.Object[] objArray71 = lista63.item;
        lista55.item = objArray71;
        lista49.item = objArray71;
        lista30.item = objArray71;
        lista22.item = objArray71;
        lista22.imprime();
        java.lang.Object[] objArray77 = lista22.item;
        lista0.item = objArray77;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray77);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.pos = 100;
        java.lang.Object[] objArray10 = null;
        lista0.item = objArray10;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0, -1.0]");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista18.primeiro = (short) 0;
        java.lang.Object[] objArray23 = lista18.item;
        lista0.item = objArray23;
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = '4';
        lista25.pos = '4';
        lista25.ultimo = (short) -1;
        int int32 = lista25.primeiro;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista33.item = objArray41;
        lista25.item = objArray41;
        int int44 = lista25.pos;
        java.lang.Object[] objArray45 = null;
        lista25.item = objArray45;
        lista0.insere((java.lang.Object) objArray45);
        lista0.ultimo = (byte) 1;
        int int50 = lista0.ultimo;
        lista0.pos = 0;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista0.item = objArray25;
        lista0.ultimo = 1;
        int int30 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        int int27 = lista0.pos;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista29.item = objArray37;
        lista29.pos = (short) 0;
        lista29.pos = (short) 1;
        ds.Lista lista43 = new ds.Lista();
        java.lang.Object[] objArray44 = lista43.item;
        lista29.item = objArray44;
        java.lang.Object[] objArray46 = lista29.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        int int50 = lista47.primeiro;
        lista47.insere((java.lang.Object) (byte) 100);
        lista47.primeiro = ' ';
        lista47.ultimo = 'a';
        java.lang.Object[] objArray57 = lista47.item;
        lista29.item = objArray57;
        lista0.item = objArray57;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 52 + "'", int50 == 52);
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        lista5.ultimo = 0;
        int int12 = lista5.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista13.item = objArray18;
        boolean boolean20 = lista13.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        lista21.pos = '4';
        lista21.primeiro = '4';
        lista21.imprime();
        java.lang.Object[] objArray29 = lista21.item;
        lista13.item = objArray29;
        lista5.item = objArray29;
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.imprime();
        int int39 = lista32.primeiro;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        int int65 = lista40.pos;
        java.lang.Object[] objArray66 = lista40.item;
        lista32.item = objArray66;
        lista5.item = objArray66;
        lista0.item = objArray66;
        int int70 = lista0.ultimo;
        ds.Lista lista71 = new ds.Lista();
        lista71.primeiro = '4';
        java.lang.Object obj74 = new java.lang.Object();
        lista71.insere(obj74);
        java.lang.Object[] objArray76 = lista71.item;
        java.lang.Object[] objArray79 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista71.item = objArray79;
        int int81 = lista71.pos;
        java.lang.Object[] objArray82 = null;
        lista71.item = objArray82;
        ds.Lista lista84 = new ds.Lista();
        lista84.primeiro = '4';
        lista84.pos = '4';
        lista84.primeiro = '4';
        lista84.imprime();
        java.lang.Object[] objArray92 = lista84.item;
        lista71.item = objArray92;
        lista0.insere((java.lang.Object) lista71);
        int int95 = lista71.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = 1;
        java.lang.Object[] objArray32 = lista0.item;
        int int33 = lista0.ultimo;
        java.lang.Object[] objArray34 = lista0.item;
        java.lang.Class<?> wildcardClass35 = objArray34.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) -1;
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 32;
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        lista0.insere((java.lang.Object) 10.0f);
        int int10 = lista0.ultimo;
        lista0.primeiro = 32;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.ultimo = 32;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        boolean boolean60 = lista0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        lista0.imprime();
        int int36 = lista0.primeiro;
        java.lang.Class<?> wildcardClass37 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        int int13 = lista0.primeiro;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        lista0.pos = (byte) -1;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista6.pos = 52;
        lista6.pos = (-1);
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        lista29.imprime();
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        lista44.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista50.item = objArray58;
        lista44.item = objArray58;
        lista37.insere((java.lang.Object) objArray58);
        int int62 = lista37.pos;
        java.lang.Object[] objArray63 = lista37.item;
        lista29.item = objArray63;
        lista6.item = objArray63;
        lista0.item = objArray63;
        int int67 = lista0.pos;
        java.lang.Object[] objArray68 = lista0.item;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertNotNull(objArray68);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        java.lang.Object[] objArray12 = lista6.item;
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        lista13.imprime();
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        java.lang.Object[] objArray24 = lista19.item;
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista19.item = objArray27;
        lista13.item = objArray27;
        lista6.insere((java.lang.Object) objArray27);
        int int31 = lista6.primeiro;
        lista6.imprime();
        java.lang.Object[] objArray33 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.primeiro;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        int int30 = lista28.primeiro;
        int int31 = lista28.pos;
        int int32 = lista28.primeiro;
        lista28.primeiro = '4';
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        lista28.insere((java.lang.Object) objArray56);
        lista0.insere((java.lang.Object) objArray56);
        int int62 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.pos;
        lista0.pos = 100;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        int int35 = lista0.ultimo;
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        lista36.pos = '4';
        lista36.primeiro = '4';
        lista36.imprime();
        java.lang.Object[] objArray44 = lista36.item;
        boolean boolean45 = lista36.vazia();
        lista36.pos = 10;
        lista36.pos = (short) -1;
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        int int55 = lista50.ultimo;
        lista50.pos = '4';
        java.lang.Object[] objArray58 = lista50.item;
        lista36.item = objArray58;
        lista0.item = objArray58;
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        java.lang.Object[] objArray71 = lista69.item;
        lista66.item = objArray71;
        lista0.item = objArray71;
        int int74 = lista0.ultimo;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray11 = lista9.item;
        lista6.item = objArray11;
        boolean boolean13 = lista6.vazia();
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        lista14.pos = '4';
        lista14.primeiro = '4';
        lista14.imprime();
        java.lang.Object[] objArray22 = lista14.item;
        lista6.item = objArray22;
        lista0.item = objArray22;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        java.lang.Object obj12 = new java.lang.Object();
        lista9.insere(obj12);
        java.lang.Object[] objArray14 = lista9.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista9.item = objArray17;
        int int19 = lista9.pos;
        lista9.pos = 0;
        int int22 = lista9.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        java.lang.Object[] objArray71 = lista69.item;
        lista66.item = objArray71;
        lista0.item = objArray71;
        int int74 = lista0.ultimo;
        lista0.imprime();
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        ds.Lista lista60 = new ds.Lista();
        lista60.primeiro = '4';
        java.lang.Object obj63 = new java.lang.Object();
        lista60.insere(obj63);
        java.lang.Object[] objArray65 = lista60.item;
        java.lang.Object[] objArray68 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista60.item = objArray68;
        boolean boolean70 = lista60.vazia();
        java.lang.Object[] objArray71 = lista60.item;
        lista0.item = objArray71;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10.0, -1.0]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        java.lang.Object[] objArray31 = null;
        lista18.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        lista33.imprime();
        lista33.imprime();
        java.lang.Object[] objArray38 = lista33.item;
        lista18.item = objArray38;
        java.lang.Object[] objArray40 = lista18.item;
        int int41 = lista18.ultimo;
        boolean boolean42 = lista18.vazia();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = 'a';
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray11 = lista6.item;
        int int12 = lista6.primeiro;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        java.lang.Object[] objArray25 = lista20.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista20.item = objArray28;
        lista14.item = objArray28;
        lista14.primeiro = 0;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        java.lang.Object[] objArray41 = lista39.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray44 = lista42.item;
        lista39.item = objArray44;
        boolean boolean46 = lista39.vazia();
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        lista47.pos = '4';
        lista47.primeiro = '4';
        lista47.imprime();
        java.lang.Object[] objArray55 = lista47.item;
        lista39.item = objArray55;
        lista33.item = objArray55;
        lista14.item = objArray55;
        lista6.item = objArray55;
        lista6.imprime();
        java.lang.Object[] objArray61 = lista6.item;
        java.lang.Class<?> wildcardClass62 = objArray61.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.pos = '4';
        lista0.primeiro = (byte) 10;
        int int11 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.ultimo;
        int int8 = lista0.primeiro;
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        boolean boolean60 = lista0.vazia();
        lista0.pos = (byte) 1;
        int int63 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        int int65 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        lista18.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.primeiro = '4';
        java.lang.Object obj27 = new java.lang.Object();
        lista24.insere(obj27);
        java.lang.Object[] objArray29 = lista24.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista24.item = objArray32;
        lista18.item = objArray32;
        java.lang.Object[] objArray35 = lista18.item;
        lista0.item = objArray35;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10.0, -1.0]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.pos = 1;
        lista0.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        lista12.pos = '4';
        lista12.ultimo = (short) -1;
        int int19 = lista12.primeiro;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        java.lang.Object[] objArray25 = lista20.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista20.item = objArray28;
        lista12.item = objArray28;
        lista12.pos = 52;
        lista12.pos = (-1);
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        java.lang.Object[] objArray40 = lista35.item;
        lista35.imprime();
        int int42 = lista35.primeiro;
        ds.Lista lista43 = new ds.Lista();
        lista43.primeiro = '4';
        java.lang.Object obj46 = new java.lang.Object();
        lista43.insere(obj46);
        lista43.imprime();
        java.lang.Object[] objArray49 = lista43.item;
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        lista50.imprime();
        ds.Lista lista56 = new ds.Lista();
        lista56.primeiro = '4';
        java.lang.Object obj59 = new java.lang.Object();
        lista56.insere(obj59);
        java.lang.Object[] objArray61 = lista56.item;
        java.lang.Object[] objArray64 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista56.item = objArray64;
        lista50.item = objArray64;
        lista43.insere((java.lang.Object) objArray64);
        int int68 = lista43.pos;
        java.lang.Object[] objArray69 = lista43.item;
        lista35.item = objArray69;
        lista12.item = objArray69;
        boolean boolean72 = lista12.vazia();
        java.lang.Object[] objArray73 = lista12.item;
        lista0.item = objArray73;
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        int int12 = lista9.primeiro;
        boolean boolean13 = lista9.vazia();
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.ultimo = (short) -1;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista15.item = objArray31;
        lista9.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista9);
        lista0.pos = (-1);
        lista0.primeiro = (byte) 0;
        ds.Lista lista40 = new ds.Lista();
        lista40.imprime();
        int int42 = lista40.primeiro;
        boolean boolean43 = lista40.vazia();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        lista44.pos = '4';
        lista44.primeiro = '4';
        lista44.imprime();
        java.lang.Class<?> wildcardClass52 = lista44.getClass();
        lista40.insere((java.lang.Object) lista44);
        lista0.insere((java.lang.Object) lista40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        lista7.ultimo = 10;
        lista7.imprime();
        java.lang.Object[] objArray16 = lista7.item;
        lista4.item = objArray16;
        lista0.item = objArray16;
        lista0.ultimo = (short) 0;
        int int21 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        java.lang.Object[] objArray12 = lista7.item;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista7.item = objArray15;
        boolean boolean17 = lista7.vazia();
        java.lang.Object[] objArray18 = lista7.item;
        lista0.item = objArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10.0, -1.0]");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        lista0.ultimo = ' ';
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 100;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.pos = 'a';
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.ultimo = 0;
        int int17 = lista10.pos;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray23 = lista21.item;
        lista18.item = objArray23;
        boolean boolean25 = lista18.vazia();
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        lista26.pos = '4';
        lista26.primeiro = '4';
        lista26.imprime();
        java.lang.Object[] objArray34 = lista26.item;
        lista18.item = objArray34;
        lista10.item = objArray34;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        java.lang.Object[] objArray42 = lista37.item;
        lista37.imprime();
        int int44 = lista37.primeiro;
        ds.Lista lista45 = new ds.Lista();
        lista45.primeiro = '4';
        java.lang.Object obj48 = new java.lang.Object();
        lista45.insere(obj48);
        lista45.imprime();
        java.lang.Object[] objArray51 = lista45.item;
        ds.Lista lista52 = new ds.Lista();
        lista52.primeiro = '4';
        java.lang.Object obj55 = new java.lang.Object();
        lista52.insere(obj55);
        lista52.imprime();
        ds.Lista lista58 = new ds.Lista();
        lista58.primeiro = '4';
        java.lang.Object obj61 = new java.lang.Object();
        lista58.insere(obj61);
        java.lang.Object[] objArray63 = lista58.item;
        java.lang.Object[] objArray66 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista58.item = objArray66;
        lista52.item = objArray66;
        lista45.insere((java.lang.Object) objArray66);
        int int70 = lista45.pos;
        java.lang.Object[] objArray71 = lista45.item;
        lista37.item = objArray71;
        lista10.item = objArray71;
        lista10.imprime();
        lista10.imprime();
        ds.Lista lista76 = new ds.Lista();
        lista76.imprime();
        java.lang.Object[] objArray78 = lista76.item;
        ds.Lista lista79 = new ds.Lista();
        lista79.imprime();
        java.lang.Object[] objArray81 = lista79.item;
        lista76.item = objArray81;
        lista10.item = objArray81;
        java.lang.Object[] objArray84 = lista10.item;
        lista0.item = objArray84;
        java.lang.Class<?> wildcardClass86 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = (byte) 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        lista16.imprime();
        java.lang.Object[] objArray22 = lista16.item;
        lista16.ultimo = (short) 0;
        int int25 = lista16.pos;
        int int26 = lista16.ultimo;
        lista16.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista16);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.primeiro = (short) 0;
        lista0.imprime();
        int int21 = lista0.primeiro;
        int int22 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.primeiro;
        ds.Lista lista61 = new ds.Lista();
        lista61.primeiro = '4';
        java.lang.Object obj64 = new java.lang.Object();
        lista61.insere(obj64);
        lista61.imprime();
        java.lang.Object[] objArray67 = lista61.item;
        ds.Lista lista68 = new ds.Lista();
        lista68.primeiro = '4';
        java.lang.Object obj71 = new java.lang.Object();
        lista68.insere(obj71);
        lista68.imprime();
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        java.lang.Object obj77 = new java.lang.Object();
        lista74.insere(obj77);
        java.lang.Object[] objArray79 = lista74.item;
        java.lang.Object[] objArray82 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista74.item = objArray82;
        lista68.item = objArray82;
        lista61.insere((java.lang.Object) objArray82);
        lista0.item = objArray82;
        lista0.ultimo = (short) 10;
        java.lang.Object[] objArray89 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[10.0, -1.0]");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        int int5 = lista0.pos;
        java.lang.Object[] objArray6 = null;
        lista0.item = objArray6;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        java.lang.Object[] objArray7 = lista2.item;
        lista0.item = objArray7;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.primeiro;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista66 = new ds.Lista();
        lista66.imprime();
        java.lang.Object[] objArray68 = lista66.item;
        ds.Lista lista69 = new ds.Lista();
        lista69.imprime();
        java.lang.Object[] objArray71 = lista69.item;
        lista66.item = objArray71;
        lista0.item = objArray71;
        java.lang.Object[] objArray74 = lista0.item;
        int int75 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = 1;
        int int32 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.primeiro = ' ';
        lista0.ultimo = 'a';
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        boolean boolean35 = lista0.vazia();
        int int36 = lista0.primeiro;
        lista0.ultimo = (short) -1;
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        lista39.pos = '4';
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        lista44.pos = '4';
        lista44.ultimo = (short) -1;
        lista39.insere((java.lang.Object) lista44);
        lista39.primeiro = (byte) 10;
        java.lang.Object[] objArray54 = lista39.item;
        lista0.item = objArray54;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray54);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = (short) -1;
        int int32 = lista0.pos;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        java.lang.Object[] objArray44 = lista39.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista39.item = objArray47;
        lista33.item = objArray47;
        lista0.item = objArray47;
        int int51 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        java.lang.Object obj8 = new java.lang.Object();
        lista5.insere(obj8);
        lista5.ultimo = 0;
        int int12 = lista5.pos;
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        java.lang.Object[] objArray15 = lista13.item;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista13.item = objArray18;
        boolean boolean20 = lista13.vazia();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        lista21.pos = '4';
        lista21.primeiro = '4';
        lista21.imprime();
        java.lang.Object[] objArray29 = lista21.item;
        lista13.item = objArray29;
        lista5.item = objArray29;
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.imprime();
        int int39 = lista32.primeiro;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        int int65 = lista40.pos;
        java.lang.Object[] objArray66 = lista40.item;
        lista32.item = objArray66;
        lista5.item = objArray66;
        lista0.item = objArray66;
        java.lang.Object[] objArray70 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        java.lang.Object[] objArray34 = lista28.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        java.lang.Object[] objArray46 = lista41.item;
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista41.item = objArray49;
        lista35.item = objArray49;
        lista28.insere((java.lang.Object) objArray49);
        lista0.item = objArray49;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10.0, -1.0]");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        ds.Lista lista5 = new ds.Lista();
        lista5.primeiro = '4';
        int int8 = lista5.primeiro;
        lista5.insere((java.lang.Object) (byte) 100);
        lista5.ultimo = (short) 0;
        lista5.pos = (short) 10;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
        java.lang.Object[] objArray21 = lista15.item;
        lista5.item = objArray21;
        lista0.item = objArray21;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        int int68 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.pos = 100;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista8.item = objArray20;
        lista0.item = objArray20;
        lista0.imprime();
        lista0.pos = 52;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        lista0.pos = '4';
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        lista0.imprime();
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        lista0.pos = 1;
        lista0.ultimo = 'a';
        lista0.pos = (byte) 1;
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista0.insere((java.lang.Object) lista11);
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista13.pos = (short) 0;
        lista13.pos = (short) 1;
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray28 = lista27.item;
        lista13.item = objArray28;
        int int30 = lista13.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        java.lang.Object[] objArray36 = lista31.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista31.item = objArray39;
        lista31.pos = (short) 0;
        lista31.pos = (short) 1;
        ds.Lista lista45 = new ds.Lista();
        java.lang.Object[] objArray46 = lista45.item;
        lista31.item = objArray46;
        java.lang.Object[] objArray48 = lista31.item;
        lista13.item = objArray48;
        lista0.item = objArray48;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = (short) -1;
        int int32 = lista0.pos;
        int int33 = lista0.primeiro;
        int int34 = lista0.ultimo;
        int int35 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        int int18 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        lista7.pos = '4';
        int int12 = lista7.primeiro;
        int int13 = lista7.primeiro;
        lista0.insere((java.lang.Object) lista7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        lista0.primeiro = ' ';
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.ultimo = 0;
        int int13 = lista6.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista14.item = objArray19;
        boolean boolean21 = lista14.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        lista22.pos = '4';
        lista22.primeiro = '4';
        lista22.imprime();
        java.lang.Object[] objArray30 = lista22.item;
        lista14.item = objArray30;
        lista6.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        lista33.imprime();
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        lista41.imprime();
        java.lang.Object[] objArray47 = lista41.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        lista48.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista54.item = objArray62;
        lista48.item = objArray62;
        lista41.insere((java.lang.Object) objArray62);
        int int66 = lista41.pos;
        java.lang.Object[] objArray67 = lista41.item;
        lista33.item = objArray67;
        lista6.item = objArray67;
        lista6.imprime();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int73 = lista6.pos;
        lista6.imprime();
        int int75 = lista6.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray11 = lista6.item;
        int int12 = lista6.primeiro;
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 0;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        lista17.pos = '4';
        lista17.primeiro = '4';
        lista17.imprime();
        java.lang.Object[] objArray25 = lista17.item;
        lista17.imprime();
        lista17.primeiro = 'a';
        int int29 = lista17.ultimo;
        lista17.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.pos = 10;
        org.junit.Assert.assertNotNull(objArray1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.ultimo = 32;
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 100;
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 0;
        int int16 = lista0.pos;
        lista0.primeiro = 2;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 35;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = 0;
        lista0.ultimo = 100;
        int int15 = lista0.pos;
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        lista16.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista22.item = objArray30;
        lista16.item = objArray30;
        lista16.primeiro = 0;
        boolean boolean35 = lista16.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        boolean boolean7 = lista4.vazia();
        lista0.insere((java.lang.Object) boolean7);
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.ultimo = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista10.item = objArray18;
        lista10.pos = (short) 0;
        lista10.pos = (short) 1;
        ds.Lista lista24 = new ds.Lista();
        java.lang.Object[] objArray25 = lista24.item;
        lista10.item = objArray25;
        java.lang.Object[] objArray27 = lista10.item;
        lista0.item = objArray27;
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        java.lang.Object[] objArray31 = lista29.item;
        lista29.primeiro = (short) 0;
        int int34 = lista29.pos;
        int int35 = lista29.ultimo;
        int int36 = lista29.pos;
        lista29.imprime();
        lista0.insere((java.lang.Object) lista29);
        lista0.primeiro = (-1);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        int int4 = lista0.primeiro;
        lista0.primeiro = '4';
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        java.lang.Object[] objArray13 = lista7.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        java.lang.Object[] objArray25 = lista20.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista20.item = objArray28;
        lista14.item = objArray28;
        lista7.insere((java.lang.Object) objArray28);
        lista0.insere((java.lang.Object) objArray28);
        boolean boolean33 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = (short) -1;
        lista0.primeiro = (byte) -1;
        ds.Lista lista10 = new ds.Lista();
        java.lang.Object[] objArray11 = lista10.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista10.insere(obj15);
        lista10.pos = (byte) 100;
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        lista21.pos = '4';
        lista21.primeiro = '4';
        lista21.imprime();
        lista21.pos = 1;
        lista0.insere((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Object[] objArray12 = new java.lang.Object[] { obj10, '#' };
        lista0.item = objArray12;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 35;
        int int15 = lista0.ultimo;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.primeiro = (short) 100;
        lista0.imprime();
        lista0.ultimo = 0;
        lista0.pos = (byte) 1;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        lista0.pos = 52;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.pos = 0;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        int int17 = lista14.pos;
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista20.primeiro = (short) 0;
        java.lang.Object[] objArray25 = lista20.item;
        int int26 = lista20.primeiro;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        lista28.item = objArray42;
        lista28.primeiro = 0;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.imprime();
        java.lang.Object[] objArray55 = lista53.item;
        ds.Lista lista56 = new ds.Lista();
        lista56.imprime();
        java.lang.Object[] objArray58 = lista56.item;
        lista53.item = objArray58;
        boolean boolean60 = lista53.vazia();
        ds.Lista lista61 = new ds.Lista();
        lista61.primeiro = '4';
        lista61.pos = '4';
        lista61.primeiro = '4';
        lista61.imprime();
        java.lang.Object[] objArray69 = lista61.item;
        lista53.item = objArray69;
        lista47.item = objArray69;
        lista28.item = objArray69;
        lista20.item = objArray69;
        lista0.insere((java.lang.Object) objArray69);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(objArray69);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 35;
        int int15 = lista0.primeiro;
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.ultimo = (short) -1;
        lista16.pos = '4';
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = '4';
        java.lang.Object obj28 = new java.lang.Object();
        lista25.insere(obj28);
        lista25.imprime();
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        java.lang.Object[] objArray36 = lista31.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista31.item = objArray39;
        lista25.item = objArray39;
        lista25.imprime();
        ds.Lista lista43 = new ds.Lista();
        lista43.primeiro = '4';
        java.lang.Object obj46 = new java.lang.Object();
        lista43.insere(obj46);
        java.lang.Object[] objArray48 = lista43.item;
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista43.item = objArray51;
        int int53 = lista43.pos;
        lista25.insere((java.lang.Object) lista43);
        lista25.pos = (short) -1;
        int int57 = lista25.pos;
        ds.Lista lista58 = new ds.Lista();
        lista58.primeiro = '4';
        java.lang.Object obj61 = new java.lang.Object();
        lista58.insere(obj61);
        lista58.imprime();
        ds.Lista lista64 = new ds.Lista();
        lista64.primeiro = '4';
        java.lang.Object obj67 = new java.lang.Object();
        lista64.insere(obj67);
        java.lang.Object[] objArray69 = lista64.item;
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista64.item = objArray72;
        lista58.item = objArray72;
        lista25.item = objArray72;
        lista16.item = objArray72;
        lista0.insere((java.lang.Object) objArray72);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10.0, -1.0]");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista18.primeiro = (short) 0;
        java.lang.Object[] objArray23 = lista18.item;
        lista0.item = objArray23;
        int int25 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        int int8 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        lista27.imprime();
        int int34 = lista27.primeiro;
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        int int60 = lista35.pos;
        java.lang.Object[] objArray61 = lista35.item;
        lista27.item = objArray61;
        lista0.item = objArray61;
        lista0.imprime();
        ds.Lista lista65 = new ds.Lista();
        lista65.primeiro = '4';
        java.lang.Object obj68 = new java.lang.Object();
        lista65.insere(obj68);
        lista65.imprime();
        java.lang.Object[] objArray71 = lista65.item;
        java.lang.Object[] objArray72 = lista65.item;
        lista0.item = objArray72;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(objArray72);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        int int6 = lista0.pos;
        boolean boolean7 = lista0.vazia();
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.pos;
        lista0.pos = ' ';
        boolean boolean31 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        lista0.primeiro = '#';
        boolean boolean30 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        int int26 = lista0.ultimo;
        lista0.ultimo = 1;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        lista0.imprime();
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.primeiro;
        int int11 = lista0.ultimo;
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10.0f };
        lista0.item = objArray9;
        java.lang.Object[] objArray11 = lista0.item;
        int int12 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        lista0.pos = 52;
        java.lang.Object[] objArray11 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.primeiro = (byte) -1;
        int int16 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        java.lang.Object[] objArray16 = lista11.item;
        lista11.insere((java.lang.Object) '#');
        int int19 = lista11.ultimo;
        lista0.insere((java.lang.Object) lista11);
        int int21 = lista11.primeiro;
        lista11.pos = '4';
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        lista6.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista24.primeiro = (short) 0;
        java.lang.Object[] objArray29 = lista24.item;
        lista6.item = objArray29;
        lista0.item = objArray29;
        lista0.primeiro = (-1);
        java.lang.Object[] objArray34 = lista0.item;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray34);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        lista0.ultimo = 2;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.ultimo = (-1);
        lista8.ultimo = 52;
        java.lang.Object[] objArray20 = lista8.item;
        lista0.item = objArray20;
        lista0.pos = (byte) 0;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        java.lang.Object[] objArray13 = lista7.item;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        java.lang.Object obj23 = new java.lang.Object();
        lista20.insere(obj23);
        java.lang.Object[] objArray25 = lista20.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista20.item = objArray28;
        lista14.item = objArray28;
        lista7.insere((java.lang.Object) objArray28);
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista7.item = objArray37;
        lista0.insere((java.lang.Object) lista7);
        lista7.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        lista0.pos = '4';
        lista0.ultimo = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.primeiro;
        lista13.imprime();
        lista13.imprime();
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        int int23 = lista20.primeiro;
        boolean boolean24 = lista20.vazia();
        int int25 = lista20.pos;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        lista26.pos = '4';
        lista26.ultimo = (short) -1;
        int int33 = lista26.primeiro;
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        lista26.item = objArray42;
        lista20.insere((java.lang.Object) lista26);
        boolean boolean46 = lista20.vazia();
        java.lang.Object[] objArray47 = lista20.item;
        lista0.item = objArray47;
        int int49 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = 'a';
        lista0.pos = '4';
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        java.lang.Object obj12 = new java.lang.Object();
        lista9.insere(obj12);
        java.lang.Object[] objArray14 = lista9.item;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista9.item = objArray17;
        lista9.pos = (short) 0;
        lista9.pos = (short) 1;
        ds.Lista lista23 = new ds.Lista();
        java.lang.Object[] objArray24 = lista23.item;
        lista9.item = objArray24;
        java.lang.Object[] objArray26 = lista9.item;
        lista0.item = objArray26;
        java.lang.Class<?> wildcardClass28 = objArray26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.primeiro = (short) 0;
        lista0.imprime();
        int int21 = lista0.primeiro;
        boolean boolean22 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        lista15.imprime();
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        lista23.imprime();
        java.lang.Object[] objArray29 = lista23.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista23.insere((java.lang.Object) objArray44);
        int int48 = lista23.pos;
        java.lang.Object[] objArray49 = lista23.item;
        lista15.item = objArray49;
        lista0.item = objArray49;
        lista0.pos = (byte) 0;
        int int54 = lista0.pos;
        int int55 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 100 + "'", int55 == 100);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        int int8 = lista0.pos;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        lista9.pos = '4';
        lista9.ultimo = (short) -1;
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista9.item = objArray25;
        lista9.pos = 52;
        lista9.pos = (-1);
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.imprime();
        int int39 = lista32.primeiro;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        int int65 = lista40.pos;
        java.lang.Object[] objArray66 = lista40.item;
        lista32.item = objArray66;
        lista9.item = objArray66;
        boolean boolean69 = lista9.vazia();
        java.lang.Object[] objArray70 = lista9.item;
        lista0.insere((java.lang.Object) objArray70);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        int int35 = lista0.ultimo;
        lista0.pos = 32;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray30 = lista18.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        java.lang.Object[] objArray36 = lista31.item;
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista31.item = objArray39;
        int int41 = lista31.pos;
        java.lang.Object[] objArray42 = null;
        lista31.item = objArray42;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        lista44.pos = '4';
        lista44.primeiro = '4';
        lista44.imprime();
        java.lang.Object[] objArray52 = lista44.item;
        lista31.item = objArray52;
        lista18.insere((java.lang.Object) lista31);
        boolean boolean55 = lista31.vazia();
        int int56 = lista31.primeiro;
        lista31.primeiro = (byte) -1;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 52 + "'", int56 == 52);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = 1;
        boolean boolean32 = lista0.vazia();
        int int33 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        java.lang.Object[] objArray21 = lista16.item;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista16.item = objArray24;
        lista10.item = objArray24;
        java.lang.Object[] objArray27 = lista10.item;
        lista0.insere((java.lang.Object) objArray27);
        java.lang.Class<?> wildcardClass29 = objArray27.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista0.item = objArray25;
        int int28 = lista0.ultimo;
        int int29 = lista0.primeiro;
        lista0.ultimo = '#';
        java.lang.Object[] objArray32 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0, -1.0]");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.primeiro = (byte) -1;
        boolean boolean16 = lista0.vazia();
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        lista0.primeiro = (byte) 10;
        int int30 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        int int8 = lista0.pos;
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        int int5 = lista0.primeiro;
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        java.lang.Object obj5 = null;
        lista0.insere(obj5);
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        lista0.ultimo = 0;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        lista9.imprime();
        java.lang.Object[] objArray13 = null;
        lista9.item = objArray13;
        lista9.pos = (byte) 1;
        java.lang.Object[] objArray17 = lista9.item;
        lista0.insere((java.lang.Object) lista9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(objArray17);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        int int31 = lista18.pos;
        boolean boolean32 = lista18.vazia();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        int int9 = lista0.pos;
        lista0.primeiro = 'a';
        lista0.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.primeiro;
        lista13.imprime();
        lista13.imprime();
        java.lang.Object[] objArray18 = lista13.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        lista20.primeiro = '4';
        int int23 = lista20.primeiro;
        boolean boolean24 = lista20.vazia();
        int int25 = lista20.pos;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        lista26.pos = '4';
        lista26.ultimo = (short) -1;
        int int33 = lista26.primeiro;
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        lista26.item = objArray42;
        lista20.insere((java.lang.Object) lista26);
        boolean boolean46 = lista20.vazia();
        java.lang.Object[] objArray47 = lista20.item;
        lista0.item = objArray47;
        java.lang.Class<?> wildcardClass49 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista18.primeiro = (short) 0;
        java.lang.Object[] objArray23 = lista18.item;
        lista0.item = objArray23;
        java.lang.Class<?> wildcardClass25 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        lista0.pos = '4';
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        java.lang.Object obj12 = new java.lang.Object();
        lista9.insere(obj12);
        lista9.imprime();
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista15.item = objArray23;
        lista9.item = objArray23;
        lista9.imprime();
        ds.Lista lista27 = new ds.Lista();
        lista27.primeiro = '4';
        java.lang.Object obj30 = new java.lang.Object();
        lista27.insere(obj30);
        java.lang.Object[] objArray32 = lista27.item;
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista27.item = objArray35;
        int int37 = lista27.pos;
        lista9.insere((java.lang.Object) lista27);
        lista9.pos = (short) -1;
        int int41 = lista9.pos;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista9.item = objArray56;
        lista0.item = objArray56;
        lista0.pos = 10;
        lista0.pos = (short) -1;
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        int int19 = lista10.ultimo;
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        boolean boolean17 = lista0.vazia();
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        lista0.pos = 52;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        boolean boolean35 = lista0.vazia();
        int int36 = lista0.pos;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        lista44.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista50.item = objArray58;
        lista44.item = objArray58;
        lista37.insere((java.lang.Object) objArray58);
        boolean boolean62 = lista37.vazia();
        lista37.primeiro = '#';
        lista0.insere((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, #]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, #]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        lista0.ultimo = (short) 0;
        lista0.pos = 52;
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        boolean boolean6 = lista0.vazia();
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        lista11.imprime();
        java.lang.Object[] objArray17 = lista11.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        lista18.imprime();
        ds.Lista lista24 = new ds.Lista();
        lista24.primeiro = '4';
        java.lang.Object obj27 = new java.lang.Object();
        lista24.insere(obj27);
        java.lang.Object[] objArray29 = lista24.item;
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista24.item = objArray32;
        lista18.item = objArray32;
        lista11.insere((java.lang.Object) objArray32);
        int int36 = lista11.pos;
        lista11.imprime();
        lista11.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        java.lang.Object[] objArray44 = lista39.item;
        lista11.item = objArray44;
        lista0.item = objArray44;
        int int47 = lista0.primeiro;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista29.insere(obj34);
        lista29.pos = 35;
        lista0.insere((java.lang.Object) lista29);
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.imprime();
        int int3 = lista1.primeiro;
        lista1.imprime();
        lista0.insere((java.lang.Object) lista1);
        int int6 = lista1.primeiro;
        lista1.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        boolean boolean35 = lista0.vazia();
        int int36 = lista0.pos;
        lista0.imprime();
        java.lang.Object[] objArray38 = lista0.item;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10.0, -1.0]");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        int int8 = lista0.ultimo;
        lista0.ultimo = 1;
        lista0.pos = (short) -1;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        boolean boolean7 = lista0.vazia();
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        lista8.imprime();
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.primeiro = (short) 0;
        lista0.pos = (-1);
        lista0.primeiro = 1;
        int int24 = lista0.primeiro;
        java.lang.Object[] objArray25 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = 1;
        java.lang.Object[] objArray32 = lista0.item;
        lista0.ultimo = 0;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        lista0.pos = 10;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray14 = lista0.item;
        lista0.ultimo = 32;
        int int17 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        boolean boolean26 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) lista6);
        boolean boolean26 = lista0.vazia();
        int int27 = lista0.primeiro;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        int int30 = lista28.primeiro;
        int int31 = lista28.pos;
        int int32 = lista28.primeiro;
        lista28.primeiro = '4';
        ds.Lista lista35 = new ds.Lista();
        lista35.primeiro = '4';
        java.lang.Object obj38 = new java.lang.Object();
        lista35.insere(obj38);
        lista35.imprime();
        java.lang.Object[] objArray41 = lista35.item;
        ds.Lista lista42 = new ds.Lista();
        lista42.primeiro = '4';
        java.lang.Object obj45 = new java.lang.Object();
        lista42.insere(obj45);
        lista42.imprime();
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        java.lang.Object[] objArray53 = lista48.item;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista48.item = objArray56;
        lista42.item = objArray56;
        lista35.insere((java.lang.Object) objArray56);
        lista28.insere((java.lang.Object) objArray56);
        lista0.insere((java.lang.Object) objArray56);
        int int62 = lista0.pos;
        boolean boolean63 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        int int6 = lista0.primeiro;
        lista0.pos = '4';
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        lista9.pos = '4';
        lista9.ultimo = (short) -1;
        int int16 = lista9.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista9.item = objArray25;
        lista9.pos = 52;
        lista9.pos = (-1);
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        lista32.imprime();
        int int39 = lista32.primeiro;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        int int65 = lista40.pos;
        java.lang.Object[] objArray66 = lista40.item;
        lista32.item = objArray66;
        lista9.item = objArray66;
        lista0.item = objArray66;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(objArray66);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray11 = lista6.item;
        int int12 = lista6.primeiro;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        lista14.imprime();
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray25 = lista23.item;
        lista20.item = objArray25;
        boolean boolean27 = lista20.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        lista28.pos = '4';
        lista28.primeiro = '4';
        lista28.imprime();
        java.lang.Object[] objArray36 = lista28.item;
        lista20.item = objArray36;
        lista14.item = objArray36;
        lista0.item = objArray36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.pos = 10;
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        lista15.imprime();
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        lista23.imprime();
        java.lang.Object[] objArray29 = lista23.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista23.insere((java.lang.Object) objArray44);
        int int48 = lista23.pos;
        java.lang.Object[] objArray49 = lista23.item;
        lista15.item = objArray49;
        lista0.item = objArray49;
        lista0.pos = (byte) 0;
        int int54 = lista0.pos;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        ds.Lista lista63 = new ds.Lista();
        lista63.primeiro = '4';
        java.lang.Object obj66 = new java.lang.Object();
        lista63.insere(obj66);
        java.lang.Object[] objArray68 = lista63.item;
        java.lang.Object[] objArray71 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista63.item = objArray71;
        lista63.primeiro = (byte) 100;
        lista63.imprime();
        boolean boolean76 = lista63.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 35;
        java.lang.Object[] objArray21 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray30 = lista18.item;
        java.lang.Class<?> wildcardClass31 = lista18.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        int int23 = lista0.ultimo;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        lista0.imprime();
        int int36 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray4 = null;
        lista0.item = objArray4;
        int int6 = lista0.primeiro;
        lista0.ultimo = (short) 1;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.primeiro;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista32.item = objArray40;
        boolean boolean42 = lista32.vazia();
        java.lang.Object[] objArray43 = lista32.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista32);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Erro: A lista esta cheia");
        } catch (java.lang.Exception e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10.0, -1.0]");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista18.primeiro;
        java.lang.Object[] objArray31 = null;
        lista18.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        lista33.imprime();
        lista33.imprime();
        java.lang.Object[] objArray38 = lista33.item;
        lista18.item = objArray38;
        java.lang.Object[] objArray40 = lista18.item;
        int int41 = lista18.ultimo;
        lista18.pos = (byte) 10;
        boolean boolean44 = lista18.vazia();
        int int45 = lista18.ultimo;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        lista1.imprime();
        int int3 = lista1.primeiro;
        lista1.imprime();
        lista0.insere((java.lang.Object) lista1);
        int int6 = lista1.pos;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        lista15.imprime();
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        lista23.imprime();
        java.lang.Object[] objArray29 = lista23.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista23.insere((java.lang.Object) objArray44);
        int int48 = lista23.pos;
        java.lang.Object[] objArray49 = lista23.item;
        lista15.item = objArray49;
        lista0.item = objArray49;
        int int52 = lista0.primeiro;
        int int53 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.primeiro;
        ds.Lista lista61 = new ds.Lista();
        lista61.primeiro = '4';
        java.lang.Object obj64 = new java.lang.Object();
        lista61.insere(obj64);
        lista61.imprime();
        java.lang.Object[] objArray67 = lista61.item;
        ds.Lista lista68 = new ds.Lista();
        lista68.primeiro = '4';
        java.lang.Object obj71 = new java.lang.Object();
        lista68.insere(obj71);
        lista68.imprime();
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        java.lang.Object obj77 = new java.lang.Object();
        lista74.insere(obj77);
        java.lang.Object[] objArray79 = lista74.item;
        java.lang.Object[] objArray82 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista74.item = objArray82;
        lista68.item = objArray82;
        lista61.insere((java.lang.Object) objArray82);
        lista0.item = objArray82;
        lista0.ultimo = (short) 10;
        int int89 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 52 + "'", int60 == 52);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 0;
        int int16 = lista0.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        lista17.pos = '4';
        lista17.primeiro = '4';
        lista17.imprime();
        java.lang.Object[] objArray25 = lista17.item;
        lista17.imprime();
        lista17.primeiro = 'a';
        int int29 = lista17.ultimo;
        lista17.primeiro = (byte) -1;
        lista0.insere((java.lang.Object) (byte) -1);
        lista0.ultimo = (byte) 100;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        lista0.imprime();
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        lista0.pos = 1;
        java.lang.Object[] objArray32 = lista0.item;
        int int33 = lista0.ultimo;
        java.lang.Object[] objArray34 = lista0.item;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        int int37 = lista35.pos;
        lista35.pos = (byte) 10;
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        java.lang.Object obj43 = new java.lang.Object();
        lista40.insere(obj43);
        lista40.imprime();
        java.lang.Object[] objArray46 = lista40.item;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        ds.Lista lista53 = new ds.Lista();
        lista53.primeiro = '4';
        java.lang.Object obj56 = new java.lang.Object();
        lista53.insere(obj56);
        java.lang.Object[] objArray58 = lista53.item;
        java.lang.Object[] objArray61 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista53.item = objArray61;
        lista47.item = objArray61;
        lista40.insere((java.lang.Object) objArray61);
        boolean boolean65 = lista40.vazia();
        lista40.primeiro = '#';
        java.lang.Object[] objArray68 = lista40.item;
        lista35.insere((java.lang.Object) objArray68);
        lista0.item = objArray68;
        ds.Lista lista71 = new ds.Lista();
        lista71.imprime();
        int int73 = lista71.primeiro;
        lista71.imprime();
        lista71.imprime();
        lista71.ultimo = 0;
        lista71.imprime();
        ds.Lista lista79 = new ds.Lista();
        lista79.primeiro = '4';
        java.lang.Object obj82 = new java.lang.Object();
        lista79.insere(obj82);
        lista71.insere(obj82);
        int int85 = lista71.primeiro;
        lista0.insere((java.lang.Object) lista71);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.pos = (byte) 1;
        lista0.pos = (byte) 1;
        lista0.primeiro = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        java.lang.Object[] objArray20 = lista15.item;
        lista15.imprime();
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        lista23.imprime();
        java.lang.Object[] objArray29 = lista23.item;
        ds.Lista lista30 = new ds.Lista();
        lista30.primeiro = '4';
        java.lang.Object obj33 = new java.lang.Object();
        lista30.insere(obj33);
        lista30.imprime();
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista30.item = objArray44;
        lista23.insere((java.lang.Object) objArray44);
        int int48 = lista23.pos;
        java.lang.Object[] objArray49 = lista23.item;
        lista15.item = objArray49;
        lista0.item = objArray49;
        lista0.pos = (byte) 0;
        lista0.insere((java.lang.Object) (byte) 0);
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        int int9 = lista6.primeiro;
        lista6.insere((java.lang.Object) (byte) 100);
        lista6.ultimo = (short) 0;
        lista6.pos = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        lista16.imprime();
        java.lang.Object[] objArray22 = lista16.item;
        lista6.item = objArray22;
        lista0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.ultimo = 0;
        int int13 = lista6.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista14.item = objArray19;
        boolean boolean21 = lista14.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        lista22.pos = '4';
        lista22.primeiro = '4';
        lista22.imprime();
        java.lang.Object[] objArray30 = lista22.item;
        lista14.item = objArray30;
        lista6.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        lista33.imprime();
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        lista41.imprime();
        java.lang.Object[] objArray47 = lista41.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        lista48.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista54.item = objArray62;
        lista48.item = objArray62;
        lista41.insere((java.lang.Object) objArray62);
        int int66 = lista41.pos;
        java.lang.Object[] objArray67 = lista41.item;
        lista33.item = objArray67;
        lista6.item = objArray67;
        lista6.imprime();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int73 = lista6.pos;
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        lista74.pos = '4';
        lista74.primeiro = '4';
        lista74.imprime();
        java.lang.Object[] objArray82 = lista74.item;
        lista6.insere((java.lang.Object) objArray82);
        int int84 = lista6.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista6.primeiro = (short) 0;
        java.lang.Object[] objArray11 = lista6.item;
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.ultimo = 0;
        int int19 = lista12.pos;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        ds.Lista lista23 = new ds.Lista();
        lista23.imprime();
        java.lang.Object[] objArray25 = lista23.item;
        lista20.item = objArray25;
        boolean boolean27 = lista20.vazia();
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        lista28.pos = '4';
        lista28.primeiro = '4';
        lista28.imprime();
        java.lang.Object[] objArray36 = lista28.item;
        lista20.item = objArray36;
        lista12.item = objArray36;
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        java.lang.Object[] objArray44 = lista39.item;
        lista39.imprime();
        int int46 = lista39.primeiro;
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        lista47.imprime();
        java.lang.Object[] objArray53 = lista47.item;
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        lista54.imprime();
        ds.Lista lista60 = new ds.Lista();
        lista60.primeiro = '4';
        java.lang.Object obj63 = new java.lang.Object();
        lista60.insere(obj63);
        java.lang.Object[] objArray65 = lista60.item;
        java.lang.Object[] objArray68 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista60.item = objArray68;
        lista54.item = objArray68;
        lista47.insere((java.lang.Object) objArray68);
        int int72 = lista47.pos;
        java.lang.Object[] objArray73 = lista47.item;
        lista39.item = objArray73;
        lista12.item = objArray73;
        lista12.imprime();
        lista12.imprime();
        lista6.insere((java.lang.Object) lista12);
        int int79 = lista12.pos;
        ds.Lista lista80 = new ds.Lista();
        lista80.primeiro = '4';
        lista80.pos = '4';
        lista80.primeiro = '4';
        lista80.imprime();
        java.lang.Object[] objArray88 = lista80.item;
        lista12.insere((java.lang.Object) objArray88);
        lista0.item = objArray88;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 52 + "'", int46 == 52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(objArray88);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        lista12.imprime();
        lista12.ultimo = 10;
        lista12.imprime();
        java.lang.Object[] objArray21 = lista12.item;
        lista9.item = objArray21;
        lista0.item = objArray21;
        lista0.ultimo = 32;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 'a';
        lista0.pos = (short) 100;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        lista0.imprime();
        int int10 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 0;
        lista0.ultimo = (short) 100;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        lista0.imprime();
        lista0.imprime();
        int int10 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        int int30 = lista0.ultimo;
        int int31 = lista0.ultimo;
        lista0.ultimo = 10;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        int int21 = lista18.primeiro;
        lista18.insere((java.lang.Object) (byte) 100);
        lista18.ultimo = (short) 0;
        lista18.imprime();
        boolean boolean27 = lista18.vazia();
        int int28 = lista18.primeiro;
        int int29 = lista18.ultimo;
        java.lang.Object[] objArray30 = lista18.item;
        lista0.item = objArray30;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        lista0.pos = 0;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.ultimo = 0;
        int int13 = lista6.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista14.item = objArray19;
        boolean boolean21 = lista14.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        lista22.pos = '4';
        lista22.primeiro = '4';
        lista22.imprime();
        java.lang.Object[] objArray30 = lista22.item;
        lista14.item = objArray30;
        lista6.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        lista33.imprime();
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        lista41.imprime();
        java.lang.Object[] objArray47 = lista41.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        lista48.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista54.item = objArray62;
        lista48.item = objArray62;
        lista41.insere((java.lang.Object) objArray62);
        int int66 = lista41.pos;
        java.lang.Object[] objArray67 = lista41.item;
        lista33.item = objArray67;
        lista6.item = objArray67;
        lista6.imprime();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int73 = lista6.pos;
        int int74 = lista6.ultimo;
        java.lang.Object[] objArray75 = lista6.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(objArray75);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.ultimo = 10;
        int int8 = lista0.ultimo;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        int int12 = lista9.primeiro;
        boolean boolean13 = lista9.vazia();
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.ultimo = (short) -1;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista15.item = objArray31;
        lista9.insere((java.lang.Object) lista15);
        boolean boolean35 = lista9.vazia();
        ds.Lista lista36 = new ds.Lista();
        java.lang.Object[] objArray37 = lista36.item;
        lista9.item = objArray37;
        lista0.item = objArray37;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        lista0.primeiro = 2;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        lista8.pos = '4';
        lista8.primeiro = '4';
        boolean boolean15 = lista8.vazia();
        lista8.ultimo = (-1);
        int int18 = lista8.pos;
        ds.Lista lista19 = new ds.Lista();
        lista19.primeiro = '4';
        java.lang.Object obj22 = new java.lang.Object();
        lista19.insere(obj22);
        lista19.imprime();
        java.lang.Object[] objArray25 = lista19.item;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        lista26.imprime();
        ds.Lista lista32 = new ds.Lista();
        lista32.primeiro = '4';
        java.lang.Object obj35 = new java.lang.Object();
        lista32.insere(obj35);
        java.lang.Object[] objArray37 = lista32.item;
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista32.item = objArray40;
        lista26.item = objArray40;
        lista19.insere((java.lang.Object) objArray40);
        int int44 = lista19.pos;
        lista19.imprime();
        lista19.imprime();
        ds.Lista lista47 = new ds.Lista();
        lista47.primeiro = '4';
        java.lang.Object obj50 = new java.lang.Object();
        lista47.insere(obj50);
        java.lang.Object[] objArray52 = lista47.item;
        lista19.item = objArray52;
        lista8.item = objArray52;
        lista0.item = objArray52;
        java.lang.Class<?> wildcardClass56 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        int int21 = lista19.primeiro;
        int int22 = lista19.pos;
        int int23 = lista19.primeiro;
        lista19.primeiro = '4';
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        java.lang.Object obj29 = new java.lang.Object();
        lista26.insere(obj29);
        lista26.imprime();
        java.lang.Object[] objArray32 = lista26.item;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        lista33.imprime();
        ds.Lista lista39 = new ds.Lista();
        lista39.primeiro = '4';
        java.lang.Object obj42 = new java.lang.Object();
        lista39.insere(obj42);
        java.lang.Object[] objArray44 = lista39.item;
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista39.item = objArray47;
        lista33.item = objArray47;
        lista26.insere((java.lang.Object) objArray47);
        lista19.insere((java.lang.Object) objArray47);
        lista0.item = objArray47;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10.0, -1.0]");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        java.lang.Object[] objArray10 = lista0.item;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        int int8 = lista0.primeiro;
        ds.Lista lista9 = new ds.Lista();
        lista9.primeiro = '4';
        int int12 = lista9.primeiro;
        boolean boolean13 = lista9.vazia();
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        lista15.pos = '4';
        lista15.ultimo = (short) -1;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista15.item = objArray31;
        lista9.insere((java.lang.Object) lista15);
        lista0.insere((java.lang.Object) lista9);
        lista0.pos = (-1);
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        int int35 = lista0.ultimo;
        int int36 = lista0.pos;
        int int37 = lista0.ultimo;
        boolean boolean38 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (short) 0;
        java.lang.Object[] objArray5 = lista0.item;
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.ultimo = 0;
        int int13 = lista6.pos;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        java.lang.Object[] objArray16 = lista14.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        lista14.item = objArray19;
        boolean boolean21 = lista14.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        lista22.pos = '4';
        lista22.primeiro = '4';
        lista22.imprime();
        java.lang.Object[] objArray30 = lista22.item;
        lista14.item = objArray30;
        lista6.item = objArray30;
        ds.Lista lista33 = new ds.Lista();
        lista33.primeiro = '4';
        java.lang.Object obj36 = new java.lang.Object();
        lista33.insere(obj36);
        java.lang.Object[] objArray38 = lista33.item;
        lista33.imprime();
        int int40 = lista33.primeiro;
        ds.Lista lista41 = new ds.Lista();
        lista41.primeiro = '4';
        java.lang.Object obj44 = new java.lang.Object();
        lista41.insere(obj44);
        lista41.imprime();
        java.lang.Object[] objArray47 = lista41.item;
        ds.Lista lista48 = new ds.Lista();
        lista48.primeiro = '4';
        java.lang.Object obj51 = new java.lang.Object();
        lista48.insere(obj51);
        lista48.imprime();
        ds.Lista lista54 = new ds.Lista();
        lista54.primeiro = '4';
        java.lang.Object obj57 = new java.lang.Object();
        lista54.insere(obj57);
        java.lang.Object[] objArray59 = lista54.item;
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista54.item = objArray62;
        lista48.item = objArray62;
        lista41.insere((java.lang.Object) objArray62);
        int int66 = lista41.pos;
        java.lang.Object[] objArray67 = lista41.item;
        lista33.item = objArray67;
        lista6.item = objArray67;
        lista6.imprime();
        lista6.imprime();
        lista0.insere((java.lang.Object) lista6);
        int int73 = lista6.pos;
        ds.Lista lista74 = new ds.Lista();
        lista74.primeiro = '4';
        lista74.pos = '4';
        lista74.primeiro = '4';
        lista74.imprime();
        java.lang.Object[] objArray82 = lista74.item;
        lista6.insere((java.lang.Object) objArray82);
        lista6.ultimo = (short) -1;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(objArray82);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        lista0.pos = '4';
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.imprime();
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        lista8.imprime();
        java.lang.Object[] objArray14 = lista8.item;
        ds.Lista lista15 = new ds.Lista();
        lista15.primeiro = '4';
        java.lang.Object obj18 = new java.lang.Object();
        lista15.insere(obj18);
        lista15.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.primeiro = '4';
        java.lang.Object obj24 = new java.lang.Object();
        lista21.insere(obj24);
        java.lang.Object[] objArray26 = lista21.item;
        java.lang.Object[] objArray29 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista21.item = objArray29;
        lista15.item = objArray29;
        lista8.insere((java.lang.Object) objArray29);
        int int33 = lista8.pos;
        java.lang.Object[] objArray34 = lista8.item;
        lista0.item = objArray34;
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        lista36.pos = '4';
        lista36.ultimo = (short) -1;
        int int43 = lista36.primeiro;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista36.item = objArray52;
        lista0.item = objArray52;
        boolean boolean56 = lista0.vazia();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        lista0.pos = ' ';
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        lista6.pos = '4';
        lista6.ultimo = (short) -1;
        int int13 = lista6.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.primeiro = '4';
        java.lang.Object obj17 = new java.lang.Object();
        lista14.insere(obj17);
        java.lang.Object[] objArray19 = lista14.item;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista14.item = objArray22;
        lista6.item = objArray22;
        lista6.pos = 52;
        lista6.pos = (-1);
        ds.Lista lista29 = new ds.Lista();
        lista29.primeiro = '4';
        java.lang.Object obj32 = new java.lang.Object();
        lista29.insere(obj32);
        java.lang.Object[] objArray34 = lista29.item;
        lista29.imprime();
        int int36 = lista29.primeiro;
        ds.Lista lista37 = new ds.Lista();
        lista37.primeiro = '4';
        java.lang.Object obj40 = new java.lang.Object();
        lista37.insere(obj40);
        lista37.imprime();
        java.lang.Object[] objArray43 = lista37.item;
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        lista44.imprime();
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        java.lang.Object[] objArray55 = lista50.item;
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista50.item = objArray58;
        lista44.item = objArray58;
        lista37.insere((java.lang.Object) objArray58);
        int int62 = lista37.pos;
        java.lang.Object[] objArray63 = lista37.item;
        lista29.item = objArray63;
        lista6.item = objArray63;
        lista0.item = objArray63;
        int int67 = lista0.pos;
        int int68 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        boolean boolean25 = lista0.vazia();
        lista0.primeiro = '#';
        java.lang.Object[] objArray28 = lista0.item;
        int int29 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista29.insere(obj34);
        lista29.pos = 35;
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        lista40.pos = '4';
        lista40.primeiro = '4';
        int int47 = lista40.primeiro;
        int int48 = lista40.primeiro;
        int int49 = lista40.pos;
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        lista50.imprime();
        java.lang.Object[] objArray56 = lista50.item;
        java.lang.Object[] objArray57 = lista50.item;
        lista40.insere((java.lang.Object) lista50);
        lista29.insere((java.lang.Object) lista50);
        java.lang.Class<?> wildcardClass60 = lista50.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.pos = 100;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        int int13 = lista10.primeiro;
        lista10.insere((java.lang.Object) (byte) 100);
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        java.lang.Object obj19 = new java.lang.Object();
        lista16.insere(obj19);
        lista16.imprime();
        ds.Lista lista22 = new ds.Lista();
        lista22.primeiro = '4';
        java.lang.Object obj25 = new java.lang.Object();
        lista22.insere(obj25);
        java.lang.Object[] objArray27 = lista22.item;
        java.lang.Object[] objArray30 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista22.item = objArray30;
        lista16.item = objArray30;
        lista16.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.imprime();
        java.lang.Object[] objArray36 = lista34.item;
        lista34.primeiro = (short) 0;
        java.lang.Object[] objArray39 = lista34.item;
        lista16.item = objArray39;
        lista10.item = objArray39;
        lista0.item = objArray39;
        int int43 = lista0.primeiro;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista23.imprime();
        int int30 = lista23.primeiro;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista31.imprime();
        java.lang.Object[] objArray37 = lista31.item;
        ds.Lista lista38 = new ds.Lista();
        lista38.primeiro = '4';
        java.lang.Object obj41 = new java.lang.Object();
        lista38.insere(obj41);
        lista38.imprime();
        ds.Lista lista44 = new ds.Lista();
        lista44.primeiro = '4';
        java.lang.Object obj47 = new java.lang.Object();
        lista44.insere(obj47);
        java.lang.Object[] objArray49 = lista44.item;
        java.lang.Object[] objArray52 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista44.item = objArray52;
        lista38.item = objArray52;
        lista31.insere((java.lang.Object) objArray52);
        int int56 = lista31.pos;
        java.lang.Object[] objArray57 = lista31.item;
        lista23.item = objArray57;
        lista0.item = objArray57;
        int int60 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        lista0.pos = (short) 100;
        java.lang.Class<?> wildcardClass65 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        java.lang.Class<?> wildcardClass28 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        lista0.insere((java.lang.Object) (byte) 100);
        lista0.ultimo = (short) 0;
        lista0.imprime();
        boolean boolean9 = lista0.vazia();
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.primeiro = '4';
        java.lang.Object obj14 = new java.lang.Object();
        lista11.insere(obj14);
        lista11.imprime();
        lista11.imprime();
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.ultimo = 52;
        java.lang.Object[] objArray12 = lista0.item;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        ds.Lista lista25 = new ds.Lista();
        lista25.primeiro = '4';
        java.lang.Object obj28 = new java.lang.Object();
        lista25.insere(obj28);
        java.lang.Object[] objArray30 = lista25.item;
        lista0.item = objArray30;
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        ds.Lista lista17 = new ds.Lista();
        lista17.primeiro = '4';
        java.lang.Object obj20 = new java.lang.Object();
        lista17.insere(obj20);
        java.lang.Object[] objArray22 = lista17.item;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista17.item = objArray25;
        lista0.item = objArray25;
        lista0.imprime();
        lista0.ultimo = '#';
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, -1.0]");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        java.lang.Object[] objArray15 = lista14.item;
        lista0.item = objArray15;
        lista0.primeiro = (short) 100;
        java.lang.Object[] objArray19 = lista0.item;
        java.lang.Object[] objArray20 = lista0.item;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        ds.Lista lista4 = new ds.Lista();
        lista4.primeiro = '4';
        lista4.pos = '4';
        lista4.primeiro = '4';
        lista4.imprime();
        java.lang.Class<?> wildcardClass12 = lista4.getClass();
        lista0.insere((java.lang.Object) lista4);
        lista4.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.ultimo;
        int int12 = lista0.primeiro;
        int int13 = lista0.ultimo;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.pos = 100;
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        lista0.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        int int12 = lista0.ultimo;
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = (byte) 0;
        lista0.primeiro = 32;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10.0, -1.0]");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        boolean boolean3 = lista0.vazia();
        boolean boolean4 = lista0.vazia();
        boolean boolean5 = lista0.vazia();
        lista0.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.ultimo = 1;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        lista6.imprime();
        ds.Lista lista12 = new ds.Lista();
        lista12.primeiro = '4';
        java.lang.Object obj15 = new java.lang.Object();
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista12.item = objArray20;
        lista6.item = objArray20;
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        java.lang.Object obj26 = new java.lang.Object();
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista23.item = objArray31;
        lista6.item = objArray31;
        lista0.item = objArray31;
        int int35 = lista0.ultimo;
        int int36 = lista0.pos;
        int int37 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 52 + "'", int37 == 52);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray1 = lista0.item;
        ds.Lista lista2 = new ds.Lista();
        lista2.primeiro = '4';
        java.lang.Object obj5 = new java.lang.Object();
        lista2.insere(obj5);
        lista0.insere(obj5);
        lista0.pos = (byte) 100;
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista0.insere((java.lang.Object) lista11);
        java.lang.Object[] objArray13 = lista11.item;
        lista11.primeiro = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray17 = lista16.item;
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        lista16.insere(obj21);
        lista16.pos = (byte) 100;
        ds.Lista lista26 = new ds.Lista();
        lista26.primeiro = '4';
        lista26.pos = '4';
        lista26.ultimo = (short) -1;
        int int33 = lista26.primeiro;
        lista26.pos = (short) 10;
        java.lang.Object[] objArray36 = lista26.item;
        lista16.item = objArray36;
        lista11.item = objArray36;
        lista11.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(objArray36);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.pos;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        lista28.pos = '4';
        lista28.ultimo = (short) -1;
        int int35 = lista28.primeiro;
        ds.Lista lista36 = new ds.Lista();
        lista36.primeiro = '4';
        java.lang.Object obj39 = new java.lang.Object();
        lista36.insere(obj39);
        java.lang.Object[] objArray41 = lista36.item;
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista36.item = objArray44;
        lista28.item = objArray44;
        lista28.pos = 52;
        lista28.pos = (-1);
        ds.Lista lista51 = new ds.Lista();
        lista51.primeiro = '4';
        java.lang.Object obj54 = new java.lang.Object();
        lista51.insere(obj54);
        java.lang.Object[] objArray56 = lista51.item;
        lista51.imprime();
        int int58 = lista51.primeiro;
        ds.Lista lista59 = new ds.Lista();
        lista59.primeiro = '4';
        java.lang.Object obj62 = new java.lang.Object();
        lista59.insere(obj62);
        lista59.imprime();
        java.lang.Object[] objArray65 = lista59.item;
        ds.Lista lista66 = new ds.Lista();
        lista66.primeiro = '4';
        java.lang.Object obj69 = new java.lang.Object();
        lista66.insere(obj69);
        lista66.imprime();
        ds.Lista lista72 = new ds.Lista();
        lista72.primeiro = '4';
        java.lang.Object obj75 = new java.lang.Object();
        lista72.insere(obj75);
        java.lang.Object[] objArray77 = lista72.item;
        java.lang.Object[] objArray80 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista72.item = objArray80;
        lista66.item = objArray80;
        lista59.insere((java.lang.Object) objArray80);
        int int84 = lista59.pos;
        java.lang.Object[] objArray85 = lista59.item;
        lista51.item = objArray85;
        lista28.item = objArray85;
        lista0.item = objArray85;
        java.lang.Class<?> wildcardClass89 = objArray85.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 52 + "'", int58 == 52);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray80), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.insere((java.lang.Object) '#');
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        lista0.ultimo = 0;
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        int int10 = lista0.pos;
        lista0.pos = 0;
        lista0.primeiro = (short) -1;
        int int15 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        lista10.primeiro = '4';
        java.lang.Object obj13 = new java.lang.Object();
        lista10.insere(obj13);
        lista10.imprime();
        java.lang.Object[] objArray16 = lista10.item;
        java.lang.Object[] objArray17 = lista10.item;
        lista0.insere((java.lang.Object) lista10);
        int int19 = lista10.ultimo;
        lista10.primeiro = (short) -1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista0.item = objArray8;
        lista0.pos = (short) 0;
        lista0.pos = (short) -1;
        lista0.primeiro = (byte) -1;
        boolean boolean16 = lista0.vazia();
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        lista8.primeiro = '4';
        java.lang.Object obj11 = new java.lang.Object();
        lista8.insere(obj11);
        java.lang.Object[] objArray13 = lista8.item;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista8.item = objArray16;
        lista0.item = objArray16;
        lista0.pos = 52;
        lista0.pos = (-1);
        ds.Lista lista23 = new ds.Lista();
        lista23.primeiro = '4';
        int int26 = lista23.primeiro;
        lista23.insere((java.lang.Object) (byte) 100);
        lista23.ultimo = (short) 0;
        lista23.imprime();
        boolean boolean32 = lista23.vazia();
        java.lang.Object[] objArray33 = lista23.item;
        lista0.item = objArray33;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        lista0.ultimo = (byte) 1;
        lista0.imprime();
        boolean boolean10 = lista0.vazia();
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        lista0.primeiro = (byte) 100;
        lista0.primeiro = 10;
        lista0.ultimo = 97;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        ds.Lista lista6 = new ds.Lista();
        lista6.primeiro = '4';
        java.lang.Object obj9 = new java.lang.Object();
        lista6.insere(obj9);
        java.lang.Object[] objArray11 = lista6.item;
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista6.item = objArray14;
        lista0.item = objArray14;
        lista0.imprime();
        ds.Lista lista18 = new ds.Lista();
        lista18.primeiro = '4';
        java.lang.Object obj21 = new java.lang.Object();
        lista18.insere(obj21);
        java.lang.Object[] objArray23 = lista18.item;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista18.item = objArray26;
        int int28 = lista18.pos;
        lista0.insere((java.lang.Object) lista18);
        java.lang.Object[] objArray30 = lista18.item;
        int int31 = lista18.pos;
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        lista0.imprime();
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) 10;
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.imprime();
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        lista7.primeiro = '4';
        java.lang.Object obj10 = new java.lang.Object();
        lista7.insere(obj10);
        lista7.imprime();
        ds.Lista lista13 = new ds.Lista();
        lista13.primeiro = '4';
        java.lang.Object obj16 = new java.lang.Object();
        lista13.insere(obj16);
        java.lang.Object[] objArray18 = lista13.item;
        java.lang.Object[] objArray21 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista13.item = objArray21;
        lista7.item = objArray21;
        lista0.insere((java.lang.Object) objArray21);
        int int25 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.pos;
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray30 = lista29.item;
        ds.Lista lista31 = new ds.Lista();
        lista31.primeiro = '4';
        java.lang.Object obj34 = new java.lang.Object();
        lista31.insere(obj34);
        lista29.insere(obj34);
        lista29.pos = 35;
        lista0.insere((java.lang.Object) lista29);
        ds.Lista lista40 = new ds.Lista();
        lista40.primeiro = '4';
        lista40.pos = '4';
        lista40.primeiro = '4';
        int int47 = lista40.primeiro;
        int int48 = lista40.primeiro;
        int int49 = lista40.pos;
        ds.Lista lista50 = new ds.Lista();
        lista50.primeiro = '4';
        java.lang.Object obj53 = new java.lang.Object();
        lista50.insere(obj53);
        lista50.imprime();
        java.lang.Object[] objArray56 = lista50.item;
        java.lang.Object[] objArray57 = lista50.item;
        lista40.insere((java.lang.Object) lista50);
        lista29.insere((java.lang.Object) lista50);
        boolean boolean60 = lista50.vazia();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 52 + "'", int48 == 52);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.ultimo = (short) -1;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        java.lang.Object obj3 = new java.lang.Object();
        lista0.insere(obj3);
        lista0.ultimo = 0;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista8.item = objArray13;
        boolean boolean15 = lista8.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.primeiro = '4';
        lista16.pos = '4';
        lista16.primeiro = '4';
        lista16.imprime();
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        ds.Lista lista28 = new ds.Lista();
        lista28.primeiro = '4';
        java.lang.Object obj31 = new java.lang.Object();
        lista28.insere(obj31);
        lista28.imprime();
        ds.Lista lista34 = new ds.Lista();
        lista34.primeiro = '4';
        java.lang.Object obj37 = new java.lang.Object();
        lista34.insere(obj37);
        java.lang.Object[] objArray39 = lista34.item;
        java.lang.Object[] objArray42 = new java.lang.Object[] { 10.0f, (-1.0f) };
        lista34.item = objArray42;
        lista28.item = objArray42;
        lista0.item = objArray42;
        java.lang.Class<?> wildcardClass46 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        lista0.primeiro = '4';
        lista0.pos = '4';
        lista0.primeiro = '4';
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (-1);
        int int10 = lista0.pos;
        lista0.pos = 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }
}

