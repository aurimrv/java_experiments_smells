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
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test002");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test003");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test004");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test005");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.ultimo;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test006");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        int int16 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test007");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.ultimo = (short) 1;
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test008");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test009");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test010");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista5.item = objArray9;
        lista0.item = objArray9;
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test011");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test012");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test013");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test014");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        lista0.ultimo = (short) 0;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        boolean boolean11 = lista9.vazia();
        lista9.ultimo = ' ';
        lista0.insere((java.lang.Object) ' ');
        boolean boolean15 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test015");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test016");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        boolean boolean15 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test017");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test018");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test019");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        lista0.pos = (short) -1;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test020");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.primeiro;
        int int4 = lista0.primeiro;
        int int5 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test021");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test022");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test023");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test024");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.primeiro;
        java.lang.Object obj13 = null;
        lista10.insere(obj13);
        java.lang.Object[] objArray15 = lista10.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test025");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista0.insere((java.lang.Object) int7);
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test026");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        java.lang.Class<?> wildcardClass24 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test027");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test028");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.primeiro;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test029");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.imprime();
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test030");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = '4';
        lista4.primeiro = 36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test031");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        lista15.primeiro = '#';
        // The following exception was thrown during execution in test generation
        try {
            lista15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test032");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray11 = lista9.item;
        int int12 = lista9.pos;
        java.lang.Class<?> wildcardClass13 = lista9.getClass();
        lista0.insere((java.lang.Object) wildcardClass13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test033");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = '4';
        lista4.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test034");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        lista15.primeiro = '#';
        lista15.primeiro = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test035");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        lista0.ultimo = (short) -1;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 10;
        lista9.primeiro = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test036");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        int int10 = lista0.ultimo;
        lista0.ultimo = 100;
        java.lang.Class<?> wildcardClass13 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test037");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        java.lang.Class<?> wildcardClass21 = lista3.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test038");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test039");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista16.pos = (short) 0;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        java.lang.Object[] objArray24 = lista22.item;
        lista16.item = objArray24;
        lista0.item = objArray24;
        java.lang.Class<?> wildcardClass27 = objArray24.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test040");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        boolean boolean8 = lista6.vazia();
        lista6.pos = 0;
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.primeiro;
        lista13.imprime();
        int int17 = lista13.pos;
        int int18 = lista13.ultimo;
        lista13.imprime();
        ds.Lista lista20 = new ds.Lista();
        ds.Lista lista21 = new ds.Lista();
        java.lang.Object[] objArray25 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista21.item = objArray25;
        lista20.item = objArray25;
        lista13.item = objArray25;
        lista0.item = objArray25;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1, 10, 1]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test041");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test042");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test043");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        java.lang.Class<?> wildcardClass15 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test044");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.imprime();
        lista0.ultimo = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test045");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test046");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        java.lang.Class<?> wildcardClass10 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test047");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        int int12 = lista7.ultimo;
        lista7.imprime();
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista15.item = objArray19;
        lista14.item = objArray19;
        lista7.item = objArray19;
        lista0.item = objArray19;
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, 10, 1]");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test048");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.pos = (short) 0;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test049");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.ultimo = '#';
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        lista12.imprime();
        int int16 = lista12.ultimo;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test050");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test051");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista0.ultimo = (short) 1;
        lista0.ultimo = '#';
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test052");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test053");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        int int26 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test054");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista8.item = objArray12;
        lista7.item = objArray12;
        lista0.item = objArray12;
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 10, 1]");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test055");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test056");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        lista0.primeiro = 36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test057");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        lista0.primeiro = 100;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test058");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        lista9.primeiro = 10;
        lista9.imprime();
        lista9.imprime();
        int int16 = lista9.ultimo;
        boolean boolean17 = lista9.vazia();
        lista0.insere((java.lang.Object) boolean17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test059");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        boolean boolean8 = lista6.vazia();
        lista6.pos = 0;
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        lista0.pos = (short) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test060");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test061");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test062");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test063");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        java.lang.Object[] objArray5 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test064");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test065");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        java.lang.Object[] objArray14 = lista11.item;
        lista11.ultimo = 1;
        ds.Lista lista17 = new ds.Lista();
        lista11.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray19 = lista11.item;
        int int20 = lista11.primeiro;
        lista0.insere((java.lang.Object) int20);
        boolean boolean22 = lista0.vazia();
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test066");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        lista6.primeiro = (byte) 0;
        java.lang.Class<?> wildcardClass19 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test067");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test068");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray13 = lista0.item;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test069");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.ultimo = 97;
        int int6 = lista0.pos;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test070");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = 35;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test071");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = (byte) 100;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        int int11 = lista9.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.ultimo;
        java.lang.Object[] objArray14 = lista12.item;
        lista9.item = objArray14;
        lista0.item = objArray14;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test072");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Object[] objArray9 = lista0.item;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test073");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.ultimo;
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test074");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.ultimo;
        java.lang.Object[] objArray5 = lista3.item;
        lista0.item = objArray5;
        java.lang.Class<?> wildcardClass7 = objArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test075");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.insere((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test076");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test077");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test078");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        lista0.pos = '4';
        lista0.ultimo = 0;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test079");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        int int16 = lista0.primeiro;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test080");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        int int19 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test081");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        java.lang.Object[] objArray7 = lista0.item;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test082");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test083");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test084");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.pos;
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test085");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = ' ';
        lista6.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test086");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        int int11 = lista8.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        java.lang.Object obj16 = null;
        lista12.insere(obj16);
        int int18 = lista12.primeiro;
        boolean boolean19 = lista12.vazia();
        java.lang.Object[] objArray20 = lista12.item;
        lista8.item = objArray20;
        lista6.item = objArray20;
        java.lang.Class<?> wildcardClass23 = objArray20.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test087");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test088");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 35;
        int int6 = lista0.pos;
        lista0.insere((java.lang.Object) "");
        lista0.pos = 35;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test089");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        java.lang.Object obj15 = null;
        lista10.insere(obj15);
        // The following exception was thrown during execution in test generation
        try {
            lista10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test090");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = '#';
        java.lang.Class<?> wildcardClass9 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test091");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.item = objArray22;
        lista10.pos = (byte) 100;
        lista10.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test092");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        lista15.primeiro = '#';
        lista15.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test093");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test094");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.primeiro;
        int int11 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test095");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean26 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista29 = new ds.Lista();
        lista29.pos = (-1);
        int int32 = lista29.primeiro;
        int int33 = lista29.pos;
        int int34 = lista29.pos;
        ds.Lista lista35 = new ds.Lista();
        lista35.imprime();
        boolean boolean37 = lista35.vazia();
        lista35.pos = 0;
        boolean boolean40 = lista35.vazia();
        lista29.insere((java.lang.Object) boolean40);
        int int42 = lista29.pos;
        ds.Lista lista43 = new ds.Lista();
        int int44 = lista43.pos;
        lista43.ultimo = '#';
        lista43.pos = (short) 10;
        ds.Lista lista49 = new ds.Lista();
        lista49.imprime();
        java.lang.Object[] objArray51 = lista49.item;
        lista43.insere((java.lang.Object) lista49);
        ds.Lista lista53 = new ds.Lista();
        int int54 = lista53.pos;
        lista53.ultimo = '#';
        lista49.insere((java.lang.Object) lista53);
        lista49.pos = 'a';
        lista49.primeiro = (byte) 0;
        ds.Lista lista62 = new ds.Lista();
        int int63 = lista62.pos;
        int int64 = lista62.ultimo;
        lista62.pos = 10;
        lista62.primeiro = 0;
        int int69 = lista62.ultimo;
        lista49.insere((java.lang.Object) int69);
        ds.Lista lista71 = new ds.Lista();
        int int72 = lista71.pos;
        lista71.ultimo = '#';
        java.lang.Object obj75 = null;
        lista71.insere(obj75);
        int int77 = lista71.primeiro;
        boolean boolean78 = lista71.vazia();
        java.lang.Object[] objArray79 = lista71.item;
        java.lang.Object[] objArray80 = lista71.item;
        lista49.item = objArray80;
        lista29.item = objArray80;
        lista0.item = objArray80;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray80);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test096");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.ultimo = 0;
        lista8.ultimo = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.pos = 10;
        lista16.primeiro = 0;
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Class<?> wildcardClass27 = objArray24.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test097");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        boolean boolean8 = lista6.vazia();
        lista6.pos = 0;
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        java.lang.Object obj13 = null;
        lista0.insere(obj13);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        lista15.ultimo = 0;
        lista15.ultimo = (short) 10;
        int int23 = lista15.pos;
        lista15.ultimo = 2;
        lista0.insere((java.lang.Object) lista15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test098");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test099");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test100");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        int int13 = lista10.primeiro;
        int int14 = lista10.primeiro;
        lista10.pos = 1;
        lista0.insere((java.lang.Object) lista10);
        int int18 = lista10.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test101");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.ultimo = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        lista19.ultimo = 0;
        lista19.ultimo = (short) 10;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.ultimo;
        lista27.pos = 10;
        lista27.primeiro = 0;
        int int34 = lista27.ultimo;
        java.lang.Object[] objArray35 = lista27.item;
        lista19.item = objArray35;
        java.lang.Object[] objArray37 = lista19.item;
        lista0.item = objArray37;
        lista0.ultimo = 97;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test102");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 97;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test103");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test104");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        lista6.pos = 36;
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test105");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        lista0.pos = (-1);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test106");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista5.imprime();
        boolean boolean9 = lista5.vazia();
        java.lang.Object[] objArray10 = lista5.item;
        lista0.item = objArray10;
        int int12 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test107");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        boolean boolean23 = lista19.vazia();
        int int24 = lista19.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test108");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test109");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        lista0.pos = '4';
        boolean boolean10 = lista0.vazia();
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test110");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test111");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista3.item = objArray7;
        lista2.item = objArray7;
        lista2.pos = (-1);
        int int12 = lista2.primeiro;
        lista0.insere((java.lang.Object) int12);
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test112");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test113");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        lista0.ultimo = 'a';
        lista0.pos = (short) 1;
        java.lang.Class<?> wildcardClass11 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test114");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test115");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test116");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        java.lang.Class<?> wildcardClass3 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test117");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test118");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        int int16 = lista0.pos;
        int int17 = lista0.pos;
        java.lang.Class<?> wildcardClass18 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test119");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test120");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass20 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test121");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test122");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        int int26 = lista7.primeiro;
        lista7.pos = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test123");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test124");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.ultimo = (byte) -1;
        lista0.primeiro = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test125");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        lista0.ultimo = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista20.insere((java.lang.Object) lista24);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        lista29.imprime();
        int int33 = lista29.pos;
        lista29.primeiro = (byte) -1;
        java.lang.Object[] objArray36 = lista29.item;
        lista24.item = objArray36;
        lista0.insere((java.lang.Object) lista24);
        int int39 = lista24.ultimo;
        lista24.ultimo = 36;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test126");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        int int12 = lista7.ultimo;
        lista7.imprime();
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista15.item = objArray19;
        lista14.item = objArray19;
        lista7.item = objArray19;
        lista0.item = objArray19;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        int int26 = lista24.primeiro;
        lista24.ultimo = 100;
        int int29 = lista24.primeiro;
        int int30 = lista24.pos;
        java.lang.Class<?> wildcardClass31 = lista24.getClass();
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        int int34 = lista32.primeiro;
        int int35 = lista32.primeiro;
        ds.Lista lista36 = new ds.Lista();
        lista36.imprime();
        int int38 = lista36.primeiro;
        lista36.primeiro = 10;
        lista32.insere((java.lang.Object) lista36);
        lista36.pos = '4';
        lista36.pos = (short) 100;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        lista46.ultimo = '#';
        ds.Lista lista50 = new ds.Lista();
        lista50.imprime();
        int int52 = lista50.primeiro;
        lista50.imprime();
        int int54 = lista50.pos;
        lista50.primeiro = (byte) -1;
        int int57 = lista50.ultimo;
        java.lang.Object[] objArray58 = lista50.item;
        ds.Lista lista59 = new ds.Lista();
        lista59.imprime();
        int int61 = lista59.primeiro;
        java.lang.Object[] objArray62 = lista59.item;
        lista59.ultimo = 1;
        ds.Lista lista65 = new ds.Lista();
        lista59.insere((java.lang.Object) lista65);
        java.lang.Object[] objArray67 = lista59.item;
        int int68 = lista59.primeiro;
        int int69 = lista59.pos;
        ds.Lista lista70 = new ds.Lista();
        lista70.imprime();
        int int72 = lista70.primeiro;
        lista70.imprime();
        int int74 = lista70.pos;
        lista70.primeiro = (byte) -1;
        java.lang.Object[] objArray77 = lista70.item;
        lista59.item = objArray77;
        ds.Lista lista79 = new ds.Lista();
        int int80 = lista79.pos;
        lista79.ultimo = (byte) 1;
        int int83 = lista79.pos;
        int int84 = lista79.pos;
        java.lang.Object[] objArray85 = new java.lang.Object[] { lista24, (short) 100, lista46, lista50, objArray77, lista79 };
        lista0.item = objArray85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test127");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = (-1);
        int int12 = lista9.primeiro;
        int int13 = lista9.pos;
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        boolean boolean17 = lista15.vazia();
        lista15.pos = 0;
        boolean boolean20 = lista15.vazia();
        lista9.insere((java.lang.Object) boolean20);
        lista0.insere((java.lang.Object) lista9);
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test128");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        boolean boolean23 = lista19.vazia();
        boolean boolean24 = lista19.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        int int27 = lista25.primeiro;
        lista25.primeiro = 10;
        lista25.imprime();
        lista25.imprime();
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = (short) 1;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        lista37.ultimo = (byte) 1;
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        java.lang.Object[] objArray44 = lista41.item;
        lista37.item = objArray44;
        lista32.item = objArray44;
        lista32.pos = (short) -1;
        lista32.imprime();
        lista25.insere((java.lang.Object) lista32);
        int int51 = lista32.primeiro;
        lista19.insere((java.lang.Object) lista32);
        java.lang.Class<?> wildcardClass53 = lista32.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test129");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        boolean boolean17 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test130");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test131");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test132");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        lista0.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test133");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        int int4 = lista0.ultimo;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test134");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        boolean boolean4 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test135");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.pos;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test136");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test137");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        lista0.pos = (-1);
        lista0.primeiro = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test138");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test139");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test140");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        java.lang.Object[] objArray11 = lista9.item;
        java.lang.Object[] objArray12 = lista9.item;
        lista0.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 0;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        java.lang.Object[] objArray22 = lista20.item;
        lista14.item = objArray22;
        int int24 = lista14.ultimo;
        lista0.insere((java.lang.Object) lista14);
        java.lang.Class<?> wildcardClass26 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test141");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        int int16 = lista0.primeiro;
        java.lang.Class<?> wildcardClass17 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test142");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test143");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test144");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test145");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        int int6 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test146");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test147");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 97;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test148");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        lista0.ultimo = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista20.insere((java.lang.Object) lista24);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        lista29.imprime();
        int int33 = lista29.pos;
        lista29.primeiro = (byte) -1;
        java.lang.Object[] objArray36 = lista29.item;
        lista24.item = objArray36;
        lista0.insere((java.lang.Object) lista24);
        int int39 = lista24.ultimo;
        boolean boolean40 = lista24.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test149");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        int int14 = lista11.ultimo;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = (short) 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista15.item = objArray22;
        lista11.item = objArray22;
        lista0.item = objArray22;
        lista0.ultimo = (byte) 1;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test150");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = (short) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test151");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.pos;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test152");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test153");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        lista0.ultimo = 'a';
        lista0.primeiro = (byte) 100;
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test154");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test155");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Class<?> wildcardClass2 = lista0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test156");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista8.primeiro = (byte) 1;
        int int13 = lista8.primeiro;
        java.lang.Object[] objArray14 = lista8.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) objArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test157");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        int int18 = lista6.ultimo;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test158");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        lista0.primeiro = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test159");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0d));
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test160");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        java.lang.Object[] objArray10 = lista0.item;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = (short) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista11.item = objArray18;
        int int20 = lista11.primeiro;
        boolean boolean21 = lista11.vazia();
        int int22 = lista11.ultimo;
        int int23 = lista11.primeiro;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista24.imprime();
        boolean boolean28 = lista24.vazia();
        java.lang.Object[] objArray29 = lista24.item;
        lista11.item = objArray29;
        lista0.insere((java.lang.Object) objArray29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(objArray29);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test161");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        boolean boolean23 = lista19.vazia();
        boolean boolean24 = lista19.vazia();
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        int int27 = lista25.primeiro;
        lista25.primeiro = 10;
        lista25.imprime();
        lista25.imprime();
        ds.Lista lista32 = new ds.Lista();
        int int33 = lista32.pos;
        int int34 = lista32.ultimo;
        lista32.primeiro = (short) 1;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        lista37.ultimo = (byte) 1;
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        java.lang.Object[] objArray44 = lista41.item;
        lista37.item = objArray44;
        lista32.item = objArray44;
        lista32.pos = (short) -1;
        lista32.imprime();
        lista25.insere((java.lang.Object) lista32);
        int int51 = lista32.primeiro;
        lista19.insere((java.lang.Object) lista32);
        int int53 = lista32.ultimo;
        java.lang.Class<?> wildcardClass54 = lista32.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test162");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        lista7.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test163");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        int int10 = lista0.ultimo;
        lista0.ultimo = 100;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test164");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test165");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        int int11 = lista0.pos;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test166");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.pos;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.pos = 10;
        lista7.primeiro = 0;
        boolean boolean14 = lista7.vazia();
        int int15 = lista7.pos;
        lista0.insere((java.lang.Object) int15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test167");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.imprime();
        int int18 = lista14.pos;
        lista14.primeiro = (byte) -1;
        boolean boolean21 = lista14.vazia();
        lista14.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista14);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test168");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test169");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        int int6 = lista0.ultimo;
        int int7 = lista0.primeiro;
        int int8 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test170");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        lista7.ultimo = '4';
        int int14 = lista7.primeiro;
        int int15 = lista7.primeiro;
        lista0.insere((java.lang.Object) int15);
        lista0.pos = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test171");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = '4';
        lista4.primeiro = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test172");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista4.pos = '4';
        java.lang.Class<?> wildcardClass12 = lista4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test173");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        boolean boolean8 = lista6.vazia();
        lista6.pos = 0;
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        int int13 = lista0.pos;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista20.insere((java.lang.Object) lista24);
        lista20.pos = 'a';
        lista20.primeiro = (byte) 0;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.pos = 10;
        lista33.primeiro = 0;
        int int40 = lista33.ultimo;
        lista20.insere((java.lang.Object) int40);
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        lista42.ultimo = '#';
        java.lang.Object obj46 = null;
        lista42.insere(obj46);
        int int48 = lista42.primeiro;
        boolean boolean49 = lista42.vazia();
        java.lang.Object[] objArray50 = lista42.item;
        java.lang.Object[] objArray51 = lista42.item;
        lista20.item = objArray51;
        lista0.item = objArray51;
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray51);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test174");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test175");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test176");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista6.pos = 0;
        lista6.primeiro = (byte) 100;
        lista6.primeiro = 0;
        lista6.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test177");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        boolean boolean6 = lista0.vazia();
        lista0.ultimo = (byte) 1;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test178");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        lista0.pos = (short) 100;
        int int12 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test179");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        lista0.primeiro = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test180");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        lista0.imprime();
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test181");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        int int23 = lista0.pos;
        int int24 = lista0.pos;
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test182");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test183");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        lista6.primeiro = (byte) 0;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        lista19.pos = 10;
        lista19.primeiro = 0;
        int int26 = lista19.ultimo;
        lista6.insere((java.lang.Object) int26);
        ds.Lista lista28 = new ds.Lista();
        ds.Lista lista29 = new ds.Lista();
        java.lang.Object[] objArray33 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista29.item = objArray33;
        lista28.item = objArray33;
        lista28.primeiro = ' ';
        lista28.primeiro = 2;
        lista6.insere((java.lang.Object) lista28);
        java.lang.Class<?> wildcardClass41 = lista28.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test184");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        int int23 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test185");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = '4';
        lista0.pos = ' ';
        boolean boolean6 = lista0.vazia();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test186");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test187");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = '#';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test188");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        java.lang.Class<?> wildcardClass23 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test189");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test190");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.primeiro = 35;
        lista6.primeiro = 36;
        lista6.pos = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test191");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test192");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.pos = 10;
        lista6.primeiro = 0;
        int int13 = lista6.ultimo;
        java.lang.Object[] objArray14 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int16 = lista0.pos;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test193");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        lista15.pos = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test194");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        lista0.pos = 10;
        ds.Lista lista7 = new ds.Lista();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista7.item = objArray11;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        int int15 = lista13.ultimo;
        lista13.primeiro = (short) 1;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista13.item = objArray20;
        lista7.item = objArray20;
        java.lang.Object[] objArray23 = lista7.item;
        lista7.ultimo = (byte) 1;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        lista26.ultimo = '#';
        lista26.ultimo = 0;
        lista26.ultimo = (short) 10;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        int int36 = lista34.ultimo;
        lista34.pos = 10;
        lista34.primeiro = 0;
        int int41 = lista34.ultimo;
        java.lang.Object[] objArray42 = lista34.item;
        lista26.item = objArray42;
        java.lang.Object[] objArray44 = lista26.item;
        lista7.item = objArray44;
        lista0.item = objArray44;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test195");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test196");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        int int18 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test197");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista6.pos;
        lista6.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test198");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test199");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test200");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista6.item = objArray10;
        lista5.item = objArray10;
        lista5.primeiro = ' ';
        lista0.insere((java.lang.Object) lista5);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test201");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        java.lang.Object[] objArray14 = lista11.item;
        lista11.ultimo = 1;
        ds.Lista lista17 = new ds.Lista();
        lista11.insere((java.lang.Object) lista17);
        java.lang.Object[] objArray19 = lista11.item;
        int int20 = lista11.primeiro;
        lista0.insere((java.lang.Object) int20);
        lista0.primeiro = (short) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test202");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = (byte) 10;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test203");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        lista0.pos = (-1);
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = ' ';
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test204");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        java.lang.Object[] objArray9 = lista0.item;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista10.pos = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista10.insere((java.lang.Object) lista16);
        lista10.primeiro = (short) -1;
        lista10.ultimo = (short) 1;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista24.pos = (short) 10;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        java.lang.Object[] objArray32 = lista30.item;
        lista24.insere((java.lang.Object) lista30);
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        lista34.ultimo = '#';
        lista30.insere((java.lang.Object) lista34);
        ds.Lista lista39 = new ds.Lista();
        lista39.imprime();
        int int41 = lista39.primeiro;
        lista39.imprime();
        int int43 = lista39.pos;
        lista39.primeiro = (byte) -1;
        java.lang.Object[] objArray46 = lista39.item;
        lista34.item = objArray46;
        lista10.insere((java.lang.Object) lista34);
        int int49 = lista34.ultimo;
        lista0.insere((java.lang.Object) int49);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test205");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.pos;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test206");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test207");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        java.lang.Object[] objArray4 = lista0.item;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test208");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        int int12 = lista7.ultimo;
        lista7.imprime();
        ds.Lista lista14 = new ds.Lista();
        ds.Lista lista15 = new ds.Lista();
        java.lang.Object[] objArray19 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista15.item = objArray19;
        lista14.item = objArray19;
        lista7.item = objArray19;
        lista0.item = objArray19;
        boolean boolean24 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test209");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        java.lang.Object[] objArray2 = lista0.item;
        boolean boolean3 = lista0.vazia();
        lista0.imprime();
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test210");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test211");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.pos;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test212");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        lista0.ultimo = (byte) -1;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test213");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        int int23 = lista0.pos;
        int int24 = lista0.pos;
        ds.Lista lista25 = new ds.Lista();
        lista25.imprime();
        boolean boolean27 = lista25.vazia();
        lista25.ultimo = 100;
        lista0.insere((java.lang.Object) lista25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test214");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.ultimo;
        boolean boolean17 = lista10.vazia();
        boolean boolean18 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test215");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test216");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test217");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test218");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.primeiro;
        int int17 = lista10.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test219");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object obj8 = null;
        lista6.insere(obj8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test220");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 98;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.ultimo = 0;
        int int10 = lista4.pos;
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 0;
        int int18 = lista12.ultimo;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        boolean boolean21 = lista19.vazia();
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        int int25 = lista22.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = (short) 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray33 = lista31.item;
        lista26.item = objArray33;
        lista22.item = objArray33;
        lista19.item = objArray33;
        lista12.item = objArray33;
        lista4.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test221");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.primeiro;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test222");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        lista0.pos = 10;
        lista0.pos = (byte) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test223");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        lista0.pos = (short) -1;
        int int13 = lista0.primeiro;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        boolean boolean16 = lista14.vazia();
        java.lang.Class<?> wildcardClass17 = lista14.getClass();
        lista0.insere((java.lang.Object) lista14);
        int int19 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test224");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = (byte) 1;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test225");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.imprime();
        int int3 = lista0.ultimo;
        lista0.ultimo = 100;
        ds.Lista lista6 = new ds.Lista();
        lista6.pos = (-1);
        int int9 = lista6.primeiro;
        int int10 = lista6.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        int int14 = lista11.ultimo;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = (short) 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista15.item = objArray22;
        lista11.item = objArray22;
        lista6.item = objArray22;
        lista0.insere((java.lang.Object) objArray22);
        int int27 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test226");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        ds.Lista lista4 = new ds.Lista();
        java.lang.Object[] objArray8 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista4.item = objArray8;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = (short) 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        java.lang.Object[] objArray17 = lista15.item;
        lista10.item = objArray17;
        lista4.item = objArray17;
        lista0.item = objArray17;
        boolean boolean21 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test227");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.primeiro = 'a';
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test228");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        boolean boolean13 = lista11.vazia();
        lista11.pos = 0;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        java.lang.Object[] objArray18 = lista16.item;
        lista11.insere((java.lang.Object) lista16);
        int int20 = lista11.pos;
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.pos;
        lista21.ultimo = '#';
        int int25 = lista21.pos;
        java.lang.Object[] objArray26 = null;
        lista21.item = objArray26;
        lista11.insere((java.lang.Object) lista21);
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        int int31 = lista29.ultimo;
        lista29.primeiro = (short) 1;
        ds.Lista lista34 = new ds.Lista();
        int int35 = lista34.pos;
        lista34.ultimo = (byte) 1;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        int int40 = lista38.primeiro;
        java.lang.Object[] objArray41 = lista38.item;
        lista34.item = objArray41;
        lista29.item = objArray41;
        lista11.item = objArray41;
        lista0.item = objArray41;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test229");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = (short) 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        lista29.ultimo = (byte) 1;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        java.lang.Object[] objArray36 = lista33.item;
        lista29.item = objArray36;
        lista24.item = objArray36;
        lista15.item = objArray36;
        int int40 = lista15.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista15.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test230");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        lista0.primeiro = 0;
        int int13 = lista0.primeiro;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test231");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista6.pos;
        int int11 = lista6.pos;
        int int12 = lista6.pos;
        lista6.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test232");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test233");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.ultimo;
        java.lang.Object[] objArray8 = lista0.item;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(objArray8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test234");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        int int4 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test235");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.ultimo = 1;
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test236");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.ultimo = 0;
        lista8.ultimo = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.pos = 10;
        lista16.primeiro = 0;
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        java.lang.Class<?> wildcardClass28 = objArray27.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test237");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        lista0.ultimo = (short) 1;
        lista0.ultimo = '#';
        int int14 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test238");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        java.lang.Object[] objArray14 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test239");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = '#';
        lista5.pos = (short) 10;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista5.insere((java.lang.Object) lista11);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        lista11.insere((java.lang.Object) lista15);
        lista11.pos = 'a';
        int int22 = lista11.pos;
        int int23 = lista11.pos;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista24.pos = (short) 0;
        java.lang.Object[] objArray30 = lista24.item;
        lista11.item = objArray30;
        lista0.insere((java.lang.Object) lista11);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test240");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.ultimo;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        int int6 = lista4.ultimo;
        lista4.primeiro = (short) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        java.lang.Object[] objArray11 = lista9.item;
        lista4.item = objArray11;
        lista0.item = objArray11;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.ultimo = 100;
        int int19 = lista14.primeiro;
        int int20 = lista14.pos;
        int int21 = lista14.primeiro;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = '#';
        lista22.ultimo = 0;
        lista22.ultimo = (short) 10;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        lista30.pos = 10;
        lista30.primeiro = 0;
        int int37 = lista30.ultimo;
        java.lang.Object[] objArray38 = lista30.item;
        lista22.item = objArray38;
        lista14.item = objArray38;
        lista0.item = objArray38;
        int int42 = lista0.ultimo;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test241");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        java.lang.Class<?> wildcardClass16 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test242");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 1;
        lista0.primeiro = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test243");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        // The following exception was thrown during execution in test generation
        try {
            lista10.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test244");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test245");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        ds.Lista lista5 = new ds.Lista();
        ds.Lista lista6 = new ds.Lista();
        java.lang.Object[] objArray10 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista6.item = objArray10;
        lista5.item = objArray10;
        lista5.pos = (-1);
        lista5.pos = (short) 100;
        lista0.insere((java.lang.Object) (short) 100);
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        int int20 = lista18.ultimo;
        lista18.primeiro = (short) 1;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        lista23.ultimo = (byte) 1;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        int int29 = lista27.primeiro;
        java.lang.Object[] objArray30 = lista27.item;
        lista23.item = objArray30;
        lista18.item = objArray30;
        lista18.pos = (short) -1;
        lista18.imprime();
        lista18.ultimo = 0;
        ds.Lista lista38 = new ds.Lista();
        int int39 = lista38.pos;
        int int40 = lista38.primeiro;
        java.lang.Object obj41 = null;
        lista38.insere(obj41);
        java.lang.Object[] objArray43 = lista38.item;
        lista18.item = objArray43;
        lista0.item = objArray43;
        ds.Lista lista46 = new ds.Lista();
        int int47 = lista46.pos;
        lista46.ultimo = '#';
        lista46.pos = (short) 10;
        ds.Lista lista52 = new ds.Lista();
        lista52.imprime();
        java.lang.Object[] objArray54 = lista52.item;
        lista46.insere((java.lang.Object) lista52);
        ds.Lista lista56 = new ds.Lista();
        int int57 = lista56.pos;
        lista56.ultimo = '#';
        lista52.insere((java.lang.Object) lista56);
        int int61 = lista56.pos;
        int int62 = lista56.primeiro;
        java.lang.Object[] objArray63 = lista56.item;
        lista0.item = objArray63;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(objArray63);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test246");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.pos = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test247");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        java.lang.Class<?> wildcardClass18 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test248");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        int int16 = lista0.primeiro;
        int int17 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test249");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        int int26 = lista7.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test250");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        lista6.primeiro = (byte) 0;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        int int23 = lista19.pos;
        int int24 = lista19.ultimo;
        int int25 = lista19.pos;
        lista6.insere((java.lang.Object) int25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test251");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        lista0.imprime();
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test252");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.primeiro = 35;
        lista6.primeiro = 36;
        int int22 = lista6.ultimo;
        int int23 = lista6.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test253");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test254");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        lista7.ultimo = '#';
        lista7.ultimo = 0;
        int int13 = lista7.ultimo;
        lista7.ultimo = 100;
        lista0.insere((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test255");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test256");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean26 = lista0.vazia();
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test257");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = (short) 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray33 = lista31.item;
        lista26.item = objArray33;
        int int35 = lista26.primeiro;
        boolean boolean36 = lista26.vazia();
        java.lang.Object[] objArray37 = lista26.item;
        lista7.item = objArray37;
        lista7.pos = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(objArray37);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test258");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        boolean boolean24 = lista15.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test259");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.item = objArray22;
        lista10.pos = (byte) 100;
        ds.Lista lista26 = new ds.Lista();
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista27.item = objArray31;
        lista26.item = objArray31;
        lista26.primeiro = ' ';
        lista26.primeiro = 2;
        java.lang.Object[] objArray38 = lista26.item;
        lista10.item = objArray38;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[-1, 10, 1]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test260");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test261");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        lista3.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test262");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        lista0.primeiro = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        lista0.item = objArray18;
        java.lang.Object[] objArray20 = lista0.item;
        int int21 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test263");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        lista0.primeiro = (-1);
        ds.Lista lista21 = new ds.Lista();
        int int22 = lista21.ultimo;
        java.lang.Object[] objArray23 = lista21.item;
        lista0.insere((java.lang.Object) objArray23);
        int int25 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test264");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test265");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 0;
        lista0.ultimo = (byte) 0;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test266");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        lista0.pos = (short) -1;
        lista0.ultimo = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test267");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        lista0.ultimo = 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test268");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        lista15.primeiro = '#';
        int int26 = lista15.primeiro;
        int int27 = lista15.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test269");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        lista0.ultimo = 2;
        lista0.primeiro = 97;
        lista0.ultimo = (byte) 100;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.ultimo = 100;
        int int20 = lista15.primeiro;
        int int21 = lista15.pos;
        int int22 = lista15.primeiro;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        lista23.ultimo = '#';
        lista23.ultimo = 0;
        lista23.ultimo = (short) 10;
        ds.Lista lista31 = new ds.Lista();
        int int32 = lista31.pos;
        int int33 = lista31.ultimo;
        lista31.pos = 10;
        lista31.primeiro = 0;
        int int38 = lista31.ultimo;
        java.lang.Object[] objArray39 = lista31.item;
        lista23.item = objArray39;
        lista15.item = objArray39;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        boolean boolean44 = lista42.vazia();
        lista42.pos = 0;
        boolean boolean47 = lista42.vazia();
        java.lang.Object[] objArray48 = lista42.item;
        lista15.item = objArray48;
        int int50 = lista15.primeiro;
        lista0.insere((java.lang.Object) lista15);
        int int52 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test270");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test271");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.primeiro = 2;
        lista0.ultimo = (short) -1;
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test272");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.primeiro;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.ultimo = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test273");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.ultimo = 97;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 10;
        lista0.insere((java.lang.Object) lista6);
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista12.insere((java.lang.Object) lista18);
        lista12.primeiro = (short) -1;
        lista12.ultimo = (short) 1;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test274");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.ultimo;
        java.lang.Object[] objArray15 = lista13.item;
        lista13.primeiro = (byte) 1;
        int int18 = lista13.primeiro;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        lista0.primeiro = 52;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test275");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.primeiro;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = (short) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista11.item = objArray18;
        lista0.item = objArray18;
        java.lang.Class<?> wildcardClass21 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test276");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        java.lang.Object obj14 = null;
        lista10.insere(obj14);
        int int16 = lista10.primeiro;
        boolean boolean17 = lista10.vazia();
        lista10.primeiro = ' ';
        lista0.insere((java.lang.Object) ' ');
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test277");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.ultimo = 97;
        lista0.primeiro = 36;
        boolean boolean17 = lista0.vazia();
        lista0.ultimo = 52;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test278");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.pos = (-1);
        int int10 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray12 = lista0.item;
        java.lang.Class<?> wildcardClass13 = objArray12.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test279");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test280");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        int int10 = lista0.ultimo;
        lista0.insere((java.lang.Object) 52);
        lista0.imprime();
        java.lang.Class<?> wildcardClass14 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test281");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        int int18 = lista6.pos;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        java.lang.Object[] objArray21 = lista19.item;
        lista6.item = objArray21;
        lista6.primeiro = 'a';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test282");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = 97;
        java.lang.Class<?> wildcardClass10 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test283");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.primeiro;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Class<?> wildcardClass12 = objArray11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test284");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        int int16 = lista0.primeiro;
        java.lang.Object[] objArray17 = lista0.item;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.ultimo;
        java.lang.Object[] objArray20 = lista18.item;
        lista18.primeiro = (byte) 1;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        lista23.ultimo = (byte) 1;
        ds.Lista lista27 = new ds.Lista();
        lista27.imprime();
        int int29 = lista27.primeiro;
        java.lang.Object[] objArray30 = lista27.item;
        lista23.item = objArray30;
        java.lang.Class<?> wildcardClass32 = lista23.getClass();
        lista18.insere((java.lang.Object) wildcardClass32);
        int int34 = lista18.primeiro;
        java.lang.Object[] objArray35 = lista18.item;
        lista0.item = objArray35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test285");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        lista10.ultimo = (byte) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test286");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        lista0.pos = '#';
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        java.lang.Object[] objArray11 = lista8.item;
        lista8.ultimo = 1;
        lista8.ultimo = 0;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        lista16.imprime();
        int int20 = lista16.ultimo;
        lista8.insere((java.lang.Object) lista16);
        lista0.insere((java.lang.Object) lista16);
        java.lang.Class<?> wildcardClass23 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test287");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.ultimo = 0;
        java.lang.Class<?> wildcardClass8 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test288");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.ultimo;
        lista0.ultimo = 100;
        java.lang.Object[] objArray9 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test289");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        lista0.imprime();
        int int11 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test290");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.ultimo = '#';
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        lista12.imprime();
        int int16 = lista12.pos;
        lista12.primeiro = (byte) -1;
        java.lang.Object[] objArray19 = lista12.item;
        lista12.pos = (short) 10;
        java.lang.Object[] objArray22 = lista12.item;
        lista12.pos = (short) 1;
        lista12.primeiro = 52;
        lista0.insere((java.lang.Object) 52);
        int int28 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 36 + "'", int28 == 36);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test291");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.imprime();
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = '#';
        lista5.pos = (short) 0;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        java.lang.Object[] objArray13 = lista11.item;
        lista5.item = objArray13;
        int int15 = lista5.ultimo;
        int int16 = lista5.primeiro;
        java.lang.Object[] objArray17 = lista5.item;
        int int18 = lista5.primeiro;
        lista0.insere((java.lang.Object) int18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test292");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista4.primeiro = (short) 100;
        lista4.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista12.insere((java.lang.Object) lista18);
        lista12.primeiro = (short) -1;
        lista12.ultimo = (short) 1;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        lista26.ultimo = '#';
        lista26.pos = (short) 10;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        java.lang.Object[] objArray34 = lista32.item;
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        lista36.ultimo = '#';
        lista32.insere((java.lang.Object) lista36);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        lista41.imprime();
        int int45 = lista41.pos;
        lista41.primeiro = (byte) -1;
        java.lang.Object[] objArray48 = lista41.item;
        lista36.item = objArray48;
        lista12.insere((java.lang.Object) lista36);
        lista4.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista4);
        java.lang.Class<?> wildcardClass53 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test293");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = null;
        lista10.item = objArray15;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        lista18.pos = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        lista28.ultimo = '#';
        lista24.insere((java.lang.Object) lista28);
        lista24.pos = 0;
        lista24.pos = (short) 10;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = (-1);
        lista24.insere((java.lang.Object) lista37);
        lista24.pos = 36;
        lista0.insere((java.lang.Object) 36);
        int int44 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test294");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test295");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray9 = lista7.item;
        lista7.imprime();
        boolean boolean11 = lista7.vazia();
        java.lang.Object[] objArray12 = lista7.item;
        java.lang.Object[] objArray13 = lista7.item;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test296");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test297");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.ultimo;
        java.lang.Object[] objArray15 = lista13.item;
        lista13.primeiro = (byte) 1;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = (byte) 1;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        int int24 = lista22.primeiro;
        java.lang.Object[] objArray25 = lista22.item;
        lista18.item = objArray25;
        java.lang.Class<?> wildcardClass27 = lista18.getClass();
        lista13.insere((java.lang.Object) wildcardClass27);
        int int29 = lista13.ultimo;
        lista0.insere((java.lang.Object) lista13);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test298");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        lista0.pos = 'a';
        ds.Lista lista15 = new ds.Lista();
        ds.Lista lista16 = new ds.Lista();
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista16.item = objArray20;
        lista15.item = objArray20;
        lista15.pos = (-1);
        java.lang.Object[] objArray25 = lista15.item;
        lista0.item = objArray25;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[-1, 10, 1]");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test299");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        int int6 = lista3.ultimo;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = lista12.item;
        lista7.item = objArray14;
        lista3.item = objArray14;
        lista0.item = objArray14;
        int int18 = lista0.primeiro;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test300");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray9 = lista7.item;
        int int10 = lista7.ultimo;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = (short) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista11.item = objArray18;
        lista7.item = objArray18;
        lista0.item = objArray18;
        lista0.pos = '#';
        boolean boolean24 = lista0.vazia();
        lista0.pos = 'a';
        ds.Lista lista27 = new ds.Lista();
        java.lang.Object[] objArray31 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista27.item = objArray31;
        ds.Lista lista33 = new ds.Lista();
        int int34 = lista33.pos;
        int int35 = lista33.ultimo;
        lista33.primeiro = (short) 1;
        ds.Lista lista38 = new ds.Lista();
        lista38.imprime();
        java.lang.Object[] objArray40 = lista38.item;
        lista33.item = objArray40;
        lista27.item = objArray40;
        java.lang.Object[] objArray43 = lista27.item;
        lista0.item = objArray43;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test301");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        boolean boolean9 = lista0.vazia();
        lista0.primeiro = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test302");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.pos;
        lista7.primeiro = (byte) -1;
        java.lang.Object[] objArray14 = lista7.item;
        java.lang.Object[] objArray15 = lista7.item;
        lista0.item = objArray15;
        boolean boolean17 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test303");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        lista8.imprime();
        int int12 = lista8.ultimo;
        lista0.insere((java.lang.Object) lista8);
        int int14 = lista8.pos;
        java.lang.Class<?> wildcardClass15 = lista8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test304");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.primeiro;
        lista0.insere((java.lang.Object) lista20);
        lista20.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test305");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        boolean boolean5 = lista0.vazia();
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = '#';
        java.lang.Object obj10 = null;
        lista6.insere(obj10);
        int int12 = lista6.primeiro;
        java.lang.Object[] objArray13 = lista6.item;
        java.lang.Object[] objArray14 = lista6.item;
        lista0.insere((java.lang.Object) objArray14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray14);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test306");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.ultimo = 97;
        java.lang.Object[] objArray15 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 10, 1]");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test307");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test308");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        boolean boolean7 = lista0.vazia();
        lista0.imprime();
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test309");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.pos = 10;
        int int16 = lista11.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        int int19 = lista17.primeiro;
        java.lang.Object[] objArray20 = lista17.item;
        lista17.ultimo = 1;
        ds.Lista lista23 = new ds.Lista();
        lista17.insere((java.lang.Object) lista23);
        java.lang.Object[] objArray25 = lista17.item;
        int int26 = lista17.primeiro;
        int int27 = lista17.pos;
        ds.Lista lista28 = new ds.Lista();
        lista28.imprime();
        int int30 = lista28.primeiro;
        lista28.imprime();
        int int32 = lista28.pos;
        lista28.primeiro = (byte) -1;
        java.lang.Object[] objArray35 = lista28.item;
        lista17.item = objArray35;
        lista11.insere((java.lang.Object) objArray35);
        lista0.item = objArray35;
        java.lang.Class<?> wildcardClass39 = objArray35.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test310");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        lista0.primeiro = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test311");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.pos = ' ';
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test312");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.ultimo = ' ';
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test313");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test314");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        lista0.pos = (short) 1;
        lista0.primeiro = 52;
        boolean boolean15 = lista0.vazia();
        ds.Lista lista16 = new ds.Lista();
        lista16.pos = (-1);
        lista16.imprime();
        int int20 = lista16.ultimo;
        boolean boolean21 = lista16.vazia();
        java.lang.Object[] objArray22 = lista16.item;
        lista0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test315");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        java.lang.Object[] objArray8 = lista0.item;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        lista9.ultimo = 100;
        int int14 = lista9.primeiro;
        int int15 = lista9.pos;
        java.lang.Class<?> wildcardClass16 = lista9.getClass();
        lista0.insere((java.lang.Object) lista9);
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        lista18.pos = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista18.insere((java.lang.Object) lista24);
        int int28 = lista18.primeiro;
        int int29 = lista18.ultimo;
        lista0.insere((java.lang.Object) int29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36 + "'", int29 == 36);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test316");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        java.lang.Object[] objArray9 = lista6.item;
        lista6.ultimo = 1;
        ds.Lista lista12 = new ds.Lista();
        lista6.insere((java.lang.Object) lista12);
        java.lang.Object[] objArray14 = lista6.item;
        int int15 = lista6.primeiro;
        int int16 = lista6.pos;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        int int19 = lista17.primeiro;
        lista17.imprime();
        int int21 = lista17.pos;
        lista17.primeiro = (byte) -1;
        java.lang.Object[] objArray24 = lista17.item;
        lista6.item = objArray24;
        lista0.insere((java.lang.Object) objArray24);
        int int27 = lista0.pos;
        int int28 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test317");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        int int4 = lista3.pos;
        int int5 = lista3.primeiro;
        java.lang.Object obj6 = null;
        lista3.insere(obj6);
        ds.Lista lista8 = new ds.Lista();
        ds.Lista lista9 = new ds.Lista();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista9.item = objArray13;
        lista8.item = objArray13;
        lista8.pos = (-1);
        java.lang.Object[] objArray18 = lista8.item;
        lista3.item = objArray18;
        lista0.insere((java.lang.Object) lista3);
        boolean boolean21 = lista0.vazia();
        int int22 = lista0.pos;
        lista0.ultimo = 52;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test318");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        java.lang.Class<?> wildcardClass14 = lista5.getClass();
        lista0.insere((java.lang.Object) wildcardClass14);
        int int16 = lista0.primeiro;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        int int19 = lista17.primeiro;
        int int20 = lista17.primeiro;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        lista21.primeiro = 10;
        lista17.insere((java.lang.Object) lista21);
        boolean boolean27 = lista17.vazia();
        boolean boolean28 = lista17.vazia();
        int int29 = lista17.primeiro;
        java.lang.Class<?> wildcardClass30 = lista17.getClass();
        lista0.insere((java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test319");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        lista0.ultimo = 101;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test320");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        int int13 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test321");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.pos = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test322");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        lista0.pos = (short) -1;
        lista0.imprime();
        lista0.ultimo = 0;
        ds.Lista lista20 = new ds.Lista();
        int int21 = lista20.pos;
        int int22 = lista20.primeiro;
        java.lang.Object obj23 = null;
        lista20.insere(obj23);
        java.lang.Object[] objArray25 = lista20.item;
        lista0.item = objArray25;
        ds.Lista lista27 = new ds.Lista();
        int int28 = lista27.pos;
        int int29 = lista27.primeiro;
        java.lang.Object obj30 = null;
        lista27.insere(obj30);
        ds.Lista lista32 = new ds.Lista();
        ds.Lista lista33 = new ds.Lista();
        java.lang.Object[] objArray37 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista33.item = objArray37;
        lista32.item = objArray37;
        lista32.pos = (-1);
        java.lang.Object[] objArray42 = lista32.item;
        lista27.item = objArray42;
        lista0.item = objArray42;
        int int45 = lista0.pos;
        java.lang.Class<?> wildcardClass46 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test323");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        lista0.ultimo = 2;
        lista0.primeiro = 97;
        lista0.primeiro = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test324");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        int int8 = lista0.pos;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test325");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        int int6 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test326");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista5.item = objArray9;
        lista0.item = objArray9;
        boolean boolean12 = lista0.vazia();
        lista0.ultimo = 98;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test327");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        boolean boolean4 = lista0.vazia();
        lista0.primeiro = (byte) 1;
        int int7 = lista0.primeiro;
        int int8 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test328");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista8.primeiro = (byte) 1;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        lista13.ultimo = (byte) 1;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        int int19 = lista17.primeiro;
        java.lang.Object[] objArray20 = lista17.item;
        lista13.item = objArray20;
        java.lang.Class<?> wildcardClass22 = lista13.getClass();
        lista8.insere((java.lang.Object) wildcardClass22);
        int int24 = lista8.ultimo;
        lista8.pos = 100;
        lista0.insere((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test329");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        lista0.primeiro = 100;
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        lista0.item = objArray18;
        lista0.ultimo = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test330");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        lista11.ultimo = (byte) 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        java.lang.Object[] objArray18 = lista15.item;
        lista11.item = objArray18;
        lista6.item = objArray18;
        int int21 = lista6.ultimo;
        int int22 = lista6.pos;
        lista0.insere((java.lang.Object) lista6);
        int int24 = lista6.ultimo;
        lista6.ultimo = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test331");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = null;
        lista10.item = objArray15;
        lista0.insere((java.lang.Object) lista10);
        int int18 = lista10.pos;
        lista10.primeiro = '#';
        lista10.pos = 97;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test332");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        lista0.pos = (byte) 100;
        int int9 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test333");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        boolean boolean5 = lista0.vazia();
        java.lang.Object[] objArray6 = lista0.item;
        java.lang.Class<?> wildcardClass7 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test334");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        lista0.pos = 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test335");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = (byte) 10;
        boolean boolean7 = lista0.vazia();
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test336");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 2;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        lista18.pos = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        lista28.ultimo = '#';
        lista24.insere((java.lang.Object) lista28);
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        lista33.imprime();
        int int37 = lista33.pos;
        lista33.primeiro = (byte) -1;
        java.lang.Object[] objArray40 = lista33.item;
        lista28.item = objArray40;
        ds.Lista lista42 = new ds.Lista();
        int int43 = lista42.pos;
        lista42.ultimo = '#';
        lista42.pos = (short) 0;
        ds.Lista lista48 = new ds.Lista();
        int int49 = lista48.pos;
        java.lang.Object[] objArray50 = lista48.item;
        lista42.item = objArray50;
        java.lang.Object[] objArray52 = lista42.item;
        lista28.item = objArray52;
        lista0.item = objArray52;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test337");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = null;
        lista10.item = objArray15;
        lista0.insere((java.lang.Object) lista10);
        int int18 = lista10.pos;
        lista10.primeiro = '#';
        boolean boolean21 = lista10.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test338");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        lista6.ultimo = ' ';
        lista6.ultimo = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test339");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        lista6.item = objArray13;
        lista0.item = objArray13;
        java.lang.Object[] objArray16 = lista0.item;
        lista0.primeiro = 0;
        int int19 = lista0.primeiro;
        java.lang.Class<?> wildcardClass20 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test340");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = '#';
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test341");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        lista0.imprime();
        lista0.pos = 0;
        boolean boolean11 = lista0.vazia();
        boolean boolean12 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test342");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        int int8 = lista0.pos;
        lista0.ultimo = 2;
        int int11 = lista0.primeiro;
        lista0.primeiro = 52;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test343");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        java.lang.Object[] objArray11 = lista0.item;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test344");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        int int8 = lista0.pos;
        java.lang.Object[] objArray9 = lista0.item;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test345");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = (short) 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        lista29.ultimo = (byte) 1;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        java.lang.Object[] objArray36 = lista33.item;
        lista29.item = objArray36;
        lista24.item = objArray36;
        lista15.item = objArray36;
        java.lang.Class<?> wildcardClass40 = objArray36.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test346");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        boolean boolean5 = lista0.vazia();
        int int6 = lista0.ultimo;
        java.lang.Object[] objArray7 = null;
        lista0.item = objArray7;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test347");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test348");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        boolean boolean5 = lista0.vazia();
        lista0.imprime();
        lista0.ultimo = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test349");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        boolean boolean5 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test350");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = null;
        lista10.item = objArray15;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Object[] objArray18 = lista0.item;
        lista0.ultimo = ' ';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test351");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.ultimo;
        java.lang.Object[] objArray15 = lista13.item;
        lista13.primeiro = (byte) 1;
        int int18 = lista13.primeiro;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        lista0.primeiro = 52;
        java.lang.Object[] objArray23 = null;
        lista0.item = objArray23;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test352");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        lista0.pos = '4';
        boolean boolean10 = lista0.vazia();
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = (short) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista11.item = objArray18;
        java.lang.Object[] objArray20 = lista11.item;
        lista0.item = objArray20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test353");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test354");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        lista0.primeiro = (byte) 0;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test355");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test356");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista0.item = objArray18;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        boolean boolean22 = lista20.vazia();
        int int23 = lista20.primeiro;
        lista0.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray25 = lista20.item;
        int int26 = lista20.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test357");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.ultimo = 35;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test358");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.pos = 10;
        lista7.ultimo = (byte) 100;
        int int14 = lista7.ultimo;
        java.lang.Object[] objArray15 = lista7.item;
        lista0.item = objArray15;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray17);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test359");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        int int12 = lista0.primeiro;
        lista0.pos = 'a';
        java.lang.Object[] objArray15 = lista0.item;
        boolean boolean16 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test360");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test361");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        lista0.ultimo = 35;
        lista0.pos = 0;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 10;
        java.lang.Object[] objArray13 = lista9.item;
        lista0.insere((java.lang.Object) objArray13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test362");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.ultimo;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test363");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test364");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 37;
        boolean boolean14 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test365");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.ultimo;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test366");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        lista8.imprime();
        int int12 = lista8.ultimo;
        lista0.insere((java.lang.Object) lista8);
        int int14 = lista8.pos;
        lista8.pos = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test367");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        lista0.ultimo = (byte) 0;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test368");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        int int6 = lista0.pos;
        int int7 = lista0.pos;
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test369");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        lista0.pos = 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test370");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        int int2 = lista0.primeiro;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        java.lang.Object[] objArray5 = lista3.item;
        int int6 = lista3.pos;
        lista3.ultimo = 97;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = 10;
        lista3.insere((java.lang.Object) lista9);
        int int14 = lista9.ultimo;
        lista0.insere((java.lang.Object) int14);
        java.lang.Object[] objArray16 = lista0.item;
        ds.Lista lista17 = new ds.Lista();
        lista17.imprime();
        java.lang.Object[] objArray19 = lista17.item;
        int int20 = lista17.pos;
        lista17.pos = 100;
        lista17.imprime();
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.pos = 10;
        lista24.ultimo = (byte) 100;
        int int31 = lista24.ultimo;
        java.lang.Object[] objArray32 = lista24.item;
        lista17.item = objArray32;
        lista0.item = objArray32;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test371");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        java.lang.Object[] objArray6 = lista0.item;
        int int7 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test372");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        boolean boolean4 = lista0.vazia();
        java.lang.Class<?> wildcardClass5 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test373");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.primeiro = (short) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        lista7.item = objArray19;
        lista7.pos = (short) -1;
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        int int26 = lista7.primeiro;
        java.lang.Class<?> wildcardClass27 = lista7.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test374");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.ultimo = '4';
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test375");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        lista0.primeiro = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test376");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = '#';
        lista0.imprime();
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test377");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        int int5 = lista0.ultimo;
        lista0.imprime();
        java.lang.Object obj7 = null;
        lista0.insere(obj7);
        lista0.ultimo = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test378");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        ds.Lista lista3 = new ds.Lista();
        lista3.imprime();
        int int5 = lista3.primeiro;
        lista3.primeiro = 10;
        lista3.imprime();
        lista3.imprime();
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        int int12 = lista10.ultimo;
        lista10.primeiro = (short) 1;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = (byte) 1;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        int int21 = lista19.primeiro;
        java.lang.Object[] objArray22 = lista19.item;
        lista15.item = objArray22;
        lista10.item = objArray22;
        lista10.pos = (short) -1;
        lista10.imprime();
        lista3.insere((java.lang.Object) lista10);
        int int29 = lista10.primeiro;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Class<?> wildcardClass31 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test379");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test380");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        lista0.pos = (byte) 1;
        org.junit.Assert.assertNotNull(objArray2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test381");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        java.lang.Object[] objArray10 = lista8.item;
        int int11 = lista8.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        java.lang.Object obj16 = null;
        lista12.insere(obj16);
        int int18 = lista12.primeiro;
        boolean boolean19 = lista12.vazia();
        java.lang.Object[] objArray20 = lista12.item;
        lista8.item = objArray20;
        lista6.item = objArray20;
        lista6.ultimo = 'a';
        java.lang.Object[] objArray25 = lista6.item;
        int int26 = lista6.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test382");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test383");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        lista0.primeiro = (byte) 1;
        lista0.ultimo = 0;
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.ultimo;
        java.lang.Object[] objArray11 = lista9.item;
        lista9.primeiro = (byte) 1;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = (byte) 1;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        java.lang.Object[] objArray21 = lista18.item;
        lista14.item = objArray21;
        java.lang.Class<?> wildcardClass23 = lista14.getClass();
        lista9.insere((java.lang.Object) wildcardClass23);
        int int25 = lista9.primeiro;
        java.lang.Object[] objArray26 = lista9.item;
        lista0.item = objArray26;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test384");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        int int7 = lista0.ultimo;
        lista0.pos = '4';
        lista0.ultimo = 0;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 0;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        java.lang.Object[] objArray20 = lista18.item;
        lista12.item = objArray20;
        java.lang.Object[] objArray22 = lista12.item;
        lista0.item = objArray22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test385");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 0;
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        java.lang.Object[] objArray20 = lista18.item;
        lista12.item = objArray20;
        lista0.item = objArray20;
        java.lang.Object[] objArray23 = lista0.item;
        java.lang.Class<?> wildcardClass24 = objArray23.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test386");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test387");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.ultimo = 97;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = 10;
        lista0.insere((java.lang.Object) lista6);
        lista0.ultimo = 1;
        int int13 = lista0.ultimo;
        lista0.ultimo = 2;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test388");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        lista6.pos = 36;
        int int25 = lista6.ultimo;
        int int26 = lista6.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 36 + "'", int26 == 36);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test389");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        java.lang.Object[] objArray11 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(objArray11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test390");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        lista0.insere((java.lang.Object) (-1.0d));
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = (short) 1;
        lista14.ultimo = '4';
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        java.lang.Object[] objArray23 = lista21.item;
        int int24 = lista21.ultimo;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.ultimo;
        lista25.primeiro = (short) 1;
        ds.Lista lista30 = new ds.Lista();
        lista30.imprime();
        java.lang.Object[] objArray32 = lista30.item;
        lista25.item = objArray32;
        lista21.item = objArray32;
        lista14.item = objArray32;
        lista0.item = objArray32;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test391");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.pos;
        lista13.ultimo = '#';
        lista13.pos = (short) 10;
        int int19 = lista13.pos;
        lista13.primeiro = 0;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.ultimo;
        java.lang.Object[] objArray24 = lista22.item;
        java.lang.Object[] objArray25 = lista22.item;
        lista13.item = objArray25;
        lista0.item = objArray25;
        int int28 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test392");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        ds.Lista lista11 = new ds.Lista();
        java.lang.Object[] objArray15 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista11.item = objArray15;
        lista10.item = objArray15;
        lista10.primeiro = ' ';
        lista10.primeiro = 2;
        java.lang.Object[] objArray22 = lista10.item;
        lista6.item = objArray22;
        java.lang.Object[] objArray24 = lista6.item;
        java.lang.Class<?> wildcardClass25 = objArray24.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test393");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        lista0.insere((java.lang.Object) 0.0d);
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test394");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.ultimo = 1;
        int int20 = lista6.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test395");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        int int11 = lista0.ultimo;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.pos = 10;
        lista12.ultimo = (byte) 100;
        int int19 = lista12.pos;
        ds.Lista lista20 = new ds.Lista();
        java.lang.Object[] objArray24 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista20.item = objArray24;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = (short) 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray33 = lista31.item;
        lista26.item = objArray33;
        lista20.item = objArray33;
        lista12.item = objArray33;
        lista0.item = objArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test396");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.primeiro;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test397");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        int int18 = lista6.pos;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        lista19.ultimo = '#';
        java.lang.Object obj23 = null;
        lista19.insere(obj23);
        int int25 = lista19.primeiro;
        boolean boolean26 = lista19.vazia();
        java.lang.Object[] objArray27 = lista19.item;
        java.lang.Object[] objArray28 = lista19.item;
        lista6.item = objArray28;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test398");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        int int7 = lista5.primeiro;
        java.lang.Object[] objArray8 = lista5.item;
        lista5.ultimo = 1;
        ds.Lista lista11 = new ds.Lista();
        lista5.insere((java.lang.Object) lista11);
        java.lang.Object[] objArray13 = lista5.item;
        int int14 = lista5.primeiro;
        int int15 = lista5.pos;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        lista16.imprime();
        int int20 = lista16.pos;
        lista16.primeiro = (byte) -1;
        java.lang.Object[] objArray23 = lista16.item;
        lista5.item = objArray23;
        lista0.item = objArray23;
        boolean boolean26 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test399");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.pos = 1;
        lista0.imprime();
        lista0.pos = 52;
        lista0.pos = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test400");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        int int10 = lista8.ultimo;
        lista8.pos = 10;
        lista8.primeiro = 0;
        int int15 = lista8.ultimo;
        java.lang.Object[] objArray16 = lista8.item;
        lista0.item = objArray16;
        java.lang.Object[] objArray18 = lista0.item;
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test401");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        java.lang.Object[] objArray4 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test402");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        boolean boolean10 = lista0.vazia();
        java.lang.Object[] objArray11 = lista0.item;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.primeiro;
        java.lang.Object obj15 = null;
        lista12.insere(obj15);
        java.lang.Object[] objArray17 = lista12.item;
        lista0.item = objArray17;
        ds.Lista lista19 = new ds.Lista();
        int int20 = lista19.pos;
        int int21 = lista19.ultimo;
        ds.Lista lista22 = new ds.Lista();
        lista22.imprime();
        java.lang.Object[] objArray24 = lista22.item;
        int int25 = lista22.ultimo;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        int int28 = lista26.ultimo;
        lista26.primeiro = (short) 1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        java.lang.Object[] objArray33 = lista31.item;
        lista26.item = objArray33;
        lista22.item = objArray33;
        lista19.item = objArray33;
        lista0.item = objArray33;
        lista0.ultimo = 2;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test403");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = null;
        lista0.item = objArray2;
        lista0.ultimo = 'a';
        boolean boolean6 = lista0.vazia();
        lista0.primeiro = 'a';
        ds.Lista lista9 = new ds.Lista();
        int int10 = lista9.pos;
        lista9.ultimo = '#';
        lista9.pos = (short) 10;
        int int15 = lista9.pos;
        lista9.primeiro = 0;
        lista9.ultimo = '#';
        int int20 = lista9.ultimo;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        lista21.imprime();
        int int25 = lista21.pos;
        lista21.primeiro = (byte) -1;
        java.lang.Object[] objArray28 = lista21.item;
        lista21.pos = (short) 10;
        java.lang.Object[] objArray31 = lista21.item;
        lista21.pos = (short) 1;
        lista21.primeiro = 52;
        lista9.insere((java.lang.Object) 52);
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test404");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Object obj4 = null;
        lista0.insere(obj4);
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test405");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.primeiro = 0;
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        int int9 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test406");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Class<?> wildcardClass3 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test407");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        int int26 = lista24.ultimo;
        lista24.primeiro = (short) 1;
        ds.Lista lista29 = new ds.Lista();
        int int30 = lista29.pos;
        lista29.ultimo = (byte) 1;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        int int35 = lista33.primeiro;
        java.lang.Object[] objArray36 = lista33.item;
        lista29.item = objArray36;
        lista24.item = objArray36;
        lista15.item = objArray36;
        java.lang.Class<?> wildcardClass40 = lista15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test408");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.ultimo = 0;
        ds.Lista lista8 = new ds.Lista();
        lista8.imprime();
        int int10 = lista8.primeiro;
        lista8.imprime();
        int int12 = lista8.ultimo;
        lista0.insere((java.lang.Object) lista8);
        lista0.ultimo = '#';
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.ultimo;
        java.lang.Object[] objArray18 = lista16.item;
        lista16.primeiro = (byte) 1;
        java.lang.Object[] objArray21 = lista16.item;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        int int24 = lista22.ultimo;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.ultimo;
        java.lang.Object[] objArray27 = lista25.item;
        lista22.item = objArray27;
        lista16.item = objArray27;
        lista0.item = objArray27;
        lista0.pos = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test409");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.ultimo = 0;
        lista8.ultimo = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.pos = 10;
        lista16.primeiro = 0;
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        int int27 = lista0.primeiro;
        int int28 = lista0.ultimo;
        lista0.primeiro = (short) -1;
        ds.Lista lista31 = new ds.Lista();
        lista31.imprime();
        int int33 = lista31.primeiro;
        lista31.ultimo = 100;
        java.lang.Object[] objArray36 = lista31.item;
        lista0.insere((java.lang.Object) lista31);
        int int38 = lista31.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test410");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.pos = 'a';
        lista0.insere((java.lang.Object) 10L);
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test411");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test412");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        int int14 = lista10.pos;
        java.lang.Object[] objArray15 = null;
        lista10.item = objArray15;
        lista0.insere((java.lang.Object) lista10);
        ds.Lista lista18 = new ds.Lista();
        int int19 = lista18.pos;
        lista18.ultimo = '#';
        lista18.pos = (short) 10;
        ds.Lista lista24 = new ds.Lista();
        lista24.imprime();
        java.lang.Object[] objArray26 = lista24.item;
        lista18.insere((java.lang.Object) lista24);
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        lista28.ultimo = '#';
        lista24.insere((java.lang.Object) lista28);
        lista24.pos = 0;
        lista24.pos = (short) 10;
        ds.Lista lista37 = new ds.Lista();
        lista37.pos = (-1);
        lista24.insere((java.lang.Object) lista37);
        lista24.pos = 36;
        lista0.insere((java.lang.Object) 36);
        java.lang.Class<?> wildcardClass44 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test413");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        int int5 = lista0.primeiro;
        lista0.ultimo = (short) -1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test414");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        lista15.ultimo = '#';
        java.lang.Object obj19 = null;
        lista15.insere(obj19);
        int int21 = lista15.primeiro;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.insere((java.lang.Object) lista15);
        int int24 = lista10.ultimo;
        int int25 = lista10.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36 + "'", int25 == 36);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test415");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        int int4 = lista0.ultimo;
        lista0.imprime();
        int int6 = lista0.primeiro;
        lista0.ultimo = (-1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test416");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        int int10 = lista7.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.primeiro = 10;
        lista7.insere((java.lang.Object) lista11);
        int int17 = lista7.pos;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        java.lang.Object[] objArray21 = lista18.item;
        lista18.ultimo = 1;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        java.lang.Object[] objArray26 = lista18.item;
        int int27 = lista18.primeiro;
        lista7.insere((java.lang.Object) int27);
        lista0.insere((java.lang.Object) int27);
        int int30 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test417");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        lista0.pos = '#';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test418");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.primeiro = 35;
        int int20 = lista6.ultimo;
        lista6.pos = 1;
        lista6.ultimo = '#';
        lista6.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test419");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        java.lang.Object[] objArray7 = lista0.item;
        lista0.pos = (short) 10;
        java.lang.Object[] objArray10 = lista0.item;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.primeiro = 36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test420");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        java.lang.Object[] objArray6 = lista0.item;
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.ultimo;
        java.lang.Object[] objArray9 = lista7.item;
        lista7.primeiro = (byte) 1;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = (byte) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        int int18 = lista16.primeiro;
        java.lang.Object[] objArray19 = lista16.item;
        lista12.item = objArray19;
        java.lang.Class<?> wildcardClass21 = lista12.getClass();
        lista7.insere((java.lang.Object) wildcardClass21);
        lista7.imprime();
        lista0.insere((java.lang.Object) lista7);
        boolean boolean25 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test421");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        int int5 = lista0.ultimo;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.pos;
        java.lang.Object[] objArray9 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(objArray9);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test422");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        int int7 = lista0.ultimo;
        int int8 = lista0.ultimo;
        lista0.ultimo = 101;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test423");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        lista0.pos = (short) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test424");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.pos;
        java.lang.Object[] objArray3 = lista0.item;
        int int4 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test425");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.primeiro = 10;
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        java.lang.Object[] objArray9 = lista7.item;
        lista7.imprime();
        boolean boolean11 = lista7.vazia();
        java.lang.Object[] objArray12 = lista7.item;
        java.lang.Object[] objArray13 = lista7.item;
        lista0.item = objArray13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test426");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        int int4 = lista0.pos;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        int int7 = lista5.primeiro;
        lista5.ultimo = 100;
        int int10 = lista5.primeiro;
        int int11 = lista5.primeiro;
        lista0.insere((java.lang.Object) lista5);
        ds.Lista lista13 = new ds.Lista();
        lista13.imprime();
        int int15 = lista13.pos;
        java.lang.Object[] objArray16 = lista13.item;
        java.lang.Object[] objArray17 = lista13.item;
        int int18 = lista13.ultimo;
        int int19 = lista13.ultimo;
        java.lang.Object[] objArray20 = lista13.item;
        lista0.item = objArray20;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test427");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista4.primeiro = (short) 100;
        lista4.primeiro = ' ';
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        lista12.ultimo = '#';
        lista12.pos = (short) 10;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        java.lang.Object[] objArray20 = lista18.item;
        lista12.insere((java.lang.Object) lista18);
        lista12.primeiro = (short) -1;
        lista12.ultimo = (short) 1;
        ds.Lista lista26 = new ds.Lista();
        int int27 = lista26.pos;
        lista26.ultimo = '#';
        lista26.pos = (short) 10;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        java.lang.Object[] objArray34 = lista32.item;
        lista26.insere((java.lang.Object) lista32);
        ds.Lista lista36 = new ds.Lista();
        int int37 = lista36.pos;
        lista36.ultimo = '#';
        lista32.insere((java.lang.Object) lista36);
        ds.Lista lista41 = new ds.Lista();
        lista41.imprime();
        int int43 = lista41.primeiro;
        lista41.imprime();
        int int45 = lista41.pos;
        lista41.primeiro = (byte) -1;
        java.lang.Object[] objArray48 = lista41.item;
        lista36.item = objArray48;
        lista12.insere((java.lang.Object) lista36);
        lista4.insere((java.lang.Object) lista36);
        lista0.insere((java.lang.Object) lista4);
        boolean boolean53 = lista4.vazia();
        ds.Lista lista54 = new ds.Lista();
        int int55 = lista54.pos;
        int int56 = lista54.ultimo;
        lista54.ultimo = 10;
        ds.Lista lista59 = new ds.Lista();
        lista59.imprime();
        java.lang.Object[] objArray61 = lista59.item;
        lista59.imprime();
        boolean boolean63 = lista59.vazia();
        java.lang.Object[] objArray64 = lista59.item;
        lista54.item = objArray64;
        lista4.item = objArray64;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test428");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.ultimo = 35;
        int int10 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test429");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.primeiro = (short) 100;
        lista0.primeiro = ' ';
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test430");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        boolean boolean8 = lista0.vazia();
        ds.Lista lista9 = new ds.Lista();
        lista9.pos = (-1);
        int int12 = lista9.primeiro;
        int int13 = lista9.pos;
        int int14 = lista9.pos;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        boolean boolean17 = lista15.vazia();
        lista15.pos = 0;
        boolean boolean20 = lista15.vazia();
        lista9.insere((java.lang.Object) boolean20);
        lista0.insere((java.lang.Object) lista9);
        int int23 = lista0.primeiro;
        java.lang.Class<?> wildcardClass24 = lista0.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test431");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        lista0.primeiro = (byte) 1;
        boolean boolean8 = lista0.vazia();
        int int9 = lista0.ultimo;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test432");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.ultimo;
        int int5 = lista0.primeiro;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        lista6.ultimo = '#';
        lista6.pos = (short) 10;
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        java.lang.Object[] objArray14 = lista12.item;
        lista6.insere((java.lang.Object) lista12);
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        lista16.ultimo = '#';
        lista12.insere((java.lang.Object) lista16);
        lista12.pos = 'a';
        int int23 = lista12.pos;
        lista12.primeiro = 35;
        int int26 = lista12.ultimo;
        lista12.pos = 1;
        int int29 = lista12.primeiro;
        lista0.insere((java.lang.Object) lista12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test433");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 98;
        java.lang.Object[] objArray4 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray4);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test434");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        java.lang.Object[] objArray13 = lista11.item;
        int int14 = lista11.ultimo;
        ds.Lista lista15 = new ds.Lista();
        int int16 = lista15.pos;
        int int17 = lista15.ultimo;
        lista15.primeiro = (short) 1;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista15.item = objArray22;
        lista11.item = objArray22;
        lista0.item = objArray22;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray22);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test435");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.pos;
        lista0.imprime();
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.pos = (short) 0;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        java.lang.Object[] objArray12 = lista10.item;
        lista4.item = objArray12;
        int int14 = lista4.ultimo;
        java.lang.Object[] objArray15 = lista4.item;
        lista0.item = objArray15;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test436");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        int int5 = lista0.primeiro;
        int int6 = lista0.pos;
        int int7 = lista0.primeiro;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.pos;
        lista8.ultimo = '#';
        lista8.ultimo = 0;
        lista8.ultimo = (short) 10;
        ds.Lista lista16 = new ds.Lista();
        int int17 = lista16.pos;
        int int18 = lista16.ultimo;
        lista16.pos = 10;
        lista16.primeiro = 0;
        int int23 = lista16.ultimo;
        java.lang.Object[] objArray24 = lista16.item;
        lista8.item = objArray24;
        lista0.item = objArray24;
        java.lang.Object[] objArray27 = lista0.item;
        int int28 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test437");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 0;
        lista6.pos = (short) 10;
        ds.Lista lista19 = new ds.Lista();
        lista19.pos = (-1);
        lista6.insere((java.lang.Object) lista19);
        lista6.pos = 36;
        int int25 = lista6.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 36 + "'", int25 == 36);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test438");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.imprime();
        int int5 = lista0.primeiro;
        lista0.primeiro = 36;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test439");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        int int6 = lista0.ultimo;
        int int7 = lista0.pos;
        lista0.primeiro = (byte) 100;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test440");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        int int15 = lista0.ultimo;
        lista0.primeiro = 100;
        int int18 = lista0.ultimo;
        int int19 = lista0.primeiro;
        lista0.primeiro = 97;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test441");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.pos = '#';
        lista0.primeiro = (short) 10;
        int int7 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test442");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista5.item = objArray9;
        lista0.item = objArray9;
        lista0.imprime();
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1, 10, 1]");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test443");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        java.lang.Object[] objArray3 = lista0.item;
        lista0.ultimo = 1;
        ds.Lista lista6 = new ds.Lista();
        lista0.insere((java.lang.Object) lista6);
        java.lang.Object[] objArray8 = lista0.item;
        int int9 = lista0.primeiro;
        int int10 = lista0.pos;
        lista0.primeiro = 0;
        int int13 = lista0.primeiro;
        int int14 = lista0.pos;
        lista0.pos = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test444");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        lista0.pos = (byte) 1;
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.ultimo;
        lista0.pos = 98;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test445");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        int int3 = lista0.ultimo;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        int int13 = lista11.ultimo;
        lista11.primeiro = (short) 1;
        ds.Lista lista16 = new ds.Lista();
        lista16.imprime();
        java.lang.Object[] objArray18 = lista16.item;
        lista11.item = objArray18;
        int int20 = lista11.primeiro;
        boolean boolean21 = lista11.vazia();
        java.lang.Object[] objArray22 = lista11.item;
        ds.Lista lista23 = new ds.Lista();
        int int24 = lista23.pos;
        int int25 = lista23.primeiro;
        java.lang.Object obj26 = null;
        lista23.insere(obj26);
        java.lang.Object[] objArray28 = lista23.item;
        lista11.item = objArray28;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        int int32 = lista30.ultimo;
        ds.Lista lista33 = new ds.Lista();
        lista33.imprime();
        java.lang.Object[] objArray35 = lista33.item;
        int int36 = lista33.ultimo;
        ds.Lista lista37 = new ds.Lista();
        int int38 = lista37.pos;
        int int39 = lista37.ultimo;
        lista37.primeiro = (short) 1;
        ds.Lista lista42 = new ds.Lista();
        lista42.imprime();
        java.lang.Object[] objArray44 = lista42.item;
        lista37.item = objArray44;
        lista33.item = objArray44;
        lista30.item = objArray44;
        lista11.item = objArray44;
        lista6.item = objArray44;
        lista0.item = objArray44;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray44);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test446");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        lista0.imprime();
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        lista14.imprime();
        int int18 = lista14.pos;
        lista14.primeiro = (byte) -1;
        boolean boolean21 = lista14.vazia();
        lista14.ultimo = (byte) -1;
        lista0.insere((java.lang.Object) lista14);
        lista0.imprime();
        int int26 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test447");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.pos = 10;
        lista0.ultimo = (byte) 100;
        int int7 = lista0.pos;
        ds.Lista lista8 = new ds.Lista();
        java.lang.Object[] objArray12 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista8.item = objArray12;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        int int16 = lista14.ultimo;
        lista14.primeiro = (short) 1;
        ds.Lista lista19 = new ds.Lista();
        lista19.imprime();
        java.lang.Object[] objArray21 = lista19.item;
        lista14.item = objArray21;
        lista8.item = objArray21;
        lista0.item = objArray21;
        java.lang.Object[] objArray25 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test448");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        int int10 = lista0.pos;
        lista0.imprime();
        lista0.primeiro = '4';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test449");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        boolean boolean15 = lista0.vazia();
        lista0.ultimo = 2;
        lista0.pos = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test450");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        lista0.primeiro = (byte) 0;
        boolean boolean4 = lista0.vazia();
        int int5 = lista0.ultimo;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test451");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        lista0.pos = 0;
        lista0.primeiro = (byte) 10;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test452");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        java.lang.Object[] objArray13 = lista0.item;
        lista0.primeiro = 52;
        lista0.imprime();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1, 10, 1]");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test453");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        int int5 = lista0.ultimo;
        int int6 = lista0.primeiro;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test454");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        int int7 = lista0.primeiro;
        java.lang.Object[] objArray8 = lista0.item;
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test455");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.ultimo;
        lista0.imprime();
        boolean boolean6 = lista0.vazia();
        ds.Lista lista7 = new ds.Lista();
        int int8 = lista7.pos;
        int int9 = lista7.ultimo;
        lista7.ultimo = 10;
        lista7.pos = (byte) 10;
        lista0.insere((java.lang.Object) lista7);
        java.lang.Object[] objArray15 = lista0.item;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray15);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test456");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.imprime();
        int int15 = lista11.pos;
        lista11.primeiro = (byte) -1;
        java.lang.Object[] objArray18 = lista11.item;
        lista11.pos = (short) 10;
        java.lang.Object[] objArray21 = lista11.item;
        lista11.pos = 'a';
        lista11.pos = 97;
        lista0.insere((java.lang.Object) 97);
        lista0.pos = (-1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(objArray21);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test457");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test458");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.ultimo = 10;
        lista0.pos = (byte) 10;
        int int7 = lista0.ultimo;
        boolean boolean8 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test459");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        lista5.ultimo = (byte) 1;
        ds.Lista lista9 = new ds.Lista();
        lista9.imprime();
        int int11 = lista9.primeiro;
        java.lang.Object[] objArray12 = lista9.item;
        lista5.item = objArray12;
        lista0.item = objArray12;
        lista0.pos = (short) -1;
        lista0.imprime();
        int int18 = lista0.primeiro;
        java.lang.Object[] objArray19 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test460");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 100;
        int int7 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test461");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        boolean boolean8 = lista0.vazia();
        boolean boolean9 = lista0.vazia();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test462");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.primeiro;
        java.lang.Object obj3 = null;
        lista0.insere(obj3);
        java.lang.Object[] objArray5 = lista0.item;
        lista0.primeiro = (short) 10;
        ds.Lista lista8 = new ds.Lista();
        int int9 = lista8.ultimo;
        java.lang.Object[] objArray10 = lista8.item;
        lista0.item = objArray10;
        boolean boolean12 = lista0.vazia();
        ds.Lista lista13 = new ds.Lista();
        int int14 = lista13.ultimo;
        java.lang.Object[] objArray15 = lista13.item;
        lista13.primeiro = (byte) 1;
        int int18 = lista13.primeiro;
        java.lang.Object[] objArray19 = lista13.item;
        lista0.item = objArray19;
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        int int23 = lista21.primeiro;
        java.lang.Object[] objArray24 = lista21.item;
        lista21.ultimo = 1;
        lista21.primeiro = (byte) 1;
        lista0.insere((java.lang.Object) lista21);
        java.lang.Object[] objArray30 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(objArray30);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test463");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        lista0.primeiro = (short) -1;
        lista0.ultimo = (short) 1;
        ds.Lista lista14 = new ds.Lista();
        int int15 = lista14.pos;
        lista14.ultimo = '#';
        lista14.pos = (short) 10;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        java.lang.Object[] objArray22 = lista20.item;
        lista14.insere((java.lang.Object) lista20);
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista20.insere((java.lang.Object) lista24);
        ds.Lista lista29 = new ds.Lista();
        lista29.imprime();
        int int31 = lista29.primeiro;
        lista29.imprime();
        int int33 = lista29.pos;
        lista29.primeiro = (byte) -1;
        java.lang.Object[] objArray36 = lista29.item;
        lista24.item = objArray36;
        lista0.insere((java.lang.Object) lista24);
        ds.Lista lista39 = new ds.Lista();
        int int40 = lista39.pos;
        lista39.ultimo = '#';
        int int43 = lista39.pos;
        int int44 = lista39.ultimo;
        lista39.pos = 0;
        lista24.insere((java.lang.Object) lista39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 35 + "'", int44 == 35);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test464");
        ds.Lista lista0 = new ds.Lista();
        lista0.pos = (-1);
        int int3 = lista0.primeiro;
        int int4 = lista0.pos;
        int int5 = lista0.pos;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        boolean boolean8 = lista6.vazia();
        lista6.pos = 0;
        boolean boolean11 = lista6.vazia();
        lista0.insere((java.lang.Object) boolean11);
        int int13 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test465");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        int int6 = lista0.pos;
        lista0.primeiro = 0;
        lista0.pos = 'a';
        boolean boolean11 = lista0.vazia();
        java.lang.Object[] objArray12 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test466");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.ultimo = 0;
        lista4.ultimo = (short) 10;
        ds.Lista lista12 = new ds.Lista();
        int int13 = lista12.pos;
        int int14 = lista12.ultimo;
        lista12.pos = 10;
        lista12.primeiro = 0;
        int int19 = lista12.ultimo;
        java.lang.Object[] objArray20 = lista12.item;
        lista4.item = objArray20;
        lista0.insere((java.lang.Object) lista4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test467");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.ultimo = 100;
        lista0.ultimo = 97;
        lista0.primeiro = 1;
        lista0.primeiro = (byte) -1;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test468");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        lista15.imprime();
        int int19 = lista15.pos;
        lista15.primeiro = (byte) -1;
        java.lang.Object[] objArray22 = lista15.item;
        lista10.item = objArray22;
        ds.Lista lista24 = new ds.Lista();
        int int25 = lista24.pos;
        lista24.ultimo = '#';
        lista24.pos = (short) 0;
        ds.Lista lista30 = new ds.Lista();
        int int31 = lista30.pos;
        java.lang.Object[] objArray32 = lista30.item;
        lista24.item = objArray32;
        java.lang.Object[] objArray34 = lista24.item;
        lista10.item = objArray34;
        java.lang.Class<?> wildcardClass36 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test469");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        lista0.pos = 100;
        lista0.imprime();
        lista0.primeiro = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test470");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        int int3 = lista0.primeiro;
        boolean boolean4 = lista0.vazia();
        java.lang.Object[] objArray5 = null;
        lista0.item = objArray5;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        lista7.imprime();
        int int11 = lista7.ultimo;
        int int12 = lista7.primeiro;
        java.lang.Object[] objArray13 = lista7.item;
        // The following exception was thrown during execution in test generation
        try {
            lista0.insere((java.lang.Object) lista7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test471");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        int int9 = lista0.pos;
        int int10 = lista0.ultimo;
        boolean boolean11 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test472");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        java.lang.Object[] objArray2 = lista0.item;
        lista0.primeiro = (byte) 1;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        int int7 = lista5.ultimo;
        lista5.primeiro = (short) 1;
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = (byte) 1;
        ds.Lista lista14 = new ds.Lista();
        lista14.imprime();
        int int16 = lista14.primeiro;
        java.lang.Object[] objArray17 = lista14.item;
        lista10.item = objArray17;
        lista5.item = objArray17;
        lista5.pos = (short) -1;
        lista5.imprime();
        lista5.ultimo = 0;
        ds.Lista lista25 = new ds.Lista();
        int int26 = lista25.pos;
        int int27 = lista25.primeiro;
        java.lang.Object obj28 = null;
        lista25.insere(obj28);
        java.lang.Object[] objArray30 = lista25.item;
        lista5.item = objArray30;
        ds.Lista lista32 = new ds.Lista();
        lista32.imprime();
        int int34 = lista32.primeiro;
        lista32.imprime();
        int int36 = lista32.pos;
        lista32.primeiro = (byte) -1;
        int int39 = lista32.ultimo;
        java.lang.Object[] objArray40 = lista32.item;
        lista5.insere((java.lang.Object) objArray40);
        lista0.item = objArray40;
        lista0.imprime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test473");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.imprime();
        int int4 = lista0.pos;
        lista0.primeiro = (byte) -1;
        boolean boolean7 = lista0.vazia();
        int int8 = lista0.ultimo;
        boolean boolean9 = lista0.vazia();
        lista0.ultimo = 100;
        java.lang.Class<?> wildcardClass12 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test474");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        java.lang.Class<?> wildcardClass6 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test475");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        lista0.ultimo = (short) 10;
        lista0.pos = 35;
        int int10 = lista0.pos;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test476");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        lista0.pos = (short) -1;
        java.lang.Object[] objArray13 = lista0.item;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test477");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        boolean boolean2 = lista0.vazia();
        lista0.pos = 0;
        ds.Lista lista5 = new ds.Lista();
        int int6 = lista5.pos;
        java.lang.Object[] objArray7 = lista5.item;
        lista0.insere((java.lang.Object) lista5);
        lista0.imprime();
        lista0.ultimo = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(objArray7);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test478");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        int int13 = lista10.primeiro;
        int int14 = lista10.primeiro;
        lista10.pos = 1;
        lista0.insere((java.lang.Object) lista10);
        java.lang.Class<?> wildcardClass18 = lista10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test479");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        int int10 = lista0.pos;
        java.lang.Object obj11 = null;
        lista0.insere(obj11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test480");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        int int15 = lista10.pos;
        int int16 = lista10.ultimo;
        lista10.pos = 36;
        lista10.pos = 101;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test481");
        ds.Lista lista0 = new ds.Lista();
        ds.Lista lista1 = new ds.Lista();
        java.lang.Object[] objArray5 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista1.item = objArray5;
        lista0.item = objArray5;
        lista0.primeiro = ' ';
        lista0.imprime();
        lista0.primeiro = '4';
        lista0.ultimo = 97;
        lista0.primeiro = 36;
        java.lang.Object[] objArray17 = lista0.item;
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[-1, 10, 1]");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test482");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        java.lang.Object[] objArray8 = lista6.item;
        lista0.item = objArray8;
        int int10 = lista0.ultimo;
        int int11 = lista0.primeiro;
        java.lang.Object[] objArray12 = lista0.item;
        int int13 = lista0.primeiro;
        lista0.ultimo = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test483");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        lista0.pos = (-1);
        ds.Lista lista6 = new ds.Lista();
        int int7 = lista6.pos;
        int int8 = lista6.ultimo;
        lista6.primeiro = (short) 1;
        ds.Lista lista11 = new ds.Lista();
        int int12 = lista11.pos;
        lista11.ultimo = (byte) 1;
        ds.Lista lista15 = new ds.Lista();
        lista15.imprime();
        int int17 = lista15.primeiro;
        java.lang.Object[] objArray18 = lista15.item;
        lista11.item = objArray18;
        lista6.item = objArray18;
        int int21 = lista6.ultimo;
        int int22 = lista6.pos;
        lista0.insere((java.lang.Object) lista6);
        int int24 = lista6.ultimo;
        boolean boolean25 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test484");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        lista0.ultimo = 98;
        ds.Lista lista4 = new ds.Lista();
        int int5 = lista4.pos;
        lista4.ultimo = '#';
        lista4.ultimo = 0;
        int int10 = lista4.pos;
        lista0.insere((java.lang.Object) lista4);
        ds.Lista lista12 = new ds.Lista();
        lista12.imprime();
        int int14 = lista12.primeiro;
        java.lang.Object[] objArray15 = lista12.item;
        lista12.ultimo = 1;
        lista12.ultimo = 0;
        ds.Lista lista20 = new ds.Lista();
        lista20.imprime();
        int int22 = lista20.primeiro;
        lista20.imprime();
        int int24 = lista20.ultimo;
        lista12.insere((java.lang.Object) lista20);
        java.lang.Object[] objArray26 = lista20.item;
        lista0.item = objArray26;
        lista0.primeiro = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test485");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = (byte) 1;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        java.lang.Object[] objArray7 = lista4.item;
        lista0.item = objArray7;
        int int9 = lista0.pos;
        lista0.primeiro = (byte) 0;
        lista0.ultimo = 37;
        int int14 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test486");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.primeiro = 35;
        int int20 = lista6.ultimo;
        lista6.pos = 1;
        lista6.ultimo = '#';
        java.lang.Class<?> wildcardClass25 = lista6.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test487");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        lista0.imprime();
        ds.Lista lista21 = new ds.Lista();
        lista21.imprime();
        boolean boolean23 = lista21.vazia();
        lista21.pos = 0;
        boolean boolean26 = lista21.vazia();
        java.lang.Object[] objArray27 = lista21.item;
        java.lang.Object[] objArray28 = new java.lang.Object[] { (short) 0, objArray27 };
        lista0.item = objArray28;
        int int30 = lista0.primeiro;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test488");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        lista0.imprime();
        lista0.primeiro = 35;
        int int6 = lista0.pos;
        lista0.insere((java.lang.Object) "");
        lista0.insere((java.lang.Object) 100.0f);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test489");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        int int2 = lista0.ultimo;
        lista0.primeiro = (short) 1;
        ds.Lista lista5 = new ds.Lista();
        lista5.imprime();
        java.lang.Object[] objArray7 = lista5.item;
        lista0.item = objArray7;
        int int9 = lista0.primeiro;
        lista0.imprime();
        java.lang.Object[] objArray11 = null;
        lista0.item = objArray11;
        java.lang.Object[] objArray13 = lista0.item;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test490");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 10;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        java.lang.Object[] objArray8 = lista6.item;
        lista0.insere((java.lang.Object) lista6);
        ds.Lista lista10 = new ds.Lista();
        int int11 = lista10.pos;
        lista10.ultimo = '#';
        lista6.insere((java.lang.Object) lista10);
        lista6.pos = 'a';
        int int17 = lista6.pos;
        lista6.primeiro = 35;
        lista6.primeiro = 36;
        int int22 = lista6.ultimo;
        boolean boolean23 = lista6.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test491");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.pos = (short) 0;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.ultimo = 0;
        boolean boolean10 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test492");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        int int3 = lista0.primeiro;
        ds.Lista lista4 = new ds.Lista();
        lista4.imprime();
        int int6 = lista4.primeiro;
        lista4.primeiro = 10;
        lista0.insere((java.lang.Object) lista4);
        boolean boolean10 = lista0.vazia();
        boolean boolean11 = lista0.vazia();
        int int12 = lista0.primeiro;
        lista0.imprime();
        int int14 = lista0.pos;
        int int15 = lista0.primeiro;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test493");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.ultimo;
        ds.Lista lista2 = new ds.Lista();
        ds.Lista lista3 = new ds.Lista();
        java.lang.Object[] objArray7 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista3.item = objArray7;
        lista2.item = objArray7;
        lista2.pos = (-1);
        int int12 = lista2.primeiro;
        lista0.insere((java.lang.Object) int12);
        java.lang.Object[] objArray14 = null;
        lista0.item = objArray14;
        int int16 = lista0.pos;
        // The following exception was thrown during execution in test generation
        try {
            lista0.imprime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test494");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        int int2 = lista0.primeiro;
        lista0.insere((java.lang.Object) (-1.0f));
        lista0.pos = (-1);
        lista0.primeiro = 35;
        lista0.imprime();
        ds.Lista lista10 = new ds.Lista();
        lista10.imprime();
        java.lang.Object[] objArray12 = lista10.item;
        int int13 = lista10.primeiro;
        int int14 = lista10.primeiro;
        lista10.pos = 1;
        lista0.insere((java.lang.Object) lista10);
        lista10.imprime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test495");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        java.lang.Class<?> wildcardClass4 = lista0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test496");
        ds.Lista lista0 = new ds.Lista();
        lista0.imprime();
        java.lang.Object[] objArray2 = lista0.item;
        int int3 = lista0.pos;
        int int4 = lista0.pos;
        lista0.pos = 100;
        lista0.ultimo = 0;
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test497");
        ds.Lista lista0 = new ds.Lista();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, (short) 10, (short) 1 };
        lista0.item = objArray4;
        ds.Lista lista6 = new ds.Lista();
        lista6.imprime();
        int int8 = lista6.primeiro;
        lista6.imprime();
        int int10 = lista6.pos;
        lista6.primeiro = (byte) -1;
        int int13 = lista6.ultimo;
        lista6.pos = '4';
        java.lang.Class<?> wildcardClass16 = lista6.getClass();
        lista0.insere((java.lang.Object) lista6);
        lista0.imprime();
        lista0.imprime();
        int int20 = lista0.ultimo;
        java.lang.Object[] objArray21 = lista0.item;
        ds.Lista lista22 = new ds.Lista();
        int int23 = lista22.pos;
        lista22.ultimo = '#';
        lista22.pos = (short) 0;
        ds.Lista lista28 = new ds.Lista();
        int int29 = lista28.pos;
        java.lang.Object[] objArray30 = lista28.item;
        lista22.item = objArray30;
        int int32 = lista22.ultimo;
        java.lang.Object[] objArray33 = lista22.item;
        lista0.item = objArray33;
        lista0.primeiro = (short) 10;
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test498");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        boolean boolean7 = lista0.vazia();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test499");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = '#';
        lista0.ultimo = 0;
        int int6 = lista0.pos;
        lista0.primeiro = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Randoop0.test500");
        ds.Lista lista0 = new ds.Lista();
        int int1 = lista0.pos;
        lista0.ultimo = 10;
        lista0.primeiro = (short) -1;
        int int6 = lista0.ultimo;
        ds.Lista lista7 = new ds.Lista();
        lista7.imprime();
        int int9 = lista7.primeiro;
        int int10 = lista7.primeiro;
        ds.Lista lista11 = new ds.Lista();
        lista11.imprime();
        int int13 = lista11.primeiro;
        lista11.primeiro = 10;
        lista7.insere((java.lang.Object) lista11);
        int int17 = lista7.pos;
        ds.Lista lista18 = new ds.Lista();
        lista18.imprime();
        int int20 = lista18.primeiro;
        java.lang.Object[] objArray21 = lista18.item;
        lista18.ultimo = 1;
        ds.Lista lista24 = new ds.Lista();
        lista18.insere((java.lang.Object) lista24);
        java.lang.Object[] objArray26 = lista18.item;
        int int27 = lista18.primeiro;
        lista7.insere((java.lang.Object) int27);
        lista0.insere((java.lang.Object) int27);
        lista0.pos = '4';
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }
}

